package com.xianzhi.integration.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xianzhi.integration.R;
import com.xianzhi.integration.adapter.LoweHominidsAdapter;
import com.xianzhi.integration.adapter.SuperiorLeadershipAdapter;
import com.xianzhi.integration.base.BaseActivity;
import com.xianzhi.integration.base.TableUpdateBean;
import com.xianzhi.integration.bean.LeaderApproveBean;
import com.xianzhi.integration.bean.LoweAndSuperListBean;
import com.xianzhi.integration.bean.TableBean;
import com.xianzhi.integration.listener.OnPopupClickListener;
import com.xianzhi.integration.model.base.BaseResponesBean;
import com.xianzhi.integration.model.base.ModelCompleteCallback;
import com.xianzhi.integration.model.base.ModelFactory;
import com.xianzhi.integration.tools.util.FastJsonUtil;
import com.xianzhi.integration.tools.util.LogUtil;
import com.xianzhi.integration.tools.util.StatusUtil;
import com.xianzhi.integration.tools.util.ToastUtil;
import com.xianzhi.integration.view.GratePopup;
import com.xianzhi.integration.view.MyAssessListView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * @Administrator LiBo.
 * @Date 2017/7/25.
 * @Function 表格界面
 */

public class Table1Activity extends BaseActivity implements LoweHominidsAdapter.OnLowehomindsClickListener, SuperiorLeadershipAdapter.OnSuperScoreClickListener, ModelCompleteCallback<BaseResponesBean>, OnPopupClickListener {

    private String type;
    private String itemId;

    @BindView(R.id.tv_personal_userName)
    TextView tv_userName;
    @BindView(R.id.tv_personal_dete)
    TextView tv_month;
    @BindView(R.id.tv_personal_name)
    TextView tv_personal;
    @BindView(R.id.tv_personal_depart)
    TextView tv_depart;
    @BindView(R.id.tv_personal_job)
    TextView tv_jobName;
    @BindView(R.id.tv_personal_post)
    TextView tv_post;
    @BindView(R.id.iv_up_info)
    ImageView iv_up;
    @BindView(R.id.iv_down_info)
    ImageView iv_down;
    @BindView(R.id.lin_secondTitle)
    LinearLayout lin_secondTitle;
    //否决条件
    @BindView(R.id.tv_vetoConditions_title)
    TextView tv_vetoConditions_title;
    //考核内容
    @BindView(R.id.tv_content_condition)
    TextView tv_content_condition;
    //考核标准
    @BindView(R.id.tv_standard_condition)
    TextView tv_standard_condition;
    //本质工作
    @BindView(R.id.tv_ownWork_title)
    TextView tv_ownWork_title;
    @BindView(R.id.tv_content_work)
    TextView tv_content_work;
    @BindView(R.id.tv_standard_work)
    TextView tv_standard_work;
    //现场控制
    @BindView(R.id.tv_fieldControl_title)
    TextView tv_fieldControl_title;
    @BindView(R.id.tv_content_controller)
    TextView tv_content_controller;
    @BindView(R.id.tv_standard_controller)
    TextView tv_standard_controller;
    //系统统计
    //发现问题
    @BindView(R.id.tv_find_problem_num)
    TextView tv_find_problem_num;
    @BindView(R.id.tv_find_problem)
    TextView tv_find_problem;
    //安全问题
    @BindView(R.id.tv_risk_problem_num)
    TextView tv_risk_problem_num;
    @BindView(R.id.tv_risk_problem)
    TextView tv_risk_problem;
    //被发现问题
    @BindView(R.id.tv_beFind_problem_num)
    TextView tv_beFind_problem_num;
    @BindView(R.id.tv_beFind_problem)
    TextView tv_beFind_problem;
    //自我写实减分
    @BindView(R.id.tv_selfRealism_num)
    TextView tv_selfRealism_num;
    //上一级领导
    @BindView(R.id.list_superiorLeadership)
    MyAssessListView list_superiorLeadership;
    @BindView(R.id.tv_superiorLeadership)
    TextView tv_superiorLeadership;
    //劳人科
    @BindView(R.id.list_loweHominids)
    MyAssessListView list_loweHominids;
    @BindView(R.id.tv_loweHominids)
    TextView tv_loweHominids;
    //考核人意见
    @BindView(R.id.et_approvePersonal_content)
    EditText et_approvePersonal_content;
    //考核人
    @BindView(R.id.tv_approvePersonal)
    TextView tv_approvePersonal;
    //日期
    @BindView(R.id.tv_approvePersonal_date)
    TextView tv_approvePersonal_date;
    //考核情况
    //加减分数
    @BindView(R.id.tv_add_minus_num)
    TextView tv_add_minus_num;
    //实际得分
    @BindView(R.id.tv_actualScore)
    TextView tv_actualScore;
    //考核组意见
    @BindView(R.id.tv_assessGroup_opinion)
    TextView tv_assessGroup_opinion;
    //考核类别
    @BindView(R.id.tv_assessType)
    TextView tv_assessType;
    //领导签批
    @BindView(R.id.tv_leader_sign)
    EditText tv_leader_sign;
    //考核人
    @BindView(R.id.tv_leader)
    TextView tv_leader;
    //日期
    @BindView(R.id.tv_leader_date)
    TextView tv_leader_date;
    //第一个预警
    @BindView(R.id.lin_warn2)
    LinearLayout lin_warn1;
    @BindView(R.id.tv_warn2_problem_num)
    TextView tv_warn1_num;
    @BindView(R.id.tv_warn2_problem)
    TextView tv_warn1;
    //第二个预警
    @BindView(R.id.lin_warn1)
    LinearLayout lin_warn2;
    @BindView(R.id.tv_warn1_problem_num)
    TextView tv_warn2_num;
    @BindView(R.id.tv_warn1_problem)
    TextView tv_warn2;
    @BindView(R.id.lin_table)
    LinearLayout lin_table;

