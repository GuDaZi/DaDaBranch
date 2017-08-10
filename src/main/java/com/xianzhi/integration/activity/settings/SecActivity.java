package com.xianzhi.integration.activity.settings;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.xianzhi.integration.R;
import com.xianzhi.integration.base.BaseActivity;
import com.xianzhi.integration.fragment.csettings.SecAddFragment;
import com.xianzhi.integration.fragment.csettings.BaseFragment;
import com.xianzhi.integration.fragment.csettings.SecDetailFragment;
import com.xianzhi.integration.fragment.csettings.SecEditFragment;
import com.xianzhi.integration.fragment.csettings.SecFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by TJTJL on 2017/7/20.
 */

public class SecActivity extends BaseActivity {

    private static final String TAG = "SFragHD";
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.tv_edit)
    TextView tvEdit;
    @BindView(R.id.lin_back)
    LinearLayout linBack;

    private List<BaseFragment> list;
    public String year, code, id, pid;
    public static final int SEC_FRAG = 0;
    public static final int SEC_ADD_FRAG = 1;
    public static final int SEC_DETAIL_FRAG = 2;
    public static final int SEC_EDIT_FRAG = 3;

    @Override
    protected void onCreateView(Bundle saveInstanceState) {
        setContentView(R.layout.act_cadre_securityrisks);
        ButterKnife.bind(this);
    }

    @Override
    protected void initView() {
        initFragment();
        changeFragment(SEC_FRAG);
    }

    private void initFragment() {
        list = new ArrayList<>();
        list.add(new SecFragment());
        list.add(new SecAddFragment());
        list.add(new SecDetailFragment());
        list.add(new SecEditFragment());
    }

    private void changeFragment(int i) {
        Fragment fragment = list.get(i);
        FragmentManager fragmentManager = getSupportFragmentManager();
        if (i == SEC_FRAG) {
            fragmentManager.beginTransaction()
                    .replace(R.id.fl_securityrisks, fragment)
                    .commit();
        } else {
            fragmentManager.beginTransaction()
                    .replace(R.id.fl_securityrisks, fragment)
                    .addToBackStack(null)
                    .commit();
        }
        currentFrag = i;
    }

    public void setFragment(int i) {
        switch (i) {
            case SEC_DETAIL_FRAG:
                changeFragment(SEC_DETAIL_FRAG);
                break;
            case SEC_EDIT_FRAG:
                changeFragment(SEC_EDIT_FRAG);
                break;
        }
    }

    @Override
    protected void setListener() {
        tvEdit.setOnClickListener(this);
        linBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.lin_right:
                if (currentFrag == SEC_FRAG) {
                    changeFragment(SEC_ADD_FRAG);
                } else if (currentFrag == SEC_EDIT_FRAG) {
                    SecEditFragment ft = (SecEditFragment) getSupportFragmentManager().findFragmentById(R.id.fl_securityrisks);
                    ft.addItem();
                }
                break;
            case R.id.lin_back:
                //虚拟返回键
                onBackPressed();
                break;
        }
    }

    public int currentFrag = 0;
    /**
     * 根据不同的Fragment切换标题栏右侧的显示效果
     */
    public void setTitleBtn(int i){
        if (i == SEC_FRAG) {
            tvTitle.setText("安全风险控制表");
            tvEdit.setVisibility(View.VISIBLE);
            tvEdit.setText("添加");
        } else if(i == SEC_EDIT_FRAG) {
            tvTitle.setText("表格维护");
            tvEdit.setVisibility(View.VISIBLE);
            tvEdit.setText("新增");
        } else if (currentFrag == SEC_ADD_FRAG) {
            tvTitle.setText("增加表格");
            tvEdit.setVisibility(View.GONE);
        } else if (currentFrag == SEC_DETAIL_FRAG) {
            tvTitle.setText("表格详情");
            tvEdit.setVisibility(View.GONE);
        }
        currentFrag = i;
    }

}
