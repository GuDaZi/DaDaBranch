package com.xianzhi.integration.fragment.csettings;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.xianzhi.integration.R;
import com.xianzhi.integration.activity.settings.SecActivity;
import com.xianzhi.integration.adapter.settings.SecAdapter;
import com.xianzhi.integration.bean.SecurityRisksBean;
import com.xianzhi.integration.model.base.BaseResponesBean;
import com.xianzhi.integration.model.base.ModelCompleteCallback;
import com.xianzhi.integration.model.base.SettingsModelFactory;
import com.xianzhi.integration.tools.util.FastJsonUtil;
import com.xianzhi.integration.tools.util.StatusUtil;
import com.xianzhi.integration.tools.util.ToastUtil;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by TJTJL on 2017/7/20.
 */

public class SecFragment extends BaseFragment implements ModelCompleteCallback<BaseResponesBean>, SecAdapter.SecurityClickListerner {

    //    private int frag = 0;
    private static final String TAG = "SFragHD";
    @BindView(R.id.sec_listView)
    ListView listView;
    Unbinder unbinder;

    private SecFragment fragment;
    private SecurityRisksBean securityBean;
    private List<SecurityRisksBean.PageBean.ListBean> data;
    private SecAdapter adapter;
    private EditText edRename;
    private TextView tvSubmit;
    private TextView tvCancel;
    private List<NameValuePair> params = new ArrayList<>();
    private String id, pid, level, status;
    private String rename;

    @Override
    public void onStart() {
        super.onStart();
        SecActivity activity = (SecActivity) getActivity();
        activity.setTitleBtn(activity.SEC_FRAG);
    }

    @Override
    public View initView() {
        progressDialog.show();
        View view = View.inflate(getActivity(), R.layout.frag_security, null);
        unbinder = ButterKnife.bind(this, view);

        return view;
    }


    @Override
    protected void initData() {
        adapter = new SecAdapter(getActivity(), this);
        listView.setDivider(null);
        listView.setSelector(new ColorDrawable());
        listView.setAdapter(adapter);

        model = SettingsModelFactory.getModel(SettingsModelFactory.SEC, getActivity(), this);
        model.excuteParams(new SecurityRisksBean());

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
                case SettingsModelFactory.SEC:
                    Log.e(TAG, "界面刷新");
                    securityBean = FastJsonUtil.getObject(result.getDataholder().toString(), SecurityRisksBean.class);

                    adapter.addData(securityBean.getPage().getList());
                    break;
                case SettingsModelFactory.SEC_RENAME:
                    Log.e(TAG, "onTaskPostExecute: succeed");
                    refreshPage();
                    break;
            }
        }
        progressDialog.dismiss();
    }

    /**
     * Item内点击事件
     */
    @Override
    public void click(View v) {
        SecActivity activity = (SecActivity) getActivity();
        switch (v.getId()) {
            case R.id.tv_check:
                activity.year = (String) v.getTag(R.id.tag_security_year);
                activity.id = (String) v.getTag(R.id.tag_security_id);
                activity.setFragment(activity.SEC_DETAIL_FRAG);
                break;
            case R.id.tv_rename:
                id = (String) v.getTag(R.id.tag_security_id);
                pid = (String) v.getTag(R.id.tag_security_pid);
                level = (String) v.getTag(R.id.tag_security_level);
                status = (String) v.getTag(R.id.tag_security_status);
                changeFormName();
                break;
            case R.id.tv_edit:
                //需要将此fragment点击view的参数传递给另一个fragment,通过共同的activity来传递
                activity.code = (String) v.getTag(R.id.tag_security_code);
                activity.pid = (String) v.getTag(R.id.tag_security_pid);

//                activity.pid = (String) v.getTag(R.id.tag_security_pid);

                Log.e(TAG, "click: code: " + activity.code);
                Log.e(TAG, "click: pid: " + activity.pid);

                activity.setFragment(activity.SEC_EDIT_FRAG);
                break;
            case R.id.tv_status:
                ToastUtil.show(getActivity(), "此功能Web版本已去除", Toast.LENGTH_SHORT);
                break;
        }
    }

    /**
     * 修改表格的名称
     */
    private void changeFormName() {

        DialogInterface.OnClickListener listener = new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                rename = dialogEdt.getText().toString().trim();
                updateData();
            }
        };
        SettingsDialog dialog = new SettingsDialog(getActivity(), "编辑表格名称", "输入表名", listener, false);
    }

    /**
     * 提交编辑表格信息
     */
    private void updateData() {

        Log.e(TAG, "updateData: id " + id);
        Log.e(TAG, "updateData: level " + level);
        Log.e(TAG, "updateData: pid " + pid);
        Log.e(TAG, "updateData: status " + status);
        Log.e(TAG, "updateData: rename " + rename);

        params.clear();
        params.add(new BasicNameValuePair("integrationRiskControl.id", id));
        params.add(new BasicNameValuePair("integrationRiskControl.level", level));
        params.add(new BasicNameValuePair("integrationRiskControl.pid", pid));
        params.add(new BasicNameValuePair("integrationRiskControl.status", status));
        params.add(new BasicNameValuePair("integrationRiskControl.name", rename));

        model = SettingsModelFactory.getModelList(SettingsModelFactory.SEC_RENAME, getActivity(), this, params);
        model.excuteParams(new SecurityRisksBean());
    }

    /**
     * 刷新界面
     */
    private void refreshPage() {
        Log.e(TAG, "refreshPage: 执行");
        model = SettingsModelFactory.getModel(SettingsModelFactory.SEC, getActivity(), this);
        model.excuteParams(new SecurityRisksBean());

    }

    @Override
    public void setListener() {
    }

    @Override
    public void onClick(View v) {
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    /**
     * AlertDialog样式
     */
    private EditText dialogEdt;

    private class SettingsDialog {
        public SettingsDialog(Context context, String title, String hint, DialogInterface.OnClickListener listener, boolean isSingle) {

            View edView = LayoutInflater.from(context).inflate(R.layout.layout_dialog_edittext, null, false);
            dialogEdt = (EditText) edView.findViewById(R.id.ed_cus);
            dialogEdt.setHint(hint);
            dialogEdt.setBackgroundResource(R.drawable.shape_cadre_edittext);

            AlertDialog dialog = new AlertDialog.Builder(context)
                    .setTitle(title)
                    .setView(edView)
                    .setPositiveButton("确定", listener)
                    .setNegativeButton("取消", null)
                    .show();

            Button mPositiveBtn = dialog.getButton(android.support.v7.app.AlertDialog.BUTTON_POSITIVE);
            mPositiveBtn.setTextColor(context.getResources().getColor(R.color.orange));

            Button mNegativeBtn = dialog.getButton(android.support.v7.app.AlertDialog.BUTTON_NEGATIVE);
            mNegativeBtn.setTextColor(context.getResources().getColor(R.color.blue1));
            if (isSingle == true) {
                mNegativeBtn.setVisibility(View.INVISIBLE);
            }
        }
    }
}
