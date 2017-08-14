package com.xianzhi.integration.fragment.csettings;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.xianzhi.integration.R;
import com.xianzhi.integration.activity.settings.SecActivity;
import com.xianzhi.integration.adapter.settings.SecEditAdapter;
import com.xianzhi.integration.bean.DepartBean;
import com.xianzhi.integration.bean.SecEditBean;
import com.xianzhi.integration.bean.SecTreeBean;
import com.xianzhi.integration.model.base.BaseResponesBean;
import com.xianzhi.integration.model.base.ModelCompleteCallback;
import com.xianzhi.integration.model.base.SettingsModelFactory;
import com.xianzhi.integration.tools.util.FastJsonUtil;
import com.xianzhi.integration.tools.util.StatusUtil;
import com.zhy.tree.bean.Node;
import com.zhy.tree.bean.TreeListViewAdapter;

import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by TJTJL on 2017/7/20.
 */

public class SecEditFragment extends BaseFragment implements ModelCompleteCallback<BaseResponesBean>, SecEditAdapter.SecEditListener {

    private static final String TAG = "SFragHD";
    @BindView(R.id.tv_cadre)
    TextView tvCadre;
    @BindView(R.id.ll_set_cadre)
    RelativeLayout llSetCadre;
    @BindView(R.id.ll_cadre)
    LinearLayout llCadre;
    @BindView(R.id.listView)
    ListView listView;
    Unbinder unbinder;
    @BindView(R.id.sp_laomo)
    Spinner spLaomo;
    Unbinder unbinder1;
    private SecTreeBean secTreeBean;
    private SecEditBean secEditBean;
    private SecEditAdapter adapter;
    private List<String> params = new ArrayList();
    private List<String> paramsTemp = new ArrayList();
    private List<BasicNameValuePair> form = new ArrayList();
    private List<DepartBean> departBeanList;
    public String code, id, level, pid, year, name, search_dept_name, levelTemp, rename, addName;
    public int currentLevel = 0;

    @Override
    public void onStart() {
        super.onStart();
        SecActivity activity = (SecActivity) getActivity();
        activity.setTitleBtn(activity.SEC_EDIT_FRAG);
    }

