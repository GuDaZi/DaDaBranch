package com.xianzhi.integration.bean;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * Created by TJTJL on 2017/8/4.
 */

public class CpcDynamicBean {

    /**
     * searchDeptNodes : [{"pym":"sycwd","dbm":null,"class_name":"日勤制(日)","type":1,"cognizance_user_id":null,"class_select":0,"id":3862,"level":3,"name":"沈阳车务段","response_user_id":263023,"safe_overtime":2400,"equdepartment":0,"leader_user_id":45402,"property":null,"pid":195,"available":1,"code":"000100090022","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":1,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":219160,"start_date":null,"warning":0},{"pym":"ldbz","dbm":null,"class_name":"日勤制(日)","type":4,"cognizance_user_id":null,"class_select":0,"id":3863,"level":4,"name":"领导班子","response_user_id":263023,"safe_overtime":null,"equdepartment":0,"leader_user_id":45402,"property":null,"pid":3862,"available":1,"code":"0001000900220001","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"kyhsrk","dbm":null,"class_name":"日勤制(日)","type":11,"cognizance_user_id":null,"class_select":0,"id":3864,"level":4,"name":"客运和收入科","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220002","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"dqb","dbm":null,"class_name":"日勤制(日)","type":11,"cognizance_user_id":null,"class_select":0,"id":3865,"level":4,"name":"党群办","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220003","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"jhcwk","dbm":null,"class_name":"日勤制(日)","type":11,"cognizance_user_id":null,"class_select":0,"id":3866,"level":4,"name":"计划财务科","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220004","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"bwk","dbm":null,"class_name":"日勤制(日)","type":11,"cognizance_user_id":null,"class_select":0,"id":3867,"level":4,"name":"保卫科","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220005","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"ldrsk","dbm":null,"class_name":"日勤制(日)","type":11,"cognizance_user_id":null,"class_select":0,"id":3868,"level":4,"name":"劳动人事科","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220006","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"jshtjk","dbm":null,"class_name":"日勤制(日)","type":11,"cognizance_user_id":null,"class_select":0,"id":3869,"level":4,"name":"技术和统计科","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220007","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"aqk","dbm":null,"class_name":"日勤制(日)","type":11,"cognizance_user_id":null,"class_select":0,"id":3870,"level":4,"name":"安全科","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220008","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"bgs","dbm":null,"class_name":"日勤制(日)","type":11,"cognizance_user_id":null,"class_select":0,"id":3871,"level":4,"name":"办公室","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220009","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"dds","dbm":null,"class_name":"日勤制(日)","type":11,"cognizance_user_id":null,"class_select":0,"id":3872,"level":4,"name":"调度室","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220010","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"zgjyk","dbm":null,"class_name":"日勤制(日)","type":11,"cognizance_user_id":null,"class_select":0,"id":3873,"level":4,"name":"职工教育科","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220011","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"jtb","dbm":null,"class_name":"日勤制(日)","type":11,"cognizance_user_id":null,"class_select":0,"id":16565,"level":4,"name":"集体办","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220068","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-04-09 13:59:58","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"gkzx","dbm":null,"class_name":"日勤制(日)","type":11,"cognizance_user_id":null,"class_select":0,"id":17673,"level":4,"name":"管控中心","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220070","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-08-03 09:14:35","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"cwbzb","dbm":null,"class_name":"日勤制(日)","type":11,"cognizance_user_id":null,"class_select":0,"id":17862,"level":4,"name":"财务保障部","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220071","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-08-03 11:02:04","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"wlgs","dbm":null,"class_name":"日勤制(日)","type":12,"cognizance_user_id":null,"class_select":0,"id":16579,"level":4,"name":"物流公司","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220069","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-04-17 18:24:01","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"ljtz","dbm":"LTT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3874,"level":4,"name":"揽军屯站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220012","station_level":4,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"zwqz","dbm":"ZQT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3876,"level":4,"name":"转弯桥站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220013","station_level":4,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"lssz","dbm":"LCT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3878,"level":4,"name":"乱石山站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220014","station_level":4,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"pdbz","dbm":"PDT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3880,"level":4,"name":"平顶堡站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220015","station_level":4,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"jzz","dbm":"JNT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3882,"level":4,"name":"旧站站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220016","station_level":4,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"xtzz","dbm":"XIT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3884,"level":4,"name":"新台子站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220017","station_level":3,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"tlxz","dbm":"PXT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3886,"level":4,"name":"铁岭西站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220018","station_level":2,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"xfz","dbm":"XFT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3891,"level":4,"name":"西丰站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220019","station_level":3,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"smzz","dbm":"SMT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3893,"level":4,"name":"双庙子站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220020","station_level":4,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"hhz","dbm":"HHT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3895,"level":4,"name":"浑河站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220021","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"mjdz","dbm":"MDT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3897,"level":4,"name":"毛家店站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220022","station_level":4,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"kyxz","dbm":"KXT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3899,"level":4,"name":"开原西站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220023","station_level":3,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"hstz","dbm":"HUT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3902,"level":4,"name":"虎石台站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220024","station_level":3,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"dqz","dbm":"DZT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3904,"level":4,"name":"大青站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220025","station_level":2,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"yhz","dbm":"YHT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3910,"level":4,"name":"于洪站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220026","station_level":3,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"gjzz","dbm":"GKT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3912,"level":4,"name":"孤家子站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220027","station_level":4,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"qyz","dbm":"QYT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3914,"level":4,"name":"清原站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220028","station_level":3,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"sscz","dbm":"SUT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3922,"level":4,"name":"松树村站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220029","station_level":4,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"dhtz","dbm":"DOT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3926,"level":4,"name":"斗虎屯站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220030","station_level":4,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"nkqz","dbm":"NKT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3932,"level":4,"name":"南口前站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220031","station_level":4,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"amz","dbm":"ANT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3942,"level":4,"name":"安民站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220032","station_level":4,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"hsz","dbm":"HGT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3946,"level":4,"name":"辉山站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220033","station_level":3,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"slz","dbm":"SQD","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3948,"level":4,"name":"沙岭站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220034","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"smlz","dbm":"SLT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3950,"level":4,"name":"石门岭站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220035","station_level":4,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"nzmz","dbm":"NZT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3952,"level":4,"name":"南杂木站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220036","station_level":4,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"dstz","dbm":"DET","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3965,"level":4,"name":"得胜台站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220037","station_level":4,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"csz","dbm":"CST","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3971,"level":4,"name":"苍石站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220038","station_level":4,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"dgtz","dbm":"DTT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3973,"level":4,"name":"大官屯站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220039","station_level":2,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"ctxz","dbm":"CPT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3981,"level":4,"name":"昌图西站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220040","station_level":3,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"ystz","dbm":"YUT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3987,"level":4,"name":"榆树台站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220041","station_level":4,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"xczz","dbm":"XCT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3997,"level":4,"name":"新城子站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220042","station_level":3,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"qdz","dbm":"QDT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":3999,"level":4,"name":"前甸站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220043","station_level":4,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"mzhz","dbm":"MZT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4001,"level":4,"name":"马仲河站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220044","station_level":4,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"dcz","dbm":"DCT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4003,"level":4,"name":"大成站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220045","station_level":2,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"fsbz","dbm":"FET","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4011,"level":4,"name":"抚顺北站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220046","station_level":2,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"tlz","dbm":"TLT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4028,"level":4,"name":"铁岭站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220047","station_level":2,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"tytz","dbm":"PYT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4049,"level":4,"name":"田义屯站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220048","station_level":4,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"hgtz","dbm":"HTT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4055,"level":4,"name":"皇姑屯站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220049","station_level":3,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"dtz","dbm":"DKT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4062,"level":4,"name":"滴台站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220050","station_level":4,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"dlz","dbm":"DRT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4067,"level":4,"name":"东陵站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220051","station_level":4,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"zxbz","dbm":"TXT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4076,"level":4,"name":"镇西堡站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220052","station_level":4,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"wgtz","dbm":"WTT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4078,"level":4,"name":"文官屯站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220053","station_level":4,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"sjzz","dbm":"SWT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4080,"level":4,"name":"深井子站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220054","station_level":4,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"ypz","dbm":"YPT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4082,"level":4,"name":"营盘站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220055","station_level":4,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"ctz","dbm":"CTT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4090,"level":4,"name":"昌图站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220056","station_level":2,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"zdz","dbm":"ZHT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4096,"level":4,"name":"章党站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220057","station_level":3,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"bsjz","dbm":"BET","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4113,"level":4,"name":"北三家站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220058","station_level":4,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"sydz","dbm":"SDT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4115,"level":4,"name":"沈阳东站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220059","station_level":2,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"petz","dbm":"PRT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4123,"level":4,"name":"瓢儿屯站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220060","station_level":2,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"kyz","dbm":"KYT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4125,"level":4,"name":"开原站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220061","station_level":2,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"tbsz","dbm":"TET","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4145,"level":4,"name":"铁背山站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220062","station_level":4,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"hsgz","dbm":"HGD","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4150,"level":4,"name":"火石岗站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220063","station_level":4,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"jhz","dbm":"JHD","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4152,"level":4,"name":"近海站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220064","station_level":4,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"zgz","dbm":"ZGT","class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":4154,"level":4,"name":"中固站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220065","station_level":4,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"nlg","dbm":null,"class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":16249,"level":4,"name":"内陆港","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220066","station_level":2,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-03-06 11:14:29","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"syxz","dbm":null,"class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":16560,"level":4,"name":"沈阳西站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220067","station_level":3,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-04-07 18:47:53","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"xyz","dbm":null,"class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":18011,"level":4,"name":"新园站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220072","station_level":4,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-08-03 11:40:16","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"111","dbm":null,"class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":18043,"level":4,"name":"111","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220073","station_level":2,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-08-03 14:20:47","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"hsg1","dbm":null,"class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":18116,"level":4,"name":"火石岗1","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220074","station_level":4,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-08-03 15:49:07","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"gs","dbm":null,"class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":18123,"level":4,"name":"高升","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220075","station_level":4,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-08-03 15:49:10","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"sy6","dbm":null,"class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":18336,"level":4,"name":"试验6","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220076","station_level":4,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-08-03 17:34:44","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"sy5z","dbm":null,"class_name":"日勤制(日)","type":13,"cognizance_user_id":null,"class_select":0,"id":18362,"level":4,"name":"实验5站","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220077","station_level":4,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-08-03 17:40:40","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"23","dbm":null,"class_name":"日勤制(日)","type":12,"cognizance_user_id":null,"class_select":0,"id":16838,"level":5,"name":"23","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3876,"available":1,"code":"00010009002200130005","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-07-06 09:13:32","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"yzcjcs","dbm":null,"class_name":"日勤制(日)","type":12,"cognizance_user_id":null,"class_select":0,"id":16848,"level":5,"name":"运转车间测试","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3878,"available":1,"code":"00010009002200140001","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-07-11 09:41:45","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"yzbz","dbm":null,"class_name":"日勤制(日)","type":12,"cognizance_user_id":null,"class_select":0,"id":15084,"level":5,"name":"运转班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4011,"available":1,"code":"00010009002200460017","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"yzbz","dbm":null,"class_name":"日勤制(日)","type":12,"cognizance_user_id":null,"class_select":0,"id":15096,"level":5,"name":"运转班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4028,"available":1,"code":"00010009002200470001","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"kybz","dbm":null,"class_name":"日勤制(日)","type":12,"cognizance_user_id":null,"class_select":0,"id":15097,"level":5,"name":"客运班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4028,"available":1,"code":"00010009002200470002","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"kybz","dbm":null,"class_name":"日勤制(日)","type":12,"cognizance_user_id":null,"class_select":0,"id":15087,"level":5,"name":"客运班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4125,"available":1,"code":"00010009002200610010","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"rq","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":17595,"level":5,"name":"日勤","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3866,"available":1,"code":"00010009002200040001","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-08-03 09:08:58","unit_type":null,"document_user":null,"start_date":"2017-08-03","warning":0},{"pym":"gz","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":17627,"level":5,"name":"工资","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3868,"available":1,"code":"00010009002200060001","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-08-03 09:10:45","unit_type":null,"document_user":null,"start_date":"2017-08-03","warning":0},{"pym":"de","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":17636,"level":5,"name":"定额","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3868,"available":1,"code":"00010009002200060002","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-08-03 09:11:35","unit_type":null,"document_user":null,"start_date":"2017-08-03","warning":0},{"pym":"csglsbz","dbm":null,"class_name":"大四班1(丨,\u2014,○,丨,\u2014,○,○,○)","type":14,"cognizance_user_id":null,"class_select":0,"id":17468,"level":5,"name":"测试管理四班制","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3870,"available":1,"code":"00010009002200080001","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":120,"problem_auto_audot":0,"create_time":"2017-07-26 21:36:05","unit_type":null,"document_user":null,"start_date":"2017-07-26","warning":0},{"pym":"1","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":17576,"level":5,"name":"1","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3874,"available":1,"code":"00010009002200120001","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-08-03 09:07:27","unit_type":null,"document_user":null,"start_date":"2017-08-03","warning":0},{"pym":"3","dbm":null,"class_name":"小四班制2(丨▼,▲,○,○)","type":14,"cognizance_user_id":null,"class_select":1,"id":17998,"level":5,"name":"3","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3874,"available":1,"code":"00010009002200120003","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":39,"problem_auto_audot":0,"create_time":"2017-08-03 11:24:20","unit_type":null,"document_user":null,"start_date":"2017-08-01","warning":0},{"pym":"xcyb","dbm":null,"class_name":"小四班制1(▲,丨▼,○,○)","type":14,"cognizance_user_id":null,"class_select":1,"id":16592,"level":5,"name":"行车一班","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3876,"available":1,"code":"00010009002200130001","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":38,"problem_auto_audot":0,"create_time":"2017-05-01 18:41:42","unit_type":null,"document_user":null,"start_date":"2017-07-11","warning":0},{"pym":"eb","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":16593,"level":5,"name":"二班","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3876,"available":1,"code":"00010009002200130002","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-05-01 18:42:11","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"cscj","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":16834,"level":5,"name":"测试车间","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3876,"available":1,"code":"00010009002200130003","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-06-30 20:34:56","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"csbz2","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":16837,"level":5,"name":"测试班组2","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3876,"available":1,"code":"00010009002200130004","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-07-06 08:26:17","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"csbz3","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":16839,"level":5,"name":"测试班组3","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3876,"available":1,"code":"00010009002200130006","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-07-06 09:39:31","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"cscj3","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":16840,"level":5,"name":"测试车间3","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3876,"available":1,"code":"00010009002200130007","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-07-06 09:39:53","unit_type":null,"document_user":null,"start_date":"2017-07-24","warning":0},{"pym":"cscj4","dbm":null,"class_name":"两班制1(╳,○)","type":14,"cognizance_user_id":null,"class_select":0,"id":17446,"level":5,"name":"测试车间4","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3876,"available":1,"code":"00010009002200130008","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":31,"problem_auto_audot":0,"create_time":"2017-07-24 08:56:23","unit_type":null,"document_user":null,"start_date":"2017-07-29","warning":0},{"pym":"kyyb","dbm":null,"class_name":"三班制1(╳,○,○)","type":14,"cognizance_user_id":null,"class_select":0,"id":17611,"level":5,"name":"客运一班","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3886,"available":1,"code":"00010009002200180001","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":34,"problem_auto_audot":0,"create_time":"2017-08-03 09:09:56","unit_type":null,"document_user":null,"start_date":"2017-08-03","warning":0},{"pym":"kyeb","dbm":null,"class_name":"三班制1(╳,○,○)","type":14,"cognizance_user_id":null,"class_select":1,"id":17962,"level":5,"name":"客运二班","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3886,"available":1,"code":"00010009002200180002","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":34,"problem_auto_audot":0,"create_time":"2017-08-03 11:14:57","unit_type":null,"document_user":null,"start_date":"2017-08-01","warning":0},{"pym":"yzbz","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":15090,"level":5,"name":"运转班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3914,"available":1,"code":"00010009002200280001","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"kybz","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":15091,"level":5,"name":"客运班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3914,"available":1,"code":"00010009002200280002","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"kybz","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":3974,"level":5,"name":"客运班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3973,"available":1,"code":"00010009002200390001","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"yzbz","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":3976,"level":5,"name":"运转班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3973,"available":1,"code":"00010009002200390003","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"yzbz","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":4005,"level":5,"name":"运转班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4003,"available":1,"code":"00010009002200450002","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"kybz","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":4010,"level":5,"name":"客运班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4003,"available":1,"code":"00010009002200450007","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"kybz","dbm":null,"class_name":"日勤制(�)","type":14,"cognizance_user_id":null,"class_select":0,"id":4012,"level":5,"name":"客运班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4011,"available":1,"code":"00010009002200460001","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"yzcj","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":1,"id":4091,"level":5,"name":"运转车间","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4090,"available":1,"code":"00010009002200560001","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":"2017-08-01","warning":0},{"pym":"kybz","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":4095,"level":5,"name":"客运班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4090,"available":1,"code":"00010009002200560005","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"kybz","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":4116,"level":5,"name":"客运班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4115,"available":1,"code":"00010009002200590001","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"yzbz","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":4121,"level":5,"name":"运转班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4115,"available":1,"code":"00010009002200590006","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"yzbz","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":4134,"level":5,"name":"运转班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4125,"available":1,"code":"00010009002200610009","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"cw","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":17872,"level":5,"name":"财务","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":17862,"available":1,"code":"00010009002200710001","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-08-03 11:02:49","unit_type":null,"document_user":null,"start_date":"2017-08-03","warning":0},{"pym":"222","dbm":null,"class_name":"两班制3(丨,○)","type":14,"cognizance_user_id":null,"class_select":1,"id":18045,"level":5,"name":"222","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":18043,"available":1,"code":"00010009002200730001","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":33,"problem_auto_audot":0,"create_time":"2017-08-03 14:21:20","unit_type":null,"document_user":null,"start_date":"2017-08-01","warning":0},{"pym":"ebzyb","dbm":null,"class_name":"两班制2(╳,╳,○,○)","type":14,"cognizance_user_id":null,"class_select":1,"id":18176,"level":5,"name":"二班制一班","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":18116,"available":1,"code":"00010009002200740001","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":32,"problem_auto_audot":0,"create_time":"2017-08-03 15:50:02","unit_type":null,"document_user":null,"start_date":"2017-07-30","warning":0},{"pym":"ebzeb","dbm":null,"class_name":"两班制2(╳,╳,○,○)","type":14,"cognizance_user_id":null,"class_select":1,"id":18213,"level":5,"name":"二班制二班","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":18116,"available":1,"code":"00010009002200740002","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":32,"problem_auto_audot":0,"create_time":"2017-08-03 15:50:36","unit_type":null,"document_user":null,"start_date":"2017-07-31","warning":0},{"pym":"lbzyb","dbm":null,"class_name":"两班制2(╳,╳,○,○)","type":14,"cognizance_user_id":null,"class_select":1,"id":18161,"level":5,"name":"两班制一班","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":18123,"available":1,"code":"00010009002200750001","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":32,"problem_auto_audot":0,"create_time":"2017-08-03 15:49:59","unit_type":null,"document_user":null,"start_date":"2017-07-01","warning":0},{"pym":"lbzeb","dbm":null,"class_name":"两班制2(╳,╳,○,○)","type":14,"cognizance_user_id":null,"class_select":0,"id":18185,"level":5,"name":"两班制二班","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":18123,"available":1,"code":"00010009002200750002","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":32,"problem_auto_audot":0,"create_time":"2017-08-03 15:50:21","unit_type":null,"document_user":null,"start_date":"2017-07-02","warning":0},{"pym":"lbzyb","dbm":null,"class_name":"两班制2(╳,╳,○,○)","type":14,"cognizance_user_id":null,"class_select":1,"id":18338,"level":5,"name":"两班制一班","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":18336,"available":1,"code":"00010009002200760001","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":32,"problem_auto_audot":0,"create_time":"2017-08-03 17:35:17","unit_type":null,"document_user":null,"start_date":"2017-07-31","warning":0},{"pym":"lbzeb","dbm":null,"class_name":"两班制2(╳,╳,○,○)","type":14,"cognizance_user_id":null,"class_select":1,"id":18343,"level":5,"name":"两班制二班","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":18336,"available":1,"code":"00010009002200760002","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":32,"problem_auto_audot":0,"create_time":"2017-08-03 17:35:57","unit_type":null,"document_user":null,"start_date":"2017-07-30","warning":0},{"pym":"rqzbz","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":18347,"level":5,"name":"日勤制班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":18336,"available":1,"code":"00010009002200760003","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-08-03 17:36:22","unit_type":null,"document_user":null,"start_date":"2017-07-31","warning":0},{"pym":"lbzyb","dbm":null,"class_name":"两班制2(╳,╳,○,○)","type":14,"cognizance_user_id":null,"class_select":1,"id":18426,"level":5,"name":"两班制一班","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":18362,"available":1,"code":"00010009002200770001","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":32,"problem_auto_audot":0,"create_time":"2017-08-03 17:49:02","unit_type":null,"document_user":null,"start_date":"2017-07-30","warning":0},{"pym":"lbzeb","dbm":null,"class_name":"两班制2(╳,╳,○,○)","type":14,"cognizance_user_id":null,"class_select":1,"id":18430,"level":5,"name":"两班制二班","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":18362,"available":1,"code":"00010009002200770002","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":32,"problem_auto_audot":0,"create_time":"2017-08-03 17:49:45","unit_type":null,"document_user":null,"start_date":"2017-07-31","warning":0},{"pym":"rqzbz","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":18435,"level":5,"name":"日勤制班组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":18362,"available":1,"code":"00010009002200770003","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-08-03 17:50:31","unit_type":null,"document_user":null,"start_date":"2017-08-01","warning":0},{"pym":"2","dbm":null,"class_name":"小四班制2(丨▼,▲,○,○)","type":15,"cognizance_user_id":null,"class_select":1,"id":17612,"level":5,"name":"2","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3874,"available":1,"code":"00010009002200120002","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":39,"problem_auto_audot":0,"create_time":"2017-08-03 09:09:59","unit_type":null,"document_user":null,"start_date":"2017-08-03","warning":0},{"pym":"cscj5","dbm":null,"class_name":"两班制1(╳,○)","type":15,"cognizance_user_id":null,"class_select":1,"id":17447,"level":5,"name":"测试车间5","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3876,"available":1,"code":"00010009002200130009","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":31,"problem_auto_audot":0,"create_time":"2017-07-24 09:42:29","unit_type":null,"document_user":null,"start_date":"2017-07-24","warning":0},{"pym":"sbzyb","dbm":null,"class_name":"小四班制2(丨▼,▲,○,○)","type":15,"cognizance_user_id":null,"class_select":1,"id":18100,"level":5,"name":"四班制一班","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3971,"available":1,"code":"00010009002200380001","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":39,"problem_auto_audot":0,"create_time":"2017-08-03 15:36:56","unit_type":null,"document_user":null,"start_date":"2017-08-01","warning":0},{"pym":"sbzeb","dbm":null,"class_name":"小四班制2(丨▼,▲,○,○)","type":15,"cognizance_user_id":null,"class_select":1,"id":18102,"level":5,"name":"四班制二班","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3971,"available":1,"code":"00010009002200380002","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":39,"problem_auto_audot":0,"create_time":"2017-08-03 15:38:03","unit_type":null,"document_user":null,"start_date":"2017-08-01","warning":0},{"pym":"sbzsb","dbm":null,"class_name":"小四班制2(丨▼,▲,○,○)","type":15,"cognizance_user_id":null,"class_select":1,"id":18103,"level":5,"name":"四班制三班","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3971,"available":1,"code":"00010009002200380003","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":39,"problem_auto_audot":0,"create_time":"2017-08-03 15:38:41","unit_type":null,"document_user":null,"start_date":"2017-08-01","warning":0},{"pym":"sbzsb","dbm":null,"class_name":"小四班制2(丨▼,▲,○,○)","type":15,"cognizance_user_id":null,"class_select":1,"id":18104,"level":5,"name":"四班制四班","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":3971,"available":1,"code":"00010009002200380004","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":39,"problem_auto_audot":0,"create_time":"2017-08-03 15:39:29","unit_type":null,"document_user":null,"start_date":"2017-08-01","warning":0},{"pym":"cszyxz","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":16835,"level":6,"name":"测试作业小组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":16834,"available":1,"code":"000100090022001300030001","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-06-30 20:35:12","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"A","dbm":null,"class_name":"日勤制(日)","type":14,"cognizance_user_id":null,"class_select":0,"id":16836,"level":6,"name":"A","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":16834,"available":1,"code":"000100090022001300030002","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-07-05 21:33:05","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"yzd4yb","dbm":null,"class_name":"大四班制(丨,\u2014,○,○)","type":14,"cognizance_user_id":null,"class_select":1,"id":16849,"level":6,"name":"运转大4一班","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":16848,"available":1,"code":"000100090022001400010001","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":37,"problem_auto_audot":0,"create_time":"2017-07-11 09:46:28","unit_type":null,"document_user":null,"start_date":"2017-07-11","warning":0},{"pym":"kyyb","dbm":null,"class_name":"小四班制1(▲,丨▼,○,○)","type":14,"cognizance_user_id":null,"class_select":1,"id":17655,"level":6,"name":"客运一班","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":15097,"available":1,"code":"000100090022004700020001","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":38,"problem_auto_audot":0,"create_time":"2017-08-03 09:13:25","unit_type":null,"document_user":null,"start_date":"2017-08-03","warning":0},{"pym":"r","dbm":null,"class_name":"日勤制(日)","type":15,"cognizance_user_id":null,"class_select":0,"id":17588,"level":6,"name":"日","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":17576,"available":1,"code":"000100090022001200010001","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-08-03 09:08:34","unit_type":null,"document_user":null,"start_date":"2017-08-03","warning":0},{"pym":"t","dbm":null,"class_name":"特日勤(Ｔ)","type":15,"cognizance_user_id":null,"class_select":0,"id":17597,"level":6,"name":"特","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":17576,"available":1,"code":"000100090022001200010002","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":30,"problem_auto_audot":0,"create_time":"2017-08-03 09:09:02","unit_type":null,"document_user":null,"start_date":"2017-08-03","warning":0},{"pym":"zyxz4","dbm":null,"class_name":"两班制2(╳,╳,○,○)","type":15,"cognizance_user_id":null,"class_select":1,"id":16841,"level":6,"name":"作业小组4","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":16592,"available":1,"code":"000100090022001300010001","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":32,"problem_auto_audot":0,"create_time":"2017-07-06 09:40:53","unit_type":null,"document_user":null,"start_date":"2017-07-06","warning":0},{"pym":"zyxz2","dbm":null,"class_name":"日勤制(日)","type":15,"cognizance_user_id":null,"class_select":0,"id":17396,"level":6,"name":"作业小组2","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":16593,"available":1,"code":"000100090022001300020001","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-07-16 17:48:21","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"yd","dbm":null,"class_name":"日勤制(日)","type":15,"cognizance_user_id":null,"class_select":0,"id":17397,"level":6,"name":"一调","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":15090,"available":1,"code":"000100090022002800010001","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-07-16 17:50:26","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"ed","dbm":null,"class_name":"日勤制(日)","type":15,"cognizance_user_id":null,"class_select":0,"id":17398,"level":6,"name":"二调","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":15090,"available":1,"code":"000100090022002800010002","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-07-16 17:50:33","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"yd","dbm":null,"class_name":"日勤制(日)","type":15,"cognizance_user_id":null,"class_select":0,"id":17399,"level":6,"name":"一调","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":15091,"available":1,"code":"000100090022002800020001","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-07-16 17:50:42","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"ed","dbm":null,"class_name":"日勤制(日)","type":15,"cognizance_user_id":null,"class_select":0,"id":17400,"level":6,"name":"二调","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":15091,"available":1,"code":"000100090022002800020002","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-07-16 17:50:56","unit_type":null,"document_user":null,"start_date":null,"warning":0},{"pym":"xsbeb","dbm":null,"class_name":"小四班制2(丨▼,▲,○,○)","type":15,"cognizance_user_id":null,"class_select":0,"id":17973,"level":6,"name":"小四班二班","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4095,"available":1,"code":"000100090022005600050001","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":39,"problem_auto_audot":0,"create_time":"2017-08-03 11:17:45","unit_type":null,"document_user":null,"start_date":"2017-07-01","warning":0},{"pym":"xl","dbm":null,"class_name":"日勤制(日)","type":15,"cognizance_user_id":null,"class_select":0,"id":17646,"level":6,"name":"行李","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":4116,"available":1,"code":"000100090022005900010001","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-08-03 09:12:41","unit_type":null,"document_user":null,"start_date":"2017-08-03","warning":0},{"pym":"333","dbm":null,"class_name":"两班制3(丨,○)","type":15,"cognizance_user_id":null,"class_select":1,"id":18046,"level":6,"name":"333","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":18045,"available":1,"code":"000100090022007300010001","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":33,"problem_auto_audot":0,"create_time":"2017-08-03 14:26:13","unit_type":null,"document_user":null,"start_date":"2017-08-01","warning":0},{"pym":"yzybyxz","dbm":null,"class_name":"大四班制(丨,\u2014,○,○)","type":15,"cognizance_user_id":null,"class_select":1,"id":16850,"level":7,"name":"运转一班一小组","response_user_id":null,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":16849,"available":1,"code":"0001000900220014000100010001","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":37,"problem_auto_audot":0,"create_time":"2017-07-11 09:49:01","unit_type":null,"document_user":null,"start_date":"2017-07-11","warning":0}]
     * dept_code : 0001000900220008
     * ipaList : [{"6502":0,"birth":"19730126","dept_name4":"安全科","dept_name3":"沈阳车务段","sso_uuid":"1FDB15F0045146558569994ADC5645BC","leader_type":2,"quan_post_name":null,"bzb":0,"dept_full_name":"沈阳铁路局-运输处-沈阳车务段-安全科","dept_name7":null,"laid_off_time":null,"dept_name5":null,"t_level":4,"dept_name6":null,"ctc":0,"dept_code7":null,"dept_code6":null,"user_type_name":"在岗工作","dept_code5":null,"seniority1":24,"dept_code4":"0001000900220008","dept_code3":"000100090022","pm":0,"isshangbao":"0","position":2648,"dt":0,"fhy":0,"sys":0,"lw":0,"zdz":0,"is_leadership":null,"start_work_date":"19930126","dept_id":3870,"dg":0,"token":null,"ccsj":0,"position_duty":null,"dept_cwd_or_stn_name":"沈阳车务段","dept_station_code":null,"post":1,"dept_station_name":null,"technical_level":null,"dept_name":"沈阳铁路局-运输处-沈阳车务段-安全科","labor":"日","dept_cwd_or_stn_code":"000100090022","feeling":null,"login_name":"211222197301260211","user_type_id":1,"lzh":"219460","cb":0,"card_number":null,"tel":null,"tf":0,"quan_post_id":null,"type":0,"remark1":null,"password":"C4CA4238A0B923820DCC509A6F75849B","remark3":null,"remark2":null,"is_leader":0,"gender":1,"inbox_do_sort":"INBOX_CREATE_DATE2","t_type":11,"dept_cwd_name":"沈阳车务段","seniority":45,"post_name":"空","dc":0,"technical_level_name":null,"jsj":0,"dept_code":"0001000900220008","leader_type_name":"行管","key_person_mark":0,"deleted":0,"position_name":"科长","email":null,"dept_cwd_code":"000100090022","create_time":"2017-01-30 17:17:41","work_experience":"1990.08\u20141994.07 锦州铁路运输学校铁道运输专业学习\r\n1994.08\u20141995.08 沈阳铁路局沈阳分局开原车务段开原站见习生\r\n1995.08\u20141996.07 沈阳铁路分局开原车务段开原站信号员\r\n1996.07\u20141996.12 沈阳铁路分局开原车务段开原站助理员\r\n1996.12\u20142002.01 沈阳铁路分局开原车务段开原站车站值班员\r\n2003.01\u20142005.02 沈阳铁路分局铁岭车务段开原站值班站长\r\n2005.02\u20142005.07 沈阳铁路局沈阳分局铁岭车务段满井站站长\r\n2005.07\u20142006.07 沈阳铁路局沈阳车务段中固站站长（其间：2004.12-2006.06在北京交通大学交通运输专业在职学习，取得大专学历）\r\n2006.07\u20142006.11 沈阳铁路局沈阳车务段得胜台站副站长\r\n2006.11\u20142008.06 沈阳铁路局沈阳车务段得胜台站站长\r\n2008.06\u20142008.12 沈阳铁路局沈阳车务段得胜台站站长（2008.06股级，沈车岗[2008]225号）\r\n2008.12\u20142009.09 沈阳铁路局沈阳车务段得胜台站站长兼技术员\r\n2009.09\u20142011.12 沈阳铁路局沈阳车务段技术和统计科技术员\r\n2011.12\u20142015.02 沈阳铁路局沈阳车务段技术和统计科助理工程师（2011.09-2014.07北京交通大学交通运输专业在职学习，取得大学本科学历）\r\n2015.02\u2014　　　　沈阳铁路局沈阳车务段职工教育科副科长兼助理工程师（2015.02副科级，沈车人聘[2015]38号）\r\n","ch":0,"zg":0,"pym":"gsq","zb":0,"cert_id":null,"cancel_status":0,"hj":0,"dept_type":11,"id_card":"211222197301260211","last_login_ip":null,"education":"本科","ljy":0,"id":219460,"name":"关绍强","sso_app_name":null,"outbox_do_sort":"CREATE_DATE2","ethnic":"汉","political":"党员","working_time":null,"last_login_time":"2017-08-04 09:28:57","yb":0,"duty_name":null,"photo":null,"dcz":0,"login_count":1453},{"6502":0,"birth":"19641013","dept_name4":"安全科","dept_name3":"沈阳车务段","sso_uuid":"F8ACC4875C884AC9A8268BFD92C34361","leader_type":2,"quan_post_name":"车站值班员（普速）","bzb":0,"dept_full_name":"沈阳铁路局-运输处-沈阳车务段-安全科","dept_name7":null,"laid_off_time":null,"dept_name5":null,"t_level":4,"dept_name6":null,"ctc":0,"dept_code7":null,"dept_code6":null,"user_type_name":"在岗工作","dept_code5":null,"seniority1":37,"dept_code4":"0001000900220008","dept_code3":"000100090022","pm":0,"isshangbao":"0","position":2649,"dt":0,"fhy":0,"sys":0,"lw":0,"zdz":0,"is_leadership":null,"start_work_date":"19841013","dept_id":3870,"dg":0,"token":null,"ccsj":0,"position_duty":null,"dept_cwd_or_stn_name":"沈阳车务段","dept_station_code":null,"post":-1,"dept_station_name":null,"technical_level":null,"dept_name":"沈阳铁路局-运输处-沈阳车务段-安全科","labor":"日","dept_cwd_or_stn_code":"000100090022","feeling":null,"login_name":"210402196410182910","user_type_id":1,"lzh":"219157","cb":0,"card_number":null,"tel":null,"tf":0,"quan_post_id":87,"type":0,"remark1":null,"password":"C4CA4238A0B923820DCC509A6F75849B","remark3":null,"remark2":null,"is_leader":0,"gender":1,"inbox_do_sort":"TAGNUMBER1","t_type":11,"dept_cwd_name":"沈阳车务段","seniority":54,"post_name":"空","dc":0,"technical_level_name":null,"jsj":0,"dept_code":"0001000900220008","leader_type_name":"行管","key_person_mark":0,"deleted":0,"position_name":"副科长","email":null,"dept_cwd_code":"000100090022","create_time":"2017-01-30 17:17:24","work_experience":"1981.12\u20141982.03 沈阳铁路局沈阳分局大官屯站练习生\r\n1982.03\u20141982.12 沈阳铁路局沈阳分局大官屯站学习制动员\r\n1982.12\u20141988.12 沈阳铁路局沈阳分局大官屯站制动员\r\n1988.12\u20141992.04 沈阳铁路局沈阳分局大官屯站制动长\r\n1992.04\u20141993.08 沈阳铁路局沈阳分局大官屯站连接员\r\n1993.08\u20141998.04 沈阳铁路局沈阳分局大官屯站调车长\r\n1998.04\u20142008.06 沈阳铁路局大官屯站调车指导（其间：2000.09-2002.01在辽宁广播电视大学铁道运输专业在职学习，取得中专学历）\r\n2008.06\u20142009.05 沈阳铁路局大官屯站值班站长（2008.06股级,官站岗[2008]16号）\r\n2009.05\u20142010.12 沈阳铁路局大官屯站安全路风监察科监察\r\n2010.12\u2014　　　　沈阳铁路局沈阳车务段安全路风监察科监察\r\n","ch":0,"zg":0,"pym":"lx","zb":0,"cert_id":null,"cancel_status":0,"hj":0,"dept_type":11,"id_card":"210402196410182910","last_login_ip":null,"education":"中专","ljy":0,"id":219157,"name":"李侠","sso_app_name":null,"outbox_do_sort":"NAME1","ethnic":"汉","political":"党员","working_time":null,"last_login_time":"2017-07-19 19:54:28","yb":0,"duty_name":null,"photo":null,"dcz":0,"login_count":786},{"6502":0,"birth":"19640717","dept_name4":"安全科","dept_name3":"沈阳车务段","sso_uuid":"BFD39308A52A4681BD61C946B5A23BF3","leader_type":2,"quan_post_name":null,"bzb":0,"dept_full_name":"沈阳铁路局-运输处-沈阳车务段-安全科","dept_name7":null,"laid_off_time":null,"dept_name5":null,"t_level":4,"dept_name6":null,"ctc":0,"dept_code7":null,"dept_code6":null,"user_type_name":"在岗工作","dept_code5":null,"seniority1":37,"dept_code4":"0001000900220008","dept_code3":"000100090022","pm":0,"isshangbao":"0","position":3865,"dt":0,"fhy":0,"sys":0,"lw":0,"zdz":0,"is_leadership":null,"start_work_date":"19840717","dept_id":3870,"dg":0,"token":null,"ccsj":0,"position_duty":null,"dept_cwd_or_stn_name":"沈阳车务段","dept_station_code":null,"post":1,"dept_station_name":null,"technical_level":null,"dept_name":"沈阳铁路局-运输处-沈阳车务段-安全科","labor":"日","dept_cwd_or_stn_code":"000100090022","feeling":null,"login_name":"211202196407171030","user_type_id":1,"lzh":"219416","cb":0,"card_number":null,"tel":null,"tf":0,"quan_post_id":null,"type":0,"remark1":null,"password":"C4CA4238A0B923820DCC509A6F75849B","remark3":null,"remark2":null,"is_leader":0,"gender":1,"inbox_do_sort":"0","t_type":11,"dept_cwd_name":"沈阳车务段","seniority":54,"post_name":"空","dc":0,"technical_level_name":null,"jsj":0,"dept_code":"0001000900220008","leader_type_name":"行管","key_person_mark":0,"deleted":0,"position_name":"安全监察","email":null,"dept_cwd_code":"000100090022","create_time":"2017-01-30 17:17:39","work_experience":"1981.12\u20141988.10 沈阳铁路局沈阳分局铁岭站扳道员\r\n1988.10\u20141991.03 沈阳铁路局沈阳分局铁岭站助理员\r\n1991.03\u20141993.06 沈阳铁路局沈阳分局铁岭站团委书记\r\n1993.06\u20141993.12 沈阳铁路局沈阳分局铁岭车务段党委宣传助理（1993.06股级，铁车政干字[93]48号）\r\n1993.12\u20141994.08 沈阳铁路局沈阳分局铁岭车务段党委政工员（其间：1992.09-1994.06在中央党校政治专业在职学习，取得中央党校大专学历）\r\n1994.08\u20141995.03 沈阳铁路局沈阳分局乱石山站站长\r\n1995.03\u20141997.03 沈阳铁路局沈阳分局铁岭站运转支部书记（其间：1994.07-1996.12在中央党校经济管理专业在职学习，取得中央党校大学学历）\r\n1997.03\u20142004.03 沈阳铁路局沈阳分局铁岭站运转支部书记兼聘助理政工师\r\n2004.03\u20142005.06 沈阳铁路局沈阳车务段平顶堡站站长\r\n2005.06\u20142005.07 沈阳铁路局沈阳车务段中固站站长\r\n2005.07\u20142005.09 沈阳铁路局沈阳车务段得胜台站党支部书记\r\n2005.09\u20142007.03 沈阳铁路局沈阳车务段平顶堡站站长\r\n2007.03\u20142007.07 沈阳铁路局沈阳车务段新台子站运输组织员（股级）\r\n2007.07\u20142008.06 沈阳铁路局沈阳车务段新台子站副站长\r\n2008.06\u20142013.04 沈阳铁路局沈阳车务段铁岭西站（镇西堡）站长（股级）\r\n2013.04\u20142013.07 沈阳铁路局沈阳车务段镇西堡站站长（副科级）（沈车人聘[2013]248号\r\n2013.07\u20142015.10 沈阳铁路局沈阳车务段镇西堡站党支部书记兼副站长（副科级）\r\n2015.10\u2014　　　　沈阳铁路局沈阳车务段铁岭站副站长（副科级）\r\n","ch":0,"zg":0,"pym":"ctx","zb":0,"cert_id":null,"cancel_status":0,"hj":0,"dept_type":11,"id_card":"211202196407171030","last_login_ip":null,"education":"本科","ljy":0,"id":219416,"name":"陈铁祥","sso_app_name":null,"outbox_do_sort":"0","ethnic":"汉","political":"党员","working_time":null,"last_login_time":"2017-08-03 19:36:27","yb":0,"duty_name":null,"photo":null,"dcz":0,"login_count":448},{"6502":0,"birth":"19690712","dept_name4":"安全科","dept_name3":"沈阳车务段","sso_uuid":"B61A6E8C2EFF44D4976516698A1A0B32","leader_type":2,"quan_post_name":null,"bzb":0,"dept_full_name":"沈阳铁路局-运输处-沈阳车务段-安全科","dept_name7":null,"laid_off_time":null,"dept_name5":null,"t_level":4,"dept_name6":null,"ctc":0,"dept_code7":null,"dept_code6":null,"user_type_name":"在岗工作","dept_code5":null,"seniority1":null,"dept_code4":"0001000900220008","dept_code3":"000100090022","pm":0,"isshangbao":"0","position":3865,"dt":0,"fhy":0,"sys":0,"lw":0,"zdz":0,"is_leadership":null,"start_work_date":"19890712","dept_id":3870,"dg":0,"token":null,"ccsj":0,"position_duty":null,"dept_cwd_or_stn_name":"沈阳车务段","dept_station_code":null,"post":1,"dept_station_name":null,"technical_level":null,"dept_name":"沈阳铁路局-运输处-沈阳车务段-安全科","labor":null,"dept_cwd_or_stn_code":"000100090022","feeling":null,"login_name":"210402196907120918","user_type_id":1,"lzh":"219248","cb":0,"card_number":null,"tel":null,"tf":0,"quan_post_id":null,"type":0,"remark1":null,"password":"C4CA4238A0B923820DCC509A6F75849B","remark3":null,"remark2":null,"is_leader":0,"gender":1,"inbox_do_sort":"INBOX_CREATE_DATE2","t_type":11,"dept_cwd_name":"沈阳车务段","seniority":49,"post_name":"空","dc":0,"technical_level_name":null,"jsj":0,"dept_code":"0001000900220008","leader_type_name":"行管","key_person_mark":0,"deleted":0,"position_name":"安全监察","email":null,"dept_cwd_code":"000100090022","create_time":"2017-01-30 17:17:29","work_experience":null,"ch":0,"zg":0,"pym":"lch","zb":0,"cert_id":null,"cancel_status":0,"hj":0,"dept_type":11,"id_card":"210402196907120918","last_login_ip":null,"education":"中专","ljy":0,"id":219248,"name":"兰传宏","sso_app_name":null,"outbox_do_sort":"CREATE_DATE2","ethnic":null,"political":null,"working_time":null,"last_login_time":"2017-08-04 09:17:23","yb":0,"duty_name":null,"photo":null,"dcz":0,"login_count":781},{"6502":0,"birth":"19571003","dept_name4":"安全科","dept_name3":"沈阳车务段","sso_uuid":"86A0848EE4D24A758E032ED38C1AC0E1","leader_type":2,"quan_post_name":null,"bzb":0,"dept_full_name":"沈阳铁路局-运输处-沈阳车务段-安全科","dept_name7":null,"laid_off_time":null,"dept_name5":null,"t_level":4,"dept_name6":null,"ctc":0,"dept_code7":null,"dept_code6":null,"user_type_name":"在岗工作","dept_code5":null,"seniority1":null,"dept_code4":"0001000900220008","dept_code3":"000100090022","pm":0,"isshangbao":"0","position":3865,"dt":0,"fhy":0,"sys":0,"lw":0,"zdz":0,"is_leadership":null,"start_work_date":"19771003","dept_id":3870,"dg":0,"token":null,"ccsj":0,"position_duty":null,"dept_cwd_or_stn_name":"沈阳车务段","dept_station_code":null,"post":1,"dept_station_name":null,"technical_level":null,"dept_name":"沈阳铁路局-运输处-沈阳车务段-安全科","labor":null,"dept_cwd_or_stn_code":"000100090022","feeling":null,"login_name":"210105195710032218","user_type_id":1,"lzh":"219256","cb":0,"card_number":null,"tel":null,"tf":0,"quan_post_id":null,"type":0,"remark1":null,"password":"C4CA4238A0B923820DCC509A6F75849B","remark3":null,"remark2":null,"is_leader":0,"gender":1,"inbox_do_sort":"0","t_type":11,"dept_cwd_name":"沈阳车务段","seniority":61,"post_name":"空","dc":0,"technical_level_name":null,"jsj":0,"dept_code":"0001000900220008","leader_type_name":"行管","key_person_mark":0,"deleted":0,"position_name":"安全监察","email":null,"dept_cwd_code":"000100090022","create_time":"2017-01-30 17:17:30","work_experience":"1976.08\u20141980.08 下乡辽中县知青\r\n1980.08\u20141981.07 沈阳铁路局沈阳分局大成站运转车间制动员（运输）\r\n1981.07\u20141983.10 沈阳铁路局沈阳分局大成站运转车间制动长（运输）\r\n1983.10\u20141985.01 沈阳铁路局沈阳分局西站运转车间制动长（运输）\r\n1985.01\u20141985.09 沈阳铁路局沈阳分局西站运转车间调车指导（运输）\r\n1985.09\u20141985.10 沈阳铁路局沈阳分局大��站运转车间调车长（运输）\r\n1985.10\u20141990.04 沈阳铁路局沈阳分局大成站运转车间调车指导（运输）\r\n1990.04\u20141991.06 沈阳铁路局沈阳分局大成站运转车间站调（运输）\r\n1991.06\u20141996.01 沈阳铁路局沈阳分局大成站运转车间值班站长（1991.06股级，沈铁分成人字[91]第463号）\r\n1996.01\u20142002.08 沈阳铁路局沈阳分局大成站运转车间运转车间副主任\r\n2002.08\u20142005.06 沈阳铁路局沈阳分局大成站运转车间运转车间主任\r\n2005.06\u20142006.05 沈阳铁路局沈阳车务段大成站运转车间主任\r\n2006.05\u20142008.02 沈阳铁路局沈阳车务段大成站客货车间副主任（2006.05副科级，沈车干聘[2006]791号）\r\n2008.02\u20142008.08 沈阳铁路局沈阳车务段大成站运转车间党支部书记\r\n2008.08\u20142011.05 沈阳铁路局沈阳车务段大成站副站长（2008.08正科级，沈车岗[2008]270号）\r\n2011.05\u20142013.07 沈阳铁路局沈阳车务段沙岭站党支部书记\r\n2013.07\u2014　　　　沈阳铁路局沈阳车务段虎石台站党支部书记兼副站长（副科级）\r\n","ch":0,"zg":0,"pym":"lam","zb":0,"cert_id":null,"cancel_status":0,"hj":0,"dept_type":11,"id_card":"210105195710032218","last_login_ip":null,"education":"初中","ljy":0,"id":219256,"name":"刘安敏","sso_app_name":null,"outbox_do_sort":"0","ethnic":null,"political":null,"working_time":null,"last_login_time":"2017-06-13 10:46:50","yb":0,"duty_name":null,"photo":null,"dcz":0,"login_count":353},{"6502":0,"birth":"19580904","dept_name4":"安全科","dept_name3":"沈阳车务段","sso_uuid":"18D187A0E63E46549A49495983D219C3","leader_type":2,"quan_post_name":null,"bzb":0,"dept_full_name":"沈阳铁路局-运输处-沈阳车务段-安全科","dept_name7":null,"laid_off_time":null,"dept_name5":null,"t_level":4,"dept_name6":null,"ctc":0,"dept_code7":null,"dept_code6":null,"user_type_name":"在岗工作","dept_code5":null,"seniority1":40,"dept_code4":"0001000900220008","dept_code3":"000100090022","pm":0,"isshangbao":"0","position":3865,"dt":0,"fhy":0,"sys":0,"lw":0,"zdz":0,"is_leadership":null,"start_work_date":"19780904","dept_id":3870,"dg":0,"token":null,"ccsj":0,"position_duty":null,"dept_cwd_or_stn_name":"沈阳车务段","dept_station_code":null,"post":1,"dept_station_name":null,"technical_level":null,"dept_name":"沈阳铁路局-运输处-沈阳车务段-安全科","labor":null,"dept_cwd_or_stn_code":"000100090022","feeling":null,"login_name":"210403195809042137","user_type_id":1,"lzh":"219402","cb":0,"card_number":null,"tel":null,"tf":0,"quan_post_id":null,"type":0,"remark1":null,"password":"C4CA4238A0B923820DCC509A6F75849B","remark3":null,"remark2":null,"is_leader":0,"gender":1,"inbox_do_sort":"READ_STATUS2","t_type":11,"dept_cwd_name":"沈阳车务段","seniority":60,"post_name":"空","dc":0,"technical_level_name":null,"jsj":0,"dept_code":"0001000900220008","leader_type_name":"行管","key_person_mark":0,"deleted":0,"position_name":"安全监察","email":null,"dept_cwd_code":"000100090022","create_time":"2017-01-30 17:17:38","work_experience":"1978.12\u20141982.01 沈阳铁路运输机械学校装卸机械专业学习\r\n1982.01\u20141983.01 沈阳铁路局沈阳分局抚顺车务段瓢儿屯站装卸实习生\r\n1983.01\u20141984.01 沈阳铁路局沈阳分局抚顺车务段装卸管理室维修工\r\n1984.01\u20141986.12 沈阳铁路局沈阳分局抚顺车务段技术工程干部\r\n1986.12\u20141987.08 沈阳铁路局沈阳分局抚顺车务段技术员\r\n1987.08\u20141988.03 沈阳铁路局沈阳分局抚顺车务段段长室主任计划员\r\n1988.03\u20141988.11 沈阳铁路局沈阳分局抚顺车务段劳人事技术定额员\r\n1988.11\u20141992.03 沈阳铁路局沈阳分局抚顺车务段质量安全室助理工程师（其间：1988.08-1991.06在中央党校函数学院经济管理专业在职学习，取得中央党校大专学历)\r\n1992.03\u20141992.07 沈阳铁路局沈阳分局抚顺车务段李石寨站站长\r\n1992.07\u20141993.05 沈阳铁路局沈阳分局抚顺车务段瓢儿屯站副站长\r\n1993.05\u20141995.01 沈阳铁路局沈阳分局抚顺车务段李石寨站站长\r\n1995.01\u20141996.11 沈阳铁路局沈阳分局抚顺车务段抚顺城站站长（1995.01副科级，抚车人干字[95]1号）\r\n1996.11\u20141997.11 沈阳铁路局沈阳分局抚顺车务段抚顺城站站长兼助理工程师（副科级）\r\n1997.11\u20142001.01 沈阳铁路局沈阳分局抚顺车务段瓢儿屯站站长（副科级）\r\n2001.01\u20142003.12 沈阳铁路局沈阳分局抚顺车务段抚顺站站长（副科级）\r\n2003.12\u20142003.12 沈阳铁路局沈阳分局沈阳车务段驻抚顺办事组副组长\r\n2003.12\u20142004.02 沈阳铁路局沈阳车务段抚顺运输服务公司安全检查组副组长\r\n2004.02\u20142005.07 沈阳铁路局沈阳分局沈阳车务段安全教育室副主任兼助理工程师\r\n2005.07\u20142006.11 沈阳铁路局沈阳车务段安全路风监察科助理工程师\r\n2006.11\u20142008.06 沈阳铁路局沈阳车务段瓢儿屯站党支部书记兼副站长\r\n2008.06\u20142009.04 沈阳铁路局沈阳车务段瓢儿屯站党支部书记兼副站长（副科级）\r\n2009.04\u20142010.12 沈阳铁路局大官屯站瓢儿屯站党支部书记（其间：2001.03-2009.12在北京交通大学铁道运输专业在职学习，取得大学学历）\r\n2010.12\u20142013.11 沈阳铁路局沈阳车务段瓢儿屯站党支部书记\r\n2013.11\u20142015.03 沈阳铁路局沈阳车务段辉山站党支部书记（副科级）\r\n2015.03\u20142015.10 沈阳铁路局沈阳车务段大青站党总支书记（2015.03正科级，沈车党任[2015]6号）\r\n2015.10\u2014　　　　沈阳铁路局沈阳车务段铁岭西站党支部书记兼副站长（正科级）\r\n","ch":0,"zg":0,"pym":"lsb","zb":0,"cert_id":null,"cancel_status":0,"hj":0,"dept_type":11,"id_card":"210403195809042137","last_login_ip":null,"education":"本科","ljy":0,"id":219402,"name":"柳少博","sso_app_name":null,"outbox_do_sort":"0","ethnic":"汉","political":"党员","working_time":null,"last_login_time":"2017-06-12 20:56:39","yb":0,"duty_name":null,"photo":null,"dcz":0,"login_count":611},{"6502":0,"birth":"19650118","dept_name4":"安全科","dept_name3":"沈阳车务段","sso_uuid":"1E09A5850D4744BA889874F2D5143FF4","leader_type":2,"quan_post_name":"日勤测试量化岗","bzb":0,"dept_full_name":"沈阳铁路局-运输处-沈阳车务段-安全科","dept_name7":null,"laid_off_time":null,"dept_name5":null,"t_level":4,"dept_name6":null,"ctc":0,"dept_code7":null,"dept_code6":null,"user_type_name":"在岗工作","dept_code5":null,"seniority1":null,"dept_code4":"0001000900220008","dept_code3":"000100090022","pm":0,"isshangbao":"0","position":3865,"dt":0,"fhy":0,"sys":0,"lw":0,"zdz":0,"is_leadership":null,"start_work_date":"19850118","dept_id":3870,"dg":0,"token":null,"ccsj":0,"position_duty":null,"dept_cwd_or_stn_name":"沈阳车务段","dept_station_code":null,"post":-1,"dept_station_name":null,"technical_level":null,"dept_name":"沈阳铁路局-运输处-沈阳车务段-安全科","labor":null,"dept_cwd_or_stn_code":"000100090022","feeling":null,"login_name":"210114196501184232","user_type_id":1,"lzh":"219439","cb":0,"card_number":null,"tel":null,"tf":0,"quan_post_id":98,"type":0,"remark1":null,"password":"C4CA4238A0B923820DCC509A6F75849B","remark3":null,"remark2":null,"is_leader":0,"gender":1,"inbox_do_sort":"INBOX_CREATE_DATE2","t_type":11,"dept_cwd_name":"沈阳车务段","seniority":53,"post_name":"空","dc":0,"technical_level_name":null,"jsj":0,"dept_code":"0001000900220008","leader_type_name":"行管","key_person_mark":0,"deleted":0,"position_name":"安全监察","email":null,"dept_cwd_code":"000100090022","create_time":"2017-01-30 17:17:40","work_experience":"1981.11\u20141983.08 锦州铁路分局大虎山工务段修建队熟练线路工\r\n1983.08\u20141983.11 锦州铁路分局大虎山工务段线路工\r\n1983.11\u20141989.05 中国人民解放军87280部队服役\r\n1989.05\u20141991.05 沈阳铁路局沈阳分局沈阳车务段马三家站学习扳道员、扳道员\r\n1991.05\u20141991.12 沈阳铁路局沈阳分局马三家站站务员\r\n1991.12\u20141992.10 沈阳铁路局沈阳分局沈阳车务段马三家站连结员\r\n1992.10\u20141996.11 沈阳铁路局沈阳分局沈阳车务段马三家站助理兼调车长\r\n1996.11\u20142000.11 沈阳铁路局沈阳分局沈阳车务段马三家站值班员\r\n2000.11\u20142004.11 沈阳铁路局沈阳分局沈阳车务段马三家站值班站长（其间：2000.09-2002.01在辽宁广播电视中专铁道运输专业在职学习，取得中专学历）\r\n2004.11\u20142005.07 沈阳铁路局沈阳分局沈阳车务段皇姑屯站值班站长\r\n2005.07\u20142006.11 沈阳铁路局沈阳车务段皇姑屯站代副站长\r\n2006.11\u20142007.08 沈阳铁路局沈阳车务段揽军屯站代��长\r\n2007.08\u20142008.06 沈阳铁路局沈阳车务段马三家站代站长\r\n2008.06\u20142009.06 沈阳铁路局沈阳车务段马三家站站长（一般干部）\r\n2009.06\u20142013.10 沈阳铁路局沈阳车务段旧站站站长（股级）\r\n2013.10\u20142013.11 沈阳铁路局沈阳车务段旧站站长\r\n2013.11\u20142014.10 沈阳铁路局沈阳车务段旧站站长（股级）\r\n2014.10\u20142016.08 沈阳铁路局沈阳车务段文官屯站党支部书记（副科级，沈车党任[2014]19号）\r\n2016.08\u2014　　　　沈阳铁路局沈阳车务段于洪站站长兼党支部副书记（副科级）、技术员\r\n","ch":0,"zg":0,"pym":"zts","zb":0,"cert_id":null,"cancel_status":0,"hj":0,"dept_type":11,"id_card":"210114196501184232","last_login_ip":null,"education":"中专","ljy":0,"id":219439,"name":"朱铁生","sso_app_name":null,"outbox_do_sort":"0","ethnic":null,"political":null,"working_time":null,"last_login_time":"2017-06-13 06:58:35","yb":0,"duty_name":null,"photo":null,"dcz":0,"login_count":1001},{"6502":0,"birth":"19720801","dept_name4":"安全科","dept_name3":"沈阳车务段","sso_uuid":"3E779A940571462983BFA661B3F3D34D","leader_type":1,"quan_post_name":null,"bzb":0,"dept_full_name":"沈阳铁路局-运输处-沈阳车务段-安全科","dept_name7":null,"laid_off_time":null,"dept_name5":null,"t_level":4,"dept_name6":null,"ctc":0,"dept_code7":null,"dept_code6":null,"user_type_name":"在岗工作","dept_code5":null,"seniority1":23,"dept_code4":"0001000900220008","dept_code3":"000100090022","pm":0,"isshangbao":"0","position":3875,"dt":0,"fhy":0,"sys":0,"lw":0,"zdz":0,"is_leadership":null,"start_work_date":"19920801","dept_id":3870,"dg":0,"token":null,"ccsj":0,"position_duty":null,"dept_cwd_or_stn_name":"沈阳车务段","dept_station_code":null,"post":1,"dept_station_name":null,"technical_level":null,"dept_name":"沈阳铁路局-运输处-沈阳车务段-安全科","labor":"日","dept_cwd_or_stn_code":"000100090022","feeling":null,"login_name":"152101197208011525","user_type_id":1,"lzh":"219155","cb":0,"card_number":null,"tel":null,"tf":0,"quan_post_id":null,"type":0,"remark1":null,"password":"C4CA4238A0B923820DCC509A6F75849B","remark3":null,"remark2":null,"is_leader":0,"gender":2,"inbox_do_sort":"INBOX_CREATE_DATE2","t_type":11,"dept_cwd_name":"沈阳车务段","seniority":46,"post_name":"空","dc":0,"technical_level_name":null,"jsj":0,"dept_code":"0001000900220008","leader_type_name":"专业技术","key_person_mark":0,"deleted":0,"position_name":"高级工程师","email":null,"dept_cwd_code":"000100090022","create_time":"2017-01-30 17:17:24","work_experience":"1992.09\u20141995.07 大连铁道学院计算机应用专业学习\r\n1995.07\u20141996.08 哈尔滨铁路局满洲里站见习生\r\n1996.08\u20141997.11 哈尔滨铁路局满洲里站技术员\r\n1997.11\u20141998.08 沈阳铁路局沈阳分局铁岭车务段电算室技术员\r\n1998.08\u20142003.09 沈阳铁路局沈阳分局铁岭车务段电算室助理工程师\r\n2003.09\u20142004.05 沈阳铁路局铁岭车务段电算开发维修站助理工程师\r\n2004.05\u20142005.07 沈阳铁路局沈阳分局铁岭车务段电算开发维护站工程师\r\n2005.07\u20142008.06 沈阳铁路局沈阳车务段技术科工程师（其间：2002.09-2006.12在东北大学计算机信息管理专业在职学习，取得大学学历）\r\n2008.06\u20142010.10 沈阳铁路局沈阳车务段技术和统计科TMIS工程师\r\n2010.10\u20142011.10 沈阳铁路局沈阳车务段大成站货运组织员（工程师）\r\n2011.10\u20142013.01 沈阳铁路局沈阳车务段安全路风监察科工程师\r\n2013.01\u2014　　　　沈阳铁路局沈阳车务段安全路风监察科高级工程师\r\n","ch":0,"zg":0,"pym":"jhm","zb":0,"cert_id":null,"cancel_status":0,"hj":0,"dept_type":11,"id_card":"152101197208011525","last_login_ip":null,"education":"本科","ljy":0,"id":219155,"name":"贾红梅","sso_app_name":null,"outbox_do_sort":"CREATE_DATE2","ethnic":"汉","political":"党员","working_time":null,"last_login_time":"2017-08-04 09:16:36","yb":0,"duty_name":null,"photo":null,"dcz":0,"login_count":702},{"6502":0,"birth":"19591126","dept_name4":"安全科","dept_name3":"沈阳车务段","sso_uuid":"386DDF432D4E45CBA1A6776ED8C3DE87","leader_type":1,"quan_post_name":null,"bzb":0,"dept_full_name":"沈阳铁路局-运输处-沈阳车务段-安全科","dept_name7":null,"laid_off_time":null,"dept_name5":null,"t_level":4,"dept_name6":null,"ctc":0,"dept_code7":null,"dept_code6":null,"user_type_name":"在岗工作","dept_code5":null,"seniority1":37,"dept_code4":"0001000900220008","dept_code3":"000100090022","pm":0,"isshangbao":"0","position":3877,"dt":0,"fhy":0,"sys":0,"lw":0,"zdz":0,"is_leadership":null,"start_work_date":"19791126","dept_id":3870,"dg":0,"token":null,"ccsj":0,"position_duty":null,"dept_cwd_or_stn_name":"沈阳车务段","dept_station_code":null,"post":1,"dept_station_name":null,"technical_level":null,"dept_name":"沈阳铁路局-运输处-沈阳车务段-安全科","labor":"日","dept_cwd_or_stn_code":"000100090022","feeling":null,"login_name":"210114195911261216","user_type_id":1,"lzh":"219153","cb":0,"card_number":null,"tel":null,"tf":0,"quan_post_id":null,"type":0,"remark1":null,"password":"C4CA4238A0B923820DCC509A6F75849B","remark3":null,"remark2":null,"is_leader":0,"gender":1,"inbox_do_sort":"INBOX_CREATE_DATE2","t_type":11,"dept_cwd_name":"沈阳车务段","seniority":59,"post_name":"空","dc":0,"technical_level_name":null,"jsj":0,"dept_code":"0001000900220008","leader_type_name":"专业技术","key_person_mark":0,"deleted":0,"position_name":"工程师","email":null,"dept_cwd_code":"000100090022","create_time":"2017-01-30 17:17:24","work_experience":"1979.09\u20141981.07 锦州铁路运输学校运输专业学习\r\n1981.08\u20141982.08 沈阳铁路局沈阳分局苏家屯站实习生\r\n1982.08\u20141984.07 沈阳铁路局沈阳分局苏家屯站车号员\r\n1984.07\u20141985.01 沈阳铁路局沈阳分局沈阳西站车号员\r\n1985.01\u20141988.06 沈阳铁路局沈阳分局沈阳西站技术室工程技术干部（其间：1985.04-1988.06中央党校经济管理专业在职学习，取得大专学历）\r\n1988.06\u20142003.11 沈阳铁路局沈阳分局沈阳西站技术室助理工程师\r\n2003.11\u20142004.02 沈阳铁路局沈阳分局安全监控大队监察兼聘助理工程师\r\n2004.02\u20142006.04 沈阳铁路局沈阳分局安全监控大队工程师\r\n2006.04\u20142007.09 沈阳铁路局沈阳车务段深井子站副站长\r\n2007.09\u20142008.06 沈阳铁路局沈阳车务段安全路风监察科工程师\r\n2008.06\u2014　　　　沈阳铁路局沈阳车务段安全路风监察科工程师\r\n","ch":0,"zg":0,"pym":"ly","zb":0,"cert_id":null,"cancel_status":0,"hj":0,"dept_type":11,"id_card":"210114195911261216","last_login_ip":null,"education":"大专","ljy":0,"id":219153,"name":"李瑛","sso_app_name":null,"outbox_do_sort":"0","ethnic":"汉","political":"党员","working_time":null,"last_login_time":"2017-06-13 10:21:14","yb":0,"duty_name":null,"photo":null,"dcz":0,"login_count":425},{"6502":0,"birth":"20170124","dept_name4":"安全科","dept_name3":"沈阳车务段","sso_uuid":"9BCA50CE85854539BAD347B10643AC9E","leader_type":1,"quan_post_name":"测试日勤岗","bzb":0,"dept_full_name":"沈阳铁路局-运输处-沈阳车务段-安全科","dept_name7":null,"laid_off_time":null,"dept_name5":null,"t_level":4,"dept_name6":null,"ctc":0,"dept_code7":null,"dept_code6":null,"user_type_name":"在岗工作","dept_code5":null,"seniority1":null,"dept_code4":"0001000900220008","dept_code3":"000100090022","pm":0,"isshangbao":"0","position":3877,"dt":0,"fhy":0,"sys":0,"lw":0,"zdz":0,"is_leadership":1,"start_work_date":"20370124","dept_id":3870,"dg":0,"token":"098CDE226D8638E59D8727C5AA738F21","ccsj":0,"position_duty":null,"dept_cwd_or_stn_name":"沈阳车务段","dept_station_code":null,"post":1,"dept_station_name":null,"technical_level":null,"dept_name":"沈阳铁路局-运输处-沈阳车务段-安全科","labor":null,"dept_cwd_or_stn_code":"000100090022","feeling":null,"login_name":"admin-sycwd","user_type_id":1,"lzh":"189516","cb":0,"card_number":null,"tel":null,"tf":0,"quan_post_id":104,"type":0,"remark1":null,"password":"C4CA4238A0B923820DCC509A6F75849B","remark3":null,"remark2":null,"is_leader":0,"gender":1,"inbox_do_sort":"READ_STATUS1","t_type":11,"dept_cwd_name":"沈阳车务段","seniority":1,"post_name":"空","dc":0,"technical_level_name":null,"jsj":0,"dept_code":"0001000900220008","leader_type_name":"专业技术","key_person_mark":0,"deleted":0,"position_name":"工程师","email":null,"dept_cwd_code":"000100090022","create_time":"2017-01-24 23:37:14","work_experience":null,"ch":0,"zg":0,"pym":"sycwdgly","zb":0,"cert_id":null,"cancel_status":0,"hj":0,"dept_type":11,"id_card":"admin-sycwd","last_login_ip":null,"education":"本科","ljy":0,"id":189516,"name":"沈阳车务段管理员","sso_app_name":null,"outbox_do_sort":"CREATE_DATE2","ethnic":null,"political":null,"working_time":null,"last_login_time":"2017-08-04 10:48:24","yb":0,"duty_name":null,"photo":null,"dcz":0,"login_count":9198},{"6502":0,"birth":"19621230","dept_name4":"安全科","dept_name3":"沈阳车务段","sso_uuid":"6DF10849554D47C8AC7128111A135007","leader_type":1,"quan_post_name":"测试日勤岗","bzb":0,"dept_full_name":"沈阳铁路局-运输处-沈阳车务段-安全科","dept_name7":null,"laid_off_time":null,"dept_name5":null,"t_level":4,"dept_name6":null,"ctc":0,"dept_code7":null,"dept_code6":null,"user_type_name":"在岗工作","dept_code5":null,"seniority1":37,"dept_code4":"0001000900220008","dept_code3":"000100090022","pm":0,"isshangbao":"0","position":3877,"dt":0,"fhy":0,"sys":0,"lw":0,"zdz":0,"is_leadership":null,"start_work_date":"19821230","dept_id":3870,"dg":0,"token":null,"ccsj":0,"position_duty":null,"dept_cwd_or_stn_name":"沈阳车务段","dept_station_code":null,"post":1,"dept_station_name":null,"technical_level":null,"dept_name":"沈阳铁路局-运输处-沈阳车务段-安全科","labor":"日","dept_cwd_or_stn_code":"000100090022","feeling":null,"login_name":"210402196212302512","user_type_id":1,"lzh":"219154","cb":0,"card_number":null,"tel":null,"tf":0,"quan_post_id":104,"type":0,"remark1":null,"password":"C4CA4238A0B923820DCC509A6F75849B","remark3":null,"remark2":null,"is_leader":0,"gender":1,"inbox_do_sort":"INBOX_CREATE_DATE2","t_type":11,"dept_cwd_name":"沈阳车务段","seniority":56,"post_name":"空","dc":0,"technical_level_name":null,"jsj":0,"dept_code":"0001000900220008","leader_type_name":"专业技术","key_person_mark":0,"deleted":0,"position_name":"工程师","email":null,"dept_cwd_code":"000100090022","create_time":"2017-01-30 17:17:24","work_experience":"1981.12\u20141982.08 抚顺车务段前甸站学习扳道员\r\n1982.08\u20141984.10 抚顺车务段前甸站扳道员\r\n1984.10\u20141990.01 抚顺车务段前甸站扳道长\r\n1985.09\u20141988.07 锦州铁路运输学校脱产学习\r\n1990.01\u20141990.08 沈阳铁路局沈阳分局抚顺车务段前甸站值班员（1985.09-1988.07锦州铁路运输学校运输专业在职学习，取得技校学历）\r\n1990.08\u20141991.08 沈阳铁路分局抚顺车务段前甸站代务车站值班员\r\n1991.08\u20141995.03 沈阳铁路局沈阳分局抚顺车务段前甸站车站值班员\r\n1995.03\u20141997.05 沈阳铁路局沈阳分局抚顺车务段施家沟站值班站长\r\n1997.05\u20141997.11 沈阳铁路局沈阳分局抚顺车务段施家沟站站长（股级）\r\n1997.11\u20142002.01 沈阳铁路局沈阳分局抚顺车务段南杂木站副站长\r\n2001.02\u20142003.09 沈阳铁路局沈阳分局抚顺车务段安全室主任（其间：1999.09-2002.06北京交通大学交通运输专业在职学习，取得大专学历）\r\n2003.09\u20142005.02 沈阳铁路局沈阳车务段安全室副主任兼技术员\r\n2005.02\u20142005.07 沈阳铁路局沈阳车务段安全副主任\r\n2005.07\u20142005.10 沈阳铁路局沈阳车务段安全路风监察科助理工程师\r\n2005.10\u20142006.12 沈阳铁路局沈阳车务段南杂木站站长兼聘助理工程师\r\n2006.12\u20142008.12 外出劳务\r\n2008.12\u20142012.11 沈阳铁路局沈阳车务段前甸站货运员（期间：2009.06--2012.11长期休假）\r\n2012.11\u20142013.03 （返岗）沈阳铁路局沈阳车务段滴台站助理工程师\r\n2013.03\u20142013.06 沈阳铁路局沈阳车��段滴台站站长、助理工程师\r\n2013.06\u20142013.11 沈阳铁路局沈阳车务段孤家子站站长、助理工程师\r\n2013.11\u20142015.06 沈阳铁路局沈阳车务段榆树台站站长（股级）、助理工程师\r\n2015.06\u2014　　　　沈阳铁路局沈阳车务段安全路风监察科工程师\r\n","ch":0,"zg":0,"pym":"swg","zb":0,"cert_id":null,"cancel_status":0,"hj":0,"dept_type":11,"id_card":"210402196212302512","last_login_ip":null,"education":"大专","ljy":0,"id":219154,"name":"史维贵","sso_app_name":null,"outbox_do_sort":"0","ethnic":"汉","political":"党员","working_time":null,"last_login_time":"2017-07-20 21:36:08","yb":0,"duty_name":null,"photo":null,"dcz":0,"login_count":602},{"6502":0,"birth":"19801020","dept_name4":"安全科","dept_name3":"沈阳车务段","sso_uuid":"3EAB866E565F49BDB13E79AA10EEE326","leader_type":1,"quan_post_name":"测试日勤岗","bzb":0,"dept_full_name":"沈阳铁路局-运输处-沈阳车务段-安全科","dept_name7":null,"laid_off_time":null,"dept_name5":null,"t_level":4,"dept_name6":null,"ctc":0,"dept_code7":null,"dept_code6":null,"user_type_name":"在岗工作","dept_code5":null,"seniority1":14,"dept_code4":"0001000900220008","dept_code3":"000100090022","pm":0,"isshangbao":"0","position":3877,"dt":0,"fhy":0,"sys":0,"lw":0,"zdz":0,"is_leadership":null,"start_work_date":"20001020","dept_id":3870,"dg":0,"token":null,"ccsj":0,"position_duty":null,"dept_cwd_or_stn_name":"沈阳车务段","dept_station_code":null,"post":-1,"dept_station_name":null,"technical_level":null,"dept_name":"沈阳铁路局-运输处-沈阳车务段-安全科","labor":"日","dept_cwd_or_stn_code":"000100090022","feeling":null,"login_name":"210104198010204012","user_type_id":1,"lzh":"219152","cb":0,"card_number":null,"tel":null,"tf":0,"quan_post_id":104,"type":0,"remark1":null,"password":"C4CA4238A0B923820DCC509A6F75849B","remark3":null,"remark2":null,"is_leader":0,"gender":1,"inbox_do_sort":"INBOX_CREATE_DATE2","t_type":11,"dept_cwd_name":"沈阳车务段","seniority":38,"post_name":"空","dc":0,"technical_level_name":null,"jsj":0,"dept_code":"0001000900220008","leader_type_name":"专业技术","key_person_mark":0,"deleted":0,"position_name":"工程师","email":null,"dept_cwd_code":"000100090022","create_time":"2017-01-30 17:17:24","work_experience":"2000.09\u20142004.07 大连交通大学软件工程专业学习\r\n2004.07\u20142005.08 沈阳铁路局沈阳分局沈阳车务段见习生\r\n2005.08\u20142006.06 沈阳铁路局沈阳车务段文官屯站助理工程师\r\n2006.06\u20142006.10 沈阳铁路局沈阳车务段转弯桥站值班站长（岗位锻炼）\r\n2006.10\u20142007.05 沈阳铁路局沈阳车务段东陵站副站长兼助理工程师\r\n2007.05\u20142008.06 沈阳铁路局沈阳车务段浑河站副站长兼助理工程师\r\n2008.06\u20142011.01 沈阳铁路局沈阳车务段浑河站副站长兼助理工程师（股级）\r\n2011.01\u20142011.03 沈阳铁路局沈阳车务段安全路风监察科监察\r\n2011.03\u20142011.05 沈阳铁路局沈阳车务段安全路风监察科工程师\r\n2011.05\u20142012.07 沈阳铁路局沈阳北站新铁岭站工程师\r\n2012.07\u20142012.08 沈阳铁路局沈阳车务段铁岭西站工程师\r\n2012.08\u20142012.12 沈阳铁路局沈阳车务段铁岭西站副站长（股级）、工程师\r\n2012.12\u20142015.10 沈阳铁路局沈阳车务段辉山站副站长（股级）、工程师\r\n2015.10\u2014　　　　沈阳铁路局沈阳车务段安全路风监察科工程师\r\n","ch":0,"zg":0,"pym":"zj","zb":0,"cert_id":null,"cancel_status":0,"hj":0,"dept_type":11,"id_card":"210104198010204012","last_login_ip":null,"education":"本科","ljy":0,"id":219152,"name":"张健","sso_app_name":null,"outbox_do_sort":"0","ethnic":"汉","political":"党员","working_time":null,"last_login_time":"2017-06-13 10:43:10","yb":0,"duty_name":null,"photo":null,"dcz":0,"login_count":666},{"6502":0,"birth":"19691207","dept_name4":"安全科","dept_name3":"沈阳车务段","sso_uuid":"B9EF366D05BF47CBA2035F5D7B033C8F","leader_type":2,"quan_post_name":"测试日勤岗","bzb":0,"dept_full_name":"沈阳铁路局-运输处-沈阳车务段-安全科","dept_name7":null,"laid_off_time":null,"dept_name5":null,"t_level":4,"dept_name6":null,"ctc":0,"dept_code7":null,"dept_code6":null,"user_type_name":"在岗工作","dept_code5":null,"seniority1":null,"dept_code4":"0001000900220008","dept_code3":"000100090022","pm":0,"isshangbao":"0","position":3898,"dt":0,"fhy":0,"sys":0,"lw":0,"zdz":0,"is_leadership":null,"start_work_date":"19891207","dept_id":3870,"dg":0,"token":null,"ccsj":0,"position_duty":null,"dept_cwd_or_stn_name":"沈阳车务段","dept_station_code":null,"post":1,"dept_station_name":null,"technical_level":null,"dept_name":"沈阳铁路局-运输处-沈阳车务段-安全科","labor":null,"dept_cwd_or_stn_code":"000100090022","feeling":null,"login_name":"210703196912073012","user_type_id":1,"lzh":"267747","cb":0,"card_number":null,"tel":null,"tf":0,"quan_post_id":104,"type":0,"remark1":null,"password":"C4CA4238A0B923820DCC509A6F75849B","remark3":null,"remark2":null,"is_leader":0,"gender":1,"inbox_do_sort":"0","t_type":11,"dept_cwd_name":"沈阳车务段","seniority":48,"post_name":"空","dc":0,"technical_level_name":null,"jsj":0,"dept_code":"0001000900220008","leader_type_name":"行管","key_person_mark":0,"deleted":0,"position_name":"助理工程师","email":null,"dept_cwd_code":"000100090022","create_time":"2017-04-17 13:53:49","work_experience":"1987.09\u20141991.08 包头铁道工程学校铁道运输专业学习\r\n1991.08\u20141992.08 沈阳铁路局锦州分局叶柏寿车务段凌源东站见习生（连结员）\r\n1992.08\u20141993.01 沈阳铁路局锦州分局叶柏寿车务段凌源东站连结员\r\n1993.01\u20141996.01 沈阳铁路局锦州分局调度所调度员\r\n1996.01\u20141996.10 沈阳铁路局锦州分局调度所技术员\r\n1996.10\u20142000.08 沈阳铁路局锦州分局调度所列车调度员（技术员）\r\n2000.08\u20142002.07 沈阳铁路局锦州分局指挥中心列车调度员\r\n2002.07\u20142004.09 沈阳铁路局锦州分局调度指挥中心助理工程师\r\n2004.09\u20142005.08 沈阳铁路局锦州分局调度所列车调度员（助理工程师）\r\n2005.08\u20142008.10 沈阳铁路局辽西铁联商贸有限公司经营二部助理工程师（其间：2005.09-2007.04在大连铁道学院运输组织专业在职学习，取得大学专科学历）\r\n2008.10\u20142013.11 沈阳铁道金属物资有限公司宁城铁道金属物资有限公司矿粉经营部小平房营业部助理工程师\r\n2013.11\u20142014.01 沈阳铁道金属物资有限公司锦州商贸分公司朝阳西营业部助理工程师\r\n2014.01\u20142014.12 沈阳铁道金属物资有限公司锦州商贸分公司经营管理部部长\r\n2014.12\u2014　　　　沈阳铁道金属物资有限公司技术安全部助理工程师\r\n","ch":0,"zg":0,"pym":"zzt","zb":0,"cert_id":null,"cancel_status":0,"hj":0,"dept_type":11,"id_card":"210703196912073012","last_login_ip":null,"education":"大专","ljy":0,"id":267747,"name":"赵志桐","sso_app_name":null,"outbox_do_sort":"0","ethnic":null,"political":null,"working_time":null,"last_login_time":"2017-08-04 09:18:25","yb":0,"duty_name":null,"photo":null,"dcz":0,"login_count":127},{"6502":0,"birth":"19600821","dept_name4":"安全科","dept_name3":"沈阳车务段","sso_uuid":"F07A47AE5E7546D798A74C7F1CB72E56","leader_type":2,"quan_post_name":null,"bzb":0,"dept_full_name":"沈阳铁路局-运输处-沈阳车务段-安全科","dept_name7":null,"laid_off_time":null,"dept_name5":null,"t_level":4,"dept_name6":null,"ctc":0,"dept_code7":null,"dept_code6":null,"user_type_name":"在岗工作","dept_code5":null,"seniority1":null,"dept_code4":"0001000900220008","dept_code3":"000100090022","pm":0,"isshangbao":"0","position":4327,"dt":0,"fhy":0,"sys":0,"lw":0,"zdz":0,"is_leadership":null,"start_work_date":"19800821","dept_id":3870,"dg":0,"token":null,"ccsj":0,"position_duty":null,"dept_cwd_or_stn_name":"沈阳车务段","dept_station_code":null,"post":1,"dept_station_name":null,"technical_level":null,"dept_name":"沈阳铁路局-运输处-沈阳车务段-安全科","labor":null,"dept_cwd_or_stn_code":"000100090022","feeling":null,"login_name":"210111196008213416","user_type_id":1,"lzh":"219270","cb":0,"card_number":null,"tel":null,"tf":0,"quan_post_id":null,"type":0,"remark1":null,"password":"C4CA4238A0B923820DCC509A6F75849B","remark3":null,"remark2":null,"is_leader":0,"gender":1,"inbox_do_sort":"0","t_type":11,"dept_cwd_name":"沈阳车务段","seniority":58,"post_name":"空","dc":0,"technical_level_name":null,"jsj":0,"dept_code":"0001000900220008","leader_type_name":"行管","key_person_mark":0,"deleted":0,"position_name":"安全监控员","email":null,"dept_cwd_code":"000100090022","create_time":"2017-01-30 17:17:30","work_experience":"1982.01\u20141984.12 沈阳铁路局第五工程段线路工\r\n1984.12\u20141985.09 沈阳铁路分局沈阳车务段浑河站扳道员\r\n1985.09\u20141987.12 沈阳铁路分局沈阳车务段浑河站站务员\r\n1987.12\u20141988.11 沈阳铁路分局沈阳车务段浑河站助理值班员\r\n1988.11\u20141992.07 沈阳铁路分局沈阳车务段浑河站代务值班员\r\n1992.07\u20142004.11 沈阳铁路局沈阳车务段浑河站运转值班员\r\n2004.11\u20142010.02 沈阳铁路分局沈阳车务段浑河站值班站长（2003.03-2005.01辽宁广播电视中等专业学校铁道运输专业在职学习，取得中专学历）\r\n2010.02\u20142011.06 沈阳铁路局沈阳车务段揽军屯站代副站长\r\n2011.06\u20142013.02 沈阳铁路局沈阳车务段揽军屯站代站长\r\n2013.02\u20142013.11 沈阳铁路局沈阳车务段揽军屯站站长（一般干部）\r\n2013.11\u20142014.07 沈阳铁路局沈阳车务段揽军屯站站长（股级）\r\n2014.07\u2014　　　　沈阳铁路局沈阳车务段浑河站代助理工程师\r\n","ch":0,"zg":0,"pym":"lp","zb":0,"cert_id":null,"cancel_status":0,"hj":0,"dept_type":11,"id_card":"210111196008213416","last_login_ip":null,"education":"中专","ljy":0,"id":219270,"name":"郎平","sso_app_name":null,"outbox_do_sort":"0","ethnic":null,"political":null,"working_time":null,"last_login_time":"2017-06-11 22:56:14","yb":0,"duty_name":null,"photo":null,"dcz":0,"login_count":184},{"6502":0,"birth":"19811022","dept_name4":"安全科","dept_name3":"沈阳车务段","sso_uuid":"CBCEAA79DDCB4B63B76D88C7357ECEC6","leader_type":3,"quan_post_name":"测试特日岗","bzb":0,"dept_full_name":"沈阳铁路局-运输处-沈阳车务段-安全科","dept_name7":null,"laid_off_time":null,"dept_name5":null,"t_level":4,"dept_name6":null,"ctc":0,"dept_code7":null,"dept_code6":null,"user_type_name":"在岗工作","dept_code5":null,"seniority1":null,"dept_code4":"0001000900220008","dept_code3":"000100090022","pm":0,"isshangbao":"0","position":4327,"dt":0,"fhy":0,"sys":0,"lw":0,"zdz":0,"is_leadership":null,"start_work_date":"20011022","dept_id":3870,"dg":0,"token":null,"ccsj":0,"position_duty":null,"dept_cwd_or_stn_name":"沈阳车务段","dept_station_code":null,"post":1,"dept_station_name":null,"technical_level":null,"dept_name":"沈阳铁路局-运输处-沈阳车务段-安全科","labor":null,"dept_cwd_or_stn_code":"000100090022","feeling":null,"login_name":"21040219810224201X","user_type_id":1,"lzh":"244595","cb":0,"card_number":null,"tel":null,"tf":0,"quan_post_id":108,"type":0,"remark1":null,"password":"C4CA4238A0B923820DCC509A6F75849B","remark3":null,"remark2":null,"is_leader":0,"gender":1,"inbox_do_sort":"0","t_type":11,"dept_cwd_name":"沈阳车务段","seniority":36,"post_name":"空","dc":0,"technical_level_name":null,"jsj":0,"dept_code":"0001000900220008","leader_type_name":"生产","key_person_mark":0,"deleted":0,"position_name":"安全监控员","email":null,"dept_cwd_code":"000100090022","create_time":"2017-02-08 09:18:34","work_experience":null,"ch":0,"zg":0,"pym":"lk","zb":0,"cert_id":null,"cancel_status":0,"hj":0,"dept_type":11,"id_card":"21040219810224201X","last_login_ip":null,"education":"大专","ljy":0,"id":244595,"name":"李凯","sso_app_name":null,"outbox_do_sort":"0","ethnic":null,"political":null,"working_time":null,"last_login_time":"2017-07-17 02:48:20","yb":0,"duty_name":null,"photo":null,"dcz":0,"login_count":334},{"6502":0,"birth":"19691227","dept_name4":"安全科","dept_name3":"沈阳车务段","sso_uuid":"87B8B8F89A54400E974D63DBBF0F27F3","leader_type":3,"quan_post_name":"测试特日岗","bzb":0,"dept_full_name":"沈阳铁路局-运输处-沈阳车务段-安全科","dept_name7":null,"laid_off_time":null,"dept_name5":null,"t_level":4,"dept_name6":null,"ctc":0,"dept_code7":null,"dept_code6":null,"user_type_name":"在岗工作","dept_code5":null,"seniority1":null,"dept_code4":"0001000900220008","dept_code3":"000100090022","pm":0,"isshangbao":"0","position":4327,"dt":0,"fhy":0,"sys":0,"lw":0,"zdz":0,"is_leadership":null,"start_work_date":"19891227","dept_id":3870,"dg":0,"token":null,"ccsj":0,"position_duty":null,"dept_cwd_or_stn_name":"沈阳车务段","dept_station_code":null,"post":-1,"dept_station_name":null,"technical_level":null,"dept_name":"沈阳铁路局-运输处-沈阳车务段-安全科","labor":null,"dept_cwd_or_stn_code":"000100090022","feeling":null,"login_name":"210113196912272716","user_type_id":1,"lzh":"244596","cb":0,"card_number":null,"tel":null,"tf":0,"quan_post_id":108,"type":0,"remark1":null,"password":"C4CA4238A0B923820DCC509A6F75849B","remark3":null,"remark2":null,"is_leader":0,"gender":1,"inbox_do_sort":"0","t_type":11,"dept_cwd_name":"沈阳车务段","seniority":48,"post_name":"空","dc":0,"technical_level_name":null,"jsj":0,"dept_code":"0001000900220008","leader_type_name":"生产","key_person_mark":0,"deleted":0,"position_name":"安全监控员","email":null,"dept_cwd_code":"000100090022","create_time":"2017-02-08 09:20:53","work_experience":null,"ch":0,"zg":0,"pym":"lx","zb":0,"cert_id":null,"cancel_status":0,"hj":0,"dept_type":11,"id_card":"210113196912272716","last_login_ip":null,"education":"大专","ljy":0,"id":244596,"name":"刘新","sso_app_name":null,"outbox_do_sort":"0","ethnic":null,"political":null,"working_time":null,"last_login_time":"2017-06-11 03:20:52","yb":0,"duty_name":null,"photo":null,"dcz":0,"login_count":126},{"6502":0,"birth":"19740517","dept_name4":"安全科","dept_name3":"沈阳车务段","sso_uuid":"05DC1489F99342B7B43FD82ABC297ECA","leader_type":3,"quan_post_name":"�勤测试量化岗","bzb":0,"dept_full_name":"沈阳铁路局-运输处-沈阳车务段-安全科","dept_name7":null,"laid_off_time":null,"dept_name5":null,"t_level":4,"dept_name6":null,"ctc":0,"dept_code7":null,"dept_code6":null,"user_type_name":"在岗工作","dept_code5":null,"seniority1":null,"dept_code4":"0001000900220008","dept_code3":"000100090022","pm":0,"isshangbao":"0","position":4327,"dt":0,"fhy":0,"sys":0,"lw":0,"zdz":0,"is_leadership":null,"start_work_date":"19940517","dept_id":3870,"dg":0,"token":null,"ccsj":0,"position_duty":null,"dept_cwd_or_stn_name":"沈阳车务段","dept_station_code":null,"post":-1,"dept_station_name":null,"technical_level":null,"dept_name":"沈阳铁路局-运输处-沈阳车务段-安全科","labor":null,"dept_cwd_or_stn_code":"000100090022","feeling":null,"login_name":"210113197405170015","user_type_id":1,"lzh":"244597","cb":0,"card_number":null,"tel":null,"tf":0,"quan_post_id":98,"type":0,"remark1":null,"password":"C4CA4238A0B923820DCC509A6F75849B","remark3":null,"remark2":null,"is_leader":0,"gender":1,"inbox_do_sort":"INBOX_CREATE_DATE2","t_type":11,"dept_cwd_name":"沈阳车务段","seniority":43,"post_name":"空","dc":0,"technical_level_name":null,"jsj":0,"dept_code":"0001000900220008","leader_type_name":"生产","key_person_mark":0,"deleted":0,"position_name":"安全监控员","email":null,"dept_cwd_code":"000100090022","create_time":"2017-02-08 09:22:20","work_experience":null,"ch":0,"zg":0,"pym":"xyc","zb":0,"cert_id":null,"cancel_status":0,"hj":0,"dept_type":11,"id_card":"210113197405170015","last_login_ip":null,"education":null,"ljy":0,"id":244597,"name":"徐艳春","sso_app_name":null,"outbox_do_sort":"0","ethnic":null,"political":null,"working_time":null,"last_login_time":"2017-06-13 02:44:15","yb":0,"duty_name":null,"photo":null,"dcz":0,"login_count":394}]
     */

