package com.xianzhi.integration.activity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

import com.alibaba.fastjson.JSON;
import com.xianzhi.integration.R;
import com.xianzhi.integration.base.BaseActivity;
import com.xianzhi.integration.bean.AddressTypeBean;
import com.xianzhi.integration.bean.DepartmentBean;
import com.xianzhi.integration.bean.EnterWorkBean;
import com.xianzhi.integration.bean.EnterWorkSubmitBean;
import com.xianzhi.integration.listener.OnPopupClickListener;
import com.xianzhi.integration.model.base.BaseResponesBean;
import com.xianzhi.integration.model.base.ModelCompleteCallback;
import com.xianzhi.integration.model.base.ModelFactory;
import com.xianzhi.integration.tools.util.FastJsonUtil;
import com.xianzhi.integration.tools.util.StatusUtil;
import com.xianzhi.integration.tools.util.ToastUtil;
import com.xianzhi.integration.view.AddressPopup;
import com.xianzhi.integration.view.AddressTypePopup;
import com.xianzhi.integration.view.EnterWorkDepartPopup;
import com.xianzhi.integration.view.RiskPopup;
import com.xianzhi.integration.view.RiskTypePopup;
import com.xianzhi.integration.view.TimeDialog;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * @Administrator LiBo.
 * @Date 2017/7/14.
 * @Function 录入具体工作
 */

public class EnterWorkActivity extends BaseActivity implements OnPopupClickListener, TimeDialog.OnTimeClickListener, ModelCompleteCallback<BaseResponesBean> {

    //工作标准
    @BindView(R.id.tv_word_standard)
    TextView tv_standard;
    //写实人
    @BindView(R.id.tv_realistic_person)
    TextView tv_personal;
    //部门
    @BindView(R.id.tv_depart)
    EditText tv_depart;
    //发现地点类型
    @BindView(R.id.tv_find_address)
    EditText tv_find_address;
    //发现地点
    @BindView(R.id.tv_address)
    EditText tv_address;
    //风险项点类型
    @BindView(R.id.tv_risk_type)
    EditText tv_risk_type;
    //风险项点
    @BindView(R.id.tv_risk)
    EditText tv_risk;
    //检查时间
    @BindView(R.id.tv_examine_time)
    TextView tv_time;
    //部门检查
    @BindView(R.id.rb_sure_examine)
    RadioButton tv_sure;
    @BindView(R.id.rb_no_examine)
    RadioButton rb_no;
    //常态任务
    @BindView(R.id.tv_routine_tasks)
    TextView tv_routine;
    //动态任务
    @BindView(R.id.tv_dynamic_tasks)
    TextView tv_dynamic;
    //合计
    @BindView(R.id.tv_total)
    TextView tv_tv_total;
    //检查内容
    @BindView(R.id.et_examine_content)
    EditText et_content;
    //提交
    @BindView(R.id.tv_submit)
    TextView tv_submit;
    //根布局
    @BindView(R.id.lin_content)
    LinearLayout lin_content;
    //判断显示popupwindow条件
    private int index;
    //部门popupwindow
    private EnterWorkDepartPopup departPopup;
    //风险类型popupwindow
    private RiskTypePopup riskTypePopup;
    //风险popupwindow
    private RiskPopup riskPopup;
    //地点类型popupwindow
    private AddressTypePopup addressTypePopup;
    //地点popupwindow
    private AddressPopup addressPopup;
    //风险项点类型的popupwindow数据
    private List<EnterWorkBean.RiskTypesBean> popupDatas;
    //时间选择器
    private TimeDialog timeDialog;
    private String itemId;
    private String date;
    private String userId;
    private EnterWorkBean enterWorkBean;
    //部门列表实体类
    private List<DepartmentBean> departMentBean;
    //地点类型的bean
    private AddressTypeBean typeBean;
    //是否检查
    private int isExamine;
    //部门id
    private int departId;
    //地点类型id
    private int addressTypeId;
    //地点id
    private int addressId;
    //风险类型id
    private int riskTypeId;
    //风险id
    private int riskId;
    //部门名称
    private String departName;
    //用户姓名
    private String userName;
    private int width;