    public View initView() {
        View view = View.inflate(getActivity(), R.layout.frag_security_edit, null);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    protected void initData() {

        tvCadre.setBackground(spLaomo.getBackground());
        adapter = new SecEditAdapter(getActivity(), this);
        listView.setDivider(null);
        listView.setSelector(new ColorDrawable());
        listView.setAdapter(adapter);

        SecActivity activity = (SecActivity) getActivity();
        code = activity.code;
        pid = activity.pid;
//        year = activity.year;
        //默认打开界面level为1
        level = "1";

        params.clear();
        params.add(code);
        params.add(pid);
        params.add(level);
        //获取表格树形图
        model = SettingsModelFactory.getModelList(SettingsModelFactory.SEC_TREE, activity, this, params);
        model.excuteParams(new SecTreeBean());
        //获取显示的具体信息
        model = SettingsModelFactory.getModelList(SettingsModelFactory.SEC_EDIT, activity, this, params);
        model.excuteParams(new SecEditBean());
    }

    @Override
    public void setListener() {
        llSetCadre.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ll_set_cadre:
                showDepartmentDialog();
                break;
            default:
                break;
        }
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
                case SettingsModelFactory.SEC_TREE:
                    secTreeBean = FastJsonUtil.getObject(result.getDataholder().toString(), SecTreeBean.class);
                    departBeanList = FastJsonUtil.getObjects(secTreeBean.getZNodes(), DepartBean.class);
                    break;
                case SettingsModelFactory.SEC_EDIT:
                    secEditBean = FastJsonUtil.getObject(result.getDataholder().toString(), SecEditBean.class);
                    adapter.addData(secEditBean.getPage().getList(), currentLevel);
                    break;
                case SettingsModelFactory.SEC_EDIT_RENAME:
                    refreshPage();
                    break;
                case SettingsModelFactory.SEC_EDIT_DEL:
                    refreshPage();
                    break;
                case SettingsModelFactory.SEC_EDIT_ADD:
                    Log.e(TAG, "请求成功 ");
                    refreshPage();
                    break;
            }
        }
        progressDialog.dismiss();
    }

    /**
     * 显示树状部门筛选菜单
     */
    private void showDepartmentDialog() {

        final AlertDialog dialog = new AlertDialog.Builder(getActivity()).create();
        dialog.show();
        View contentview = View.inflate(getActivity(), R.layout.select_dialog, null);
        dialog.getWindow().setContentView(contentview);
        ListView lv_select = (ListView) contentview
                .findViewById(R.id.lv_dialog_select);
        TreeListViewAdapter treeListViewAdapter = new TreeListViewAdapter(lv_select, getActivity(), departBeanList, 1);
        treeListViewAdapter.setOnTreeNodeClickListener(new TreeListViewAdapter.OnTreeNodeClickListener() {
            @Override
            public void onClick(Node node, int position) {
                //更新pid
//                pid = node.getpId() + "";
                pid = node.getId() + "";
                currentLevel = node.getLevel();
                //实际得到的level值和传递的不一样,自己算一下
                if (node.getLevel() == 1) {
                    levelTemp = 2 + "";
                } else if (node.getLevel() == 2) {
                    levelTemp = 4 + "";
                }
                //这里是选中的name
                search_dept_name = node.getName().toString().trim();
                tvCadre.setText(search_dept_name);
                refreshData();
                dialog.dismiss();
            }
        });
        lv_select.setAdapter(treeListViewAdapter);
    }

    /**
     * 刷新界面
     */
    private void refreshPage() {
        model = SettingsModelFactory.getModelList(SettingsModelFactory.SEC_EDIT, getActivity(), this, params);
        model.excuteParams(new SecEditBean());
    }

    /**
     * 选择表格项目后刷新界面
     */
    private void refreshData() {
        SecActivity activity = (SecActivity) getActivity();
//        需要更新pid和level
        params.clear();
        params.add(code);
        params.add(pid);
        params.add(levelTemp);

//        Log.e(TAG, "code: " + code);
//        Log.e(TAG, "pid: " + pid);
//        Log.e(TAG, "level: " + levelTemp);

        model = SettingsModelFactory.getModelList(SettingsModelFactory.SEC_EDIT, activity, this, params);
        model.excuteParams(new SecEditBean());
    }

    /**
     * 删除条目
     */
    private void deleteItem() {
        paramsTemp.clear();
        paramsTemp.add(code);

        model = SettingsModelFactory.getModelList(SettingsModelFactory.SEC_EDIT_DEL, getActivity(), this, paramsTemp);
        model.excuteParams(new SecEditBean());
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    /**
     * 条目内点击事件
     */
    @Override
    public void click(View v) {
        switch (v.getId()) {
            case R.id.tv_rename:
                id = v.getTag(R.id.tag_security_id) + "";
                level = v.getTag(R.id.tag_security_level) + "";
                pid = v.getTag(R.id.tag_security_pid) + "";
                year = v.getTag(R.id.tag_security_year) + "";
                name = v.getTag(R.id.tag_security_name) + "";
                Log.e(TAG, "click: tv_rename");
                changeItemName();
                break;
            case R.id.tv_delete:
                code = v.getTag(R.id.tag_security_code) + "";
                deleteItem();
                break;
        }
    }

    /**
     * 修改表格的名称
     */
    private void changeItemName() {
        DialogInterface.OnClickListener listener = new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                rename = dialogEdt.getText().toString().trim();
                updateData();
            }
        };
        SettingsDialog dialog = new SettingsDialog(getActivity(), "编辑条目", "输入条目名称", listener, false);
    }

    /**
     * 提交编辑表格信息
     */
    private void updateData() {
        Log.e(TAG, "updateData: id " + id);
        Log.e(TAG, "updateData: level " + level);
        Log.e(TAG, "updateData: pid " + pid);
        Log.e(TAG, "updateData: year " + year);
        Log.e(TAG, "updateData: name " + rename);

        form.clear();
        form.add(new BasicNameValuePair("integrationRiskControl.id", id));
        form.add(new BasicNameValuePair("integrationRiskControl.level", level));
        form.add(new BasicNameValuePair("integrationRiskControl.pid", pid));
        form.add(new BasicNameValuePair("integrationRiskControl.year", year));
        form.add(new BasicNameValuePair("integrationRiskControl.name", rename));

        model = SettingsModelFactory.getModelList(SettingsModelFactory.SEC_EDIT_RENAME, getActivity(), this, form);
        model.excuteParams(new SecEditBean());
    }

    /**
     * 添加要增加的条目数据
     */
    public void addItem() {
        DialogInterface.OnClickListener listener = new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                addName = dialogEdt.getText().toString().trim();
                setNewItem();
            }
        };
        SettingsDialog dialog = new SettingsDialog(getActivity(), "新条目", "输入条目名称", listener, false);
    }

    /**
     * 增加新条目
     */
    private void setNewItem() {
        /**
         * integrationRiskControl.id
         integrationRiskControl.level	4
         integrationRiskControl.pid	6305
         integrationRiskControl.year	2015
         integrationRiskControl.name	我就是标准

         */
        Log.e(TAG, "setNewItem: id" + "");
        Log.e(TAG, "setNewItem: level" + levelTemp);
        Log.e(TAG, "setNewItem: pid" + pid);
        Log.e(TAG, "setNewItem: year" + code);
        Log.e(TAG, "setNewItem: addName" + addName);

        form.clear();
        form.add(new BasicNameValuePair("integrationRiskControl.id", ""));
        form.add(new BasicNameValuePair("integrationRiskControl.level", levelTemp));
        form.add(new BasicNameValuePair("integrationRiskControl.pid", pid));
        form.add(new BasicNameValuePair("integrationRiskControl.year", code));
        form.add(new BasicNameValuePair("integrationRiskControl.name", addName));

        model = SettingsModelFactory.getModelList(SettingsModelFactory.SEC_EDIT_ADD, getActivity(), this, form);
        model.excuteParams(new SecEditBean());
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

            Button mPositiveBtn = dialog.getButton(AlertDialog.BUTTON_POSITIVE);
            mPositiveBtn.setTextColor(context.getResources().getColor(R.color.orange));

            Button mNegativeBtn = dialog.getButton(AlertDialog.BUTTON_NEGATIVE);
            mNegativeBtn.setTextColor(context.getResources().getColor(R.color.blue1));
            if (isSingle == true) {
                mNegativeBtn.setVisibility(View.INVISIBLE);
            }
        }
    }

}
