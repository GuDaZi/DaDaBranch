package com.xianzhi.integration.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.handmark.pulltorefresh.library.ILoadingLayout;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshGridView;
import com.xianzhi.integration.R;
import com.xianzhi.integration.adapter.MyAssessDetailAdapter;
import com.xianzhi.integration.base.BaseActivity;
import com.xianzhi.integration.bean.MyAssessDetailBean;
import com.xianzhi.integration.model.base.BaseResponesBean;
import com.xianzhi.integration.model.base.ModelCompleteCallback;
import com.xianzhi.integration.model.base.ModelFactory;
import com.xianzhi.integration.tools.util.FastJsonUtil;
import com.xianzhi.integration.tools.util.StatusUtil;
import com.xianzhi.integration.tools.util.ToastUtil;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * @Administrator LiBo.
 * @Date 2017/7/14.
 * @Function 我的月度考核管理详细
 */

public class MyAssessDetailActivity extends BaseActivity implements ModelCompleteCallback<BaseResponesBean> {

    @BindView(R.id.myAssess_detail_list)
    PullToRefreshGridView detail_list;
    @BindView(R.id.tv_personal_userName)
    TextView tv_userName;
    @BindView(R.id.tv_personal_dete)
    TextView tv_month;
    @BindView(R.id.tv_personal_name)
    TextView tv_personal;
    @BindView(R.id.tv_personal_depart)
    TextView tv_depart;
    @BindView(R.id.tv_personal_job)
    TextView tv_jobName;
    @BindView(R.id.tv_personal_post)
    TextView tv_post;
    @BindView(R.id.iv_up_info)
    ImageView iv_up;
    @BindView(R.id.iv_down_info)
    ImageView iv_down;
    @BindView(R.id.lin_secondTitle)
    LinearLayout lin_secondTitle;

    private MyAssessDetailAdapter adapter;
    private List<MyAssessDetailBean.PageBean.ListBean> datas;
    //是否刷新
    private boolean isRefresh = true;
    //页数
    private int page = 0;
    private String itemId;
    private String isSubmit;

    private MyAssessDetailBean bean;

    @Override
    protected void onCreateView(Bundle saveInstanceState) {
        setContentView(R.layout.activity_myassess_detail);

    }

    @Override
    protected void initView() {
        itemId = getIntent().getStringExtra("itemId");
        isSubmit = getIntent().getStringExtra("isSubmit");

        tv_title.setText("我的月度考核表");
        datas = new ArrayList();
        adapter = new MyAssessDetailAdapter(this, datas);
        detail_list.setAdapter(adapter);
        isRefresh = true;
        getDatas(0, 10);
        setOnRefresh();
    }

    @Override
    protected void setListener() {
        iv_down.setOnClickListener(this);
        iv_up.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.lin_back:
                finish();
                break;
            case R.id.iv_up_info:
                lin_secondTitle.setVisibility(View.GONE);
                break;
            case R.id.iv_down_info:
                lin_secondTitle.setVisibility(View.VISIBLE);
                break;
        }
    }

    private void getDatas(int page, int num) {
        if(isRefresh){
            progressDialog.show();
        }
        model = ModelFactory.getModel(ModelFactory.MYASSESSINFO, this, this);
        model.excuteParams(new MyAssessDetailBean(itemId, page, num, isSubmit));

    }

    @Override
    public void onTaskPostExecute(int taskid, BaseResponesBean result) {
        detail_list.onRefreshComplete();
        if (progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        if (result == null) {
            return;
        }
        if (result.getStatus() != StatusUtil.STATUS_OK) {
            return;
        }
        if (result.getInterface_status() == StatusUtil.INTERFACE_OK) {
            bean = FastJsonUtil.getObject(result.getDataholder().toString(), MyAssessDetailBean.class);
            datas = bean.getPage().getList();
            if (datas.size() == 0) {
                ToastUtil.showShort(getApplicationContext(), "已经没有更多数据了");
                detail_list.setMode(PullToRefreshBase.Mode.PULL_DOWN_TO_REFRESH);
            }

            if(isRefresh && datas != null){
                adapter.addDatas(datas);
                detail_list.setMode(PullToRefreshBase.Mode.BOTH);
            } else if (datas.size() != 0 && datas != null){
                adapter.addAllDatas(datas);
            }

            page = bean.getPage().getPageNumber();
            adapter.notifyDataSetChanged();

            tv_month.setText(bean.getPersonalAssessmentInfo().getMonth());
            tv_depart.setText(bean.getUser().getDept_name());
            tv_jobName.setText(bean.getUser().getPosition_name());
            tv_personal.setText(bean.getUser().getName());
            tv_userName.setText(bean.getUser().getName());
            tv_post.setText(bean.getUser().getPost_name());
        }
    }

    /**
     * 刷新
     */
    private void setOnRefresh() {
        detail_list.setMode(PullToRefreshBase.Mode.BOTH);
        detail_list.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener2<GridView>() {
            @Override
            public void onPullDownToRefresh(PullToRefreshBase<GridView> refreshView) {
                ILoadingLayout startLabels = refreshView.getLoadingLayoutProxy(true, false);
                startLabels.setPullLabel("下拉刷新...");// 刚上拉时，显示的提示
                startLabels.setRefreshingLabel("正在载入..." + "\n\t");// 刷新时
                startLabels.setReleaseLabel("放开刷新...");// 下来达到一定距离时，显示的提示
                isRefresh = true;
                progressDialog.show();
                getDatas(0, 10);
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onPullUpToRefresh(PullToRefreshBase<GridView> refreshView) {
                ILoadingLayout startLabels = refreshView.getLoadingLayoutProxy(false, true);
                startLabels.setPullLabel("下拉刷新...");// 刚上拉时，显示的提示
                startLabels.setRefreshingLabel("正在载入..." + "\n\t");// 刷新时
                startLabels.setReleaseLabel("放开刷新...");// 下来达到一定距离时，显示的提示
                isRefresh = false;
                getDatas(page, 10);
                adapter.notifyDataSetChanged();
            }
        });
    }
}
