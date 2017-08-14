package com.xianzhi.integration.fragment.csettings;

import android.app.AlertDialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.xianzhi.integration.R;
import com.xianzhi.integration.activity.settings.CpcActivity;
import com.xianzhi.integration.adapter.settings.CpcAdapter;
import com.xianzhi.integration.bean.CpcBean;
import com.xianzhi.integration.bean.DepartBean;
import com.xianzhi.integration.model.base.BaseResponesBean;
import com.xianzhi.integration.model.base.ModelCompleteCallback;
import com.xianzhi.integration.model.base.SettingsModelFactory;
import com.xianzhi.integration.tools.util.FastJsonUtil;
import com.xianzhi.integration.tools.util.StatusUtil;
import com.zhy.tree.bean.Node;
import com.zhy.tree.bean.TreeListViewAdapter;

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

public class CpcFragment extends BaseFragment implements ModelCompleteCallback<BaseResponesBean>, CpcAdapter.CadrePreCheckClickListener {

    private static final String TAG = "SFragHD";
    @BindView(R.id.precheck_listView)
    ListView listView;
    Unbinder unbinder;
    @BindView(R.id.rl_filter)
    RelativeLayout rlFilter;
    @BindView(R.id.cb_department)
    CheckBox cbDepartment;
    @BindView(R.id.cb_name)
    CheckBox cbName;
    @BindView(R.id.tv_search)
    TextView tvSearch;
    @BindView(R.id.ll_cadre)
    LinearLayout llCadre;
    @BindView(R.id.ll_name)
    LinearLayout llName;
    @BindView(R.id.rl_switch)
    RelativeLayout rlSwitch;
    @BindView(R.id.rl_switch2)
    RelativeLayout rlSwitch2;
    @BindView(R.id.tv_cadre)
    TextView tvCadre;
    @BindView(R.id.ed_name)
    EditText edName;
    @BindView(R.id.ll_search)
    LinearLayout llSearch;
    @BindView(R.id.fl_switch)
    FrameLayout flSwitch;
    @BindView(R.id.tv_submit)
    TextView tvSubmit;
    @BindView(R.id.tv_cancel)
    TextView tvCancel;
    @BindView(R.id.line_gray)
    View lineGray;
    @BindView(R.id.ll_set_cadre)
    RelativeLayout llSetCadre;
    @BindView(R.id.sp_laomo)
    Spinner spLaomo;

    private CpcBean cpcBean;
    private List<CpcBean.PageBean.ListBean> data;
    private CpcAdapter adapter;
    private boolean isShow = false;
    private List<NameValuePair> params = new ArrayList<>();
    private String departmentId, dept_code, search_dept_name, name;
    private List<DepartBean> departBeanList;


    @Override
    public void onStart() {
        super.onStart();
        CpcActivity activity = (CpcActivity) getActivity();
        activity.setTitleBtn(activity.CPC_FRAG);
    }

    @Override
    public View initView() {
        progressDialog.show();
        View view = View.inflate(getActivity(), R.layout.frag_cadre_precheck, null);
        unbinder = ButterKnife.bind(this, view);

        return view;
    }

