package com.xianzhi.integration.fragment.csettings;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.xianzhi.integration.R;
import com.xianzhi.integration.activity.settings.CpcActivity;
import com.xianzhi.integration.adapter.settings.CpcSetAdapter;
import com.xianzhi.integration.bean.CpcDetailBean;
import com.xianzhi.integration.bean.CpcSetBean;
import com.xianzhi.integration.model.base.BaseResponesBean;
import com.xianzhi.integration.model.base.ModelCompleteCallback;
import com.xianzhi.integration.model.base.SettingsModelFactory;
import com.xianzhi.integration.tools.DateUtil;
import com.xianzhi.integration.tools.util.FastJsonUtil;
import com.xianzhi.integration.tools.util.StatusUtil;
import com.xianzhi.integration.view.YearMonthPickerDialog;

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
 */

public class CpcSetFragment extends BaseFragment implements ModelCompleteCallback<BaseResponesBean> {

    private static final String TAG = "SFragHD";
    @BindView(R.id.tv_setMonth)
    TextView tvMonth;
    @BindView(R.id.tv_name)
    TextView tvName;
    @BindView(R.id.tv_jobname)
    TextView tvJobname;
    @BindView(R.id.tv_postName)
    TextView tvPostName;
    Unbinder unbinder;

    private List<String> params = new ArrayList<>();
    private List<NameValuePair> form = new ArrayList<>();
    private CpcSetAdapter adapter;
    private CpcSetBean cpcSetBean;
    private Calendar calendar;
    private ListView listview;
    private TextView tvReturn;
    private TextView tvSubmit;
    private List<CpcSetBean.ListBean> list;
    private String assessmentArray, ids, userId, month, check_item;
    private HashMap<String,String> map = new HashMap<>();
    private EditText editName;
    private EditText editCount;


    @Override
    public void onStart() {
        super.onStart();
        CpcActivity activity = (CpcActivity) getActivity();
        activity.setTitleBtn(activity.CPC_SET_FRAG);
    }

    @Override
    public View initView() {
        progressDialog.show();
        View view = View.inflate(getActivity(), R.layout.frag_cpc_set, null);

        listview = (ListView) view.findViewById(R.id.listview);
        return view;
    }

    @Override
    protected void initData() {

        View headerView = LayoutInflater.from(getActivity()).inflate(R.layout.header_cpc_detail, null, false);
        unbinder = ButterKnife.bind(this, headerView);

        View footerView = LayoutInflater.from(getActivity()).inflate(R.layout.footer_cpc_set, null, false);
        tvReturn = (TextView) footerView.findViewById(R.id.tv_return);
        tvSubmit = (TextView) footerView.findViewById(R.id.tv_submit);

        //设置listView没有分割线,默认状态选择器为全透明
        listview.setDivider(null);
        listview.setSelector(new ColorDrawable());

        listview.addHeaderView(headerView);
        listview.addFooterView(footerView);

        adapter = new CpcSetAdapter(getActivity());
        listview.setAdapter(adapter);

        calendar = Calendar.getInstance();
        int year = calendar.get(calendar.YEAR);
        int month = calendar.get(calendar.MONTH) + 1;
        if (month < 10) {
            tvMonth.setText(year + "-0" + month);
        } else {
            tvMonth.setText(year + "-" + month);
        }

        //为网络请求添加参数
        CpcActivity activity = (CpcActivity) getActivity();

        params.clear();
        params.add(activity.id);

        model = SettingsModelFactory.getModelList(SettingsModelFactory.CPC_SET, getActivity(), this, params);
        model.excuteParams(new CpcDetailBean());
    }

