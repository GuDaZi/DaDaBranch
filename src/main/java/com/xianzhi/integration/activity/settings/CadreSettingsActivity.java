package com.xianzhi.integration.activity.settings;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.xianzhi.integration.R;
import com.xianzhi.integration.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by 何达 on 2017/7/14.
 * 一体化考核设置主界面
 */

public class CadreSettingsActivity extends BaseActivity {

    private static final String TAG = "HedaAct";
    @BindView(R.id.ll_security)
    LinearLayout llSecurity;
    @BindView(R.id.ll_monthcheck)
    LinearLayout llMonthcheck;
    @BindView(R.id.ll_selfwork)
    LinearLayout llSelfwork;
    @BindView(R.id.lin_back)
    LinearLayout linBack;
    @BindView(R.id.tv_title)
    TextView tvTitle;

    @Override
    protected void onCreateView(Bundle saveInstanceState) {
        setContentView(R.layout.act_cadre_settings);
        ButterKnife.bind(this);
    }

    @Override
    protected void initView() {
        tvTitle.setText("一体化考核设置");
    }

    @Override
    protected void setListener() {
        llSecurity.setOnClickListener(this);
        llMonthcheck.setOnClickListener(this);
        llSelfwork.setOnClickListener(this);
        linBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ll_security:
                start_activity(SecActivity.class);
                break;
            case R.id.ll_monthcheck:
                start_activity(CpcActivity.class);
                break;
            case R.id.ll_selfwork:
                start_activity(CswActivity.class);
                break;
            case R.id.lin_back:
                finish();
                break;
        }
    }

}
