package com.xianzhi.integration.activity;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.handmark.pulltorefresh.library.ILoadingLayout;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshGridView;
import com.xianzhi.integration.R;
import com.xianzhi.integration.adapter.CadreAssessAdapter;
import com.xianzhi.integration.base.BaseActivity;
import com.xianzhi.integration.bean.CadreAssessBean;
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
 * @Date 2017/7/14.
 * @Function 干部考核审批
 */

public class CadreAssessActivity extends BaseActivity implements ModelCompleteCallback<BaseResponesBean> {

    @BindView(R.id.myAssess_list)
    PullToRefreshGridView cadre_lis;
    @BindView(R.id.tv_cadre_month)
    TextView tv_month;
    @BindView(R.id.rb_no_approve)
    RadioButton rb_no_approve;
    @BindView(R.id.rb_already_approval)
    RadioButton rb_already_approval;
    @BindView(R.id.rb_all_approval)
    RadioButton rb_all_approval;
    @BindView(R.id.et_search_name)
    EditText et_name;

    //是否刷新
    private boolean isRefresh = true;
    //页数
    private int page = 0;
    private int isSelect = -1;

    private CadreAssessBean bean;
    private List<CadreAssessBean.PageBean.ListBean> datas;
    private CadreAssessAdapter adapter;
    private Calendar calendar;

    @Override
    protected void onCreateView(Bundle saveInstanceState) {
        setContentView(R.layout.activity_cadre);
    }

    @Override
    protected void initView() {
        tv_title.setText("干部考核审批");
        iv_soso.setVisibility(View.VISIBLE);
        datas = new ArrayList();
        adapter = new CadreAssessAdapter(this, datas);
        cadre_lis.setAdapter(adapter);

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
        getDatas(0, 10);
        setOnRefresh();
    }

    @Override
    protected void setListener() {
        tv_month.setOnClickListener(this);
        rb_all_approval.setOnClickListener(this);
        rb_already_approval.setOnClickListener(this);
        rb_no_approve.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.lin_back:
                finish();
                break;
            case R.id.tv_cadre_month:
                selectTime();
                break;
            case R.id.rb_all_approval:
                isSelect = -1;
                isRefresh = true;
                progressDialog.show();
                getDatas(0, 10);
                break;
            case R.id.rb_already_approval:
                isSelect = 1;
                isRefresh = true;
                progressDialog.show();
                getDatas(0, 10);
                break;
            case R.id.rb_no_approve:
                isSelect = 0;
                isRefresh = true;
                progressDialog.show();
                getDatas(0, 10);
                break;
            case R.id.lin_right:
                isRefresh = true;
                progressDialog.show();
                getDatas(0, 10);
                break;
        }
    }

    private void getDatas(int page, int num) {
        progressDialog.show();
        model = ModelFactory.getModel(ModelFactory.CADRELIST, this, this);
        model.excuteParams(new CadreAssessBean(page, num, tv_month.getText().toString(), isSelect, et_name.getText().toString()));

    }

    @Override
    public void onTaskPostExecute(int taskid, BaseResponesBean result) {
        cadre_lis.onRefreshComplete();
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
            bean = FastJsonUtil.getObject(result.getDataholder().toString(), CadreAssessBean.class);
            datas = bean.getPage().getList();
            if (datas.size() == 0) {
                ToastUtil.showShort(getApplicationContext(), "已经没有更多数据了");
                cadre_lis.setMode(PullToRefreshBase.Mode.PULL_DOWN_TO_REFRESH);
            }

            if(isRefresh && datas != null){
                adapter.addDatas(datas);
                cadre_lis.setMode(PullToRefreshBase.Mode.BOTH);
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
        cadre_lis.setMode(PullToRefreshBase.Mode.BOTH);
        cadre_lis.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener2<GridView>() {
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
                getDatas(0, 10);

            }
        }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE)).show();

    }
}
