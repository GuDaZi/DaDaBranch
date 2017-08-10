package com.xianzhi.integration.activity;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.alibaba.fastjson.JSON;
import com.handmark.pulltorefresh.library.ILoadingLayout;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshGridView;
import com.xianzhi.integration.R;
import com.xianzhi.integration.adapter.QuantizationAdapter;
import com.xianzhi.integration.base.BaseActivity;
import com.xianzhi.integration.bean.DepartmentBean;
import com.xianzhi.integration.bean.QuantizationBean;
import com.xianzhi.integration.listener.OnPopupClickListener;
import com.xianzhi.integration.model.base.BaseResponesBean;
import com.xianzhi.integration.model.base.ModelCompleteCallback;
import com.xianzhi.integration.model.base.ModelFactory;
import com.xianzhi.integration.tools.DateUtil;
import com.xianzhi.integration.tools.util.FastJsonUtil;
import com.xianzhi.integration.tools.util.StatusUtil;
import com.xianzhi.integration.tools.util.ToastUtil;
import com.xianzhi.integration.view.EnterWorkDepartPopup;
import com.xianzhi.integration.view.YearMonthPickerDialog;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import butterknife.BindView;

/**
 * @Administrator LiBo.
 * @Date 2017/7/31.
 * @Function 量化查询汇总表
 */

public class QuantizationActivity extends BaseActivity implements OnPopupClickListener, ModelCompleteCallback<BaseResponesBean> {

    @BindView(R.id.quantization_list)
    PullToRefreshGridView quantization_list;
    @BindView(R.id.et_quantization_name)
    EditText et_name;
    @BindView(R.id.tv_quantization_depart)
    TextView tv_depart;
    @BindView(R.id.tv_quantization_month)
    TextView tv_month;
    @BindView(R.id.lin_quantization_depart)
    LinearLayout lin_depart;
    //是否刷新
    private boolean isRefresh = true;
    //页数
    private int page = 0;
    private QuantizationBean bean;
    private List<QuantizationBean.PageBean.ListBean> datas;
    private QuantizationAdapter adapter;
    //部门popupwindow
    private EnterWorkDepartPopup departPopup;
    private int departId;
    private String departName;
    private String code;

    private Calendar calendar;
    //控件的宽度
    private int width;

    @Override
    protected void onCreateView(Bundle saveInstanceState) {
        setContentView(R.layout.activity_quantization);
    }

    @Override
    protected void initView() {
        tv_title.setText("量化查询汇总表");
        iv_soso.setVisibility(View.VISIBLE);
        datas = new ArrayList<>();
        adapter = new QuantizationAdapter(context, datas);
        quantization_list.setAdapter(adapter);

        calendar = Calendar.getInstance();
        int year = calendar.get(calendar.YEAR);
        int month = calendar.get(calendar.MONTH) + 1;
        if (month < 10) {
            tv_month.setText(year + "-0" + month);
        } else {
            tv_month.setText(year + "-" + month);
        }

        ViewTreeObserver vto = lin_depart.getViewTreeObserver();
        vto.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {

            public boolean onPreDraw() {
                width = lin_depart.getMeasuredWidth();
                return true;
            }
        });

        getDatas(0, 10);
        setOnRefresh();
    }

    @Override
    protected void setListener() {
        tv_depart.setOnClickListener(this);
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
            case R.id.tv_quantization_depart:
                departPopup.showAsDropDown(lin_depart, 0, 0);
                break;
            case R.id.lin_right:
                isRefresh = true;
                getDatas(0, 10);
                break;
        }
    }

    private void getDatas(int num, int size) {
        if(isRefresh){
            progressDialog.show();
        }
        model = ModelFactory.getModel(ModelFactory.QUANTIZATIONLIST, this, this);
        model.excuteParams(new QuantizationBean(num, size, tv_month.getText().toString(), et_name.getText().toString(), departName, code, departId + ""));
    }

    @Override
    public void onTaskPostExecute(int taskid, BaseResponesBean result) {
        quantization_list.onRefreshComplete();
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
            bean = FastJsonUtil.getObject(result.getDataholder().toString(), QuantizationBean.class);
            datas = bean.getPage().getList();
            String depart = bean.getSearchDeptNodes();
            List<DepartmentBean> departMentBean = JSON.parseArray(depart, DepartmentBean.class);
            departPopup = new EnterWorkDepartPopup(width, this, departMentBean, this);
            if (datas.size() == 0) {
                ToastUtil.showShort(getApplicationContext(), "已经没有更多数据了");
                quantization_list.setMode(PullToRefreshBase.Mode.PULL_DOWN_TO_REFRESH);
            }

            if(isRefresh && datas != null){
                adapter.addDatas(datas);
                quantization_list.setMode(PullToRefreshBase.Mode.BOTH);
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
        quantization_list.setMode(PullToRefreshBase.Mode.BOTH);
        quantization_list.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener2<GridView>() {
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

            }
        }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE)).show();

    }

    @Override
    public void onContentClick(int type, String content, int pid) {

    }

    @Override
    public void onDepartClick(int type, String depart, String content, int pid, String code) {
        departId = pid;
        tv_depart.setText(depart);
        departName = content;
        this.code = code;
    }
}
