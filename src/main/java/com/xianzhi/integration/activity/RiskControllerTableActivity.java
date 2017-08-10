package com.xianzhi.integration.activity;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.alibaba.fastjson.JSON;
import com.xianzhi.integration.R;
import com.xianzhi.integration.adapter.RiskControllerAdapter;
import com.xianzhi.integration.base.BaseActivity;
import com.xianzhi.integration.bean.DepartmentBean;
import com.xianzhi.integration.bean.RiskControllerBean;
import com.xianzhi.integration.listener.OnPopupClickListener;
import com.xianzhi.integration.model.base.BaseResponesBean;
import com.xianzhi.integration.model.base.ModelCompleteCallback;
import com.xianzhi.integration.model.base.ModelFactory;
import com.xianzhi.integration.tools.DateUtil;
import com.xianzhi.integration.tools.util.FastJsonUtil;
import com.xianzhi.integration.tools.util.StatusUtil;
import com.xianzhi.integration.view.EnterWorkDepartPopup;
import com.xianzhi.integration.view.JobNamePopup;
import com.xianzhi.integration.view.TaskTypePopup;
import com.xianzhi.integration.view.YearMonthPickerDialog;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import butterknife.BindView;

/**
 * @Administrator LiBo.
 * @Date 2017/8/2.
 * @Function 安全风险控制表
 */

public class RiskControllerTableActivity extends BaseActivity implements OnPopupClickListener, ModelCompleteCallback<BaseResponesBean> {

    @BindView(R.id.lin_soso)
    LinearLayout lin_soso;
    @BindView(R.id.lin_sosoType)
    LinearLayout lin_sososType;
    @BindView(R.id.lin_controller_depart)
    LinearLayout lin_depart;
    @BindView(R.id.lin_controller_jobName)
    LinearLayout lin_jobName;
    @BindView(R.id.lin_controller_type)
    LinearLayout lin_type;
    @BindView(R.id.tv_controller_month)
    TextView tv_month;
    @BindView(R.id.tv_controller_depart)
    TextView tv_depart;
    @BindView(R.id.et_controller_name)
    EditText et_name;
    @BindView(R.id.tv_controller_jobName)
    TextView tv_jobName;
    @BindView(R.id.tv_controller_type)
    TextView tv_type;
    @BindView(R.id.riskController_list)
    ListView riskController_list;

    private RiskControllerAdapter adapter;

    private List<RiskControllerBean.ListBean> datas;
    //部门popupwindow
    private EnterWorkDepartPopup departPopup;
    private String departId;
    private String departName;
    private String code;

    private Calendar calendar;
    //控件的宽度
    private int width;

    private String type = "normal";
    //职名popupwindow
    private JobNamePopup jobNamePopup;
    private TaskTypePopup taskTypePopup;
    private String jobNameId;

    private List<DepartmentBean> departMentBean = new ArrayList<>();
    private RiskControllerBean bean;

    @Override
    protected void onCreateView(Bundle saveInstanceState) {
        setContentView(R.layout.activity_riskcontroller);
    }

    @Override
    protected void initView() {
        tv_title.setText("安全风险控制表");
        iv_soso.setVisibility(View.VISIBLE);

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

        datas = new ArrayList<>();
        adapter = new RiskControllerAdapter(context, datas);
        riskController_list.setAdapter(adapter);

        getDatas();
    }

    @Override
    protected void setListener() {
        tv_depart.setOnClickListener(this);
        tv_type.setOnClickListener(this);
        tv_month.setOnClickListener(this);
        tv_jobName.setOnClickListener(this);
        lin_soso.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.lin_back:
                finish();
                break;
            case R.id.lin_right:
                getDatas();
                break;
            case R.id.tv_controller_month:
                selectTime();
                break;
            case R.id.tv_controller_depart:
                departPopup = new EnterWorkDepartPopup(width, this, departMentBean, this);
                departPopup.showAsDropDown(lin_depart, 0, 0);
                break;
            case R.id.tv_controller_jobName:
                jobNamePopup = new JobNamePopup(width, this, bean.getPositionList(), context);
                jobNamePopup.showAsDropDown(lin_jobName, 0, 0);
                break;
            case R.id.tv_controller_type:
                taskTypePopup = new TaskTypePopup(width, this, context);
                taskTypePopup.showAsDropDown(lin_type, 0, 0);
                break;
            case R.id.lin_soso:
                lin_sososType.setVisibility(View.VISIBLE);
                lin_soso.setVisibility(View.GONE);
                break;
        }
    }

    private void getDatas() {
        progressDialog.show();
        model = ModelFactory.getModel(ModelFactory.RISKCONTROLLER, this, this);
        model.excuteParams(new RiskControllerBean(jobNameId, tv_month.getText().toString(), departName, code, departId, et_name.getText().toString(), type));
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
            bean = FastJsonUtil.getObject(result.getDataholder().toString(), RiskControllerBean.class);
            adapter.setType(type);
            datas = bean.getList();
            adapter.addDatas(datas);
            adapter.notifyDataSetChanged();
            String depart = bean.getSearchDeptNodes();
            departMentBean = JSON.parseArray(depart, DepartmentBean.class);
            tv_month.setText(bean.getYearAndMonth());

        }
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
        if(type  == 10){
            tv_type.setText(content);
            if(pid == 1){
                this.type = "normal";
            } else {
                this.type = "dynamic";
            }
        } else if(type == 5) {
            jobNameId = pid + "";
            tv_jobName.setText(content);
        }
        getDatas();
    }

    @Override
    public void onDepartClick(int type, String depart, String content, int pid, String code) {
        departId = pid + "";
        tv_depart.setText(depart);
        departName = content;
        this.code = code;
    }
}
