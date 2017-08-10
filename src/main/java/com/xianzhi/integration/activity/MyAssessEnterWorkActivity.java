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
import com.alibaba.fastjson.JSONObject;
import com.xianzhi.integration.R;
import com.xianzhi.integration.adapter.MyAssessWorkAdapter;
import com.xianzhi.integration.base.BaseActivity;
import com.xianzhi.integration.base.BaseApplication;
import com.xianzhi.integration.bean.AddressTypeBean;
import com.xianzhi.integration.bean.DepartmentBean;
import com.xianzhi.integration.bean.EnterWorkBean;
import com.xianzhi.integration.bean.EnterWorkSubmit1Bean;
import com.xianzhi.integration.bean.EnterWorkSubmit2Bean;
import com.xianzhi.integration.bean.EnterWorkSubmitBean;
import com.xianzhi.integration.bean.MyAssessWorkBean;
import com.xianzhi.integration.listener.OnPopupClickListener;
import com.xianzhi.integration.model.base.BaseResponesBean;
import com.xianzhi.integration.model.base.ModelCompleteCallback;
import com.xianzhi.integration.model.base.ModelFactory;
import com.xianzhi.integration.tools.util.FastJsonUtil;
import com.xianzhi.integration.tools.util.LogUtil;
import com.xianzhi.integration.tools.util.StatusUtil;
import com.xianzhi.integration.tools.util.ToastUtil;
import com.xianzhi.integration.view.AddressPopup;
import com.xianzhi.integration.view.AddressTypePopup;
import com.xianzhi.integration.view.EnterWorkDepartPopup;
import com.xianzhi.integration.view.MyAssessListView;
import com.xianzhi.integration.view.RiskPopup;
import com.xianzhi.integration.view.RiskTypePopup1;
import com.xianzhi.integration.view.TimeDialog;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * @Administrator LiBo.
 * @Date 2017/7/19.
 * @Function
 */

public class MyAssessEnterWorkActivity extends BaseActivity implements MyAssessWorkAdapter.OnItemIdClickListner, OnPopupClickListener, TimeDialog.OnTimeClickListener, ModelCompleteCallback<BaseResponesBean> {

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
    TextView tv_total;
    //检查内容
    @BindView(R.id.et_examine_content)
    EditText et_content;
    //提交
    @BindView(R.id.tv_submit)
    TextView tv_submit;
    //根布局
    @BindView(R.id.lin_content)
    LinearLayout lin_content;
    //我的任务列表
    @BindView(R.id.list_myAssessWork)
    MyAssessListView list_work;
    //判断显示popupwindow条件
    private int index;
    //部门popupwindow
    private EnterWorkDepartPopup departPopup;
    //风险类型popupwindow
    private RiskTypePopup1 riskTypePopup;
    //风险popupwindow
    private RiskPopup riskPopup;
    //地点类型popupwindow
    private AddressTypePopup addressTypePopup;
    //地点popupwindow
    private AddressPopup addressPopup;
    //风险项点类型的popupwindow数据
    private List<MyAssessWorkBean.RiskTypesBean> popupDatas;
    //时间选择器
    private TimeDialog timeDialog;
    private String date;
    private MyAssessWorkBean assessWorkBean;
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
    //工作适配器
    private MyAssessWorkAdapter workAdapter;
    //工作集合
    private List<MyAssessWorkBean.ListBean> workDatas;
    private String code;
    private List<String> itemIds;
    private List<String> itemNum;
    private List<EnterWorkSubmit1Bean> submitDatas;
    private List<String> datasContents;
    private List<String> positions;
    private int width;

    @Override
    protected void onCreateView(Bundle saveInstanceState) {
        setContentView(R.layout.activity_myassess_enter_work);
    }

