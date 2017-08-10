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
import com.xianzhi.integration.fragment.csettings.CpcDetailFragment;
import com.xianzhi.integration.fragment.csettings.CpcDynamicFragment;
import com.xianzhi.integration.fragment.csettings.CpcFragment;
import com.xianzhi.integration.fragment.csettings.CpcMultiFragment;
import com.xianzhi.integration.fragment.csettings.CpcReuseFragment;
import com.xianzhi.integration.fragment.csettings.CpcSetFragment;
import com.xianzhi.integration.view.CadrePreCheckPopup;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by TJTJL on 2017/7/20.
 * 这个没做完呢
 */

public class CpcActivity extends BaseActivity {

    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.iv_soso)
    ImageView ivSoso;
    @BindView(R.id.lin_right)
    LinearLayout linRight;
    @BindView(R.id.lin_back)
    LinearLayout linBack;
    @BindView(R.id.tv_edit)
    TextView tvEdit;

    private CadrePreCheckPopup popup;
    private List<BaseFragment> list;
    public static final int CPC_FRAG = 0;
    public static final int CPC_REUSE_FRAG = 1;
    public static final int CPC_MULTI_FRAG = 2;
    public static final int CPC_DYNAMIC_FRAG = 3;
    public static final int CPC_DETAIL_FRAG = 4;
    public static final int CPC_SET_FRAG = 5;
    public String id, name, positionName, postName;

    @Override
    protected void onCreateView(Bundle saveInstanceState) {
        setContentView(R.layout.act_cadre_precheck);
        ButterKnife.bind(this);
    }

    @Override
    protected void initView() {
        initFragment();
        changeFragment(CPC_FRAG);
    }

    private void initFragment() {
        list = new ArrayList<>();
        list.add(new CpcFragment());
        list.add(new CpcReuseFragment());
        list.add(new CpcMultiFragment());
        list.add(new CpcDynamicFragment());
        list.add(new CpcDetailFragment());
        list.add(new CpcSetFragment());
    }

    private void changeFragment(int i) {
        Fragment fragment = list.get(i);
        FragmentManager fragmentManager = getSupportFragmentManager();
            if (i == CPC_FRAG) {
                fragmentManager.beginTransaction()
                        .replace(R.id.fl_cadrePre, fragment)
                        .commit();
            } else {
                fragmentManager.beginTransaction()
                        .replace(R.id.fl_cadrePre, fragment)
                        .addToBackStack(null)
                        .commit();
        }
    }

    public void setFragment(int i) {
        switch (i) {
            case CPC_FRAG:
                changeFragment(CPC_FRAG);
                break;
            case CPC_REUSE_FRAG:
                changeFragment(CPC_REUSE_FRAG);
                break;
            case CPC_MULTI_FRAG:
                changeFragment(CPC_MULTI_FRAG);
                break;
            case CPC_DYNAMIC_FRAG:
                changeFragment(CPC_DYNAMIC_FRAG);
                break;
            case CPC_DETAIL_FRAG:
                changeFragment(CPC_DETAIL_FRAG);
                break;
            case CPC_SET_FRAG:
                changeFragment(CPC_SET_FRAG);
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
            case R.id.lin_right:
                if (currentFrag == CPC_FRAG) {
                    popup.showAsDropDown(iv_soso, 0, 0);
                }else if(currentFrag == CPC_MULTI_FRAG) {
                    CpcMultiFragment fragment = (CpcMultiFragment) getSupportFragmentManager().findFragmentById(R.id.fl_cadrePre);
                    fragment.addDynamicItem();
                }else if(currentFrag == CPC_SET_FRAG) {
                    CpcSetFragment fragment = (CpcSetFragment) getSupportFragmentManager().findFragmentById(R.id.fl_cadrePre);
                    fragment.addDynamicItem();
                }
                break;
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
        if (i == CPC_FRAG) {
            tvTitle.setText("月度预考核表");
            ivSoso.setImageResource(R.mipmap.btn_more);
            ivSoso.setVisibility(View.VISIBLE);
            popup = new CadrePreCheckPopup(this);
            tvEdit.setVisibility(View.GONE);
        } else if (i == CPC_SET_FRAG) {
            tvTitle.setText("考核设置");
            tvEdit.setVisibility(View.VISIBLE);
            tvEdit.setText("增加动态任务");
            ivSoso.setVisibility(View.GONE);
        } else if (i == CPC_MULTI_FRAG) {
            tvTitle.setText("批量设置任务");
            tvEdit.setVisibility(View.VISIBLE);
            tvEdit.setText("添加");
            ivSoso.setVisibility(View.GONE);
        } else if (i == CPC_DYNAMIC_FRAG) {
            tvTitle.setText("增加动态任务");
            tvEdit.setVisibility(View.GONE);
            ivSoso.setVisibility(View.GONE);
        } else if (i == CPC_DETAIL_FRAG) {
            tvTitle.setText("表格详情");
            tvEdit.setVisibility(View.GONE);
            ivSoso.setVisibility(View.GONE);
        }
        currentFrag = i;
    }
}
