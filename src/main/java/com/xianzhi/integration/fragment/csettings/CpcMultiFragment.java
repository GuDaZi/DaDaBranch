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
import android.widget.AdapterView;
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
import com.xianzhi.integration.adapter.settings.CpcMultiAdapter;
import com.xianzhi.integration.adapter.settings.PositionNameAdapter;
import com.xianzhi.integration.adapter.settings.PostNameAdapter;
import com.xianzhi.integration.bean.CpcMultiBean;
import com.xianzhi.integration.bean.DepartBean;
import com.xianzhi.integration.bean.SetSelfWorkBean;
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
import java.util.HashSet;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by TJTJL on 2017/7/24.
 * 干部月度预考核-->批量设置任务模块
 */

public class CpcMultiFragment extends BaseFragment implements ModelCompleteCallback<BaseResponesBean> {

    private static final String TAG = "SFragHD";
    @BindView(R.id.iv_filter)
    ImageView ivFilter;
    @BindView(R.id.rl_switch)
    RelativeLayout rlSwitch;
    @BindView(R.id.fl_switch)
    FrameLayout flSwitch;
    @BindView(R.id.tv_setMonth)
    TextView tvMonth;
    @BindView(R.id.tv_depart)
    TextView tvDepart;
    @BindView(R.id.tv_postName)
    Spinner spPostName;
    @BindView(R.id.tv_positionName)
    Spinner spPositionName;
    @BindView(R.id.tv_search)
    TextView tvSearch;
    @BindView(R.id.ll_filter)
    LinearLayout llFilter;
    @BindView(R.id.multi_listView)
    ListView listView;
    @BindView(R.id.ll_tree)
    LinearLayout llTree;
    Unbinder unbinder;
    private CpcMultiAdapter adapter;
    private PositionNameAdapter positionAdapter;
    private PostNameAdapter postAdapter;
    private CpcMultiBean cpcMultiBean;
    private Calendar calendar;
    private String departmentId, dept_code, search_dept_name, positionName, postName, month, newItem,
                   newItemNum, positionId, postId, deptCode, deptId, assessmentArray, ids;
    private List<DepartBean> departBeanList;
    private List<NameValuePair> form = new ArrayList<>();
    private TextView tvSubmit, tvReturn;
    private HashMap<String, String> map = new HashMap<>();
    private List<CpcMultiBean.PositionListBean> dataPosition;
    private List<CpcMultiBean.PostListBean> dataPost;
    //判断筛选是否展开
    private boolean isShow = false;

    @Override
    public void onStart() {
        super.onStart();
        CpcActivity activity = (CpcActivity) getActivity();
        activity.setTitleBtn(activity.CPC_MULTI_FRAG);
    }

