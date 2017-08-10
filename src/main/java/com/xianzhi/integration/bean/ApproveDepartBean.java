package com.xianzhi.integration.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @Administrator LiBo.
 * @Date 2017/7/26.
 * @Function
 */

public class ApproveDepartBean implements Serializable {

    private String code;
    private String param;
    private String permis;

    private String id;
    private int approveId;
    private String comment1;
    /**
     * status : 0
     * info : 操作成功！
     */

    private int status;
    private String info;

    public ApproveDepartBean() {
    }

    public ApproveDepartBean(String code, String param, String permis) {
        this.code = code;
        this.param = param;
        this.permis = permis;
    }

    public ApproveDepartBean(String id, int approveId, String comment1) {
        this.id = id;
        this.approveId = approveId;
        this.comment1 = comment1;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getApproveId() {
        return approveId;
    }

    public void setApproveId(int approveId) {
        this.approveId = approveId;
    }

    public String getComment1() {
        return comment1;
    }

    public void setComment1(String comment1) {
        this.comment1 = comment1;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public String getPermis() {
        return permis;
    }

    public void setPermis(String permis) {
        this.permis = permis;
    }

    /**
     * moduleList : []
     * authorizedUser : {"position":{"id":3877,"pym":"gcs","sjzx_update_time":null,"sjzx_update_useruuid":null,"name":"工程师","sjzx_create_username":null,"available":1,"code":null,"sjzx_create_useruuid":null,"sjzx_create_time":"2017-06-12 11:07:50","deleted":0,"sjzx_update_username":null,"unit_code":"0001000900220008"},"post":{"id":1,"pym":"k","sjzx_update_time":null,"sjzx_update_useruuid":null,"name":"空","sjzx_create_username":null,"code":null,"sjzx_create_useruuid":null,"sjzx_create_time":"2017-06-12 11:07:50","deleted":0,"gzl_type":null,"sjzx_update_username":null,"unit_code":null},"department":{"department4code":"0001000900220008","department1safeovertime":null,"departmenttype":11,"department1type":null,"department2type":5,"departmentpid":3862,"department1name":"沈阳铁路局","department3id":3862,"fullname":"沈阳铁路局-运输处-沈阳车务段-安全科","department2riskctrlcode":"CW","department4id":3870,"departmentcode":"0001000900220008","department4riskctrlcode":null,"department2id":195,"departmentid":3870,"departmentlevel":4,"department1code":"0001","department4safeovertime":null,"list":[{"pym":"aqk","dbm":null,"class_name":null,"type":11,"cognizance_user_id":null,"class_select":0,"id":3870,"level":4,"name":"安全科","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220008","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null},{"pym":"sycwd","dbm":null,"class_name":null,"type":1,"cognizance_user_id":null,"class_select":0,"id":3862,"level":3,"name":"沈阳车务段","response_user_id":263023,"safe_overtime":2400,"equdepartment":0,"leader_user_id":45402,"property":null,"pid":195,"available":1,"code":"000100090022","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":null,"problem_auto_audot":1,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":219160,"start_date":null},{"pym":"ysc","dbm":null,"class_name":null,"type":5,"cognizance_user_id":null,"class_select":0,"id":195,"level":2,"name":"运输处","response_user_id":100,"safe_overtime":null,"equdepartment":0,"leader_user_id":264923,"property":null,"pid":1,"available":1,"code":"00010009","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":"CW","class_id":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":null,"start_date":null},{"pym":"sytlj","dbm":null,"class_name":null,"type":null,"cognizance_user_id":null,"class_select":0,"id":1,"level":1,"name":"沈阳铁路局","response_user_id":335,"safe_overtime":null,"equdepartment":0,"leader_user_id":335,"property":null,"pid":0,"available":2,"code":"0001","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":"A","class_id":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null}],"department4name":"安全科","departmentname":"安全科","department3code":"000100090022","department1id":1,"department2safeovertime":null,"departmentriskctrlcode":null,"department2code":"00010009","departmentsafeovertime":null,"department3name":"沈阳车务段","fullname1":"沈阳车务段-安全科","department3type":1,"department2name":"运输处","department1riskctrlcode":"A","department4type":11,"department3safeovertime":2400,"department3riskctrlcode":null},"loginCount":6464,"password":null,"id":189516,"department2Code":"00010009","token":"098CDE226D8638E59D8727C5AA738F21","positionId":3877,"name":"沈阳车务段管理员","userLevel":3,"fullDepartmentName":"沈阳铁路局-运输处-沈阳车务段-安全科","assessMonth":"2017-07","departmentId":3870,"departmentCode":"0001000900220008","fullDepartmentName1":"沈阳车务段-安全科","user":{"birth":"20170124","dept_name4":"安全科","dept_name3":"沈阳车务段","sso_uuid":"9BCA50CE85854539BAD347B10643AC9E","leader_type":1,"quan_post_name":"测试日勤岗","bzb":0,"dept_full_name":"沈阳铁路局-运输处-沈阳车务段-安全科","dept_name7":null,"laid_off_time":null,"dept_name5":null,"dept_name6":null,"ctc":0,"dept_code7":null,"dept_code6":null,"user_type_name":"在岗工作","dept_code5":null,"seniority1":null,"dept_code4":"0001000900220008","dept_code3":"000100090022","pm":0,"isshangbao":"0","position":3877,"dt":0,"fhy":0,"sys":0,"lw":0,"zdz":0,"is_leadership":1,"start_work_date":"20370124","dept_id":3870,"dg":0,"token":"098CDE226D8638E59D8727C5AA738F21","ccsj":0,"position_duty":null,"dept_cwd_or_stn_name":"沈阳车务段","dept_station_code":null,"post":1,"dept_station_name":null,"technical_level":null,"labor":null,"dept_cwd_or_stn_code":"000100090022","feeling":null,"login_name":"admin-sycwd","user_type_id":1,"lzh":"189516","cb":0,"card_number":null,"tel":null,"tf":0,"quan_post_id":104,"type":0,"remark1":null,"remark3":null,"remark2":null,"is_leader":0,"gender":1,"inbox_do_sort":"SEND_USER1","dept_cwd_name":"沈阳车务段","seniority":1,"post_name":"空","dc":0,"technical_level_name":null,"jsj":0,"dept_code":"0001000900220008","leader_type_name":"专业技术","key_person_mark":0,"6502":0,"deleted":0,"position_name":"工程师","email":null,"dept_cwd_code":"000100090022","create_time":"2017-01-24 23:37:14","work_experience":null,"ch":0,"zg":0,"pym":"sycwdgly","zb":0,"cert_id":null,"cancel_status":0,"hj":0,"dept_type":11,"id_card":"admin-sycwd","last_login_ip":null,"education":"本科","ljy":0,"id":189516,"name":"沈阳车务段管理员","sso_app_name":null,"outbox_do_sort":"CREATE_DATE2","ethnic":null,"political":null,"working_time":null,"last_login_time":"2017-07-26 11:19:42","yb":0,"photo":null,"dcz":0,"login_count":6464},"departmentType2":5,"lastLoginTime":"2017-07-26"}
     * base : http://223.100.3.171:10007/
     * list : [{"birth":"19710228","dept_name4":"领导班子","dept_name3":"沈阳车务段","sso_uuid":"46FB49C3EBB14B25850ADB375F8BA18A","leader_type":4,"quan_post_name":null,"bzb":0,"dept_full_name":"沈阳铁路局-运输处-沈阳车务段-领导班子","dept_name7":null,"laid_off_time":null,"dept_name5":null,"dept_name6":null,"ctc":0,"dept_code7":null,"dept_code6":null,"user_type_name":"在岗工作","dept_code5":null,"seniority1":25,"dept_code4":"0001000900220001","dept_code3":"000100090022","pm":0,"isshangbao":"0","position":3882,"dt":0,"fhy":0,"sys":0,"lw":0,"zdz":0,"is_leadership":1,"start_work_date":"19910228","dept_id":3863,"dg":0,"token":null,"ccsj":0,"position_duty":null,"dept_cwd_or_stn_name":"沈阳车务段","dept_station_code":null,"post":1,"dept_station_name":null,"technical_level":null,"labor":"日","dept_cwd_or_stn_code":"000100090022","feeling":null,"login_name":"210621197203244773","user_type_id":1,"lzh":"219479","cb":0,"card_number":null,"tel":null,"tf":0,"quan_post_id":null,"type":0,"remark1":null,"password":"C4CA4238A0B923820DCC509A6F75849B","remark3":null,"remark2":null,"is_leader":0,"gender":1,"inbox_do_sort":"0","dept_cwd_name":"沈阳车务段","seniority":46,"post_name":"空","dc":0,"technical_level_name":null,"jsj":0,"dept_code":"0001000900220001","leader_type_name":"党群","key_person_mark":0,"6502":0,"deleted":0,"position_name":"纪委书记","email":null,"dept_cwd_code":"000100090022","create_time":"2017-01-30 18:02:06","work_experience":"1989.09\u20141993.08 齐齐哈尔铁路工程学校物资管理专业学习\r\n1993.08\u20141995.01 沈阳铁路局丹东分局丹东列车段见习生\r\n1995.01\u20141995.05 沈阳铁路局丹东分局丹东列车段团委干事\r\n1995.05\u20141998.08 沈阳铁路局丹东分局丹东列车段团委副书记（1995.05股级，丹列党干字[1995]11号）\r\n1998.08\u20142003.09 沈阳铁路局丹东分局丹东列车段团委书记（1998.08副科级，丹列干字（1998）9号）（其间：1998.09－2002.07北方交通大学铁道运输专业在职学习，取得大专学历；2000.08－2002.08在北方交通大学铁道运输专业自学考试，取得大学学历）\r\n2003.09\u20142005.09 沈阳铁路局沈阳客运段丹东列车段客运车队党支部书记\r\n2005.09\u20142006.03 沈阳铁路局沈阳客运段丹东乘务所客运车队党支部书记\r\n2006.03\u20142007.10 沈阳铁路局沈阳客运段客运八队党总支书记兼副队长（丹东）\r\n2007.10\u20142008.04 沈阳铁路局沈阳客运段客运八队党总支书记兼副队长，兼聘助理政工师\r\n2008.04\u20142009.07 沈阳铁路局沈阳客运段丹东旅服车间党支部书记兼副主任兼政工师（2008.04正科级，沈客党岗[2008]21号）\r\n2009.07\u20142009.12 沈阳铁路局沈阳客运段客运六队党总支书记兼副队长兼政工师\r\n2009.12\u20142010.12 沈阳铁路局沈阳客运段客运六队队长兼党总支副书记\r\n2010.12\u20142011.03 沈阳铁路局沈阳客运段客运六队队长兼党总支副书记兼助理工程师\r\n2011.03\u20142011.05 沈阳铁路局沈阳沈铁房地产开发集团有限责任公司技术安全部部长兼聘助理工程师\r\n2011.05\u20142011.09 沈阳铁路局沈阳沈铁房地产开发集团有限责任公司兴城疗养院副院长兼聘助理工程师\r\n2011.09\u20142012.06 沈阳铁路局沈阳沈铁房地产开发集团有限责任公司山海关铁道车辆培训中心主任兼党总支副书记（2011.09副处级，沈铁聘机［2011］371号）\r\n2012.06\u20142013.05 沈阳铁路局鞍山直属集团公司副总经理\r\n2013.05\u20142015.02 沈阳铁路局鞍山货运中心副总经理\r\n2015.02\u2014　　　　沈阳车务段党委副书记、纪委书记兼政工师\r\n","ch":0,"zg":0,"pym":"gs","zb":0,"cert_id":null,"cancel_status":0,"hj":0,"dept_type":4,"id_card":"210621197203244773","last_login_ip":null,"education":"本科","ljy":0,"id":219479,"name":"高松","sso_app_name":null,"outbox_do_sort":"0","ethnic":"汉族","political":"党员","working_time":null,"last_login_time":"2017-06-12 20:24:12","yb":0,"photo":null,"dcz":0,"login_count":578},{"birth":"19650313","dept_name4":"领导班子","dept_name3":"沈阳车务段","sso_uuid":"1B157CFEF0E84B9C985B4DFB1FB1B20C","leader_type":2,"quan_post_name":null,"bzb":0,"dept_full_name":"沈阳铁路局-运输处-沈阳车务段-领导班子","dept_name7":null,"laid_off_time":null,"dept_name5":null,"dept_name6":null,"ctc":0,"dept_code7":null,"dept_code6":null,"user_type_name":"在岗工作","dept_code5":null,"seniority1":35,"dept_code4":"0001000900220001","dept_code3":"000100090022","pm":0,"isshangbao":"0","position":3871,"dt":0,"fhy":0,"sys":0,"lw":0,"zdz":0,"is_leadership":1,"start_work_date":"19850313","dept_id":3863,"dg":0,"token":null,"ccsj":0,"position_duty":null,"dept_cwd_or_stn_name":"沈阳车务段","dept_station_code":null,"post":1,"dept_station_name":null,"technical_level":null,"labor":"日","dept_cwd_or_stn_code":"000100090022","feeling":null,"login_name":"210114196503131230","user_type_id":1,"lzh":"219506","cb":0,"card_number":null,"tel":null,"tf":0,"quan_post_id":null,"type":0,"remark1":null,"password":"C4CA4238A0B923820DCC509A6F75849B","remark3":null,"remark2":null,"is_leader":0,"gender":1,"inbox_do_sort":"READ_STATUS2","dept_cwd_name":"沈阳车务段","seniority":53,"post_name":"空","dc":0,"technical_level_name":null,"jsj":0,"dept_code":"0001000900220001","leader_type_name":"行管","key_person_mark":0,"6502":0,"deleted":0,"position_name":"副段长","email":null,"dept_cwd_code":"000100090022","create_time":"2017-01-30 18:02:07","work_experience":"1983.12\u20141984.07 沈阳铁路局沈阳分局大成站练习生\r\n1984.07\u20141989.06 沈阳铁路局沈阳分局沈阳西站练习生\r\n1989.06\u20141993.10 沈阳铁路局沈阳分局沈阳西站运转车间驼峰值班员\r\n1993.10\u20141994.01 沈阳铁路局沈阳分局沈阳西站运转车间值班站长\r\n1994.01\u20141996.04 沈阳铁路局沈阳分局沈阳西站运转车间副主任\r\n1996.04\u20141996.11 沈阳铁路局沈阳分局沈阳西站运转车间代理主任\r\n1996.11\u20142003.03 沈阳铁路局沈阳分局沈阳西站运转车间主任（其间：1996.09--1999.06中央党校函授学院经济管理专业在职学习，取得中央党校大专学历）\r\n2003.03\u20142013.03 沈阳铁路局沈阳分局沈阳西站副站长（2003.03正科级，沈铁分聘领字［2003］1号）（2007.03副处级，沈铁聘领［2007］202号）\r\n2013.03\u2014　　　　沈阳铁路局沈阳车务段副段长\r\n","ch":0,"zg":0,"pym":"hjs","zb":0,"cert_id":null,"cancel_status":0,"hj":0,"dept_type":4,"id_card":"210114196503131230","last_login_ip":null,"education":"大专","ljy":0,"id":219506,"name":"回金山","sso_app_name":null,"outbox_do_sort":"0","ethnic":"回族","political":"党员","working_time":null,"last_login_time":"2017-07-14 16:18:25","yb":0,"photo":null,"dcz":0,"login_count":949},{"birth":"19620105","dept_name4":"领导班子","dept_name3":"沈阳车务段","sso_uuid":"E661993EA9B848CB9F79D045F1210FFD","leader_type":4,"quan_post_name":"测试岗位001","bzb":0,"dept_full_name":"沈阳铁路局-运输处-沈阳车务段-领导班子","dept_name7":null,"laid_off_time":null,"dept_name5":null,"dept_name6":null,"ctc":0,"dept_code7":null,"dept_code6":null,"user_type_name":"在岗工作","dept_code5":null,"seniority1":35,"dept_code4":"0001000900220001","dept_code3":"000100090022","pm":0,"isshangbao":"0","position":3866,"dt":0,"fhy":0,"sys":0,"lw":0,"zdz":0,"is_leadership":1,"start_work_date":"19820105","dept_id":3863,"dg":0,"token":null,"ccsj":0,"position_duty":null,"dept_cwd_or_stn_name":"沈阳车务段","dept_station_code":null,"post":1,"dept_station_name":null,"technical_level":null,"labor":"日","dept_cwd_or_stn_code":"000100090022","feeling":null,"login_name":"210402196201054111","user_type_id":1,"lzh":"219481","cb":0,"card_number":null,"tel":null,"tf":0,"quan_post_id":42,"type":0,"remark1":null,"password":"C4CA4238A0B923820DCC509A6F75849B","remark3":null,"remark2":null,"is_leader":0,"gender":1,"inbox_do_sort":"0","dept_cwd_name":"沈阳车务段","seniority":56,"post_name":"空","dc":0,"technical_level_name":null,"jsj":0,"dept_code":"0001000900220001","leader_type_name":"党群","key_person_mark":0,"6502":0,"deleted":0,"position_name":"党委副书记","email":null,"dept_cwd_code":"000100090022","create_time":"2017-01-30 18:02:06","work_experience":"1979.08\u20141983.08 北方交通大学起重运输机械专业学习\r\n1983.08\u20141984.08 沈阳铁路局沈阳分局抚顺车务段见习生\r\n1984.08\u20141986.12 沈阳铁路局沈阳分局抚顺车务段工程技术干部\r\n1986.12\u20141988.11 沈阳铁路局沈阳分局抚顺车务段助理工程师\r\n1988.11\u20141989.12 沈阳铁路局沈阳分局抚顺车务段装卸管理室助理工程师\r\n1989.12\u20141995.12 沈阳铁路局沈阳分局抚顺车务段装卸管理室工程师\r\n1995.12\u20141998.03 沈阳铁路局沈阳分局章党站副站长\r\n1998.03\u20142000.09 沈阳铁路局沈阳分局抚顺车务段段长助理\r\n2000.09\u20142003.08 沈阳铁路局沈阳分局抚顺车务段副段长\r\n　　　　　　　　 （2000.09正科级，沈铁分任领字[2000]125号）\r\n2003.08\u20142005.07 沈阳铁路局沈阳分局沈阳车务段副段长\r\n2005.07\u20142005.12 沈阳铁路局沈阳车务段副段长\r\n2005.12\u20142007.03 沈阳铁路局沈阳车务段客货管理科科长\r\n2007.03\u20142007.11 沈阳铁路局装卸作业管理所主任助理\r\n2007.11\u20142008.06 沈阳铁路局装卸作业管理所副主任\r\n　　　　　　　　 （2007.11副处级，沈铁聘领[2007]734号）\r\n2008.06\u20142013.05 沈阳铁路局沈阳沈铁装卸有限责任公司副总经理\r\n2013.05\u20142016.12 沈阳铁路局苏家屯站副站长\r\n2016.12\u2014　　　　沈阳铁路局沈阳车务段党委副书记\r\n","ch":0,"zg":0,"pym":"hyj","zb":0,"cert_id":null,"cancel_status":0,"hj":0,"dept_type":4,"id_card":"210402196201054111","last_login_ip":null,"education":"本科","ljy":0,"id":219481,"name":"华玉江","sso_app_name":null,"outbox_do_sort":"0","ethnic":"汉族","political":"党员","working_time":null,"last_login_time":"2017-07-21 09:51:15","yb":0,"photo":null,"dcz":0,"login_count":543},{"birth":"19720315","dept_name4":"领导班子","dept_name3":"沈阳车务段","sso_uuid":"98ADC9C3A1EB4B9B8238A9A32F21B1ED","leader_type":2,"quan_post_name":null,"bzb":0,"dept_full_name":"沈阳铁路局-运输处-沈阳车务段-领导班子","dept_name7":null,"laid_off_time":null,"dept_name5":null,"dept_name6":null,"ctc":0,"dept_code7":null,"dept_code6":null,"user_type_name":"在岗工作","dept_code5":null,"seniority1":26,"dept_code4":"0001000900220001","dept_code3":"000100090022","pm":0,"isshangbao":"0","position":3902,"dt":0,"fhy":0,"sys":0,"lw":0,"zdz":0,"is_leadership":1,"start_work_date":"19920315","dept_id":3863,"dg":0,"token":null,"ccsj":0,"position_duty":null,"dept_cwd_or_stn_name":"沈阳车务段","dept_station_code":null,"post":1,"dept_station_name":null,"technical_level":null,"labor":"日","dept_cwd_or_stn_code":"000100090022","feeling":null,"login_name":"211222197206150233","user_type_id":1,"lzh":"219502","cb":0,"card_number":null,"tel":null,"tf":0,"quan_post_id":null,"type":0,"remark1":null,"password":"C4CA4238A0B923820DCC509A6F75849B","remark3":null,"remark2":null,"is_leader":0,"gender":1,"inbox_do_sort":"INBOX_CREATE_DATE2","dept_cwd_name":"沈阳车务段","seniority":46,"post_name":"空","dc":0,"technical_level_name":null,"jsj":0,"dept_code":"0001000900220001","leader_type_name":"行管","key_person_mark":0,"6502":0,"deleted":0,"position_name":"总会计师","email":null,"dept_cwd_code":"000100090022","create_time":"2017-01-30 18:02:07","work_experience":"1990.09\u20141992.07 吉林铁路经济学校计划统计专业学习\r\n1992.07\u20141993.09 沈阳铁路局沈阳分局开原站运转车间学习车号员\r\n1993.09\u20141993.10 沈阳铁路局沈阳分局开原站运转车间车号员\r\n1993.10\u20141995.03 沈阳铁路局沈阳分局昌图站车号员\r\n1995.03\u20141996.01 沈阳铁路局沈阳分局昌图车务段财务室会计员\r\n1996.01\u20141999.01 沈阳铁路局沈阳分局图车务段财务室主任（其间：1997.08-2000.06在中央党校函授学院经济管理专业在职学习，取得中央党校大专学历）\r\n1999.01\u20142001.03 沈阳铁路局沈阳分局图车务段财务室主任兼助理会计师\r\n2001.03\u20142003.09 沈阳铁路局沈阳分局铁岭车务段昌图磷脂饲料厂财务主任（2001.03股级，铁车人干字[2001]20号）\r\n2003.09\u20142004.03 沈阳铁路局沈阳分局铁岭车务段运输服务处财务室副主任\r\n2004.03\u20142005.07 沈阳铁路局沈阳分局铁岭车务段财务室副主任\r\n2005.07\u20142005.11 沈阳铁路局沈阳车务段计划财务科助理会计师\r\n2005.11\u20142007.11 沈阳铁路局沈阳车务段计划财务科科长（2005.11副科级，沈车干聘[2005]1000号）（其间：在北京交通大学铁道财务会计专业在职学习，取得大学学历）\r\n2007.11\u20142008.06 沈阳铁路局沈阳车务段计划财务科科长兼会计师\r\n2008.06\u20142013.02 沈阳铁路局沈阳车务段计划财务科科长（2008.06正科级，沈车劳人资字[2008]第57号）\r\n2013.02\u20142013.02 沈阳铁路局沈阳车务段总会计师（2013.02副处级，沈铁聘领[2013]311号）\r\n2013.02\u2014　　　　沈阳铁路局沈阳车务段总会计师兼高级会计师\r\n","ch":0,"zg":0,"pym":"ldc","zb":0,"cert_id":null,"cancel_status":0,"hj":0,"dept_type":4,"id_card":"211222197206150233","last_login_ip":null,"education":"本科","ljy":0,"id":219502,"name":"刘德成","sso_app_name":null,"outbox_do_sort":"0","ethnic":"汉族","political":"党员","working_time":null,"last_login_time":"2017-06-13 08:59:59","yb":0,"photo":null,"dcz":0,"login_count":687},{"birth":"19720703","dept_name4":"领导班子","dept_name3":"沈阳车务段","sso_uuid":"FF7F3FA8CEE24DC79288C41A7DDBC58C","leader_type":2,"quan_post_name":null,"bzb":0,"dept_full_name":"沈阳铁路局-运输处-沈阳车务段-领导班子","dept_name7":null,"laid_off_time":null,"dept_name5":null,"dept_name6":null,"ctc":0,"dept_code7":null,"dept_code6":null,"user_type_name":"在岗工作","dept_code5":null,"seniority1":24,"dept_code4":"0001000900220001","dept_code3":"000100090022","pm":0,"isshangbao":"0","position":3871,"dt":0,"fhy":0,"sys":0,"lw":0,"zdz":0,"is_leadership":1,"start_work_date":"19920703","dept_id":3863,"dg":0,"token":null,"ccsj":0,"position_duty":null,"dept_cwd_or_stn_name":"沈阳车务段","dept_station_code":null,"post":1,"dept_station_name":null,"technical_level":null,"labor":"日","dept_cwd_or_stn_code":"000100090022","feeling":null,"login_name":"210105197207032818","user_type_id":1,"lzh":"219503","cb":0,"card_number":null,"tel":null,"tf":0,"quan_post_id":null,"type":0,"remark1":null,"password":"C4CA4238A0B923820DCC509A6F75849B","remark3":null,"remark2":null,"is_leader":0,"gender":1,"inbox_do_sort":"INBOX_CREATE_DATE2","dept_cwd_name":"沈阳车务段","seniority":46,"post_name":"空","dc":0,"technical_level_name":null,"jsj":0,"dept_code":"0001000900220001","leader_type_name":"行管","key_person_mark":0,"6502":0,"deleted":0,"position_name":"副段长","email":null,"dept_cwd_code":"000100090022","create_time":"2017-01-30 18:02:07","work_experience":"1990.09\u20141994.07 上海铁道学院铁道运输专业学习\r\n1994.08\u20141995.08 沈阳铁路局沈阳分局沈阳车务段见习生\r\n1995.08\u20141996.11 沈阳铁路局沈阳分局沈阳车务段助理工程师\r\n1996.11\u20141997.05 沈阳铁路局沈阳分局沈阳车务段技术室助理工程师\r\n1997.05\u20141999.04 沈阳铁路局沈阳分局沈阳车务段电子计算室助理工程师\r\n1999.04\u20141999.12 沈阳铁路局沈阳分局沈阳车务段虎石台站站长\r\n1999.12\u20142000.10 沈阳铁路局沈阳分局沈阳车务段虎石台站站长兼聘工程师\r\n2000.10\u20142003.06 沈阳铁路局沈阳分局沈阳车务段安全路风监察室工程师\r\n2003.06\u20142003.08 沈阳铁路局秦沈铁路管理处运营调度室工程师\r\n2003.08\u20142004.12 沈阳铁路局沈阳分局沈阳车务段综合业务室主任\r\n2004.12\u20142005.07 沈阳铁路局沈阳铁路分局本溪车务段段长助理\r\n2005.07\u20142006.06 沈阳铁路局本溪车务段技术科代理科长\r\n2006.06\u20142006.11 沈阳铁路局本溪车务段段长助理\r\n2006.11\u20142007.03 沈阳铁路局本溪车务段段长助理兼聘高级工程师\r\n2007.03\u20142009.04 沈阳铁路局本溪车务段段长助理（2007.03正科级，沈铁聘领[2007]219号）（其间：2007.05-2009.04沈阳铁路局本溪车务段本溪站副站长挂职锻炼）\r\n2009.04\u20142011.09 沈阳铁路局本溪车务段副段长兼高级工程师（2009.04副处级，沈铁聘领[2009]204号）\r\n2011.09\u2014　　　　沈阳铁路局沈阳车务段副段长\r\n","ch":0,"zg":0,"pym":"lj","zb":0,"cert_id":null,"cancel_status":0,"hj":0,"dept_type":4,"id_card":"210105197207032818","last_login_ip":null,"education":"本科","ljy":0,"id":219503,"name":"李健","sso_app_name":null,"outbox_do_sort":"0","ethnic":"汉族","political":"党员","working_time":null,"last_login_time":"2017-06-13 08:35:54","yb":0,"photo":null,"dcz":0,"login_count":867},{"birth":"19630704","dept_name4":"领导班子","dept_name3":"沈阳车务段","sso_uuid":"723DBFC4A34442A6B7E61BA2013441A4","leader_type":4,"quan_post_name":null,"bzb":0,"dept_full_name":"沈阳铁路局-运输处-沈阳车务段-领导班子","dept_name7":null,"laid_off_time":null,"dept_name5":null,"dept_name6":null,"ctc":0,"dept_code7":null,"dept_code6":null,"user_type_name":"在岗工作","dept_code5":null,"seniority1":37,"dept_code4":"0001000900220001","dept_code3":"000100090022","pm":0,"isshangbao":"0","position":3907,"dt":0,"fhy":0,"sys":0,"lw":0,"zdz":0,"is_leadership":1,"start_work_date":"19830704","dept_id":3863,"dg":0,"token":null,"ccsj":0,"position_duty":null,"dept_cwd_or_stn_name":"沈阳车务段","dept_station_code":null,"post":1,"dept_station_name":null,"technical_level":null,"labor":"日","dept_cwd_or_stn_code":"000100090022","feeling":null,"login_name":"210102196203045394","user_type_id":1,"lzh":"219480","cb":0,"card_number":null,"tel":null,"tf":0,"quan_post_id":null,"type":0,"remark1":null,"password":"C4CA4238A0B923820DCC509A6F75849B","remark3":null,"remark2":null,"is_leader":0,"gender":1,"inbox_do_sort":"TYPE1","dept_cwd_name":"沈阳车务段","seniority":56,"post_name":"空","dc":0,"technical_level_name":null,"jsj":0,"dept_code":"0001000900220001","leader_type_name":"党群","key_person_mark":0,"6502":0,"deleted":0,"position_name":"工会主席","email":null,"dept_cwd_code":"000100090022","create_time":"2017-01-30 18:02:06","work_experience":"1981.11\u20141983.02 沈阳铁路局沈阳分局皇姑屯站学习扳道员、扳道员\r\n1984.11\u20141985.02 沈阳铁路局沈阳分局皇姑屯站团委书记\r\n1985.02\u20141986.11 沈阳铁路局沈阳分局办公室值班干事\r\n1986.11\u20141990.07 沈阳铁路局沈阳分局办公室主任干事\r\n1990.07\u20141997.10 沈阳铁路局沈阳分局办公室秘书（其间：1988.09－1991.06在中央党校经济管理专业在职学习，取得中央党校大专学历）\r\n1997.10\u20141998.07 沈阳铁路局沈阳分局沈阳车务段段长助理\r\n1998.07\u20142001.01 沈阳铁路局沈阳分局沈阳车务段副段长（1998.07正科级，沈铁分任领字[98]152号）\r\n2001.06\u20142007.03 沈阳铁路局沈阳分局沈阳车务段副段长兼聘助理工程师（其间：2000.09－2002.12在中央党校经济管理专业在职学习，取得中央党校大学学历）\r\n2007.03\u20142007.09 沈阳铁路局沈阳车务段副段长（2007.03副处级，沈铁聘领[2007]214号）\r\n2007.09\u20142015.02 沈阳铁路局沈阳车务段党委副书记、纪委书记（其间：2005.07－2009.09在北方交通大学铁道运输专业在职学习，取得大学学历）\r\n2015.02\u2014　　　　沈阳铁路局沈阳车务段党委副书记、工会主席\r\n","ch":0,"zg":0,"pym":"lzg","zb":0,"cert_id":null,"cancel_status":0,"hj":0,"dept_type":4,"id_card":"210102196203045394","last_login_ip":null,"education":"本科","ljy":0,"id":219480,"name":"李志刚","sso_app_name":null,"outbox_do_sort":"0","ethnic":"回族","political":"党员","working_time":null,"last_login_time":"2017-06-12 19:38:04","yb":0,"photo":null,"dcz":0,"login_count":927},{"birth":"19801212","dept_name4":"领导班子","dept_name3":"沈阳车务段","sso_uuid":"EBA4096A0028437FBDBECA8A40C713B6","leader_type":2,"quan_post_name":null,"bzb":0,"dept_full_name":"沈阳铁路局-运输处-沈阳车务段-领导班子","dept_name7":null,"laid_off_time":null,"dept_name5":null,"dept_name6":null,"ctc":0,"dept_code7":null,"dept_code6":null,"user_type_name":"在岗工作","dept_code5":null,"seniority1":14,"dept_code4":"0001000900220001","dept_code3":"000100090022","pm":0,"isshangbao":"0","position":3871,"dt":0,"fhy":0,"sys":0,"lw":0,"zdz":0,"is_leadership":1,"start_work_date":"20001212","dept_id":3863,"dg":0,"token":null,"ccsj":0,"position_duty":null,"dept_cwd_or_stn_name":"沈阳车务段","dept_station_code":null,"post":1,"dept_station_name":null,"technical_level":null,"labor":"日","dept_cwd_or_stn_code":"000100090022","feeling":null,"login_name":"210105198012124012","user_type_id":1,"lzh":"219505","cb":0,"card_number":null,"tel":null,"tf":0,"quan_post_id":null,"type":0,"remark1":null,"password":"C4CA4238A0B923820DCC509A6F75849B","remark3":null,"remark2":null,"is_leader":0,"gender":1,"inbox_do_sort":"TAGNUMBER2","dept_cwd_name":"沈阳车务段","seniority":38,"post_name":"空","dc":0,"technical_level_name":null,"jsj":0,"dept_code":"0001000900220001","leader_type_name":"行管","key_person_mark":0,"6502":0,"deleted":0,"position_name":"副段长","email":null,"dept_cwd_code":"000100090022","create_time":"2017-01-30 18:02:07","work_experience":"2000.09\u20142004.07 北方交通大学交通运输学院光信息科学与技术专业学习\r\n2004.07\u20142005.08 沈阳铁路局沈阳分局沈阳车务段见习生\r\n2005.08\u20142006.06 沈阳铁路局沈阳车务段文官屯站值班站长（岗位锻炼）\r\n2006.06\u20142006.07 沈阳铁路局沈阳车务段虎石台站值班站长（岗位锻炼）\r\n2006.07\u20142007.09 沈阳铁路局沈阳车务段瓢儿屯站副站长\r\n2007.09\u20142007.11 沈阳铁路局沈阳车务段抚顺站副站长\r\n2007.11\u20142008.03 沈阳铁路局沈阳车务段抚顺城站站长\r\n2008.03\u20142010.12 沈阳铁路局沈阳车务段段长助理\r\n　　　　　　　　 （2008.03正科级，沈铁聘领[2008]90号）\r\n　　　　　　　　 （其间：2008.04－2008.05在沈阳铁路局沈阳车务段抚顺城站站长岗位挂职锻炼；2008.05－2010.12在沈阳铁路局沈阳车务段开原站站长挂职锻炼；2010.05－2010.11在吉林大学千名后备干部班培训）\r\n2010.12\u20142013.05 沈阳铁路局四平站总工程师\r\n　　　　　　　　 （2010.12副处级，沈铁聘领[2010]447号）\r\n2013.05\u2014　　　　沈阳铁路局沈阳车务段副段长（201009-201401北京交通大学交通运输规划与管理专业在职学习，取得硕士研究生学历）\r\n","ch":0,"zg":0,"pym":"sc","zb":0,"cert_id":null,"cancel_status":0,"hj":0,"dept_type":4,"id_card":"210105198012124012","last_login_ip":null,"education":"硕士研究生","ljy":0,"id":219505,"name":"孙驰","sso_app_name":null,"outbox_do_sort":"0","ethnic":"汉族","political":"党员","working_time":null,"last_login_time":"2017-06-13 08:20:53","yb":0,"photo":null,"dcz":0,"login_count":573},{"birth":"19720520","dept_name4":"领导班子","dept_name3":"沈阳车务段","sso_uuid":"56071B01E1DD4F1F925A633A1ED70F0D","leader_type":4,"quan_post_name":null,"bzb":0,"dept_full_name":"沈阳铁路局-运输处-沈阳车务段-领导班子","dept_name7":null,"laid_off_time":null,"dept_name5":null,"dept_name6":null,"ctc":0,"dept_code7":null,"dept_code6":null,"user_type_name":"在岗工作","dept_code5":null,"seniority1":24,"dept_code4":"0001000900220001","dept_code3":"000100090022","pm":0,"isshangbao":"0","position":3868,"dt":0,"fhy":0,"sys":0,"lw":0,"zdz":0,"is_leadership":1,"start_work_date":"19920520","dept_id":3863,"dg":0,"token":null,"ccsj":0,"position_duty":null,"dept_cwd_or_stn_name":"沈阳车务段","dept_station_code":null,"post":1,"dept_station_name":null,"technical_level":null,"labor":"日","dept_cwd_or_stn_code":"000100090022","feeling":null,"login_name":"220324197205201819","user_type_id":1,"lzh":"219478","cb":0,"card_number":null,"tel":null,"tf":0,"quan_post_id":null,"type":0,"remark1":null,"password":"C4CA4238A0B923820DCC509A6F75849B","remark3":null,"remark2":null,"is_leader":0,"gender":1,"inbox_do_sort":"INBOX_CREATE_DATE2","dept_cwd_name":"沈阳车务段","seniority":46,"post_name":"空","dc":0,"technical_level_name":null,"jsj":0,"dept_code":"0001000900220001","leader_type_name":"党群","key_person_mark":0,"6502":0,"deleted":0,"position_name":"党委书记","email":null,"dept_cwd_code":"000100090022","create_time":"2017-01-30 18:02:05","work_experience":"1990.09\u20141994.07 上海铁道学院铁道运输专业学习\r\n1994.08\u20141995.09 沈阳铁路局通辽分局郑家屯站实习生\r\n1995.09\u20141999.12 沈阳铁路局通辽分局郑家屯站助理工程师\r\n1999.12\u20142000.12 沈阳铁路局通辽分局郑家屯站工程师\r\n2000.12\u20142001.12 沈阳铁路局通辽分局办公室秘书\r\n2001.12\u20142002.12 沈阳铁路局通辽分局车务分处工程师\r\n2002.12\u20142004.04 沈阳铁路局通辽分局通辽站副站长（2002.12正科级，通铁分人干字[2002]第77号）\r\n2004.04\u20142005.12 沈阳铁路局通辽分局赤峰车务段副段长\r\n2005.12\u20142016.05 沈阳铁路局赤峰车务段副段长（2005.12副处级，沈铁聘领[2005]941号）（其间：2010.05－2010.11吉林大学千名后备干部班培训）\r\n2016.05\u20142016.12 沈阳铁路局赤峰车务段副段长（主持工作）\r\n2016.12\u20142017.01 沈阳铁路局赤峰车务段段长兼党委副书记\r\n　　　　　　　　 （2016.12正处级，沈铁聘领[2016]635号）\r\n2017.01\u2014　　　　沈阳铁路局沈阳车务段党委书记兼副段长\r\n","ch":0,"zg":0,"pym":"wyx","zb":0,"cert_id":null,"cancel_status":0,"hj":0,"dept_type":4,"id_card":"220324197205201819","last_login_ip":null,"education":"本科","ljy":0,"id":219478,"name":"万永欣","sso_app_name":null,"outbox_do_sort":"0","ethnic":"汉族","political":"党员","working_time":null,"last_login_time":"2017-06-13 06:53:39","yb":0,"photo":null,"dcz":0,"login_count":717},{"birth":"19730301","dept_name4":"领导班子","dept_name3":"沈阳车务段","sso_uuid":"8B1179E832BD48FE8F67E6E894701849","leader_type":2,"quan_post_name":null,"bzb":0,"dept_full_name":"沈阳铁路局-运输处-沈阳车务段-领导班子","dept_name7":null,"laid_off_time":null,"dept_name5":null,"dept_name6":null,"ctc":0,"dept_code7":null,"dept_code6":null,"user_type_name":"在岗工作","dept_code5":null,"seniority1":24,"dept_code4":"0001000900220001","dept_code3":"000100090022","pm":0,"isshangbao":"0","position":3870,"dt":0,"fhy":0,"sys":0,"lw":0,"zdz":0,"is_leadership":1,"start_work_date":"19930301","dept_id":3863,"dg":0,"token":null,"ccsj":0,"position_duty":null,"dept_cwd_or_stn_name":"沈阳车务段","dept_station_code":null,"post":1,"dept_station_name":null,"technical_level":null,"labor":"日","dept_cwd_or_stn_code":"000100090022","feeling":null,"login_name":"210106197303013015","user_type_id":1,"lzh":"219507","cb":0,"card_number":null,"tel":null,"tf":0,"quan_post_id":null,"type":0,"remark1":null,"password":"C4CA4238A0B923820DCC509A6F75849B","remark3":null,"remark2":null,"is_leader":0,"gender":1,"inbox_do_sort":"INBOX_CREATE_DATE2","dept_cwd_name":"沈阳车务段","seniority":44,"post_name":"空","dc":0,"technical_level_name":null,"jsj":0,"dept_code":"0001000900220001","leader_type_name":"行管","key_person_mark":0,"6502":0,"deleted":0,"position_name":"段长","email":null,"dept_cwd_code":"000100090022","create_time":"2017-01-30 18:02:07","work_experience":"1990.09\u20141994.08 锦州铁路运输学校铁道运输专业学习\r\n1994.08\u20141995.07 沈阳铁路局沈阳分局大官屯站见习生\r\n1995.07\u20141997.04 沈阳铁路局沈阳分局沈阳站制动员\r\n1997.04\u20141998.04 沈阳铁路局沈阳分局沈阳站办公室干事\r\n1998.04\u20141999.09 沈阳铁路局沈阳分局办公室主任干事（其间：1998.07--2000.07北方交通大学铁道运输专业在职学习，取得大专学历）\r\n1999.09\u20142003.06 沈阳铁路局沈阳分局办公室秘书（其间：2000.09--2003.12北京交通大学铁道运输专业在职学习，取得大学学历）\r\n2003.06\u20142005.04 沈阳铁路局沈阳分局办公室副主任（2003.06正科级，沈铁分聘领[2003]55号）\r\n2005.04\u20142006.05 沈阳铁路局沈阳北站副站长（2005.12副处级，沈铁聘领[2005]910号）\r\n2006.05\u20142009.02 沈阳铁路局沈阳站副站长\r\n2009.02\u20142010.12 沈阳铁路局灵山站站长兼党委副书记（2009.02正处级，沈铁聘领[2009]109号）\r\n2010.12\u20142012.01 沈阳铁路局鞍山车务段段长兼党委副书记\r\n2012.01\u20142013.02 沈阳铁路局长春车务段段长兼党委副书记\r\n2013.02\u20142013.05 沈阳铁路局沈阳西站站长兼党委副书记\r\n2013.05\u20142017.01 沈阳铁路局本溪货运中心总经理兼党委副书记（2011.09-2013.12辽宁大学公共管理专业在职学习，取得硕士研究生学历公共管理硕士学位）\r\n2017.01\u2014　　　　沈阳铁路局沈阳车务段段长兼党委副书记\r\n","ch":0,"zg":0,"pym":"zdf","zb":0,"cert_id":null,"cancel_status":0,"hj":0,"dept_type":4,"id_card":"210106197303013015","last_login_ip":null,"education":"硕士研究生","ljy":0,"id":219507,"name":"张德福","sso_app_name":null,"outbox_do_sort":"CREATE_DATE2","ethnic":"满族","political":"党员","working_time":null,"last_login_time":"2017-06-13 09:18:11","yb":0,"photo":null,"dcz":0,"login_count":653},{"birth":"19730628","dept_name4":"领导班子","dept_name3":"沈阳车务段","sso_uuid":"12AC690B8C6A4837A5DA928B31212915","leader_type":2,"quan_post_name":null,"bzb":0,"dept_full_name":"沈阳铁路局-运输处-沈阳车务段-领导班子","dept_name7":null,"laid_off_time":null,"dept_name5":null,"dept_name6":null,"ctc":0,"dept_code7":null,"dept_code6":null,"user_type_name":"在岗工作","dept_code5":null,"seniority1":22,"dept_code4":"0001000900220001","dept_code3":"000100090022","pm":0,"isshangbao":"0","position":3871,"dt":0,"fhy":0,"sys":0,"lw":0,"zdz":0,"is_leadership":1,"start_work_date":"19930628","dept_id":3863,"dg":0,"token":null,"ccsj":0,"position_duty":null,"dept_cwd_or_stn_name":"沈阳车务段","dept_station_code":null,"post":1,"dept_station_name":null,"technical_level":null,"labor":"日","dept_cwd_or_stn_code":"000100090022","feeling":null,"login_name":"211202197306281016","user_type_id":1,"lzh":"219504","cb":0,"card_number":null,"tel":null,"tf":0,"quan_post_id":null,"type":0,"remark1":null,"password":"C4CA4238A0B923820DCC509A6F75849B","remark3":null,"remark2":null,"is_leader":0,"gender":1,"inbox_do_sort":"TREATING_TYPE1","dept_cwd_name":"沈阳车务段","seniority":45,"post_name":"空","dc":0,"technical_level_name":null,"jsj":0,"dept_code":"0001000900220001","leader_type_name":"行管","key_person_mark":0,"6502":0,"deleted":0,"position_name":"副段长","email":null,"dept_cwd_code":"000100090022","create_time":"2017-01-30 18:02:07","work_experience":"1992.09\u20141996.08 兰州铁道学院铁道运输专业学习\r\n1996.08\u20141997.08 沈阳铁路局沈阳铁路分局铁岭车务段见习生\r\n1997.08\u20141997.08 沈阳铁路局沈阳铁路分局铁岭站运转在生产岗位锻炼助理工程师\r\n1997.08\u20142000.04 沈阳铁路局沈阳铁路分局铁岭车务段铁岭站技术室助理工程师\r\n2000.04\u20142001.12 沈阳铁路局沈阳铁路分局铁岭车务段新台子站副站长\r\n2001.12\u20142002.01 沈阳铁路局沈阳铁路分局铁岭车务段新台子站工程师\r\n2002.01\u20142004.03 沈阳铁路局沈阳铁路分局铁岭车务段平顶堡站站长兼工程师（2002.01股级，铁车人干字[2002]87号）\r\n2004.03\u20142004.05 沈阳铁路局沈阳铁路分局铁岭车务段开原站副站长兼工程师（2004.03副科级，铁车人字[2004]64号）\r\n2004.05\u20142004.10 沈阳铁路局沈阳铁路分局铁岭车务段开原站副站长、运转主任兼工程师\r\n2004.10\u20142005.06 沈阳铁路局沈阳铁路分局铁岭车务段新台子站站长\r\n2005.06\u20142005.06 沈阳铁路局沈阳车务段新台子站站长兼工程师\r\n2005.06\u20142006.04 沈阳铁路局沈阳车务段虎石台站站长\r\n2006.04\u20142007.11 沈阳铁路局沈阳车务段技术科科长兼工程师\r\n2007.11\u20142007.12 沈阳铁路局沈阳车务段铁岭站站长兼工程师（2007.11正科级，沈车干聘[2007]182号）\r\n2007.12\u20142008.01 沈阳铁路局沈阳车务段技术科工程师\r\n2008.01\u20142008.02 沈阳铁路局沈阳车务段技术科高级工程师\r\n2008.02\u20142008.06 沈阳铁路局沈阳车务段铁岭站站长\r\n2008.06\u20142009.04 沈阳铁路局沈阳车务段铁岭站站长兼工程师\r\n2009.04\u20142010.12 沈阳铁路局沈阳车务段安全路风监察科科长\r\n2010.12\u20142012.06 沈阳铁路局沈阳车务段大官屯站站长\r\n2012.06\u20142013.02 沈阳铁路局通化车务段段长助理\r\n2013.02\u2014　　　　沈阳铁路局沈阳车务段副段长（2013.02副处级，沈铁聘领[2013]208号）\r\n","ch":0,"zg":0,"pym":"zy","zb":0,"cert_id":null,"cancel_status":0,"hj":0,"dept_type":4,"id_card":"211202197306281016","last_login_ip":null,"education":"本科","ljy":0,"id":219504,"name":"张跃","sso_app_name":null,"outbox_do_sort":"0","ethnic":"汉族","political":"党员","working_time":null,"last_login_time":"2017-06-13 07:58:22","yb":0,"photo":null,"dcz":0,"login_count":769}]
     * permission : {"aqwtxdwh":1,"jjsb_khyx":1,"hywh":1,"ldyg_scl":1,"jjsb_lwkk":1,"gx_zgnxjdjkck":1,"xtgl":1,"gwgl":1,"khjjfgl":1,"bmkhdjsz1":1,"glzdgl":1,"zdgzsc":1,"view_basic_shop":1,"gx_yxjmxsb":1,"fxkzb":1,"gwfxdwh":1,"aqyhwh":1,"rygl":1,"bmqtkhsz":1,"gx_jjbtj":1,"jjsb_aqjy":1,"view_basic_show":1,"jjsz_khyx":1,"sbmcwh":1,"edit_safe_problem":1,"fqhd":1,"gx_nxjmxhz":1,"view_basic_equipment_check":1,"view_basic_book":1,"gx_bzzblr":1,"jjsb_zjxd":1,"view_basic_card":1,"jjsz_xmwh":1,"aqfxkzb":1,"gbkhsp":1,"edit_basic_czzby":1,"edit_basic_produce_target":1,"csxzwh":1,"equip_del":1,"hygl":1,"reset_password":1,"zdspwh":1,"gwwh":1,"khfsydj":1,"gbkhsz":1,"hylbwh":1,"edit_basic_equipment_check":1,"aqszgl":1,"glzdflgl":1,"qywhfb":1,"dwglwh":1,"jjsz_kpyx":1,"gjsjwh":1,"gxkh":1,"jsgzflwh":1,"jsdjgl":1,"jslxwh":1,"ythkhpdbsz":1,"ythkhsz":1,"jjsz_dlbs":1,"gx_kqcx":1,"view_basic_produce_target":1,"gx_nxjbb":1,"dbxxsc":1,"gbydykhb":1,"bzgzbzwh":1,"gx_lh":1,"khsz":1,"glzdwh":1,"hyxj":1,"lwwtkh":1,"gx_nxjmxsb":1,"jjsz_lwfh":1,"jjsz_ajcw":1,"view_basic_ctc":1,"gwfcfb":1,"jjsb_kpyx":1,"zmgl":1,"shlc_zfd":1,"gbkhbh":1,"safe_danger_approval":1,"jjsb_gbzb":1,"dbfb":1,"gx_jjblr":1,"gx_kqcx_all":1,"jjsb":1,"cwdfcwh":1,"gx_ybfgl":1,"fjtjgl":1,"edit_basic_czzbywh":1,"gx_gzxjspr":1,"gx_gzxjgl":1,"bmkhhz":1,"cwdfc":1,"jjsz_aqjy":1,"gx_kq":1,"hysz":1,"gx_wcbatj":1,"jjsb_zyxz":1,"qywhwh":1,"gx_kqfh":1,"lwwtzsxs":1,"gzllr":1,"awhzdgzwh":1,"db":1,"jjsz":1,"xwdt":1,"gx_lxjgl":1,"edit_basic_shop":1,"ythcxyqr":1,"edit_basic_team":1,"jsgl":1,"wtxzlxwh":1,"edit_basic_czzbygl":1,"glzdxj":1,"bmythkh":1,"view_basic_czzby":1,"gx_qdzblr":1,"aqyhsc":1,"ldscl":1,"edit_basic_equipment_construction":1,"cwdfcfb":1,"sbgyswh":1,"safe_problem_signed":1,"edit_basic_station":1,"fbfc":1,"jjsb_dlbs":1,"view_basic_equipment_construction":1,"gx_yxjmxhz":1,"ddgl":1,"stn_approval_dpzr":1,"szkhzq":1,"sgtzsz":1,"sbflwh":1,"shlc_jjfh":1,"sbwh":1,"qywh":1,"edit_basic_show":1,"jjsz_zyxz":1,"jcglfzxs":1,"jsgzgl":1,"dbwh":1,"gx_bzzbsh":1,"jjsb_ajcw":1,"bgtfb":1,"jsgzwh":1,"gx_lhgwgl":1,"ythkhpd":1,"bgtwh":1,"gx_gzsh":1,"wtxzlbwh":1,"gbqpfsz":1,"czglkh":1,"gx_lxjspr":1,"sbssbm":1,"jjsb_lwfh":1,"shlc_jjsh":1,"gx_wcbasp":1,"equip_view":1,"yhgl":1,"bmkhdjsz":1,"bcwh":1,"edit_basic_ctc":1,"bgt":1,"view_basic_station":1,"gx_sxbsj":1,"sbglbfwh":1,"view_basic_team":1,"edit_basic_card":1,"jsgzxj":1,"gx_ljsjwcnxjryqk":1,"gx_qdzbsh":1,"jjsz_gbzb":1,"shlc_jjsp":1,"gzl":1}
     */

    private AuthorizedUserBean authorizedUser;
    private String base;
    private PermissionBean permission;
    private List<?> moduleList;
    private List<ListBean> list;

    public AuthorizedUserBean getAuthorizedUser() {
        return authorizedUser;
    }

    public void setAuthorizedUser(AuthorizedUserBean authorizedUser) {
        this.authorizedUser = authorizedUser;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public PermissionBean getPermission() {
        return permission;
    }

    public void setPermission(PermissionBean permission) {
        this.permission = permission;
    }

    public List<?> getModuleList() {
        return moduleList;
    }

    public void setModuleList(List<?> moduleList) {
        this.moduleList = moduleList;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
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

    public static class AuthorizedUserBean {
        /**
         * position : {"id":3877,"pym":"gcs","sjzx_update_time":null,"sjzx_update_useruuid":null,"name":"工程师","sjzx_create_username":null,"available":1,"code":null,"sjzx_create_useruuid":null,"sjzx_create_time":"2017-06-12 11:07:50","deleted":0,"sjzx_update_username":null,"unit_code":"0001000900220008"}
         * post : {"id":1,"pym":"k","sjzx_update_time":null,"sjzx_update_useruuid":null,"name":"空","sjzx_create_username":null,"code":null,"sjzx_create_useruuid":null,"sjzx_create_time":"2017-06-12 11:07:50","deleted":0,"gzl_type":null,"sjzx_update_username":null,"unit_code":null}
         * department : {"department4code":"0001000900220008","department1safeovertime":null,"departmenttype":11,"department1type":null,"department2type":5,"departmentpid":3862,"department1name":"沈阳铁路局","department3id":3862,"fullname":"沈阳铁路局-运输处-沈阳车务段-安全科","department2riskctrlcode":"CW","department4id":3870,"departmentcode":"0001000900220008","department4riskctrlcode":null,"department2id":195,"departmentid":3870,"departmentlevel":4,"department1code":"0001","department4safeovertime":null,"list":[{"pym":"aqk","dbm":null,"class_name":null,"type":11,"cognizance_user_id":null,"class_select":0,"id":3870,"level":4,"name":"安全科","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220008","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null},{"pym":"sycwd","dbm":null,"class_name":null,"type":1,"cognizance_user_id":null,"class_select":0,"id":3862,"level":3,"name":"沈阳车务段","response_user_id":263023,"safe_overtime":2400,"equdepartment":0,"leader_user_id":45402,"property":null,"pid":195,"available":1,"code":"000100090022","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":null,"problem_auto_audot":1,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":219160,"start_date":null},{"pym":"ysc","dbm":null,"class_name":null,"type":5,"cognizance_user_id":null,"class_select":0,"id":195,"level":2,"name":"运输处","response_user_id":100,"safe_overtime":null,"equdepartment":0,"leader_user_id":264923,"property":null,"pid":1,"available":1,"code":"00010009","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":"CW","class_id":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":null,"start_date":null},{"pym":"sytlj","dbm":null,"class_name":null,"type":null,"cognizance_user_id":null,"class_select":0,"id":1,"level":1,"name":"沈阳铁路局","response_user_id":335,"safe_overtime":null,"equdepartment":0,"leader_user_id":335,"property":null,"pid":0,"available":2,"code":"0001","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":"A","class_id":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null}],"department4name":"安全科","departmentname":"安全科","department3code":"000100090022","department1id":1,"department2safeovertime":null,"departmentriskctrlcode":null,"department2code":"00010009","departmentsafeovertime":null,"department3name":"沈阳车务段","fullname1":"沈阳车务段-安全科","department3type":1,"department2name":"运输处","department1riskctrlcode":"A","department4type":11,"department3safeovertime":2400,"department3riskctrlcode":null}
         * loginCount : 6464
         * password : null
         * id : 189516
         * department2Code : 00010009
         * token : 098CDE226D8638E59D8727C5AA738F21
         * positionId : 3877
         * name : 沈阳车务段管理员
         * userLevel : 3
         * fullDepartmentName : 沈阳铁路局-运输处-沈阳车务段-安全科
         * assessMonth : 2017-07
         * departmentId : 3870
         * departmentCode : 0001000900220008
         * fullDepartmentName1 : 沈阳车务段-安全科
         * user : {"birth":"20170124","dept_name4":"安全科","dept_name3":"沈阳车务段","sso_uuid":"9BCA50CE85854539BAD347B10643AC9E","leader_type":1,"quan_post_name":"测试日勤岗","bzb":0,"dept_full_name":"沈阳铁路局-运输处-沈阳车务段-安全科","dept_name7":null,"laid_off_time":null,"dept_name5":null,"dept_name6":null,"ctc":0,"dept_code7":null,"dept_code6":null,"user_type_name":"在岗工作","dept_code5":null,"seniority1":null,"dept_code4":"0001000900220008","dept_code3":"000100090022","pm":0,"isshangbao":"0","position":3877,"dt":0,"fhy":0,"sys":0,"lw":0,"zdz":0,"is_leadership":1,"start_work_date":"20370124","dept_id":3870,"dg":0,"token":"098CDE226D8638E59D8727C5AA738F21","ccsj":0,"position_duty":null,"dept_cwd_or_stn_name":"沈阳车务段","dept_station_code":null,"post":1,"dept_station_name":null,"technical_level":null,"labor":null,"dept_cwd_or_stn_code":"000100090022","feeling":null,"login_name":"admin-sycwd","user_type_id":1,"lzh":"189516","cb":0,"card_number":null,"tel":null,"tf":0,"quan_post_id":104,"type":0,"remark1":null,"remark3":null,"remark2":null,"is_leader":0,"gender":1,"inbox_do_sort":"SEND_USER1","dept_cwd_name":"沈阳车务段","seniority":1,"post_name":"空","dc":0,"technical_level_name":null,"jsj":0,"dept_code":"0001000900220008","leader_type_name":"专业技术","key_person_mark":0,"6502":0,"deleted":0,"position_name":"工程师","email":null,"dept_cwd_code":"000100090022","create_time":"2017-01-24 23:37:14","work_experience":null,"ch":0,"zg":0,"pym":"sycwdgly","zb":0,"cert_id":null,"cancel_status":0,"hj":0,"dept_type":11,"id_card":"admin-sycwd","last_login_ip":null,"education":"本科","ljy":0,"id":189516,"name":"沈阳车务段管理员","sso_app_name":null,"outbox_do_sort":"CREATE_DATE2","ethnic":null,"political":null,"working_time":null,"last_login_time":"2017-07-26 11:19:42","yb":0,"photo":null,"dcz":0,"login_count":6464}
         * departmentType2 : 5
         * lastLoginTime : 2017-07-26
         */

        private PositionBean position;
        private PostBean post;
        private DepartmentBean department;
        private int loginCount;
        private Object password;
        private int id;
        private String department2Code;
        private String token;
        private int positionId;
        private String name;
        private int userLevel;
        private String fullDepartmentName;
        private String assessMonth;
        private int departmentId;
        private String departmentCode;
        private String fullDepartmentName1;
        private UserBean user;
        private int departmentType2;
        private String lastLoginTime;

        public PositionBean getPosition() {
            return position;
        }

        public void setPosition(PositionBean position) {
            this.position = position;
        }

        public PostBean getPost() {
            return post;
        }

        public void setPost(PostBean post) {
            this.post = post;
        }

        public DepartmentBean getDepartment() {
            return department;
        }

        public void setDepartment(DepartmentBean department) {
            this.department = department;
        }

        public int getLoginCount() {
            return loginCount;
        }

        public void setLoginCount(int loginCount) {
            this.loginCount = loginCount;
        }

        public Object getPassword() {
            return password;
        }

        public void setPassword(Object password) {
            this.password = password;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getDepartment2Code() {
            return department2Code;
        }

        public void setDepartment2Code(String department2Code) {
            this.department2Code = department2Code;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public int getPositionId() {
            return positionId;
        }

        public void setPositionId(int positionId) {
            this.positionId = positionId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getUserLevel() {
            return userLevel;
        }

        public void setUserLevel(int userLevel) {
            this.userLevel = userLevel;
        }

        public String getFullDepartmentName() {
            return fullDepartmentName;
        }

        public void setFullDepartmentName(String fullDepartmentName) {
            this.fullDepartmentName = fullDepartmentName;
        }

        public String getAssessMonth() {
            return assessMonth;
        }

        public void setAssessMonth(String assessMonth) {
            this.assessMonth = assessMonth;
        }

        public int getDepartmentId() {
            return departmentId;
        }

        public void setDepartmentId(int departmentId) {
            this.departmentId = departmentId;
        }

        public String getDepartmentCode() {
            return departmentCode;
        }

        public void setDepartmentCode(String departmentCode) {
            this.departmentCode = departmentCode;
        }

        public String getFullDepartmentName1() {
            return fullDepartmentName1;
        }

        public void setFullDepartmentName1(String fullDepartmentName1) {
            this.fullDepartmentName1 = fullDepartmentName1;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public int getDepartmentType2() {
            return departmentType2;
        }

        public void setDepartmentType2(int departmentType2) {
            this.departmentType2 = departmentType2;
        }

        public String getLastLoginTime() {
            return lastLoginTime;
        }

        public void setLastLoginTime(String lastLoginTime) {
            this.lastLoginTime = lastLoginTime;
        }

        public static class PositionBean {
            /**
             * id : 3877
             * pym : gcs
             * sjzx_update_time : null
             * sjzx_update_useruuid : null
             * name : 工程师
             * sjzx_create_username : null
             * available : 1
             * code : null
             * sjzx_create_useruuid : null
             * sjzx_create_time : 2017-06-12 11:07:50
             * deleted : 0
             * sjzx_update_username : null
             * unit_code : 0001000900220008
             */

            private int id;
            private String pym;
            private Object sjzx_update_time;
            private Object sjzx_update_useruuid;
            private String name;
            private Object sjzx_create_username;
            private int available;
            private Object code;
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

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public Object getSjzx_create_username() {
                return sjzx_create_username;
            }

            public void setSjzx_create_username(Object sjzx_create_username) {
                this.sjzx_create_username = sjzx_create_username;
            }

            public int getAvailable() {
                return available;
            }

            public void setAvailable(int available) {
                this.available = available;
            }

            public Object getCode() {
                return code;
            }

            public void setCode(Object code) {
                this.code = code;
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

        public static class PostBean {
            /**
             * id : 1
             * pym : k
             * sjzx_update_time : null
             * sjzx_update_useruuid : null
             * name : 空
             * sjzx_create_username : null
             * code : null
             * sjzx_create_useruuid : null
             * sjzx_create_time : 2017-06-12 11:07:50
             * deleted : 0
             * gzl_type : null
             * sjzx_update_username : null
             * unit_code : null
             */

            private int id;
            private String pym;
            private Object sjzx_update_time;
            private Object sjzx_update_useruuid;
            private String name;
            private Object sjzx_create_username;
            private Object code;
            private Object sjzx_create_useruuid;
            private String sjzx_create_time;
            private int deleted;
            private Object gzl_type;
            private Object sjzx_update_username;
            private Object unit_code;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

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

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public Object getSjzx_create_username() {
                return sjzx_create_username;
            }

            public void setSjzx_create_username(Object sjzx_create_username) {
                this.sjzx_create_username = sjzx_create_username;
            }

            public Object getCode() {
                return code;
            }

            public void setCode(Object code) {
                this.code = code;
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

            public Object getGzl_type() {
                return gzl_type;
            }

            public void setGzl_type(Object gzl_type) {
                this.gzl_type = gzl_type;
            }

            public Object getSjzx_update_username() {
                return sjzx_update_username;
            }

            public void setSjzx_update_username(Object sjzx_update_username) {
                this.sjzx_update_username = sjzx_update_username;
            }

            public Object getUnit_code() {
                return unit_code;
            }

            public void setUnit_code(Object unit_code) {
                this.unit_code = unit_code;
            }
        }

        public static class DepartmentBean {
            /**
             * department4code : 0001000900220008
             * department1safeovertime : null
             * departmenttype : 11
             * department1type : null
             * department2type : 5
             * departmentpid : 3862
             * department1name : 沈阳铁路局
             * department3id : 3862
             * fullname : 沈阳铁路局-运输处-沈阳车务段-安全科
             * department2riskctrlcode : CW
             * department4id : 3870
             * departmentcode : 0001000900220008
             * department4riskctrlcode : null
             * department2id : 195
             * departmentid : 3870
             * departmentlevel : 4
             * department1code : 0001
             * department4safeovertime : null
             * list : [{"pym":"aqk","dbm":null,"class_name":null,"type":11,"cognizance_user_id":null,"class_select":0,"id":3870,"level":4,"name":"安全科","response_user_id":null,"safe_overtime":null,"equdepartment":1,"leader_user_id":null,"property":null,"pid":3862,"available":1,"code":"0001000900220008","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null},{"pym":"sycwd","dbm":null,"class_name":null,"type":1,"cognizance_user_id":null,"class_select":0,"id":3862,"level":3,"name":"沈阳车务段","response_user_id":263023,"safe_overtime":2400,"equdepartment":0,"leader_user_id":45402,"property":null,"pid":195,"available":1,"code":"000100090022","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":null,"problem_auto_audot":1,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":219160,"start_date":null},{"pym":"ysc","dbm":null,"class_name":null,"type":5,"cognizance_user_id":null,"class_select":0,"id":195,"level":2,"name":"运输处","response_user_id":100,"safe_overtime":null,"equdepartment":0,"leader_user_id":264923,"property":null,"pid":1,"available":1,"code":"00010009","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":"CW","class_id":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":null,"start_date":null},{"pym":"sytlj","dbm":null,"class_name":null,"type":null,"cognizance_user_id":null,"class_select":0,"id":1,"level":1,"name":"沈阳铁路局","response_user_id":335,"safe_overtime":null,"equdepartment":0,"leader_user_id":335,"property":null,"pid":0,"available":2,"code":"0001","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":"A","class_id":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":null,"document_user":null,"start_date":null}]
             * department4name : 安全科
             * departmentname : 安全科
             * department3code : 000100090022
             * department1id : 1
             * department2safeovertime : null
             * departmentriskctrlcode : null
             * department2code : 00010009
             * departmentsafeovertime : null
             * department3name : 沈阳车务段
             * fullname1 : 沈阳车务段-安全科
             * department3type : 1
             * department2name : 运输处
             * department1riskctrlcode : A
             * department4type : 11
             * department3safeovertime : 2400.0
             * department3riskctrlcode : null
             */

            private String department4code;
            private Object department1safeovertime;
            private int departmenttype;
            private Object department1type;
            private int department2type;
            private int departmentpid;
            private String department1name;
            private int department3id;
            private String fullname;
            private String department2riskctrlcode;
            private int department4id;
            private String departmentcode;
            private Object department4riskctrlcode;
            private int department2id;
            private int departmentid;
            private int departmentlevel;
            private String department1code;
            private Object department4safeovertime;
            private String department4name;
            private String departmentname;
            private String department3code;
            private int department1id;
            private Object department2safeovertime;
            private Object departmentriskctrlcode;
            private String department2code;
            private Object departmentsafeovertime;
            private String department3name;
            private String fullname1;
            private int department3type;
            private String department2name;
            private String department1riskctrlcode;
            private int department4type;
            private double department3safeovertime;
            private Object department3riskctrlcode;
            private List<ListBean> list;

            public String getDepartment4code() {
                return department4code;
            }

            public void setDepartment4code(String department4code) {
                this.department4code = department4code;
            }

            public Object getDepartment1safeovertime() {
                return department1safeovertime;
            }

            public void setDepartment1safeovertime(Object department1safeovertime) {
                this.department1safeovertime = department1safeovertime;
            }

            public int getDepartmenttype() {
                return departmenttype;
            }

            public void setDepartmenttype(int departmenttype) {
                this.departmenttype = departmenttype;
            }

            public Object getDepartment1type() {
                return department1type;
            }

            public void setDepartment1type(Object department1type) {
                this.department1type = department1type;
            }

            public int getDepartment2type() {
                return department2type;
            }

            public void setDepartment2type(int department2type) {
                this.department2type = department2type;
            }

            public int getDepartmentpid() {
                return departmentpid;
            }

            public void setDepartmentpid(int departmentpid) {
                this.departmentpid = departmentpid;
            }

            public String getDepartment1name() {
                return department1name;
            }

            public void setDepartment1name(String department1name) {
                this.department1name = department1name;
            }

            public int getDepartment3id() {
                return department3id;
            }

            public void setDepartment3id(int department3id) {
                this.department3id = department3id;
            }

            public String getFullname() {
                return fullname;
            }

            public void setFullname(String fullname) {
                this.fullname = fullname;
            }

            public String getDepartment2riskctrlcode() {
                return department2riskctrlcode;
            }

            public void setDepartment2riskctrlcode(String department2riskctrlcode) {
                this.department2riskctrlcode = department2riskctrlcode;
            }

            public int getDepartment4id() {
                return department4id;
            }

            public void setDepartment4id(int department4id) {
                this.department4id = department4id;
            }

            public String getDepartmentcode() {
                return departmentcode;
            }

            public void setDepartmentcode(String departmentcode) {
                this.departmentcode = departmentcode;
            }

            public Object getDepartment4riskctrlcode() {
                return department4riskctrlcode;
            }

            public void setDepartment4riskctrlcode(Object department4riskctrlcode) {
                this.department4riskctrlcode = department4riskctrlcode;
            }

            public int getDepartment2id() {
                return department2id;
            }

            public void setDepartment2id(int department2id) {
                this.department2id = department2id;
            }

            public int getDepartmentid() {
                return departmentid;
            }

            public void setDepartmentid(int departmentid) {
                this.departmentid = departmentid;
            }

            public int getDepartmentlevel() {
                return departmentlevel;
            }

            public void setDepartmentlevel(int departmentlevel) {
                this.departmentlevel = departmentlevel;
            }

            public String getDepartment1code() {
                return department1code;
            }

            public void setDepartment1code(String department1code) {
                this.department1code = department1code;
            }

            public Object getDepartment4safeovertime() {
                return department4safeovertime;
            }

            public void setDepartment4safeovertime(Object department4safeovertime) {
                this.department4safeovertime = department4safeovertime;
            }

            public String getDepartment4name() {
                return department4name;
            }

            public void setDepartment4name(String department4name) {
                this.department4name = department4name;
            }

            public String getDepartmentname() {
                return departmentname;
            }

            public void setDepartmentname(String departmentname) {
                this.departmentname = departmentname;
            }

            public String getDepartment3code() {
                return department3code;
            }

            public void setDepartment3code(String department3code) {
                this.department3code = department3code;
            }

            public int getDepartment1id() {
                return department1id;
            }

            public void setDepartment1id(int department1id) {
                this.department1id = department1id;
            }

            public Object getDepartment2safeovertime() {
                return department2safeovertime;
            }

            public void setDepartment2safeovertime(Object department2safeovertime) {
                this.department2safeovertime = department2safeovertime;
            }

            public Object getDepartmentriskctrlcode() {
                return departmentriskctrlcode;
            }

            public void setDepartmentriskctrlcode(Object departmentriskctrlcode) {
                this.departmentriskctrlcode = departmentriskctrlcode;
            }

            public String getDepartment2code() {
                return department2code;
            }

            public void setDepartment2code(String department2code) {
                this.department2code = department2code;
            }

            public Object getDepartmentsafeovertime() {
                return departmentsafeovertime;
            }

            public void setDepartmentsafeovertime(Object departmentsafeovertime) {
                this.departmentsafeovertime = departmentsafeovertime;
            }

            public String getDepartment3name() {
                return department3name;
            }

            public void setDepartment3name(String department3name) {
                this.department3name = department3name;
            }

            public String getFullname1() {
                return fullname1;
            }

            public void setFullname1(String fullname1) {
                this.fullname1 = fullname1;
            }

            public int getDepartment3type() {
                return department3type;
            }

            public void setDepartment3type(int department3type) {
                this.department3type = department3type;
            }

            public String getDepartment2name() {
                return department2name;
            }

            public void setDepartment2name(String department2name) {
                this.department2name = department2name;
            }

            public String getDepartment1riskctrlcode() {
                return department1riskctrlcode;
            }

            public void setDepartment1riskctrlcode(String department1riskctrlcode) {
                this.department1riskctrlcode = department1riskctrlcode;
            }

            public int getDepartment4type() {
                return department4type;
            }

            public void setDepartment4type(int department4type) {
                this.department4type = department4type;
            }

            public double getDepartment3safeovertime() {
                return department3safeovertime;
            }

            public void setDepartment3safeovertime(double department3safeovertime) {
                this.department3safeovertime = department3safeovertime;
            }

            public Object getDepartment3riskctrlcode() {
                return department3riskctrlcode;
            }

            public void setDepartment3riskctrlcode(Object department3riskctrlcode) {
                this.department3riskctrlcode = department3riskctrlcode;
            }

            public List<ListBean> getList() {
                return list;
            }

            public void setList(List<ListBean> list) {
                this.list = list;
            }

            public static class ListBean {
                /**
                 * pym : aqk
                 * dbm : null
                 * class_name : null
                 * type : 11
                 * cognizance_user_id : null
                 * class_select : 0
                 * id : 3870
                 * level : 4
                 * name : 安全科
                 * response_user_id : null
                 * safe_overtime : null
                 * equdepartment : 1
                 * leader_user_id : null
                 * property : null
                 * pid : 3862
                 * available : 1
                 * code : 0001000900220008
                 * station_level : null
                 * deleted : 0
                 * url : null
                 * risk_ctrl_code : null
                 * class_id : null
                 * problem_auto_audot : 0
                 * create_time : 2017-02-06 09:18:03
                 * unit_type : null
                 * document_user : null
                 * start_date : null
                 */

                private String pym;
                private Object dbm;
                private Object class_name;
                private int type;
                private Object cognizance_user_id;
                private int class_select;
                private int id;
                private int level;
                private String name;
                private Object response_user_id;
                private Object safe_overtime;
                private int equdepartment;
                private Object leader_user_id;
                private Object property;
                private int pid;
                private int available;
                private String code;
                private Object station_level;
                private int deleted;
                private Object url;
                private Object risk_ctrl_code;
                private Object class_id;
                private int problem_auto_audot;
                private String create_time;
                private Object unit_type;
                private Object document_user;
                private Object start_date;

                public String getPym() {
                    return pym;
                }

                public void setPym(String pym) {
                    this.pym = pym;
                }

                public Object getDbm() {
                    return dbm;
                }

                public void setDbm(Object dbm) {
                    this.dbm = dbm;
                }

                public Object getClass_name() {
                    return class_name;
                }

                public void setClass_name(Object class_name) {
                    this.class_name = class_name;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public Object getCognizance_user_id() {
                    return cognizance_user_id;
                }

                public void setCognizance_user_id(Object cognizance_user_id) {
                    this.cognizance_user_id = cognizance_user_id;
                }

                public int getClass_select() {
                    return class_select;
                }

                public void setClass_select(int class_select) {
                    this.class_select = class_select;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getLevel() {
                    return level;
                }

                public void setLevel(int level) {
                    this.level = level;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public Object getResponse_user_id() {
                    return response_user_id;
                }

                public void setResponse_user_id(Object response_user_id) {
                    this.response_user_id = response_user_id;
                }

                public Object getSafe_overtime() {
                    return safe_overtime;
                }

                public void setSafe_overtime(Object safe_overtime) {
                    this.safe_overtime = safe_overtime;
                }

                public int getEqudepartment() {
                    return equdepartment;
                }

                public void setEqudepartment(int equdepartment) {
                    this.equdepartment = equdepartment;
                }

                public Object getLeader_user_id() {
                    return leader_user_id;
                }

                public void setLeader_user_id(Object leader_user_id) {
                    this.leader_user_id = leader_user_id;
                }

                public Object getProperty() {
                    return property;
                }

                public void setProperty(Object property) {
                    this.property = property;
                }

                public int getPid() {
                    return pid;
                }

                public void setPid(int pid) {
                    this.pid = pid;
                }

                public int getAvailable() {
                    return available;
                }

                public void setAvailable(int available) {
                    this.available = available;
                }

                public String getCode() {
                    return code;
                }

                public void setCode(String code) {
                    this.code = code;
                }

                public Object getStation_level() {
                    return station_level;
                }

                public void setStation_level(Object station_level) {
                    this.station_level = station_level;
                }

                public int getDeleted() {
                    return deleted;
                }

                public void setDeleted(int deleted) {
                    this.deleted = deleted;
                }

                public Object getUrl() {
                    return url;
                }

                public void setUrl(Object url) {
                    this.url = url;
                }

                public Object getRisk_ctrl_code() {
                    return risk_ctrl_code;
                }

                public void setRisk_ctrl_code(Object risk_ctrl_code) {
                    this.risk_ctrl_code = risk_ctrl_code;
                }

                public Object getClass_id() {
                    return class_id;
                }

                public void setClass_id(Object class_id) {
                    this.class_id = class_id;
                }

                public int getProblem_auto_audot() {
                    return problem_auto_audot;
                }

                public void setProblem_auto_audot(int problem_auto_audot) {
                    this.problem_auto_audot = problem_auto_audot;
                }

                public String getCreate_time() {
                    return create_time;
                }

                public void setCreate_time(String create_time) {
                    this.create_time = create_time;
                }

                public Object getUnit_type() {
                    return unit_type;
                }

                public void setUnit_type(Object unit_type) {
                    this.unit_type = unit_type;
                }

                public Object getDocument_user() {
                    return document_user;
                }

                public void setDocument_user(Object document_user) {
                    this.document_user = document_user;
                }

                public Object getStart_date() {
                    return start_date;
                }

                public void setStart_date(Object start_date) {
                    this.start_date = start_date;
                }
            }
        }

        public static class UserBean {
            /**
             * birth : 20170124
             * dept_name4 : 安全科
             * dept_name3 : 沈阳车务段
             * sso_uuid : 9BCA50CE85854539BAD347B10643AC9E
             * leader_type : 1
             * quan_post_name : 测试日勤岗
             * bzb : 0
             * dept_full_name : 沈阳铁路局-运输处-沈阳车务段-安全科
             * dept_name7 : null
             * laid_off_time : null
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
             * 6502 : 0
             * deleted : 0
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
             * last_login_time : 2017-07-26 11:19:42
             * yb : 0
             * photo : null
             * dcz : 0
             * login_count : 6464
             */

            private String birth;
            private String dept_name4;
            private String dept_name3;
            private String sso_uuid;
            private int leader_type;
            private String quan_post_name;
            private int bzb;
            private String dept_full_name;
            private Object dept_name7;
            private Object laid_off_time;
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
    }

    public static class PermissionBean {
        /**
         * aqwtxdwh : 1
         * jjsb_khyx : 1
         * hywh : 1
         * ldyg_scl : 1
         * jjsb_lwkk : 1
         * gx_zgnxjdjkck : 1
         * xtgl : 1
         * gwgl : 1
         * khjjfgl : 1
         * bmkhdjsz1 : 1
         * glzdgl : 1
         * zdgzsc : 1
         * view_basic_shop : 1
         * gx_yxjmxsb : 1
         * fxkzb : 1
         * gwfxdwh : 1
         * aqyhwh : 1
         * rygl : 1
         * bmqtkhsz : 1
         * gx_jjbtj : 1
         * jjsb_aqjy : 1
         * view_basic_show : 1
         * jjsz_khyx : 1
         * sbmcwh : 1
         * edit_safe_problem : 1
         * fqhd : 1
         * gx_nxjmxhz : 1
         * view_basic_equipment_check : 1
         * view_basic_book : 1
         * gx_bzzblr : 1
         * jjsb_zjxd : 1
         * view_basic_card : 1
         * jjsz_xmwh : 1
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
         * jjsz_kpyx : 1
         * gjsjwh : 1
         * gxkh : 1
         * jsgzflwh : 1
         * jsdjgl : 1
         * jslxwh : 1
         * ythkhpdbsz : 1
         * ythkhsz : 1
         * jjsz_dlbs : 1
         * gx_kqcx : 1
         * view_basic_produce_target : 1
         * gx_nxjbb : 1
         * dbxxsc : 1
         * gbydykhb : 1
         * bzgzbzwh : 1
         * gx_lh : 1
         * khsz : 1
         * glzdwh : 1
         * hyxj : 1
         * lwwtkh : 1
         * gx_nxjmxsb : 1
         * jjsz_lwfh : 1
         * jjsz_ajcw : 1
         * view_basic_ctc : 1
         * gwfcfb : 1
         * jjsb_kpyx : 1
         * zmgl : 1
         * shlc_zfd : 1
         * gbkhbh : 1
         * safe_danger_approval : 1
         * jjsb_gbzb : 1
         * dbfb : 1
         * gx_jjblr : 1
         * gx_kqcx_all : 1
         * jjsb : 1
         * cwdfcwh : 1
         * gx_ybfgl : 1
         * fjtjgl : 1
         * edit_basic_czzbywh : 1
         * gx_gzxjspr : 1
         * gx_gzxjgl : 1
         * bmkhhz : 1
         * cwdfc : 1
         * jjsz_aqjy : 1
         * gx_kq : 1
         * hysz : 1
         * gx_wcbatj : 1
         * jjsb_zyxz : 1
         * qywhwh : 1
         * gx_kqfh : 1
         * lwwtzsxs : 1
         * gzllr : 1
         * awhzdgzwh : 1
         * db : 1
         * jjsz : 1
         * xwdt : 1
         * gx_lxjgl : 1
         * edit_basic_shop : 1
         * ythcxyqr : 1
         * edit_basic_team : 1
         * jsgl : 1
         * wtxzlxwh : 1
         * edit_basic_czzbygl : 1
         * glzdxj : 1
         * bmythkh : 1
         * view_basic_czzby : 1
         * gx_qdzblr : 1
         * aqyhsc : 1
         * ldscl : 1
         * edit_basic_equipment_construction : 1
         * cwdfcfb : 1
         * sbgyswh : 1
         * safe_problem_signed : 1
         * edit_basic_station : 1
         * fbfc : 1
         * jjsb_dlbs : 1
         * view_basic_equipment_construction : 1
         * gx_yxjmxhz : 1
         * ddgl : 1
         * stn_approval_dpzr : 1
         * szkhzq : 1
         * sgtzsz : 1
         * sbflwh : 1
         * shlc_jjfh : 1
         * sbwh : 1
         * qywh : 1
         * edit_basic_show : 1
         * jjsz_zyxz : 1
         * jcglfzxs : 1
         * jsgzgl : 1
         * dbwh : 1
         * gx_bzzbsh : 1
         * jjsb_ajcw : 1
         * bgtfb : 1
         * jsgzwh : 1
         * gx_lhgwgl : 1
         * ythkhpd : 1
         * bgtwh : 1
         * gx_gzsh : 1
         * wtxzlbwh : 1
         * gbqpfsz : 1
         * czglkh : 1
         * gx_lxjspr : 1
         * sbssbm : 1
         * jjsb_lwfh : 1
         * shlc_jjsh : 1
         * gx_wcbasp : 1
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
         * gx_ljsjwcnxjryqk : 1
         * gx_qdzbsh : 1
         * jjsz_gbzb : 1
         * shlc_jjsp : 1
         * gzl : 1
         */

        private int aqwtxdwh;
        private int jjsb_khyx;
        private int hywh;
        private int ldyg_scl;
        private int jjsb_lwkk;
        private int gx_zgnxjdjkck;
        private int xtgl;
        private int gwgl;
        private int khjjfgl;
        private int bmkhdjsz1;
        private int glzdgl;
        private int zdgzsc;
        private int view_basic_shop;
        private int gx_yxjmxsb;
        private int fxkzb;
        private int gwfxdwh;
        private int aqyhwh;
        private int rygl;
        private int bmqtkhsz;
        private int gx_jjbtj;
        private int jjsb_aqjy;
        private int view_basic_show;
        private int jjsz_khyx;
        private int sbmcwh;
        private int edit_safe_problem;
        private int fqhd;
        private int gx_nxjmxhz;
        private int view_basic_equipment_check;
        private int view_basic_book;
        private int gx_bzzblr;
        private int jjsb_zjxd;
        private int view_basic_card;
        private int jjsz_xmwh;
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
        private int jjsz_kpyx;
        private int gjsjwh;
        private int gxkh;
        private int jsgzflwh;
        private int jsdjgl;
        private int jslxwh;
        private int ythkhpdbsz;
        private int ythkhsz;
        private int jjsz_dlbs;
        private int gx_kqcx;
        private int view_basic_produce_target;
        private int gx_nxjbb;
        private int dbxxsc;
        private int gbydykhb;
        private int bzgzbzwh;
        private int gx_lh;
        private int khsz;
        private int glzdwh;
        private int hyxj;
        private int lwwtkh;
        private int gx_nxjmxsb;
        private int jjsz_lwfh;
        private int jjsz_ajcw;
        private int view_basic_ctc;
        private int gwfcfb;
        private int jjsb_kpyx;
        private int zmgl;
        private int shlc_zfd;
        private int gbkhbh;
        private int safe_danger_approval;
        private int jjsb_gbzb;
        private int dbfb;
        private int gx_jjblr;
        private int gx_kqcx_all;
        private int jjsb;
        private int cwdfcwh;
        private int gx_ybfgl;
        private int fjtjgl;
        private int edit_basic_czzbywh;
        private int gx_gzxjspr;
        private int gx_gzxjgl;
        private int bmkhhz;
        private int cwdfc;
        private int jjsz_aqjy;
        private int gx_kq;
        private int hysz;
        private int gx_wcbatj;
        private int jjsb_zyxz;
        private int qywhwh;
        private int gx_kqfh;
        private int lwwtzsxs;
        private int gzllr;
        private int awhzdgzwh;
        private int db;
        private int jjsz;
        private int xwdt;
        private int gx_lxjgl;
        private int edit_basic_shop;
        private int ythcxyqr;
        private int edit_basic_team;
        private int jsgl;
        private int wtxzlxwh;
        private int edit_basic_czzbygl;
        private int glzdxj;
        private int bmythkh;
        private int view_basic_czzby;
        private int gx_qdzblr;
        private int aqyhsc;
        private int ldscl;
        private int edit_basic_equipment_construction;
        private int cwdfcfb;
        private int sbgyswh;
        private int safe_problem_signed;
        private int edit_basic_station;
        private int fbfc;
        private int jjsb_dlbs;
        private int view_basic_equipment_construction;
        private int gx_yxjmxhz;
        private int ddgl;
        private int stn_approval_dpzr;
        private int szkhzq;
        private int sgtzsz;
        private int sbflwh;
        private int shlc_jjfh;
        private int sbwh;
        private int qywh;
        private int edit_basic_show;
        private int jjsz_zyxz;
        private int jcglfzxs;
        private int jsgzgl;
        private int dbwh;
        private int gx_bzzbsh;
        private int jjsb_ajcw;
        private int bgtfb;
        private int jsgzwh;
        private int gx_lhgwgl;
        private int ythkhpd;
        private int bgtwh;
        private int gx_gzsh;
        private int wtxzlbwh;
        private int gbqpfsz;
        private int czglkh;
        private int gx_lxjspr;
        private int sbssbm;
        private int jjsb_lwfh;
        private int shlc_jjsh;
        private int gx_wcbasp;
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
        private int gx_ljsjwcnxjryqk;
        private int gx_qdzbsh;
        private int jjsz_gbzb;
        private int shlc_jjsp;
        private int gzl;

        public int getAqwtxdwh() {
            return aqwtxdwh;
        }

        public void setAqwtxdwh(int aqwtxdwh) {
            this.aqwtxdwh = aqwtxdwh;
        }

        public int getJjsb_khyx() {
            return jjsb_khyx;
        }

        public void setJjsb_khyx(int jjsb_khyx) {
            this.jjsb_khyx = jjsb_khyx;
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

        public int getJjsb_lwkk() {
            return jjsb_lwkk;
        }

        public void setJjsb_lwkk(int jjsb_lwkk) {
            this.jjsb_lwkk = jjsb_lwkk;
        }

        public int getGx_zgnxjdjkck() {
            return gx_zgnxjdjkck;
        }

        public void setGx_zgnxjdjkck(int gx_zgnxjdjkck) {
            this.gx_zgnxjdjkck = gx_zgnxjdjkck;
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

        public int getGx_yxjmxsb() {
            return gx_yxjmxsb;
        }

        public void setGx_yxjmxsb(int gx_yxjmxsb) {
            this.gx_yxjmxsb = gx_yxjmxsb;
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

        public int getJjsb_aqjy() {
            return jjsb_aqjy;
        }

        public void setJjsb_aqjy(int jjsb_aqjy) {
            this.jjsb_aqjy = jjsb_aqjy;
        }

        public int getView_basic_show() {
            return view_basic_show;
        }

        public void setView_basic_show(int view_basic_show) {
            this.view_basic_show = view_basic_show;
        }

        public int getJjsz_khyx() {
            return jjsz_khyx;
        }

        public void setJjsz_khyx(int jjsz_khyx) {
            this.jjsz_khyx = jjsz_khyx;
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

        public int getGx_nxjmxhz() {
            return gx_nxjmxhz;
        }

        public void setGx_nxjmxhz(int gx_nxjmxhz) {
            this.gx_nxjmxhz = gx_nxjmxhz;
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

        public int getJjsb_zjxd() {
            return jjsb_zjxd;
        }

        public void setJjsb_zjxd(int jjsb_zjxd) {
            this.jjsb_zjxd = jjsb_zjxd;
        }

        public int getView_basic_card() {
            return view_basic_card;
        }

        public void setView_basic_card(int view_basic_card) {
            this.view_basic_card = view_basic_card;
        }

        public int getJjsz_xmwh() {
            return jjsz_xmwh;
        }

        public void setJjsz_xmwh(int jjsz_xmwh) {
            this.jjsz_xmwh = jjsz_xmwh;
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

        public int getJjsz_kpyx() {
            return jjsz_kpyx;
        }

        public void setJjsz_kpyx(int jjsz_kpyx) {
            this.jjsz_kpyx = jjsz_kpyx;
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

        public int getJslxwh() {
            return jslxwh;
        }

        public void setJslxwh(int jslxwh) {
            this.jslxwh = jslxwh;
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

        public int getJjsz_dlbs() {
            return jjsz_dlbs;
        }

        public void setJjsz_dlbs(int jjsz_dlbs) {
            this.jjsz_dlbs = jjsz_dlbs;
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

        public int getGx_nxjbb() {
            return gx_nxjbb;
        }

        public void setGx_nxjbb(int gx_nxjbb) {
            this.gx_nxjbb = gx_nxjbb;
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

        public int getBzgzbzwh() {
            return bzgzbzwh;
        }

        public void setBzgzbzwh(int bzgzbzwh) {
            this.bzgzbzwh = bzgzbzwh;
        }

        public int getGx_lh() {
            return gx_lh;
        }

        public void setGx_lh(int gx_lh) {
            this.gx_lh = gx_lh;
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

        public int getGx_nxjmxsb() {
            return gx_nxjmxsb;
        }

        public void setGx_nxjmxsb(int gx_nxjmxsb) {
            this.gx_nxjmxsb = gx_nxjmxsb;
        }

        public int getJjsz_lwfh() {
            return jjsz_lwfh;
        }

        public void setJjsz_lwfh(int jjsz_lwfh) {
            this.jjsz_lwfh = jjsz_lwfh;
        }

        public int getJjsz_ajcw() {
            return jjsz_ajcw;
        }

        public void setJjsz_ajcw(int jjsz_ajcw) {
            this.jjsz_ajcw = jjsz_ajcw;
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

        public int getJjsb_kpyx() {
            return jjsb_kpyx;
        }

        public void setJjsb_kpyx(int jjsb_kpyx) {
            this.jjsb_kpyx = jjsb_kpyx;
        }

        public int getZmgl() {
            return zmgl;
        }

        public void setZmgl(int zmgl) {
            this.zmgl = zmgl;
        }

        public int getShlc_zfd() {
            return shlc_zfd;
        }

        public void setShlc_zfd(int shlc_zfd) {
            this.shlc_zfd = shlc_zfd;
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

        public int getJjsb_gbzb() {
            return jjsb_gbzb;
        }

        public void setJjsb_gbzb(int jjsb_gbzb) {
            this.jjsb_gbzb = jjsb_gbzb;
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

        public int getGx_kqcx_all() {
            return gx_kqcx_all;
        }

        public void setGx_kqcx_all(int gx_kqcx_all) {
            this.gx_kqcx_all = gx_kqcx_all;
        }

        public int getJjsb() {
            return jjsb;
        }

        public void setJjsb(int jjsb) {
            this.jjsb = jjsb;
        }

        public int getCwdfcwh() {
            return cwdfcwh;
        }

        public void setCwdfcwh(int cwdfcwh) {
            this.cwdfcwh = cwdfcwh;
        }

        public int getGx_ybfgl() {
            return gx_ybfgl;
        }

        public void setGx_ybfgl(int gx_ybfgl) {
            this.gx_ybfgl = gx_ybfgl;
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

        public int getGx_gzxjspr() {
            return gx_gzxjspr;
        }

        public void setGx_gzxjspr(int gx_gzxjspr) {
            this.gx_gzxjspr = gx_gzxjspr;
        }

        public int getGx_gzxjgl() {
            return gx_gzxjgl;
        }

        public void setGx_gzxjgl(int gx_gzxjgl) {
            this.gx_gzxjgl = gx_gzxjgl;
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

        public int getJjsz_aqjy() {
            return jjsz_aqjy;
        }

        public void setJjsz_aqjy(int jjsz_aqjy) {
            this.jjsz_aqjy = jjsz_aqjy;
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

        public int getGx_wcbatj() {
            return gx_wcbatj;
        }

        public void setGx_wcbatj(int gx_wcbatj) {
            this.gx_wcbatj = gx_wcbatj;
        }

        public int getJjsb_zyxz() {
            return jjsb_zyxz;
        }

        public void setJjsb_zyxz(int jjsb_zyxz) {
            this.jjsb_zyxz = jjsb_zyxz;
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

        public int getJjsz() {
            return jjsz;
        }

        public void setJjsz(int jjsz) {
            this.jjsz = jjsz;
        }

        public int getXwdt() {
            return xwdt;
        }

        public void setXwdt(int xwdt) {
            this.xwdt = xwdt;
        }

        public int getGx_lxjgl() {
            return gx_lxjgl;
        }

        public void setGx_lxjgl(int gx_lxjgl) {
            this.gx_lxjgl = gx_lxjgl;
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

        public int getGx_qdzblr() {
            return gx_qdzblr;
        }

        public void setGx_qdzblr(int gx_qdzblr) {
            this.gx_qdzblr = gx_qdzblr;
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

        public int getJjsb_dlbs() {
            return jjsb_dlbs;
        }

        public void setJjsb_dlbs(int jjsb_dlbs) {
            this.jjsb_dlbs = jjsb_dlbs;
        }

        public int getView_basic_equipment_construction() {
            return view_basic_equipment_construction;
        }

        public void setView_basic_equipment_construction(int view_basic_equipment_construction) {
            this.view_basic_equipment_construction = view_basic_equipment_construction;
        }

        public int getGx_yxjmxhz() {
            return gx_yxjmxhz;
        }

        public void setGx_yxjmxhz(int gx_yxjmxhz) {
            this.gx_yxjmxhz = gx_yxjmxhz;
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

        public int getShlc_jjfh() {
            return shlc_jjfh;
        }

        public void setShlc_jjfh(int shlc_jjfh) {
            this.shlc_jjfh = shlc_jjfh;
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

        public int getJjsz_zyxz() {
            return jjsz_zyxz;
        }

        public void setJjsz_zyxz(int jjsz_zyxz) {
            this.jjsz_zyxz = jjsz_zyxz;
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

        public int getGx_bzzbsh() {
            return gx_bzzbsh;
        }

        public void setGx_bzzbsh(int gx_bzzbsh) {
            this.gx_bzzbsh = gx_bzzbsh;
        }

        public int getJjsb_ajcw() {
            return jjsb_ajcw;
        }

        public void setJjsb_ajcw(int jjsb_ajcw) {
            this.jjsb_ajcw = jjsb_ajcw;
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

        public int getGx_lhgwgl() {
            return gx_lhgwgl;
        }

        public void setGx_lhgwgl(int gx_lhgwgl) {
            this.gx_lhgwgl = gx_lhgwgl;
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

        public int getGx_lxjspr() {
            return gx_lxjspr;
        }

        public void setGx_lxjspr(int gx_lxjspr) {
            this.gx_lxjspr = gx_lxjspr;
        }

        public int getSbssbm() {
            return sbssbm;
        }

        public void setSbssbm(int sbssbm) {
            this.sbssbm = sbssbm;
        }

        public int getJjsb_lwfh() {
            return jjsb_lwfh;
        }

        public void setJjsb_lwfh(int jjsb_lwfh) {
            this.jjsb_lwfh = jjsb_lwfh;
        }

        public int getShlc_jjsh() {
            return shlc_jjsh;
        }

        public void setShlc_jjsh(int shlc_jjsh) {
            this.shlc_jjsh = shlc_jjsh;
        }

        public int getGx_wcbasp() {
            return gx_wcbasp;
        }

        public void setGx_wcbasp(int gx_wcbasp) {
            this.gx_wcbasp = gx_wcbasp;
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

        public int getGx_ljsjwcnxjryqk() {
            return gx_ljsjwcnxjryqk;
        }

        public void setGx_ljsjwcnxjryqk(int gx_ljsjwcnxjryqk) {
            this.gx_ljsjwcnxjryqk = gx_ljsjwcnxjryqk;
        }

        public int getGx_qdzbsh() {
            return gx_qdzbsh;
        }

        public void setGx_qdzbsh(int gx_qdzbsh) {
            this.gx_qdzbsh = gx_qdzbsh;
        }

        public int getJjsz_gbzb() {
            return jjsz_gbzb;
        }

        public void setJjsz_gbzb(int jjsz_gbzb) {
            this.jjsz_gbzb = jjsz_gbzb;
        }

        public int getShlc_jjsp() {
            return shlc_jjsp;
        }

        public void setShlc_jjsp(int shlc_jjsp) {
            this.shlc_jjsp = shlc_jjsp;
        }

        public int getGzl() {
            return gzl;
        }

        public void setGzl(int gzl) {
            this.gzl = gzl;
        }
    }

    public static class ListBean {
        /**
         * birth : 19710228
         * dept_name4 : 领导班子
         * dept_name3 : 沈阳车务段
         * sso_uuid : 46FB49C3EBB14B25850ADB375F8BA18A
         * leader_type : 4
         * quan_post_name : null
         * bzb : 0
         * dept_full_name : 沈阳铁路局-运输处-沈阳车务段-领导班子
         * dept_name7 : null
         * laid_off_time : null
         * dept_name5 : null
         * dept_name6 : null
         * ctc : 0
         * dept_code7 : null
         * dept_code6 : null
         * user_type_name : 在岗工作
         * dept_code5 : null
         * seniority1 : 25
         * dept_code4 : 0001000900220001
         * dept_code3 : 000100090022
         * pm : 0
         * isshangbao : 0
         * position : 3882
         * dt : 0
         * fhy : 0
         * sys : 0
         * lw : 0
         * zdz : 0
         * is_leadership : 1
         * start_work_date : 19910228
         * dept_id : 3863
         * dg : 0
         * token : null
         * ccsj : 0
         * position_duty : null
         * dept_cwd_or_stn_name : 沈阳车务段
         * dept_station_code : null
         * post : 1
         * dept_station_name : null
         * technical_level : null
         * labor : 日
         * dept_cwd_or_stn_code : 000100090022
         * feeling : null
         * login_name : 210621197203244773
         * user_type_id : 1
         * lzh : 219479
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
         * inbox_do_sort : 0
         * dept_cwd_name : 沈阳车务段
         * seniority : 46
         * post_name : 空
         * dc : 0
         * technical_level_name : null
         * jsj : 0
         * dept_code : 0001000900220001
         * leader_type_name : 党群
         * key_person_mark : 0
         * 6502 : 0
         * deleted : 0
         * position_name : 纪委书记
         * email : null
         * dept_cwd_code : 000100090022
         * create_time : 2017-01-30 18:02:06
         * work_experience : 1989.09—1993.08 齐齐哈尔铁路工程学校物资管理专业学习
         1993.08—1995.01 沈阳铁路局丹东分局丹东列车段见习生
         1995.01—1995.05 沈阳铁路局丹东分局丹东列车段团委干事
         1995.05—1998.08 沈阳铁路局丹东分局丹东列车段团委副书记（1995.05股级，丹列党干字[1995]11号）
         1998.08—2003.09 沈阳铁路局丹东分局丹东列车段团委书记（1998.08副科级，丹列干字（1998）9号）（其间：1998.09－2002.07北方交通大学铁道运输专业在职学习，取得大专学历；2000.08－2002.08在北方交通大学铁道运输专业自学考试，取得大学学历）
         2003.09—2005.09 沈阳铁路局沈阳客运段丹东列车段客运车队党支部书记
         2005.09—2006.03 沈阳铁路局沈阳客运段丹东乘务所客运车队党支部书记
         2006.03—2007.10 沈阳铁路局沈阳客运段客运八队党总支书记兼副队长（丹东）
         2007.10—2008.04 沈阳铁路局沈阳客运段客运八队党总支书记兼副队长，兼聘助理政工师
         2008.04—2009.07 沈阳铁路局沈阳客运段丹东旅服车间党支部书记兼副主任兼政工师（2008.04正科级，沈客党岗[2008]21号）
         2009.07—2009.12 沈阳铁路局沈阳客运段客运六队党总支书记兼副队长兼政工师
         2009.12—2010.12 沈阳铁路局沈阳客运段客运六队队长兼党总支副书记
         2010.12—2011.03 沈阳铁路局沈阳客运段客运六队队长兼党总支副书记兼助理工程师
         2011.03—2011.05 沈阳铁路局沈阳沈铁房地产开发集团有限责任公司技术安全部部长兼聘助理工程师
         2011.05—2011.09 沈阳铁路局沈阳沈铁房地产开发集团有限责任公司兴城疗养院副院长兼聘助理工程师
         2011.09—2012.06 沈阳铁路局沈阳沈铁房地产开发集团有限责任公司山海关铁道车辆培训中心主任兼党总支副书记（2011.09副处级，沈铁聘机［2011］371号）
         2012.06—2013.05 沈阳铁路局鞍山直属集团公司副总经理
         2013.05—2015.02 沈阳铁路局鞍山货运中心副总经理
         2015.02—　　　　沈阳车务段党委副书记、纪委书记兼政工师

         * ch : 0
         * zg : 0
         * pym : gs
         * zb : 0
         * cert_id : null
         * cancel_status : 0
         * hj : 0
         * dept_type : 4
         * id_card : 210621197203244773
         * last_login_ip : null
         * education : 本科
         * ljy : 0
         * id : 219479
         * name : 高松
         * sso_app_name : null
         * outbox_do_sort : 0
         * ethnic : 汉族
         * political : 党员
         * working_time : null
         * last_login_time : 2017-06-12 20:24:12
         * yb : 0
         * photo : null
         * dcz : 0
         * login_count : 578
         */

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
        private int is_leadership;
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
