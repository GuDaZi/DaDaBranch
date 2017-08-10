package com.xianzhi.integration.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @Administrator LiBo.
 * @Date 2017/7/25.
 * @Function
 */

public class TableBean implements Serializable {

    private String itemId;
    private String type;
    /**
     * sjldList : [{"sjzx_update_time":null,"reason":"解放路看电视剧了开房记录可视对讲","veto_id":null,"sjzx_update_useruuid":null,"score":12,"type":1,"sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","deleted":0,"sjzx_update_username":null,"approve_id":30816,"id":23602,"create_time":"2017-07-13 16:13:29","sjzx_create_username":"沈阳车务段管理员","user_id":189516,"sjzx_create_time":"2017-07-13 16:13:29"}]
     * selfRealistic : {"sjzx_update_time":"2017-07-13 14:40:08","user_dept_name":"安全科","user_dept_full_name":"沈阳铁路局-运输处-沈阳车务段-安全科","user_dept_id":3870,"set_user":"沈阳车务段管理员","sjzx_update_username":"沈阳车务段管理员","id":26436,"add_score":4,"realistic_time":null,"opinion":null,"user_id":189516,"user_dept_code":"0001000900220008","minus_score":null,"set_user_id":189516,"status":0,"sjzx_update_useruuid":"9BCA50CE85854539BAD347B10643AC9E","sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","bzgznr":"1,sfsdg\r\n2gsdg","deleted":0,"bzgzbz":"1,梵蒂冈东方红东方\r\n2，dfgdhfj","content":"567页面","user_name":"沈阳车务段管理员","leader_id":null,"create_time":"2017-07-06 21:23:21","month":"2017-07","sjzx_create_username":"沈阳车务段管理员","sjzx_create_time":"2017-07-06 21:23:12"}
     * approve : {"sjzx_update_time":"2017-07-19 09:58:42","danger_solve_num":0,"lrk_score":10,"add_num_comtent":"Z:5,Y:6,T:0,J:1,P:0,","self_score":73,"danger_solve_minus_scpre":0,"sjzx_update_username":"沈阳车务段管理员","problem_awh_minus":0,"add_score1":0,"add_score":88,"add_min_score":95,"add_score2":0,"problem_key_time_add":0,"leader_name3":"沈阳车务段管理员","leader_name1":"沈阳车务段管理员","leader_name2":"沈阳车务段管理员","del_time":null,"problem_real_minus_score":0,"lrk_level_name":"一级","starting_score":"0","del_user_name":null,"status":1,"problem_key_time_minus":0,"problem_awh_add":0,"danger_find_num":4,"del_user_id":null,"warning_add_score":null,"self_realistic":-5,"problem_minus_score":0,"risk_con_score":-10,"cwd_name":"沈阳车务段","create_time":"2017-07-13 14:40:20","month":"2017-07","leader_status1":1,"leader_status2":1,"final_level":56,"comment1":"是打发撒大姐夫骷髅精灵","comment2":"圣诞节疯狂就爱上了科技离开","cwd_id":3862,"id":30816,"danger_find_add_score":72,"min_score":-15,"sjld_score":12,"minus_score2":0,"minus_score1":0,"leader_id3":189516,"user_id":189516,"leader_id1":189516,"leader_id2":189516,"cwd_code":"000100090022","approve_time2":"2017-07-19 09:58:25","approve_time1":"2017-07-19 09:57:14","final_level_name":"二级","veto_id":null,"approve_time3":"2017-07-19 09:58:42","sjzx_update_useruuid":"9BCA50CE85854539BAD347B10643AC9E","lrk_level":55,"top_score":"100","self_reduction":0,"danger_solve_minus_num":0,"warning_min_score":null,"sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","temp7":null,"danger_solve_add_score":0,"final_score":95,"temp4":null,"problem_real_add_score":16,"problem_add_score":27,"sjzx_create_username":"沈阳车务段管理员","self_level_name":"三级","sjzx_create_time":"2017-07-13 14:40:10","minus_num_comtent":"T:0,J:0,P:0,Z:0,Y:0,"}
     * propertyTypeList : [{"num":"5","typename":"Z"},{"num":"6","typename":"Y"},{"num":"0","typename":"T"},{"num":"1","typename":"J"},{"num":"0","typename":"P"}]
     * deptLevel : {"id":3870,"level_name":"二级","level":4,"rownum_":1,"name":"安全科","type":11}
     * levelList : [{"sjzx_update_time":null,"sort":1,"sjzx_update_useruuid":null,"score_to":100,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":55,"colour":1,"level_name":"一级","sjzx_create_username":null,"score_from":90,"sjzx_create_time":"2017-06-12 10:39:16","unit_code":"0001000900220008"},{"sjzx_update_time":null,"sort":2,"sjzx_update_useruuid":null,"score_to":89.9,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":56,"colour":2,"level_name":"二级","sjzx_create_username":null,"score_from":80,"sjzx_create_time":"2017-06-12 10:39:16","unit_code":"0001000900220008"},{"sjzx_update_time":null,"sort":3,"sjzx_update_useruuid":null,"score_to":79.9,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":57,"colour":3,"level_name":"三级","sjzx_create_username":null,"score_from":60,"sjzx_create_time":"2017-06-12 10:39:16","unit_code":"0001000900220008"},{"sjzx_update_time":null,"sort":4,"sjzx_update_useruuid":null,"score_to":59.9,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":58,"colour":4,"level_name":"失格","sjzx_create_username":null,"score_from":0,"sjzx_create_time":"2017-06-12 10:39:16","unit_code":"0001000900220008"}]
     * propertyList : [{"problem_type_name":"Y","pym":"ybszsz","sjzx_update_time":"2017-06-29 21:35:38","sjzx_update_useruuid":"9BCA50CE85854539BAD347B10643AC9E","pid":1,"code":null,"problem_type_id":2,"type":2,"sjzx_create_useruuid":"897103B02CA448C5BFE243B824DC0200","deleted":0,"sjzx_update_username":"沈阳车务段管理员","id":51,"is_leader":0,"name":"一般失职失责","sjzx_create_username":"赤峰车务段系统管理员","sjzx_create_time":"2017-06-19 14:07:21"},{"problem_type_name":"Z","pym":"yzszsz","sjzx_update_time":"2017-06-29 21:35:13","sjzx_update_useruuid":"9BCA50CE85854539BAD347B10643AC9E","pid":1,"code":null,"problem_type_id":1,"type":2,"sjzx_create_useruuid":"897103B02CA448C5BFE243B824DC0200","deleted":0,"sjzx_update_username":"沈阳车务段管理员","id":52,"is_leader":0,"name":"严重失职失责","sjzx_create_username":"赤峰车务段系统管理员","sjzx_create_time":"2017-06-19 14:07:07"},{"problem_type_name":"P","pym":"ppjy","sjzx_update_time":null,"sjzx_update_useruuid":null,"pid":2,"code":null,"problem_type_id":5,"type":2,"sjzx_create_useruuid":"897103B02CA448C5BFE243B824DC0200","deleted":0,"sjzx_update_username":null,"id":101,"is_leader":0,"name":"批评教育","sjzx_create_username":"赤峰车务段系统管理员","sjzx_create_time":"2017-06-19 14:09:47"},{"problem_type_name":"Y","pym":"yblgkh","sjzx_update_time":null,"sjzx_update_useruuid":null,"pid":2,"code":null,"problem_type_id":2,"type":2,"sjzx_create_useruuid":"897103B02CA448C5BFE243B824DC0200","deleted":0,"sjzx_update_username":null,"id":102,"is_leader":0,"name":"一般联挂考核","sjzx_create_username":"赤峰车务段系统管理员","sjzx_create_time":"2017-06-19 14:09:10"},{"problem_type_name":"J","pym":"jyzlgkh","sjzx_update_time":null,"sjzx_update_useruuid":null,"pid":2,"code":null,"problem_type_id":4,"type":2,"sjzx_create_useruuid":"897103B02CA448C5BFE243B824DC0200","deleted":0,"sjzx_update_username":null,"id":103,"is_leader":0,"name":"较严重联挂考核","sjzx_create_username":"赤峰车务段系统管理员","sjzx_create_time":"2017-06-19 14:08:50"},{"problem_type_name":"Z","pym":"yzlgkh","sjzx_update_time":null,"sjzx_update_useruuid":null,"pid":2,"code":null,"problem_type_id":1,"type":2,"sjzx_create_useruuid":"897103B02CA448C5BFE243B824DC0200","deleted":0,"sjzx_update_username":null,"id":104,"is_leader":0,"name":"严重联挂考核","sjzx_create_username":"赤峰车务段系统管理员","sjzx_create_time":"2017-06-19 14:08:31"},{"problem_type_name":"T","pym":"nbxg","sjzx_update_time":null,"sjzx_update_useruuid":null,"pid":2,"code":null,"problem_type_id":3,"type":2,"sjzx_create_useruuid":"897103B02CA448C5BFE243B824DC0200","deleted":0,"sjzx_update_username":null,"id":105,"is_leader":0,"name":"内部下岗","sjzx_create_username":"赤峰车务段系统管理员","sjzx_create_time":"2017-06-19 14:08:02"},{"problem_type_name":"T","pym":"dzgzgwhhxwt","sjzx_update_time":"2017-06-29 21:33:18","sjzx_update_useruuid":"9BCA50CE85854539BAD347B10643AC9E","pid":2,"code":null,"problem_type_id":3,"type":2,"sjzx_create_useruuid":"897103B02CA448C5BFE243B824DC0200","deleted":0,"sjzx_update_username":"沈阳车务段管理员","id":106,"is_leader":0,"name":"调整工作岗位（含\u201c红线\u201d问题）","sjzx_create_username":"赤峰车务段系统管理员","sjzx_create_time":"2017-06-19 14:07:45"}]
     * riskConList : [{"dynamic":0,"content":"每月检查接发列车","id":1279,"normal_done":2,"count":0,"normal":2,"dynamic_done":0,"extra_done":10,"minus_score":5,"pre_id":844557},{"dynamic":0,"content":"每月监听、回放车机联控","id":2892,"normal_done":0,"count":0,"normal":2,"dynamic_done":0,"extra_done":4,"minus_score":5,"pre_id":844558},{"dynamic":0,"content":"每月检查调车作业","id":1283,"normal_done":0,"count":0,"normal":2,"dynamic_done":0,"extra_done":2,"minus_score":5,"pre_id":844559}]
     * reductionList : []
     * warnAddScore : [{"num":null,"name":"干部履职预警","warn_type":null},{"num":null,"name":"关键人员预警","warn_type":null}]
     * vetoList : []
     * lrkList : [{"sjzx_update_time":null,"reason":"的数据阿弗莱克绝对是来看","veto_id":null,"sjzx_update_useruuid":null,"score":10,"type":2,"sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","deleted":0,"sjzx_update_username":null,"approve_id":30816,"id":23632,"create_time":"2017-07-19 09:58:10","sjzx_create_username":"沈阳车务段管理员","user_id":189516,"sjzx_create_time":"2017-07-19 09:58:10"}]
     * vetoAllList : [{"id":101,"sjzx_update_time":null,"sort":1,"condition":"未履职尽责的干部（包括管理甩手的干部）","sjzx_update_useruuid":null,"sjzx_create_username":null,"sjzx_create_useruuid":null,"sjzx_create_time":"2017-06-12 11:07:10","deleted":0,"sjzx_update_username":null,"unit_code":"0001000900220008"},{"id":103,"sjzx_update_time":null,"sort":3,"condition":"无故未完成段规定的检查任务的","sjzx_update_useruuid":null,"sjzx_create_username":null,"sjzx_create_useruuid":null,"sjzx_create_time":"2017-06-12 11:07:10","deleted":0,"sjzx_update_username":null,"unit_code":"0001000900220008"},{"id":104,"sjzx_update_time":null,"sort":4,"condition":"无故不参加段安排包保任务的","sjzx_update_useruuid":null,"sjzx_create_username":null,"sjzx_create_useruuid":null,"sjzx_create_time":"2017-06-12 11:07:10","deleted":0,"sjzx_update_username":null,"unit_code":"0001000900220008"},{"id":105,"sjzx_update_time":null,"sort":5,"condition":"发现问题避重就轻、考核弄虚作假的","sjzx_update_useruuid":null,"sjzx_create_username":null,"sjzx_create_useruuid":null,"sjzx_create_time":"2017-06-12 11:07:10","deleted":0,"sjzx_update_username":null,"unit_code":"0001000900220008"},{"id":107,"sjzx_update_time":null,"sort":7,"condition":"发生假信息、假考核、假添乘、假培训等弄虚作假问题","sjzx_update_useruuid":null,"sjzx_create_username":null,"sjzx_create_useruuid":null,"sjzx_create_time":"2017-06-12 11:07:10","deleted":0,"sjzx_update_username":null,"unit_code":"0001000900220008"},{"id":108,"sjzx_update_time":null,"sort":8,"condition":"发生客服质量事件或违法治安案件、违反党风廉政设事件","sjzx_update_useruuid":null,"sjzx_create_username":null,"sjzx_create_useruuid":null,"sjzx_create_time":"2017-06-12 11:07:10","deleted":0,"sjzx_update_username":null,"unit_code":"0001000900220008"},{"id":110,"sjzx_update_time":null,"sort":10,"condition":"受到警告及以上处分","sjzx_update_useruuid":null,"sjzx_create_username":null,"sjzx_create_useruuid":null,"sjzx_create_time":"2017-06-12 11:07:10","deleted":0,"sjzx_update_username":null,"unit_code":"0001000900220008"},{"id":102,"sjzx_update_time":null,"sort":2,"condition":"被路局下达\u201c失管问题通知书\u201d的干部","sjzx_update_useruuid":null,"sjzx_create_username":null,"sjzx_create_useruuid":null,"sjzx_create_time":"2017-06-12 11:07:10","deleted":0,"sjzx_update_username":null,"unit_code":"0001000900220008"},{"id":106,"sjzx_update_time":null,"sort":6,"condition":"违反巡视整改制度","sjzx_update_useruuid":null,"sjzx_create_username":null,"sjzx_create_useruuid":null,"sjzx_create_time":"2017-06-12 11:07:10","deleted":0,"sjzx_update_username":null,"unit_code":"0001000900220008"},{"id":109,"sjzx_update_time":null,"sort":9,"condition":"发生违反中央8项规定、总公司18条措施和路局28条具体要求及坚决纠正四风问题10条决定等违纪违规问题","sjzx_update_useruuid":null,"sjzx_create_username":null,"sjzx_create_useruuid":null,"sjzx_create_time":"2017-06-12 11:07:10","deleted":0,"sjzx_update_username":null,"unit_code":"0001000900220008"}]
     * propertyTypeMinusList : [{"num":"0","typename":"T"},{"num":"0","typename":"J"},{"num":"0","typename":"P"},{"num":"0","typename":"Z"},{"num":"0","typename":"Y"}]
     * month : 2017-07
     * tableTitle : {"title6_name":"考核情况","sjzx_update_time":null,"sjzx_update_useruuid":null,"title8_name":null,"sjzx_create_useruuid":null,"title3_name":"现场控制","sjzx_update_username":null,"id":221,"title2_name":"本职工作","title4_name":"加减分原因","title5_name":"考核人意见","sjzx_create_username":null,"title7_name":"领导签批","sjzx_create_time":"2017-06-12 11:07:10","title1_name":"否决条件","unit_code":"000100090022"}
     * user : {"birth":"20170124","dept_name4":"安全科","dept_name3":"沈阳车务段","dept_name1":"沈阳铁路局","sso_uuid":"9BCA50CE85854539BAD347B10643AC9E","leader_type":1,"quan_post_name":"测试日勤岗","bzb":0,"dept_full_name":"沈阳铁路局-运输处-沈阳车务段-安全科","laid_off_time":null,"dept_name7":null,"dept_name5":null,"dept_name6":null,"ctc":0,"dept_code7":null,"dept_code6":null,"user_type_name":"在岗工作","dept_code5":null,"seniority1":null,"dept_code4":"0001000900220008","dept_code3":"000100090022","pm":0,"isshangbao":"0","position":3877,"dt":0,"fhy":0,"sys":0,"lw":0,"zdz":0,"is_leadership":1,"start_work_date":"20370124","dept_id":3870,"dg":0,"token":"098CDE226D8638E59D8727C5AA738F21","ccsj":0,"position_duty":null,"dept_cwd_or_stn_name":"沈阳车务段","dept_station_code":null,"post":1,"dept_station_name":null,"technical_level":null,"dept_name":"安全科","labor":null,"dept_cwd_or_stn_code":"000100090022","feeling":null,"login_name":"admin-sycwd","user_type_id":1,"lzh":"189516","cb":0,"card_number":null,"tel":null,"tf":0,"quan_post_id":104,"type":0,"remark1":null,"password":"C4CA4238A0B923820DCC509A6F75849B","remark3":null,"remark2":null,"is_leader":0,"gender":1,"inbox_do_sort":"SEND_USER1","dept_cwd_name":"沈阳车务段","seniority":1,"post_name":"空","dc":0,"technical_level_name":null,"jsj":0,"dept_code":"0001000900220008","leader_type_name":"专业技术","key_person_mark":0,"deleted":0,"6502":0,"position_name":"工程师","email":null,"dept_cwd_code":"000100090022","create_time":"2017-01-24 23:37:14","work_experience":null,"ch":0,"zg":0,"pym":"sycwdgly","zb":0,"cert_id":null,"cancel_status":0,"hj":0,"dept_type":11,"id_card":"admin-sycwd","last_login_ip":null,"education":"本科","ljy":0,"id":189516,"name":"沈阳车务段管理员","sso_app_name":null,"outbox_do_sort":"CREATE_DATE2","ethnic":null,"political":null,"working_time":null,"last_login_time":"2017-07-25 13:04:31","yb":0,"photo":null,"dcz":0,"login_count":6167}
     * warnMinScore : [{"num":null,"name":"失检天数预警","warn_type":null},{"num":null,"name":"问题性质预警","warn_type":null},{"num":null,"name":"部门等级预警","warn_type":null},{"num":null,"name":"风险失控预警","warn_type":null},{"num":null,"name":"干部履职预警","warn_type":null},{"num":null,"name":"施工安全预警","warn_type":null},{"num":null,"name":"关键人员预警","warn_type":null}]
     */