    @Override
    public View initView() {
        progressDialog.show();
        View view = View.inflate(getActivity(), R.layout.frag_cpc_multi, null);
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

        adapter = new CpcMultiAdapter(getActivity());
        View footerView = LayoutInflater.from(getActivity()).inflate(R.layout.footer_cpc_set, null, false);
        tvSubmit = (TextView) footerView.findViewById(R.id.tv_submit);
        tvReturn = (TextView) footerView.findViewById(R.id.tv_return);

        listView.addFooterView(footerView);
        listView.setDivider(null);
        listView.setSelector(new ColorDrawable());
        listView.setAdapter(adapter);
        model = SettingsModelFactory.getModel(SettingsModelFactory.CPC_MULTISET, getActivity(), this);
        model.excuteParams(new CpcMultiBean());

        //设定两个Spinner的数据
        positionAdapter = new PositionNameAdapter(getActivity());
        spPositionName.setAdapter(positionAdapter);
        spPositionName.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                positionName = dataPosition.get(position).getName() + "";
                //如果名字是空字符串,则它的字符串Id也为""
                if (positionName == "") {
                    positionId = "";
                } else {
                    positionId = dataPosition.get(position).getId() + "";
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        postAdapter = new PostNameAdapter(getActivity());
        spPostName.setAdapter(postAdapter);
        spPostName.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                postName = dataPost.get(position).getName() + "";
                //如果名字是空字符串,则它的字符串Id也为""
                if (postName == "") {
                    postId = "";
                } else {
                    postId = dataPost.get(position).getId() + "";
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }


    @Override
    public void setListener() {
        flSwitch.setOnClickListener(this);
        tvMonth.setOnClickListener(this);
        llTree.setOnClickListener(this);
        tvSubmit.setOnClickListener(this);
        tvSearch.setOnClickListener(this);
        tvReturn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String bumen = tvDepart.getText().toString().trim();
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
                    flSwitch.setBackgroundResource(R.drawable.shape_filter_noradius);
                    isShow = true;
                } else {
                    llFilter.setVisibility(View.GONE);
                    flSwitch.setBackgroundResource(R.drawable.shape_cadre_divider);
                    isShow = false;
                }
                break;
            case R.id.tv_search:
                if (bumen == null || bumen == "") {
                    ToastUtil.show(getActivity(), "请选择部门", Toast.LENGTH_SHORT);
                } else if ((postName == "" || postName == null) && (positionName == "" || positionName == null)) {
                    ToastUtil.show(getActivity(), "请选择职名或岗位", Toast.LENGTH_SHORT);
                } else {
                    RefreshData();
                }
                break;
            case R.id.tv_submit:
                if (bumen == null || bumen == "") {
                    ToastUtil.show(getActivity(), "请选择部门", Toast.LENGTH_SHORT);
                } else if ((postName == "" || postName == null) && (positionName == "" || positionName == null)) {
                    ToastUtil.show(getActivity(), "请选择职名或岗位", Toast.LENGTH_SHORT);
                } else {
                    updateData();
                }
                break;
            case R.id.tv_return:
                getActivity().onBackPressed();
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
                case SettingsModelFactory.CPC_MULTISET:
                    setData(result);
                    break;
                case SettingsModelFactory.CPC_MULTI_RE:
                    Log.e(TAG, "刷新成功");
                    setData(result);
                    break;
                case SettingsModelFactory.CPC_MULTI_UP:
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
                case SettingsModelFactory.CPC_MULTI_ADD:
                    View view1 = LayoutInflater.from(getActivity()).inflate(R.layout.layout_dialog_success, null, false);
                    new AlertDialog.Builder(getActivity())
                            .setView(view1)
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

    /**
     * 添加新的动态任务条目
     */
    public void addDynamicItem() {
        //这里要添加一个AlterDialog
        final View view = LayoutInflater.from(getActivity()).inflate(R.layout.layout_dialog_dynamic, null, false);
        final EditText itemName = (EditText) view.findViewById(R.id.ed_itemName);
        final EditText itemTaskNum = (EditText) view.findViewById(R.id.ed_dynamicTask);
        new AlertDialog.Builder(getActivity())
                .setTitle("添加动态任务")
                .setView(view)
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        newItem = itemName.getText().toString().trim();
                        newItemNum = itemTaskNum.getText().toString().trim();
                        updateNewItem(newItem, newItemNum);
                    }
                })
                .setNegativeButton("取消", null)
                .create()
                .show();
    }

    /**
     * 向服务器上传新增加的条目
     *
     * @param newItem
     * @param newItemNum
     */
    //把map获取过来,然后添加新条目,map携带的值是拼接的assessmentArray
    //所以要先将新条目转换成map携带的值是拼接的assessmentArray
    //新条目的id是空,dynamic是newItemNum,risk_control_content是newItem
    private void updateNewItem(String newItem, String newItemNum) {
        /**
         *  assessmentArray	[{"risk_control_id":"1279","normal":"3","dynamic":"3"},
         * {"risk_control_id":"","dynamic":"0","risk_control_content":"给大家分配新任务啦"}]
         ids	24915
         month	2017-08
         search_dept_name	沈阳车务段->党群办
         deptCode	0001000900220003
         deptId	3865
         positionId	2648
         postId	1560
         check_item	on
         check_item	on
         */
        map.clear();
        map = adapter.map;

        month = tvMonth.getText().toString().trim();
        deptId = departmentId;
        deptCode = dept_code;

        //取得assessmentArray字符串,这里要手动添加一段新的动态任务Json串
        //随便改的
        String a = "";
        HashMap<String, String> map = adapter.map;
        int j = 0;
        for (String s : map.keySet()) {
            if (j == 0 && j != ((map.size() - 1))) {
                a = "[" + map.get(s) + ",";
            } else if (j == (map.size() - 1) && j == 0) {
                a = "[" + a + map.get(s) + ",";
            } else {
                a = a + map.get(s) + ",";
            }
            j++;
        }
        String temp = "{\"risk_control_id\":\"" + "" +
                "\",\"dynamic\":\"" + newItemNum +
                "\",\"risk_control_content\":\"" + newItem + "\"}" + "]";
        assessmentArray = a + temp;

        //取得ids字符串
        ids = "";
        HashSet<String> set = adapter.set;
        int i = 0;
        for (String s : set) {
            if (i == (map.size() - 1)) {
                ids = ids + s;
            } else {
                ids = ids + s + ",";
            }
            i++;
        }

        Log.e(TAG, "assessmentArray: " + assessmentArray);
        Log.e(TAG, "ids: " + ids);
        Log.e(TAG, "month: " + month);
        Log.e(TAG, "search_dept_name: " + search_dept_name);
        Log.e(TAG, "deptCode: " + deptCode);
        Log.e(TAG, "deptId: " + deptId);
        Log.e(TAG, "positionId: " + positionId);
        Log.e(TAG, "postId: " + postId);
        for (int z = 0; z < map.size()+1; z++) {
            Log.e(TAG, "check_item: " + "on");
        }

        form.clear();
        form.add(new BasicNameValuePair("assessmentArray", assessmentArray));
        form.add(new BasicNameValuePair("ids", ids));
        form.add(new BasicNameValuePair("month", month));
        form.add(new BasicNameValuePair("search_dept_name", search_dept_name));
        form.add(new BasicNameValuePair("deptCode", deptCode));
        form.add(new BasicNameValuePair("deptId", deptId));
        form.add(new BasicNameValuePair("positionId", positionId));
        form.add(new BasicNameValuePair("postId", postId));
        for (int z = 0; z < map.size() + 1; z++) {
            form.add(new BasicNameValuePair("check_item", "on"));
        }

        model = SettingsModelFactory.getModelList(SettingsModelFactory.CPC_MULTI_ADD, getActivity(), this, form);
        model.excuteParams(new CpcMultiBean());
    }

    /**
     * 根据筛选刷新页面数据
     */
    private void RefreshData() {
        /**
         *  month	2017-08
         positionId	2648
         postId	1560
         deptCode	0001000900220003
         deptId	3865
         */
        progressDialog.show();

        month = tvMonth.getText().toString().trim();
        deptId = departmentId;
        deptCode = dept_code;

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

        Log.e(TAG, "RefreshData: month" + month);
        Log.e(TAG, "RefreshData: positionId" + positionId);
        Log.e(TAG, "RefreshData: postId" + postId);
        Log.e(TAG, "RefreshData: deptCode" + deptCode);
        Log.e(TAG, "RefreshData: deptId" + deptId);

        form.clear();
        form.add(new BasicNameValuePair("month", month));
        form.add(new BasicNameValuePair("positionId.USER_ID", positionId));
        form.add(new BasicNameValuePair("postId", postId));
        form.add(new BasicNameValuePair("deptCode", deptCode));
        form.add(new BasicNameValuePair("deptId", deptId));

        model = SettingsModelFactory.getModelList(SettingsModelFactory.CPC_MULTI_RE, getActivity(), this, form);
        model.excuteParams(new CpcMultiBean());
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

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    /**
     * 请求成功后,设置页面数据
     */
    private void setData(BaseResponesBean result) {
        cpcMultiBean = FastJsonUtil.getObject(result.getDataholder().toString(), CpcMultiBean.class);
        adapter.addData(cpcMultiBean.getList());
        //在这里为两组数据前添加一个空字符串
        dataPosition = new ArrayList<>();
        CpcMultiBean.PositionListBean bean = new CpcMultiBean.PositionListBean();
        bean.setName("");
        dataPosition.add(bean);
        dataPosition.addAll(cpcMultiBean.getPositionList());
        CpcMultiBean.PostListBean bean1 = new CpcMultiBean.PostListBean();
        bean1.setName("");
        dataPost = new ArrayList<>();
        dataPost.add(bean1);
        dataPost.addAll(cpcMultiBean.getPostList());
        positionAdapter.addData(dataPosition);
        postAdapter.addData(dataPost);
        departBeanList = FastJsonUtil.getObjects(cpcMultiBean.getSearchDeptNodes(), DepartBean.class);
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
     * 提交数据
     */
    private void updateData() {
        //注意这个ids值是动态的
        /**
         *
         assessmentArray	[{"risk_control_id":"1279","normal":"3","dynamic":"3"}]
         ids	24958
         month	2017-08
         search_dept_name	沈阳车务段->党群办
         deptCode	0001000900220003
         deptId	3865
         positionId	2648
         postId
         check_item	on
         */
        progressDialog.show();

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

        //取得ids字符串
        ids = "";
        HashSet<String> set = adapter.set;
        int i = 0;
        for (String s : set) {
            if (i == (map.size() - 1)) {
                ids = ids + s;
            } else {
                ids = ids + s + ",";
            }
            i++;
        }
        month = tvMonth.getText().toString().trim();
        deptId = departmentId;
        deptCode = dept_code;

        Log.e(TAG, "assessmentArray: " + assessmentArray);
        Log.e(TAG, "ids: " + ids);
        Log.e(TAG, "month: " + month);
        Log.e(TAG, "search_dept_name: " + search_dept_name);
        Log.e(TAG, "deptCode: " + deptCode);
        Log.e(TAG, "deptId: " + deptId);
        Log.e(TAG, "positionId: " + positionId);
        Log.e(TAG, "postId: " + postId);
        for (int z = 0; z < map.size(); z++) {
            Log.e(TAG, "check_item: " + "on");
        }
        form.clear();
        form.add(new BasicNameValuePair("assessmentArray", assessmentArray));
        form.add(new BasicNameValuePair("ids", ids));
        form.add(new BasicNameValuePair("month", month));
        form.add(new BasicNameValuePair("search_dept_name", search_dept_name));
        form.add(new BasicNameValuePair("deptCode", deptCode));
        form.add(new BasicNameValuePair("deptId", deptId));
        form.add(new BasicNameValuePair("positionId", positionId));
        form.add(new BasicNameValuePair("postId", postId));
        for (int z = 0; z < map.size(); z++) {
            form.add(new BasicNameValuePair("check_item", "on"));
        }
        model = SettingsModelFactory.getModelList(SettingsModelFactory.CPC_MULTI_UP, getActivity(), this, form);
        model.excuteParams(new CpcMultiBean());
    }

}