    @Override
    protected void initView() {
        lin_content.setFocusable(true);
        lin_content.setFocusableInTouchMode(true);
        tv_title.setText("我的月度考核表");

        date = getIntent().getStringExtra("date");

        popupDatas = new ArrayList();
        timeDialog = new TimeDialog(this, R.style.dialog, this, this);

        workDatas = new ArrayList<>();

        itemIds = new ArrayList<>();
        itemNum = new ArrayList<>();
        submitDatas = new ArrayList<>();
        datasContents = new ArrayList<>();
        positions = new ArrayList<>();

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
                departPopup = new EnterWorkDepartPopup(width, this, departMentBean, this);
                departPopup.showAsDropDown(tv_depart, 0, 0);
                break;
            case R.id.tv_find_address:
                if (!TextUtils.isEmpty(tv_depart.getText().toString())) {
                    index = 2;
                    addressTypePopup = new AddressTypePopup(width, this, typeBean.getList(), this);
                    addressTypePopup.showAsDropDown(tv_find_address, 0, 0);
                } else {
                    ToastUtil.showShort(getApplicationContext(), "请选择部门");
                }
                break;
            case R.id.tv_address:
                if (!TextUtils.isEmpty(tv_find_address.getText().toString())) {
                    index = 3;
                    addressPopup = new AddressPopup(width, this, typeBean.getList(), this);
                    addressPopup.showAsDropDown(tv_address, 0, 0);
                } else {
                    ToastUtil.showShort(getApplicationContext(), "请选择发现地点类型");
                }
                break;
            case R.id.tv_risk_type:
                index = 4;
                riskTypePopup = new RiskTypePopup1(width, this, popupDatas, this);
                riskTypePopup.showAsDropDown(tv_risk_type, 0, 0);
                break;
            case R.id.tv_risk:
                index = 5;
                if (!TextUtils.isEmpty(tv_risk_type.getText().toString())) {
                    riskPopup = new RiskPopup(width, this, typeBean.getList(), this);
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
        model.excuteParams(new EnterWorkBean("", date, BaseApplication.userId));

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
        submitDatas.clear();
        String depart = tv_depart.getText().toString();
        String addressType = tv_find_address.getText().toString();
        String riskType = tv_risk_type.getText().toString();
        String risk = tv_risk.getText().toString();
        String time = tv_time.getText().toString();
        String content = et_content.getText().toString();
        String address = tv_address.getText().toString();
        for (int i = 0; i < itemIds.size(); i ++) {
            EnterWorkSubmit1Bean submit1Bean = new EnterWorkSubmit1Bean();
            submit1Bean.setPlace(address);
            submit1Bean.setPlace_type(addressType);
            submit1Bean.setStatus("5");
            submit1Bean.setNum(datasContents.get(Integer.parseInt(positions.get(i))));
            submit1Bean.setPreid(itemIds.get(i));
            submitDatas.add(submit1Bean);
        }

        EnterWorkSubmit2Bean submit2Bean = new EnterWorkSubmit2Bean(submitDatas);
        JSONObject realisticArray = (JSONObject) JSON.toJSON(submit2Bean);
        String text = "";
        if(realisticArray.toString().length() > 10){
            String str[] = realisticArray.toString().split("\"data\":");
            if(str.length >= 2){
                text = str[1];
                text = text.substring(0, text.length() - 1);
            }
        }
        LogUtil.i("realisticArray", text);
        model = ModelFactory.getModel(ModelFactory.MYENTERWORKSUBMIT, this, this);
        model.excuteParams(new EnterWorkSubmitBean(userName, departName, departId + "", depart, addressType, addressTypeId + "",
                addressId + "", riskType, riskTypeId + "", risk, riskId + "", time, content, text, submitDatas.size(), code));
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
                    assessWorkBean = FastJsonUtil.getObject(result.getDataholder().toString(), MyAssessWorkBean.class);
                    workAdapter = new MyAssessWorkAdapter(this, this, assessWorkBean.getList());
                    list_work.setAdapter(workAdapter);
                    tv_personal.setText(assessWorkBean.getUser().getName());
                    userName = assessWorkBean.getUser().getName();
                    //风险点
                    popupDatas = assessWorkBean.getRiskTypes();
                    //部门
                    String depart = assessWorkBean.getZNodes();
                    departMentBean = JSON.parseArray(depart, DepartmentBean.class);

                    break;
                case ModelFactory.ADDRESSTYPE:
                    typeBean = FastJsonUtil.getObject(result.getDataholder().toString(), AddressTypeBean.class);
                    break;
                case ModelFactory.MYENTERWORKSUBMIT:
                    EnterWorkSubmitBean submitBean = FastJsonUtil.getObject(result.getDataholder().toString(), EnterWorkSubmitBean.class);
                    if (submitBean.getStatus() == 0) {
                        finish();
                    } else if (submitBean.getStatus() == 2) {
                        ToastUtil.showShort(getApplicationContext(), "该名称已经存在");
                    } else if (submitBean.getStatus() == -1) {
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
        this.code = code;
        getAddressType(pid, 1);
    }

    @Override
    public void onItemIdClick(List<String> itemIdKey, List<String> itemNum, List<String> positions) {
        itemIds = itemIdKey;
        this.itemNum = itemNum;
        this.positions = positions;
    }

    @Override
    public void onNumClick(List<String> datasContents) {
        this.datasContents = datasContents;
    }
}