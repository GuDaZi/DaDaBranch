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

public class SettingsActivity extends BaseActivity {

    @BindView(R.id.lin_back)
    LinearLayout linBack;
    @BindView(R.id.ll_cadre)
    LinearLayout llCadre;
    @BindView(R.id.ll_department)
    LinearLayout llDepartment;
    @BindView(R.id.ll_duration)
    LinearLayout llDuration;
    @BindView(R.id.tv_title)
    TextView tvTitle;


    @Override
    protected void onCreateView(Bundle saveInstanceState) {
        setContentView(R.layout.act_yth_settings);
        ButterKnife.bind(this);
    }

    @Override
    protected void initView() {
        tvTitle.setText("一体化考核设置");
    }

    @Override
    protected void setListener() {
        llCadre.setOnClickListener(this);
        llDepartment.setOnClickListener(this);
        llDuration.setOnClickListener(this);
        linBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ll_cadre:
                start_activity(CadreSettingsActivity.class);
                break;
            case R.id.ll_department:
                break;
            case R.id.ll_duration:
                break;
            case R.id.lin_back:
                onBackPressed();
                break;
        }
    }

}
