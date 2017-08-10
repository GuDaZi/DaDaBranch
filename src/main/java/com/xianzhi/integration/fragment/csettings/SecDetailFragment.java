package com.xianzhi.integration.fragment.csettings;

import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import com.xianzhi.integration.R;
import com.xianzhi.integration.activity.settings.SecActivity;
import com.xianzhi.integration.adapter.settings.SecDetailAdapter;
import com.xianzhi.integration.bean.SecurityDetailBean;
import com.xianzhi.integration.model.base.BaseResponesBean;
import com.xianzhi.integration.model.base.ModelCompleteCallback;
import com.xianzhi.integration.model.base.SettingsModelFactory;
import com.xianzhi.integration.tools.util.FastJsonUtil;
import com.xianzhi.integration.tools.util.StatusUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by TJTJL on 2017/7/20.
 */

public class SecDetailFragment extends BaseFragment implements ModelCompleteCallback<BaseResponesBean> {

    private static final String TAG = "SFragHD";
    @BindView(R.id.selfcheck_listView)
    ListView listView;
    Unbinder unbinder;
    private SecDetailAdapter adapter;
    private SecurityDetailBean securityDetailBean;

    @Override
    public void onStart() {
        super.onStart();
        SecActivity activity = (SecActivity) getActivity();
        activity.setTitleBtn(activity.SEC_DETAIL_FRAG);
    }

    @Override
    protected void initData() {
        adapter = new SecDetailAdapter(getActivity());
        listView.setDivider(null);
        listView.setSelector(new ColorDrawable());
        listView.setAdapter(adapter);

        SecActivity activity = (SecActivity) getActivity();
        model = SettingsModelFactory.getModelParams(SettingsModelFactory.SEC_DETAIL, activity, this, activity.year, activity.id);
        Log.e(TAG, "传入的year为 " +activity.year);
        Log.e(TAG, "传入的id为 " +activity.id);
        if (model != null) {
            Log.e(TAG, "model不为空 " );
            model.excuteParams(new SecurityDetailBean());
        }
    }

    @Override
    public View initView() {
        View view = View.inflate(getActivity(), R.layout.frag_securitydetail, null);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void setListener() {

    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onTaskPostExecute(int taskid, BaseResponesBean result) {
        if (result == null) {
            return;
        }
        if (result.getStatus() != StatusUtil.STATUS_OK) {
            return;
        }
        if (result.getInterface_status() == StatusUtil.INTERFACE_OK) {
            switch (taskid) {
                case SettingsModelFactory.SEC_DETAIL:
                    securityDetailBean = FastJsonUtil.getObject(result.getDataholder().toString(), SecurityDetailBean.class);
                    if ((securityDetailBean.getList().get(0) != null)) {
                        adapter.addData(securityDetailBean.getList());
                    }
//                    Log.e(TAG, securityDetailBean.getList().get(0).getName1() + "");

//                    adapter.addData(securityDetailBean.getList());
                    break;
            }
        }
        progressDialog.dismiss();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