    private String departName;
    //等级popupwindow
    private GratePopup gratePopup;
    private int grateId;
    //上级领导适配器
    private SuperiorLeadershipAdapter superiorLeadershipAdapter;
    //劳人科适配器
    private LoweHominidsAdapter loweHominidsAdapter;
    //分数集合
    private List<String> scoreDatas;
    private List<String> itemIds;
    private List<String> scoreDatas1;
    private List<String> itemIds1;
    private List<LoweAndSuperListBean.LoweAndSuperBean> allDatas;
    private boolean isEnter3 = false;

    @Override
    protected void onCreateView(Bundle saveInstanceState) {
        setContentView(R.layout.activity_table_layout);
    }

    @Override
    protected void initView() {
        type = getIntent().getStringExtra("type");
        itemId = getIntent().getStringExtra("itemId");

        scoreDatas = new ArrayList<>();
        itemIds = new ArrayList<>();
        scoreDatas1 = new ArrayList<>();
        itemIds1 = new ArrayList<>();
        allDatas = new ArrayList<>();

        tv_title.setText("安全经营一体化考核评定表");
        lin_table.setFocusable(true);
        lin_table.setFocusableInTouchMode(true);

        if (type.equals("0")) {
            tv_assessType.setBackgroundColor(Color.rgb(255, 255, 255));
            tv_assessType.setText("");
            getCadreDatas();
        } else if (type.equals("1")) {
            getCadreDatas();
            lin_warn2.setVisibility(View.VISIBLE);
            lin_warn1.setVisibility(View.VISIBLE);
            tv_assessType.setBackgroundColor(Color.rgb(255, 255, 255));
            tv_assessType.setText("");
        } else if (type.equals("2")) {
            tv_edit.setVisibility(View.VISIBLE);
            tv_edit.setText("保存");
            getCadreDatas();
        } else if (type.equals("3")) {
            tv_edit.setVisibility(View.VISIBLE);
            tv_edit.setText("保存");
            getCadreDatas();
        } else if(type.equals("4")) {
            tv_assessType.setBackgroundColor(Color.rgb(255, 255, 255));
            tv_assessType.setText("");
            getCadreDatas();
        }

    }

