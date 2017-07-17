package com.xianzhi.integration.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.xianzhi.integration.R;
import com.xianzhi.integration.base.BaseActivity;

import butterknife.BindView;

/**
 * @Administrator LiBo.
 * @Date 2017/7/14.
 * @Function 起始界面
 */

public class StartActivity extends BaseActivity {

    @BindView(R.id.lin_cadre)
    LinearLayout lin_cadre;
    @BindView(R.id.lin_depart)
    LinearLayout lin_depart;
    @BindView(R.id.lin_assess_set)
    LinearLayout lin_set;

    @Override
    protected void onCreateView(Bundle saveInstanceState) {
        setContentView(R.layout.activity_start);
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void setListener() {
        lin_cadre.setOnClickListener(this);
        lin_set.setOnClickListener(this);
        lin_depart.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.lin_cadre:
                start_activity(CadreActivity.class);
                break;
            case R.id.lin_depart:

                break;
            case R.id.lin_assess_set:
                start_activity(SettingsActivity.class);
                break;
        }
    }
}
