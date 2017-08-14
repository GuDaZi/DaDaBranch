package com.xianzhi.integration.fragment.csettings;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.DatePicker;
import android.widget.ListView;
import android.widget.TextView;

import com.xianzhi.integration.R;
import com.xianzhi.integration.activity.settings.CpcActivity;
import com.xianzhi.integration.adapter.settings.CpcDetailAdapter;
import com.xianzhi.integration.bean.CpcDetailBean;
import com.xianzhi.integration.model.base.BaseResponesBean;
import com.xianzhi.integration.model.base.ModelCompleteCallback;
import com.xianzhi.integration.model.base.SettingsModelFactory;
import com.xianzhi.integration.tools.DateUtil;
import com.xianzhi.integration.tools.util.FastJsonUtil;
import com.xianzhi.integration.tools.util.StatusUtil;
import com.xianzhi.integration.view.YearMonthPickerDialog;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by TJTJL on 2017/7/24.
 */

public class CpcDetailFragment extends BaseFragment implements ModelCompleteCallback<BaseResponesBean> {

    private static final String TAG = "SFragHD";
    @BindView(R.id.tv_setMonth)
    TextView tvSetMonth;
    @BindView(R.id.tv_name)
    TextView tvName;
    @BindView(R.id.tv_jobname)
    TextView tvJobname;
    @BindView(R.id.tv_postName)
    TextView tvPostName;
    Unbinder unbinder;

    private List<String> params = new ArrayList<>();
    private CpcDetailAdapter adapter;
    private CpcDetailBean cpcDetailBean;
    private Calendar calendar;
    private ListView listview;
    private TextView tvReturn;

    @Override
    public void onStart() {
        super.onStart();
        CpcActivity activity = (CpcActivity) getActivity();
        activity.setTitleBtn(activity.CPC_DETAIL_FRAG);
    }

    @Override
    public View initView() {
        progressDialog.show();
        View view = View.inflate(getActivity(), R.layout.frag_cpc_detail, null);

        listview = (ListView) view.findViewById(R.id.listview);
        return view;
    }

    @Override
    protected void initData() {

        View headerView = LayoutInflater.from(getActivity()).inflate(R.layout.header_cpc_detail, null, false);
        unbinder = ButterKnife.bind(this, headerView);
        View footerView = LayoutInflater.from(getActivity()).inflate(R.layout.footer_cpc_detail, null, false);
        tvReturn = (TextView)footerView.findViewById(R.id.tv_return);

        listview.setDivider(null);
        listview.setSelector(new ColorDrawable());

        listview.addHeaderView(headerView);
        listview.addFooterView(footerView);

        adapter = new CpcDetailAdapter(getActivity());
        listview.setAdapter(adapter);

        calendar = Calendar.getInstance();
        int year = calendar.get(calendar.YEAR);
        int month = calendar.get(calendar.MONTH) + 1;
        Log.e(TAG, "date: " + year);
        Log.e(TAG, "date: " + month);
        if (month < 10) {
            tvSetMonth.setText(year + "-0" + month);
        } else {
            tvSetMonth.setText(year + "-" + month);
        }

        //为网络请求添加参数
        CpcActivity activity = (CpcActivity) getActivity();

        Log.e(TAG, "activity.id: " + activity.id);
        params.clear();
        params.add(activity.id);

        model = SettingsModelFactory.getModelList(SettingsModelFactory.CPC_DETAIL, getActivity(), this, params);
        model.excuteParams(new CpcDetailBean());
    }

    @Override
    public void setListener() {
        tvSetMonth.setOnClickListener(this);
        tvReturn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_setMonth:
                selectTime(v);
                break;
            case R.id.tv_return:
                getActivity().onBackPressed();
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
                case SettingsModelFactory.CPC_DETAIL:

                    Log.e(TAG, "taskid不对??");
                    cpcDetailBean = FastJsonUtil.getObject(result.getDataholder().toString(), CpcDetailBean.class);

                    CpcActivity activity = (CpcActivity) getActivity();
                    tvName.setText(activity.name);
                    tvJobname.setText(activity.positionName);
                    tvPostName.setText(activity.postName);

                    adapter.addData(cpcDetailBean.getList());
                    break;
                //下面的暂时搁置
//                case SettingsModelFactory.SETSELFWORKMONTH:
//                    cpcDetailBean = FastJsonUtil.getObject(result.getDataholder().toString(), SetSelfWorkBean.class);
//                    if (cpcDetailBean.getModel() != null) {
//                        setData();
//                    } else {
//                        CswActivity activity = (CswActivity) getActivity();
//                        tvName.setText(activity.name);
//                        tvJobname.setText(activity.positionName);
//                        tvPostName.setText(activity.postName);
//
//                    }
//                    break;
            }
        }
        if (progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
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
     * 选择月份后刷新界面,Web端口未更新
     */
    private void refreshData() {
//        Log.e(TAG, "refreshData: timing");
//        month = tvSetMonth.getText().toString().trim();
//
//        params.clear();
//        params.add(month);
//
//        model = SettingsModelFactory.getModelList(SettingsModelFactory.CSW_SET_MONTH, getActivity(), this, params);
//        model.excuteParams(new SetSelfWorkBean());
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
