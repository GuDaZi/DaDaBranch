package com.xianzhi.integration.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @Administrator LiBo.
 * @Date 2017/7/17.
 * @Function
 */

public class EnterWorkBean implements Serializable {

    private String itemId;
    private String date;
    private String userId;
    /**
     * user_name : 沈阳车务段管理员
     * zNodes : [{"pym":"sycwd","dbm":null,"class_name":null,"type":1,"cognizance_user_id":null,"class_select":0,"id":3862,"level":3,"name":"沈阳车务段","response_user_id":263023,"safe_overtime":2400,"equdepartment":0,"leader_user_id":45402,"property":null,"pid":195,"available":1,"code":"000100090022","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":1,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":219160,"my_level":3,"start_date":null},{"pym":"ldbz","dbm":null,"class_name":null,"type":4,"cognizance_user_id":null,"class_select":0,"id":3863,"level":4,"name":"领导班子","response_user_id":263023,"safe_overtime":null,"equdepartment":0,"leader_user_id":45402,"property":null,"pid":3862,"available":1,"code":"0001000900220001","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"kyhsrk","dbm":null,"class_name":null,"type":11,"cognizance_user_id":null,"class_select":0,"id":3864,"level":4,"name":"客运和收入科","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220002","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"dqb","dbm":null,"class_name":null,"type":11,"cognizance_user_id":null,"class_select":0,"id":3865,"level":4,"name":"党群办","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220003","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"jhcwk","dbm":null,"class_name":null,"type":11,"cognizance_user_id":null,"class_select":0,"id":3866,"level":4,"name":"计划财务科","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220004","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"bwk","dbm":null,"class_name":null,"type":11,"cognizance_user_id":null,"class_select":0,"id":3867,"level":4,"name":"保卫科","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220005","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"ldrsk","dbm":null,"class_name":null,"type":11,"cognizance_user_id":null,"class_select":0,"id":3868,"level":4,"name":"劳动人事科","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220006","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"jshtjk","dbm":null,"class_name":null,"type":11,"cognizance_user_id":null,"class_select":0,"id":3869,"level":4,"name":"技术和统计科","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220007","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"aqk","dbm":null,"class_name":null,"type":11,"cognizance_user_id":null,"class_select":0,"id":3870,"level":4,"name":"安全科","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220008","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"bgs","dbm":null,"class_name":null,"type":11,"cognizance_user_id":null,"class_select":0,"id":3871,"level":4,"name":"办公室","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220009","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"dds","dbm":null,"class_name":null,"type":11,"cognizance_user_id":null,"class_select":0,"id":3872,"level":4,"name":"调度室","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220010","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"zgjyk","dbm":null,"class_name":null,"type":11,"cognizance_user_id":null,"class_select":0,"id":3873,"level":4,"name":"职工教育科","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220011","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"jtb","dbm":null,"class_name":null,"type":11,"cognizance_user_id":null,"class_select":0,"id":16565,"level":4,"name":"集体办","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220068","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-04-09 13:59:58","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"wlgs","dbm":null,"class_name":null,"type":12,"cognizance_user_id":null,"class_select":0,"id":16579,"level":4,"name":"物流公司","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220069","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-04-17 18:24:01","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"ljtz","dbm":"LTT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3874,"level":4,"name":"揽军屯站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220012","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"zwqz","dbm":"ZQT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3876,"level":4,"name":"转弯桥站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220013","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"lssz","dbm":"LCT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3878,"level":4,"name":"乱石山站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220014","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"pdbz","dbm":"PDT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3880,"level":4,"name":"平顶堡站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220015","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"jzz","dbm":"JNT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3882,"level":4,"name":"旧站站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220016","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"xtzz","dbm":"XIT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3884,"level":4,"name":"新台子站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220017","deleted":0,"station_level":3,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"tlxz","dbm":"PXT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3886,"level":4,"name":"铁岭西站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220018","deleted":0,"station_level":2,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"xfz","dbm":"XFT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3891,"level":4,"name":"西丰站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220019","deleted":0,"station_level":3,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"smzz","dbm":"SMT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3893,"level":4,"name":"双庙子站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220020","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"hhz","dbm":"HHT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3895,"level":4,"name":"浑河站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220021","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"mjdz","dbm":"MDT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3897,"level":4,"name":"毛家店站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220022","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"kyxz","dbm":"KXT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3899,"level":4,"name":"开原西站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220023","deleted":0,"station_level":3,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"hstz","dbm":"HUT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3902,"level":4,"name":"虎石台站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220024","deleted":0,"station_level":3,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"dqz","dbm":"DZT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3904,"level":4,"name":"大青站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220025","deleted":0,"station_level":2,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"yhz","dbm":"YHT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3910,"level":4,"name":"于洪站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220026","deleted":0,"station_level":3,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"gjzz","dbm":"GKT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3912,"level":4,"name":"孤家子站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220027","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"qyz","dbm":"QYT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3914,"level":4,"name":"清原站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220028","deleted":0,"station_level":3,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"sscz","dbm":"SUT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3922,"level":4,"name":"松树村站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220029","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"dhtz","dbm":"DOT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3926,"level":4,"name":"斗虎屯站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220030","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"nkqz","dbm":"NKT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3932,"level":4,"name":"南口前站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220031","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"amz","dbm":"ANT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3942,"level":4,"name":"安民站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220032","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"hsz","dbm":"HGT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3946,"level":4,"name":"辉山站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220033","deleted":0,"station_level":3,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"slz","dbm":"SQD","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3948,"level":4,"name":"沙岭站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220034","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"smlz","dbm":"SLT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3950,"level":4,"name":"石门岭站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220035","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"nzmz","dbm":"NZT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3952,"level":4,"name":"南杂木站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220036","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"dstz","dbm":"DET","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3965,"level":4,"name":"得胜台站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220037","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"csz","dbm":"CST","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3971,"level":4,"name":"苍石站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220038","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"dgtz","dbm":"DTT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3973,"level":4,"name":"大官屯站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220039","deleted":0,"station_level":2,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"ctxz","dbm":"CPT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3981,"level":4,"name":"昌图西站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220040","deleted":0,"station_level":3,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"ystz","dbm":"YUT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3987,"level":4,"name":"榆树台站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220041","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"xczz","dbm":"XCT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3997,"level":4,"name":"新城子站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220042","deleted":0,"station_level":3,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"qdz","dbm":"QDT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3999,"level":4,"name":"前甸站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220043","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"mzhz","dbm":"MZT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":4001,"level":4,"name":"马仲河站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220044","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"dcz","dbm":"DCT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":4003,"level":4,"name":"大成站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220045","deleted":0,"station_level":2,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"fsbz","dbm":"FET","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":4011,"level":4,"name":"抚顺北站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220046","deleted":0,"station_level":2,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"tlz","dbm":"TLT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":4028,"level":4,"name":"铁岭站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220047","deleted":0,"station_level":2,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"tytz","dbm":"PYT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":4049,"level":4,"name":"田义屯站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220048","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"hgtz","dbm":"HTT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":4055,"level":4,"name":"皇姑屯站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220049","deleted":0,"station_level":3,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"dtz","dbm":"DKT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":4062,"level":4,"name":"滴台站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220050","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"dlz","dbm":"DRT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":4067,"level":4,"name":"东陵站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220051","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"zxbz","dbm":"TXT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":4076,"level":4,"name":"镇西堡站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220052","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"wgtz","dbm":"WTT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":4078,"level":4,"name":"文官屯站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220053","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"sjzz","dbm":"SWT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":4080,"level":4,"name":"深井子站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220054","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"ypz","dbm":"YPT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":4082,"level":4,"name":"营盘站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220055","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"ctz","dbm":"CTT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":4090,"level":4,"name":"昌图站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220056","deleted":0,"station_level":2,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"zdz","dbm":"ZHT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":4096,"level":4,"name":"章党站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220057","deleted":0,"station_level":3,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"bsjz","dbm":"BET","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":4113,"level":4,"name":"北三家站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220058","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"sydz","dbm":"SDT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":4115,"level":4,"name":"沈阳东站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220059","deleted":0,"station_level":2,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"petz","dbm":"PRT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":4123,"level":4,"name":"瓢儿屯站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220060","deleted":0,"station_level":2,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"kyz","dbm":"KYT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":4125,"level":4,"name":"开原站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220061","deleted":0,"station_level":2,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"tbsz","dbm":"TET","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":4145,"level":4,"name":"铁背山站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220062","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"hsgz","dbm":"HGD","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":4150,"level":4,"name":"火石岗站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220063","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"jhz","dbm":"JHD","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":4152,"level":4,"name":"近海站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220064","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"zgz","dbm":"ZGT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":4154,"level":4,"name":"中固站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220065","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"nlg","dbm":null,"class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":16249,"level":4,"name":"内陆港","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220066","deleted":0,"station_level":2,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-03-06 11:14:29","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"syxz","dbm":null,"class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":16560,"level":4,"name":"沈阳西站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220067","deleted":0,"station_level":3,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-04-07 18:47:53","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"cscj","dbm":null,"class_name":null,"type":12,"cognizance_user_id":null,"class_select":0,"id":16834,"level":5,"name":"测试车间","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3876,"available":1,"code":"00010009002200130003","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-06-30 20:34:56","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"23","dbm":null,"class_name":null,"type":12,"cognizance_user_id":null,"class_select":0,"id":16838,"level":5,"name":"23","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3876,"available":1,"code":"00010009002200130005","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-06 09:13:32","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"cscj3","dbm":null,"class_name":null,"type":12,"cognizance_user_id":null,"class_select":0,"id":16840,"level":5,"name":"测试车间3","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3876,"available":1,"code":"00010009002200130007","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-06 09:39:53","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"yzcjcs","dbm":null,"class_name":null,"type":12,"cognizance_user_id":null,"class_select":0,"id":16848,"level":5,"name":"运转车间测试","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3878,"available":1,"code":"00010009002200140001","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-11 09:41:45","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"yzbz","dbm":null,"class_name":null,"type":12,"cognizance_user_id":null,"class_select":0,"id":15084,"level":5,"name":"运转班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4011,"available":1,"code":"00010009002200460017","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"yzbz","dbm":null,"class_name":null,"type":12,"cognizance_user_id":null,"class_select":0,"id":15096,"level":5,"name":"运转班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4028,"available":1,"code":"00010009002200470001","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"kybz","dbm":null,"class_name":null,"type":12,"cognizance_user_id":null,"class_select":0,"id":15097,"level":5,"name":"客运班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4028,"available":1,"code":"00010009002200470002","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"kybz","dbm":null,"class_name":null,"type":12,"cognizance_user_id":null,"class_select":0,"id":15087,"level":5,"name":"客运班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4125,"available":1,"code":"00010009002200610010","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"xcyb","dbm":null,"class_name":"小四班制1(▲,丨▼,○,○)","type":14,"cognizance_user_id":null,"class_select":1,"id":16592,"level":5,"name":"行车一班","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3876,"available":1,"code":"00010009002200130001","deleted":0,"station_level":null,"url":null,"class_id":38,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-05-01 18:41:42","unit_type":null,"document_user":null,"my_level":5,"start_date":"2017-07-10"},{"pym":"eb","dbm":null,"class_name":null,"type":14,"cognizance_user_id":null,"class_select":0,"id":16593,"level":5,"name":"二班","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3876,"available":1,"code":"00010009002200130002","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-05-01 18:42:11","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"csbz2","dbm":null,"class_name":null,"type":14,"cognizance_user_id":null,"class_select":0,"id":16837,"level":5,"name":"测试班组2","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3876,"available":1,"code":"00010009002200130004","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-06 08:26:17","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"csbz3","dbm":null,"class_name":null,"type":14,"cognizance_user_id":null,"class_select":0,"id":16839,"level":5,"name":"测试班组3","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3876,"available":1,"code":"00010009002200130006","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-06 09:39:31","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"yzbz","dbm":null,"class_name":null,"type":14,"cognizance_user_id":null,"class_select":0,"id":15090,"level":5,"name":"运转班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3914,"available":1,"code":"00010009002200280001","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"kybz","dbm":null,"class_name":null,"type":14,"cognizance_user_id":null,"class_select":0,"id":15091,"level":5,"name":"客运班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3914,"available":1,"code":"00010009002200280002","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"kybz","dbm":null,"class_name":null,"type":14,"cognizance_user_id":null,"class_select":0,"id":3974,"level":5,"name":"客运班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3973,"available":1,"code":"00010009002200390001","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"yzbz","dbm":null,"class_name":null,"type":14,"cognizance_user_id":null,"class_select":0,"id":3976,"level":5,"name":"运转班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3973,"available":1,"code":"00010009002200390003","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"yzbz","dbm":null,"class_name":null,"type":14,"cognizance_user_id":null,"class_select":0,"id":4005,"level":5,"name":"运转班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4003,"available":1,"code":"00010009002200450002","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"kybz","dbm":null,"class_name":null,"type":14,"cognizance_user_id":null,"class_select":0,"id":4010,"level":5,"name":"客运班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4003,"available":1,"code":"00010009002200450007","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"kybz","dbm":null,"class_name":null,"type":14,"cognizance_user_id":null,"class_select":0,"id":4012,"level":5,"name":"客运班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4011,"available":1,"code":"00010009002200460001","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"yzbz","dbm":null,"class_name":null,"type":14,"cognizance_user_id":null,"class_select":0,"id":4091,"level":5,"name":"运转班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4090,"available":1,"code":"00010009002200560001","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"kybz","dbm":null,"class_name":null,"type":14,"cognizance_user_id":null,"class_select":0,"id":4095,"level":5,"name":"客运班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4090,"available":1,"code":"00010009002200560005","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"kybz","dbm":null,"class_name":null,"type":14,"cognizance_user_id":null,"class_select":0,"id":4116,"level":5,"name":"客运班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4115,"available":1,"code":"00010009002200590001","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"yzbz","dbm":null,"class_name":null,"type":14,"cognizance_user_id":null,"class_select":0,"id":4121,"level":5,"name":"运转班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4115,"available":1,"code":"00010009002200590006","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"yzbz","dbm":null,"class_name":null,"type":14,"cognizance_user_id":null,"class_select":0,"id":4134,"level":5,"name":"运转班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4125,"available":1,"code":"00010009002200610009","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"cszyxz","dbm":null,"class_name":null,"type":14,"cognizance_user_id":null,"class_select":0,"id":16835,"level":6,"name":"测试作业小组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":16834,"available":1,"code":"000100090022001300030001","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-06-30 20:35:12","unit_type":null,"document_user":null,"my_level":6,"start_date":null},{"pym":"A","dbm":null,"class_name":null,"type":14,"cognizance_user_id":null,"class_select":0,"id":16836,"level":6,"name":"A","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":16834,"available":1,"code":"000100090022001300030002","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-05 21:33:05","unit_type":null,"document_user":null,"my_level":6,"start_date":null},{"pym":"yzd4yb","dbm":null,"class_name":"大四班制(丨,\u2014,○,○)","type":14,"cognizance_user_id":null,"class_select":1,"id":16849,"level":6,"name":"运转大4一班","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":16848,"available":1,"code":"000100090022001400010001","deleted":0,"station_level":null,"url":null,"class_id":37,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-11 09:46:28","unit_type":null,"document_user":null,"my_level":6,"start_date":"2017-07-11"},{"pym":"zyxz4","dbm":null,"class_name":"小四班制1(▲,丨▼,○,○)","type":15,"cognizance_user_id":null,"class_select":1,"id":16841,"level":6,"name":"作业小组4","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":16592,"available":1,"code":"000100090022001300010001","deleted":0,"station_level":null,"url":null,"class_id":38,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-06 09:40:53","unit_type":null,"document_user":null,"my_level":6,"start_date":"2017-07-06"},{"pym":"zyxz2","dbm":null,"class_name":null,"type":15,"cognizance_user_id":null,"class_select":0,"id":17396,"level":6,"name":"作业小组2","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":16593,"available":1,"code":"000100090022001300020001","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-16 17:48:21","unit_type":null,"document_user":null,"my_level":6,"start_date":null},{"pym":"yd","dbm":null,"class_name":null,"type":15,"cognizance_user_id":null,"class_select":0,"id":17397,"level":6,"name":"一调","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":15090,"available":1,"code":"000100090022002800010001","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-16 17:50:26","unit_type":null,"document_user":null,"my_level":6,"start_date":null},{"pym":"ed","dbm":null,"class_name":null,"type":15,"cognizance_user_id":null,"class_select":0,"id":17398,"level":6,"name":"二调","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":15090,"available":1,"code":"000100090022002800010002","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-16 17:50:33","unit_type":null,"document_user":null,"my_level":6,"start_date":null},{"pym":"yd","dbm":null,"class_name":null,"type":15,"cognizance_user_id":null,"class_select":0,"id":17399,"level":6,"name":"一调","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":15091,"available":1,"code":"000100090022002800020001","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-16 17:50:42","unit_type":null,"document_user":null,"my_level":6,"start_date":null},{"pym":"ed","dbm":null,"class_name":null,"type":15,"cognizance_user_id":null,"class_select":0,"id":17400,"level":6,"name":"二调","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":15091,"available":1,"code":"000100090022002800020002","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-16 17:50:56","unit_type":null,"document_user":null,"my_level":6,"start_date":null},{"pym":"yzybyxz","dbm":null,"class_name":"大四班制(丨,\u2014,○,○)","type":15,"cognizance_user_id":null,"class_select":1,"id":16850,"level":7,"name":"运转一班一小组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":16849,"available":1,"code":"0001000900220014000100010001","deleted":0,"station_level":null,"url":null,"class_id":37,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-11 09:49:01","unit_type":null,"document_user":null,"my_level":7,"start_date":"2017-07-11"}]
     * personalAssessmentInfo : {"dynamic":0,"id":844557,"content":"每月检查接发列车","normal_done":2,"normal":2,"dynamic_done":0,"month":"2017-07","extra_done":2,"user_id":189516,"risk_control_id":1279}
     * riskTypes : [{"pym":"xfaq","sjzx_update_time":null,"sjzx_update_useruuid":null,"pid":0,"code":null,"type":1,"sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","deleted":0,"sjzx_update_username":null,"id":2794,"colour":0,"is_warning":1,"name":"消防安全","sjzx_create_username":"沈阳车务段管理员","sjzx_create_time":"2017-06-30 16:58:39","unit_code":"0001000900220008"},{"pym":"gtCTC","sjzx_update_time":null,"sjzx_update_useruuid":null,"pid":0,"code":null,"type":1,"sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","deleted":0,"sjzx_update_username":null,"id":2855,"colour":0,"is_warning":1,"name":"高铁CTC","sjzx_create_username":"沈阳车务段管理员","sjzx_create_time":"2017-07-01 11:10:05","unit_code":"0001000900220008"},{"pym":"hjch","sjzx_update_time":null,"sjzx_update_useruuid":null,"pid":0,"code":null,"type":1,"sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","deleted":0,"sjzx_update_username":null,"id":2861,"colour":0,"is_warning":1,"name":"货检车号","sjzx_create_username":"沈阳车务段管理员","sjzx_create_time":"2017-07-01 11:11:30","unit_code":"0001000900220008"},{"pym":"lwaq","sjzx_update_time":null,"sjzx_update_useruuid":null,"pid":0,"code":null,"type":1,"sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","deleted":0,"sjzx_update_username":null,"id":2870,"colour":0,"is_warning":1,"name":"路外安全","sjzx_create_username":"沈阳车务段管理员","sjzx_create_time":"2017-07-01 11:13:13","unit_code":"0001000900220008"},{"pym":"kyzz","sjzx_update_time":null,"sjzx_update_useruuid":null,"pid":0,"code":null,"type":1,"sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","deleted":0,"sjzx_update_username":null,"id":2874,"colour":0,"is_warning":2,"name":"客运组织","sjzx_create_username":"沈阳车务段管理员","sjzx_create_time":"2017-07-01 11:14:06","unit_code":"0001000900220008"},{"pym":"ldjl","sjzx_update_time":null,"sjzx_update_useruuid":null,"pid":0,"code":null,"type":1,"sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","deleted":0,"sjzx_update_username":null,"id":2882,"colour":0,"is_warning":2,"name":"劳动纪律","sjzx_create_username":"沈阳车务段管理员","sjzx_create_time":"2017-07-01 11:15:25","unit_code":"0001000900220008"},{"pym":"lwzy","sjzx_update_time":null,"sjzx_update_useruuid":null,"pid":0,"code":null,"type":1,"sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","deleted":0,"sjzx_update_username":null,"id":2887,"colour":0,"is_warning":2,"name":"列尾作业","sjzx_create_username":"沈阳车务段管理员","sjzx_create_time":"2017-07-01 11:16:19","unit_code":"0001000900220008"},{"pym":"jccw","sjzx_update_time":null,"sjzx_update_useruuid":null,"pid":0,"code":null,"type":1,"sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","deleted":0,"sjzx_update_username":null,"id":2892,"colour":0,"is_warning":2,"name":"机车乘务","sjzx_create_username":"沈阳车务段管理员","sjzx_create_time":"2017-07-01 11:17:41","unit_code":"0001000900220008"},{"pym":"yjcz","sjzx_update_time":null,"sjzx_update_useruuid":null,"pid":0,"code":null,"type":1,"sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","deleted":0,"sjzx_update_username":null,"id":2789,"colour":0,"is_warning":2,"name":"应急处置","sjzx_create_username":"沈阳车务段管理员","sjzx_create_time":"2017-06-30 16:12:14","unit_code":"0001000900220008"},{"pym":"sg","sjzx_update_time":null,"sjzx_update_useruuid":null,"pid":0,"code":null,"type":1,"sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","deleted":0,"sjzx_update_username":null,"id":2798,"colour":0,"is_warning":2,"name":"施工","sjzx_create_username":"沈阳车务段管理员","sjzx_create_time":"2017-06-30 17:09:28","unit_code":"0001000900220008"},{"pym":"rssh","sjzx_update_time":null,"sjzx_update_useruuid":null,"pid":0,"code":null,"type":1,"sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","deleted":0,"sjzx_update_username":null,"id":2804,"colour":0,"is_warning":2,"name":"人身伤害","sjzx_create_username":"沈阳车务段管理员","sjzx_create_time":"2017-06-30 17:10:58","unit_code":"0001000900220008"},{"pym":"jflc","sjzx_update_time":null,"sjzx_update_useruuid":null,"pid":0,"code":null,"type":1,"sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","deleted":0,"sjzx_update_username":null,"id":2814,"colour":0,"is_warning":2,"name":"接发列车","sjzx_create_username":"沈阳车务段管理员","sjzx_create_time":"2017-07-01 10:57:04","unit_code":"0001000900220008"},{"pym":"dc","sjzx_update_time":null,"sjzx_update_useruuid":null,"pid":0,"code":null,"type":1,"sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","deleted":0,"sjzx_update_username":null,"id":2828,"colour":0,"is_warning":2,"name":"调车","sjzx_create_username":"沈阳车务段管理员","sjzx_create_time":"2017-07-01 11:00:47","unit_code":"0001000900220008"},{"pym":"clly","sjzx_update_time":null,"sjzx_update_useruuid":null,"pid":0,"code":null,"type":1,"sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","deleted":0,"sjzx_update_username":null,"id":2846,"colour":0,"is_warning":2,"name":"车辆溜逸","sjzx_create_username":"沈阳车务段管理员","sjzx_create_time":"2017-07-01 11:08:21","unit_code":"0001000900220008"}]
     * month : 2017-07
     * permission : {"aqwtxdwh":1,"hywh":1,"ldyg_scl":1,"xtgl":1,"gwgl":1,"khjjfgl":1,"bmkhdjsz1":1,"glzdgl":1,"zdgzsc":1,"view_basic_shop":1,"fxkzb":1,"gwfxdwh":1,"aqyhwh":1,"rygl":1,"bmqtkhsz":1,"gx_jjbtj":1,"view_basic_show":1,"sbmcwh":1,"edit_safe_problem":1,"fqhd":1,"view_basic_equipment_check":1,"view_basic_book":1,"gx_bzzblr":1,"view_basic_card":1,"aqfxkzb":1,"gbkhsp":1,"edit_basic_czzby":1,"edit_basic_produce_target":1,"csxzwh":1,"equip_del":1,"hygl":1,"reset_password":1,"zdspwh":1,"gwwh":1,"khfsydj":1,"gbkhsz":1,"hylbwh":1,"edit_basic_equipment_check":1,"aqszgl":1,"glzdflgl":1,"qywhfb":1,"dwglwh":1,"gjsjwh":1,"gxkh":1,"jsgzflwh":1,"jsdjgl":1,"ythkhpdbsz":1,"ythkhsz":1,"gx_kqcx":1,"view_basic_produce_target":1,"dbxxsc":1,"gbydykhb":1,"khsz":1,"glzdwh":1,"hyxj":1,"lwwtkh":1,"view_basic_ctc":1,"gwfcfb":1,"zmgl":1,"gbkhbh":1,"safe_danger_approval":1,"dbfb":1,"gx_jjblr":1,"cwdfcwh":1,"fjtjgl":1,"edit_basic_czzbywh":1,"bmkhhz":1,"cwdfc":1,"gx_kq":1,"hysz":1,"qywhwh":1,"gx_kqfh":1,"lwwtzsxs":1,"gzllr":1,"awhzdgzwh":1,"db":1,"xwdt":1,"edit_basic_shop":1,"ythcxyqr":1,"edit_basic_team":1,"jsgl":1,"wtxzlxwh":1,"edit_basic_czzbygl":1,"glzdxj":1,"bmythkh":1,"view_basic_czzby":1,"aqyhsc":1,"ldscl":1,"edit_basic_equipment_construction":1,"cwdfcfb":1,"sbgyswh":1,"safe_problem_signed":1,"edit_basic_station":1,"fbfc":1,"view_basic_equipment_construction":1,"ddgl":1,"stn_approval_dpzr":1,"szkhzq":1,"sgtzsz":1,"sbflwh":1,"sbwh":1,"qywh":1,"edit_basic_show":1,"jcglfzxs":1,"jsgzgl":1,"dbwh":1,"bgtfb":1,"jsgzwh":1,"ythkhpd":1,"bgtwh":1,"gx_gzsh":1,"wtxzlbwh":1,"gbqpfsz":1,"czglkh":1,"sbssbm":1,"equip_view":1,"yhgl":1,"bmkhdjsz":1,"bcwh":1,"edit_basic_ctc":1,"bgt":1,"view_basic_station":1,"gx_sxbsj":1,"sbglbfwh":1,"view_basic_team":1,"edit_basic_card":1,"jsgzxj":1,"gzl":1}
     * user_id : 189516
     */

