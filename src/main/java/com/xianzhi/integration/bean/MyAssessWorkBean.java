package com.xianzhi.integration.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @Administrator LiBo.
 * @Date 2017/7/19.
 * @Function
 */

public class MyAssessWorkBean implements Serializable {

    private String date;
    private String myAssessId;
    /**
     * zNodes : [{"pym":"sycwd","dbm":null,"class_name":null,"type":1,"cognizance_user_id":null,"class_select":0,"id":3862,"level":3,"name":"沈阳车务段","response_user_id":263023,"safe_overtime":2400,"equdepartment":0,"leader_user_id":45402,"property":null,"pid":195,"available":1,"code":"000100090022","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":1,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":219160,"my_level":3,"start_date":null},{"pym":"ldbz","dbm":null,"class_name":null,"type":4,"cognizance_user_id":null,"class_select":0,"id":3863,"level":4,"name":"领导班子","response_user_id":263023,"safe_overtime":null,"equdepartment":0,"leader_user_id":45402,"property":null,"pid":3862,"available":1,"code":"0001000900220001","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"kyhsrk","dbm":null,"class_name":null,"type":11,"cognizance_user_id":null,"class_select":0,"id":3864,"level":4,"name":"客运和收入科","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220002","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"dqb","dbm":null,"class_name":null,"type":11,"cognizance_user_id":null,"class_select":0,"id":3865,"level":4,"name":"党群办","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220003","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"jhcwk","dbm":null,"class_name":null,"type":11,"cognizance_user_id":null,"class_select":0,"id":3866,"level":4,"name":"计划财务科","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220004","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"bwk","dbm":null,"class_name":null,"type":11,"cognizance_user_id":null,"class_select":0,"id":3867,"level":4,"name":"保卫科","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220005","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"ldrsk","dbm":null,"class_name":null,"type":11,"cognizance_user_id":null,"class_select":0,"id":3868,"level":4,"name":"劳动人事科","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220006","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"jshtjk","dbm":null,"class_name":null,"type":11,"cognizance_user_id":null,"class_select":0,"id":3869,"level":4,"name":"技术和统计科","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220007","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"aqk","dbm":null,"class_name":null,"type":11,"cognizance_user_id":null,"class_select":0,"id":3870,"level":4,"name":"安全科","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220008","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"bgs","dbm":null,"class_name":null,"type":11,"cognizance_user_id":null,"class_select":0,"id":3871,"level":4,"name":"办公室","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220009","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"dds","dbm":null,"class_name":null,"type":11,"cognizance_user_id":null,"class_select":0,"id":3872,"level":4,"name":"调度室","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220010","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"zgjyk","dbm":null,"class_name":null,"type":11,"cognizance_user_id":null,"class_select":0,"id":3873,"level":4,"name":"职工教育科","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220011","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"jtb","dbm":null,"class_name":null,"type":11,"cognizance_user_id":null,"class_select":0,"id":16565,"level":4,"name":"集体办","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220068","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-04-09 13:59:58","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"wlgs","dbm":null,"class_name":null,"type":12,"cognizance_user_id":null,"class_select":0,"id":16579,"level":4,"name":"物流公司","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220069","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-04-17 18:24:01","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"ljtz","dbm":"LTT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3874,"level":4,"name":"揽军屯站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220012","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"zwqz","dbm":"ZQT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3876,"level":4,"name":"转弯桥站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220013","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"lssz","dbm":"LCT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3878,"level":4,"name":"乱石山站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220014","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"pdbz","dbm":"PDT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3880,"level":4,"name":"平顶堡站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220015","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"jzz","dbm":"JNT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3882,"level":4,"name":"旧站站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220016","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"xtzz","dbm":"XIT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3884,"level":4,"name":"新台子站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220017","deleted":0,"station_level":3,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"tlxz","dbm":"PXT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3886,"level":4,"name":"铁岭西站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220018","deleted":0,"station_level":2,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"xfz","dbm":"XFT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3891,"level":4,"name":"西丰站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220019","deleted":0,"station_level":3,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"smzz","dbm":"SMT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3893,"level":4,"name":"双庙子站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220020","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"hhz","dbm":"HHT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3895,"level":4,"name":"浑河站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220021","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"mjdz","dbm":"MDT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3897,"level":4,"name":"毛家店站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220022","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"kyxz","dbm":"KXT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3899,"level":4,"name":"开原西站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220023","deleted":0,"station_level":3,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"hstz","dbm":"HUT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3902,"level":4,"name":"虎石台站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220024","deleted":0,"station_level":3,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"dqz","dbm":"DZT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3904,"level":4,"name":"大青站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220025","deleted":0,"station_level":2,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"yhz","dbm":"YHT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3910,"level":4,"name":"于洪站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220026","deleted":0,"station_level":3,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"gjzz","dbm":"GKT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3912,"level":4,"name":"孤家子站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220027","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"qyz","dbm":"QYT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3914,"level":4,"name":"清原站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220028","deleted":0,"station_level":3,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"sscz","dbm":"SUT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3922,"level":4,"name":"松树村站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220029","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"dhtz","dbm":"DOT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3926,"level":4,"name":"斗虎屯站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220030","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"nkqz","dbm":"NKT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3932,"level":4,"name":"南口前站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220031","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"amz","dbm":"ANT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3942,"level":4,"name":"安民站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220032","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"hsz","dbm":"HGT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3946,"level":4,"name":"辉山站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220033","deleted":0,"station_level":3,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"slz","dbm":"SQD","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3948,"level":4,"name":"沙岭站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220034","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"smlz","dbm":"SLT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3950,"level":4,"name":"石门岭站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220035","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"nzmz","dbm":"NZT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3952,"level":4,"name":"南杂木站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220036","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"dstz","dbm":"DET","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3965,"level":4,"name":"得胜台站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220037","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"csz","dbm":"CST","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3971,"level":4,"name":"苍石站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220038","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"dgtz","dbm":"DTT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3973,"level":4,"name":"大官屯站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220039","deleted":0,"station_level":2,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"ctxz","dbm":"CPT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3981,"level":4,"name":"昌图西站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220040","deleted":0,"station_level":3,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"ystz","dbm":"YUT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3987,"level":4,"name":"榆树台站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220041","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"xczz","dbm":"XCT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3997,"level":4,"name":"新城子站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220042","deleted":0,"station_level":3,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"qdz","dbm":"QDT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":3999,"level":4,"name":"前甸站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220043","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"mzhz","dbm":"MZT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":4001,"level":4,"name":"马仲河站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220044","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"dcz","dbm":"DCT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":4003,"level":4,"name":"大成站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220045","deleted":0,"station_level":2,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"fsbz","dbm":"FET","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":4011,"level":4,"name":"抚顺北站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220046","deleted":0,"station_level":2,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"tlz","dbm":"TLT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":4028,"level":4,"name":"铁岭站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220047","deleted":0,"station_level":2,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"tytz","dbm":"PYT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":4049,"level":4,"name":"田义屯站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220048","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"hgtz","dbm":"HTT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":4055,"level":4,"name":"皇姑屯站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220049","deleted":0,"station_level":3,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"dtz","dbm":"DKT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":4062,"level":4,"name":"滴台站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220050","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"dlz","dbm":"DRT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":4067,"level":4,"name":"东陵站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220051","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"zxbz","dbm":"TXT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":4076,"level":4,"name":"镇西堡站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220052","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"wgtz","dbm":"WTT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":4078,"level":4,"name":"文官屯站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220053","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"sjzz","dbm":"SWT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":4080,"level":4,"name":"深井子站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220054","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"ypz","dbm":"YPT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":4082,"level":4,"name":"营盘站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220055","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"ctz","dbm":"CTT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":4090,"level":4,"name":"昌图站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220056","deleted":0,"station_level":2,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"zdz","dbm":"ZHT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":4096,"level":4,"name":"章党站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220057","deleted":0,"station_level":3,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"bsjz","dbm":"BET","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":4113,"level":4,"name":"北三家站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220058","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"sydz","dbm":"SDT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":4115,"level":4,"name":"沈阳东站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220059","deleted":0,"station_level":2,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"petz","dbm":"PRT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":4123,"level":4,"name":"瓢儿屯站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220060","deleted":0,"station_level":2,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"kyz","dbm":"KYT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":4125,"level":4,"name":"开原站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220061","deleted":0,"station_level":2,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"tbsz","dbm":"TET","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":4145,"level":4,"name":"铁背山站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220062","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"hsgz","dbm":"HGD","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":4150,"level":4,"name":"火石岗站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220063","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"jhz","dbm":"JHD","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":4152,"level":4,"name":"近海站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220064","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"zgz","dbm":"ZGT","class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":4154,"level":4,"name":"中固站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220065","deleted":0,"station_level":4,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"nlg","dbm":null,"class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":16249,"level":4,"name":"内陆港","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220066","deleted":0,"station_level":2,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-03-06 11:14:29","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"syxz","dbm":null,"class_name":null,"type":13,"cognizance_user_id":null,"class_select":0,"id":16560,"level":4,"name":"沈阳西站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220067","deleted":0,"station_level":3,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-04-07 18:47:53","unit_type":null,"document_user":null,"my_level":4,"start_date":null},{"pym":"cscj","dbm":null,"class_name":null,"type":12,"cognizance_user_id":null,"class_select":0,"id":16834,"level":5,"name":"测试车间","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3876,"available":1,"code":"00010009002200130003","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-06-30 20:34:56","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"23","dbm":null,"class_name":null,"type":12,"cognizance_user_id":null,"class_select":0,"id":16838,"level":5,"name":"23","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3876,"available":1,"code":"00010009002200130005","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-06 09:13:32","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"cscj3","dbm":null,"class_name":null,"type":12,"cognizance_user_id":null,"class_select":0,"id":16840,"level":5,"name":"测试车间3","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3876,"available":1,"code":"00010009002200130007","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-06 09:39:53","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"yzcjcs","dbm":null,"class_name":null,"type":12,"cognizance_user_id":null,"class_select":0,"id":16848,"level":5,"name":"运转车间测试","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3878,"available":1,"code":"00010009002200140001","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-11 09:41:45","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"yzbz","dbm":null,"class_name":null,"type":12,"cognizance_user_id":null,"class_select":0,"id":15084,"level":5,"name":"运转班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4011,"available":1,"code":"00010009002200460017","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"yzbz","dbm":null,"class_name":null,"type":12,"cognizance_user_id":null,"class_select":0,"id":15096,"level":5,"name":"运转班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4028,"available":1,"code":"00010009002200470001","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"kybz","dbm":null,"class_name":null,"type":12,"cognizance_user_id":null,"class_select":0,"id":15097,"level":5,"name":"客运班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4028,"available":1,"code":"00010009002200470002","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"kybz","dbm":null,"class_name":null,"type":12,"cognizance_user_id":null,"class_select":0,"id":15087,"level":5,"name":"客运班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4125,"available":1,"code":"00010009002200610010","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"xcyb","dbm":null,"class_name":"小四班制1(▲,丨▼,○,○)","type":14,"cognizance_user_id":null,"class_select":1,"id":16592,"level":5,"name":"行车一班","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3876,"available":1,"code":"00010009002200130001","deleted":0,"station_level":null,"url":null,"class_id":38,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-05-01 18:41:42","unit_type":null,"document_user":null,"my_level":5,"start_date":"2017-07-10"},{"pym":"eb","dbm":null,"class_name":null,"type":14,"cognizance_user_id":null,"class_select":0,"id":16593,"level":5,"name":"二班","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3876,"available":1,"code":"00010009002200130002","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-05-01 18:42:11","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"csbz2","dbm":null,"class_name":null,"type":14,"cognizance_user_id":null,"class_select":0,"id":16837,"level":5,"name":"测试班组2","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3876,"available":1,"code":"00010009002200130004","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-06 08:26:17","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"csbz3","dbm":null,"class_name":null,"type":14,"cognizance_user_id":null,"class_select":0,"id":16839,"level":5,"name":"测试班组3","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3876,"available":1,"code":"00010009002200130006","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-06 09:39:31","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"yzbz","dbm":null,"class_name":null,"type":14,"cognizance_user_id":null,"class_select":0,"id":15090,"level":5,"name":"运转班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3914,"available":1,"code":"00010009002200280001","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"kybz","dbm":null,"class_name":null,"type":14,"cognizance_user_id":null,"class_select":0,"id":15091,"level":5,"name":"客运班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3914,"available":1,"code":"00010009002200280002","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"kybz","dbm":null,"class_name":null,"type":14,"cognizance_user_id":null,"class_select":0,"id":3974,"level":5,"name":"客运班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3973,"available":1,"code":"00010009002200390001","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"yzbz","dbm":null,"class_name":null,"type":14,"cognizance_user_id":null,"class_select":0,"id":3976,"level":5,"name":"运转班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3973,"available":1,"code":"00010009002200390003","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"yzbz","dbm":null,"class_name":null,"type":14,"cognizance_user_id":null,"class_select":0,"id":4005,"level":5,"name":"运转班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4003,"available":1,"code":"00010009002200450002","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"kybz","dbm":null,"class_name":null,"type":14,"cognizance_user_id":null,"class_select":0,"id":4010,"level":5,"name":"客运班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4003,"available":1,"code":"00010009002200450007","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"kybz","dbm":null,"class_name":null,"type":14,"cognizance_user_id":null,"class_select":0,"id":4012,"level":5,"name":"客运班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4011,"available":1,"code":"00010009002200460001","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"yzbz","dbm":null,"class_name":null,"type":14,"cognizance_user_id":null,"class_select":0,"id":4091,"level":5,"name":"运转班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4090,"available":1,"code":"00010009002200560001","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"kybz","dbm":null,"class_name":null,"type":14,"cognizance_user_id":null,"class_select":0,"id":4095,"level":5,"name":"客运班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4090,"available":1,"code":"00010009002200560005","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"kybz","dbm":null,"class_name":null,"type":14,"cognizance_user_id":null,"class_select":0,"id":4116,"level":5,"name":"客运班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4115,"available":1,"code":"00010009002200590001","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"yzbz","dbm":null,"class_name":null,"type":14,"cognizance_user_id":null,"class_select":0,"id":4121,"level":5,"name":"运转班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4115,"available":1,"code":"00010009002200590006","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"yzbz","dbm":null,"class_name":null,"type":14,"cognizance_user_id":null,"class_select":0,"id":4134,"level":5,"name":"运转班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4125,"available":1,"code":"00010009002200610009","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"my_level":5,"start_date":null},{"pym":"cszyxz","dbm":null,"class_name":null,"type":14,"cognizance_user_id":null,"class_select":0,"id":16835,"level":6,"name":"测试作业小组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":16834,"available":1,"code":"000100090022001300030001","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-06-30 20:35:12","unit_type":null,"document_user":null,"my_level":6,"start_date":null},{"pym":"A","dbm":null,"class_name":null,"type":14,"cognizance_user_id":null,"class_select":0,"id":16836,"level":6,"name":"A","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":16834,"available":1,"code":"000100090022001300030002","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-05 21:33:05","unit_type":null,"document_user":null,"my_level":6,"start_date":null},{"pym":"yzd4yb","dbm":null,"class_name":"大四班制(丨,\u2014,○,○)","type":14,"cognizance_user_id":null,"class_select":1,"id":16849,"level":6,"name":"运转大4一班","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":16848,"available":1,"code":"000100090022001400010001","deleted":0,"station_level":null,"url":null,"class_id":37,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-11 09:46:28","unit_type":null,"document_user":null,"my_level":6,"start_date":"2017-07-11"},{"pym":"zyxz4","dbm":null,"class_name":"小四班制1(▲,丨▼,○,○)","type":15,"cognizance_user_id":null,"class_select":1,"id":16841,"level":6,"name":"作业小组4","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":16592,"available":1,"code":"000100090022001300010001","deleted":0,"station_level":null,"url":null,"class_id":38,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-06 09:40:53","unit_type":null,"document_user":null,"my_level":6,"start_date":"2017-07-06"},{"pym":"zyxz2","dbm":null,"class_name":null,"type":15,"cognizance_user_id":null,"class_select":0,"id":17396,"level":6,"name":"作业小组2","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":16593,"available":1,"code":"000100090022001300020001","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-16 17:48:21","unit_type":null,"document_user":null,"my_level":6,"start_date":null},{"pym":"yd","dbm":null,"class_name":null,"type":15,"cognizance_user_id":null,"class_select":0,"id":17397,"level":6,"name":"一调","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":15090,"available":1,"code":"000100090022002800010001","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-16 17:50:26","unit_type":null,"document_user":null,"my_level":6,"start_date":null},{"pym":"ed","dbm":null,"class_name":null,"type":15,"cognizance_user_id":null,"class_select":0,"id":17398,"level":6,"name":"二调","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":15090,"available":1,"code":"000100090022002800010002","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-16 17:50:33","unit_type":null,"document_user":null,"my_level":6,"start_date":null},{"pym":"yd","dbm":null,"class_name":null,"type":15,"cognizance_user_id":null,"class_select":0,"id":17399,"level":6,"name":"一调","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":15091,"available":1,"code":"000100090022002800020001","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-16 17:50:42","unit_type":null,"document_user":null,"my_level":6,"start_date":null},{"pym":"ed","dbm":null,"class_name":null,"type":15,"cognizance_user_id":null,"class_select":0,"id":17400,"level":6,"name":"二调","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":15091,"available":1,"code":"000100090022002800020002","deleted":0,"station_level":null,"url":null,"class_id":null,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-16 17:50:56","unit_type":null,"document_user":null,"my_level":6,"start_date":null},{"pym":"yzybyxz","dbm":null,"class_name":"大四班制(丨,\u2014,○,○)","type":15,"cognizance_user_id":null,"class_select":1,"id":16850,"level":7,"name":"运转一班一小组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":16849,"available":1,"code":"0001000900220014000100010001","deleted":0,"station_level":null,"url":null,"class_id":37,"risk_ctrl_code":null,"problem_auto_audot":0,"create_time":"2017-07-11 09:49:01","unit_type":null,"document_user":null,"my_level":7,"start_date":"2017-07-11"}]
     * riskTypes : [{"pym":"xfaq","sjzx_update_time":null,"sjzx_update_useruuid":null,"pid":0,"code":null,"type":1,"sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","deleted":0,"sjzx_update_username":null,"id":2794,"colour":0,"is_warning":1,"name":"消防安全","sjzx_create_username":"沈阳车务段管理员","sjzx_create_time":"2017-06-30 16:58:39","unit_code":"0001000900220008"},{"pym":"gtCTC","sjzx_update_time":null,"sjzx_update_useruuid":null,"pid":0,"code":null,"type":1,"sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","deleted":0,"sjzx_update_username":null,"id":2855,"colour":0,"is_warning":1,"name":"高铁CTC","sjzx_create_username":"沈阳车务段管理员","sjzx_create_time":"2017-07-01 11:10:05","unit_code":"0001000900220008"},{"pym":"hjch","sjzx_update_time":null,"sjzx_update_useruuid":null,"pid":0,"code":null,"type":1,"sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","deleted":0,"sjzx_update_username":null,"id":2861,"colour":0,"is_warning":1,"name":"货检车号","sjzx_create_username":"沈阳车务段管理员","sjzx_create_time":"2017-07-01 11:11:30","unit_code":"0001000900220008"},{"pym":"lwaq","sjzx_update_time":null,"sjzx_update_useruuid":null,"pid":0,"code":null,"type":1,"sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","deleted":0,"sjzx_update_username":null,"id":2870,"colour":0,"is_warning":1,"name":"路外安全","sjzx_create_username":"沈阳车务段管理员","sjzx_create_time":"2017-07-01 11:13:13","unit_code":"0001000900220008"},{"pym":"kyzz","sjzx_update_time":null,"sjzx_update_useruuid":null,"pid":0,"code":null,"type":1,"sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","deleted":0,"sjzx_update_username":null,"id":2874,"colour":0,"is_warning":2,"name":"客运组织","sjzx_create_username":"沈阳车务段管理员","sjzx_create_time":"2017-07-01 11:14:06","unit_code":"0001000900220008"},{"pym":"ldjl","sjzx_update_time":null,"sjzx_update_useruuid":null,"pid":0,"code":null,"type":1,"sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","deleted":0,"sjzx_update_username":null,"id":2882,"colour":0,"is_warning":2,"name":"劳动纪律","sjzx_create_username":"沈阳车务段管理员","sjzx_create_time":"2017-07-01 11:15:25","unit_code":"0001000900220008"},{"pym":"lwzy","sjzx_update_time":null,"sjzx_update_useruuid":null,"pid":0,"code":null,"type":1,"sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","deleted":0,"sjzx_update_username":null,"id":2887,"colour":0,"is_warning":2,"name":"列尾作业","sjzx_create_username":"沈阳车务段管理员","sjzx_create_time":"2017-07-01 11:16:19","unit_code":"0001000900220008"},{"pym":"jccw","sjzx_update_time":null,"sjzx_update_useruuid":null,"pid":0,"code":null,"type":1,"sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","deleted":0,"sjzx_update_username":null,"id":2892,"colour":0,"is_warning":2,"name":"机车乘务","sjzx_create_username":"沈阳车务段管理员","sjzx_create_time":"2017-07-01 11:17:41","unit_code":"0001000900220008"},{"pym":"yjcz","sjzx_update_time":null,"sjzx_update_useruuid":null,"pid":0,"code":null,"type":1,"sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","deleted":0,"sjzx_update_username":null,"id":2789,"colour":0,"is_warning":2,"name":"应急处置","sjzx_create_username":"沈阳车务段管理员","sjzx_create_time":"2017-06-30 16:12:14","unit_code":"0001000900220008"},{"pym":"sg","sjzx_update_time":null,"sjzx_update_useruuid":null,"pid":0,"code":null,"type":1,"sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","deleted":0,"sjzx_update_username":null,"id":2798,"colour":0,"is_warning":2,"name":"施工","sjzx_create_username":"沈阳车务段管理员","sjzx_create_time":"2017-06-30 17:09:28","unit_code":"0001000900220008"},{"pym":"rssh","sjzx_update_time":null,"sjzx_update_useruuid":null,"pid":0,"code":null,"type":1,"sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","deleted":0,"sjzx_update_username":null,"id":2804,"colour":0,"is_warning":2,"name":"人身伤害","sjzx_create_username":"沈阳车务段管理员","sjzx_create_time":"2017-06-30 17:10:58","unit_code":"0001000900220008"},{"pym":"jflc","sjzx_update_time":null,"sjzx_update_useruuid":null,"pid":0,"code":null,"type":1,"sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","deleted":0,"sjzx_update_username":null,"id":2814,"colour":0,"is_warning":2,"name":"接发列车","sjzx_create_username":"沈阳车务段管理员","sjzx_create_time":"2017-07-01 10:57:04","unit_code":"0001000900220008"},{"pym":"dc","sjzx_update_time":null,"sjzx_update_useruuid":null,"pid":0,"code":null,"type":1,"sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","deleted":0,"sjzx_update_username":null,"id":2828,"colour":0,"is_warning":2,"name":"调车","sjzx_create_username":"沈阳车务段管理员","sjzx_create_time":"2017-07-01 11:00:47","unit_code":"0001000900220008"},{"pym":"clly","sjzx_update_time":null,"sjzx_update_useruuid":null,"pid":0,"code":null,"type":1,"sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","deleted":0,"sjzx_update_username":null,"id":2846,"colour":0,"is_warning":2,"name":"车辆溜逸","sjzx_create_username":"沈阳车务段管理员","sjzx_create_time":"2017-07-01 11:08:21","unit_code":"0001000900220008"}]
     * month : 2017-07
     * list : [{"dynamic":0,"content":"每月检查接发列车","id":1279,"normal_done":2,"count":0,"normal":2,"dynamic_done":0,"extra_done":9,"minus_score":5,"pre_id":844557},{"dynamic":0,"content":"每月监听、回放车机联控","id":2892,"normal_done":0,"count":0,"normal":2,"dynamic_done":0,"extra_done":0,"minus_score":5,"pre_id":844558},{"dynamic":0,"content":"每月检查调车作业","id":1283,"normal_done":0,"count":0,"normal":2,"dynamic_done":0,"extra_done":0,"minus_score":5,"pre_id":844559}]
     * user : {"birth":"20170124","dept_name4":"安全科","dept_name3":"沈阳车务段","dept_name1":"沈阳铁路局","sso_uuid":"9BCA50CE85854539BAD347B10643AC9E","leader_type":1,"quan_post_name":"测试日勤岗","bzb":0,"dept_full_name":"沈阳铁路局-运输处-沈阳车务段-安全科","laid_off_time":null,"dept_name7":null,"dept_name5":null,"dept_name6":null,"user_type":"在岗工作","ctc":0,"dept_code7":null,"dept_code6":null,"dept_code5":null,"seniority1":null,"dept_code4":"0001000900220008","dept_code3":"000100090022","pm":0,"isshangbao":"0","position":3877,"dt":0,"fhy":0,"sys":0,"lw":0,"zdz":0,"is_leadership":1,"start_work_date":"20370124","dept_id":3870,"dg":0,"token":"098CDE226D8638E59D8727C5AA738F21","ccsj":0,"position_duty":null,"dept_cwd_or_stn_name":"沈阳车务段","dept_station_code":null,"post":1,"dept_station_name":null,"technical_level":null,"dept_name":"安全科","labor":null,"dept_cwd_or_stn_code":"000100090022","feeling":null,"login_name":"admin-sycwd","lzh":"189516","cb":0,"card_number":null,"tel":null,"tf":0,"quan_post_id":104,"type":0,"remark1":null,"password":"C4CA4238A0B923820DCC509A6F75849B","remark3":null,"remark2":null,"is_leader":0,"gender":1,"inbox_do_sort":"SEND_USER1","dept_cwd_name":"沈阳车务段","seniority":1,"post_name":"空","dc":0,"technical_level_name":null,"jsj":0,"dept_code":"0001000900220008","leader_type_name":"专业技术","key_person_mark":0,"deleted":0,"6502":0,"position_name":"工程师","email":null,"dept_cwd_code":"000100090022","create_time":"2017-01-24 23:37:14","work_experience":null,"ch":0,"zg":0,"pym":"sycwdgly","zb":0,"cert_id":null,"cancel_status":0,"hj":0,"dept_type":11,"id_card":"admin-sycwd","last_login_ip":null,"education":"本科","ljy":0,"id":189516,"name":"沈阳车务段管理员","sso_app_name":null,"outbox_do_sort":"CREATE_DATE2","ethnic":null,"political":null,"working_time":null,"last_login_time":"2017-07-19 17:41:41","yb":0,"photo":null,"dcz":0,"login_count":4566}
     */

