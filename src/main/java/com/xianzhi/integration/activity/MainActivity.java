package com.xianzhi.integration.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.xianzhi.integration.R;
import com.xianzhi.integration.base.BaseActivity;
import com.xianzhi.integration.bean.PermissionBean;

import butterknife.BindView;

/**
 * @Administrator LiBo.
 * @Date 2017/7/20.
 * @Function 二级菜单
 */

public class MainActivity extends BaseActivity {

    @BindView(R.id.self_assess)
    LinearLayout self_assess;
    @BindView(R.id.self_evaluate)
    LinearLayout self_evaluate;
    @BindView(R.id.self_early_warning)
    LinearLayout self_early_warning;
    @BindView(R.id.cadre_assess_approve)
    LinearLayout cadre_assess_approve;
    @BindView(R.id.integrated_search)
    LinearLayout integrated_search;
    @BindView(R.id.cadre_assess_gather)
    LinearLayout cadre_assess_gather;
    @BindView(R.id.cadre_score_search)
    LinearLayout cadre_score_search;
    @BindView(R.id.cadre_risk_search)
    LinearLayout cadre_risk_search;

    private String permission;
    private PermissionBean permissionBean;

    @Override
    protected void onCreateView(Bundle saveInstanceState) {
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void initView() {
//        permission = getIntent().getStringExtra("permission");
//        permissionBean = FastJsonUtil.getObject(userInfo, PermissionBean.class);
    }

    @Override
    protected void setListener() {
        self_assess.setOnClickListener(this);
        self_evaluate.setOnClickListener(this);
        self_early_warning.setOnClickListener(this);
        cadre_assess_approve.setOnClickListener(this);
        integrated_search.setOnClickListener(this);
        cadre_assess_gather.setOnClickListener(this);
        cadre_score_search.setOnClickListener(this);
        cadre_risk_search.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.self_assess:
                start_activity(MyAssessActivity.class);
                break;
            case R.id.self_evaluate:
                start_activity(SelfEvaluateActivity.class);
                break;
            case R.id.cadre_assess_approve:
                start_activity(CadreAssessActivity.class);
                break;
            case R.id.integrated_search:
                start_activity(QuantizationActivity.class);
                break;
            case R.id.self_early_warning:
                start_activity(WarningListActivity.class);
                break;
            case R.id.cadre_assess_gather:
                start_activity(AssessCollectActivity.class);
                break;
            case R.id.cadre_score_search:
                start_activity(AssessScoreActivity.class);
                break;
            case R.id.cadre_risk_search:
                start_activity(RiskControllerTableActivity.class);
                break;
            case R.id.lin_back:
                finish();
                break;
        }
    }
}
