package com.xianzhi.integration.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.xianzhi.integration.R;
import com.xianzhi.integration.base.BaseActivity;
import com.xianzhi.integration.fragment.AssessGrateTableFragment;
import com.xianzhi.integration.fragment.CadreCheckTableFragment;
import com.xianzhi.integration.fragment.CadreEditTableFragment;
import com.xianzhi.integration.fragment.MyAssessTableFragment;

/**
 * @Administrator LiBo.
 * @Date 2017/8/3.
 * @Function
 */

public class TableActivity extends BaseActivity{

    private String type;
    private String itemId;

    private AssessGrateTableFragment assessGrateTableFragment;
    private CadreCheckTableFragment cadreCheckTableFragment;
    private CadreEditTableFragment cadreEditTableFragment;
    private MyAssessTableFragment myAssessTableFragment;

    private FragmentManager manager;
    private FragmentTransaction transaction;

    @Override
    protected void onCreateView(Bundle saveInstanceState) {
        setContentView(R.layout.activity_table_layaout);
    }

    @Override
    protected void initView() {
        tv_title.setText("安全经营一体化考核评定表");

        manager = getSupportFragmentManager();
        transaction = manager.beginTransaction();

        type = getIntent().getStringExtra("type");
        itemId = getIntent().getStringExtra("itemId");
        if (type.equals("0")) {
            myAssessTableFragment = new MyAssessTableFragment(type, itemId);
            transaction.add(R.id.frag_content, myAssessTableFragment);
        } else if (type.equals("1")) {
            cadreCheckTableFragment = new CadreCheckTableFragment(type, itemId);
            transaction.add(R.id.frag_content, cadreCheckTableFragment);
        } else if (type.equals("2")) {
            cadreEditTableFragment = new CadreEditTableFragment(type, itemId);
            transaction.add(R.id.frag_content, cadreEditTableFragment);
        } else if (type.equals("3")) {
            cadreEditTableFragment = new CadreEditTableFragment(type, itemId);
            transaction.add(R.id.frag_content, cadreEditTableFragment);
        } else if(type.equals("4")) {
            assessGrateTableFragment = new AssessGrateTableFragment(type, itemId);
            transaction.add(R.id.frag_content, assessGrateTableFragment);
        }
        transaction.commit();
    }

    @Override
    protected void setListener() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.lin_back:
                finish();
                break;
        }
    }
}
