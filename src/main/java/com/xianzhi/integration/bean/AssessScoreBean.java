package com.xianzhi.integration.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @Administrator LiBo.
 * @Date 2017/8/2.
 * @Function
 */

public class AssessScoreBean implements Serializable {

    private int num;
    private int size;
    private String date;
    private String departName;
    private String departId;
    private String departCode;
    private String userName;
    /**
     * searchDeptNodes : [{"pym":"sycwd","dbm":null,"class_name":"日勤制(日)","type":1,"cognizance_user_id":null,"class_select":0,"id":3862,"level":3,"name":"沈阳车务段","response_user_id":263023,"safe_overtime":2400,"equdepartment":0,"leader_user_id":45402,"property":null,"pid":195,"available":1,"code":"000100090022","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":1,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":219160,"my_level":3,"start_date":null},{"pym":"ldbz","dbm":null,"class_name":"日勤制(日)","type":4,"cognizance_user_id":null,"class_select":0,"id":3863,"level":4,"name":"领导班子","response_user_id":263023,"safe_overtime":null,"equdepartment":0,"leader_user_id":45402,"property":null,"pid":3862,"available":1,"code":"0001000900220001","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"kyhsrk","dbm":null,"class_name":"日勤制(日)","type":11,"cognizance_user_id":null,"class_select":0,"id":3864,"level":4,"name":"客运和收入科","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220002","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"dqb","dbm":null,"class_name":"日勤制(日)","type":11,"cognizance_user_id":null,"class_select":0,"id":3865,"level":4,"name":"党群办","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220003","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"jhcwk","dbm":null,"class_name":"日勤制(日)","type":11,"cognizance_user_id":null,"class_select":0,"id":3866,"level":4,"name":"计划财务科","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220004","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"bwk","dbm":null,"class_name":"日勤制(日)","type":11,"cognizance_user_id":null,"class_select":0,"id":3867,"level":4,"name":"保卫科","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220005","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"ldrsk","dbm":null,"class_name":"日勤制(日)","type":11,"cognizance_user_id":null,"class_select":0,"id":3868,"level":4,"name":"劳动人事科","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220006","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"jshtjk","dbm":null,"class_name":"日勤制(日)","type":11,"cognizance_user_id":null,"class_select":0,"id":3869,"level":4,"name":"技术和统计科","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220007","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"aqk","dbm":null,"class_name":"日勤制(日)","type":11,"cognizance_user_id":null,"class_select":0,"id":3870,"level":4,"name":"安全科","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220008","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"bgs","dbm":null,"class_name":"日勤制(日)","type":11,"cognizance_user_id":null,"class_select":0,"id":3871,"level":4,"name":"办公室","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220009","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"dds","dbm":null,"class_name":"日勤制(日)","type":11,"cognizance_user_id":null,"class_select":0,"id":3872,"level":4,"name":"调度室","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220010","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"zgjyk","dbm":null,"class_name":"日勤制(日)","type":11,"cognizance_user_id":null,"class_select":0,"id":3873,"level":4,"name":"职工教育科","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220011","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"jtb","dbm":null,"class_name":"日勤制(日)","type":11,"cognizance_user_id":null,"class_select":0,"id":16565,"level":4,"name":"集体办","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220068","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-04-09 13:59:58","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"wlgs","dbm":null,"class_name":"日勤制(日)","type":12,"cognizance_user_id":null,"class_select":0,"id":16579,"level":4,"name":"物流公司","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220069","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-04-17 18:24:01","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"ljtz","dbm":"LTT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3874,"level":4,"name":"揽军屯站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220012","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"zwqz","dbm":"ZQT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3876,"level":4,"name":"转弯桥站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220013","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"lssz","dbm":"LCT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3878,"level":4,"name":"乱石山站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220014","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"pdbz","dbm":"PDT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3880,"level":4,"name":"平顶堡站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220015","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"jzz","dbm":"JNT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3882,"level":4,"name":"旧站站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220016","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"xtzz","dbm":"XIT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3884,"level":4,"name":"新台子站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220017","deleted":0,"station_level":3,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"tlxz","dbm":"PXT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3886,"level":4,"name":"铁岭西站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220018","deleted":0,"station_level":2,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"xfz","dbm":"XFT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3891,"level":4,"name":"西丰站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220019","deleted":0,"station_level":3,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"smzz","dbm":"SMT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3893,"level":4,"name":"双庙子站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220020","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"hhz","dbm":"HHT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3895,"level":4,"name":"浑河站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220021","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"mjdz","dbm":"MDT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3897,"level":4,"name":"毛家店站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220022","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"kyxz","dbm":"KXT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3899,"level":4,"name":"开原西站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220023","deleted":0,"station_level":3,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"hstz","dbm":"HUT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3902,"level":4,"name":"虎石台站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220024","deleted":0,"station_level":3,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"dqz","dbm":"DZT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3904,"level":4,"name":"大青站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220025","deleted":0,"station_level":2,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"yhz","dbm":"YHT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3910,"level":4,"name":"于洪站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220026","deleted":0,"station_level":3,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"gjzz","dbm":"GKT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3912,"level":4,"name":"孤家子站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220027","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"qyz","dbm":"QYT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3914,"level":4,"name":"清原站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220028","deleted":0,"station_level":3,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"sscz","dbm":"SUT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3922,"level":4,"name":"松树村站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220029","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"dhtz","dbm":"DOT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3926,"level":4,"name":"斗虎屯站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220030","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"nkqz","dbm":"NKT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3932,"level":4,"name":"南口前站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220031","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"amz","dbm":"ANT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3942,"level":4,"name":"安民站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220032","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"hsz","dbm":"HGT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3946,"level":4,"name":"辉山站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220033","deleted":0,"station_level":3,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"slz","dbm":"SQD","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3948,"level":4,"name":"沙岭站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220034","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"smlz","dbm":"SLT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3950,"level":4,"name":"石门岭站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220035","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"nzmz","dbm":"NZT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3952,"level":4,"name":"南杂木站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220036","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"dstz","dbm":"DET","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3965,"level":4,"name":"得胜台站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220037","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"csz","dbm":"CST","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3971,"level":4,"name":"苍石站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220038","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"dgtz","dbm":"DTT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3973,"level":4,"name":"大官屯站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220039","deleted":0,"station_level":2,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"ctxz","dbm":"CPT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3981,"level":4,"name":"昌图西站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220040","deleted":0,"station_level":3,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"ystz","dbm":"YUT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3987,"level":4,"name":"榆树台站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220041","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"xczz","dbm":"XCT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3997,"level":4,"name":"新城子站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220042","deleted":0,"station_level":3,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"qdz","dbm":"QDT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3999,"level":4,"name":"前甸站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220043","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"mzhz","dbm":"MZT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4001,"level":4,"name":"马仲河站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220044","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"dcz","dbm":"DCT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4003,"level":4,"name":"大成站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220045","deleted":0,"station_level":2,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"fsbz","dbm":"FET","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4011,"level":4,"name":"抚顺北站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220046","deleted":0,"station_level":2,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"tlz","dbm":"TLT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4028,"level":4,"name":"铁岭站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220047","deleted":0,"station_level":2,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"tytz","dbm":"PYT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4049,"level":4,"name":"田义屯站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220048","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"hgtz","dbm":"HTT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4055,"level":4,"name":"皇姑屯站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220049","deleted":0,"station_level":3,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"dtz","dbm":"DKT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4062,"level":4,"name":"滴台站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220050","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"dlz","dbm":"DRT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4067,"level":4,"name":"东陵站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220051","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"zxbz","dbm":"TXT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4076,"level":4,"name":"镇西堡站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220052","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"wgtz","dbm":"WTT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4078,"level":4,"name":"文官屯站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220053","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"sjzz","dbm":"SWT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4080,"level":4,"name":"深井子站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220054","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"ypz","dbm":"YPT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4082,"level":4,"name":"营盘站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220055","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"ctz","dbm":"CTT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4090,"level":4,"name":"昌图站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220056","deleted":0,"station_level":2,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"zdz","dbm":"ZHT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4096,"level":4,"name":"章党站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220057","deleted":0,"station_level":3,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"bsjz","dbm":"BET","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4113,"level":4,"name":"�三家站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220058","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"sydz","dbm":"SDT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4115,"level":4,"name":"沈阳东站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220059","deleted":0,"station_level":2,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"petz","dbm":"PRT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4123,"level":4,"name":"瓢儿屯站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220060","deleted":0,"station_level":2,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"kyz","dbm":"KYT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4125,"level":4,"name":"开原站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220061","deleted":0,"station_level":2,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"tbsz","dbm":"TET","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4145,"level":4,"name":"铁背山站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220062","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"hsgz","dbm":"HGD","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4150,"level":4,"name":"火石岗站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220063","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"jhz","dbm":"JHD","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4152,"level":4,"name":"近海站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220064","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"zgz","dbm":"ZGT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4154,"level":4,"name":"中固站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220065","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"nlg","dbm":null,"class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":16249,"level":4,"name":"内陆港","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220066","deleted":0,"station_level":2,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-03-06 11:14:29","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"syxz","dbm":null,"class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":16560,"level":4,"name":"沈阳西站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220067","deleted":0,"station_level":3,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-04-07 18:47:53","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"23","dbm":null,"class_name":"日勤制(日)","type":12,"cognizance_user_id":null,"class_select":0,"id":16838,"level":5,"name":"23","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3876,"available":1,"code":"00010009002200130005","deleted":0,"station_level":null,"l,"my_level":5,"start_date":"2017-07-26"},{"pym":"xcyb","dbm":null,"class_name":"小四班制1(▲,丨▼,○,○)","type":14,"cognizance_user_id":null,"class_select":1,"id":16592,"level":5,"name":"行车一班","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3876,"available":1,"code":"00010009002200130001","deleted":0,"station_level":null,"url":null,"class_id":38,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-05-01 18:41:42","unit_type":null,"document_user":null,"my_level":5,"start_date":"2017-07-11"},{"pym":"eb","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":16593,"level":5,"name":"二班","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3876,"available":1,"code":"00010009002200130002","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-05-01 18:42:11","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"cscj","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":16834,"level":5,"name":"测试车间","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3876,"available":1,"code":"00010009002200130003","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-06-30 20:34:56","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"csbz2","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":16837,"level":5,"name":"测试班组2","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3876,"available":1,"code":"00010009002200130004","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-06 08:26:17","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"csbz3","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":16839,"level":5,"name":"测试班组3","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3876,"available":1,"code":"00010009002200130006","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-06 09:39:31","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"cscj3","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":16840,"level":5,"name":"测试车间3","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3876,"available":1,"code":"00010009002200130007","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-06 09:39:53","unit_type":null,"document_user":null,"my_level":5,"start_date":"2017-07-24"},{"pym":"cscj4","dbm":null,"class_name":"两班制1(╳,○)","type":14,"cognizance_user_id":null,"class_select":0,"id":17446,"level":5,"name":"测试车间4","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3876,"available":1,"code":"00010009002200130008","deleted":0,"station_level":null,"url":null,"class_id":31,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-24 08:56:23","unit_type":null,"document_user":null,"my_level":5,"start_date":"2017-07-29"},{"pym":"yzbz","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":15090,"level":5,"name":"运转班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3914,"available":1,"code":"00010009002200280001","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"kybz","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":15091,"level":5,"name":"客运班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3914,"available":1,"code":"00010009002200280002","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"kybz","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":3974,"level":5,"name":"客运班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3973,"available":1,"code":"00010009002200390001","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"yzbz","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":3976,"level":5,"name":"运转班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3973,"available":1,"code":"00010009002200390003","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"yzbz","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":4005,"level":5,"name":"运转班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4003,"available":1,"code":"00010009002200450002","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"kybz","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":4010,"level":5,"name":"客运班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4003,"available":1,"code":"00010009002200450007","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"kybz","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":4012,"level":5,"name":"客运班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4011,"available":1,"code":"00010009002200460001","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"yzbz","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":4091,"level":5,"name":"运转班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4090,"available":1,"code":"00010009002200560001","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"kybz","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":4095,"level":5,"name":"客运班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4090,"available":1,"code":"00010009002200560005","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"kybz","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":4116,"level":5,"name":"客运班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4115,"available":1,"code":"00010009002200590001","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"yzbz","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":4121,"level":5,"name":"运转班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4115,"available":1,"code":"00010009002200590006","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"yzbz","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":4134,"level":5,"name":"运转班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4125,"available":1,"code":"00010009002200610009","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"cscj5","dbm":null,"class_name":"两班制1(╳,○)","type":15,"cognizance_user_id":null,"class_select":1,"id":17447,"level":5,"name":"测试车间5","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3876,"available":1,"code":"00010009002200130009","deleted":0,"station_level":null,"url":null,"class_id":31,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-24 09:42:29","unit_type":null,"document_user":null,"my_level":5,"start_date":"2017-07-24"},{"pym":"cszyxz","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":16835,"level":6,"name":"测试作业小组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":16834,"available":1,"code":"000100090022001300030001","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-06-30 20:35:12","unit_type":null,"document_user":null,"my_level":6,"start_date":null},{"pym":"A","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":16836,"level":6,"name":"A","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":16834,"available":1,"code":"000100090022001300030002","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-05 21:33:05","unit_type":null,"document_user":null,"my_level":6,"start_date":null},{"pym":"yzd4yb","dbm":null,"class_name":"大四班制(丨,\u2014,○,○)","type":14,"cognizance_user_id":null,"class_select":1,"id":16849,"level":6,"name":"运转大4一班","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":16848,"available":1,"code":"000100090022001400010001","deleted":0,"station_level":null,"url":null,"class_id":37,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-11 09:46:28","unit_type":null,"document_user":null,"my_level":6,"start_date":"2017-07-11"},{"pym":"zyxz4","dbm":null,"class_name":"两班制2(╳,╳,○,○)","type":15,"cognizance_user_id":null,"class_select":1,"id":16841,"level":6,"name":"作业小组4","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":16592,"available":1,"code":"000100090022001300010001","deleted":0,"station_level":null,"url":null,"class_id":32,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-06 09:40:53","unit_type":null,"document_user":null,"my_level":6,"start_date":"2017-07-06"},{"pym":"zyxz2","dbm":null,"class_name":"日勤制(日)","type":15,"cognizance_user_id":null,"class_select":0,"id":17396,"level":6,"name":"作业小组2","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":16593,"available":1,"code":"000100090022001300020001","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-16 17:48:21","unit_type":null,"document_user":null,"my_level":6,"start_date":null},{"pym":"yd","dbm":null,"class_name":"日勤制(日)","type":15,"cognizance_user_id":null,"class_select":0,"id":17397,"level":6,"name":"一调","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":15090,"available":1,"code":"000100090022002800010001","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-16 17:50:26","unit_type":null,"document_user":null,"my_level":6,"start_date":null},{"pym":"ed","dbm":null,"class_name":"日勤制(日)","type":15,"cognizance_user_id":null,"class_select":0,"id":17398,"level":6,"name":"二调","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":15090,"available":1,"code":"000100090022002800010002","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-16 17:50:33","unit_type":null,"document_user":null,"my_level":6,"start_date":null},{"pym":"yd","dbm":null,"class_name":"日勤制(日)","type":15,"cognizance_user_id":null,"class_select":0,"id":17399,"level":6,"name":"一调","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":15091,"available":1,"code":"000100090022002800020001","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-16 17:50:42","unit_type":null,"document_user":null,"my_level":6,"start_date":null},{"pym":"ed","dbm":null,"class_name":"日勤制(日)","type":15,"cognizance_user_id":null,"class_select":0,"id":17400,"level":6,"name":"二调","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":15091,"available":1,"code":"000100090022002800020002","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-16 17:50:56","unit_type":null,"document_user":null,"my_level":6,"start_date":null},{"pym":"yzybyxz","dbm":null,"class_name":"大四班制(丨,\u2014,○,○)","type":15,"cognizance_user_id":null,"class_select":1,"id":16850,"level":7,"name":"运转一班一小组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":16849,"available":1,"code":"0001000900220014000100010001","deleted":0,"station_level":null,"url":null,"class_id":37,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-11 09:49:01","unit_type":null,"document_user":null,"my_level":7,"start_date":"2017-07-11"}]
     * timeInfo : {"endtime":"2017-08-25 08:00","starttime":"2017-07-25 08:00","month":"2017-08"}
     * page : {"lastPage":true,"pageSize":50,"pageNumber":1,"firstPage":true,"list":[{"position":3877,"final_level_name":null,"lrk_score":null,"key_time":0,"final_score":2,"position_name":"工程师","approve_id":30834,"add_min_score":2,"self_realistic":12,"rownum_":1,"risk_con_score":-10,"danger_find_add_score":0,"dept_full_name":"沈阳铁路局-运输处-沈阳车务段-安全科","problem_real_add_score":0,"sjld_score":null,"name":"沈阳车务段管理员","month":"2017-08","user_id":189516,"problem_real_minus_score":0,"starting_score":"0","awh":0}],"totalRow":1,"totalPage":1}
     * dept_code : 000100090022
     * month : 2017-08
     * propertyList : [{"problem_type_name":"Y","pym":"ybszsz","sjzx_update_time":"2017-06-29 21:35:38","sjzx_update_useruuid":"9BCA50CE85854539BAD347B10643AC9E","pid":1,"code":null,"problem_type_id":2,"type":2,"sjzx_create_useruuid":"897103B02CA448C5BFE243B824DC0200","deleted":0,"sjzx_update_username":"沈阳车务段管理员","id":51,"is_leader":0,"name":"一般失职失责","sjzx_create_username":"赤峰车务段系统管理员","sjzx_create_time":"2017-06-19 14:07:21"},{"problem_type_name":"Z","pym":"yzszsz","sjzx_update_time":"2017-06-29 21:35:13","sjzx_update_useruuid":"9BCA50CE85854539BAD347B10643AC9E","pid":1,"code":null,"problem_type_id":1,"type":2,"sjzx_create_useruuid":"897103B02CA448C5BFE243B824DC0200","deleted":0,"sjzx_update_username":"沈阳车务段管理员","id":52,"is_leader":0,"name":"严重失职失责","sjzx_create_username":"赤峰车务段系统管理员","sjzx_create_time":"2017-06-19 14:07:07"},{"problem_type_name":"T","pym":"dzgzgwhhxwt","sjzx_update_time":"2017-06-29 21:33:18","sjzx_update_useruuid":"9BCA50CE85854539BAD347B10643AC9E","pid":2,"code":null,"problem_type_id":3,"type":2,"sjzx_create_useruuid":"897103B02CA448C5BFE243B824DC0200","deleted":0,"sjzx_update_username":"沈阳车务段管理员","id":106,"is_leader":0,"name":"调整工作岗位（含\u201c红线\u201d问题）","sjzx_create_username":"赤峰车务段系统管理员","sjzx_create_time":"2017-06-19 14:07:45"},{"problem_type_name":"J","pym":"jyzlgkh","sjzx_update_time":null,"sjzx_update_useruuid":null,"pid":2,"code":null,"problem_type_id":4,"type":2,"sjzx_create_useruuid":"897103B02CA448C5BFE243B824DC0200","deleted":0,"sjzx_update_username":null,"id":103,"is_leader":0,"name":"较严重联挂考核","sjzx_create_username":"赤峰车务段系统管理员","sjzx_create_time":"2017-06-19 14:08:50"},{"problem_type_name":"T","pym":"nbxg","sjzx_update_time":null,"sjzx_update_useruuid":null,"pid":2,"code":null,"problem_type_id":3,"type":2,"sjzx_create_useruuid":"897103B02CA448C5BFE243B824DC0200","deleted":0,"sjzx_update_username":null,"id":105,"is_leader":0,"name":"内部下岗","sjzx_create_username":"赤峰车务段系统管理员","sjzx_create_time":"2017-06-19 14:08:02"},{"problem_type_name":"P","pym":"ppjy","sjzx_update_time":null,"sjzx_update_useruuid":null,"pid":2,"code":null,"problem_type_id":5,"type":2,"sjzx_create_useruuid":"897103B02CA448C5BFE243B824DC0200","deleted":0,"sjzx_update_username":null,"id":101,"is_leader":0,"name":"批评教育","sjzx_create_username":"赤峰车务段系统管理员","sjzx_create_time":"2017-06-19 14:09:47"},{"problem_type_name":"Y","pym":"yblgkh","sjzx_update_time":null,"sjzx_update_useruuid":null,"pid":2,"code":null,"problem_type_id":2,"type":2,"sjzx_create_useruuid":"897103B02CA448C5BFE243B824DC0200","deleted":0,"sjzx_update_username":null,"id":102,"is_leader":0,"name":"一般联挂考核","sjzx_create_username":"赤峰车务段系统管理员","sjzx_create_time":"2017-06-19 14:09:10"},{"problem_type_name":"Z","pym":"yzlgkh","sjzx_update_time":null,"sjzx_update_useruuid":null,"pid":2,"code":null,"problem_type_id":1,"type":2,"sjzx_create_useruuid":"897103B02CA448C5BFE243B824DC0200","deleted":0,"sjzx_update_username":null,"id":104,"is_leader":0,"name":"严重联挂考核","sjzx_create_username":"赤峰车务段系统管理员","sjzx_create_time":"2017-06-19 14:08:31"}]
     */

