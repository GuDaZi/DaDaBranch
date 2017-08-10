package com.xianzhi.integration.activity;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.xianzhi.integration.R;
import com.xianzhi.integration.adapter.QuantizationInfoAdapter;
import com.xianzhi.integration.base.BaseActivity;
import com.xianzhi.integration.bean.QuantizationInfoBean;
import com.xianzhi.integration.model.base.BaseResponesBean;
import com.xianzhi.integration.model.base.ModelCompleteCallback;
import com.xianzhi.integration.model.base.ModelFactory;
import com.xianzhi.integration.tools.DateUtil;
import com.xianzhi.integration.tools.util.FastJsonUtil;
import com.xianzhi.integration.tools.util.StatusUtil;
import com.xianzhi.integration.view.YearMonthPickerDialog;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import butterknife.BindView;

/**
 * @Administrator LiBo.
 * @Date 2017/7/31.
 * @Function 量化查询汇总表一级详情
 */

public class QuantizationInfoActivity extends BaseActivity implements ModelCompleteCallback<BaseResponesBean> {

    @BindView(R.id.quantizationInfo_list)
    ListView quantizationInfo_list;
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

    private Calendar calendar;

    private QuantizationInfoAdapter adapter;
    private List<QuantizationInfoBean.ListBean> datas;
    private String itemId;

    @Override
    protected void onCreateView(Bundle saveInstanceState) {
        setContentView(R.layout.activity_quantization_info);
    }

    @Override
    protected void initView() {
        itemId = getIntent().getStringExtra("itemId");
        tv_title.setText("量化查询汇总表");

        calendar = Calendar.getInstance();
        int year = calendar.get(calendar.YEAR);
        int month = calendar.get(calendar.MONTH) + 1;
        if (month < 10) {
            tv_month.setText(year + "-0" + month);
        } else {
            tv_month.setText(year + "-" + month);
        }

        datas = new ArrayList<>();
        adapter = new QuantizationInfoAdapter(context, datas);
        quantizationInfo_list.setAdapter(adapter);

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
            case R.id.iv_up_info:
                lin_secondTitle.setVisibility(View.GONE);
                break;
            case R.id.iv_down_info:
                lin_secondTitle.setVisibility(View.VISIBLE);
                break;
            case R.id.tv_personal_dete:
                selectTime();
                break;
        }
    }

    private void getDatas() {
        progressDialog.show();
        model = ModelFactory.getModel(ModelFactory.QUANTIZATIONINFO, this, this);
        model.excuteParams(new QuantizationInfoBean(itemId));
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
            QuantizationInfoBean infoBean = FastJsonUtil.getObject(result.getDataholder().toString(), QuantizationInfoBean.class);
            tv_depart.setText(infoBean.getUser().getDept_name());
            tv_jobName.setText(infoBean.getUser().getPosition_name());
            tv_post.setText(infoBean.getUser().getPost_name());
            tv_month.setText(infoBean.getMonth());
            tv_personal.setText(infoBean.getUser().getName());
            tv_userName.setText(infoBean.getUser().getName());
            adapter.addDatas(infoBean.getList());
            adapter.notifyDataSetChanged();
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
}