    private String searchDeptNodes;
    private String dept_code;
    private List<IpaListBean> ipaList;

    public String getSearchDeptNodes() {
        return searchDeptNodes;
    }

    public void setSearchDeptNodes(String searchDeptNodes) {
        this.searchDeptNodes = searchDeptNodes;
    }

    public String getDept_code() {
        return dept_code;
    }

    public void setDept_code(String dept_code) {
        this.dept_code = dept_code;
    }

    public List<IpaListBean> getIpaList() {
        return ipaList;
    }

    public void setIpaList(List<IpaListBean> ipaList) {
        this.ipaList = ipaList;
    }

    public static class IpaListBean {
        /**
         * 6502 : 0
         * birth : 19730126
         * dept_name4 : 安全科
         * dept_name3 : 沈阳车务段
         * sso_uuid : 1FDB15F0045146558569994ADC5645BC
         * leader_type : 2
         * quan_post_name : null
         * bzb : 0
         * dept_full_name : 沈阳铁路局-运输处-沈阳车务段-安全科
         * dept_name7 : null
         * laid_off_time : null
         * dept_name5 : null
         * t_level : 4
         * dept_name6 : null
         * ctc : 0
         * dept_code7 : null
         * dept_code6 : null
         * user_type_name : 在岗工作
         * dept_code5 : null
         * seniority1 : 24
         * dept_code4 : 0001000900220008
         * dept_code3 : 000100090022
         * pm : 0
         * isshangbao : 0
         * position : 2648
         * dt : 0
         * fhy : 0
         * sys : 0
         * lw : 0
         * zdz : 0
         * is_leadership : null
         * start_work_date : 19930126
         * dept_id : 3870
         * dg : 0
         * token : null
         * ccsj : 0
         * position_duty : null
         * dept_cwd_or_stn_name : 沈阳车务段
         * dept_station_code : null
         * post : 1
         * dept_station_name : null
         * technical_level : null
         * dept_name : 沈阳铁路局-运输处-沈阳车务段-安全科
         * labor : 日
         * dept_cwd_or_stn_code : 000100090022
         * feeling : null
         * login_name : 211222197301260211
         * user_type_id : 1
         * lzh : 219460
         * cb : 0
         * card_number : null
         * tel : null
         * tf : 0
         * quan_post_id : null
         * type : 0
         * remark1 : null
         * password : C4CA4238A0B923820DCC509A6F75849B
         * remark3 : null
         * remark2 : null
         * is_leader : 0
         * gender : 1
         * inbox_do_sort : INBOX_CREATE_DATE2
         * t_type : 11
         * dept_cwd_name : 沈阳车务段
         * seniority : 45
         * post_name : 空
         * dc : 0
         * technical_level_name : null
         * jsj : 0
         * dept_code : 0001000900220008
         * leader_type_name : 行管
         * key_person_mark : 0
         * deleted : 0
         * position_name : 科长
         * email : null
         * dept_cwd_code : 000100090022
         * create_time : 2017-01-30 17:17:41
         * work_experience : 1990.08—1994.07 锦州铁路运输学校铁道运输专业学习
         1994.08—1995.08 沈阳铁路局沈阳分局开原车务段开原站见习生
         1995.08—1996.07 沈阳铁路分局开原车务段开原站信号员
         1996.07—1996.12 沈阳铁路分局开原车务段开原站助理员
         1996.12—2002.01 沈阳铁路分局开原车务段开原站车站值班员
         2003.01—2005.02 沈阳铁路分局铁岭车务段开原站值班站长
         2005.02—2005.07 沈阳铁路局沈阳分局铁岭车务段满井站站长
         2005.07—2006.07 沈阳铁路局沈阳车务段中固站站长（其间：2004.12-2006.06在北京交通大学交通运输专业在职学习，取得大专学历）
         2006.07—2006.11 沈阳铁路局沈阳车务段得胜台站副站长
         2006.11—2008.06 沈阳铁路局沈阳车务段得胜台站站长
         2008.06—2008.12 沈阳铁路局沈阳车务段得胜台站站长（2008.06股级，沈车岗[2008]225号）
         2008.12—2009.09 沈阳铁路局沈阳车务段得胜台站站长兼技术员
         2009.09—2011.12 沈阳铁路局沈阳车务段技术和统计科技术员
         2011.12—2015.02 沈阳铁路局沈阳车务段技术和统计科助理工程师（2011.09-2014.07北京交通大学交通运输专业在职学习，取得大学本科学历）
         2015.02—　　　　沈阳铁路局沈阳车务段职工教育科副科长兼助理工程师（2015.02副科级，沈车人聘[2015]38号）

         * ch : 0
         * zg : 0
         * pym : gsq
         * zb : 0
         * cert_id : null
         * cancel_status : 0
         * hj : 0
         * dept_type : 11
         * id_card : 211222197301260211
         * last_login_ip : null
         * education : 本科
         * ljy : 0
         * id : 219460
         * name : 关绍强
         * sso_app_name : null
         * outbox_do_sort : CREATE_DATE2
         * ethnic : 汉
         * political : 党员
         * working_time : null
         * last_login_time : 2017-08-04 09:28:57
         * yb : 0
         * duty_name : null
         * photo : null
         * dcz : 0
         * login_count : 1453
         */

