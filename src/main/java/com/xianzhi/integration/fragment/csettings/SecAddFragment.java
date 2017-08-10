package com.xianzhi.integration.fragment.csettings;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.xianzhi.integration.R;
import com.xianzhi.integration.activity.settings.SecActivity;
import com.xianzhi.integration.model.base.BaseResponesBean;
import com.xianzhi.integration.model.base.ModelCompleteCallback;
import com.xianzhi.integration.model.base.SettingsModelFactory;
import com.xianzhi.integration.tools.util.ToastUtil;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by TJTJL on 2017/7/20.
 */

public class SecAddFragment extends BaseFragment implements ModelCompleteCallback<BaseResponesBean> {

    @BindView(R.id.ed_pickYear)
    EditText edPickYear;
    @BindView(R.id.ed_inputName)
    EditText edInputName;
    @BindView(R.id.cb_reCreate)
    CheckBox cbReCreate;
    @BindView(R.id.cb_copyCreate)
    CheckBox cbCopyCreate;
    @BindView(R.id.ed_order)
    EditText edOrder;
    @BindView(R.id.ll_pickCopyYear)
    LinearLayout llPickCopyYear;
    @BindView(R.id.tv_submit)
    TextView tvSubmit;
    @BindView(R.id.tv_cancel)
    TextView tvCancel;
    Unbinder unbinder;

    private List<NameValuePair> list = new ArrayList<>();

    @Override
    public void onStart() {
        super.onStart();
        SecActivity activity = (SecActivity) getActivity();
        activity.setTitleBtn(activity.SEC_ADD_FRAG);
    }

    @Override
    protected void initData() {
    }

    @Override
    public View initView() {
        View view = View.inflate(getActivity(), R.layout.frag_addsecurity, null);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void setListener() {
        tvSubmit.setOnClickListener(this);
        tvCancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_submit:
//                submitForm();
                //服务端不能新创建表格,暂时搁置
                ToastUtil.show(getActivity(),"可选年份表格已满", Toast.LENGTH_SHORT);
                getActivity().onBackPressed();
                break;
            case R.id.tv_cancel:
                getActivity().onBackPressed();
                break;
            default:
                break;
        }
    }

    private void submitForm() {
        //先看看都要提交什么数据
        model = SettingsModelFactory.getModel(SettingsModelFactory.SEC_ADD, getActivity(), this);
        /**
         * integrationRiskControl.id
         integrationRiskControl.level	0
         integrationRiskControl.pid	0
         integrationRiskControl.status	1
         integrationRiskControl.year	2016
         integrationRiskControl.name	2016安全计划表
         create_type	1
         copy_year	1267
         */
        String formName = edInputName.getText().toString().trim();
        String formYear = edPickYear.getText().toString().trim();

//        list.add(new BasicNameValuePair("integrationRiskControl.id","2544"));
        list.add(new BasicNameValuePair("integrationRiskControl.id", null));
        list.add(new BasicNameValuePair("integrationRiskControl.level", "0"));
        list.add(new BasicNameValuePair("integrationRiskControl.pid", "0"));
        list.add(new BasicNameValuePair("integrationRiskControl.status", "1"));
        list.add(new BasicNameValuePair("integrationRiskControl.year", formYear));
        list.add(new BasicNameValuePair("integrationRiskControl.name", formName));
        if (cbCopyCreate.isChecked()) {
            list.add(new BasicNameValuePair("create_type", "2"));
            list.add(new BasicNameValuePair("copy_year", "1267"));
        } else {
            list.add(new BasicNameValuePair("create_type", "1"));
            list.add(new BasicNameValuePair("copy_year", "1267"));
        }

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @Override
    public void onTaskPostExecute(int taskid, BaseResponesBean result) {

    }
}
