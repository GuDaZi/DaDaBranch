package com.xianzhi.integration.activity;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.xianzhi.integration.R;
import com.xianzhi.integration.adapter.MyAssessListAdapter;
import com.xianzhi.integration.base.BaseActivity;
import com.xianzhi.integration.bean.MyAssessBean;
import com.xianzhi.integration.model.base.BaseResponesBean;
import com.xianzhi.integration.model.base.ModelCompleteCallback;
import com.xianzhi.integration.model.base.ModelFactory;
import com.xianzhi.integration.tools.DateUtil;
import com.xianzhi.integration.tools.util.FastJsonUtil;
import com.xianzhi.integration.tools.util.StatusUtil;
import com.xianzhi.integration.tools.util.ToastUtil;
import com.xianzhi.integration.view.MyAssessPopup;
import com.xianzhi.integration.view.YearMonthPickerDialog;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import butterknife.BindView;

/**
 * @Administrator LiBo.
 * @Date 2017/7/14.
 * @Function 我的月度考核
 */

public class MyAssessActivity extends BaseActivity implements ModelCompleteCallback<BaseResponesBean>, MyAssessPopup.OnTypeClickListener {

    @BindView(R.id.myAssess_list)
    ListView myAssess_lis;
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

    //右上角popupwindow
    private MyAssessPopup cadrePopup;
    private MyAssessListAdapter adapter;
    private List<MyAssessBean.ListBean> myAssessDatas;
    private Calendar calendar;
    private MyAssessBean myAssessBean;
    private boolean isIntentn = false;
    private String leaderId;

    @Override
    protected void onCreateView(Bundle saveInstanceState) {
        setContentView(R.layout.activity_myassess);
    }

    @Override
    protected void initView() {
        tv_title.setText("我的月度考核表");
        iv_soso.setVisibility(View.VISIBLE);
        iv_soso.setImageResource(R.mipmap.btn_more);
        calendar = Calendar.getInstance();
        int year = calendar.get(calendar.YEAR);
        int month = calendar.get(calendar.MONTH) + 1;
        if (month < 10) {
            tv_month.setText(year + "-0" + month);
        } else {
            tv_month.setText(year + "-" + month);
        }

        myAssessDatas = new ArrayList();
        adapter = new MyAssessListAdapter(this, myAssessDatas);
        myAssess_lis.setAdapter(adapter);

        getDatas();

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
            case R.id.lin_right:
                cadrePopup.showAsDropDown(iv_soso, 0, 0);
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

    /**
     * 获取列表数据
     */
    private void getDatas() {
        progressDialog.show();
        model = ModelFactory.getModel(ModelFactory.MYASSESS, this, this);
        model.excuteParams(new MyAssessBean(tv_month.getText().toString()));
    }

    /**
     * 提交审批
     */
    private void setApprove() {
        model = ModelFactory.getModel(ModelFactory.MYASSESS, this, this);
        model.excuteParams(new MyAssessBean(tv_month.getText().toString(), leaderId));
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
            switch (taskid) {
                case ModelFactory.MYASSESS:
                    myAssessBean = FastJsonUtil.getObject(result.getDataholder().toString(), MyAssessBean.class);
                    myAssessDatas = myAssessBean.getList();
                    adapter.addDatas(myAssessDatas);
                    adapter.setDate(tv_month.getText().toString());
                    adapter.setIsSubmit(myAssessBean.getIsSubmit());
                    adapter.notifyDataSetChanged();
                    if (myAssessBean.getIsSubmit() == 1) {
                        cadrePopup = new MyAssessPopup(this, this, 1);
                    } else {
                        cadrePopup = new MyAssessPopup(this, this, 0);
                    }
                    tv_month.setText(myAssessBean.getMonth());
//                    tv_depart.setText(myAssessBean.getSelfRealistic().getUser_dept_name());
//                    tv_jobName.setText(myAssessBean.getSelfRealistic().getUser_dept_name());
//                    tv_personal.setText(myAssessBean.getSelfRealistic().getUser_name());
//                    tv_userName.setText(myAssessBean.getSelfRealistic().getUser_name());
                    tv_post.setText("");

                    if (myAssessBean.getApprove() == null || myAssessBean.getApprove().getApprove_time3() == null) {
                        isIntentn = false;
                    } else if (myAssessBean.getApprove() != null && myAssessBean.getApprove().getApprove_time3() != null) {
                        if (myAssessBean.getSelfRealistic() == null) {
                            isIntentn = false;
                        } else {
                            isIntentn = true;
                        }
                    }

                    if (!TextUtils.isEmpty(leaderId)) {
                        ToastUtil.showShort(getApplicationContext(), myAssessBean.getInfo());
                    }
                    break;
            }
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
                getDatas();

            }
        }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE)).show();

    }

    @Override
    public void onTypeClick(int type) {
        Intent intent = null;
        //录入具体工作
        if (type == 4) {
            if (isIntentn) {
                intent = new Intent(context, MyAssessEnterWorkActivity.class);
                intent.putExtra("date", tv_month.getText().toString());
                startActivity(intent);
            } else {
                ToastUtil.showShort(getApplicationContext(), "领导还未审批！");
            }
        } else if (type == 3) {
            if (isIntentn) {
                intent = new Intent(context, AssessCheckDetailActivity.class);
                intent.putExtra("date", tv_month.getText().toString());
                startActivity(intent);
            } else {
                ToastUtil.showShort(getApplicationContext(), "领导还未审批！");
            }
        } else if (type == 2) {
            if (isIntentn) {
                intent = new Intent(context, TableActivity.class);
                intent.putExtra("itemId", tv_month.getText().toString());
                intent.putExtra("type", "0");
                startActivity(intent);
            } else {
                ToastUtil.showShort(getApplicationContext(), "领导还未审批！");
            }
        } else if (type == 1) {
            if (isIntentn) {
                setApprove();
            } else {
                ToastUtil.showShort(getApplicationContext(), "自我写实填写后才能提交审批！");
            }
        }
    }
}
