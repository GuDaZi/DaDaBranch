package com.xianzhi.integration.activity.settings;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.xianzhi.integration.R;
import com.xianzhi.integration.base.BaseActivity;
import com.xianzhi.integration.fragment.csettings.BaseFragment;
import com.xianzhi.integration.fragment.csettings.CswFragment;
import com.xianzhi.integration.fragment.csettings.CswSetFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by TJTJL on 2017/7/20.
 */

public class CswActivity extends BaseActivity {

    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.lin_back)
    LinearLayout linBack;
    @BindView(R.id.tv_edit)
    TextView tvEdit;
    @BindView(R.id.iv_soso)
    ImageView ivSoso;

    private List<BaseFragment> list;
    public static final int CSW_FRAG = 0;
    public static final int CSW_SET_FRAG = 1;
    public String id = "";
    public String postName = "";
    public String positionName = "";
    public String name = "";

    @Override
    protected void onCreateView(Bundle saveInstanceState) {
        setContentView(R.layout.act_cadre_selfwork);
        ButterKnife.bind(this);
    }

    /**
     * 初始化数据
     */
    private void initData() {
    }

    @Override
    protected void initView() {
        initFragment();
        changeFragment(CSW_FRAG);
    }

    private void initFragment() {
        list = new ArrayList<>();
        list.add(new CswFragment());
        list.add(new CswSetFragment());
    }

    private void changeFragment(int i) {
        Fragment fragment = list.get(i);
        FragmentManager fragmentManager = getSupportFragmentManager();
        if (i == CSW_FRAG) {
            fragmentManager.beginTransaction()
                    .replace(R.id.fl_cadreSelf, fragment)
                    //模拟返回栈
                    .commit();
        } else {
            fragmentManager.beginTransaction()
                    .replace(R.id.fl_cadreSelf, fragment)
                    //模拟返回栈
                    .addToBackStack(null)
                    .commit();
        }
    }

    public void setFragment(int i) {
        switch (i) {
            case CSW_FRAG:
                changeFragment(CSW_FRAG);
                break;
            case CSW_SET_FRAG:
                changeFragment(CSW_SET_FRAG);
                break;
        }
    }

    @Override
    protected void setListener() {
        linBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.lin_back:
                onBackPressed();
                break;
        }
    }

    public int currentFrag = 0;

    /**
     * 根据不同的Fragment切换标题栏右侧的显示效果
     */
    public void setTitleBtn(int i) {
        if (i == CSW_FRAG) {
            tvTitle.setText("本职工作设置表");
            tvEdit.setVisibility(View.GONE);
        }else if(i == CSW_SET_FRAG) {
            tvTitle.setText("工作设置");
            tvEdit.setVisibility(View.GONE);
        }
        currentFrag = i;
    }
}
