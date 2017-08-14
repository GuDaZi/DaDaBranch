package com.xianzhi.integration.fragment.csettings;

import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.xianzhi.integration.R;
import com.xianzhi.integration.activity.settings.SecActivity;
import com.xianzhi.integration.adapter.settings.SecAddYearAdapter;
import com.xianzhi.integration.bean.CpcReuseBean;
import com.xianzhi.integration.bean.SecReuseBean;
import com.xianzhi.integration.bean.SecurityRisksBean;
import com.xianzhi.integration.model.base.BaseResponesBean;
import com.xianzhi.integration.model.base.ModelCompleteCallback;
import com.xianzhi.integration.model.base.SettingsModelFactory;
import com.xianzhi.integration.tools.util.FastJsonUtil;
import com.xianzhi.integration.tools.util.StatusUtil;
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
    @BindView(R.id.sp_order)
    Spinner edOrder;
    @BindView(R.id.ll_pickCopyYear)
    LinearLayout llPickCopyYear;
    @BindView(R.id.tv_submit)
    TextView tvSubmit;
    @BindView(R.id.tv_cancel)
    TextView tvCancel;
    Unbinder unbinder;

    private List<NameValuePair> form = new ArrayList<>();
    private List<SecReuseBean.YearListBean> data = new ArrayList<>();
    private List<String> year = new ArrayList<>();
    private SecReuseBean secReuseBean;
    private SecAddYearAdapter adapter;

    @Override
    public void onStart() {
        super.onStart();
        SecActivity activity = (SecActivity) getActivity();
        activity.setTitleBtn(activity.SEC_ADD_FRAG);
    }

    @Override
    protected void initData() {
        year.add("2017");
        adapter = new SecAddYearAdapter(getActivity());
        adapter.addData(year);
        edOrder.setAdapter(adapter);

        model = SettingsModelFactory.getModel(SettingsModelFactory.SEC_ADD_YEAR, getActivity(), this);
        model.excuteParams(new SecReuseBean());
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
        cbCopyCreate.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true) {
                    llPickCopyYear.setVisibility(View.VISIBLE);
                } else {
                    llPickCopyYear.setVisibility(View.GONE);
                }
            }
        });
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
        }
    }

    private void submitForm() {
        progressDialog.show();
        if (cbCopyCreate.isChecked() || cbReCreate.isChecked()) {
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

            form.clear();
            form.add(new BasicNameValuePair("integrationRiskControl.id", null));
            form.add(new BasicNameValuePair("integrationRiskControl.level", "0"));
            form.add(new BasicNameValuePair("integrationRiskControl.pid", "0"));
            form.add(new BasicNameValuePair("integrationRiskControl.status", "1"));
            form.add(new BasicNameValuePair("integrationRiskControl.year", formYear));
            form.add(new BasicNameValuePair("integrationRiskControl.name", formName));

            if (cbCopyCreate.isChecked()) {
                form.add(new BasicNameValuePair("create_type", "2"));
                form.add(new BasicNameValuePair("copy_year", "1267"));
            } else {
                form.add(new BasicNameValuePair("create_type", "1"));
                form.add(new BasicNameValuePair("copy_year", "1267"));
            }

            //先看看都要提交什么数据
            model = SettingsModelFactory.getModel(SettingsModelFactory.SEC_ADD, getActivity(), this);

        } else {
            ToastUtil.show(getActivity(),"必须选择创建方式",Toast.LENGTH_SHORT);
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @Override
    public void onTaskPostExecute(int taskid, BaseResponesBean result) {
        if (result == null) {
            return;
        }
        if (result.getStatus() != StatusUtil.STATUS_OK) {
            return;
        }
        if (result.getInterface_status() == StatusUtil.INTERFACE_OK) {
            switch (taskid) {
                case SettingsModelFactory.SEC_ADD_YEAR:
                    secReuseBean = FastJsonUtil.getObject(result.getDataholder().toString(), SecReuseBean.class);
                    data = secReuseBean.getYearList();
                    year.clear();
                    for (SecReuseBean.YearListBean yearListBean : data) {
                        year.add(yearListBean.getCode());
                    }
                    adapter.addData(year);
                    break;
            }
        }
        if (progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
    }

}
