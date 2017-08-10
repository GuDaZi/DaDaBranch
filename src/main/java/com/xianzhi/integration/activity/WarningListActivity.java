package com.xianzhi.integration.activity;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.GridView;
import android.widget.TextView;

import com.handmark.pulltorefresh.library.ILoadingLayout;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshGridView;
import com.xianzhi.integration.R;
import com.xianzhi.integration.adapter.WarningAdapter;
import com.xianzhi.integration.base.BaseActivity;
import com.xianzhi.integration.bean.WarningListBean;
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
 * @Date 2017/8/1.
 * @Function 预警加减分汇总
 */

public class WarningListActivity extends BaseActivity implements ModelCompleteCallback<BaseResponesBean> {

    @BindView(R.id.warning_list)
    PullToRefreshGridView warning_list;
    @BindView(R.id.tv_quantization_month)
    TextView tv_month;

    private Calendar calendar;
    //是否刷新
    private boolean isRefresh = true;
    //页数
    private int page = 0;
    private WarningListBean bean;
    private List<WarningListBean.PageBean.ListBean> datas;
    private WarningAdapter adapter;


    @Override
    protected void onCreateView(Bundle saveInstanceState) {
        setContentView(R.layout.activity_warning);
    }

    @Override
    protected void initView() {
        tv_title.setText("预警加减分汇总");

        calendar = Calendar.getInstance();
        int year = calendar.get(calendar.YEAR);
        int month = calendar.get(calendar.MONTH) + 1;
        if (month < 10) {
            tv_month.setText(year + "-0" + month);
        } else {
            tv_month.setText(year + "-" + month);
        }

        datas = new ArrayList<>();
        adapter = new WarningAdapter(context, datas);
        warning_list.setAdapter(adapter);

        getDatas(0, 10);
        setOnRefresh();

    }

    @Override
    protected void setListener() {
        tv_month.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.lin_back:
                finish();
                break;
            case R.id.tv_quantization_month:
                selectTime();
                break;
        }
    }

    private void getDatas(int num, int size) {
        if(isRefresh){
            progressDialog.show();
        }
        model = ModelFactory.getModel(ModelFactory.WARNING, this, this);
        model.excuteParams(new WarningListBean(num, size, tv_month.getText().toString()));
    }

    @Override
    public void onTaskPostExecute(int taskid, BaseResponesBean result) {
        if (progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        warning_list.onRefreshComplete();
        if (result == null) {
            return;
        }
        if (result.getStatus() != StatusUtil.STATUS_OK) {
            return;
        }
        if (result.getInterface_status() == StatusUtil.INTERFACE_OK) {
            bean = FastJsonUtil.getObject(result.getDataholder().toString(), WarningListBean.class);
            datas = bean.getPage().getList();
            if (datas.size() == 0) {
                ToastUtil.showShort(getApplicationContext(), "已经没有更多数据了");
                warning_list.setMode(PullToRefreshBase.Mode.PULL_DOWN_TO_REFRESH);
            }

            if(isRefresh && datas != null){
                adapter.addDatas(datas);
                warning_list.setMode(PullToRefreshBase.Mode.BOTH);
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
        warning_list.setMode(PullToRefreshBase.Mode.BOTH);
        warning_list.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener2<GridView>() {
            @Override
            public void onPullDownToRefresh(PullToRefreshBase<GridView> refreshView) {
                ILoadingLayout startLabels = refreshView.getLoadingLayoutProxy(true, false);
                startLabels.setPullLabel("下拉刷新...");// 刚上拉时，显示的提示
                startLabels.setRefreshingLabel("正在载入..." + "\n\t");// 刷新时
                startLabels.setReleaseLabel("放开刷新...");// 下来达到一定距离时，显示的提示
                isRefresh = true;
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
                getDatas(0, 10);

            }
        }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE)).show();

    }
}
