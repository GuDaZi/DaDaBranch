package com.xianzhi.integration.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.xianzhi.integration.R;
import com.xianzhi.integration.activity.settings.SettingsActivity;
import com.xianzhi.integration.base.BaseActivity;
import com.xianzhi.integration.bean.PermissionBean;
import com.xianzhi.integration.bean.UserInfoBean;

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

    private String userInfo;
    private String permission;

    private UserInfoBean userInfoBean;
    private PermissionBean permissionBean;

    @Override
    protected void onCreateView(Bundle saveInstanceState) {
        setContentView(R.layout.activity_start);
    }

    @Override
    protected void initView() {
//        BaseApplication.token = getIntent().getStringExtra("token");
//        BaseApplication.url = getIntent().getStringExtra("webUrl");
//        userInfo = getIntent().getStringExtra("authorizedUser");
//        permission = getIntent().getStringExtra("permission");
//
//        userInfoBean = FastJsonUtil.getObject(userInfo, UserInfoBean.class);
//        permissionBean = FastJsonUtil.getObject(userInfo, PermissionBean.class);

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
                start_activity(MainActivity.class);
//                start_activity(MainActivity.class, "permission", JSON.toJSONString(permission));
                break;
            case R.id.lin_depart:

                break;
            case R.id.lin_assess_set:
                start_activity(SettingsActivity.class);
                break;
        }
    }
}