        @JSONField(name = "6502")
        private int _$6502;
        private String birth;
        private String dept_name4;
        private String dept_name3;
        private String sso_uuid;
        private int leader_type;
        private Object quan_post_name;
        private int bzb;
        private String dept_full_name;
        private Object dept_name7;
        private Object laid_off_time;
        private Object dept_name5;
        private int t_level;
        private Object dept_name6;
        private int ctc;
        private Object dept_code7;
        private Object dept_code6;
        private String user_type_name;
        private Object dept_code5;
        private int seniority1;
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
        private Object is_leadership;
        private String start_work_date;
        private int dept_id;
        private int dg;
        private Object token;
        private int ccsj;
        private Object position_duty;
        private String dept_cwd_or_stn_name;
        private Object dept_station_code;
        private int post;
        private Object dept_station_name;
        private Object technical_level;
        private String dept_name;
        private String labor;
        private String dept_cwd_or_stn_code;
        private Object feeling;
        private String login_name;
        private int user_type_id;
        private String lzh;
        private int cb;
        private Object card_number;
        private Object tel;
        private int tf;
        private Object quan_post_id;
        private int type;
        private Object remark1;
        private String password;
        private Object remark3;
        private Object remark2;
        private int is_leader;
        private int gender;
        private String inbox_do_sort;
        private int t_type;
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
        private String work_experience;
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
        private String ethnic;
        private String political;
        private Object working_time;
        private String last_login_time;
        private int yb;
        private Object duty_name;
        private Object photo;
        private int dcz;
        private int login_count;

