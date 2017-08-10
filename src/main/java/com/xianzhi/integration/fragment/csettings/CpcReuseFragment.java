package com.xianzhi.integration.fragment.csettings;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import com.xianzhi.integration.R;
import com.xianzhi.integration.activity.settings.CpcActivity;
import com.xianzhi.integration.bean.CpcBean;
import com.xianzhi.integration.bean.CpcDynamicBean;
import com.xianzhi.integration.bean.CpcReuseBean;
import com.xianzhi.integration.bean.DepartBean;
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
 * Created by TJTJL on 2017/7/24.
 */

public class CpcReuseFragment extends BaseFragment implements ModelCompleteCallback<BaseResponesBean> {

    private static final String TAG = "SFragHD";
    @BindView(R.id.tv_submit)
    TextView tvSubmit;
    @BindView(R.id.tv_cancel)
    TextView tvCancel;
    Unbinder unbinder;
    @BindView(R.id.tv_copyMonth)
    TextView tvCopyMonth;
    @BindView(R.id.tv_setMonth)
    TextView tvSetMonth;
    private Calendar calendar;
    private CpcBean cpcBean;
    private List<NameValuePair> form = new ArrayList<>();

    @Override
    public void onStart() {
        super.onStart();
        CpcActivity activity = (CpcActivity) getActivity();
        activity.setTitleBtn(activity.CPC_REUSE_FRAG);
    }

    @Override
    protected void initData() {
        calendar = Calendar.getInstance();
        int year = calendar.get(calendar.YEAR);
        int month = calendar.get(calendar.MONTH) + 1;
        Log.e(TAG, "date: " + year);
        Log.e(TAG, "date: " + month);
        if (month < 10) {
            tvCopyMonth.setText(year + "-0" + month);
            tvSetMonth.setText(year + "-0" + month);
        } else {
            tvCopyMonth.setText(year + "-" + month);
            tvSetMonth.setText(year + "-" + month);
        }
    }

    @Override
    public View initView() {
        View view = View.inflate(getActivity(), R.layout.frag_reuseinfo, null);
        unbinder = ButterKnife.bind(this, view);

        return view;
    }

    @Override
    public void setListener() {
        tvCopyMonth.setOnClickListener(this);
        tvSetMonth.setOnClickListener(this);
        tvSubmit.setOnClickListener(this);
        tvCancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        CpcActivity activity = (CpcActivity) getActivity();
        switch (v.getId()) {
            case R.id.tv_copyMonth:
                selectTime(v);
                break;
            case R.id.tv_setMonth:
                selectTime(v);
                break;
            case R.id.tv_submit:
                postData();
                break;
            case R.id.tv_cancel:
                activity.onBackPressed();
                break;
        }
    }

    private void postData() {
        /**
         * dept_code	0001000900220008
            lastMonth	2017-07
            nowMonth	2017-08
         */
        String dept_code = "0001000900220008";
        String lastMonth = tvCopyMonth.getText().toString().trim();
        String nowMonth = tvSetMonth.getText().toString().trim();

        form.clear();
        form.add(new BasicNameValuePair("dept_code",dept_code));
        form.add(new BasicNameValuePair("lastMonth",lastMonth));
        form.add(new BasicNameValuePair("nowMonth",nowMonth));

        model = SettingsModelFactory.getModelList(SettingsModelFactory.CPC_REUSE, getActivity(), this, form);
        model.excuteParams(new CpcReuseBean());
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
            }
        }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE)).show();
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
                case SettingsModelFactory.CPC_REUSE:
                    Log.e(TAG, "复用考核信息成功: " );
                    getActivity().onBackPressed();
                    break;
            }
        }
        if (progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
    }
}