    private String user_name;
    private String zNodes;
    private PersonalAssessmentInfoBean personalAssessmentInfo;
    private String month;
    private PermissionBean permission;
    private int user_id;
    private List<RiskTypesBean> riskTypes;

    public EnterWorkBean() {
    }

    public EnterWorkBean(String itemId, String date, String userId) {
        this.itemId = itemId;
        this.date = date;
        this.userId = userId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getZNodes() {
        return zNodes;
    }

    public void setZNodes(String zNodes) {
        this.zNodes = zNodes;
    }

    public PersonalAssessmentInfoBean getPersonalAssessmentInfo() {
        return personalAssessmentInfo;
    }

    public void setPersonalAssessmentInfo(PersonalAssessmentInfoBean personalAssessmentInfo) {
        this.personalAssessmentInfo = personalAssessmentInfo;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public PermissionBean getPermission() {
        return permission;
    }

    public void setPermission(PermissionBean permission) {
        this.permission = permission;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public List<RiskTypesBean> getRiskTypes() {
        return riskTypes;
    }

    public void setRiskTypes(List<RiskTypesBean> riskTypes) {
        this.riskTypes = riskTypes;
    }

    public static class PersonalAssessmentInfoBean {
        /**
         * dynamic : 0
         * id : 844557
         * content : 每月检查接发列车
         * normal_done : 2
         * normal : 2
         * dynamic_done : 0
         * month : 2017-07
         * extra_done : 2
         * user_id : 189516
         * risk_control_id : 1279
         */

        private int dynamic;
        private int id;
        private String content;
        private int normal_done;
        private int normal;
        private int dynamic_done;
        private String month;
        private int extra_done;
        private int user_id;
        private int risk_control_id;

        public int getDynamic() {
            return dynamic;
        }

        public void setDynamic(int dynamic) {
            this.dynamic = dynamic;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public int getNormal_done() {
            return normal_done;
        }

        public void setNormal_done(int normal_done) {
            this.normal_done = normal_done;
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

        public String getMonth() {
            return month;
        }

        public void setMonth(String month) {
            this.month = month;
        }

        public int getExtra_done() {
            return extra_done;
        }

        public void setExtra_done(int extra_done) {
            this.extra_done = extra_done;
        }

        public int getUser_id() {
            return user_id;
        }

        public void setUser_id(int user_id) {
            this.user_id = user_id;
        }

        public int getRisk_control_id() {
            return risk_control_id;
        }

        public void setRisk_control_id(int risk_control_id) {
            this.risk_control_id = risk_control_id;
        }
    }

    public static class PermissionBean {
        /**
         * aqwtxdwh : 1
         * hywh : 1
         * ldyg_scl : 1
         * xtgl : 1
         * gwgl : 1
         * khjjfgl : 1
         * bmkhdjsz1 : 1
         * glzdgl : 1
         * zdgzsc : 1
         * view_basic_shop : 1
         * fxkzb : 1
         * gwfxdwh : 1
         * aqyhwh : 1
         * rygl : 1
         * bmqtkhsz : 1
         * gx_jjbtj : 1
         * view_basic_show : 1
         * sbmcwh : 1
         * edit_safe_problem : 1
         * fqhd : 1
         * view_basic_equipment_check : 1
         * view_basic_book : 1
         * gx_bzzblr : 1
         * view_basic_card : 1
         * aqfxkzb : 1
         * gbkhsp : 1
         * edit_basic_czzby : 1
         * edit_basic_produce_target : 1
         * csxzwh : 1
         * equip_del : 1
         * hygl : 1
         * reset_password : 1
         * zdspwh : 1
         * gwwh : 1
         * khfsydj : 1
         * gbkhsz : 1
         * hylbwh : 1
         * edit_basic_equipment_check : 1
         * aqszgl : 1
         * glzdflgl : 1
         * qywhfb : 1
         * dwglwh : 1
         * gjsjwh : 1
         * gxkh : 1
         * jsgzflwh : 1
         * jsdjgl : 1
         * ythkhpdbsz : 1
         * ythkhsz : 1
         * gx_kqcx : 1
         * view_basic_produce_target : 1
         * dbxxsc : 1
         * gbydykhb : 1
         * khsz : 1
         * glzdwh : 1
         * hyxj : 1
         * lwwtkh : 1
         * view_basic_ctc : 1
         * gwfcfb : 1
         * zmgl : 1
         * gbkhbh : 1
         * safe_danger_approval : 1
         * dbfb : 1
         * gx_jjblr : 1
         * cwdfcwh : 1
         * fjtjgl : 1
         * edit_basic_czzbywh : 1
         * bmkhhz : 1
         * cwdfc : 1
         * gx_kq : 1
         * hysz : 1
         * qywhwh : 1
         * gx_kqfh : 1
         * lwwtzsxs : 1
         * gzllr : 1
         * awhzdgzwh : 1
         * db : 1
         * xwdt : 1
         * edit_basic_shop : 1
         * ythcxyqr : 1
         * edit_basic_team : 1
         * jsgl : 1
         * wtxzlxwh : 1
         * edit_basic_czzbygl : 1
         * glzdxj : 1
         * bmythkh : 1
         * view_basic_czzby : 1
         * aqyhsc : 1
         * ldscl : 1
         * edit_basic_equipment_construction : 1
         * cwdfcfb : 1
         * sbgyswh : 1
         * safe_problem_signed : 1
         * edit_basic_station : 1
         * fbfc : 1
         * view_basic_equipment_construction : 1
         * ddgl : 1
         * stn_approval_dpzr : 1
         * szkhzq : 1
         * sgtzsz : 1
         * sbflwh : 1
         * sbwh : 1
         * qywh : 1
         * edit_basic_show : 1
         * jcglfzxs : 1
         * jsgzgl : 1
         * dbwh : 1
         * bgtfb : 1
         * jsgzwh : 1
         * ythkhpd : 1
         * bgtwh : 1
         * gx_gzsh : 1
         * wtxzlbwh : 1
         * gbqpfsz : 1
         * czglkh : 1
         * sbssbm : 1
         * equip_view : 1
         * yhgl : 1
         * bmkhdjsz : 1
         * bcwh : 1
         * edit_basic_ctc : 1
         * bgt : 1
         * view_basic_station : 1
         * gx_sxbsj : 1
         * sbglbfwh : 1
         * view_basic_team : 1
         * edit_basic_card : 1
         * jsgzxj : 1
         * gzl : 1
         */

        private int aqwtxdwh;
        private int hywh;
        private int ldyg_scl;
        private int xtgl;
        private int gwgl;
        private int khjjfgl;
        private int bmkhdjsz1;
        private int glzdgl;
        private int zdgzsc;
        private int view_basic_shop;
        private int fxkzb;
        private int gwfxdwh;
        private int aqyhwh;
        private int rygl;
        private int bmqtkhsz;
        private int gx_jjbtj;
        private int view_basic_show;
        private int sbmcwh;
        private int edit_safe_problem;
        private int fqhd;
        private int view_basic_equipment_check;
        private int view_basic_book;
        private int gx_bzzblr;
        private int view_basic_card;
        private int aqfxkzb;
        private int gbkhsp;
        private int edit_basic_czzby;
        private int edit_basic_produce_target;
        private int csxzwh;
        private int equip_del;
        private int hygl;
        private int reset_password;
        private int zdspwh;
        private int gwwh;
        private int khfsydj;
        private int gbkhsz;
        private int hylbwh;
        private int edit_basic_equipment_check;
        private int aqszgl;
        private int glzdflgl;
        private int qywhfb;
        private int dwglwh;
        private int gjsjwh;
        private int gxkh;
        private int jsgzflwh;
        private int jsdjgl;
        private int ythkhpdbsz;
        private int ythkhsz;
        private int gx_kqcx;
        private int view_basic_produce_target;
        private int dbxxsc;
        private int gbydykhb;
        private int khsz;
        private int glzdwh;
        private int hyxj;
        private int lwwtkh;
        private int view_basic_ctc;
        private int gwfcfb;
        private int zmgl;
        private int gbkhbh;
        private int safe_danger_approval;
        private int dbfb;
        private int gx_jjblr;
        private int cwdfcwh;
        private int fjtjgl;
        private int edit_basic_czzbywh;
        private int bmkhhz;
        private int cwdfc;
        private int gx_kq;
        private int hysz;
        private int qywhwh;
        private int gx_kqfh;
        private int lwwtzsxs;
        private int gzllr;
        private int awhzdgzwh;
        private int db;
        private int xwdt;
        private int edit_basic_shop;
        private int ythcxyqr;
        private int edit_basic_team;
        private int jsgl;
        private int wtxzlxwh;
        private int edit_basic_czzbygl;
        private int glzdxj;
        private int bmythkh;
        private int view_basic_czzby;
        private int aqyhsc;
        private int ldscl;
        private int edit_basic_equipment_construction;
        private int cwdfcfb;
        private int sbgyswh;
        private int safe_problem_signed;
        private int edit_basic_station;
        private int fbfc;
        private int view_basic_equipment_construction;
        private int ddgl;
        private int stn_approval_dpzr;
        private int szkhzq;
        private int sgtzsz;
        private int sbflwh;
        private int sbwh;
        private int qywh;
        private int edit_basic_show;
        private int jcglfzxs;
        private int jsgzgl;
        private int dbwh;
        private int bgtfb;
        private int jsgzwh;
        private int ythkhpd;
        private int bgtwh;
        private int gx_gzsh;
        private int wtxzlbwh;
        private int gbqpfsz;
        private int czglkh;
        private int sbssbm;
        private int equip_view;
        private int yhgl;
        private int bmkhdjsz;
        private int bcwh;
        private int edit_basic_ctc;
        private int bgt;
        private int view_basic_station;
        private int gx_sxbsj;
        private int sbglbfwh;
        private int view_basic_team;
        private int edit_basic_card;
        private int jsgzxj;
        private int gzl;

        public int getAqwtxdwh() {
            return aqwtxdwh;
        }

        public void setAqwtxdwh(int aqwtxdwh) {
            this.aqwtxdwh = aqwtxdwh;
        }

        public int getHywh() {
            return hywh;
        }

        public void setHywh(int hywh) {
            this.hywh = hywh;
        }

        public int getLdyg_scl() {
            return ldyg_scl;
        }

        public void setLdyg_scl(int ldyg_scl) {
            this.ldyg_scl = ldyg_scl;
        }

        public int getXtgl() {
            return xtgl;
        }

        public void setXtgl(int xtgl) {
            this.xtgl = xtgl;
        }

        public int getGwgl() {
            return gwgl;
        }

        public void setGwgl(int gwgl) {
            this.gwgl = gwgl;
        }

        public int getKhjjfgl() {
            return khjjfgl;
        }

        public void setKhjjfgl(int khjjfgl) {
            this.khjjfgl = khjjfgl;
        }

        public int getBmkhdjsz1() {
            return bmkhdjsz1;
        }

        public void setBmkhdjsz1(int bmkhdjsz1) {
            this.bmkhdjsz1 = bmkhdjsz1;
        }

        public int getGlzdgl() {
            return glzdgl;
        }

        public void setGlzdgl(int glzdgl) {
            this.glzdgl = glzdgl;
        }

        public int getZdgzsc() {
            return zdgzsc;
        }

        public void setZdgzsc(int zdgzsc) {
            this.zdgzsc = zdgzsc;
        }

        public int getView_basic_shop() {
            return view_basic_shop;
        }

        public void setView_basic_shop(int view_basic_shop) {
            this.view_basic_shop = view_basic_shop;
        }

        public int getFxkzb() {
            return fxkzb;
        }

        public void setFxkzb(int fxkzb) {
            this.fxkzb = fxkzb;
        }

        public int getGwfxdwh() {
            return gwfxdwh;
        }

        public void setGwfxdwh(int gwfxdwh) {
            this.gwfxdwh = gwfxdwh;
        }

        public int getAqyhwh() {
            return aqyhwh;
        }

        public void setAqyhwh(int aqyhwh) {
            this.aqyhwh = aqyhwh;
        }

        public int getRygl() {
            return rygl;
        }

        public void setRygl(int rygl) {
            this.rygl = rygl;
        }

        public int getBmqtkhsz() {
            return bmqtkhsz;
        }

        public void setBmqtkhsz(int bmqtkhsz) {
            this.bmqtkhsz = bmqtkhsz;
        }

        public int getGx_jjbtj() {
            return gx_jjbtj;
        }

        public void setGx_jjbtj(int gx_jjbtj) {
            this.gx_jjbtj = gx_jjbtj;
        }

        public int getView_basic_show() {
            return view_basic_show;
        }

        public void setView_basic_show(int view_basic_show) {
            this.view_basic_show = view_basic_show;
        }

        public int getSbmcwh() {
            return sbmcwh;
        }

        public void setSbmcwh(int sbmcwh) {
            this.sbmcwh = sbmcwh;
        }

        public int getEdit_safe_problem() {
            return edit_safe_problem;
        }

        public void setEdit_safe_problem(int edit_safe_problem) {
            this.edit_safe_problem = edit_safe_problem;
        }

        public int getFqhd() {
            return fqhd;
        }

        public void setFqhd(int fqhd) {
            this.fqhd = fqhd;
        }

        public int getView_basic_equipment_check() {
            return view_basic_equipment_check;
        }

        public void setView_basic_equipment_check(int view_basic_equipment_check) {
            this.view_basic_equipment_check = view_basic_equipment_check;
        }

        public int getView_basic_book() {
            return view_basic_book;
        }

        public void setView_basic_book(int view_basic_book) {
            this.view_basic_book = view_basic_book;
        }

        public int getGx_bzzblr() {
            return gx_bzzblr;
        }

        public void setGx_bzzblr(int gx_bzzblr) {
            this.gx_bzzblr = gx_bzzblr;
        }

        public int getView_basic_card() {
            return view_basic_card;
        }

        public void setView_basic_card(int view_basic_card) {
            this.view_basic_card = view_basic_card;
        }

        public int getAqfxkzb() {
            return aqfxkzb;
        }

        public void setAqfxkzb(int aqfxkzb) {
            this.aqfxkzb = aqfxkzb;
        }

        public int getGbkhsp() {
            return gbkhsp;
        }

        public void setGbkhsp(int gbkhsp) {
            this.gbkhsp = gbkhsp;
        }

        public int getEdit_basic_czzby() {
            return edit_basic_czzby;
        }

        public void setEdit_basic_czzby(int edit_basic_czzby) {
            this.edit_basic_czzby = edit_basic_czzby;
        }

        public int getEdit_basic_produce_target() {
            return edit_basic_produce_target;
        }

        public void setEdit_basic_produce_target(int edit_basic_produce_target) {
            this.edit_basic_produce_target = edit_basic_produce_target;
        }

        public int getCsxzwh() {
            return csxzwh;
        }

        public void setCsxzwh(int csxzwh) {
            this.csxzwh = csxzwh;
        }

        public int getEquip_del() {
            return equip_del;
        }

        public void setEquip_del(int equip_del) {
            this.equip_del = equip_del;
        }

        public int getHygl() {
            return hygl;
        }

        public void setHygl(int hygl) {
            this.hygl = hygl;
        }

        public int getReset_password() {
            return reset_password;
        }

        public void setReset_password(int reset_password) {
            this.reset_password = reset_password;
        }

        public int getZdspwh() {
            return zdspwh;
        }

        public void setZdspwh(int zdspwh) {
            this.zdspwh = zdspwh;
        }

        public int getGwwh() {
            return gwwh;
        }

        public void setGwwh(int gwwh) {
            this.gwwh = gwwh;
        }

        public int getKhfsydj() {
            return khfsydj;
        }

        public void setKhfsydj(int khfsydj) {
            this.khfsydj = khfsydj;
        }

        public int getGbkhsz() {
            return gbkhsz;
        }

        public void setGbkhsz(int gbkhsz) {
            this.gbkhsz = gbkhsz;
        }

        public int getHylbwh() {
            return hylbwh;
        }

        public void setHylbwh(int hylbwh) {
            this.hylbwh = hylbwh;
        }

        public int getEdit_basic_equipment_check() {
            return edit_basic_equipment_check;
        }

        public void setEdit_basic_equipment_check(int edit_basic_equipment_check) {
            this.edit_basic_equipment_check = edit_basic_equipment_check;
        }

        public int getAqszgl() {
            return aqszgl;
        }

        public void setAqszgl(int aqszgl) {
            this.aqszgl = aqszgl;
        }

        public int getGlzdflgl() {
            return glzdflgl;
        }

        public void setGlzdflgl(int glzdflgl) {
            this.glzdflgl = glzdflgl;
        }

        public int getQywhfb() {
            return qywhfb;
        }

        public void setQywhfb(int qywhfb) {
            this.qywhfb = qywhfb;
        }

        public int getDwglwh() {
            return dwglwh;
        }

        public void setDwglwh(int dwglwh) {
            this.dwglwh = dwglwh;
        }

        public int getGjsjwh() {
            return gjsjwh;
        }

        public void setGjsjwh(int gjsjwh) {
            this.gjsjwh = gjsjwh;
        }

        public int getGxkh() {
            return gxkh;
        }

        public void setGxkh(int gxkh) {
            this.gxkh = gxkh;
        }

        public int getJsgzflwh() {
            return jsgzflwh;
        }

        public void setJsgzflwh(int jsgzflwh) {
            this.jsgzflwh = jsgzflwh;
        }

        public int getJsdjgl() {
            return jsdjgl;
        }

        public void setJsdjgl(int jsdjgl) {
            this.jsdjgl = jsdjgl;
        }

        public int getYthkhpdbsz() {
            return ythkhpdbsz;
        }

        public void setYthkhpdbsz(int ythkhpdbsz) {
            this.ythkhpdbsz = ythkhpdbsz;
        }

        public int getYthkhsz() {
            return ythkhsz;
        }

        public void setYthkhsz(int ythkhsz) {
            this.ythkhsz = ythkhsz;
        }

        public int getGx_kqcx() {
            return gx_kqcx;
        }

        public void setGx_kqcx(int gx_kqcx) {
            this.gx_kqcx = gx_kqcx;
        }

        public int getView_basic_produce_target() {
            return view_basic_produce_target;
        }

        public void setView_basic_produce_target(int view_basic_produce_target) {
            this.view_basic_produce_target = view_basic_produce_target;
        }

        public int getDbxxsc() {
            return dbxxsc;
        }

        public void setDbxxsc(int dbxxsc) {
            this.dbxxsc = dbxxsc;
        }

        public int getGbydykhb() {
            return gbydykhb;
        }

        public void setGbydykhb(int gbydykhb) {
            this.gbydykhb = gbydykhb;
        }

        public int getKhsz() {
            return khsz;
        }

        public void setKhsz(int khsz) {
            this.khsz = khsz;
        }

        public int getGlzdwh() {
            return glzdwh;
        }

        public void setGlzdwh(int glzdwh) {
            this.glzdwh = glzdwh;
        }

        public int getHyxj() {
            return hyxj;
        }

        public void setHyxj(int hyxj) {
            this.hyxj = hyxj;
        }

        public int getLwwtkh() {
            return lwwtkh;
        }

        public void setLwwtkh(int lwwtkh) {
            this.lwwtkh = lwwtkh;
        }

        public int getView_basic_ctc() {
            return view_basic_ctc;
        }

        public void setView_basic_ctc(int view_basic_ctc) {
            this.view_basic_ctc = view_basic_ctc;
        }

        public int getGwfcfb() {
            return gwfcfb;
        }

        public void setGwfcfb(int gwfcfb) {
            this.gwfcfb = gwfcfb;
        }

        public int getZmgl() {
            return zmgl;
        }

        public void setZmgl(int zmgl) {
            this.zmgl = zmgl;
        }

        public int getGbkhbh() {
            return gbkhbh;
        }

        public void setGbkhbh(int gbkhbh) {
            this.gbkhbh = gbkhbh;
        }

        public int getSafe_danger_approval() {
            return safe_danger_approval;
        }

        public void setSafe_danger_approval(int safe_danger_approval) {
            this.safe_danger_approval = safe_danger_approval;
        }

        public int getDbfb() {
            return dbfb;
        }

        public void setDbfb(int dbfb) {
            this.dbfb = dbfb;
        }

        public int getGx_jjblr() {
            return gx_jjblr;
        }

        public void setGx_jjblr(int gx_jjblr) {
            this.gx_jjblr = gx_jjblr;
        }

        public int getCwdfcwh() {
            return cwdfcwh;
        }

        public void setCwdfcwh(int cwdfcwh) {
            this.cwdfcwh = cwdfcwh;
        }

        public int getFjtjgl() {
            return fjtjgl;
        }

        public void setFjtjgl(int fjtjgl) {
            this.fjtjgl = fjtjgl;
        }

        public int getEdit_basic_czzbywh() {
            return edit_basic_czzbywh;
        }

        public void setEdit_basic_czzbywh(int edit_basic_czzbywh) {
            this.edit_basic_czzbywh = edit_basic_czzbywh;
        }

        public int getBmkhhz() {
            return bmkhhz;
        }

        public void setBmkhhz(int bmkhhz) {
            this.bmkhhz = bmkhhz;
        }

        public int getCwdfc() {
            return cwdfc;
        }

        public void setCwdfc(int cwdfc) {
            this.cwdfc = cwdfc;
        }

        public int getGx_kq() {
            return gx_kq;
        }

        public void setGx_kq(int gx_kq) {
            this.gx_kq = gx_kq;
        }

        public int getHysz() {
            return hysz;
        }

        public void setHysz(int hysz) {
            this.hysz = hysz;
        }

        public int getQywhwh() {
            return qywhwh;
        }

        public void setQywhwh(int qywhwh) {
            this.qywhwh = qywhwh;
        }

        public int getGx_kqfh() {
            return gx_kqfh;
        }

        public void setGx_kqfh(int gx_kqfh) {
            this.gx_kqfh = gx_kqfh;
        }

        public int getLwwtzsxs() {
            return lwwtzsxs;
        }

        public void setLwwtzsxs(int lwwtzsxs) {
            this.lwwtzsxs = lwwtzsxs;
        }

        public int getGzllr() {
            return gzllr;
        }

        public void setGzllr(int gzllr) {
            this.gzllr = gzllr;
        }

        public int getAwhzdgzwh() {
            return awhzdgzwh;
        }

        public void setAwhzdgzwh(int awhzdgzwh) {
            this.awhzdgzwh = awhzdgzwh;
        }

        public int getDb() {
            return db;
        }

        public void setDb(int db) {
            this.db = db;
        }

        public int getXwdt() {
            return xwdt;
        }

        public void setXwdt(int xwdt) {
            this.xwdt = xwdt;
        }

        public int getEdit_basic_shop() {
            return edit_basic_shop;
        }

        public void setEdit_basic_shop(int edit_basic_shop) {
            this.edit_basic_shop = edit_basic_shop;
        }

        public int getYthcxyqr() {
            return ythcxyqr;
        }

        public void setYthcxyqr(int ythcxyqr) {
            this.ythcxyqr = ythcxyqr;
        }

        public int getEdit_basic_team() {
            return edit_basic_team;
        }

        public void setEdit_basic_team(int edit_basic_team) {
            this.edit_basic_team = edit_basic_team;
        }

        public int getJsgl() {
            return jsgl;
        }

        public void setJsgl(int jsgl) {
            this.jsgl = jsgl;
        }

        public int getWtxzlxwh() {
            return wtxzlxwh;
        }

        public void setWtxzlxwh(int wtxzlxwh) {
            this.wtxzlxwh = wtxzlxwh;
        }

        public int getEdit_basic_czzbygl() {
            return edit_basic_czzbygl;
        }

        public void setEdit_basic_czzbygl(int edit_basic_czzbygl) {
            this.edit_basic_czzbygl = edit_basic_czzbygl;
        }

        public int getGlzdxj() {
            return glzdxj;
        }

        public void setGlzdxj(int glzdxj) {
            this.glzdxj = glzdxj;
        }

        public int getBmythkh() {
            return bmythkh;
        }

        public void setBmythkh(int bmythkh) {
            this.bmythkh = bmythkh;
        }

        public int getView_basic_czzby() {
            return view_basic_czzby;
        }

        public void setView_basic_czzby(int view_basic_czzby) {
            this.view_basic_czzby = view_basic_czzby;
        }

        public int getAqyhsc() {
            return aqyhsc;
        }

        public void setAqyhsc(int aqyhsc) {
            this.aqyhsc = aqyhsc;
        }

        public int getLdscl() {
            return ldscl;
        }

        public void setLdscl(int ldscl) {
            this.ldscl = ldscl;
        }

        public int getEdit_basic_equipment_construction() {
            return edit_basic_equipment_construction;
        }

        public void setEdit_basic_equipment_construction(int edit_basic_equipment_construction) {
            this.edit_basic_equipment_construction = edit_basic_equipment_construction;
        }

        public int getCwdfcfb() {
            return cwdfcfb;
        }

        public void setCwdfcfb(int cwdfcfb) {
            this.cwdfcfb = cwdfcfb;
        }

        public int getSbgyswh() {
            return sbgyswh;
        }

        public void setSbgyswh(int sbgyswh) {
            this.sbgyswh = sbgyswh;
        }

        public int getSafe_problem_signed() {
            return safe_problem_signed;
        }

        public void setSafe_problem_signed(int safe_problem_signed) {
            this.safe_problem_signed = safe_problem_signed;
        }

        public int getEdit_basic_station() {
            return edit_basic_station;
        }

        public void setEdit_basic_station(int edit_basic_station) {
            this.edit_basic_station = edit_basic_station;
        }

        public int getFbfc() {
            return fbfc;
        }

        public void setFbfc(int fbfc) {
            this.fbfc = fbfc;
        }

        public int getView_basic_equipment_construction() {
            return view_basic_equipment_construction;
        }

        public void setView_basic_equipment_construction(int view_basic_equipment_construction) {
            this.view_basic_equipment_construction = view_basic_equipment_construction;
        }

        public int getDdgl() {
            return ddgl;
        }

        public void setDdgl(int ddgl) {
            this.ddgl = ddgl;
        }

        public int getStn_approval_dpzr() {
            return stn_approval_dpzr;
        }

        public void setStn_approval_dpzr(int stn_approval_dpzr) {
            this.stn_approval_dpzr = stn_approval_dpzr;
        }

        public int getSzkhzq() {
            return szkhzq;
        }

        public void setSzkhzq(int szkhzq) {
            this.szkhzq = szkhzq;
        }

        public int getSgtzsz() {
            return sgtzsz;
        }

        public void setSgtzsz(int sgtzsz) {
            this.sgtzsz = sgtzsz;
        }

        public int getSbflwh() {
            return sbflwh;
        }

        public void setSbflwh(int sbflwh) {
            this.sbflwh = sbflwh;
        }

        public int getSbwh() {
            return sbwh;
        }

        public void setSbwh(int sbwh) {
            this.sbwh = sbwh;
        }

        public int getQywh() {
            return qywh;
        }

        public void setQywh(int qywh) {
            this.qywh = qywh;
        }

        public int getEdit_basic_show() {
            return edit_basic_show;
        }

        public void setEdit_basic_show(int edit_basic_show) {
            this.edit_basic_show = edit_basic_show;
        }

        public int getJcglfzxs() {
            return jcglfzxs;
        }

        public void setJcglfzxs(int jcglfzxs) {
            this.jcglfzxs = jcglfzxs;
        }

        public int getJsgzgl() {
            return jsgzgl;
        }

        public void setJsgzgl(int jsgzgl) {
            this.jsgzgl = jsgzgl;
        }

        public int getDbwh() {
            return dbwh;
        }

        public void setDbwh(int dbwh) {
            this.dbwh = dbwh;
        }

        public int getBgtfb() {
            return bgtfb;
        }

        public void setBgtfb(int bgtfb) {
            this.bgtfb = bgtfb;
        }

        public int getJsgzwh() {
            return jsgzwh;
        }

        public void setJsgzwh(int jsgzwh) {
            this.jsgzwh = jsgzwh;
        }

        public int getYthkhpd() {
            return ythkhpd;
        }

        public void setYthkhpd(int ythkhpd) {
            this.ythkhpd = ythkhpd;
        }

        public int getBgtwh() {
            return bgtwh;
        }

        public void setBgtwh(int bgtwh) {
            this.bgtwh = bgtwh;
        }

        public int getGx_gzsh() {
            return gx_gzsh;
        }

        public void setGx_gzsh(int gx_gzsh) {
            this.gx_gzsh = gx_gzsh;
        }

        public int getWtxzlbwh() {
            return wtxzlbwh;
        }

        public void setWtxzlbwh(int wtxzlbwh) {
            this.wtxzlbwh = wtxzlbwh;
        }

        public int getGbqpfsz() {
            return gbqpfsz;
        }

        public void setGbqpfsz(int gbqpfsz) {
            this.gbqpfsz = gbqpfsz;
        }

        public int getCzglkh() {
            return czglkh;
        }

        public void setCzglkh(int czglkh) {
            this.czglkh = czglkh;
        }

        public int getSbssbm() {
            return sbssbm;
        }

        public void setSbssbm(int sbssbm) {
            this.sbssbm = sbssbm;
        }

        public int getEquip_view() {
            return equip_view;
        }

        public void setEquip_view(int equip_view) {
            this.equip_view = equip_view;
        }

        public int getYhgl() {
            return yhgl;
        }

        public void setYhgl(int yhgl) {
            this.yhgl = yhgl;
        }

        public int getBmkhdjsz() {
            return bmkhdjsz;
        }

        public void setBmkhdjsz(int bmkhdjsz) {
            this.bmkhdjsz = bmkhdjsz;
        }

        public int getBcwh() {
            return bcwh;
        }

        public void setBcwh(int bcwh) {
            this.bcwh = bcwh;
        }

        public int getEdit_basic_ctc() {
            return edit_basic_ctc;
        }

        public void setEdit_basic_ctc(int edit_basic_ctc) {
            this.edit_basic_ctc = edit_basic_ctc;
        }

        public int getBgt() {
            return bgt;
        }

        public void setBgt(int bgt) {
            this.bgt = bgt;
        }

        public int getView_basic_station() {
            return view_basic_station;
        }

        public void setView_basic_station(int view_basic_station) {
            this.view_basic_station = view_basic_station;
        }

        public int getGx_sxbsj() {
            return gx_sxbsj;
        }

        public void setGx_sxbsj(int gx_sxbsj) {
            this.gx_sxbsj = gx_sxbsj;
        }

        public int getSbglbfwh() {
            return sbglbfwh;
        }

        public void setSbglbfwh(int sbglbfwh) {
            this.sbglbfwh = sbglbfwh;
        }

        public int getView_basic_team() {
            return view_basic_team;
        }

        public void setView_basic_team(int view_basic_team) {
            this.view_basic_team = view_basic_team;
        }

        public int getEdit_basic_card() {
            return edit_basic_card;
        }

        public void setEdit_basic_card(int edit_basic_card) {
            this.edit_basic_card = edit_basic_card;
        }

        public int getJsgzxj() {
            return jsgzxj;
        }

        public void setJsgzxj(int jsgzxj) {
            this.jsgzxj = jsgzxj;
        }

        public int getGzl() {
            return gzl;
        }

        public void setGzl(int gzl) {
            this.gzl = gzl;
        }
    }

    public static class RiskTypesBean {
        /**
         * pym : xfaq
         * sjzx_update_time : null
         * sjzx_update_useruuid : null
         * pid : 0
         * code : null
         * type : 1
         * sjzx_create_useruuid : 9BCA50CE85854539BAD347B10643AC9E
         * deleted : 0
         * sjzx_update_username : null
         * id : 2794
         * colour : 0
         * is_warning : 1
         * name : 消防安全
         * sjzx_create_username : 沈阳车务段管理员
         * sjzx_create_time : 2017-06-30 16:58:39
         * unit_code : 0001000900220008
         */

        private String pym;
        private Object sjzx_update_time;
        private Object sjzx_update_useruuid;
        private int pid;
        private Object code;
        private int type;
        private String sjzx_create_useruuid;
        private int deleted;
        private Object sjzx_update_username;
        private int id;
        private int colour;
        private int is_warning;
        private String name;
        private String sjzx_create_username;
        private String sjzx_create_time;
        private String unit_code;

        public String getPym() {
            return pym;
        }

        public void setPym(String pym) {
            this.pym = pym;
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

        public int getIs_warning() {
            return is_warning;
        }

        public void setIs_warning(int is_warning) {
            this.is_warning = is_warning;
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

        public String getUnit_code() {
            return unit_code;
        }

        public void setUnit_code(String unit_code) {
            this.unit_code = unit_code;
        }
    }
}