        public int get_$6502() {
            return _$6502;
        }

        public void set_$6502(int _$6502) {
            this._$6502 = _$6502;
        }

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

        public Object getQuan_post_name() {
            return quan_post_name;
        }

        public void setQuan_post_name(Object quan_post_name) {
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

        public Object getDept_name7() {
            return dept_name7;
        }

        public void setDept_name7(Object dept_name7) {
            this.dept_name7 = dept_name7;
        }

        public Object getLaid_off_time() {
            return laid_off_time;
        }

        public void setLaid_off_time(Object laid_off_time) {
            this.laid_off_time = laid_off_time;
        }

        public Object getDept_name5() {
            return dept_name5;
        }

        public void setDept_name5(Object dept_name5) {
            this.dept_name5 = dept_name5;
        }

        public int getT_level() {
            return t_level;
        }

        public void setT_level(int t_level) {
            this.t_level = t_level;
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

        public int getSeniority1() {
            return seniority1;
        }

        public void setSeniority1(int seniority1) {
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

        public Object getIs_leadership() {
            return is_leadership;
        }

        public void setIs_leadership(Object is_leadership) {
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

        public Object getToken() {
            return token;
        }

        public void setToken(Object token) {
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

        public String getLabor() {
            return labor;
        }

        public void setLabor(String labor) {
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

        public Object getQuan_post_id() {
            return quan_post_id;
        }

        public void setQuan_post_id(Object quan_post_id) {
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

        public int getT_type() {
            return t_type;
        }

        public void setT_type(int t_type) {
            this.t_type = t_type;
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

        public String getWork_experience() {
            return work_experience;
        }

        public void setWork_experience(String work_experience) {
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

        public String getEthnic() {
            return ethnic;
        }

        public void setEthnic(String ethnic) {
            this.ethnic = ethnic;
        }

        public String getPolitical() {
            return political;
        }

        public void setPolitical(String political) {
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
