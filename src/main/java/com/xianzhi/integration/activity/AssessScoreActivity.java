package com.xianzhi.integration.activity;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.alibaba.fastjson.JSON;
import com.handmark.pulltorefresh.library.ILoadingLayout;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshGridView;
import com.xianzhi.integration.R;
import com.xianzhi.integration.adapter.AssessScoreAdapter;
import com.xianzhi.integration.base.BaseActivity;
import com.xianzhi.integration.bean.AssessScoreBean;
import com.xianzhi.integration.bean.AssessScoreInfoBean;
import com.xianzhi.integration.bean.DepartmentBean;
import com.xianzhi.integration.listener.OnPopupClickListener;
import com.xianzhi.integration.model.base.BaseResponesBean;
import com.xianzhi.integration.model.base.ModelCompleteCallback;
import com.xianzhi.integration.model.base.ModelFactory;
import com.xianzhi.integration.tools.DateUtil;
import com.xianzhi.integration.tools.util.FastJsonUtil;
import com.xianzhi.integration.tools.util.StatusUtil;
import com.xianzhi.integration.tools.util.ToastUtil;
import com.xianzhi.integration.view.EnterWorkDepartPopup;
import com.xianzhi.integration.view.YearMonthPickerDialog;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import butterknife.BindView;

/**
 * @Administrator LiBo.
 * @Date 2017/8/2.
 * @Function 考核分数汇总表
 */

public class AssessScoreActivity extends BaseActivity implements OnPopupClickListener, ModelCompleteCallback<BaseResponesBean> {

    @BindView(R.id.et_assessScore_name)
    EditText et_name;
    @BindView(R.id.tv_assessScore_depart)
    TextView tv_depart;
    @BindView(R.id.tv_assessScore_month)
    TextView tv_month;
    @BindView(R.id.lin_assessScore_depart)
    LinearLayout lin_depart;
    @BindView(R.id.assessScore_list)
    PullToRefreshGridView assessScore_list;

    //是否刷新
    private boolean isRefresh = true;
    //页数
    private int page = 0;
    private AssessScoreBean scoreBean;
    private List<AssessScoreBean.PageBean.ListBean> datas;
    private AssessScoreAdapter adapter;
    //部门popupwindow
    private EnterWorkDepartPopup departPopup;
    private String departId;
    private String departName;
    private String code;

    private Calendar calendar;
    //控件的宽度
    private int width;
    private String userId;
    private List<DepartmentBean> departMentBean;

    @Override
    protected void onCreateView(Bundle saveInstanceState) {
        setContentView(R.layout.activity_assessscore);
    }

    @Override
    protected void initView() {
        tv_title.setText("量化查询汇总表");
        iv_soso.setVisibility(View.VISIBLE);
        datas = new ArrayList<>();
        adapter = new AssessScoreAdapter(context, datas);
        assessScore_list.setAdapter(adapter);

        calendar = Calendar.getInstance();
        int year = calendar.get(calendar.YEAR);
        int month = calendar.get(calendar.MONTH) + 1;
        if (month < 10) {
            tv_month.setText(year + "-0" + month);
        } else {
            tv_month.setText(year + "-" + month);
        }

        ViewTreeObserver vto = lin_depart.getViewTreeObserver();
        vto.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {

            public boolean onPreDraw() {
                width = lin_depart.getMeasuredWidth();
                return true;
            }
        });

        departMentBean = new ArrayList<>();