    @Override
    protected void initData() {
        adapter = new CpcAdapter(getActivity(), this);

        tvCadre.setBackground(spLaomo.getBackground());
        listView.setDivider(null);
        listView.setSelector(new ColorDrawable());
        listView.setAdapter(adapter);

        model = SettingsModelFactory.getModel(SettingsModelFactory.CPC, getActivity(), this);
        model.excuteParams(new CpcBean());
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
                case SettingsModelFactory.CPC:
                    cpcBean = FastJsonUtil.getObject(result.getDataholder().toString(), CpcBean.class);

                    //树状菜单需要的数据
                    departBeanList = FastJsonUtil.getObjects(cpcBean.getSearchDeptNodes(), DepartBean.class);

                    data = cpcBean.getPage().getList();
                    if (data != null) {
                        adapter.addData(data);
                    }
                    break;
                case SettingsModelFactory.CPC_FILTER:
                    Log.e(TAG, "onTaskPostExecute: 筛选请求数据成功");

                    cpcBean = FastJsonUtil.getObject(result.getDataholder().toString(), CpcBean.class);

                    departBeanList = FastJsonUtil.getObjects(cpcBean.getSearchDeptNodes(), DepartBean.class);

                    data = cpcBean.getPage().getList();
                    if (data != null) {
                        adapter.addData(data);
                    }
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

    @Override
    public void setListener() {
        flSwitch.setOnClickListener(this);
        tvSearch.setOnClickListener(this);
        tvSubmit.setOnClickListener(this);
        tvCancel.setOnClickListener(this);
        llSetCadre.setOnClickListener(this);
        edName.setOnClickListener(this);

        edName.setEnabled(true);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fl_switch:
                if (isShow == false) {
                    flSwitch.setBackgroundResource(R.drawable.shape_filter_yellow_noradius);
                    rlSwitch.setVisibility(View.GONE);
                    rlSwitch2.setVisibility(View.VISIBLE);

                    rlFilter.setVisibility(View.VISIBLE);
                    lineGray.setVisibility(View.VISIBLE);
                    isShow = true;
                } else {
                    rlFilter.setVisibility(View.GONE);
                    lineGray.setVisibility(View.GONE);

                    rlSwitch2.setVisibility(View.GONE);
                    rlSwitch.setVisibility(View.VISIBLE);
                    flSwitch.setBackgroundResource(R.drawable.shape_cset_white_divider);
                    isShow = false;
                }
                break;
            case R.id.tv_submit:
                if (cbDepartment.isChecked() && cbName.isChecked()) {
                    llCadre.setVisibility(View.VISIBLE);
                    llName.setVisibility(View.VISIBLE);
                    llSearch.setVisibility(View.VISIBLE);
                } else if (!(cbDepartment.isChecked() || cbName.isChecked())) {
                    llCadre.setVisibility(View.GONE);
                    llName.setVisibility(View.GONE);
                    llSearch.setVisibility(View.GONE);
                } else if (cbDepartment.isChecked()) {
                    llCadre.setVisibility(View.VISIBLE);
                    llName.setVisibility(View.GONE);
                    llSearch.setVisibility(View.VISIBLE);
                } else if (cbName.isChecked()) {
                    llName.setVisibility(View.VISIBLE);
                    llCadre.setVisibility(View.GONE);
                    llSearch.setVisibility(View.VISIBLE);
                }
                break;
            case R.id.tv_cancel:
                flSwitch.performClick();
                break;
            case R.id.ll_set_cadre:
                showDepartmentDialog();
                break;
            case R.id.tv_search:
                refreshData();
                break;
        }
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
                departmentId = node.getId() + "";
                dept_code = node.getCode();
                //拼接字符串,让显示的部门名囊括所有父部门
                String s = "";
                int i = 1;
                while (true) {
                    if (i == 1) {
                        s = node.getName().toString().trim();
                    } else {
                        s = node.getName().toString().trim() + "->" + s;
                    }
                    if (node.isRoot()) {
                        Log.e(TAG, "node是根节点");
                        break;
                    } else {
                        Log.e(TAG, "node不为根节点");
                        node = node.getParent();
                        i++;
                    }
                }
                search_dept_name = s;
                tvCadre.setText(search_dept_name);
                dialog.dismiss();
            }
        });
        lv_select.setAdapter(treeListViewAdapter);
    }

    /**
     * 根据筛选数据刷新表格
     */
    private void refreshData() {

        progressDialog.show();

        search_dept_name = tvCadre.getText().toString().trim();
        name = edName.getText().toString().trim();

        params.clear();
        params.add(new BasicNameValuePair("search_dept_name", tvCadre.getText().toString().trim()));
        params.add(new BasicNameValuePair("dept_code", dept_code));
        params.add(new BasicNameValuePair("dept_id", departmentId));
        params.add(new BasicNameValuePair("name", name));
        params.add(new BasicNameValuePair("goNumber", ""));
        params.add(new BasicNameValuePair("pageNumber", "0"));

        model = SettingsModelFactory.getModelList(SettingsModelFactory.CPC_FILTER, getActivity(), this, params);
        model.excuteParams(new CpcBean());
    }

    /**
     * @param v
     */
    @Override
    public void click(View v) {
        CpcActivity activity = (CpcActivity) getActivity();
        switch (v.getId()) {
            case R.id.tv_check:
                activity.id = v.getTag(R.id.tag_cadre_id) + "";
                activity.name = v.getTag(R.id.tag_cadre_name) + "";
                activity.positionName = v.getTag(R.id.tag_cadre_position_name) + "";
                activity.postName = v.getTag(R.id.tag_cadre_post_name) + "";
                activity.setFragment(activity.CPC_DETAIL_FRAG);
                break;
            case R.id.tv_set:
                activity.id = v.getTag(R.id.tag_cadre_id) + "";
                activity.name = v.getTag(R.id.tag_cadre_name) + "";
                activity.positionName = v.getTag(R.id.tag_cadre_position_name) + "";
                activity.postName = v.getTag(R.id.tag_cadre_post_name) + "";
                activity.setFragment(activity.CPC_SET_FRAG);
                break;
        }
    }

}