    private String searchDeptNodes;
    private TimeInfoBean timeInfo;
    private PageBean page;
    private String dept_code;
    private String month;
    private List<PropertyListBean> propertyList;

    public AssessScoreBean() {
    }

    public AssessScoreBean(int num, int size, String date, String departName, String departId, String departCode, String userName) {
        this.num = num;
        this.size = size;
        this.date = date;
        this.departName = departName;
        this.departId = departId;
        this.departCode = departCode;
        this.userName = userName;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    public String getDepartId() {
        return departId;
    }

    public void setDepartId(String departId) {
        this.departId = departId;
    }

    public String getDepartCode() {
        return departCode;
    }

    public void setDepartCode(String departCode) {
        this.departCode = departCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSearchDeptNodes() {
        return searchDeptNodes;
    }

    public void setSearchDeptNodes(String searchDeptNodes) {
        this.searchDeptNodes = searchDeptNodes;
    }

    public TimeInfoBean getTimeInfo() {
        return timeInfo;
    }

    public void setTimeInfo(TimeInfoBean timeInfo) {
        this.timeInfo = timeInfo;
    }

    public PageBean getPage() {
        return page;
    }

    public void setPage(PageBean page) {
        this.page = page;
    }

    public String getDept_code() {
        return dept_code;
    }

    public void setDept_code(String dept_code) {
        this.dept_code = dept_code;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public List<PropertyListBean> getPropertyList() {
        return propertyList;
    }

    public void setPropertyList(List<PropertyListBean> propertyList) {
        this.propertyList = propertyList;
    }

    public static class TimeInfoBean {
        /**
         * endtime : 2017-08-25 08:00
         * starttime : 2017-07-25 08:00
         * month : 2017-08
         */

        private String endtime;
        private String starttime;
        private String month;

        public String getEndtime() {
            return endtime;
        }

        public void setEndtime(String endtime) {
            this.endtime = endtime;
        }

        public String getStarttime() {
            return starttime;
        }

        public void setStarttime(String starttime) {
            this.starttime = starttime;
        }

        public String getMonth() {
            return month;
        }

        public void setMonth(String month) {
            this.month = month;
        }
    }

    public static class PageBean {
        /**
         * lastPage : true
         * pageSize : 50
         * pageNumber : 1
         * firstPage : true
         * list : [{"position":3877,"final_level_name":null,"lrk_score":null,"key_time":0,"final_score":2,"position_name":"工程师","approve_id":30834,"add_min_score":2,"self_realistic":12,"rownum_":1,"risk_con_score":-10,"danger_find_add_score":0,"dept_full_name":"沈阳铁路局-运输处-沈阳车务段-安全科","problem_real_add_score":0,"sjld_score":null,"name":"沈阳车务段管理员","month":"2017-08","user_id":189516,"problem_real_minus_score":0,"starting_score":"0","awh":0}]
         * totalRow : 1
         * totalPage : 1
         */

        private boolean lastPage;
        private int pageSize;
        private int pageNumber;
        private boolean firstPage;
        private int totalRow;
        private int totalPage;
        private List<ListBean> list;

        public boolean isLastPage() {
            return lastPage;
        }

        public void setLastPage(boolean lastPage) {
            this.lastPage = lastPage;
        }

        public int getPageSize() {
            return pageSize;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }

        public int getPageNumber() {
            return pageNumber;
        }

        public void setPageNumber(int pageNumber) {
            this.pageNumber = pageNumber;
        }

        public boolean isFirstPage() {
            return firstPage;
        }

        public void setFirstPage(boolean firstPage) {
            this.firstPage = firstPage;
        }

        public int getTotalRow() {
            return totalRow;
        }

        public void setTotalRow(int totalRow) {
            this.totalRow = totalRow;
        }

        public int getTotalPage() {
            return totalPage;
        }

        public void setTotalPage(int totalPage) {
            this.totalPage = totalPage;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * position : 3877
             * final_level_name : null
             * lrk_score : null
             * key_time : 0
             * final_score : 2
             * position_name : 工程师
             * approve_id : 30834
             * add_min_score : 2
             * self_realistic : 12
             * rownum_ : 1
             * risk_con_score : -10
             * danger_find_add_score : 0
             * dept_full_name : 沈阳铁路局-运输处-沈阳车务段-安全科
             * problem_real_add_score : 0
             * sjld_score : null
             * name : 沈阳车务段管理员
             * month : 2017-08
             * user_id : 189516
             * problem_real_minus_score : 0
             * starting_score : 0
             * awh : 0
             */

            private int position;
            private String final_level_name;
            private String lrk_score;
            private String key_time;
            private String final_score;
            private String position_name;
            private int approve_id;
            private String add_min_score;
            private String self_realistic;
            private int rownum_;
            private String risk_con_score;
            private String danger_find_add_score;
            private String dept_full_name;
            private String problem_real_add_score;
            private String sjld_score;
            private String name;
            private String month;
            private String user_id;
            private String problem_real_minus_score;
            private String starting_score;
            private String awh;
            private AssessScoreInfoBean info;
            private List<PropertyListBean> listBean;

            public List<PropertyListBean> getListBean() {
                return listBean;
            }

            public void setListBean(List<PropertyListBean> listBean) {
                this.listBean = listBean;
            }

            public AssessScoreInfoBean getInfo() {
                return info;
            }

            public void setInfo(AssessScoreInfoBean info) {
                this.info = info;
            }

            public int getPosition() {
                return position;
            }

            public void setPosition(int position) {
                this.position = position;
            }

            public String getFinal_level_name() {
                return final_level_name;
            }

            public void setFinal_level_name(String final_level_name) {
                this.final_level_name = final_level_name;
            }

            public String getLrk_score() {
                return lrk_score;
            }

            public void setLrk_score(String lrk_score) {
                this.lrk_score = lrk_score;
            }

            public String getKey_time() {
                return key_time;
            }

            public void setKey_time(String key_time) {
                this.key_time = key_time;
            }

            public String getFinal_score() {
                return final_score;
            }

            public void setFinal_score(String final_score) {
                this.final_score = final_score;
            }

            public String getPosition_name() {
                return position_name;
            }

            public void setPosition_name(String position_name) {
                this.position_name = position_name;
            }

            public int getApprove_id() {
                return approve_id;
            }

            public void setApprove_id(int approve_id) {
                this.approve_id = approve_id;
            }

            public String getAdd_min_score() {
                return add_min_score;
            }

            public void setAdd_min_score(String add_min_score) {
                this.add_min_score = add_min_score;
            }

            public String getSelf_realistic() {
                return self_realistic;
            }

            public void setSelf_realistic(String self_realistic) {
                this.self_realistic = self_realistic;
            }

            public int getRownum_() {
                return rownum_;
            }

            public void setRownum_(int rownum_) {
                this.rownum_ = rownum_;
            }

            public String getRisk_con_score() {
                return risk_con_score;
            }

            public void setRisk_con_score(String risk_con_score) {
                this.risk_con_score = risk_con_score;
            }

            public String getDanger_find_add_score() {
                return danger_find_add_score;
            }

            public void setDanger_find_add_score(String danger_find_add_score) {
                this.danger_find_add_score = danger_find_add_score;
            }

            public String getDept_full_name() {
                return dept_full_name;
            }

            public void setDept_full_name(String dept_full_name) {
                this.dept_full_name = dept_full_name;
            }

            public String getProblem_real_add_score() {
                return problem_real_add_score;
            }

            public void setProblem_real_add_score(String problem_real_add_score) {
                this.problem_real_add_score = problem_real_add_score;
            }

            public String getSjld_score() {
                return sjld_score;
            }

            public void setSjld_score(String sjld_score) {
                this.sjld_score = sjld_score;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getMonth() {
                return month;
            }

            public void setMonth(String month) {
                this.month = month;
            }

            public String getUser_id() {
                return user_id;
            }

            public void setUser_id(String user_id) {
                this.user_id = user_id;
            }

            public String getProblem_real_minus_score() {
                return problem_real_minus_score;
            }

            public void setProblem_real_minus_score(String problem_real_minus_score) {
                this.problem_real_minus_score = problem_real_minus_score;
            }

            public String getStarting_score() {
                return starting_score;
            }

            public void setStarting_score(String starting_score) {
                this.starting_score = starting_score;
            }

            public String getAwh() {
                return awh;
            }

            public void setAwh(String awh) {
                this.awh = awh;
            }
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
}