    @Override
    public void setListener() {
        tvMonth.setOnClickListener(this);
        tvSubmit.setOnClickListener(this);
        tvReturn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_setMonth:
                selectTime(v);
                break;
            case R.id.tv_submit:
                updateData();
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
                case SettingsModelFactory.CPC_SET:

                    cpcSetBean = FastJsonUtil.getObject(result.getDataholder().toString(), CpcSetBean.class);

                    month = cpcSetBean.getMonth();
                    userId = ((CpcActivity) (getActivity())).id;

                    list = cpcSetBean.getList();
                    CpcActivity activity = (CpcActivity) getActivity();
                    tvName.setText(activity.name);
                    tvJobname.setText(activity.positionName);
                    tvPostName.setText(activity.postName);

                    adapter.addData(list);
                    break;
                case SettingsModelFactory.CPC_SET_UP:
                case SettingsModelFactory.CPC_SET_ADD_DYNAMIC:
                    DialogInterface.OnClickListener listener = new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            getActivity().onBackPressed();
                        }
                    };
                    SettingsDialog dialog = new SettingsDialog("设置成功",listener);
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
    private void selectTime(final View v) {
        new YearMonthPickerDialog(getActivity(), android.app.AlertDialog.THEME_HOLO_LIGHT, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                calendar.set(Calendar.YEAR, year);
                calendar.set(Calendar.MONTH, monthOfYear);
                ((TextView) v).setText(DateUtil.clanderTodatetime(calendar, "yyyy-MM"));
                refreshData();
            }
        }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE)).show();
    }

    /**
     * 选择月份后刷新界面
     */
    private void refreshData() {
        month = tvMonth.getText().toString().trim();

        params.clear();
//        params.add(id);
        params.add(month);

        model = SettingsModelFactory.getModelList(SettingsModelFactory.CPC_DETAIL_REFRESH, getActivity(), this, params);
        model.excuteParams(new CpcSetBean());
    }

    /**
     * 保存本职工作设置
     */
    private void updateData() {
        //取得assessmentArray字符串
        String a = "";
        map = adapter.map;
        int j = 0;
        Log.e(TAG, "map.size(): " +map.size());
        for (String s : map.keySet()) {
            if (j==0&&j!=((map.size() - 1))) {
                a = "[" + map.get(s) + ",";
            } else if (j==(map.size() - 1)&&j==0) {
                a = "[" + a + map.get(s) + "]";
            } else if (j==(map.size() - 1)){
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

        Log.e(TAG, "assessmentArray " + assessmentArray);
        Log.e(TAG, "ids: " + ids);
        Log.e(TAG, "userId: " + userId);
        Log.e(TAG, "month: " + month);
        //循环计算check_item的次数
        for (int k = 0; k < map.size(); k++) {
            Log.e(TAG, "check_item: " + "on");
        }

        form.clear();
        form.add(new BasicNameValuePair("assessmentArray", assessmentArray));
        form.add(new BasicNameValuePair("ids", ids));
        form.add(new BasicNameValuePair("userId", userId));
        form.add(new BasicNameValuePair("month", month));
        //循环发送check_item  on
        for (int k = 0; k < map.size(); k++) {
            form.add(new BasicNameValuePair("check_item", check_item));
        }

        model = SettingsModelFactory.getModelList(SettingsModelFactory.CPC_SET_UP, getActivity(), this, form);
        model.excuteParams(new CpcSetBean());
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    /**
     * 添加新的动态任务条目
     */
    private String newItem;
    private String newItemNum;
    public void addDynamicItem() {
        //这里要添加一个AlterDialog
        DialogInterface.OnClickListener listener = new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                newItem = editName.getText().toString().trim();
                newItemNum = editCount.getText().toString().trim();
                updateNewItem(newItem, newItemNum);
            }
        };
        SettingsDialog dialog = new SettingsDialog("添加动态任务","输入任务名称",listener,false);
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
         * assessmentArray	[{"risk_control_id":"1279","normal":"3","dynamic":"3"},
         * {"risk_control_id":"","dynamic":"5","risk_control_content":"我是李霞的动态任务"}]
         ids	851313
         userId	219157
         month	2017-08
         check_item	on
         check_item	on
         */
        map.clear();
        map = adapter.map;
        month = tvMonth.getText().toString().trim();
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
        Log.e(TAG, "userId: " + userId);
        Log.e(TAG, "month: " + month);
        for (int z = 0; z < map.size()+1; z++) {
            Log.e(TAG, "check_item: " + "on");
        }

        form.clear();
        form.add(new BasicNameValuePair("assessmentArray", assessmentArray));
        form.add(new BasicNameValuePair("ids", ids));
        form.add(new BasicNameValuePair("userId", userId));
        form.add(new BasicNameValuePair("month", month));

        for (int z = 0; z < map.size() + 1; z++) {
            form.add(new BasicNameValuePair("check_item", "on"));
        }
        model = SettingsModelFactory.getModelList(SettingsModelFactory.CPC_SET_ADD_DYNAMIC, getActivity(), this, form);
        model.excuteParams(new CpcSetBean());
    }

    /**
     * dialog
     */
    public class SettingsDialog {

        public SettingsDialog(String title, String hint, DialogInterface.OnClickListener listener, boolean isSingle){

            View edView = LayoutInflater.from(getActivity()).inflate(R.layout.layout_dialog_dynamic, null, false);
            editName = (EditText) edView.findViewById(R.id.ed_cus);
            editName.setHint(hint);
            editName.setBackgroundResource(R.drawable.shape_cadre_edittext);
            editCount = (EditText) edView.findViewById(R.id.ed_dynamicTask);
            editCount.setBackgroundResource(R.drawable.shape_cadre_edittext);

            AlertDialog dialog = new AlertDialog.Builder(getActivity())
                    .setTitle(title)
                    .setView(edView)
                    .setPositiveButton("确定", listener)
                    .setNegativeButton("取消", null)
                    .show();

            Button mPositiveBtn = dialog.getButton(AlertDialog.BUTTON_POSITIVE);
            mPositiveBtn.setTextColor(getActivity().getResources().getColor(R.color.orange));

            Button mNegativeBtn = dialog.getButton(AlertDialog.BUTTON_NEGATIVE);
            mNegativeBtn.setTextColor(getActivity().getResources().getColor(R.color.blue1));
            if (isSingle == true) {
                mNegativeBtn.setVisibility(View.INVISIBLE);
            }
        }

        //dialog单按钮的提示框
        public SettingsDialog(String content, DialogInterface.OnClickListener listener ) {
            View sucView = LayoutInflater.from(getActivity()).inflate(R.layout.layout_dialog_success, null, false);
            TextView tvContent = (TextView) sucView.findViewById(R.id.tv_content);
            tvContent.setText(content);
            android.support.v7.app.AlertDialog dialog = new android.support.v7.app.AlertDialog.Builder(getActivity())
                    .setView(sucView)
                    .setPositiveButton("确定", listener)
                    .show();

            Button mPositiveBtn = dialog.getButton(android.support.v7.app.AlertDialog.BUTTON_POSITIVE);
            mPositiveBtn.setTextColor(getActivity().getResources().getColor(R.color.orange));
        }

    }
}