        getDatas(0, 10);
        setOnRefresh();
    }

    @Override
    protected void setListener() {
        tv_depart.setOnClickListener(this);
        tv_month.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.lin_back:
                finish();
                break;
            case R.id.tv_assessScore_month:
                selectTime();
                break;
            case R.id.tv_assessScore_depart:
                departPopup = new EnterWorkDepartPopup(width, this, departMentBean, this);
                departPopup.showAsDropDown(lin_depart, 0, 0);
                break;
            case R.id.lin_right:
                isRefresh = true;
                getDatas(0, 10);
                break;
        }
    }

    /**
     * 获取头一层数据
     * @param num
     * @param size
     */
    private void getDatas(int num, int size) {
        if(isRefresh){
            progressDialog.show();
        }
        model = ModelFactory.getModel(ModelFactory.ASSESSSCORE, this, this);
        model.excuteParams(new AssessScoreBean(num, size, tv_month.getText().toString(), departName, departId, code, et_name.getText().toString()));
    }

    /**
     * 获取第二层数据
     */
    private void getScoreDatas(String userId, String startTime, String endTime) {
        model = ModelFactory.getModel(ModelFactory.ASSESSSCOREINFO, this, this);
        model.excuteParams(new AssessScoreInfoBean(userId, startTime, endTime));
    }

    @Override
    public void onTaskPostExecute(int taskid, BaseResponesBean result) {
        assessScore_list.onRefreshComplete();
        if (progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        if (result == null) {
            return;
        }
        if (result.getStatus() != StatusUtil.STATUS_OK) {
            return;
        }
        if (result.getInterface_status() == StatusUtil.INTERFACE_OK) {
            switch (taskid) {
                case ModelFactory.ASSESSSCORE:
                    scoreBean = FastJsonUtil.getObject(result.getDataholder().toString(), AssessScoreBean.class);
                    datas = scoreBean.getPage().getList();

                    String depart = scoreBean.getSearchDeptNodes();
                    departMentBean = JSON.parseArray(depart, DepartmentBean.class);

                    for (int i = 0; i < datas.size(); i ++) {
                        userId = datas.get(i).getUser_id();
                        getScoreDatas(userId, scoreBean.getTimeInfo().getStarttime(), scoreBean.getTimeInfo().getEndtime());
                    }

                    if (datas.size() == 0) {
                        ToastUtil.showShort(getApplicationContext(), "已经没有更多数据了");
                        assessScore_list.setMode(PullToRefreshBase.Mode.PULL_DOWN_TO_REFRESH);
                        if(isRefresh){
                            assessScore_list.setVisibility(View.GONE);
                        }
                    } else {
                        assessScore_list.setVisibility(View.VISIBLE);
                    }

                    page = scoreBean.getPage().getPageNumber();
                    break;
                case ModelFactory.ASSESSSCOREINFO:
                    AssessScoreInfoBean infoBean = FastJsonUtil.getObject(result.getDataholder().toString(), AssessScoreInfoBean.class);

                    for (int i = 0; i < datas.size(); i++) {
                        if(datas.get(i).getUser_id().equals(userId)){
                            datas.get(i).setInfo(infoBean);
                            datas.get(i).setListBean(scoreBean.getPropertyList());
                        }
                    }

                    if(isRefresh && datas != null){
                        adapter.addDatas(datas);
                        assessScore_list.setMode(PullToRefreshBase.Mode.BOTH);
                    } else if (datas.size() != 0 && datas != null){
                        adapter.addAllDatas(datas);
                    }

                    adapter.notifyDataSetChanged();

                    break;
            }

        }
    }

    /**
     * 刷新
     */
    private void setOnRefresh() {
        assessScore_list.setMode(PullToRefreshBase.Mode.BOTH);
        assessScore_list.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener2<GridView>() {
            @Override
            public void onPullDownToRefresh(PullToRefreshBase<GridView> refreshView) {
                ILoadingLayout startLabels = refreshView.getLoadingLayoutProxy(true, false);
                startLabels.setPullLabel("下拉刷新...");// 刚上拉时，显示的提示
                startLabels.setRefreshingLabel("正在载入..." + "\n\t");// 刷新时
                startLabels.setReleaseLabel("放开刷新...");// 下来达到一定距离时，显示的提示
                isRefresh = true;
                progressDialog.show();
                getDatas(0, 10);
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onPullUpToRefresh(PullToRefreshBase<GridView> refreshView) {
                ILoadingLayout startLabels = refreshView.getLoadingLayoutProxy(false, true);
                startLabels.setPullLabel("下拉刷新...");// 刚上拉时，显示的提示
                startLabels.setRefreshingLabel("正在载入..." + "\n\t");// 刷新时
                startLabels.setReleaseLabel("放开刷新...");// 下来达到一定距离时，显示的提示
                isRefresh = false;
                getDatas(page, 10);
                adapter.notifyDataSetChanged();
            }
        });
    }

    /***
     * 时间选择器
     */
    private void selectTime() {
        new YearMonthPickerDialog(this, AlertDialog.THEME_HOLO_LIGHT, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                calendar.set(Calendar.YEAR, year);
                calendar.set(Calendar.MONTH, monthOfYear);
                tv_month.setText(DateUtil.clanderTodatetime(calendar, "yyyy-MM"));

            }
        }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE)).show();

    }

    @Override
    public void onContentClick(int type, String content, int pid) {

    }

    @Override
    public void onDepartClick(int type, String depart, String content, int pid, String code) {
        departId = pid + "";
        tv_depart.setText(depart);
        departName = content;
        this.code = code;
    }
}