    private SelfRealisticBean selfRealistic;
    private ApproveBean approve;
    private DeptLevelBean deptLevel;
    private String month;
    private TableTitleBean tableTitle;
    private UserBean user;
    private List<SjldListBean> sjldList;
    private List<PropertyTypeListBean> propertyTypeList;
    private List<LevelListBean> levelList;
    private List<PropertyListBean> propertyList;
    private List<RiskConListBean> riskConList;
    private List<?> reductionList;
    private List<WarnAddScoreBean> warnAddScore;
    private List<VetoListBean> vetoList;
    private List<LrkListBean> lrkList;
    private List<VetoAllListBean> vetoAllList;
    private List<PropertyTypeMinusListBean> propertyTypeMinusList;
    private List<WarnMinScoreBean> warnMinScore;
    private String zNodes;

    public String getzNodes() {
        return zNodes;
    }

    public void setzNodes(String zNodes) {
        this.zNodes = zNodes;
    }

    public TableBean() {
    }

    public TableBean(String itemId, String type) {
        this.itemId = itemId;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public SelfRealisticBean getSelfRealistic() {
        return selfRealistic;
    }

    public void setSelfRealistic(SelfRealisticBean selfRealistic) {
        this.selfRealistic = selfRealistic;
    }

    public ApproveBean getApprove() {
        return approve;
    }

    public void setApprove(ApproveBean approve) {
        this.approve = approve;
    }

    public DeptLevelBean getDeptLevel() {
        return deptLevel;
    }

    public void setDeptLevel(DeptLevelBean deptLevel) {
        this.deptLevel = deptLevel;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public TableTitleBean getTableTitle() {
        return tableTitle;
    }

    public void setTableTitle(TableTitleBean tableTitle) {
        this.tableTitle = tableTitle;
    }

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public List<SjldListBean> getSjldList() {
        return sjldList;
    }

    public void setSjldList(List<SjldListBean> sjldList) {
        this.sjldList = sjldList;
    }

    public List<PropertyTypeListBean> getPropertyTypeList() {
        return propertyTypeList;
    }

    public void setPropertyTypeList(List<PropertyTypeListBean> propertyTypeList) {
        this.propertyTypeList = propertyTypeList;
    }

    public List<LevelListBean> getLevelList() {
        return levelList;
    }

    public void setLevelList(List<LevelListBean> levelList) {
        this.levelList = levelList;
    }

    public List<PropertyListBean> getPropertyList() {
        return propertyList;
    }

    public void setPropertyList(List<PropertyListBean> propertyList) {
        this.propertyList = propertyList;
    }

    public List<RiskConListBean> getRiskConList() {
        return riskConList;
    }

    public void setRiskConList(List<RiskConListBean> riskConList) {
        this.riskConList = riskConList;
    }

    public List<?> getReductionList() {
        return reductionList;
    }

    public void setReductionList(List<?> reductionList) {
        this.reductionList = reductionList;
    }

    public List<WarnAddScoreBean> getWarnAddScore() {
        return warnAddScore;
    }

    public void setWarnAddScore(List<WarnAddScoreBean> warnAddScore) {
        this.warnAddScore = warnAddScore;
    }

    public List<VetoListBean> getVetoList() {
        return vetoList;
    }

    public void setVetoList(List<VetoListBean> vetoList) {
        this.vetoList = vetoList;
    }

    public List<LrkListBean> getLrkList() {
        return lrkList;
    }

    public void setLrkList(List<LrkListBean> lrkList) {
        this.lrkList = lrkList;
    }

    public List<VetoAllListBean> getVetoAllList() {
        return vetoAllList;
    }

    public void setVetoAllList(List<VetoAllListBean> vetoAllList) {
        this.vetoAllList = vetoAllList;
    }

    public List<PropertyTypeMinusListBean> getPropertyTypeMinusList() {
        return propertyTypeMinusList;
    }

    public void setPropertyTypeMinusList(List<PropertyTypeMinusListBean> propertyTypeMinusList) {
        this.propertyTypeMinusList = propertyTypeMinusList;
    }

    public List<WarnMinScoreBean> getWarnMinScore() {
        return warnMinScore;
    }

    public void setWarnMinScore(List<WarnMinScoreBean> warnMinScore) {
        this.warnMinScore = warnMinScore;
    }

    public static class SelfRealisticBean {
        /**
         * sjzx_update_time : 2017-07-13 14:40:08
         * user_dept_name : 安全科
         * user_dept_full_name : 沈阳铁路局-运输处-沈阳车务段-安全科
         * user_dept_id : 3870
         * set_user : 沈阳车务段管理员
         * sjzx_update_username : 沈阳车务段管理员
         * id : 26436
         * add_score : 4
         * realistic_time : null
         * opinion : null
         * user_id : 189516
         * user_dept_code : 0001000900220008
         * minus_score : null
         * set_user_id : 189516
         * status : 0
         * sjzx_update_useruuid : 9BCA50CE85854539BAD347B10643AC9E
         * sjzx_create_useruuid : 9BCA50CE85854539BAD347B10643AC9E
         * bzgznr : 1,sfsdg
         2gsdg
         * deleted : 0
         * bzgzbz : 1,梵蒂冈东方红东方
         2，dfgdhfj
         * content : 567页面
         * user_name : 沈阳车务段管理员
         * leader_id : null
         * create_time : 2017-07-06 21:23:21
         * month : 2017-07
         * sjzx_create_username : 沈阳车务段管理员
         * sjzx_create_time : 2017-07-06 21:23:12
         */

        private String sjzx_update_time;
        private String user_dept_name;
        private String user_dept_full_name;
        private int user_dept_id;
        private String set_user;
        private String sjzx_update_username;
        private int id;
        private int add_score;
        private Object realistic_time;
        private Object opinion;
        private int user_id;
        private String user_dept_code;
        private int minus_score;
        private int set_user_id;
        private int status;
        private String sjzx_update_useruuid;
        private String sjzx_create_useruuid;
        private String bzgznr;
        private int deleted;
        private String bzgzbz;
        private String content;
        private String user_name;
        private Object leader_id;
        private String create_time;
        private String month;
        private String sjzx_create_username;
        private String sjzx_create_time;

        public String getSjzx_update_time() {
            return sjzx_update_time;
        }

        public void setSjzx_update_time(String sjzx_update_time) {
            this.sjzx_update_time = sjzx_update_time;
        }

        public String getUser_dept_name() {
            return user_dept_name;
        }

        public void setUser_dept_name(String user_dept_name) {
            this.user_dept_name = user_dept_name;
        }

        public String getUser_dept_full_name() {
            return user_dept_full_name;
        }

        public void setUser_dept_full_name(String user_dept_full_name) {
            this.user_dept_full_name = user_dept_full_name;
        }

        public int getUser_dept_id() {
            return user_dept_id;
        }

        public void setUser_dept_id(int user_dept_id) {
            this.user_dept_id = user_dept_id;
        }

        public String getSet_user() {
            return set_user;
        }

        public void setSet_user(String set_user) {
            this.set_user = set_user;
        }

        public String getSjzx_update_username() {
            return sjzx_update_username;
        }

        public void setSjzx_update_username(String sjzx_update_username) {
            this.sjzx_update_username = sjzx_update_username;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getAdd_score() {
            return add_score;
        }

        public void setAdd_score(int add_score) {
            this.add_score = add_score;
        }

        public Object getRealistic_time() {
            return realistic_time;
        }

        public void setRealistic_time(Object realistic_time) {
            this.realistic_time = realistic_time;
        }

        public Object getOpinion() {
            return opinion;
        }

        public void setOpinion(Object opinion) {
            this.opinion = opinion;
        }

        public int getUser_id() {
            return user_id;
        }

        public void setUser_id(int user_id) {
            this.user_id = user_id;
        }

        public String getUser_dept_code() {
            return user_dept_code;
        }

        public void setUser_dept_code(String user_dept_code) {
            this.user_dept_code = user_dept_code;
        }

        public int getMinus_score() {
            return minus_score;
        }

        public void setMinus_score(int minus_score) {
            this.minus_score = minus_score;
        }

        public int getSet_user_id() {
            return set_user_id;
        }

        public void setSet_user_id(int set_user_id) {
            this.set_user_id = set_user_id;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getSjzx_update_useruuid() {
            return sjzx_update_useruuid;
        }

        public void setSjzx_update_useruuid(String sjzx_update_useruuid) {
            this.sjzx_update_useruuid = sjzx_update_useruuid;
        }

        public String getSjzx_create_useruuid() {
            return sjzx_create_useruuid;
        }

        public void setSjzx_create_useruuid(String sjzx_create_useruuid) {
            this.sjzx_create_useruuid = sjzx_create_useruuid;
        }

        public String getBzgznr() {
            return bzgznr;
        }

        public void setBzgznr(String bzgznr) {
            this.bzgznr = bzgznr;
        }

        public int getDeleted() {
            return deleted;
        }

        public void setDeleted(int deleted) {
            this.deleted = deleted;
        }

        public String getBzgzbz() {
            return bzgzbz;
        }

        public void setBzgzbz(String bzgzbz) {
            this.bzgzbz = bzgzbz;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getUser_name() {
            return user_name;
        }

        public void setUser_name(String user_name) {
            this.user_name = user_name;
        }

        public Object getLeader_id() {
            return leader_id;
        }

        public void setLeader_id(Object leader_id) {
            this.leader_id = leader_id;
        }

        public String getCreate_time() {
            return create_time;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }

        public String getMonth() {
            return month;
        }

        public void setMonth(String month) {
            this.month = month;
        }

        public String getSjzx_create_username() {
            return sjzx_create_username;
        }

        public void setSjzx_create_username(String sjzx_create_username) {
            this.sjzx_create_username = sjzx_create_username;
        }

        public String getSjzx_create_time() {
            return sjzx_create_time;
        }

        public void setSjzx_create_time(String sjzx_create_time) {
            this.sjzx_create_time = sjzx_create_time;
        }
    }

    public static class ApproveBean {
        /**
         * sjzx_update_time : 2017-07-19 09:58:42
         * danger_solve_num : 0
         * lrk_score : 10
         * add_num_comtent : Z:5,Y:6,T:0,J:1,P:0,
         * self_score : 73
         * danger_solve_minus_scpre : 0
         * sjzx_update_username : 沈阳车务段管理员
         * problem_awh_minus : 0
         * add_score1 : 0
         * add_score : 88
         * add_min_score : 95
         * add_score2 : 0
         * problem_key_time_add : 0
         * leader_name3 : 沈阳车务段管理员
         * leader_name1 : 沈阳车务段管理员
         * leader_name2 : 沈阳车务段管理员
         * del_time : null
         * problem_real_minus_score : 0
         * lrk_level_name : 一级
         * starting_score : 0
         * del_user_name : null
         * status : 1
         * problem_key_time_minus : 0
         * problem_awh_add : 0
         * danger_find_num : 4
         * del_user_id : null
         * warning_add_score : null
         * self_realistic : -5
         * problem_minus_score : 0
         * risk_con_score : -10
         * cwd_name : 沈阳车务段
         * create_time : 2017-07-13 14:40:20
         * month : 2017-07
         * leader_status1 : 1
         * leader_status2 : 1
         * final_level : 56
         * comment1 : 是打发撒大姐夫骷髅精灵
         * comment2 : 圣诞节疯狂就爱上了科技离开
         * cwd_id : 3862
         * id : 30816
         * danger_find_add_score : 72
         * min_score : -15
         * sjld_score : 12
         * minus_score2 : 0
         * minus_score1 : 0
         * leader_id3 : 189516
         * user_id : 189516
         * leader_id1 : 189516
         * leader_id2 : 189516
         * cwd_code : 000100090022
         * approve_time2 : 2017-07-19 09:58:25
         * approve_time1 : 2017-07-19 09:57:14
         * final_level_name : 二级
         * veto_id : null
         * approve_time3 : 2017-07-19 09:58:42
         * sjzx_update_useruuid : 9BCA50CE85854539BAD347B10643AC9E
         * lrk_level : 55
         * top_score : 100
         * self_reduction : 0
         * danger_solve_minus_num : 0
         * warning_min_score : null
         * sjzx_create_useruuid : 9BCA50CE85854539BAD347B10643AC9E
         * temp7 : null
         * danger_solve_add_score : 0
         * final_score : 95
         * temp4 : null
         * problem_real_add_score : 16
         * problem_add_score : 27
         * sjzx_create_username : 沈阳车务段管理员
         * self_level_name : 三级
         * sjzx_create_time : 2017-07-13 14:40:10
         * minus_num_comtent : T:0,J:0,P:0,Z:0,Y:0,
         */

        private String sjzx_update_time;
        private int danger_solve_num;
        private int lrk_score;
        private String add_num_comtent;
        private int self_score;
        private int danger_solve_minus_scpre;
        private String sjzx_update_username;
        private int problem_awh_minus;
        private int add_score1;
        private int add_score;
        private int add_min_score;
        private int add_score2;
        private int problem_key_time_add;
        private String leader_name3;
        private String leader_name1;
        private String leader_name2;
        private Object del_time;
        private int problem_real_minus_score;
        private String lrk_level_name;
        private String starting_score;
        private Object del_user_name;
        private int status;
        private int problem_key_time_minus;
        private int problem_awh_add;
        private int danger_find_num;
        private Object del_user_id;
        private Object warning_add_score;
        private int self_realistic;
        private int problem_minus_score;
        private int risk_con_score;
        private String cwd_name;
        private String create_time;
        private String month;
        private int leader_status1;
        private int leader_status2;
        private int final_level;
        private String comment1;
        private String comment2;
        private int cwd_id;
        private int id;
        private int danger_find_add_score;
        private int min_score;
        private int sjld_score;
        private int minus_score2;
        private int minus_score1;
        private int leader_id3;
        private int user_id;
        private int leader_id1;
        private int leader_id2;
        private String cwd_code;
        private String approve_time2;
        private String approve_time1;
        private String final_level_name;
        private Object veto_id;
        private String approve_time3;
        private String sjzx_update_useruuid;
        private int lrk_level;
        private String top_score;
        private int self_reduction;
        private int danger_solve_minus_num;
        private Object warning_min_score;
        private String sjzx_create_useruuid;
        private Object temp7;
        private int danger_solve_add_score;
        private int final_score;
        private Object temp4;
        private int problem_real_add_score;
        private int problem_add_score;
        private String sjzx_create_username;
        private String self_level_name;
        private String sjzx_create_time;
        private String minus_num_comtent;

        public String getSjzx_update_time() {
            return sjzx_update_time;
        }

        public void setSjzx_update_time(String sjzx_update_time) {
            this.sjzx_update_time = sjzx_update_time;
        }

        public int getDanger_solve_num() {
            return danger_solve_num;
        }

        public void setDanger_solve_num(int danger_solve_num) {
            this.danger_solve_num = danger_solve_num;
        }

        public int getLrk_score() {
            return lrk_score;
        }

        public void setLrk_score(int lrk_score) {
            this.lrk_score = lrk_score;
        }

        public String getAdd_num_comtent() {
            return add_num_comtent;
        }

        public void setAdd_num_comtent(String add_num_comtent) {
            this.add_num_comtent = add_num_comtent;
        }

        public int getSelf_score() {
            return self_score;
        }

        public void setSelf_score(int self_score) {
            this.self_score = self_score;
        }

        public int getDanger_solve_minus_scpre() {
            return danger_solve_minus_scpre;
        }

        public void setDanger_solve_minus_scpre(int danger_solve_minus_scpre) {
            this.danger_solve_minus_scpre = danger_solve_minus_scpre;
        }

        public String getSjzx_update_username() {
            return sjzx_update_username;
        }

        public void setSjzx_update_username(String sjzx_update_username) {
            this.sjzx_update_username = sjzx_update_username;
        }

        public int getProblem_awh_minus() {
            return problem_awh_minus;
        }

        public void setProblem_awh_minus(int problem_awh_minus) {
            this.problem_awh_minus = problem_awh_minus;
        }

        public int getAdd_score1() {
            return add_score1;
        }

        public void setAdd_score1(int add_score1) {
            this.add_score1 = add_score1;
        }

        public int getAdd_score() {
            return add_score;
        }

        public void setAdd_score(int add_score) {
            this.add_score = add_score;
        }

        public int getAdd_min_score() {
            return add_min_score;
        }

        public void setAdd_min_score(int add_min_score) {
            this.add_min_score = add_min_score;
        }

        public int getAdd_score2() {
            return add_score2;
        }

        public void setAdd_score2(int add_score2) {
            this.add_score2 = add_score2;
        }

        public int getProblem_key_time_add() {
            return problem_key_time_add;
        }

        public void setProblem_key_time_add(int problem_key_time_add) {
            this.problem_key_time_add = problem_key_time_add;
        }

        public String getLeader_name3() {
            return leader_name3;
        }

        public void setLeader_name3(String leader_name3) {
            this.leader_name3 = leader_name3;
        }

        public String getLeader_name1() {
            return leader_name1;
        }

        public void setLeader_name1(String leader_name1) {
            this.leader_name1 = leader_name1;
        }

        public String getLeader_name2() {
            return leader_name2;
        }

        public void setLeader_name2(String leader_name2) {
            this.leader_name2 = leader_name2;
        }

        public Object getDel_time() {
            return del_time;
        }

        public void setDel_time(Object del_time) {
            this.del_time = del_time;
        }

        public int getProblem_real_minus_score() {
            return problem_real_minus_score;
        }

        public void setProblem_real_minus_score(int problem_real_minus_score) {
            this.problem_real_minus_score = problem_real_minus_score;
        }

        public String getLrk_level_name() {
            return lrk_level_name;
        }

        public void setLrk_level_name(String lrk_level_name) {
            this.lrk_level_name = lrk_level_name;
        }

        public String getStarting_score() {
            return starting_score;
        }

        public void setStarting_score(String starting_score) {
            this.starting_score = starting_score;
        }

        public Object getDel_user_name() {
            return del_user_name;
        }

        public void setDel_user_name(Object del_user_name) {
            this.del_user_name = del_user_name;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getProblem_key_time_minus() {
            return problem_key_time_minus;
        }

        public void setProblem_key_time_minus(int problem_key_time_minus) {
            this.problem_key_time_minus = problem_key_time_minus;
        }

        public int getProblem_awh_add() {
            return problem_awh_add;
        }

        public void setProblem_awh_add(int problem_awh_add) {
            this.problem_awh_add = problem_awh_add;
        }

        public int getDanger_find_num() {
            return danger_find_num;
        }

        public void setDanger_find_num(int danger_find_num) {
            this.danger_find_num = danger_find_num;
        }

        public Object getDel_user_id() {
            return del_user_id;
        }

        public void setDel_user_id(Object del_user_id) {
            this.del_user_id = del_user_id;
        }

        public Object getWarning_add_score() {
            return warning_add_score;
        }

        public void setWarning_add_score(Object warning_add_score) {
            this.warning_add_score = warning_add_score;
        }

        public int getSelf_realistic() {
            return self_realistic;
        }

        public void setSelf_realistic(int self_realistic) {
            this.self_realistic = self_realistic;
        }

        public int getProblem_minus_score() {
            return problem_minus_score;
        }

        public void setProblem_minus_score(int problem_minus_score) {
            this.problem_minus_score = problem_minus_score;
        }

        public int getRisk_con_score() {
            return risk_con_score;
        }

        public void setRisk_con_score(int risk_con_score) {
            this.risk_con_score = risk_con_score;
        }

        public String getCwd_name() {
            return cwd_name;
        }

        public void setCwd_name(String cwd_name) {
            this.cwd_name = cwd_name;
        }

        public String getCreate_time() {
            return create_time;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }

        public String getMonth() {
            return month;
        }

        public void setMonth(String month) {
            this.month = month;
        }

        public int getLeader_status1() {
            return leader_status1;
        }

        public void setLeader_status1(int leader_status1) {
            this.leader_status1 = leader_status1;
        }

        public int getLeader_status2() {
            return leader_status2;
        }

        public void setLeader_status2(int leader_status2) {
            this.leader_status2 = leader_status2;
        }

        public int getFinal_level() {
            return final_level;
        }

        public void setFinal_level(int final_level) {
            this.final_level = final_level;
        }

        public String getComment1() {
            return comment1;
        }

        public void setComment1(String comment1) {
            this.comment1 = comment1;
        }

        public String getComment2() {
            return comment2;
        }

        public void setComment2(String comment2) {
            this.comment2 = comment2;
        }

        public int getCwd_id() {
            return cwd_id;
        }

        public void setCwd_id(int cwd_id) {
            this.cwd_id = cwd_id;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getDanger_find_add_score() {
            return danger_find_add_score;
        }

        public void setDanger_find_add_score(int danger_find_add_score) {
            this.danger_find_add_score = danger_find_add_score;
        }

        public int getMin_score() {
            return min_score;
        }

        public void setMin_score(int min_score) {
            this.min_score = min_score;
        }

        public int getSjld_score() {
            return sjld_score;
        }

        public void setSjld_score(int sjld_score) {
            this.sjld_score = sjld_score;
        }

        public int getMinus_score2() {
            return minus_score2;
        }

        public void setMinus_score2(int minus_score2) {
            this.minus_score2 = minus_score2;
        }

        public int getMinus_score1() {
            return minus_score1;
        }

        public void setMinus_score1(int minus_score1) {
            this.minus_score1 = minus_score1;
        }

        public int getLeader_id3() {
            return leader_id3;
        }

        public void setLeader_id3(int leader_id3) {
            this.leader_id3 = leader_id3;
        }

        public int getUser_id() {
            return user_id;
        }

        public void setUser_id(int user_id) {
            this.user_id = user_id;
        }

        public int getLeader_id1() {
            return leader_id1;
        }

        public void setLeader_id1(int leader_id1) {
            this.leader_id1 = leader_id1;
        }

        public int getLeader_id2() {
            return leader_id2;
        }

        public void setLeader_id2(int leader_id2) {
            this.leader_id2 = leader_id2;
        }

        public String getCwd_code() {
            return cwd_code;
        }

        public void setCwd_code(String cwd_code) {
            this.cwd_code = cwd_code;
        }

        public String getApprove_time2() {
            return approve_time2;
        }

        public void setApprove_time2(String approve_time2) {
            this.approve_time2 = approve_time2;
        }

        public String getApprove_time1() {
            return approve_time1;
        }

        public void setApprove_time1(String approve_time1) {
            this.approve_time1 = approve_time1;
        }

        public String getFinal_level_name() {
            return final_level_name;
        }

        public void setFinal_level_name(String final_level_name) {
            this.final_level_name = final_level_name;
        }

        public Object getVeto_id() {
            return veto_id;
        }

        public void setVeto_id(Object veto_id) {
            this.veto_id = veto_id;
        }

        public String getApprove_time3() {
            return approve_time3;
        }

        public void setApprove_time3(String approve_time3) {
            this.approve_time3 = approve_time3;
        }

        public String getSjzx_update_useruuid() {
            return sjzx_update_useruuid;
        }

        public void setSjzx_update_useruuid(String sjzx_update_useruuid) {
            this.sjzx_update_useruuid = sjzx_update_useruuid;
        }

        public int getLrk_level() {
            return lrk_level;
        }

        public void setLrk_level(int lrk_level) {
            this.lrk_level = lrk_level;
        }

        public String getTop_score() {
            return top_score;
        }

        public void setTop_score(String top_score) {
            this.top_score = top_score;
        }

        public int getSelf_reduction() {
            return self_reduction;
        }

        public void setSelf_reduction(int self_reduction) {
            this.self_reduction = self_reduction;
        }

        public int getDanger_solve_minus_num() {
            return danger_solve_minus_num;
        }

        public void setDanger_solve_minus_num(int danger_solve_minus_num) {
            this.danger_solve_minus_num = danger_solve_minus_num;
        }

        public Object getWarning_min_score() {
            return warning_min_score;
        }

        public void setWarning_min_score(Object warning_min_score) {
            this.warning_min_score = warning_min_score;
        }

        public String getSjzx_create_useruuid() {
            return sjzx_create_useruuid;
        }

        public void setSjzx_create_useruuid(String sjzx_create_useruuid) {
            this.sjzx_create_useruuid = sjzx_create_useruuid;
        }

        public Object getTemp7() {
            return temp7;
        }

        public void setTemp7(Object temp7) {
            this.temp7 = temp7;
        }

        public int getDanger_solve_add_score() {
            return danger_solve_add_score;
        }

        public void setDanger_solve_add_score(int danger_solve_add_score) {
            this.danger_solve_add_score = danger_solve_add_score;
        }

        public int getFinal_score() {
            return final_score;
        }

        public void setFinal_score(int final_score) {
            this.final_score = final_score;
        }

        public Object getTemp4() {
            return temp4;
        }

        public void setTemp4(Object temp4) {
            this.temp4 = temp4;
        }

        public int getProblem_real_add_score() {
            return problem_real_add_score;
        }

        public void setProblem_real_add_score(int problem_real_add_score) {
            this.problem_real_add_score = problem_real_add_score;
        }

        public int getProblem_add_score() {
            return problem_add_score;
        }

        public void setProblem_add_score(int problem_add_score) {
            this.problem_add_score = problem_add_score;
        }

        public String getSjzx_create_username() {
            return sjzx_create_username;
        }

        public void setSjzx_create_username(String sjzx_create_username) {
            this.sjzx_create_username = sjzx_create_username;
        }

        public String getSelf_level_name() {
            return self_level_name;
        }

        public void setSelf_level_name(String self_level_name) {
            this.self_level_name = self_level_name;
        }

        public String getSjzx_create_time() {
            return sjzx_create_time;
        }

        public void setSjzx_create_time(String sjzx_create_time) {
            this.sjzx_create_time = sjzx_create_time;
        }

        public String getMinus_num_comtent() {
            return minus_num_comtent;
        }

        public void setMinus_num_comtent(String minus_num_comtent) {
            this.minus_num_comtent = minus_num_comtent;
        }
    }

    public static class DeptLevelBean {
        /**
         * id : 3870
         * level_name : 二级
         * level : 4
         * rownum_ : 1
         * name : 安全科
         * type : 11
         */

        private int id;
        private String level_name;
        private int level;
        private int rownum_;
        private String name;
        private int type;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getLevel_name() {
            return level_name;
        }

        public void setLevel_name(String level_name) {
            this.level_name = level_name;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public int getRownum_() {
            return rownum_;
        }

        public void setRownum_(int rownum_) {
            this.rownum_ = rownum_;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }
    }

    public static class TableTitleBean {
        /**
         * title6_name : 考核情况
         * sjzx_update_time : null
         * sjzx_update_useruuid : null
         * title8_name : null
         * sjzx_create_useruuid : null
         * title3_name : 现场控制
         * sjzx_update_username : null
         * id : 221
         * title2_name : 本职工作
         * title4_name : 加减分原因
         * title5_name : 考核人意见
         * sjzx_create_username : null
         * title7_name : 领导签批
         * sjzx_create_time : 2017-06-12 11:07:10
         * title1_name : 否决条件
         * unit_code : 000100090022
         */

        private String title6_name;
        private Object sjzx_update_time;
        private Object sjzx_update_useruuid;
        private Object title8_name;
        private Object sjzx_create_useruuid;
        private String title3_name;
        private Object sjzx_update_username;
        private int id;
        private String title2_name;
        private String title4_name;
        private String title5_name;
        private Object sjzx_create_username;
        private String title7_name;
        private String sjzx_create_time;
        private String title1_name;
        private String unit_code;

        public String getTitle6_name() {
            return title6_name;
        }

        public void setTitle6_name(String title6_name) {
            this.title6_name = title6_name;
        }

        public Object getSjzx_update_time() {
            return sjzx_update_time;
        }

        public void setSjzx_update_time(Object sjzx_update_time) {
            this.sjzx_update_time = sjzx_update_time;
        }

        public Object getSjzx_update_useruuid() {
            return sjzx_update_useruuid;
        }

        public void setSjzx_update_useruuid(Object sjzx_update_useruuid) {
            this.sjzx_update_useruuid = sjzx_update_useruuid;
        }

        public Object getTitle8_name() {
            return title8_name;
        }

        public void setTitle8_name(Object title8_name) {
            this.title8_name = title8_name;
        }

        public Object getSjzx_create_useruuid() {
            return sjzx_create_useruuid;
        }

        public void setSjzx_create_useruuid(Object sjzx_create_useruuid) {
            this.sjzx_create_useruuid = sjzx_create_useruuid;
        }

        public String getTitle3_name() {
            return title3_name;
        }

        public void setTitle3_name(String title3_name) {
            this.title3_name = title3_name;
        }

        public Object getSjzx_update_username() {
            return sjzx_update_username;
        }

        public void setSjzx_update_username(Object sjzx_update_username) {
            this.sjzx_update_username = sjzx_update_username;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle2_name() {
            return title2_name;
        }

        public void setTitle2_name(String title2_name) {
            this.title2_name = title2_name;
        }

        public String getTitle4_name() {
            return title4_name;
        }

        public void setTitle4_name(String title4_name) {
            this.title4_name = title4_name;
        }

        public String getTitle5_name() {
            return title5_name;
        }

        public void setTitle5_name(String title5_name) {
            this.title5_name = title5_name;
        }

        public Object getSjzx_create_username() {
            return sjzx_create_username;
        }

        public void setSjzx_create_username(Object sjzx_create_username) {
            this.sjzx_create_username = sjzx_create_username;
        }

        public String getTitle7_name() {
            return title7_name;
        }

        public void setTitle7_name(String title7_name) {
            this.title7_name = title7_name;
        }

        public String getSjzx_create_time() {
            return sjzx_create_time;
        }

        public void setSjzx_create_time(String sjzx_create_time) {
            this.sjzx_create_time = sjzx_create_time;
        }

        public String getTitle1_name() {
            return title1_name;
        }

        public void setTitle1_name(String title1_name) {
            this.title1_name = title1_name;
        }

        public String getUnit_code() {
            return unit_code;
        }

        public void setUnit_code(String unit_code) {
            this.unit_code = unit_code;
        }
    }

    public static class UserBean {
        /**
         * birth : 20170124
         * dept_name4 : 安全科
         * dept_name3 : 沈阳车务段
         * dept_name1 : 沈阳铁路局
         * sso_uuid : 9BCA50CE85854539BAD347B10643AC9E
         * leader_type : 1
         * quan_post_name : 测试日勤岗
         * bzb : 0
         * dept_full_name : 沈阳铁路局-运输处-沈阳车务段-安全科
         * laid_off_time : null
         * dept_name7 : null
         * dept_name5 : null
         * dept_name6 : null
         * ctc : 0
         * dept_code7 : null
         * dept_code6 : null
         * user_type_name : 在岗工作
         * dept_code5 : null
         * seniority1 : null
         * dept_code4 : 0001000900220008
         * dept_code3 : 000100090022
         * pm : 0
         * isshangbao : 0
         * position : 3877
         * dt : 0
         * fhy : 0
         * sys : 0
         * lw : 0
         * zdz : 0
         * is_leadership : 1
         * start_work_date : 20370124
         * dept_id : 3870
         * dg : 0
         * token : 098CDE226D8638E59D8727C5AA738F21
         * ccsj : 0
         * position_duty : null
         * dept_cwd_or_stn_name : 沈阳车务段
         * dept_station_code : null
         * post : 1
         * dept_station_name : null
         * technical_level : null
         * dept_name : 安全科
         * labor : null
         * dept_cwd_or_stn_code : 000100090022
         * feeling : null
         * login_name : admin-sycwd
         * user_type_id : 1
         * lzh : 189516
         * cb : 0
         * card_number : null
         * tel : null
         * tf : 0
         * quan_post_id : 104
         * type : 0
         * remark1 : null
         * password : C4CA4238A0B923820DCC509A6F75849B
         * remark3 : null
         * remark2 : null
         * is_leader : 0
         * gender : 1
         * inbox_do_sort : SEND_USER1
         * dept_cwd_name : 沈阳车务段
         * seniority : 1
         * post_name : 空
         * dc : 0
         * technical_level_name : null
         * jsj : 0
         * dept_code : 0001000900220008
         * leader_type_name : 专业技术
         * key_person_mark : 0
         * deleted : 0
         * 6502 : 0
         * position_name : 工程师
         * email : null
         * dept_cwd_code : 000100090022
         * create_time : 2017-01-24 23:37:14
         * work_experience : null
         * ch : 0
         * zg : 0
         * pym : sycwdgly
         * zb : 0
         * cert_id : null
         * cancel_status : 0
         * hj : 0
         * dept_type : 11
         * id_card : admin-sycwd
         * last_login_ip : null
         * education : 本科
         * ljy : 0
         * id : 189516
         * name : 沈阳车务段管理员
         * sso_app_name : null
         * outbox_do_sort : CREATE_DATE2
         * ethnic : null
         * political : null
         * working_time : null
         * last_login_time : 2017-07-25 13:04:31
         * yb : 0
         * photo : null
         * dcz : 0
         * login_count : 6167
         */

        private String birth;
        private String dept_name4;
        private String dept_name3;
        private String dept_name1;
        private String sso_uuid;
        private int leader_type;
        private String quan_post_name;
        private int bzb;
        private String dept_full_name;
        private Object laid_off_time;
        private Object dept_name7;
        private Object dept_name5;
        private Object dept_name6;
        private int ctc;
        private Object dept_code7;
        private Object dept_code6;
        private String user_type_name;
        private Object dept_code5;
        private Object seniority1;
        private String dept_code4;
        private String dept_code3;
        private int pm;
        private String isshangbao;
        private int position;
        private int dt;
        private int fhy;
        private int sys;
        private int lw;
        private int zdz;
        private int is_leadership;
        private String start_work_date;
        private int dept_id;
        private int dg;
        private String token;
        private int ccsj;
        private Object position_duty;
        private String dept_cwd_or_stn_name;
        private Object dept_station_code;
        private int post;
        private Object dept_station_name;
        private Object technical_level;
        private String dept_name;
        private Object labor;
        private String dept_cwd_or_stn_code;
        private Object feeling;
        private String login_name;
        private int user_type_id;
        private String lzh;
        private int cb;
        private Object card_number;
        private Object tel;
        private int tf;
        private int quan_post_id;
        private int type;
        private Object remark1;
        private String password;
        private Object remark3;
        private Object remark2;
        private int is_leader;
        private int gender;
        private String inbox_do_sort;
        private String dept_cwd_name;
        private int seniority;
        private String post_name;
        private int dc;
        private Object technical_level_name;
        private int jsj;
        private String dept_code;
        private String leader_type_name;
        private int key_person_mark;
        private int deleted;
        private String position_name;
        private Object email;
        private String dept_cwd_code;
        private String create_time;
        private Object work_experience;
        private int ch;
        private int zg;
        private String pym;
        private int zb;
        private Object cert_id;
        private int cancel_status;
        private int hj;
        private int dept_type;
        private String id_card;
        private Object last_login_ip;
        private String education;
        private int ljy;
        private int id;
        private String name;
        private Object sso_app_name;
        private String outbox_do_sort;
        private Object ethnic;
        private Object political;
        private Object working_time;
        private String last_login_time;
        private int yb;
        private Object photo;
        private int dcz;
        private int login_count;

        public String getBirth() {
            return birth;
        }

        public void setBirth(String birth) {
            this.birth = birth;
        }

        public String getDept_name4() {
            return dept_name4;
        }

        public void setDept_name4(String dept_name4) {
            this.dept_name4 = dept_name4;
        }

        public String getDept_name3() {
            return dept_name3;
        }

        public void setDept_name3(String dept_name3) {
            this.dept_name3 = dept_name3;
        }

        public String getDept_name1() {
            return dept_name1;
        }

        public void setDept_name1(String dept_name1) {
            this.dept_name1 = dept_name1;
        }

        public String getSso_uuid() {
            return sso_uuid;
        }

        public void setSso_uuid(String sso_uuid) {
            this.sso_uuid = sso_uuid;
        }

        public int getLeader_type() {
            return leader_type;
        }

        public void setLeader_type(int leader_type) {
            this.leader_type = leader_type;
        }

        public String getQuan_post_name() {
            return quan_post_name;
        }

        public void setQuan_post_name(String quan_post_name) {
            this.quan_post_name = quan_post_name;
        }

        public int getBzb() {
            return bzb;
        }

        public void setBzb(int bzb) {
            this.bzb = bzb;
        }

        public String getDept_full_name() {
            return dept_full_name;
        }

        public void setDept_full_name(String dept_full_name) {
            this.dept_full_name = dept_full_name;
        }

        public Object getLaid_off_time() {
            return laid_off_time;
        }

        public void setLaid_off_time(Object laid_off_time) {
            this.laid_off_time = laid_off_time;
        }

        public Object getDept_name7() {
            return dept_name7;
        }

        public void setDept_name7(Object dept_name7) {
            this.dept_name7 = dept_name7;
        }

        public Object getDept_name5() {
            return dept_name5;
        }

        public void setDept_name5(Object dept_name5) {
            this.dept_name5 = dept_name5;
        }

        public Object getDept_name6() {
            return dept_name6;
        }

        public void setDept_name6(Object dept_name6) {
            this.dept_name6 = dept_name6;
        }

        public int getCtc() {
            return ctc;
        }

        public void setCtc(int ctc) {
            this.ctc = ctc;
        }

        public Object getDept_code7() {
            return dept_code7;
        }

        public void setDept_code7(Object dept_code7) {
            this.dept_code7 = dept_code7;
        }

        public Object getDept_code6() {
            return dept_code6;
        }

        public void setDept_code6(Object dept_code6) {
            this.dept_code6 = dept_code6;
        }

        public String getUser_type_name() {
            return user_type_name;
        }

        public void setUser_type_name(String user_type_name) {
            this.user_type_name = user_type_name;
        }

        public Object getDept_code5() {
            return dept_code5;
        }

        public void setDept_code5(Object dept_code5) {
            this.dept_code5 = dept_code5;
        }

        public Object getSeniority1() {
            return seniority1;
        }

        public void setSeniority1(Object seniority1) {
            this.seniority1 = seniority1;
        }

        public String getDept_code4() {
            return dept_code4;
        }

        public void setDept_code4(String dept_code4) {
            this.dept_code4 = dept_code4;
        }

        public String getDept_code3() {
            return dept_code3;
        }

        public void setDept_code3(String dept_code3) {
            this.dept_code3 = dept_code3;
        }

        public int getPm() {
            return pm;
        }

        public void setPm(int pm) {
            this.pm = pm;
        }

        public String getIsshangbao() {
            return isshangbao;
        }

        public void setIsshangbao(String isshangbao) {
            this.isshangbao = isshangbao;
        }

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }

        public int getDt() {
            return dt;
        }

        public void setDt(int dt) {
            this.dt = dt;
        }

        public int getFhy() {
            return fhy;
        }

        public void setFhy(int fhy) {
            this.fhy = fhy;
        }

        public int getSys() {
            return sys;
        }

        public void setSys(int sys) {
            this.sys = sys;
        }

        public int getLw() {
            return lw;
        }

        public void setLw(int lw) {
            this.lw = lw;
        }

        public int getZdz() {
            return zdz;
        }

        public void setZdz(int zdz) {
            this.zdz = zdz;
        }

        public int getIs_leadership() {
            return is_leadership;
        }

        public void setIs_leadership(int is_leadership) {
            this.is_leadership = is_leadership;
        }

        public String getStart_work_date() {
            return start_work_date;
        }

        public void setStart_work_date(String start_work_date) {
            this.start_work_date = start_work_date;
        }

        public int getDept_id() {
            return dept_id;
        }

        public void setDept_id(int dept_id) {
            this.dept_id = dept_id;
        }

        public int getDg() {
            return dg;
        }

        public void setDg(int dg) {
            this.dg = dg;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public int getCcsj() {
            return ccsj;
        }

        public void setCcsj(int ccsj) {
            this.ccsj = ccsj;
        }

        public Object getPosition_duty() {
            return position_duty;
        }

        public void setPosition_duty(Object position_duty) {
            this.position_duty = position_duty;
        }

        public String getDept_cwd_or_stn_name() {
            return dept_cwd_or_stn_name;
        }

        public void setDept_cwd_or_stn_name(String dept_cwd_or_stn_name) {
            this.dept_cwd_or_stn_name = dept_cwd_or_stn_name;
        }

        public Object getDept_station_code() {
            return dept_station_code;
        }

        public void setDept_station_code(Object dept_station_code) {
            this.dept_station_code = dept_station_code;
        }

        public int getPost() {
            return post;
        }

        public void setPost(int post) {
            this.post = post;
        }

        public Object getDept_station_name() {
            return dept_station_name;
        }

        public void setDept_station_name(Object dept_station_name) {
            this.dept_station_name = dept_station_name;
        }

        public Object getTechnical_level() {
            return technical_level;
        }

        public void setTechnical_level(Object technical_level) {
            this.technical_level = technical_level;
        }

        public String getDept_name() {
            return dept_name;
        }

        public void setDept_name(String dept_name) {
            this.dept_name = dept_name;
        }

        public Object getLabor() {
            return labor;
        }

        public void setLabor(Object labor) {
            this.labor = labor;
        }

        public String getDept_cwd_or_stn_code() {
            return dept_cwd_or_stn_code;
        }

        public void setDept_cwd_or_stn_code(String dept_cwd_or_stn_code) {
            this.dept_cwd_or_stn_code = dept_cwd_or_stn_code;
        }

        public Object getFeeling() {
            return feeling;
        }

        public void setFeeling(Object feeling) {
            this.feeling = feeling;
        }

        public String getLogin_name() {
            return login_name;
        }

        public void setLogin_name(String login_name) {
            this.login_name = login_name;
        }

        public int getUser_type_id() {
            return user_type_id;
        }

        public void setUser_type_id(int user_type_id) {
            this.user_type_id = user_type_id;
        }

        public String getLzh() {
            return lzh;
        }

        public void setLzh(String lzh) {
            this.lzh = lzh;
        }

        public int getCb() {
            return cb;
        }

        public void setCb(int cb) {
            this.cb = cb;
        }

        public Object getCard_number() {
            return card_number;
        }

        public void setCard_number(Object card_number) {
            this.card_number = card_number;
        }

        public Object getTel() {
            return tel;
        }

        public void setTel(Object tel) {
            this.tel = tel;
        }

        public int getTf() {
            return tf;
        }

        public void setTf(int tf) {
            this.tf = tf;
        }

        public int getQuan_post_id() {
            return quan_post_id;
        }

        public void setQuan_post_id(int quan_post_id) {
            this.quan_post_id = quan_post_id;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public Object getRemark1() {
            return remark1;
        }

        public void setRemark1(Object remark1) {
            this.remark1 = remark1;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public Object getRemark3() {
            return remark3;
        }

        public void setRemark3(Object remark3) {
            this.remark3 = remark3;
        }

        public Object getRemark2() {
            return remark2;
        }

        public void setRemark2(Object remark2) {
            this.remark2 = remark2;
        }

        public int getIs_leader() {
            return is_leader;
        }

        public void setIs_leader(int is_leader) {
            this.is_leader = is_leader;
        }

        public int getGender() {
            return gender;
        }

        public void setGender(int gender) {
            this.gender = gender;
        }

        public String getInbox_do_sort() {
            return inbox_do_sort;
        }

        public void setInbox_do_sort(String inbox_do_sort) {
            this.inbox_do_sort = inbox_do_sort;
        }

        public String getDept_cwd_name() {
            return dept_cwd_name;
        }

        public void setDept_cwd_name(String dept_cwd_name) {
            this.dept_cwd_name = dept_cwd_name;
        }

        public int getSeniority() {
            return seniority;
        }

        public void setSeniority(int seniority) {
            this.seniority = seniority;
        }

        public String getPost_name() {
            return post_name;
        }

        public void setPost_name(String post_name) {
            this.post_name = post_name;
        }

        public int getDc() {
            return dc;
        }

        public void setDc(int dc) {
            this.dc = dc;
        }

        public Object getTechnical_level_name() {
            return technical_level_name;
        }

        public void setTechnical_level_name(Object technical_level_name) {
            this.technical_level_name = technical_level_name;
        }

        public int getJsj() {
            return jsj;
        }

        public void setJsj(int jsj) {
            this.jsj = jsj;
        }

        public String getDept_code() {
            return dept_code;
        }

        public void setDept_code(String dept_code) {
            this.dept_code = dept_code;
        }

        public String getLeader_type_name() {
            return leader_type_name;
        }

        public void setLeader_type_name(String leader_type_name) {
            this.leader_type_name = leader_type_name;
        }

        public int getKey_person_mark() {
            return key_person_mark;
        }

        public void setKey_person_mark(int key_person_mark) {
            this.key_person_mark = key_person_mark;
        }

        public int getDeleted() {
            return deleted;
        }

        public void setDeleted(int deleted) {
            this.deleted = deleted;
        }

        public String getPosition_name() {
            return position_name;
        }

        public void setPosition_name(String position_name) {
            this.position_name = position_name;
        }

        public Object getEmail() {
            return email;
        }

        public void setEmail(Object email) {
            this.email = email;
        }

        public String getDept_cwd_code() {
            return dept_cwd_code;
        }

        public void setDept_cwd_code(String dept_cwd_code) {
            this.dept_cwd_code = dept_cwd_code;
        }

        public String getCreate_time() {
            return create_time;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }

        public Object getWork_experience() {
            return work_experience;
        }

        public void setWork_experience(Object work_experience) {
            this.work_experience = work_experience;
        }

        public int getCh() {
            return ch;
        }

        public void setCh(int ch) {
            this.ch = ch;
        }

        public int getZg() {
            return zg;
        }

        public void setZg(int zg) {
            this.zg = zg;
        }

        public String getPym() {
            return pym;
        }

        public void setPym(String pym) {
            this.pym = pym;
        }

        public int getZb() {
            return zb;
        }

        public void setZb(int zb) {
            this.zb = zb;
        }

        public Object getCert_id() {
            return cert_id;
        }

        public void setCert_id(Object cert_id) {
            this.cert_id = cert_id;
        }

        public int getCancel_status() {
            return cancel_status;
        }

        public void setCancel_status(int cancel_status) {
            this.cancel_status = cancel_status;
        }

        public int getHj() {
            return hj;
        }

        public void setHj(int hj) {
            this.hj = hj;
        }

        public int getDept_type() {
            return dept_type;
        }

        public void setDept_type(int dept_type) {
            this.dept_type = dept_type;
        }

        public String getId_card() {
            return id_card;
        }

        public void setId_card(String id_card) {
            this.id_card = id_card;
        }

        public Object getLast_login_ip() {
            return last_login_ip;
        }

        public void setLast_login_ip(Object last_login_ip) {
            this.last_login_ip = last_login_ip;
        }

        public String getEducation() {
            return education;
        }

        public void setEducation(String education) {
            this.education = education;
        }

        public int getLjy() {
            return ljy;
        }

        public void setLjy(int ljy) {
            this.ljy = ljy;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Object getSso_app_name() {
            return sso_app_name;
        }

        public void setSso_app_name(Object sso_app_name) {
            this.sso_app_name = sso_app_name;
        }

        public String getOutbox_do_sort() {
            return outbox_do_sort;
        }

        public void setOutbox_do_sort(String outbox_do_sort) {
            this.outbox_do_sort = outbox_do_sort;
        }

        public Object getEthnic() {
            return ethnic;
        }

        public void setEthnic(Object ethnic) {
            this.ethnic = ethnic;
        }

        public Object getPolitical() {
            return political;
        }

        public void setPolitical(Object political) {
            this.political = political;
        }

        public Object getWorking_time() {
            return working_time;
        }

        public void setWorking_time(Object working_time) {
            this.working_time = working_time;
        }

        public String getLast_login_time() {
            return last_login_time;
        }

        public void setLast_login_time(String last_login_time) {
            this.last_login_time = last_login_time;
        }

        public int getYb() {
            return yb;
        }

        public void setYb(int yb) {
            this.yb = yb;
        }

        public Object getPhoto() {
            return photo;
        }

        public void setPhoto(Object photo) {
            this.photo = photo;
        }

        public int getDcz() {
            return dcz;
        }

        public void setDcz(int dcz) {
            this.dcz = dcz;
        }

        public int getLogin_count() {
            return login_count;
        }

        public void setLogin_count(int login_count) {
            this.login_count = login_count;
        }
    }

    public static class SjldListBean {
        /**
         * sjzx_update_time : null
         * reason : 解放路看电视剧了开房记录可视对讲
         * veto_id : null
         * sjzx_update_useruuid : null
         * score : 12
         * type : 1
         * sjzx_create_useruuid : 9BCA50CE85854539BAD347B10643AC9E
         * deleted : 0
         * sjzx_update_username : null
         * approve_id : 30816
         * id : 23602
         * create_time : 2017-07-13 16:13:29
         * sjzx_create_username : 沈阳车务段管理员
         * user_id : 189516
         * sjzx_create_time : 2017-07-13 16:13:29
         */

        private Object sjzx_update_time;
        private String reason;
        private Object veto_id;
        private Object sjzx_update_useruuid;
        private int score;
        private int type;
        private String sjzx_create_useruuid;
        private int deleted;
        private Object sjzx_update_username;
        private int approve_id;
        private int id;
        private String create_time;
        private String sjzx_create_username;
        private int user_id;
        private String sjzx_create_time;

        public Object getSjzx_update_time() {
            return sjzx_update_time;
        }

        public void setSjzx_update_time(Object sjzx_update_time) {
            this.sjzx_update_time = sjzx_update_time;
        }

        public String getReason() {
            return reason;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }

        public Object getVeto_id() {
            return veto_id;
        }

        public void setVeto_id(Object veto_id) {
            this.veto_id = veto_id;
        }

        public Object getSjzx_update_useruuid() {
            return sjzx_update_useruuid;
        }

        public void setSjzx_update_useruuid(Object sjzx_update_useruuid) {
            this.sjzx_update_useruuid = sjzx_update_useruuid;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getSjzx_create_useruuid() {
            return sjzx_create_useruuid;
        }

        public void setSjzx_create_useruuid(String sjzx_create_useruuid) {
            this.sjzx_create_useruuid = sjzx_create_useruuid;
        }

        public int getDeleted() {
            return deleted;
        }

        public void setDeleted(int deleted) {
            this.deleted = deleted;
        }

        public Object getSjzx_update_username() {
            return sjzx_update_username;
        }

        public void setSjzx_update_username(Object sjzx_update_username) {
            this.sjzx_update_username = sjzx_update_username;
        }

        public int getApprove_id() {
            return approve_id;
        }

        public void setApprove_id(int approve_id) {
            this.approve_id = approve_id;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCreate_time() {
            return create_time;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }

        public String getSjzx_create_username() {
            return sjzx_create_username;
        }

        public void setSjzx_create_username(String sjzx_create_username) {
            this.sjzx_create_username = sjzx_create_username;
        }

        public int getUser_id() {
            return user_id;
        }

        public void setUser_id(int user_id) {
            this.user_id = user_id;
        }

        public String getSjzx_create_time() {
            return sjzx_create_time;
        }

        public void setSjzx_create_time(String sjzx_create_time) {
            this.sjzx_create_time = sjzx_create_time;
        }
    }

    public static class PropertyTypeListBean {
        /**
         * num : 5
         * typename : Z
         */

        private String num;
        private String typename;

        public String getNum() {
            return num;
        }

        public void setNum(String num) {
            this.num = num;
        }

        public String getTypename() {
            return typename;
        }

        public void setTypename(String typename) {
            this.typename = typename;
        }
    }

    public static class LevelListBean {
        /**
         * sjzx_update_time : null
         * sort : 1
         * sjzx_update_useruuid : null
         * score_to : 100
         * sjzx_create_useruuid : null
         * deleted : 0
         * sjzx_update_username : null
         * id : 55
         * colour : 1
         * level_name : 一级
         * sjzx_create_username : null
         * score_from : 90
         * sjzx_create_time : 2017-06-12 10:39:16
         * unit_code : 0001000900220008
         */

        private Object sjzx_update_time;
        private int sort;
        private Object sjzx_update_useruuid;
        private int score_to;
        private Object sjzx_create_useruuid;
        private int deleted;
        private Object sjzx_update_username;
        private int id;
        private int colour;
        private String level_name;
        private Object sjzx_create_username;
        private int score_from;
        private String sjzx_create_time;
        private String unit_code;

        public Object getSjzx_update_time() {
            return sjzx_update_time;
        }

        public void setSjzx_update_time(Object sjzx_update_time) {
            this.sjzx_update_time = sjzx_update_time;
        }

        public int getSort() {
            return sort;
        }

        public void setSort(int sort) {
            this.sort = sort;
        }

        public Object getSjzx_update_useruuid() {
            return sjzx_update_useruuid;
        }

        public void setSjzx_update_useruuid(Object sjzx_update_useruuid) {
            this.sjzx_update_useruuid = sjzx_update_useruuid;
        }

        public int getScore_to() {
            return score_to;
        }

        public void setScore_to(int score_to) {
            this.score_to = score_to;
        }

        public Object getSjzx_create_useruuid() {
            return sjzx_create_useruuid;
        }

        public void setSjzx_create_useruuid(Object sjzx_create_useruuid) {
            this.sjzx_create_useruuid = sjzx_create_useruuid;
        }

        public int getDeleted() {
            return deleted;
        }

        public void setDeleted(int deleted) {
            this.deleted = deleted;
        }

        public Object getSjzx_update_username() {
            return sjzx_update_username;
        }

        public void setSjzx_update_username(Object sjzx_update_username) {
            this.sjzx_update_username = sjzx_update_username;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getColour() {
            return colour;
        }

        public void setColour(int colour) {
            this.colour = colour;
        }

        public String getLevel_name() {
            return level_name;
        }

        public void setLevel_name(String level_name) {
            this.level_name = level_name;
        }

        public Object getSjzx_create_username() {
            return sjzx_create_username;
        }

        public void setSjzx_create_username(Object sjzx_create_username) {
            this.sjzx_create_username = sjzx_create_username;
        }

        public int getScore_from() {
            return score_from;
        }

        public void setScore_from(int score_from) {
            this.score_from = score_from;
        }

        public String getSjzx_create_time() {
            return sjzx_create_time;
        }

        public void setSjzx_create_time(String sjzx_create_time) {
            this.sjzx_create_time = sjzx_create_time;
        }

        public String getUnit_code() {
            return unit_code;
        }

        public void setUnit_code(String unit_code) {
            this.unit_code = unit_code;
        }
    }

    public static class PropertyListBean {
        /**
         * problem_type_name : Y
         * pym : ybszsz
         * sjzx_update_time : 2017-06-29 21:35:38
         * sjzx_update_useruuid : 9BCA50CE85854539BAD347B10643AC9E
         * pid : 1
         * code : null
         * problem_type_id : 2
         * type : 2
         * sjzx_create_useruuid : 897103B02CA448C5BFE243B824DC0200
         * deleted : 0
         * sjzx_update_username : 沈阳车务段管理员
         * id : 51
         * is_leader : 0
         * name : 一般失职失责
         * sjzx_create_username : 赤峰车务段系统管理员
         * sjzx_create_time : 2017-06-19 14:07:21
         */

        private String problem_type_name;
        private String pym;
        private String sjzx_update_time;
        private String sjzx_update_useruuid;
        private int pid;
        private Object code;
        private int problem_type_id;
        private int type;
        private String sjzx_create_useruuid;
        private int deleted;
        private String sjzx_update_username;
        private int id;
        private int is_leader;
        private String name;
        private String sjzx_create_username;
        private String sjzx_create_time;

        public String getProblem_type_name() {
            return problem_type_name;
        }

        public void setProblem_type_name(String problem_type_name) {
            this.problem_type_name = problem_type_name;
        }

        public String getPym() {
            return pym;
        }

        public void setPym(String pym) {
            this.pym = pym;
        }

        public String getSjzx_update_time() {
            return sjzx_update_time;
        }

        public void setSjzx_update_time(String sjzx_update_time) {
            this.sjzx_update_time = sjzx_update_time;
        }

        public String getSjzx_update_useruuid() {
            return sjzx_update_useruuid;
        }

        public void setSjzx_update_useruuid(String sjzx_update_useruuid) {
            this.sjzx_update_useruuid = sjzx_update_useruuid;
        }

        public int getPid() {
            return pid;
        }

        public void setPid(int pid) {
            this.pid = pid;
        }

        public Object getCode() {
            return code;
        }

        public void setCode(Object code) {
            this.code = code;
        }

        public int getProblem_type_id() {
            return problem_type_id;
        }

        public void setProblem_type_id(int problem_type_id) {
            this.problem_type_id = problem_type_id;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getSjzx_create_useruuid() {
            return sjzx_create_useruuid;
        }

        public void setSjzx_create_useruuid(String sjzx_create_useruuid) {
            this.sjzx_create_useruuid = sjzx_create_useruuid;
        }

        public int getDeleted() {
            return deleted;
        }

        public void setDeleted(int deleted) {
            this.deleted = deleted;
        }

        public String getSjzx_update_username() {
            return sjzx_update_username;
        }

        public void setSjzx_update_username(String sjzx_update_username) {
            this.sjzx_update_username = sjzx_update_username;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getIs_leader() {
            return is_leader;
        }

        public void setIs_leader(int is_leader) {
            this.is_leader = is_leader;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSjzx_create_username() {
            return sjzx_create_username;
        }

        public void setSjzx_create_username(String sjzx_create_username) {
            this.sjzx_create_username = sjzx_create_username;
        }

        public String getSjzx_create_time() {
            return sjzx_create_time;
        }

        public void setSjzx_create_time(String sjzx_create_time) {
            this.sjzx_create_time = sjzx_create_time;
        }
    }

    public static class RiskConListBean {
        /**
         * dynamic : 0
         * content : 每月检查接发列车
         * id : 1279
         * normal_done : 2
         * count : 0
         * normal : 2
         * dynamic_done : 0
         * extra_done : 10
         * minus_score : 5
         * pre_id : 844557
         */

        private int dynamic;
        private String content;
        private int id;
        private int normal_done;
        private int count;
        private int normal;
        private int dynamic_done;
        private int extra_done;
        private int minus_score;
        private int pre_id;

        public int getDynamic() {
            return dynamic;
        }

        public void setDynamic(int dynamic) {
            this.dynamic = dynamic;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getNormal_done() {
            return normal_done;
        }

        public void setNormal_done(int normal_done) {
            this.normal_done = normal_done;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public int getNormal() {
            return normal;
        }

        public void setNormal(int normal) {
            this.normal = normal;
        }

        public int getDynamic_done() {
            return dynamic_done;
        }

        public void setDynamic_done(int dynamic_done) {
            this.dynamic_done = dynamic_done;
        }

        public int getExtra_done() {
            return extra_done;
        }

        public void setExtra_done(int extra_done) {
            this.extra_done = extra_done;
        }

        public int getMinus_score() {
            return minus_score;
        }

        public void setMinus_score(int minus_score) {
            this.minus_score = minus_score;
        }

        public int getPre_id() {
            return pre_id;
        }

        public void setPre_id(int pre_id) {
            this.pre_id = pre_id;
        }
    }

    public static class WarnAddScoreBean {
        /**
         * num : null
         * name : 干部履职预警
         * warn_type : null
         */

        private Object num;
        private String name;
        private Object warn_type;

        public Object getNum() {
            return num;
        }

        public void setNum(Object num) {
            this.num = num;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Object getWarn_type() {
            return warn_type;
        }

        public void setWarn_type(Object warn_type) {
            this.warn_type = warn_type;
        }
    }

    public static class LrkListBean {
        /**
         * sjzx_update_time : null
         * reason : 的数据阿弗莱克绝对是来看
         * veto_id : null
         * sjzx_update_useruuid : null
         * score : 10
         * type : 2
         * sjzx_create_useruuid : 9BCA50CE85854539BAD347B10643AC9E
         * deleted : 0
         * sjzx_update_username : null
         * approve_id : 30816
         * id : 23632
         * create_time : 2017-07-19 09:58:10
         * sjzx_create_username : 沈阳车务段管理员
         * user_id : 189516
         * sjzx_create_time : 2017-07-19 09:58:10
         */

        private Object sjzx_update_time;
        private String reason;
        private Object veto_id;
        private Object sjzx_update_useruuid;
        private int score;
        private int type;
        private String sjzx_create_useruuid;
        private int deleted;
        private Object sjzx_update_username;
        private int approve_id;
        private int id;
        private String create_time;
        private String sjzx_create_username;
        private int user_id;
        private String sjzx_create_time;

        public Object getSjzx_update_time() {
            return sjzx_update_time;
        }

        public void setSjzx_update_time(Object sjzx_update_time) {
            this.sjzx_update_time = sjzx_update_time;
        }

        public String getReason() {
            return reason;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }

        public Object getVeto_id() {
            return veto_id;
        }

        public void setVeto_id(Object veto_id) {
            this.veto_id = veto_id;
        }

        public Object getSjzx_update_useruuid() {
            return sjzx_update_useruuid;
        }

        public void setSjzx_update_useruuid(Object sjzx_update_useruuid) {
            this.sjzx_update_useruuid = sjzx_update_useruuid;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getSjzx_create_useruuid() {
            return sjzx_create_useruuid;
        }

        public void setSjzx_create_useruuid(String sjzx_create_useruuid) {
            this.sjzx_create_useruuid = sjzx_create_useruuid;
        }

        public int getDeleted() {
            return deleted;
        }

        public void setDeleted(int deleted) {
            this.deleted = deleted;
        }

        public Object getSjzx_update_username() {
            return sjzx_update_username;
        }

        public void setSjzx_update_username(Object sjzx_update_username) {
            this.sjzx_update_username = sjzx_update_username;
        }

        public int getApprove_id() {
            return approve_id;
        }

        public void setApprove_id(int approve_id) {
            this.approve_id = approve_id;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCreate_time() {
            return create_time;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }

        public String getSjzx_create_username() {
            return sjzx_create_username;
        }

        public void setSjzx_create_username(String sjzx_create_username) {
            this.sjzx_create_username = sjzx_create_username;
        }

        public int getUser_id() {
            return user_id;
        }

        public void setUser_id(int user_id) {
            this.user_id = user_id;
        }

        public String getSjzx_create_time() {
            return sjzx_create_time;
        }

        public void setSjzx_create_time(String sjzx_create_time) {
            this.sjzx_create_time = sjzx_create_time;
        }
    }

    public static class VetoListBean {

    }


    public static class VetoAllListBean {
        /**
         * id : 101
         * sjzx_update_time : null
         * sort : 1
         * condition : 未履职尽责的干部（包括管理甩手的干部）
         * sjzx_update_useruuid : null
         * sjzx_create_username : null
         * sjzx_create_useruuid : null
         * sjzx_create_time : 2017-06-12 11:07:10
         * deleted : 0
         * sjzx_update_username : null
         * unit_code : 0001000900220008
         */

        private int id;
        private Object sjzx_update_time;
        private int sort;
        private String condition;
        private Object sjzx_update_useruuid;
        private Object sjzx_create_username;
        private Object sjzx_create_useruuid;
        private String sjzx_create_time;
        private int deleted;
        private Object sjzx_update_username;
        private String unit_code;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Object getSjzx_update_time() {
            return sjzx_update_time;
        }

        public void setSjzx_update_time(Object sjzx_update_time) {
            this.sjzx_update_time = sjzx_update_time;
        }

        public int getSort() {
            return sort;
        }

        public void setSort(int sort) {
            this.sort = sort;
        }

        public String getCondition() {
            return condition;
        }

        public void setCondition(String condition) {
            this.condition = condition;
        }

        public Object getSjzx_update_useruuid() {
            return sjzx_update_useruuid;
        }

        public void setSjzx_update_useruuid(Object sjzx_update_useruuid) {
            this.sjzx_update_useruuid = sjzx_update_useruuid;
        }

        public Object getSjzx_create_username() {
            return sjzx_create_username;
        }

        public void setSjzx_create_username(Object sjzx_create_username) {
            this.sjzx_create_username = sjzx_create_username;
        }

        public Object getSjzx_create_useruuid() {
            return sjzx_create_useruuid;
        }

        public void setSjzx_create_useruuid(Object sjzx_create_useruuid) {
            this.sjzx_create_useruuid = sjzx_create_useruuid;
        }

        public String getSjzx_create_time() {
            return sjzx_create_time;
        }

        public void setSjzx_create_time(String sjzx_create_time) {
            this.sjzx_create_time = sjzx_create_time;
        }

        public int getDeleted() {
            return deleted;
        }

        public void setDeleted(int deleted) {
            this.deleted = deleted;
        }

        public Object getSjzx_update_username() {
            return sjzx_update_username;
        }

        public void setSjzx_update_username(Object sjzx_update_username) {
            this.sjzx_update_username = sjzx_update_username;
        }

        public String getUnit_code() {
            return unit_code;
        }

        public void setUnit_code(String unit_code) {
            this.unit_code = unit_code;
        }
    }

    public static class PropertyTypeMinusListBean {
        /**
         * num : 0
         * typename : T
         */

        private String num;
        private String typename;

        public String getNum() {
            return num;
        }

        public void setNum(String num) {
            this.num = num;
        }

        public String getTypename() {
            return typename;
        }

        public void setTypename(String typename) {
            this.typename = typename;
        }
    }

    public static class WarnMinScoreBean {
        /**
         * num : null
         * name : 失检天数预警
         * warn_type : null
         */

        private int num;
        private String name;
        private Object warn_type;

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Object getWarn_type() {
            return warn_type;
        }

        public void setWarn_type(Object warn_type) {
            this.warn_type = warn_type;
        }
    }
}
