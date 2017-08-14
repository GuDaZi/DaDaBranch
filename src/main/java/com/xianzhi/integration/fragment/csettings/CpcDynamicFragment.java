package com.xianzhi.integration.fragment.csettings;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.xianzhi.integration.R;
import com.xianzhi.integration.activity.settings.CpcActivity;
import com.xianzhi.integration.adapter.settings.CpcDynamicAdapter;
import com.xianzhi.integration.bean.CpcDynamicBean;
import com.xianzhi.integration.bean.DepartBean;
import com.xianzhi.integration.model.base.BaseResponesBean;
import com.xianzhi.integration.model.base.ModelCompleteCallback;
import com.xianzhi.integration.model.base.SettingsModelFactory;
import com.xianzhi.integration.tools.DateUtil;
import com.xianzhi.integration.tools.util.FastJsonUtil;
import com.xianzhi.integration.tools.util.StatusUtil;
import com.xianzhi.integration.tools.util.ToastUtil;
import com.xianzhi.integration.view.YearMonthPickerDialog;
import com.zhy.tree.bean.Node;
import com.zhy.tree.bean.TreeListViewAdapter;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by TJTJL on 2017/7/24.
 */

public class CpcDynamicFragment extends BaseFragment implements ModelCompleteCallback<BaseResponesBean> {

    @BindView(R.id.iv_filter)
    ImageView ivFilter;
    @BindView(R.id.rl_switch)
    RelativeLayout rlSwitch;
    @BindView(R.id.rl_switch2)
    RelativeLayout rlSwitch2;
    @BindView(R.id.fl_switch)
    FrameLayout flSwitch;
    @BindView(R.id.tv_setMonth)
    TextView tvMonth;
    @BindView(R.id.tv_depart)
    TextView tvDepart;
    @BindView(R.id.ll_tree)
    LinearLayout llTree;
    @BindView(R.id.ed_dynamicTask)
    EditText edDynamicTask;
    @BindView(R.id.tv_search)
    TextView tvSearch;
    @BindView(R.id.ll_filter)
    LinearLayout llFilter;
    @BindView(R.id.dy_listview)
    ListView listView;
    Unbinder unbinder;
    @BindView(R.id.sp_laomo)
    Spinner spLaomo;
    Unbinder unbinder1;
    private CpcDynamicBean cpcDynamicBean;
    private CpcDynamicAdapter adapter;
    private TextView tvSubmit;
    private TextView tvReturn;
    private Calendar calendar;
    private String departmentId, dept_code, search_dept_name, name, goNumber, pageNumber;
    private String month, positionId, postId, deptCode, deptId, assessmentArray, ids;
    private String newItem, newItemNum;
    private List<DepartBean> departBeanList;
    private List<NameValuePair> form = new ArrayList<>();
    public String dynamicTask = "";
    //判断筛选是否展开
    private boolean isShow = false;
    private static final String TAG = "SFragHD";

    @Override
    public void onStart() {
        super.onStart();
        CpcActivity activity = (CpcActivity) getActivity();
        activity.setTitleBtn(activity.CPC_DYNAMIC_FRAG);
    }

