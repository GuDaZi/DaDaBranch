package com.xianzhi.integration.activity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;

import com.alibaba.fastjson.JSON;
import com.xianzhi.integration.R;
import com.xianzhi.integration.base.BaseActivity;
import com.xianzhi.integration.bean.ApproveDepartBean;
import com.xianzhi.integration.bean.DepartmentBean;
import com.xianzhi.integration.listener.OnPopupClickListener;
import com.xianzhi.integration.model.base.BaseResponesBean;
import com.xianzhi.integration.model.base.ModelCompleteCallback;
import com.xianzhi.integration.model.base.ModelFactory;
import com.xianzhi.integration.tools.util.FastJsonUtil;
import com.xianzhi.integration.tools.util.StatusUtil;
import com.xianzhi.integration.tools.util.ToastUtil;
import com.xianzhi.integration.view.ApproveNamePopup;
import com.xianzhi.integration.view.EnterWorkDepartPopup;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * @Administrator LiBo.
 * @Date 2017/7/26.
 * @Function 提交界面
 */

public class ApproveDepartActivity extends BaseActivity implements ModelCompleteCallback<BaseResponesBean>, OnPopupClickListener {

    @BindView(R.id.tv_approve_depart)
    TextView tv_depart;
    @BindView(R.id.tv_approve_name)
    TextView tv_name;
    //部门实体类
    private List<DepartmentBean> departMentBean;
    //部门popupwindow
    private EnterWorkDepartPopup departPopup;
    //部门id
    private int departId;
    //部门名称
    private String departName;
    //姓名popupwindow
    private ApproveNamePopup namePopup;
    private String itemId;
    private String content;
    private int userId;
    private int width;

    @Override
    protected void onCreateView(Bundle saveInstanceState) {
        setContentView(R.layout.activity_approve_depart);
    }

    @Override
    protected void initView() {
        tv_edit.setText("提交");
        tv_edit.setVisibility(View.VISIBLE);
        itemId = getIntent().getStringExtra("itemId");
        content = getIntent().getStringExtra("content");

        ViewTreeObserver vto = tv_depart.getViewTreeObserver();
        vto.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {

            public boolean onPreDraw() {
                width = tv_depart.getMeasuredWidth();
                return true;
            }
        });

        departMentBean = new ArrayList<>();
        departMentBean = JSON.parseArray(getIntent().getStringExtra("departName"), DepartmentBean.class);

    }

    @Override
    protected void setListener() {
        tv_depart.setOnClickListener(this);
        tv_name.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.lin_back:
                finish();
                break;
            case R.id.lin_right:
                setApproveDepart();
                break;
            case R.id.tv_approve_depart:
                departPopup = new EnterWorkDepartPopup(width, this, departMentBean, this);
                departPopup.showAsDropDown(tv_depart, 0, 0);
                break;
            case R.id.tv_approve_name:
                if(!TextUtils.isEmpty(tv_depart.getText().toString())){
                    namePopup.showAsDropDown(tv_name, 0, 0);
                } else {
                    ToastUtil.showShort(getApplicationContext(), "请选择部门");
                }
                break;
        }
    }

    /**
     * 获取姓名
     * @param code
     */
    private void getNameDatas(String code) {
        model = ModelFactory.getModel(ModelFactory.APPROVEDEPART, this, this);
        model.excuteParams(new ApproveDepartBean(code, "like", "gbkhsp"));
    }

    /**
     * 提交
     */
    private void setApproveDepart() {
        model = ModelFactory.getModel(ModelFactory.APPROVEOPINION, this, this);
        model.excuteParams(new ApproveDepartBean(itemId, userId, content));
    }

    @Override
    public void onTaskPostExecute(int taskid, BaseResponesBean result) {
        if(result==null){
            return;
        }
        if(result.getStatus()!= StatusUtil.STATUS_OK){
            return;
        }
        if(result.getInterface_status() == StatusUtil.INTERFACE_OK) {
            ApproveDepartBean departBean = FastJsonUtil.getObject(result.getDataholder().toString(), ApproveDepartBean.class);
            switch (taskid) {
                case ModelFactory.APPROVEOPINION:
                    if(departBean.getStatus() == 0){
                        finish();
                    } else {
                        ToastUtil.showShort(getApplicationContext(), "保存失败");
                    }
                    break;
                case ModelFactory.APPROVEDEPART:
                    namePopup = new ApproveNamePopup(this, departBean.getList(), context);
                    break;
            }

        }
    }

    @Override
    public void onContentClick(int type, String content, int pid) {
        tv_name.setText(content);
        userId = pid;
    }

    @Override
    public void onDepartClick(int type, String depart, String content, int pid, String code) {
        departId = pid;
        tv_depart.setText(depart);
        departName = content;
        getNameDatas(code);
    }
}
