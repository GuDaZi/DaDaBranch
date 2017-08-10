package com.xianzhi.integration.activity;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.handmark.pulltorefresh.library.ILoadingLayout;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshGridView;
import com.xianzhi.integration.R;
import com.xianzhi.integration.adapter.SelfEvaluateAdapter;
import com.xianzhi.integration.base.BaseActivity;
import com.xianzhi.integration.bean.SelfEvaluateBean;
import com.xianzhi.integration.model.base.BaseResponesBean;
import com.xianzhi.integration.model.base.ModelCompleteCallback;
import com.xianzhi.integration.model.base.ModelFactory;
import com.xianzhi.integration.tools.DateUtil;
import com.xianzhi.integration.tools.util.FastJsonUtil;
import com.xianzhi.integration.tools.util.StatusUtil;
import com.xianzhi.integration.tools.util.ToastUtil;
import com.xianzhi.integration.view.YearMonthPickerDialog;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import butterknife.BindView;

/**
 * @Administrator LiBo.
 * @Date 2017/7/20.
 * @Function 自我评价与考评
 */

public class SelfEvaluateActivity extends BaseActivity implements ModelCompleteCallback<BaseResponesBean>, SelfEvaluateAdapter.OnSelfEvaluateClickListener {
    @BindView(R.id.selfEvaluate_list)
    PullToRefreshGridView selfEvaluate_list;
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

    private SelfEvaluateAdapter adapter;
    private List<SelfEvaluateBean.PageBean.ListBean> datas;
    //是否刷新
    private boolean isRefresh = true;
    //页数
    private int page = 0;
    private SelfEvaluateBean bean;
    private Calendar calendar;

    @Override
    protected void onCreateView(Bundle saveInstanceState) {
        setContentView(R.layout.activity_selfevaluate);

    }

    @Override
    protected void initView() {
        tv_title.setText("自我写实与考评");
        datas = new ArrayList();
        adapter = new SelfEvaluateAdapter(this, this, datas);
        selfEvaluate_list.setAdapter(adapter);

        calendar = Calendar.getInstance();
        int year = calendar.get(calendar.YEAR);
        int month = calendar.get(calendar.MONTH) + 1;
        if (month < 10){
            tv_month.setText(year + "-0" + month);
        } else {
            tv_month.setText(year + "-" + month);
        }

        isRefresh = true;
        progressDialog.show();
        getDatas(0, 10, tv_month.getText().toString());
        setOnRefresh();
    }

    @Override
    protected void setListener() {
        tv_month.setOnClickListener(this);
        iv_down.setOnClickListener(this);
        iv_up.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.lin_back:
                finish();
                break;
            case R.id.tv_personal_dete:
                selectTime();
                break;
            case R.id.iv_up_info:
                lin_secondTitle.setVisibility(View.GONE);
                break;
            case R.id.iv_down_info:
                lin_secondTitle.setVisibility(View.VISIBLE);
                break;
        }
    }

    private void getDatas(int page, int num, String date) {
        progressDialog.show();
        model = ModelFactory.getModel(ModelFactory.SELFEVALUATE, this, this);
        model.excuteParams(new SelfEvaluateBean(page, num, date));
    }

    @Override
    public void onTaskPostExecute(int taskid, BaseResponesBean result) {
        selfEvaluate_list.onRefreshComplete();
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
            bean = FastJsonUtil.getObject(result.getDataholder().toString(), SelfEvaluateBean.class);
            tv_month.setText(bean.getMonth());
            tv_depart.setText(bean.getUser().getDept_name());
            tv_jobName.setText(bean.getUser().getPosition_name());
            tv_personal.setText(bean.getUser().getName());
            tv_userName.setText(bean.getUser().getName());
            tv_post.setText(bean.getUser().getPost_name());

            datas = bean.getPage().getList();
            if (datas.size() == 0) {
                ToastUtil.showShort(getApplicationContext(), "已经没有更多数据了");
                selfEvaluate_list.setMode(PullToRefreshBase.Mode.PULL_DOWN_TO_REFRESH);
            }

            if(isRefresh && datas != null){
                adapter.addDatas(datas);
                selfEvaluate_list.setMode(PullToRefreshBase.Mode.BOTH);
            } else if (datas.size() != 0 && datas != null){
                adapter.addAllDatas(datas);
            }

            page = bean.getPage().getPageNumber();
            adapter.notifyDataSetChanged();
        }
    }

    /**
     * 刷新
     */
    private void setOnRefresh() {
        selfEvaluate_list.setMode(PullToRefreshBase.Mode.BOTH);
        selfEvaluate_list.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener2<GridView>() {
            @Override
            public void onPullDownToRefresh(PullToRefreshBase<GridView> refreshView) {
                ILoadingLayout startLabels = refreshView.getLoadingLayoutProxy(true, false);
                startLabels.setPullLabel("下拉刷新...");// 刚上拉时，显示的提示
                startLabels.setRefreshingLabel("正在载入..." + "\n\t");// 刷新时
                startLabels.setReleaseLabel("放开刷新...");// 下来达到一定距离时，显示的提示
                isRefresh = true;
                progressDialog.show();
                getDatas(0, 10, tv_month.getText().toString());
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onPullUpToRefresh(PullToRefreshBase<GridView> refreshView) {
                ILoadingLayout startLabels = refreshView.getLoadingLayoutProxy(false, true);
                startLabels.setPullLabel("下拉刷新...");// 刚上拉时，显示的提示
                startLabels.setRefreshingLabel("正在载入..." + "\n\t");// 刷新时
                startLabels.setReleaseLabel("放开刷新...");// 下来达到一定距离时，显示的提示
                isRefresh = false;
                getDatas(page, 10, tv_month.getText().toString());
                adapter.notifyDataSetChanged();
            }
        });
    }

    /***
     * 时间选择器
     */
    private void selectTime() {
        new YearMonthPickerDialog(this, AlertDialog.THEME_HOLO_LIGHT, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                calendar.set(Calendar.YEAR, year);
                calendar.set(Calendar.MONTH, monthOfYear);
                tv_month.setText(DateUtil.clanderTodatetime(calendar, "yyyy-MM"));
                isRefresh = true;
                progressDialog.show();
                getDatas(0, 10, tv_month.getText().toString());

            }
        }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE)).show();

    }

    @Override
    public void onEvaluateClick(String id) {
        Intent intent = new Intent(context, SelfEvaluateEditActivity.class);
        intent.putExtra("date", tv_month.getText().toString());
        intent.putExtra("itemId", id);
        startActivity(intent);
    }
}