    @Override
    public View initView() {
        progressDialog.show();
        View view = View.inflate(getActivity(), R.layout.frag_cpc_dynamic, null);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    protected void initData() {
        calendar = Calendar.getInstance();
        int year = calendar.get(calendar.YEAR);
        int month = calendar.get(calendar.MONTH) + 1;
        if (month < 10) {
            tvMonth.setText(year + "-0" + month);
        } else {
            tvMonth.setText(year + "-" + month);
        }

        tvDepart.setBackground(spLaomo.getBackground());
        adapter = new CpcDynamicAdapter(getActivity(), this);
        View footerView = LayoutInflater.from(getActivity()).inflate(R.layout.footer_cpc_set, null, false);
        tvSubmit = (TextView) footerView.findViewById(R.id.tv_submit);
        tvReturn = (TextView) footerView.findViewById(R.id.tv_return);

        listView.setDivider(null);
        listView.setSelector(new ColorDrawable());
        listView.addFooterView(footerView);
        listView.setAdapter(adapter);

        model = SettingsModelFactory.getModel(SettingsModelFactory.CPC_DYNAMIC, getActivity(), this);
        model.excuteParams(new CpcDynamicBean());
    }

    @Override
    public void setListener() {
        flSwitch.setOnClickListener(this);
        tvMonth.setOnClickListener(this);
        llTree.setOnClickListener(this);
        tvSubmit.setOnClickListener(this);
        tvSearch.setOnClickListener(this);
        tvReturn.setOnClickListener(this);

        edDynamicTask.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus == false) {
                    dynamicTask = edDynamicTask.getText().toString().trim();
                }
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_setMonth:
                selectTime();
                break;
            case R.id.ll_tree:
                showDepartmentDialog();
                break;
            case R.id.fl_switch:
                if (isShow == false) {
                    llFilter.setVisibility(View.VISIBLE);
                    flSwitch.setBackgroundResource(R.drawable.shape_filter_yellow_noradius);
                    rlSwitch.setVisibility(View.GONE);
                    rlSwitch2.setVisibility(View.VISIBLE);
                    isShow = true;
                } else {
                    flSwitch.setBackgroundResource(R.drawable.shape_cset_white_divider);
                    llFilter.setVisibility(View.GONE);
                    rlSwitch2.setVisibility(View.GONE);
                    rlSwitch.setVisibility(View.VISIBLE);
                    isShow = false;
                }
                break;
            case R.id.tv_search:
                RefreshData();
                break;
            case R.id.tv_submit:
                if (dynamicTask == "" || dynamicTask == null) {
                    ToastUtil.show(getActivity(), "请设置动态任务", Toast.LENGTH_SHORT);
                } else {
                    updateData();
                }
                break;
            case R.id.tv_return:
                getActivity().onBackPressed();
                break;
        }
    }

    private void updateData() {
        /**
         *assessmentArray	[{"user_id":"219473","dynamic":"5","risk_control_content":"动态任务"},{"user_id":"219431","dynamic":"","risk_control_content":"动态任务"},{"user_id":"232503","dynamic":"3","risk_control_content":"动态任务"},{"user_id":"219477","dynamic":"","risk_control_content":"动态任务"},{"user_id":"219287","dynamic":"","risk_control_content":"动态任务"},{"user_id":"219472","dynamic":"","risk_control_content":"动态任务"},{"user_id":"219471","dynamic":"","risk_control_content":"动态任务"},{"user_id":"219474","dynamic":"","risk_control_content":"动态任务"},{"user_id":"219456","dynamic":"","risk_control_content":"动态任务"},{"user_id":"219284","dynamic":"","risk_control_content":"动态任务"}]
         month	2017-06
         */
        progressDialog.show();
        month = tvMonth.getText().toString().trim();
        //取得assessmentArray字符串
        String a = "";
        HashMap<String, String> map = adapter.map;
        int j = 0;
        Log.e(TAG, "map.size(): " + map.size());
        for (String s : map.keySet()) {
            if (j == 0 && j != ((map.size() - 1))) {
                a = "[" + map.get(s) + ",";
            } else if (j == (map.size() - 1) && j == 0) {
                a = "[" + a + map.get(s) + "]";
            } else if (j == (map.size() - 1)) {
                a = a + map.get(s) + "]";
            } else {
                a = a + map.get(s) + ",";
            }
            j++;
        }
        assessmentArray = a;

        Log.e(TAG, "assessmentArray: " + assessmentArray);
        Log.e(TAG, "month: " + month);

        form.clear();
        form.add(new BasicNameValuePair("assessmentArray", assessmentArray));
        form.add(new BasicNameValuePair("month", month));

        model = SettingsModelFactory.getModelList(SettingsModelFactory.CPC_DYNAMIC_UP, getActivity(), this, form);
        model.excuteParams(new CpcDynamicBean());
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
                case SettingsModelFactory.CPC_DYNAMIC:
                    cpcDynamicBean = FastJsonUtil.getObject(result.getDataholder().toString(), CpcDynamicBean.class);
                    adapter.addData(cpcDynamicBean.getIpaList());
                    departBeanList = FastJsonUtil.getObjects(cpcDynamicBean.getSearchDeptNodes(), DepartBean.class);
                    break;
                case SettingsModelFactory.CPC_DYNAMIC_RE:
                    cpcDynamicBean = FastJsonUtil.getObject(result.getDataholder().toString(), CpcDynamicBean.class);
                    adapter.addData(cpcDynamicBean.getIpaList());
                    departBeanList = FastJsonUtil.getObjects(cpcDynamicBean.getSearchDeptNodes(), DepartBean.class);
                    break;
                case SettingsModelFactory.CPC_DYNAMIC_UP:
                    View view = LayoutInflater.from(getActivity()).inflate(R.layout.layout_dialog_success, null, false);
                    new AlertDialog.Builder(getActivity())
                            .setView(view)
                            .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    getActivity().onBackPressed();
                                }
                            })
                            .create()
                            .show();
                    break;
            }
        }
        if (progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
    }

    /***
     * 时间选择器
     */
    private void selectTime() {
        new YearMonthPickerDialog(getActivity(), AlertDialog.THEME_HOLO_LIGHT, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                calendar.set(Calendar.YEAR, year);
                calendar.set(Calendar.MONTH, monthOfYear);
                tvMonth.setText(DateUtil.clanderTodatetime(calendar, "yyyy-MM"));
            }
        }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE)).show();
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
                        break;
                    } else {
                        node = node.getParent();
                        i++;
                    }
                }
                search_dept_name = s;
                tvDepart.setText(search_dept_name);
                dialog.dismiss();
            }
        });
        lv_select.setAdapter(treeListViewAdapter);
    }

    /**
     * 根据筛选刷新页面数据
     */
    private void RefreshData() {
        /**
         *  search_dept_name	沈阳车务段->安全科
         dept_code	0001000900220008
         dept_id	3870
         month	2017-06
         */
        progressDialog.show();

        month = tvMonth.getText().toString().trim();
        deptId = departmentId;
        deptCode = dept_code;

        Log.e(TAG, "RefreshData: search_dept_name: " + search_dept_name);
        Log.e(TAG, "RefreshData: deptCode: " + deptCode);
        Log.e(TAG, "RefreshData: deptId: " + deptId);
        Log.e(TAG, "RefreshData: month: " + month);

        form.clear();
        form.add(new BasicNameValuePair("search_dept_name", search_dept_name));
        form.add(new BasicNameValuePair("dept_code", deptCode));
        form.add(new BasicNameValuePair("dept_id", deptId));
        form.add(new BasicNameValuePair("month", month));

        model = SettingsModelFactory.getModelList(SettingsModelFactory.CPC_DYNAMIC_RE, getActivity(), this, form);
        model.excuteParams(new CpcDynamicBean());
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder1 = ButterKnife.bind(this, rootView);
        return rootView;
    }
}
