package com.xianzhi.integration.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @Administrator LiBo.
 * @Date 2017/8/1.
 * @Function
 */

public class AssessCollectBean implements Serializable {

    private int num;
    private int size;
    private String date;
    private String departName;
    private String deapartId;
    private String departCode;
    private String userName;

    private int itemId;

    /**
     * searchDeptNodes : [{"pym":"sycwd","dbm":null,"class_name":"日勤制(日)","type":1,"cognizance_user_id":null,"class_select":0,"id":3862,"level":3,"name":"沈阳车务段","response_user_id":263023,"safe_overtime":2400,"equdepartment":0,"leader_user_id":45402,"property":null,"pid":195,"available":1,"code":"000100090022","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":1,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":219160,"my_level":3,"start_date":null},{"pym":"ldbz","dbm":null,"class_name":"日勤制(日)","type":4,"cognizance_user_id":null,"class_select":0,"id":3863,"level":4,"name":"领导班子","response_user_id":263023,"safe_overtime":null,"equdepartment":0,"leader_user_id":45402,"property":null,"pid":3862,"available":1,"code":"0001000900220001","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"kyhsrk","dbm":null,"class_name":"日勤制(日)","type":11,"cognizance_user_id":null,"class_select":0,"id":3864,"level":4,"name":"客运和收入科","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220002","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"dqb","dbm":null,"class_name":"日勤制(日)","type":11,"cognizance_user_id":null,"class_select":0,"id":3865,"level":4,"name":"党群办","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220003","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"jhcwk","dbm":null,"class_name":"日勤制(日)","type":11,"cognizance_user_id":null,"class_select":0,"id":3866,"level":4,"name":"计划财务科","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220004","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"bwk","dbm":null,"class_name":"日勤制(日)","type":11,"cognizance_user_id":null,"class_select":0,"id":3867,"level":4,"name":"保卫科","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220005","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"ldrsk","dbm":null,"class_name":"日勤制(日)","type":11,"cognizance_user_id":null,"class_select":0,"id":3868,"level":4,"name":"劳动人事科","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220006","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"jshtjk","dbm":null,"class_name":"日勤制(日)","type":11,"cognizance_user_id":null,"class_select":0,"id":3869,"level":4,"name":"技术和统计科","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220007","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"aqk","dbm":null,"class_name":"日勤制(日)","type":11,"cognizance_user_id":null,"class_select":0,"id":3870,"level":4,"name":"安全科","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220008","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"bgs","dbm":null,"class_name":"日勤制(日)","type":11,"cognizance_user_id":null,"class_select":0,"id":3871,"level":4,"name":"办公室","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220009","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"dds","dbm":null,"class_name":"日勤制(日)","type":11,"cognizance_user_id":null,"class_select":0,"id":3872,"level":4,"name":"调度室","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220010","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"zgjyk","dbm":null,"class_name":"日勤制(日)","type":11,"cognizance_user_id":null,"class_select":0,"id":3873,"level":4,"name":"职工教育科","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220011","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"jtb","dbm":null,"class_name":"日勤制(日)","type":11,"cognizance_user_id":null,"class_select":0,"id":16565,"level":4,"name":"集体办","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220068","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-04-09 13:59:58","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"wlgs","dbm":null,"class_name":"日勤制(日)","type":12,"cognizance_user_id":null,"class_select":0,"id":16579,"level":4,"name":"物流公司","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220069","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-04-17 18:24:01","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"ljtz","dbm":"LTT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3874,"level":4,"name":"揽军屯站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220012","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"zwqz","dbm":"ZQT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3876,"level":4,"name":"转弯桥站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220013","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"lssz","dbm":"LCT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3878,"level":4,"name":"乱石山站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220014","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"pdbz","dbm":"PDT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3880,"level":4,"name":"平顶堡站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220015","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"jzz","dbm":"JNT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3882,"level":4,"name":"旧站站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220016","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"xtzz","dbm":"XIT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3884,"level":4,"name":"新台子站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220017","deleted":0,"station_level":3,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"tlxz","dbm":"PXT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3886,"level":4,"name":"铁岭西站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220018","deleted":0,"station_level":2,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"xfz","dbm":"XFT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3891,"level":4,"name":"西丰站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220019","deleted":0,"station_level":3,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"smzz","dbm":"SMT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3893,"level":4,"name":"双庙子站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220020","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"hhz","dbm":"HHT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3895,"level":4,"name":"浑河站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220021","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"mjdz","dbm":"MDT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3897,"level":4,"name":"毛家店站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220022","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"kyxz","dbm":"KXT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3899,"level":4,"name":"开原西站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220023","deleted":0,"station_level":3,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"hstz","dbm":"HUT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3902,"level":4,"name":"虎石台站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220024","deleted":0,"station_level":3,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"dqz","dbm":"DZT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3904,"level":4,"name":"大青站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220025","deleted":0,"station_level":2,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"yhz","dbm":"YHT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3910,"level":4,"name":"于洪站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220026","deleted":0,"station_level":3,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"gjzz","dbm":"GKT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3912,"level":4,"name":"孤家子站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220027","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"qyz","dbm":"QYT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3914,"level":4,"name":"清原站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220028","deleted":0,"station_level":3,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"sscz","dbm":"SUT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3922,"level":4,"name":"松树村站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220029","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"dhtz","dbm":"DOT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3926,"level":4,"name":"斗虎屯站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220030","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"nkqz","dbm":"NKT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3932,"level":4,"name":"南口前站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220031","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"amz","dbm":"ANT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3942,"level":4,"name":"安民站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220032","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"hsz","dbm":"HGT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3946,"level":4,"name":"辉山站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220033","deleted":0,"station_level":3,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"slz","dbm":"SQD","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3948,"level":4,"name":"沙岭站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220034","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"smlz","dbm":"SLT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3950,"level":4,"name":"石门岭站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220035","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"nzmz","dbm":"NZT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3952,"level":4,"name":"南杂木站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220036","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"dstz","dbm":"DET","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3965,"level":4,"name":"得胜台站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220037","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"csz","dbm":"CST","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3971,"level":4,"name":"苍石站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220038","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"dgtz","dbm":"DTT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3973,"level":4,"name":"大官屯站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220039","deleted":0,"station_level":2,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"ctxz","dbm":"CPT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3981,"level":4,"name":"昌图西站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220040","deleted":0,"station_level":3,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"ystz","dbm":"YUT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3987,"level":4,"name":"榆树台站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220041","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"xczz","dbm":"XCT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3997,"level":4,"name":"新城子站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220042","deleted":0,"station_level":3,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"qdz","dbm":"QDT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3999,"level":4,"name":"前甸站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220043","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"mzhz","dbm":"MZT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4001,"level":4,"name":"马仲河站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220044","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"dcz","dbm":"DCT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4003,"level":4,"name":"大成站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220045","deleted":0,"station_level":2,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"fsbz","dbm":"FET","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4011,"level":4,"name":"抚顺北站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220046","deleted":0,"station_level":2,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"tlz","dbm":"TLT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4028,"level":4,"name":"铁岭站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220047","deleted":0,"station_level":2,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"tytz","dbm":"PYT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4049,"level":4,"name":"田义屯站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220048","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"hgtz","dbm":"HTT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4055,"level":4,"name":"皇姑屯站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220049","deleted":0,"station_level":3,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"dtz","dbm":"DKT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4062,"level":4,"name":"滴台站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220050","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"dlz","dbm":"DRT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4067,"level":4,"name":"东陵站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220051","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"zxbz","dbm":"TXT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4076,"level":4,"name":"镇西堡站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220052","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"wgtz","dbm":"WTT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4078,"level":4,"name":"文官屯站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220053","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"sjzz","dbm":"SWT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4080,"level":4,"name":"深井子站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220054","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"ypz","dbm":"YPT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4082,"level":4,"name":"营盘站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220055","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"ctz","dbm":"CTT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4090,"level":4,"name":"昌图站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220056","deleted":0,"station_level":2,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"zdz","dbm":"ZHT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4096,"level":4,"name":"章党站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220057","deleted":0,"station_level":3,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"bsjz","dbm":"BET","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4113,"level":4,"name":"北三家站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220058","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"sydz","dbm":"SDT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4115,"level":4,"name":"沈阳东站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220059","deleted":0,"station_level":2,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"petz","dbm":"PRT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4123,"level":4,"name":"瓢儿屯站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220060","deleted":0,"station_level":2,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"kyz","dbm":"KYT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4125,"level":4,"name":"开原站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220061","deleted":0,"station_level":2,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"tbsz","dbm":"TET","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4145,"level":4,"name":"铁背山站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220062","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"hsgz","dbm":"HGD","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4150,"level":4,"name":"火石岗站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220063","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"jhz","dbm":"JHD","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4152,"level":4,"name":"近海站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220064","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"zgz","dbm":"ZGT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4154,"level":4,"name":"中固站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220065","deleted":0,"station_level":4,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"nlg","dbm":null,"class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":16249,"level":4,"name":"内陆港","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220066","deleted":0,"station_level":2,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-03-06 11:14:29","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"syxz","dbm":null,"class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":16560,"level":4,"name":"沈阳西站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220067","deleted":0,"station_level":3,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-04-07 18:47:53","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"23","dbm":null,"class_name":"日勤制(日)","type":12,"cognizance_user_id":null,"class_select":0,"id":16838,"level":5,"name":"23","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3876,"available":1,"code":"00010009002200130005","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-06 09:13:32","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"yzcjcs","dbm":null,"class_name":"日勤制(日)","type":12,"cognizance_user_id":null,"class_select":0,"id":16848,"level":5,"name":"运转车间测试","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3878,"available":1,"code":"00010009002200140001","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-11 09:41:45","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"yzbz","dbm":null,"class_name":"日勤制(日)","type":12,"cognizance_user_id":null,"class_select":0,"id":15084,"level":5,"name":"运转班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4011,"available":1,"code":"00010009002200460017","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"yzbz","dbm":null,"class_name":"日勤制(日)","type":12,"cognizance_user_id":null,"class_select":0,"id":15096,"level":5,"name":"运转班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4028,"available":1,"code":"00010009002200470001","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"kybz","dbm":null,"class_name":"日勤制(日)","type":12,"cognizance_user_id":null,"class_select":0,"id":15097,"level":5,"name":"客运班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4028,"available":1,"code":"00010009002200470002","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"kybz","dbm":null,"class_name":"日勤制(日)","type":12,"cognizance_user_id":null,"class_select":0,"id":15087,"level":5,"name":"客运班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4125,"available":1,"code":"00010009002200610010","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"csglsbz","dbm":null,"class_name":"大四班1(丨,\u2014,○,丨,\u2014,○,○,○)","type":14,"cognizance_user_id":null,"class_select":0,"id":17468,"level":5,"name":"测试管理四班制","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3870,"available":1,"code":"00010009002200080001","deleted":0,"station_level":null,"url":null,"class_id":120,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-26 21:36:05","unit_type":null,"document_user":null,"my_level":5,"start_date":"2017-07-26"},{"pym":"xcyb","dbm":null,"class_name":"小四班制1(▲,丨▼,○,○)","type":14,"cognizance_user_id":null,"class_select":1,"id":16592,"level":5,"name":"行车一班","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3876,"available":1,"code":"00010009002200130001","deleted":0,"station_level":null,"url":null,"class_id":38,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-05-01 18:41:42","unit_type":null,"document_user":null,"my_level":5,"start_date":"2017-07-10"},{"pym":"eb","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":16593,"level":5,"name":"二班","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3876,"available":1,"code":"00010009002200130002","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-05-01 18:42:11","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"cscj","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":16834,"level":5,"name":"测试车间","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3876,"available":1,"code":"00010009002200130003","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-06-30 20:34:56","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"csbz2","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":16837,"level":5,"name":"测试班组2","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3876,"available":1,"code":"00010009002200130004","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-06 08:26:17","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"csbz3","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":16839,"level":5,"name":"测试班组3","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3876,"available":1,"code":"00010009002200130006","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-06 09:39:31","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"cscj3","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":16840,"level":5,"name":"测试车间3","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3876,"available":1,"code":"00010009002200130007","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-06 09:39:53","unit_type":null,"document_user":null,"my_level":5,"start_date":"2017-07-24"},{"pym":"cscj4","dbm":null,"class_name":"两班制1(╳,○)","type":14,"cognizance_user_id":null,"class_select":0,"id":17446,"level":5,"name":"测试车间4","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3876,"available":1,"code":"00010009002200130008","deleted":0,"station_level":null,"url":null,"class_id":31,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-24 08:56:23","unit_type":null,"document_user":null,"my_level":5,"start_date":"2017-07-29"},{"pym":"yzbz","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":15090,"level":5,"name":"运转班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3914,"available":1,"code":"00010009002200280001","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"kybz","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":15091,"level":5,"name":"客运班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3914,"available":1,"code":"00010009002200280002","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"kybz","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":3974,"level":5,"name":"客运班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3973,"available":1,"code":"00010009002200390001","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"yzbz","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":3976,"level":5,"name":"运转班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3973,"available":1,"code":"00010009002200390003","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"yzbz","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":4005,"level":5,"name":"运转班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4003,"available":1,"code":"00010009002200450002","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"kybz","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":4010,"level":5,"name":"客运班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4003,"available":1,"code":"00010009002200450007","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"kybz","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":4012,"level":5,"name":"客运班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4011,"available":1,"code":"00010009002200460001","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"yzbz","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":4091,"level":5,"name":"运转班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4090,"available":1,"code":"00010009002200560001","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"kybz","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":4095,"level":5,"name":"客运班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4090,"available":1,"code":"00010009002200560005","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"kybz","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":4116,"level":5,"name":"客运班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4115,"available":1,"code":"00010009002200590001","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"yzbz","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":4121,"level":5,"name":"运转班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4115,"available":1,"code":"00010009002200590006","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"yzbz","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":4134,"level":5,"name":"运转班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4125,"available":1,"code":"00010009002200610009","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"cscj5","dbm":null,"class_name":"两班制1(╳,○)","type":15,"cognizance_user_id":null,"class_select":1,"id":17447,"level":5,"name":"测试车间5","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3876,"available":1,"code":"00010009002200130009","deleted":0,"station_level":null,"url":null,"class_id":31,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-24 09:42:29","unit_type":null,"document_user":null,"my_level":5,"start_date":"2017-07-24"},{"pym":"cszyxz","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":16835,"level":6,"name":"测试作业小组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":16834,"available":1,"code":"000100090022001300030001","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-06-30 20:35:12","unit_type":null,"document_user":null,"my_level":6,"start_date":null},{"pym":"A","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":16836,"level":6,"name":"A","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":16834,"available":1,"code":"000100090022001300030002","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-05 21:33:05","unit_type":null,"document_user":null,"my_level":6,"start_date":null},{"pym":"yzd4yb","dbm":null,"class_name":"大四班制(丨,\u2014,○,○)","type":14,"cognizance_user_id":null,"class_select":1,"id":16849,"level":6,"name":"运转大4一班","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":16848,"available":1,"code":"000100090022001400010001","deleted":0,"station_level":null,"url":null,"class_id":37,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-11 09:46:28","unit_type":null,"document_user":null,"my_level":6,"start_date":"2017-07-11"},{"pym":"zyxz4","dbm":null,"class_name":"两班制2(╳,╳,○,○)","type":15,"cognizance_user_id":null,"class_select":1,"id":16841,"level":6,"name":"作业小组4","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":16592,"available":1,"code":"000100090022001300010001","deleted":0,"station_level":null,"url":null,"class_id":32,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-06 09:40:53","unit_type":null,"document_user":null,"my_level":6,"start_date":"2017-07-06"},{"pym":"zyxz2","dbm":null,"class_name":"日勤制(日)","type":15,"cognizance_user_id":null,"class_select":0,"id":17396,"level":6,"name":"作业小组2","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":16593,"available":1,"code":"000100090022001300020001","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-16 17:48:21","unit_type":null,"document_user":null,"my_level":6,"start_date":null},{"pym":"yd","dbm":null,"class_name":"日勤制(日)","type":15,"cognizance_user_id":null,"class_select":0,"id":17397,"level":6,"name":"一调","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":15090,"available":1,"code":"000100090022002800010001","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-16 17:50:26","unit_type":null,"document_user":null,"my_level":6,"start_date":null},{"pym":"ed","dbm":null,"class_name":"日勤制(日)","type":15,"cognizance_user_id":null,"class_select":0,"id":17398,"level":6,"name":"二调","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":15090,"available":1,"code":"000100090022002800010002","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-16 17:50:33","unit_type":null,"document_user":null,"my_level":6,"start_date":null},{"pym":"yd","dbm":null,"class_name":"日勤制(日)","type":15,"cognizance_user_id":null,"class_select":0,"id":17399,"level":6,"name":"一调","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":15091,"available":1,"code":"000100090022002800020001","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-16 17:50:42","unit_type":null,"document_user":null,"my_level":6,"start_date":null},{"pym":"ed","dbm":null,"class_name":"日勤制(日)","type":15,"cognizance_user_id":null,"class_select":0,"id":17400,"level":6,"name":"二调","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":15091,"available":1,"code":"000100090022002800020002","deleted":0,"station_level":null,"url":null,"class_id":1,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-16 17:50:56","unit_type":null,"document_user":null,"my_level":6,"start_date":null},{"pym":"yzybyxz","dbm":null,"class_name":"大四班制(丨,\u2014,○,○)","type":15,"cognizance_user_id":null,"class_select":1,"id":16850,"level":7,"name":"运转一班一小组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":16849,"available":1,"code":"0001000900220014000100010001","deleted":0,"station_level":null,"url":null,"class_id":37,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-11 09:49:01","unit_type":null,"document_user":null,"my_level":7,"start_date":"2017-07-11"}]
     * flag : 1
     * page : {"lastPage":true,"pageSize":50,"pageNumber":1,"firstPage":true,"list":[{"birth":"20170124","dept_name4":"安全科","dept_name3":"沈阳车务段","sso_uuid":"9BCA50CE85854539BAD347B10643AC9E","leader_type":1,"quan_post_name":"测试日勤岗","bzb":0,"dept_full_name":"沈阳铁路局-运输处-沈阳车务段-安全科","laid_off_time":null,"dept_name7":null,"dept_name5":null,"dept_name6":null,"dept_code7":null,"ctc":0,"dept_code6":null,"user_type_name":"在岗工作","dept_code5":null,"dept_code4":"0001000900220008","seniority1":null,"dept_code3":"000100090022","month":"2017-08","pm":0,"isshangbao":"0","comment1":"斯科拉的解放路卡死机的连","comment2":"1.小明发收款的解放路空间爱迪生\r\n2.小红十点多就发啦数据了\r\n3.啥都放假了卡萨李开复撒","position":3877,"dt":0,"sys":0,"fhy":0,"lw":0,"zdz":0,"is_leadership":1,"start_work_date":"20370124","dept_id":3870,"dg":0,"token":"098CDE226D8638E59D8727C5AA738F21","leader_id3":189516,"ccsj":0,"position_duty":null,"leader_id1":189516,"leader_id2":189516,"dept_cwd_or_stn_name":"沈阳车务段","dept_station_code":null,"approve_time2":"2017-07-26 14:32:37","post":1,"approve_time1":"2017-07-26 14:31:26","approve_time3":"2017-07-26 17:00:52","dept_station_name":null,"technical_level":null,"approve_id":30833,"labor":null,"dept_cwd_or_stn_code":"000100090022","feeling":null,"login_name":"admin-sycwd","user_type_id":1,"lzh":"189516","cb":0,"card_number":null,"tel":null,"tf":0,"quan_post_id":104,"type":0,"remark1":null,"password":"C4CA4238A0B923820DCC509A6F75849B","remark3":null,"remark2":null,"system_level_name":"失格","is_leader":0,"gender":1,"inbox_do_sort":"SEND_USER1","dept_cwd_name":"沈阳车务段","seniority":1,"post_name":"空","dc":0,"technical_level_name":null,"status":1,"jsj":0,"dept_code":"0001000900220008","key_person_mark":0,"leader_type_name":"专业技术","deleted":0,"6502":0,"position_name":"工程师","email":null,"dept_cwd_code":"000100090022","create_time":"2017-01-24 23:37:14","work_experience":null,"ch":0,"pym":"sycwdgly","zg":0,"zb":0,"cert_id":null,"cancel_status":0,"hj":0,"dept_type":11,"last_login_ip":null,"id_card":"admin-sycwd","education":"本科","ljy":0,"id":189516,"rownum_":1,"name":"沈阳车务段管理员","sso_app_name":null,"user_id":189516,"outbox_do_sort":"CREATE_DATE2","ethnic":null,"final_level_name":"一级","political":null,"last_login_time":"2017-08-01 15:07:17","working_time":null,"yb":0,"edit":1,"duty_name":null,"photo":null,"final_score":37,"dcz":0,"login_count":8234},{"birth":"20170124","dept_name4":"安全科","dept_name3":"沈阳车务段","sso_uuid":"9BCA50CE85854539BAD347B10643AC9E","leader_type":1,"quan_post_name":"测试日勤岗","bzb":0,"dept_full_name":"沈阳铁路局-运输处-沈阳车务段-安全科","laid_off_time":null,"dept_name7":null,"dept_name5":null,"dept_name6":null,"dept_code7":null,"ctc":0,"dept_code6":null,"user_type_name":"在岗工作","dept_code5":null,"dept_code4":"0001000900220008","seniority1":null,"dept_code3":"000100090022","month":"2017-08","pm":0,"isshangbao":"0","comment1":null,"comment2":null,"position":3877,"dt":0,"sys":0,"fhy":0,"lw":0,"zdz":0,"is_leadership":1,"start_work_date":"20370124","dept_id":3870,"dg":0,"token":"098CDE226D8638E59D8727C5AA738F21","leader_id3":null,"ccsj":0,"position_duty":null,"leader_id1":189516,"leader_id2":null,"dept_cwd_or_stn_name":"沈阳车务段","dept_station_code":null,"approve_time2":null,"post":1,"approve_time1":null,"approve_time3":null,"dept_station_name":null,"technical_level":null,"approve_id":30834,"labor":null,"dept_cwd_or_stn_code":"000100090022","feeling":null,"login_name":"admin-sycwd","user_type_id":1,"lzh":"189516","cb":0,"card_number":null,"tel":null,"tf":0,"quan_post_id":104,"type":0,"remark1":null,"password":"C4CA4238A0B923820DCC509A6F75849B","remark3":null,"remark2":null,"system_level_name":"失格","is_leader":0,"gender":1,"inbox_do_sort":"SEND_USER1","dept_cwd_name":"沈阳车务段","seniority":1,"post_name":"空","dc":0,"technical_level_name":null,"status":1,"jsj":0,"dept_code":"0001000900220008","key_person_mark":0,"leader_type_name":"专业技术","deleted":0,"6502":0,"position_name":"工程师","email":null,"dept_cwd_code":"000100090022","create_time":"2017-01-24 23:37:14","work_experience":null,"ch":0,"pym":"sycwdgly","zg":0,"zb":0,"cert_id":null,"cancel_status":0,"hj":0,"dept_type":11,"last_login_ip":null,"id_card":"admin-sycwd","education":"本科","ljy":0,"id":189516,"rownum_":2,"name":"沈阳车务段管理员","sso_app_name":null,"user_id":189516,"outbox_do_sort":"CREATE_DATE2","ethnic":null,"final_level_name":null,"political":null,"last_login_time":"2017-08-01 15:07:17","working_time":null,"yb":0,"edit":0,"duty_name":null,"photo":null,"final_score":2,"dcz":0,"login_count":8234}],"totalRow":2,"totalPage":1}
     * dept_code : 0001000900220008
     * name : 管理员
     * month : 2017-08
     */