    @Override
    protected void setListener() {
        tv_assessType.setOnClickListener(this);
        iv_down.setOnClickListener(this);
        iv_up.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(context, EnteringActivity.class);
        switch (v.getId()) {
            case R.id.lin_back:
                finish();
                break;
            case R.id.lin_right:
                if (type.equals("3")) {
                    setUpdateDatas();
                } else if (type.equals("2") && !TextUtils.isEmpty(tv_leader_sign.getText().toString())) {
                    setleaderApprove();
                } else if (TextUtils.isEmpty(tv_leader_sign.getText().toString())) {
                    if (!TextUtils.isEmpty(et_approvePersonal_content.getText().toString())) {
                        Intent intent1 = new Intent(context, ApproveDepartActivity.class);
                        intent1.putExtra("departName", departName);
                        intent1.putExtra("itemId", itemId);
                        intent1.putExtra("content", et_approvePersonal_content.getText().toString());
                        startActivity(intent1);
                        finish();
                    } else if (TextUtils.isEmpty(et_approvePersonal_content.getText().toString())) {
                        ToastUtil.showShort(getApplicationContext(), "请填写考核人意见！");
                    }
                } else {
                    ToastUtil.showShort(getApplicationContext(), "请填写领导审批！");
                }

                break;
            case R.id.tv_superiorLeadership:
                intent.putExtra("itemId", itemId);
                intent.putExtra("type", "1");
                startActivityForResult(intent, 1);
                break;
            case R.id.tv_loweHominids:
                intent.putExtra("itemId", itemId);
                intent.putExtra("type", "2");
                startActivityForResult(intent, 1);
                break;
            case R.id.tv_assessType:
                if(!type.equals("0") && !type.equals("1") && !type.equals("4")){
                    gratePopup.showAsDropDown(tv_assessType, 0, 0);
                }
                break;
            case R.id.iv_up_info:
                lin_secondTitle.setVisibility(View.GONE);
                break;
            case R.id.iv_down_info:
                lin_secondTitle.setVisibility(View.VISIBLE);
                break;
        }
    }

    /**
     * 获取干部考核审批详情和编辑的数据
     */
    private void getCadreDatas() {
        progressDialog.show();
        model = ModelFactory.getModel(ModelFactory.CADRETABLE, this, this);
        model.excuteParams(new TableBean(itemId, type));
    }

    /**
     * 领导审批
     */
    private void setleaderApprove() {
        model = ModelFactory.getModel(ModelFactory.LEADERAPPROVE, this, this);
        model.excuteParams(new LeaderApproveBean(itemId, tv_assessType.getText().toString(), grateId, tv_leader_sign.getText().toString()));
    }

    /**
     * 更新数据
     */
    private void setUpdateDatas() {
        allDatas.clear();
        String score = tv_add_minus_num.getText().toString();
        String actionScore = tv_actualScore.getText().toString();
        String grate = tv_assessType.getText().toString();
        String content = tv_leader_sign.getText().toString();

        for (int i =0; i < scoreDatas.size(); i ++) {
            LoweAndSuperListBean.LoweAndSuperBean loweAndSuperBean = new LoweAndSuperListBean.LoweAndSuperBean();
            loweAndSuperBean.setId(itemIds.get(i));
            loweAndSuperBean.setScore(scoreDatas.get(i));
            loweAndSuperBean.setType(1);
            allDatas.add(loweAndSuperBean);
        }

        for (int i =0; i < scoreDatas1.size(); i ++) {
            LoweAndSuperListBean.LoweAndSuperBean loweAndSuperBean = new LoweAndSuperListBean.LoweAndSuperBean();
            loweAndSuperBean.setId(itemIds1.get(i));
            loweAndSuperBean.setScore(scoreDatas1.get(i));
            loweAndSuperBean.setType(2);
            allDatas.add(loweAndSuperBean);
        }

        LoweAndSuperListBean listBean = new LoweAndSuperListBean(allDatas);
        JSONObject datas = (JSONObject) JSON.toJSON(listBean);
        String text = "";
        if(datas.toString().length() > 10){
            String str[] = datas.toString().split("\"data\":");
            if(str.length >= 2){
                text = str[1];
                text = text.substring(0, text.length() - 1);
            }
        }
        LogUtil.i("realisticArray", text);

        model = ModelFactory.getModel(ModelFactory.UPDATETABLE, this, this);
        model.excuteParams(new TableUpdateBean(itemId, score, actionScore, text, grate, grateId, content));
    }