    @Override
    protected void onCreateView(Bundle saveInstanceState) {
        setContentView(R.layout.activity_enter_work);
    }

    @Override
    protected void initView() {
        lin_content.setFocusable(true);
        lin_content.setFocusableInTouchMode(true);
        tv_title.setText("我的月度考核表");

        itemId = getIntent().getStringExtra("itemId");
        date = getIntent().getStringExtra("date");
        userId = getIntent().getStringExtra("userId");

        popupDatas = new ArrayList();
        timeDialog = new TimeDialog(this, R.style.dialog, this, this);

        ViewTreeObserver vto = tv_depart.getViewTreeObserver();
        vto.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {

            public boolean onPreDraw() {
                width = tv_depart.getMeasuredWidth();
                return true;
            }
        });

        getDatas();
    }

    @Override
    protected void setListener() {
        tv_submit.setOnClickListener(this);
        tv_depart.setOnClickListener(this);
        tv_find_address.setOnClickListener(this);
        tv_address.setOnClickListener(this);
        tv_risk_type.setOnClickListener(this);
        tv_risk.setOnClickListener(this);
        tv_time.setOnClickListener(this);
        tv_sure.setOnClickListener(this);
        rb_no.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_depart:
                index = 1;
                departPopup = new EnterWorkDepartPopup(width, context, departMentBean, this);
                departPopup.showAsDropDown(tv_depart, 0, 0);
                break;
            case R.id.tv_find_address:
                if (!TextUtils.isEmpty(tv_depart.getText().toString())) {
                    index = 2;
                    addressTypePopup = new AddressTypePopup(width, this, typeBean.getList(), EnterWorkActivity.this);
                    addressTypePopup.showAsDropDown(tv_find_address, 0, 0);
                } else {
                    ToastUtil.showShort(getApplicationContext(), "请选择部门");
                }
                break;
            case R.id.tv_address:
                if (!TextUtils.isEmpty(tv_find_address.getText().toString())) {
                    index = 3;
                    addressPopup = new AddressPopup(width, this, typeBean.getList(), EnterWorkActivity.this);
                    addressPopup.showAsDropDown(tv_address, 0, 0);
                } else {
                    ToastUtil.showShort(getApplicationContext(), "请选择发现地点类型");
                }
                break;
            case R.id.tv_risk_type:
                index = 4;
                riskTypePopup = new RiskTypePopup(width, this, popupDatas, EnterWorkActivity.this);
                riskTypePopup.showAsDropDown(tv_risk_type, 0, 0);
                break;
            case R.id.tv_risk:
                index = 5;
                if (!TextUtils.isEmpty(tv_risk_type.getText().toString())) {
                    riskPopup = new RiskPopup(width, this, typeBean.getList(), EnterWorkActivity.this);
                    riskPopup.showAsDropDown(tv_risk, 0, 0);
                } else {
                    ToastUtil.showShort(getApplicationContext(), "请选择风险项点类型");
                }
                break;
            case R.id.tv_examine_time:
                timeDialog.show();
                break;
            case R.id.rb_sure_examine:
                isExamine = 1;
                break;
            case R.id.rb_no_examine:
                isExamine = 0;
                break;
            case R.id.tv_submit:
                //判断
                setSubmitDatas();
                break;
            case R.id.lin_back:
                finish();
                break;

        }
    }

    /**
     * 获取详情
     */
    private void getDatas() {
        progressDialog.show();
        model = ModelFactory.getModel(ModelFactory.ENTERWORK, this, this);
        model.excuteParams(new EnterWorkBean(itemId, date, userId));

    }

    /**
     * 获取地点类型
     *
     * @param pid
     */
    private void getAddressType(int pid, int type) {
        model = ModelFactory.getModel(ModelFactory.ADDRESSTYPE, this, this);
        model.excuteParams(new AddressTypeBean(pid + "", type));
    }

    /**
     * 提交
     */
    private void setSubmitDatas() {
        String depart = tv_depart.getText().toString();
        String addressType = tv_find_address.getText().toString();
        String address = tv_address.getText().toString();
        String riskType = tv_risk_type.getText().toString();
        String risk = tv_risk.getText().toString();
        String time = tv_time.getText().toString();
        String content = et_content.getText().toString();
        model = ModelFactory.getModel(ModelFactory.ENTERWORKSUBMIT, this, this);
        model.excuteParams(new EnterWorkSubmitBean(itemId, userName, "5", departName, departId + "", depart, addressType, addressTypeId + "", address,
                addressId + "", riskType, riskTypeId + "", risk, riskId + "", time, isExamine + "", content));
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
            lin_content.setVisibility(View.VISIBLE);
            switch (taskid) {
                case ModelFactory.ENTERWORK:
                    enterWorkBean = FastJsonUtil.getObject(result.getDataholder().toString(), EnterWorkBean.class);
                    tv_standard.setText(enterWorkBean.getPersonalAssessmentInfo().getContent());
                    tv_personal.setText(enterWorkBean.getUser_name());
                    userName = enterWorkBean.getUser_name();
                    //风险点
                    popupDatas = enterWorkBean.getRiskTypes();
                    //部门
                    String depart = enterWorkBean.getZNodes();
                    departMentBean = JSON.parseArray(depart, DepartmentBean.class);

                    tv_dynamic.setText(enterWorkBean.getPersonalAssessmentInfo().getDynamic_done() + "/" + enterWorkBean.getPersonalAssessmentInfo().getDynamic());
                    tv_routine.setText(enterWorkBean.getPersonalAssessmentInfo().getNormal_done() + "/" + enterWorkBean.getPersonalAssessmentInfo().getNormal());
                    tv_tv_total.setText((enterWorkBean.getPersonalAssessmentInfo().getDynamic_done() + enterWorkBean.getPersonalAssessmentInfo().getNormal_done() + enterWorkBean.getPersonalAssessmentInfo().getExtra_done()) + "/" + (enterWorkBean.getPersonalAssessmentInfo().getDynamic() + enterWorkBean.getPersonalAssessmentInfo().getNormal()));

                    break;
                case ModelFactory.ADDRESSTYPE:
                    typeBean = FastJsonUtil.getObject(result.getDataholder().toString(), AddressTypeBean.class);
                    break;
                case ModelFactory.ENTERWORKSUBMIT:
                    EnterWorkSubmitBean submitBean = FastJsonUtil.getObject(result.getDataholder().toString(), EnterWorkSubmitBean.class);
                    if(submitBean.getStatus() == 0){
                        finish();
                    } else if(submitBean.getStatus() == 2) {
                        ToastUtil.showShort(getApplicationContext(), "该名称已经存在");
                    } else if(submitBean.getStatus() == -1) {
                        ToastUtil.showShort(getApplicationContext(), "保存失败");
                    }
                    break;
            }

        }
    }


    @Override
    public void onTimeClick(String time) {
        tv_time.setText(time + ":00");
    }

    @Override
    public void onContentClick(int type, String content, int pid) {
        if (index == 2) {
            addressTypeId = pid;
            tv_find_address.setText(content);
            getAddressType(pid, 2);
        } else if (index == 3) {
            addressId = pid;
            tv_address.setText(content);
        } else if (index == 4) {
            riskTypeId = pid;
            tv_risk_type.setText(content);
            getAddressType(pid, 3);
        } else if (index == 5) {
            riskId = pid;
            tv_risk.setText(content);
        }
    }

    @Override
    public void onDepartClick(int type, String depart, String content, int pid, String code) {
        departId = pid;
        tv_depart.setText(depart);
        departName = content;
        getAddressType(pid, 1);
    }
}
