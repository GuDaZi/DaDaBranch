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
import com.xianzhi.integration.adapter.QuantizationDetailAdapter;
import com.xianzhi.integration.base.BaseActivity;
import com.xianzhi.integration.bean.QuantizationDetailBnea;
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
 * @Date 2017/7/31.
 * @Function 量化查询汇总表二级详情
 */

public class QuantizationDetailActivity extends BaseActivity implements ModelCompleteCallback<BaseResponesBean> {

    @BindView(R.id.quantizationDetail_list)
    PullToRefreshGridView quantizationDetail_list;
    //考核月份
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
    @BindView(R.id.lin_personal_date)
    LinearLayout lin_date;
    @BindView(R.id.tv_personal_workTask)
    TextView tv_work;

    private String itemId;
    //是否刷新
    private boolean isRefresh = true;
    //页数
    private int page = 0;
    private QuantizationDetailAdapter adapter;
    private List<QuantizationDetailBnea.PageBean.ListBean> datas;

    @Override
    protected void onCreateView(Bundle saveInstanceState) {
        setContentView(R.layout.activity_quantization_detail);
    }

    @Override
    protected void initView() {
        itemId = getIntent().getStringExtra("itemId");

        tv_title.setText("量化查询汇总表");
        lin_date.setVisibility(View.GONE);
        datas = new ArrayList<>();
        adapter = new QuantizationDetailAdapter(context, datas);
        quantizationDetail_list.setAdapter(adapter);
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

    private void getDatas(int num, int size) {
        if(isRefresh){
            progressDialog.show();
        }
        model = ModelFactory.getModel(ModelFactory.QUANZATIONDETAIL, this, this);
        model.excuteParams(new QuantizationDetailBnea(num, size, itemId));
    }

    @Override
    public void onTaskPostExecute(int taskid, BaseResponesBean result) {
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
            QuantizationDetailBnea bean = FastJsonUtil.getObject(result.getDataholder().toString(), QuantizationDetailBnea.class);
            datas = bean.getPage().getList();
            if (datas.size() == 0) {
                ToastUtil.showShort(getApplicationContext(), "已经没有更多数据了");
                quantizationDetail_list.setMode(PullToRefreshBase.Mode.PULL_DOWN_TO_REFRESH);
            }

            if(isRefresh && datas != null){
                adapter.addDatas(datas);
                quantizationDetail_list.setMode(PullToRefreshBase.Mode.BOTH);
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
            tv_work.setText(bean.getPersonalAssessmentInfo().getContent());

        }
    }

    /**
     * 刷新
     */
    private void setOnRefresh() {
        quantizationDetail_list.setMode(PullToRefreshBase.Mode.BOTH);
        quantizationDetail_list.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener2<GridView>() {
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
