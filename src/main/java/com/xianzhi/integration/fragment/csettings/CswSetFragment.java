package com.xianzhi.integration.fragment.csettings;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.xianzhi.integration.R;
import com.xianzhi.integration.activity.settings.CswActivity;
import com.xianzhi.integration.bean.SetSelfWorkBean;
import com.xianzhi.integration.model.base.BaseResponesBean;
import com.xianzhi.integration.model.base.ModelCompleteCallback;
import com.xianzhi.integration.model.base.SettingsModelFactory;
import com.xianzhi.integration.tools.DateUtil;
import com.xianzhi.integration.tools.util.FastJsonUtil;
import com.xianzhi.integration.tools.util.StatusUtil;
import com.xianzhi.integration.view.YearMonthPickerDialog;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by TJTJL on 2017/8/3.
 */

public class CswSetFragment extends BaseFragment implements ModelCompleteCallback<BaseResponesBean> {

    private static final String TAG = "SFragHD";
    @BindView(R.id.tv_name)
    TextView tvName;
    @BindView(R.id.tv_jobname)
    TextView tvJobname;
    @BindView(R.id.tv_postName)
    TextView tvPostName;
    @BindView(R.id.ed_content)
    EditText edContent;
    @BindView(R.id.ed_standard)
    EditText edStandard;
    @BindView(R.id.tv_setMonth)
    TextView tvSetMonth;
    Unbinder unbinder;
    @BindView(R.id.tv_cancel)
    TextView tvCancel;
    @BindView(R.id.tv_save)
    TextView tvSave;

    private String id = "";
    private List<String> params = new ArrayList<>();
    private List<NameValuePair> form = new ArrayList<>();
    private SetSelfWorkBean setSelfWorkBean;
    private Calendar calendar;
    private String month = "";
    private String USER_ID, USER_NAME, USER_DEPT_ID, USER_DEPT_NAME,
            USER_DEPT_CODE, USER_DEPT_FULL_NAME, workStandards, workContent;

    @Override
    public void onStart() {
        super.onStart();
        CswActivity activity = (CswActivity) getActivity();
        activity.setTitleBtn(activity.CSW_SET_FRAG);
    }

    @Override
    protected void initData() {
        calendar = Calendar.getInstance();
        int year = calendar.get(calendar.YEAR);
        int month = calendar.get(calendar.MONTH) + 1;
        if (month < 10) {
            tvSetMonth.setText(year + "-0" + month);
        } else {
            tvSetMonth.setText(year + "-" + month);
        }

        CswActivity activity = (CswActivity) getActivity();
        id = activity.id;

        params.clear();
        params.add(id);

        model = SettingsModelFactory.getModelList(SettingsModelFactory.CSW_SET, getActivity(), this, params);
        model.excuteParams(new SetSelfWorkBean());
    }

