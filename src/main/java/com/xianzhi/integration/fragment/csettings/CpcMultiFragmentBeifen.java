package com.xianzhi.integration.fragment.csettings;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.DatePicker;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.xianzhi.integration.R;
import com.xianzhi.integration.activity.settings.CpcActivity;
import com.xianzhi.integration.adapter.settings.CpcMultiAdapter;
import com.xianzhi.integration.bean.CpcMultiBean;
import com.xianzhi.integration.model.base.BaseResponesBean;
import com.xianzhi.integration.model.base.ModelCompleteCallback;
import com.xianzhi.integration.model.base.SettingsModelFactory;
import com.xianzhi.integration.tools.DateUtil;
import com.xianzhi.integration.tools.util.FastJsonUtil;
import com.xianzhi.integration.tools.util.StatusUtil;
import com.xianzhi.integration.view.YearMonthPickerDialog;

import java.util.Calendar;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by TJTJL on 2017/7/24.
 * 干部月度预考核-->批量设置任务模块
 */

public class CpcMultiFragmentBeifen extends BaseFragment implements ModelCompleteCallback<BaseResponesBean> {
    @BindView(R.id.iv_filter)
    ImageView ivFilter;
    @BindView(R.id.rl_switch)
    RelativeLayout rlSwitch;
    @BindView(R.id.fl_switch)
    FrameLayout flSwitch;
    @BindView(R.id.tv_setMonth)
    TextView tvMonth;
    @BindView(R.id.tv_depart)
    TextView tvDepart;
//    @BindView(R.id.tv_postName)
//    TextView tvPostName;
//    @BindView(R.id.tv_positionName)
//    TextView tvPositionName;
    @BindView(R.id.tv_postName)
    Spinner tvPostName;
    @BindView(R.id.tv_positionName)
    Spinner tvPositionName;
    @BindView(R.id.tv_search)
    TextView tvSearch;
    @BindView(R.id.ll_filter)
    LinearLayout llFilter;
    @BindView(R.id.multi_listView)
    ListView listView;
    Unbinder unbinder;
    private CpcMultiAdapter adapter;
    private CpcMultiBean cpcMultiBean;
    private Calendar calendar;
    //判断筛选是否展开
    private boolean isShow = false;

    @Override
    public void onStart() {
        super.onStart();
        CpcActivity activity = (CpcActivity) getActivity();
        activity.setTitleBtn(activity.CPC_MULTI_FRAG);
    }

    @Override
    public View initView() {
        progressDialog.show();
        View view = View.inflate(getActivity(), R.layout.frag_cpc_multi, null);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    protected void initData() {
        calendar = Calendar.getInstance();
        int year = calendar.get(calendar.YEAR);
        int month = calendar.get(calendar.MONTH) + 1;
        if (month < 10) {
            tvMonth.setText(year + "-0" + month);
        } else {
            tvMonth.setText(year + "-" + month);
        }

        adapter = new CpcMultiAdapter(getActivity());
        View footerView = LayoutInflater.from(getActivity()).inflate(R.layout.footer_cpc_set, null, false);
        listView.addFooterView(footerView);
        listView.setDivider(null);
        listView.setSelector(new ColorDrawable());
        listView.setAdapter(adapter);
        model = SettingsModelFactory.getModel(SettingsModelFactory.CPC_MULTISET, getActivity(), this);
        model.excuteParams(new CpcMultiBean());
    }


    @Override
    public void setListener() {
        flSwitch.setOnClickListener(this);
        tvMonth.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_setMonth:
                selectTime();
                break;
            case R.id.fl_switch:
                if (isShow == false) {
                    llFilter.setVisibility(View.VISIBLE);
                    isShow = true;
                } else {
                    llFilter.setVisibility(View.GONE);
                    isShow = false;
                }
                break;
            case R.id.tv_search:
                RefreshData();
                break;
        }
    }

    /**
     * 根据筛选刷新页面数据
     */
    private void RefreshData() {

    }

    /***
     * 时间选择器
     */
    private void selectTime() {
        new YearMonthPickerDialog(getActivity(), AlertDialog.THEME_HOLO_LIGHT, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                calendar.set(Calendar.YEAR, year);
                calendar.set(Calendar.MONTH, monthOfYear);
                tvMonth.setText(DateUtil.clanderTodatetime(calendar, "yyyy-MM"));
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
                case SettingsModelFactory.CPC_MULTISET:
                    cpcMultiBean = FastJsonUtil.getObject(result.getDataholder().toString(), CpcMultiBean.class);
                    adapter.addData(cpcMultiBean.getList());

                    break;
            }
        }
        if (progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
    }

}