    private String zNodes;
    private String month;
    private UserBean user;
    private List<RiskTypesBean> riskTypes;
    private List<ListBean> list;

    public MyAssessWorkBean() {
    }

    public MyAssessWorkBean(String date, String myAssessId) {
        this.date = date;
        this.myAssessId = myAssessId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMyAssessId() {
        return myAssessId;
    }

    public void setMyAssessId(String myAssessId) {
        this.myAssessId = myAssessId;
    }

    public String getZNodes() {
        return zNodes;
    }

    public void setZNodes(String zNodes) {
        this.zNodes = zNodes;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public List<RiskTypesBean> getRiskTypes() {
        return riskTypes;
    }

    public void setRiskTypes(List<RiskTypesBean> riskTypes) {
        this.riskTypes = riskTypes;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
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
         * user_type : 在岗工作
         * ctc : 0
         * dept_code7 : null
         * dept_code6 : null
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
         * last_login_time : 2017-07-19 17:41:41
         * yb : 0
         * photo : null
         * dcz : 0
         * login_count : 4566
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
        private String user_type;
        private int ctc;
        private Object dept_code7;
        private Object dept_code6;
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

        public String getUser_type() {
            return user_type;
        }

        public void setUser_type(String user_type) {
            this.user_type = user_type;
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

    public static class ListBean {
        /**
         * dynamic : 0
         * content : 每月检查接发列车
         * id : 1279
         * normal_done : 2
         * count : 0
         * normal : 2
         * dynamic_done : 0
         * extra_done : 9
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
        private boolean isSelect;

        public boolean isSelect() {
            return isSelect;
        }

        public void setSelect(boolean select) {
            isSelect = select;
        }

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
}