    @Override
    public View initView() {
        progressDialog.show();
        View view = View.inflate(getActivity(), R.layout.frag_set_selfwork, null);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void setListener() {
        tvSetMonth.setOnClickListener(this);
        tvSave.setOnClickListener(this);
        tvCancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_setMonth:
                selectTime(v);
                break;
            case R.id.tv_save:
                updateData();
                break;
            case R.id.tv_cancel:
                ((CswActivity)getActivity()).setFragment(0);
                break;
        }
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
                case SettingsModelFactory.CSW_SET:
                    setSelfWorkBean = FastJsonUtil.getObject(result.getDataholder().toString(), SetSelfWorkBean.class);
                    if (setSelfWorkBean.getModel() != null) {
                        setData();
                    }else {
                        CswActivity activity = (CswActivity) getActivity();
                        tvName.setText(activity.name);
                        tvJobname.setText(activity.positionName);
                        tvPostName.setText(activity.postName);

                        edContent.setText("");
                        edStandard.setText("");
                    }
                    break;
                case SettingsModelFactory.CSW_SET_MONTH:
                    setSelfWorkBean = FastJsonUtil.getObject(result.getDataholder().toString(), SetSelfWorkBean.class);
                    if (setSelfWorkBean.getModel() != null) {
                        setData();
                    }else {
                        CswActivity activity = (CswActivity) getActivity();
                        tvName.setText(activity.name);
                        tvJobname.setText(activity.positionName);
                        tvPostName.setText(activity.postName);

                        edContent.setText("");
                        edStandard.setText("");
                    }
                    break;
                case SettingsModelFactory.CSW_SET_UPDATE:
                    setSelfWorkBean = FastJsonUtil.getObject(result.getDataholder().toString(), SetSelfWorkBean.class);
                    //返回到设置本职工作主界面
                    //((CswActivity)getActivity()).setFragment(0);
                    getActivity().finish();
                    break;
            }
        }
        if (progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
    }

    private void setData() {
        USER_ID = setSelfWorkBean.getModel().getUser_id() + "";
        USER_NAME = setSelfWorkBean.getModel().getUser_name() + "";
        USER_DEPT_ID = setSelfWorkBean.getModel().getUser_dept_id() + "";
        USER_DEPT_NAME = setSelfWorkBean.getModel().getUser_dept_name() + "";
        USER_DEPT_CODE = setSelfWorkBean.getModel().getUser_dept_code() + "";
        USER_DEPT_FULL_NAME = setSelfWorkBean.getModel().getUser_dept_full_name() + "";

        tvName.setText(setSelfWorkBean.getModel().getUser_name() + "");
        tvJobname.setText(setSelfWorkBean.getUser().getPosition_name() + "");
        tvPostName.setText(setSelfWorkBean.getUser().getPost_name() + "");
        edContent.setText(setSelfWorkBean.getModel().getBzgznr() + "");
        edStandard.setText(setSelfWorkBean.getModel().getBzgzbz() + "");
    }

    /***
     * 时间选择器
     */
    private void selectTime(final View v) {
        new YearMonthPickerDialog(getActivity(), AlertDialog.THEME_HOLO_LIGHT, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                calendar.set(Calendar.YEAR, year);
                calendar.set(Calendar.MONTH, monthOfYear);
                ((TextView) v).setText(DateUtil.clanderTodatetime(calendar, "yyyy-MM"));
                refreshData();
            }
        }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE)).show();
    }

    /**
     * 选择月份后刷新界面
     */
    private void refreshData() {
        month = tvSetMonth.getText().toString().trim();

        params.clear();
        params.add(id);
        params.add(month);

        model = SettingsModelFactory.getModelList(SettingsModelFactory.CSW_SET_MONTH, getActivity(), this, params);
        model.excuteParams(new SetSelfWorkBean());
    }

    /**
     * 保存本职工作设置
     */
    private void updateData() {
        month = tvSetMonth.getText().toString().trim();
        workContent = edContent.getText().toString().trim();
        workStandards = edStandard.getText().toString().trim();

        form.clear();

        form.add(new BasicNameValuePair("model.id", ""));
        form.add(new BasicNameValuePair("model.USER_ID", USER_ID));
        form.add(new BasicNameValuePair("model.USER_NAME", USER_NAME));
        form.add(new BasicNameValuePair("model.USER_DEPT_ID", USER_DEPT_ID));
        form.add(new BasicNameValuePair("model.USER_DEPT_NAME", USER_DEPT_NAME));
        form.add(new BasicNameValuePair("model.USER_DEPT_CODE", USER_DEPT_CODE));
        form.add(new BasicNameValuePair("model.USER_DEPT_FULL_NAME", USER_DEPT_FULL_NAME));
        form.add(new BasicNameValuePair("model.month", month));
        form.add(new BasicNameValuePair("model.BZGZNR", workContent));
        form.add(new BasicNameValuePair("model.BZGZBZ", workStandards));

        model = SettingsModelFactory.getModelList(SettingsModelFactory.CSW_SET_UPDATE, getActivity(), this, form);
        model.excuteParams(new SetSelfWorkBean());
    }

}
