package com.xianzhi.integration.fragment.csettings;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xianzhi.integration.R;
import com.xianzhi.integration.base.BaseActivity;
import com.xianzhi.integration.model.base.Model;

/**
 * Created by TJTJL on 2017/7/24.
 */

public abstract class BaseFragment extends Fragment implements View.OnClickListener{

    protected Model model;
    protected ProgressDialog progressDialog;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        initSetprogressbar();
        View view = initView();
        initData();
        setListener();

        return view;
    }

    protected abstract void initData();

    public abstract View initView();

    public abstract void setListener();

    void initSetprogressbar() {
        progressDialog = new ProgressDialog(getActivity());
        progressDialog.setTitle("");
        progressDialog.setMessage(getString(R.string.loadDatas));
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progressDialog.setCancelable(false);
    }
}
