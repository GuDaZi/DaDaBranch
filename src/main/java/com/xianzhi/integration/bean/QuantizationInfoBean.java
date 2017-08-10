package com.xianzhi.integration.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @Administrator LiBo.
 * @Date 2017/7/31.
 * @Function
 */

public class QuantizationInfoBean implements Serializable {

    private String userId;

    public QuantizationInfoBean() {
    }

    public QuantizationInfoBean(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * month : 2017-07
     * list : [{"dynamic":0,"content":"每月检查接发列车","id":1279,"normal_done":0,"count":0,"normal":4,"dynamic_done":0,"extra_done":0,"minus_score":5,"pre_id":845085},{"dynamic":0,"content":"每月监听、回放车机联控","id":2892,"normal_done":0,"count":0,"normal":3,"dynamic_done":0,"extra_done":0,"minus_score":5,"pre_id":845086},{"dynamic":0,"content":"每月检查调车作业","id":1283,"normal_done":0,"count":0,"normal":4,"dynamic_done":0,"extra_done":0,"minus_score":5,"pre_id":845087},{"dynamic":0,"content":"检查调车信号确认","id":3214,"normal_done":0,"count":0,"normal":1,"dynamic_done":0,"extra_done":0,"minus_score":5,"pre_id":845014},{"dynamic":0,"content":"添乘检查","id":2880,"normal_done":0,"count":0,"normal":1,"dynamic_done":0,"extra_done":0,"minus_score":5,"pre_id":845015},{"dynamic":0,"content":"检查动态防溜","id":2673,"normal_done":0,"count":0,"normal":4,"dynamic_done":0,"extra_done":0,"minus_score":5,"pre_id":845088},{"dynamic":0,"content":"检查静态防溜","id":2675,"normal_done":0,"count":0,"normal":4,"dynamic_done":0,"extra_done":0,"minus_score":5,"pre_id":845089},{"dynamic":0,"content":"检查结合部防溜","id":3218,"normal_done":0,"count":0,"normal":4,"dynamic_done":0,"extra_done":0,"minus_score":5,"pre_id":845090},{"dynamic":0,"content":"检查劳动安全","id":2678,"normal_done":0,"count":0,"normal":3,"dynamic_done":0,"extra_done":0,"minus_score":5,"pre_id":845091},{"dynamic":0,"content":"每月检查人身安全","id":3213,"normal_done":0,"count":0,"normal":2,"dynamic_done":0,"extra_done":0,"minus_score":5,"pre_id":845094},{"dynamic":0,"content":"每月检查施工（维修）","id":2680,"normal_done":0,"count":0,"normal":4,"dynamic_done":0,"extra_done":0,"minus_score":5,"pre_id":845092},{"dynamic":0,"content":"每月值班期间检查消防","id":2688,"normal_done":0,"count":0,"normal":3,"dynamic_done":0,"extra_done":0,"minus_score":5,"pre_id":845084},{"dynamic":0,"content":"每月检查路外安全","id":2802,"normal_done":0,"count":0,"normal":1,"dynamic_done":0,"extra_done":0,"minus_score":5,"pre_id":845093},{"dynamic":0,"content":"现场检查、监控检查（实时、回放）实名验票（证）是否做到票、证、人一致，出站口是否查验票面信息","id":6009,"normal_done":0,"count":0,"normal":1,"dynamic_done":0,"extra_done":0,"minus_score":5,"pre_id":845016}]
     * user : {"birth":"19730126","dept_name4":"安全科","dept_name3":"沈阳车务段","dept_name1":"沈阳铁路局","sso_uuid":"1FDB15F0045146558569994ADC5645BC","leader_type":2,"quan_post_name":null,"bzb":0,"dept_full_name":"沈阳铁路局-运输处-沈阳车务段-安全科","laid_off_time":null,"dept_name7":null,"dept_name5":null,"dept_name6":null,"ctc":0,"dept_code7":null,"dept_code6":null,"user_type_name":"在岗工作","dept_code5":null,"seniority1":24,"dept_code4":"0001000900220008","dept_code3":"000100090022","pm":0,"isshangbao":"0","position":2648,"dt":0,"fhy":0,"sys":0,"lw":0,"zdz":0,"is_leadership":null,"start_work_date":"19930126","dept_id":3870,"dg":0,"token":null,"ccsj":0,"position_duty":null,"dept_cwd_or_stn_name":"沈阳车务段","dept_station_code":null,"post":1,"dept_station_name":null,"technical_level":null,"dept_name":"安全科","labor":"日","dept_cwd_or_stn_code":"000100090022","feeling":null,"login_name":"211222197301260211","user_type_id":1,"lzh":"219460","cb":0,"card_number":null,"tel":null,"tf":0,"quan_post_id":null,"type":0,"remark1":null,"password":"C4CA4238A0B923820DCC509A6F75849B","remark3":null,"remark2":null,"is_leader":0,"gender":1,"inbox_do_sort":"INBOX_CREATE_DATE2","dept_cwd_name":"沈阳车务段","seniority":45,"post_name":"空","dc":0,"technical_level_name":null,"jsj":0,"dept_code":"0001000900220008","leader_type_name":"行管","key_person_mark":0,"deleted":0,"6502":0,"position_name":"科长","email":null,"dept_cwd_code":"000100090022","create_time":"2017-01-30 17:17:41","work_experience":"1990.08\u20141994.07 锦州铁路运输学校铁道运输专业学习\r\n1994.08\u20141995.08 沈阳铁路局沈阳分局开原车务段开原站见习生\r\n1995.08\u20141996.07 沈阳铁路分局开原车务段开原站信号员\r\n1996.07\u20141996.12 沈阳铁路分局开原车务段开原站助理员\r\n1996.12\u20142002.01 沈阳铁路分局开原车务段开原站车站值班员\r\n2003.01\u20142005.02 沈阳铁路分局铁岭车务段开原站值班站长\r\n2005.02\u20142005.07 沈阳铁路局沈阳分局铁岭车务段满井站站长\r\n2005.07\u20142006.07 沈阳铁路局沈阳车务段中固站站长（其间：2004.12-2006.06在北京交通大学交通运输专业在职学习，取得大专学历）\r\n2006.07\u20142006.11 沈阳铁路局沈阳车务段得胜台站副站长\r\n2006.11\u20142008.06 沈阳铁路局沈阳车务段得胜台站站长\r\n2008.06\u20142008.12 沈阳铁路局沈阳车务段得胜台站站长（2008.06股级，沈车岗[2008]225号）\r\n2008.12\u20142009.09 沈阳铁路局沈阳车务段得胜台站站长兼技术员\r\n2009.09\u20142011.12 沈阳铁路局沈阳车务段技术和统计科技术员\r\n2011.12\u20142015.02 沈阳铁路局沈阳车务段技术和统计科助理工程师（2011.09-2014.07北京交通大学交通运输专业在职学习，取得大学本科学历）\r\n2015.02\u2014　　　　沈阳铁路局沈阳车务段职工教育科副科长兼助理工程师（2015.02副科级，沈车人聘[2015]38号）\r\n","ch":0,"zg":0,"pym":"gsq","zb":0,"cert_id":null,"cancel_status":0,"hj":0,"dept_type":11,"id_card":"211222197301260211","last_login_ip":null,"education":"本科","ljy":0,"id":219460,"name":"关绍强","sso_app_name":null,"outbox_do_sort":"CREATE_DATE2","ethnic":"汉","political":"党员","working_time":null,"last_login_time":"2017-07-29 19:12:14","yb":0,"duty_name":null,"photo":null,"dcz":0,"login_count":1440}
     * zdList : [{"pym":"ascwd","dbm":null,"class_name":"日勤制(日)","type":1,"cognizance_user_id":null,"class_select":0,"id":750,"level":3,"name":"鞍山车务段","response_user_id":9630,"safe_overtime":999,"equdepartment":0,"leader_user_id":5209,"property":null,"pid":195,"available":1,"code":"000100090006","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":197942,"start_date":null},{"pym":"bccwd","dbm":null,"class_name":"日勤制(日)","type":1,"cognizance_user_id":null,"class_select":0,"id":2148,"level":3,"name":"白城车务段","response_user_id":32858,"safe_overtime":24,"equdepartment":0,"leader_user_id":22416,"property":null,"pid":195,"available":1,"code":"000100090013","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":243159,"start_date":null},{"pym":"bxcwd","dbm":null,"class_name":"日勤制(日)","type":1,"cognizance_user_id":null,"class_select":0,"id":1383,"level":3,"name":"本溪车务段","response_user_id":32856,"safe_overtime":9999,"equdepartment":0,"leader_user_id":12151,"property":null,"pid":195,"available":1,"code":"000100090009","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":209258,"start_date":null},{"pym":"zccwd","dbm":null,"class_name":"日勤制(日)","type":1,"cognizance_user_id":null,"class_select":0,"id":7020,"level":3,"name":"长春车务段","response_user_id":264948,"safe_overtime":2400,"equdepartment":0,"leader_user_id":264949,"property":null,"pid":195,"available":1,"code":"000100090031","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":229732,"start_date":null},{"pym":"cfcwd","dbm":null,"class_name":"日勤制(日)","type":1,"cognizance_user_id":null,"class_select":0,"id":1507,"level":3,"name":"赤峰车务段","response_user_id":32857,"safe_overtime":2000,"equdepartment":0,"leader_user_id":null,"property":null,"pid":195,"available":1,"code":"000100090010","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":1,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":235215,"start_date":null},{"pym":"dlcwd","dbm":null,"class_name":"日勤制(日)","type":1,"cognizance_user_id":null,"class_select":0,"id":1019,"level":3,"name":"大连车务段","response_user_id":9631,"safe_overtime":null,"equdepartment":0,"leader_user_id":7732,"property":null,"pid":195,"available":1,"code":"000100090008","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":1,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":258605,"start_date":null},{"pym":"fxcwd","dbm":null,"class_name":"日勤制(日)","type":1,"cognizance_user_id":null,"class_select":0,"id":2420,"level":3,"name":"阜新车务段","response_user_id":32859,"safe_overtime":48,"equdepartment":0,"leader_user_id":null,"property":null,"pid":195,"available":1,"code":"000100090014","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":194939,"start_date":null},{"pym":"hlglcwd","dbm":null,"class_name":"日勤制(日)","type":1,"cognizance_user_id":null,"class_select":0,"id":7226,"level":3,"name":"霍林郭勒车务段","response_user_id":null,"safe_overtime":3000,"equdepartment":0,"leader_user_id":null,"property":null,"pid":195,"available":1,"code":"000100090032","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":1,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":266825,"start_date":null},{"pym":"jlcwd","dbm":null,"class_name":"日勤制(日)","type":1,"cognizance_user_id":null,"class_select":0,"id":2805,"level":3,"name":"吉林车务段","response_user_id":32860,"safe_overtime":200,"equdepartment":0,"leader_user_id":null,"property":null,"pid":195,"available":1,"code":"000100090015","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":219618,"start_date":null},{"pym":"jzcwd","dbm":null,"class_name":"日勤制(日)","type":1,"cognizance_user_id":null,"class_select":0,"id":3147,"level":3,"name":"锦州车务段","response_user_id":263025,"safe_overtime":4800,"equdepartment":0,"leader_user_id":null,"property":null,"pid":195,"available":1,"code":"000100090017","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":1,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":214010,"start_date":null},{"pym":"mhkcwd","dbm":null,"class_name":"日勤制(日)","type":1,"cognizance_user_id":null,"class_select":0,"id":3413,"level":3,"name":"梅河口车务段","response_user_id":263024,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":195,"available":1,"code":"000100090019","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":191461,"start_date":null},{"pym":"sycwd","dbm":null,"class_name":"日勤制(日)","type":1,"cognizance_user_id":null,"class_select":0,"id":3862,"level":3,"name":"沈阳车务段","response_user_id":263023,"safe_overtime":2400,"equdepartment":0,"leader_user_id":45402,"property":null,"pid":195,"available":1,"code":"000100090022","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":1,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":219160,"start_date":null},{"pym":"thcwd","dbm":null,"class_name":"日勤制(日)","type":1,"cognizance_user_id":null,"class_select":0,"id":4842,"level":3,"name":"通化车务段","response_user_id":263679,"safe_overtime":0,"equdepartment":0,"leader_user_id":null,"property":null,"pid":195,"available":1,"code":"000100090026","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":189621,"start_date":null},{"pym":"tlcwd","dbm":null,"class_name":"日勤制(日)","type":1,"cognizance_user_id":null,"class_select":0,"id":5096,"level":3,"name":"通辽车务段","response_user_id":null,"safe_overtime":480,"equdepartment":0,"leader_user_id":null,"property":null,"pid":195,"available":1,"code":"000100090027","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":1,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":191688,"start_date":null},{"pym":"yjcwd","dbm":null,"class_name":"日勤制(日)","type":1,"cognizance_user_id":null,"class_select":0,"id":6426,"level":3,"name":"延吉车务段","response_user_id":null,"safe_overtime":48,"equdepartment":0,"leader_user_id":null,"property":null,"pid":195,"available":1,"code":"000100090029","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":1,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":264389,"start_date":null}]
     */

    private String month;
    private UserBean user;
    private List<ListBean> list;
    private List<ZdListBean> zdList;

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

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public List<ZdListBean> getZdList() {
        return zdList;
    }

    public void setZdList(List<ZdListBean> zdList) {
        this.zdList = zdList;
    }

    public static class UserBean {
        /**
         * birth : 19730126
         * dept_name4 : 安全科
         * dept_name3 : 沈阳车务段
         * dept_name1 : 沈阳铁路局
         * sso_uuid : 1FDB15F0045146558569994ADC5645BC
         * leader_type : 2
         * quan_post_name : null
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
         * dept_name : 安全科
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
         * 6502 : 0
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
         * last_login_time : 2017-07-29 19:12:14
         * yb : 0
         * duty_name : null
         * photo : null
         * dcz : 0
         * login_count : 1440
         */

        private String birth;
        private String dept_name4;
        private String dept_name3;
        private String dept_name1;
        private String sso_uuid;
        private int leader_type;
        private Object quan_post_name;
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

    public static class ListBean {
        /**
         * dynamic : 0
         * content : 每月检查接发列车
         * id : 1279
         * normal_done : 0
         * count : 0
         * normal : 4
         * dynamic_done : 0
         * extra_done : 0
         * minus_score : 5
         * pre_id : 845085
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

    public static class ZdListBean {
        /**
         * pym : ascwd
         * dbm : null
         * class_name : 日勤制(日)
         * type : 1
         * cognizance_user_id : null
         * class_select : 0
         * id : 750
         * level : 3
         * name : 鞍山车务段
         * response_user_id : 9630
         * safe_overtime : 999
         * equdepartment : 0
         * leader_user_id : 5209
         * property : null
         * pid : 195
         * available : 1
         * code : 000100090006
         * station_level : null
         * deleted : 0
         * url : null
         * risk_ctrl_code : null
         * class_id : 1
         * problem_auto_audot : 0
         * create_time : 2017-02-06 09:18:03
         * unit_type : 1
         * document_user : 197942
         * start_date : null
         */

        private String pym;
        private Object dbm;
        private String class_name;
        private int type;
        private Object cognizance_user_id;
        private int class_select;
        private int id;
        private int level;
        private String name;
        private int response_user_id;
        private int safe_overtime;
        private int equdepartment;
        private int leader_user_id;
        private Object property;
        private int pid;
        private int available;
        private String code;
        private Object station_level;
        private int deleted;
        private Object url;
        private Object risk_ctrl_code;
        private int class_id;
        private int problem_auto_audot;
        private String create_time;
        private int unit_type;
        private int document_user;
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

        public String getClass_name() {
            return class_name;
        }

        public void setClass_name(String class_name) {
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

        public int getResponse_user_id() {
            return response_user_id;
        }

        public void setResponse_user_id(int response_user_id) {
            this.response_user_id = response_user_id;
        }

        public int getSafe_overtime() {
            return safe_overtime;
        }

        public void setSafe_overtime(int safe_overtime) {
            this.safe_overtime = safe_overtime;
        }

        public int getEqudepartment() {
            return equdepartment;
        }

        public void setEqudepartment(int equdepartment) {
            this.equdepartment = equdepartment;
        }

        public int getLeader_user_id() {
            return leader_user_id;
        }

        public void setLeader_user_id(int leader_user_id) {
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

        public int getClass_id() {
            return class_id;
        }

        public void setClass_id(int class_id) {
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

        public int getUnit_type() {
            return unit_type;
        }

        public void setUnit_type(int unit_type) {
            this.unit_type = unit_type;
        }

        public int getDocument_user() {
            return document_user;
        }

        public void setDocument_user(int document_user) {
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