    private String searchDeptNodes;
    private String flag;
    private PageBean page;
    private String dept_code;
    private String name;
    private String month;
    /**
     * status : 0
     * info : 驳回成功！
     */

    private int status;
    private String info;

    public AssessCollectBean() {
    }

    public AssessCollectBean(int itemId) {
        this.itemId = itemId;
    }

    public AssessCollectBean(int num, int size, String date, String departName, String deapartId, String departCode, String userName) {
        this.num = num;
        this.size = size;
        this.date = date;
        this.departName = departName;
        this.deapartId = deapartId;
        this.departCode = departCode;
        this.userName = userName;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
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

    public String getDeapartId() {
        return deapartId;
    }

    public void setDeapartId(String deapartId) {
        this.deapartId = deapartId;
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

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public static class PageBean {
        /**
         * lastPage : true
         * pageSize : 50
         * pageNumber : 1
         * firstPage : true
         * list : [{"birth":"20170124","dept_name4":"安全科","dept_name3":"沈阳车务段","sso_uuid":"9BCA50CE85854539BAD347B10643AC9E","leader_type":1,"quan_post_name":"测试日勤岗","bzb":0,"dept_full_name":"沈阳铁路局-运输处-沈阳车务段-安全科","laid_off_time":null,"dept_name7":null,"dept_name5":null,"dept_name6":null,"dept_code7":null,"ctc":0,"dept_code6":null,"user_type_name":"在岗工作","dept_code5":null,"dept_code4":"0001000900220008","seniority1":null,"dept_code3":"000100090022","month":"2017-08","pm":0,"isshangbao":"0","comment1":"斯科拉的解放路卡死机的连","comment2":"1.小明发收款的解放路空间爱迪生\r\n2.小红十点多就发啦数据了\r\n3.啥都放假了卡萨李开复撒","position":3877,"dt":0,"sys":0,"fhy":0,"lw":0,"zdz":0,"is_leadership":1,"start_work_date":"20370124","dept_id":3870,"dg":0,"token":"098CDE226D8638E59D8727C5AA738F21","leader_id3":189516,"ccsj":0,"position_duty":null,"leader_id1":189516,"leader_id2":189516,"dept_cwd_or_stn_name":"沈阳车务段","dept_station_code":null,"approve_time2":"2017-07-26 14:32:37","post":1,"approve_time1":"2017-07-26 14:31:26","approve_time3":"2017-07-26 17:00:52","dept_station_name":null,"technical_level":null,"approve_id":30833,"labor":null,"dept_cwd_or_stn_code":"000100090022","feeling":null,"login_name":"admin-sycwd","user_type_id":1,"lzh":"189516","cb":0,"card_number":null,"tel":null,"tf":0,"quan_post_id":104,"type":0,"remark1":null,"password":"C4CA4238A0B923820DCC509A6F75849B","remark3":null,"remark2":null,"system_level_name":"失格","is_leader":0,"gender":1,"inbox_do_sort":"SEND_USER1","dept_cwd_name":"沈阳车务段","seniority":1,"post_name":"空","dc":0,"technical_level_name":null,"status":1,"jsj":0,"dept_code":"0001000900220008","key_person_mark":0,"leader_type_name":"专业技术","deleted":0,"6502":0,"position_name":"工程师","email":null,"dept_cwd_code":"000100090022","create_time":"2017-01-24 23:37:14","work_experience":null,"ch":0,"pym":"sycwdgly","zg":0,"zb":0,"cert_id":null,"cancel_status":0,"hj":0,"dept_type":11,"last_login_ip":null,"id_card":"admin-sycwd","education":"本科","ljy":0,"id":189516,"rownum_":1,"name":"沈阳车务段管理员","sso_app_name":null,"user_id":189516,"outbox_do_sort":"CREATE_DATE2","ethnic":null,"final_level_name":"一级","political":null,"last_login_time":"2017-08-01 15:07:17","working_time":null,"yb":0,"edit":1,"duty_name":null,"photo":null,"final_score":37,"dcz":0,"login_count":8234},{"birth":"20170124","dept_name4":"安全科","dept_name3":"沈阳车务段","sso_uuid":"9BCA50CE85854539BAD347B10643AC9E","leader_type":1,"quan_post_name":"测试日勤岗","bzb":0,"dept_full_name":"沈阳铁路局-运输处-沈阳车务段-安全科","laid_off_time":null,"dept_name7":null,"dept_name5":null,"dept_name6":null,"dept_code7":null,"ctc":0,"dept_code6":null,"user_type_name":"在岗工作","dept_code5":null,"dept_code4":"0001000900220008","seniority1":null,"dept_code3":"000100090022","month":"2017-08","pm":0,"isshangbao":"0","comment1":null,"comment2":null,"position":3877,"dt":0,"sys":0,"fhy":0,"lw":0,"zdz":0,"is_leadership":1,"start_work_date":"20370124","dept_id":3870,"dg":0,"token":"098CDE226D8638E59D8727C5AA738F21","leader_id3":null,"ccsj":0,"position_duty":null,"leader_id1":189516,"leader_id2":null,"dept_cwd_or_stn_name":"沈阳车务段","dept_station_code":null,"approve_time2":null,"post":1,"approve_time1":null,"approve_time3":null,"dept_station_name":null,"technical_level":null,"approve_id":30834,"labor":null,"dept_cwd_or_stn_code":"000100090022","feeling":null,"login_name":"admin-sycwd","user_type_id":1,"lzh":"189516","cb":0,"card_number":null,"tel":null,"tf":0,"quan_post_id":104,"type":0,"remark1":null,"password":"C4CA4238A0B923820DCC509A6F75849B","remark3":null,"remark2":null,"system_level_name":"失格","is_leader":0,"gender":1,"inbox_do_sort":"SEND_USER1","dept_cwd_name":"沈阳车务段","seniority":1,"post_name":"空","dc":0,"technical_level_name":null,"status":1,"jsj":0,"dept_code":"0001000900220008","key_person_mark":0,"leader_type_name":"专业技术","deleted":0,"6502":0,"position_name":"工程师","email":null,"dept_cwd_code":"000100090022","create_time":"2017-01-24 23:37:14","work_experience":null,"ch":0,"pym":"sycwdgly","zg":0,"zb":0,"cert_id":null,"cancel_status":0,"hj":0,"dept_type":11,"last_login_ip":null,"id_card":"admin-sycwd","education":"本科","ljy":0,"id":189516,"rownum_":2,"name":"沈阳车务段管理员","sso_app_name":null,"user_id":189516,"outbox_do_sort":"CREATE_DATE2","ethnic":null,"final_level_name":null,"political":null,"last_login_time":"2017-08-01 15:07:17","working_time":null,"yb":0,"edit":0,"duty_name":null,"photo":null,"final_score":2,"dcz":0,"login_count":8234}]
         * totalRow : 2
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
             * birth : 20170124
             * dept_name4 : 安全科
             * dept_name3 : 沈阳车务段
             * sso_uuid : 9BCA50CE85854539BAD347B10643AC9E
             * leader_type : 1
             * quan_post_name : 测试日勤岗
             * bzb : 0
             * dept_full_name : 沈阳铁路局-运输处-沈阳车务段-安全科
             * laid_off_time : null
             * dept_name7 : null
             * dept_name5 : null
             * dept_name6 : null
             * dept_code7 : null
             * ctc : 0
             * dept_code6 : null
             * user_type_name : 在岗工作
             * dept_code5 : null
             * dept_code4 : 0001000900220008
             * seniority1 : null
             * dept_code3 : 000100090022
             * month : 2017-08
             * pm : 0
             * isshangbao : 0
             * comment1 : 斯科拉的解放路卡死机的连
             * comment2 : 1.小明发收款的解放路空间爱迪生
             2.小红十点多就发啦数据了
             3.啥都放假了卡萨李开复撒
             * position : 3877
             * dt : 0
             * sys : 0
             * fhy : 0
             * lw : 0
             * zdz : 0
             * is_leadership : 1
             * start_work_date : 20370124
             * dept_id : 3870
             * dg : 0
             * token : 098CDE226D8638E59D8727C5AA738F21
             * leader_id3 : 189516
             * ccsj : 0
             * position_duty : null
             * leader_id1 : 189516
             * leader_id2 : 189516
             * dept_cwd_or_stn_name : 沈阳车务段
             * dept_station_code : null
             * approve_time2 : 2017-07-26 14:32:37
             * post : 1
             * approve_time1 : 2017-07-26 14:31:26
             * approve_time3 : 2017-07-26 17:00:52
             * dept_station_name : null
             * technical_level : null
             * approve_id : 30833
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
             * system_level_name : 失格
             * is_leader : 0
             * gender : 1
             * inbox_do_sort : SEND_USER1
             * dept_cwd_name : 沈阳车务段
             * seniority : 1
             * post_name : 空
             * dc : 0
             * technical_level_name : null
             * status : 1
             * jsj : 0
             * dept_code : 0001000900220008
             * key_person_mark : 0
             * leader_type_name : 专业技术
             * deleted : 0
             * 6502 : 0
             * position_name : 工程师
             * email : null
             * dept_cwd_code : 000100090022
             * create_time : 2017-01-24 23:37:14
             * work_experience : null
             * ch : 0
             * pym : sycwdgly
             * zg : 0
             * zb : 0
             * cert_id : null
             * cancel_status : 0
             * hj : 0
             * dept_type : 11
             * last_login_ip : null
             * id_card : admin-sycwd
             * education : 本科
             * ljy : 0
             * id : 189516
             * rownum_ : 1
             * name : 沈阳车务段管理员
             * sso_app_name : null
             * user_id : 189516
             * outbox_do_sort : CREATE_DATE2
             * ethnic : null
             * final_level_name : 一级
             * political : null
             * last_login_time : 2017-08-01 15:07:17
             * working_time : null
             * yb : 0
             * edit : 1
             * duty_name : null
             * photo : null
             * final_score : 37
             * dcz : 0
             * login_count : 8234
             */

            private String birth;
            private String dept_name4;
            private String dept_name3;
            private String sso_uuid;
            private int leader_type;
            private String quan_post_name;
            private int bzb;
            private String dept_full_name;
            private Object laid_off_time;
            private Object dept_name7;
            private Object dept_name5;
            private Object dept_name6;
            private Object dept_code7;
            private int ctc;
            private Object dept_code6;
            private String user_type_name;
            private Object dept_code5;
            private String dept_code4;
            private Object seniority1;
            private String dept_code3;
            private String month;
            private int pm;
            private String isshangbao;
            private String comment1;
            private String comment2;
            private int position;
            private int dt;
            private int sys;
            private int fhy;
            private int lw;
            private int zdz;
            private int is_leadership;
            private String start_work_date;
            private int dept_id;
            private int dg;
            private String token;
            private int leader_id3;
            private int ccsj;
            private Object position_duty;
            private int leader_id1;
            private int leader_id2;
            private String dept_cwd_or_stn_name;
            private Object dept_station_code;
            private String approve_time2;
            private int post;
            private String approve_time1;
            private String approve_time3;
            private Object dept_station_name;
            private Object technical_level;
            private int approve_id;
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
            private String system_level_name;
            private int is_leader;
            private int gender;
            private String inbox_do_sort;
            private String dept_cwd_name;
            private int seniority;
            private String post_name;
            private int dc;
            private Object technical_level_name;
            private int status;
            private int jsj;
            private String dept_code;
            private int key_person_mark;
            private String leader_type_name;
            private int deleted;
            private String position_name;
            private Object email;
            private String dept_cwd_code;
            private String create_time;
            private Object work_experience;
            private int ch;
            private String pym;
            private int zg;
            private int zb;
            private Object cert_id;
            private int cancel_status;
            private int hj;
            private int dept_type;
            private Object last_login_ip;
            private String id_card;
            private String education;
            private int ljy;
            private int id;
            private int rownum_;
            private String name;
            private Object sso_app_name;
            private int user_id;
            private String outbox_do_sort;
            private Object ethnic;
            private String final_level_name;
            private Object political;
            private String last_login_time;
            private Object working_time;
            private int yb;
            private int edit;
            private Object duty_name;
            private Object photo;
            private int final_score;
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

            public Object getDept_code7() {
                return dept_code7;
            }

            public void setDept_code7(Object dept_code7) {
                this.dept_code7 = dept_code7;
            }

            public int getCtc() {
                return ctc;
            }

            public void setCtc(int ctc) {
                this.ctc = ctc;
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

            public String getDept_code4() {
                return dept_code4;
            }

            public void setDept_code4(String dept_code4) {
                this.dept_code4 = dept_code4;
            }

            public Object getSeniority1() {
                return seniority1;
            }

            public void setSeniority1(Object seniority1) {
                this.seniority1 = seniority1;
            }

            public String getDept_code3() {
                return dept_code3;
            }

            public void setDept_code3(String dept_code3) {
                this.dept_code3 = dept_code3;
            }

            public String getMonth() {
                return month;
            }

            public void setMonth(String month) {
                this.month = month;
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

            public int getSys() {
                return sys;
            }

            public void setSys(int sys) {
                this.sys = sys;
            }

            public int getFhy() {
                return fhy;
            }

            public void setFhy(int fhy) {
                this.fhy = fhy;
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

            public int getLeader_id3() {
                return leader_id3;
            }

            public void setLeader_id3(int leader_id3) {
                this.leader_id3 = leader_id3;
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

            public String getApprove_time2() {
                return approve_time2;
            }

            public void setApprove_time2(String approve_time2) {
                this.approve_time2 = approve_time2;
            }

            public int getPost() {
                return post;
            }

            public void setPost(int post) {
                this.post = post;
            }

            public String getApprove_time1() {
                return approve_time1;
            }

            public void setApprove_time1(String approve_time1) {
                this.approve_time1 = approve_time1;
            }

            public String getApprove_time3() {
                return approve_time3;
            }

            public void setApprove_time3(String approve_time3) {
                this.approve_time3 = approve_time3;
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

            public int getApprove_id() {
                return approve_id;
            }

            public void setApprove_id(int approve_id) {
                this.approve_id = approve_id;
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

            public String getSystem_level_name() {
                return system_level_name;
            }

            public void setSystem_level_name(String system_level_name) {
                this.system_level_name = system_level_name;
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

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
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

            public int getKey_person_mark() {
                return key_person_mark;
            }

            public void setKey_person_mark(int key_person_mark) {
                this.key_person_mark = key_person_mark;
            }

            public String getLeader_type_name() {
                return leader_type_name;
            }

            public void setLeader_type_name(String leader_type_name) {
                this.leader_type_name = leader_type_name;
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

            public String getPym() {
                return pym;
            }

            public void setPym(String pym) {
                this.pym = pym;
            }

            public int getZg() {
                return zg;
            }

            public void setZg(int zg) {
                this.zg = zg;
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

            public Object getLast_login_ip() {
                return last_login_ip;
            }

            public void setLast_login_ip(Object last_login_ip) {
                this.last_login_ip = last_login_ip;
            }

            public String getId_card() {
                return id_card;
            }

            public void setId_card(String id_card) {
                this.id_card = id_card;
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

            public Object getSso_app_name() {
                return sso_app_name;
            }

            public void setSso_app_name(Object sso_app_name) {
                this.sso_app_name = sso_app_name;
            }

            public int getUser_id() {
                return user_id;
            }

            public void setUser_id(int user_id) {
                this.user_id = user_id;
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

            public String getFinal_level_name() {
                return final_level_name;
            }

            public void setFinal_level_name(String final_level_name) {
                this.final_level_name = final_level_name;
            }

            public Object getPolitical() {
                return political;
            }

            public void setPolitical(Object political) {
                this.political = political;
            }

            public String getLast_login_time() {
                return last_login_time;
            }

            public void setLast_login_time(String last_login_time) {
                this.last_login_time = last_login_time;
            }

            public Object getWorking_time() {
                return working_time;
            }

            public void setWorking_time(Object working_time) {
                this.working_time = working_time;
            }

            public int getYb() {
                return yb;
            }

            public void setYb(int yb) {
                this.yb = yb;
            }

            public int getEdit() {
                return edit;
            }

            public void setEdit(int edit) {
                this.edit = edit;
            }

            public Object getDuty_name() {
                return duty_name;
            }

            public void setDuty_name(Object duty_name) {
                this.duty_name = duty_name;
            }

            public Object getPhoto() {
                return photo;
            }

            public void setPhoto(Object photo) {
                this.photo = photo;
            }

            public int getFinal_score() {
                return final_score;
            }

            public void setFinal_score(int final_score) {
                this.final_score = final_score;
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
    }
}
