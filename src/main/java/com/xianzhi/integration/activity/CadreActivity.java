package com.xianzhi.integration.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.handmark.pulltorefresh.library.PullToRefreshGridView;
import com.xianzhi.integration.R;
import com.xianzhi.integration.base.BaseActivity;

import butterknife.BindView;

/**
 * @Administrator LiBo.
 * @Date 2017/7/14.
 * @Function 干部一体化考核管理
 */

public class CadreActivity extends BaseActivity {

    @BindView(R.id.myAssess_list)
    PullToRefreshGridView myAssess_lis;
    @BindView(R.id.tv_assess_month)
    TextView tv_month;



    @Override
    protected void onCreateView(Bundle saveInstanceState) {
        setContentView(R.layout.activity_cadre);
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void setListener() {
        tv_month.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case 1:

                break;
            default:
                break;
        }
    }
}