    @Override
    public void onTaskPostExecute(int taskid, BaseResponesBean result) {
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
            lin_table.setVisibility(View.VISIBLE);
            switch (taskid) {
                case ModelFactory.CADRETABLE:
                    TableBean tableBean = FastJsonUtil.getObject(result.getDataholder().toString(), TableBean.class);
                    tv_userName.setText(tableBean.getUser().getName());
                    tv_personal.setText(tableBean.getUser().getName());
                    tv_depart.setText(tableBean.getUser().getDept_name());
                    tv_jobName.setText(tableBean.getUser().getPosition_name());
                    tv_post.setText(tableBean.getUser().getPost_name());
                    tv_month.setText(tableBean.getMonth());
                    tv_vetoConditions_title.setText(tableBean.getTableTitle().getTitle1_name());
                    String content_condition = "";
                    for (int i = 0; i < tableBean.getVetoAllList().size(); i++) {
                        if (i == tableBean.getVetoAllList().size() - 1) {
                            content_condition += tableBean.getVetoAllList().get(i).getCondition();
                        } else {
                            content_condition += tableBean.getVetoAllList().get(i).getCondition() + "\n";
                        }
                    }
                    tv_content_condition.setText(content_condition);
                    tv_standard_condition.setText("发生一项失格：" + "\n");

                    tv_ownWork_title.setText(tableBean.getTableTitle().getTitle2_name());
                    tv_content_work.setText(tableBean.getSelfRealistic().getBzgznr());
                    tv_standard_work.setText(tableBean.getSelfRealistic().getBzgzbz());

                    tv_fieldControl_title.setText(tableBean.getTableTitle().getTitle3_name());
                    String dynamic = "动态任务：" + "\n";
                    String normalcy = "常态任务：" + "\n";
                    String dynamicNum = "";
                    String normalcyNum = "";
                    for (int i = 0; i < tableBean.getRiskConList().size(); i++) {
                        int done = tableBean.getRiskConList().get(i).getNormal_done() + tableBean.getRiskConList().get(i).getDynamic_done();
                        int no_dene = tableBean.getRiskConList().get(i).getNormal() + tableBean.getRiskConList().get(i).getDynamic();
                        if (tableBean.getRiskConList().get(i).getDynamic() == 0) {
                            if (i == tableBean.getRiskConList().size() - 1) {
                                normalcy += tableBean.getRiskConList().get(i).getContent();
                                if (done >= no_dene) {
                                    normalcyNum += "未完成要求,减" + tableBean.getRiskConList().get(i).getMinus_score() + "分/项：已完成（" + done + "/" + no_dene + ")";
                                } else {
                                    normalcyNum += "未完成要求,减" + tableBean.getRiskConList().get(i).getMinus_score() + "分/项：未完成（" + done + "/" + no_dene + ")";
                                }
                            } else {
                                normalcy += tableBean.getRiskConList().get(i).getContent() + "\n";
                                if (done >= no_dene) {
                                    normalcyNum += "未完成要求,减" + tableBean.getRiskConList().get(i).getMinus_score() + "分/项：已完成（" + done + "/" + no_dene + ")\n";
                                } else {
                                    normalcyNum += "未完成要求,减" + tableBean.getRiskConList().get(i).getMinus_score() + "分/项：未完成（" + done + "/" + no_dene + ")\n";
                                }
                            }
                        } else {
                            if (i == tableBean.getRiskConList().size() - 1) {
                                dynamic += tableBean.getRiskConList().get(i).getContent();
                                if (done >= no_dene) {
                                    dynamicNum += "未完成要求,减" + tableBean.getRiskConList().get(i).getMinus_score() + "分/项：已完成（" + done + "/" + no_dene + ")";
                                } else {
                                    dynamicNum += "未完成要求,减" + tableBean.getRiskConList().get(i).getMinus_score() + "分/项：未完成（" + done + "/" + no_dene + ")";
                                }
                            } else {
                                dynamic += tableBean.getRiskConList().get(i).getContent() + "\n";
                                if (done >= no_dene) {
                                    dynamicNum += "未完成要求,减" + tableBean.getRiskConList().get(i).getMinus_score() + "分/项：已完成（" + done + "/" + no_dene + ")\n";
                                } else {
                                    dynamicNum += "未完成要求,减" + tableBean.getRiskConList().get(i).getMinus_score() + "分/项：未完成（" + done + "/" + no_dene + ")\n";
                                }
                            }
                        }
                    }
                    if (dynamic.length() > 10 && normalcy.length() > 10) {
                        tv_content_controller.setText(normalcy + "\n" + dynamic);
                    } else if (dynamic.length() > 10) {
                        tv_content_controller.setText(dynamic);
                    } else if (normalcy.length() > 10) {
                        tv_content_controller.setText(normalcy);
                    }
                    if (!TextUtils.isEmpty(dynamicNum) && !TextUtils.isEmpty(normalcyNum)) {
                        tv_standard_controller.setText(normalcyNum + "\n" + dynamicNum);
                    } else if (!TextUtils.isEmpty(dynamicNum)) {
                        tv_standard_controller.setText(dynamicNum);
                    } else if (!TextUtils.isEmpty(normalcyNum)) {
                        tv_standard_controller.setText(normalcyNum);
                    }

                    String find_problem = "";
                    for (int i = 0; i < tableBean.getPropertyTypeList().size(); i++) {
                        if (i == tableBean.getPropertyTypeList().size() - 1) {
                            find_problem += "发现（" + tableBean.getPropertyTypeList().get(i).getTypename() + "）类问题" + tableBean.getPropertyTypeList().get(i).getNum() + "件";
                        } else {
                            find_problem += "发现（" + tableBean.getPropertyTypeList().get(i).getTypename() + "）类问题" + tableBean.getPropertyTypeList().get(i).getNum() + "件\n";
                        }
                    }
                    tv_find_problem.setText(find_problem);
                    tv_find_problem_num.setText("+" + (tableBean.getApprove().getProblem_real_add_score() + tableBean.getApprove().getProblem_key_time_add() + tableBean.getApprove().getProblem_awh_add()) + "分");
                    tv_risk_problem_num.setText("+" + tableBean.getApprove().getDanger_find_add_score() + "分");
                    tv_risk_problem.setText("发现安全隐患" + tableBean.getApprove().getDanger_find_num() + "件");
                    tv_beFind_problem_num.setText("+" + (tableBean.getApprove().getProblem_real_minus_score() + tableBean.getApprove().getProblem_key_time_minus() + tableBean.getApprove().getProblem_awh_minus()) + "分");
                    String beFind_problem = "";
                    for (int i = 0; i < tableBean.getPropertyTypeMinusList().size(); i++) {
                        if (i == tableBean.getPropertyTypeMinusList().size() - 1) {
                            beFind_problem += "被发现（" + tableBean.getPropertyTypeMinusList().get(i).getTypename() + "）类问题" + tableBean.getPropertyTypeMinusList().get(i).getNum() + "件";
                        } else {
                            beFind_problem += "被发现（" + tableBean.getPropertyTypeMinusList().get(i).getTypename() + "）类问题" + tableBean.getPropertyTypeMinusList().get(i).getNum() + "件\n";
                        }
                    }
                    if(tableBean.getApprove().getLeader_status1() == 0){
                        if(type.equals("2")){
                            tv_superiorLeadership.setVisibility(View.VISIBLE);
                        }
                    }
                    if(tableBean.getApprove().getLeader_status2() == 0 && tableBean.getApprove().getLeader_status1() == 1){
                        if(type.equals("2")){
                            tv_loweHominids.setVisibility(View.VISIBLE);
                        }
                    }

                    if(tableBean.getApprove().getLeader_status2() != 0 || tableBean.getApprove().getLeader_status1() != 0){
                        isEnter3 = true;
                    }

                    tv_beFind_problem.setText(beFind_problem);
                    tv_selfRealism_num.setText(tableBean.getSelfRealistic().getAdd_score() - tableBean.getSelfRealistic().getMinus_score() + "分");
                    if (tableBean.getSjldList() != null && tableBean.getSjldList().size() > 0) {
                        superiorLeadershipAdapter = new SuperiorLeadershipAdapter(isEnter3, this, context, tableBean.getSjldList(), type);
                        list_superiorLeadership.setAdapter(superiorLeadershipAdapter);
                        superiorLeadershipAdapter.notifyDataSetChanged();
                    }
                    if (tableBean.getLrkList() != null && tableBean.getLrkList().size() > 0) {
                        loweHominidsAdapter = new LoweHominidsAdapter(isEnter3, this, context, tableBean.getLrkList(), type);
                        list_loweHominids.setAdapter(loweHominidsAdapter);
                        loweHominidsAdapter.notifyDataSetChanged();
                    }
                    et_approvePersonal_content.setText(tableBean.getApprove().getComment1());
                    tv_approvePersonal.setText(tableBean.getApprove().getLeader_name1());
                    tv_approvePersonal_date.setText(tableBean.getApprove().getApprove_time1());

                    tv_add_minus_num.setText(tableBean.getApprove().getAdd_min_score() + "");
                    tv_actualScore.setText(tableBean.getApprove().getFinal_score() + "");
                    tv_assessGroup_opinion.setText(tableBean.getApprove().getLrk_level_name());
                    tv_assessType.setText(tableBean.getApprove().getFinal_level_name());

                    tv_leader_sign.setText(tableBean.getApprove().getComment2());
                    tv_leader.setText(tableBean.getApprove().getLeader_name3());
                    tv_leader_date.setText(tableBean.getApprove().getApprove_time3());

                    if (type.equals("1")) {
                        String warn2 = "";
                        for (int i = 0; i < tableBean.getWarnAddScore().size(); i++) {
                            if (i == tableBean.getWarnAddScore().size() - 1) {
                                warn2 += tableBean.getWarnAddScore().get(i).getName() + tableBean.getWarnAddScore().get(i).getNum() + "件";
                            } else {
                                warn2 += tableBean.getWarnAddScore().get(i).getName() + tableBean.getWarnAddScore().get(i).getNum() + "件\n";
                            }
                        }
                        tv_warn1.setText(warn2);
                        tv_warn1_num.setText("-0分");
                        String warn = "";
                        for (int i = 0; i < tableBean.getWarnMinScore().size(); i++) {
                            if (i == tableBean.getWarnMinScore().size() - 1) {
                                warn += tableBean.getWarnMinScore().get(i).getName() + tableBean.getWarnMinScore().get(i).getNum() + "件";
                            } else {
                                warn += tableBean.getWarnMinScore().get(i).getName() + tableBean.getWarnMinScore().get(i).getNum() + "件\n";
                            }
                        }
                        tv_warn2.setText(warn);
                        tv_warn2_num.setText("-0分");
                    }

                    if (!TextUtils.isEmpty(tableBean.getzNodes())) {
                        departName = tableBean.getzNodes();
                    }

                    if (!TextUtils.isEmpty(et_approvePersonal_content.getText().toString())) {
                        if(isEnter3){
                            tv_leader_sign.setFocusableInTouchMode(true);
                            tv_leader_sign.setFocusable(true);
                        } else {
                            tv_leader_sign.setFocusableInTouchMode(false);
                            tv_leader_sign.setFocusable(false);
                        }
                        et_approvePersonal_content.setFocusableInTouchMode(false);
                        et_approvePersonal_content.setFocusable(false);
                        et_approvePersonal_content.setBackgroundColor(Color.rgb(227, 227, 227));
                    } else {
                        et_approvePersonal_content.setFocusableInTouchMode(true);
                        et_approvePersonal_content.setFocusable(true);
                        tv_leader_sign.setFocusableInTouchMode(false);
                        tv_leader_sign.setFocusable(false);
                        tv_leader_sign.setBackgroundColor(Color.rgb(227, 227, 227));
                    }

                    if(type.equals("1") || type.equals("0") || type.equals("4")){
                        tv_assessType.setFocusable(false);
                        tv_assessType.setFocusableInTouchMode(false);
                        tv_leader_sign.setFocusable(false);
                        tv_leader_sign.setFocusableInTouchMode(false);
                    }

//                    gratePopup = new GratePopup(tv_assessType, this, tableBean.getLevelList(), context);
                    break;
                case ModelFactory.LEADERAPPROVE:
                    LeaderApproveBean approveBean = FastJsonUtil.getObject(result.getDataholder().toString(), LeaderApproveBean.class);
                    if (approveBean.getStatus() == 0) {
                        finish();
                    } else {
                        ToastUtil.showShort(getApplicationContext(), "保存失败");
                    }
                    break;
                case ModelFactory.UPDATETABLE:
                    TableUpdateBean updateBean = FastJsonUtil.getObject(result.getDataholder().toString(), TableUpdateBean.class);
                    if (updateBean.getStatus() == 0) {
                        finish();
                    } else {
                        ToastUtil.showShort(getApplicationContext(), "保存失败");
                    }
                    break;
            }

        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == 10) {
            getCadreDatas();
        }

    }

    @Override
    public void onContentClick(int type, String content, int pid) {
        tv_assessType.setText(content);
        grateId = pid;
    }

    @Override
    public void onDepartClick(int type, String depart, String content, int pid, String code) {

    }

    @Override
    public void onSuperClick(List<String> datasScore, List<String> itemIds) {
        scoreDatas = datasScore;
        this.itemIds = itemIds;
        String text1 = "";
        String text2 = "";
        for (int i = 0; i < datasScore.size(); i ++) {
            text1 += datasScore.get(i) + "    ";
        }
        for (int i = 0; i < itemIds.size(); i ++) {
            text2 += itemIds.get(i) + "    ";
        }

    }

    @Override
    public void onLoweClick(List<String> datasScore, List<String> itemIds) {
        scoreDatas1 = datasScore;
        itemIds1 = itemIds;
    }
}
