package com.xianzhi.integration.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @Administrator LiBo.
 * @Date 2017/7/21.
 * @Function
 */

public class CadreAssessBean implements Serializable {

    private int num;
    private int size;
    private String date;
    private int status;
    private String name;
    /**
     * page : {"lastPage":true,"pageSize":50,"pageNumber":1,"firstPage":true,"list":[{"birth":"20170124","dept_name4":"安全科","dept_name3":"沈阳车务段","sso_uuid":"9BCA50CE85854539BAD347B10643AC9E","leader_type":1,"quan_post_name":"测试日勤岗","bzb":0,"dept_full_name":"沈阳铁路局-运输处-沈阳车务段-安全科","laid_off_time":null,"dept_name7":null,"dept_name5":null,"dept_name6":null,"dept_code7":null,"ctc":0,"dept_code6":null,"user_type_name":"在岗工作","dept_code5":null,"dept_code4":"0001000900220008","seniority1":null,"dept_code3":"000100090022","month":"2017-07","pm":0,"isshangbao":"0","comment1":"是打发撒大姐夫骷髅精灵","comment2":"圣诞节疯狂就爱上了科技离开","position":3877,"dt":0,"sys":0,"fhy":0,"lw":0,"zdz":0,"is_leadership":1,"start_work_date":"20370124","dept_id":3870,"dg":0,"token":"098CDE226D8638E59D8727C5AA738F21","leader_id3":189516,"ccsj":0,"position_duty":null,"leader_id1":189516,"leader_id2":189516,"dept_cwd_or_stn_name":"沈阳车务段","dept_station_code":null,"approve_time2":"2017-07-19 09:58:25","post":1,"approve_time1":"2017-07-19 09:57:14","approve_time3":"2017-07-19 09:58:42","dept_station_name":null,"technical_level":null,"dept_name":"沈阳铁路局-运输处-沈阳车务段-安全科","approve_id":30816,"labor":null,"dept_cwd_or_stn_code":"000100090022","feeling":null,"login_name":"admin-sycwd","user_type_id":1,"lzh":"189516","cb":0,"card_number":null,"tel":null,"tf":0,"quan_post_id":104,"type":0,"remark1":null,"password":"C4CA4238A0B923820DCC509A6F75849B","remark3":null,"remark2":null,"is_leader":0,"gender":1,"inbox_do_sort":"SEND_USER1","dept_cwd_name":"沈阳车务段","seniority":1,"post_name":"空","dc":0,"technical_level_name":null,"status":1,"jsj":0,"dept_code":"0001000900220008","key_person_mark":0,"leader_type_name":"专业技术","deleted":0,"6502":0,"position_name":"工程师","email":null,"dept_cwd_code":"000100090022","create_time":"2017-01-24 23:37:14","work_experience":null,"ch":0,"pym":"sycwdgly","zg":0,"zb":0,"cert_id":null,"cancel_status":0,"hj":0,"dept_type":11,"last_login_ip":null,"id_card":"admin-sycwd","education":"本科","ljy":0,"id":189516,"rownum_":1,"name":"沈阳车务段管理员","sso_app_name":null,"user_id":189516,"outbox_do_sort":"CREATE_DATE2","ethnic":null,"final_level_name":"二级","political":null,"last_login_time":"2017-07-21 10:14:11","working_time":null,"yb":0,"edit":1,"photo":null,"final_score":95,"dcz":0,"login_count":5034}],"totalRow":1,"totalPage":1}
     * month : 2017-07
     * zdList : [{"pym":"ascwd","dbm":null,"class_name":null,"type":1,"cognizance_user_id":null,"class_select":0,"id":750,"level":3,"name":"鞍山车务段","response_user_id":9630,"safe_overtime":999,"equdepartment":0,"leader_user_id":5209,"property":null,"pid":195,"available":1,"code":"000100090006","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":197942,"start_date":null},{"pym":"bccwd","dbm":null,"class_name":null,"type":1,"cognizance_user_id":null,"class_select":0,"id":2148,"level":3,"name":"白城车务段","response_user_id":32858,"safe_overtime":24,"equdepartment":0,"leader_user_id":22416,"property":null,"pid":195,"available":1,"code":"000100090013","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":243159,"start_date":null},{"pym":"bxcwd","dbm":null,"class_name":null,"type":1,"cognizance_user_id":null,"class_select":0,"id":1383,"level":3,"name":"本溪车务段","response_user_id":32856,"safe_overtime":9999,"equdepartment":0,"leader_user_id":12151,"property":null,"pid":195,"available":1,"code":"000100090009","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":209258,"start_date":null},{"pym":"zccwd","dbm":null,"class_name":null,"type":1,"cognizance_user_id":null,"class_select":0,"id":7020,"level":3,"name":"长春车务段","response_user_id":264948,"safe_overtime":2400,"equdepartment":0,"leader_user_id":264949,"property":null,"pid":195,"available":1,"code":"000100090031","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":229732,"start_date":null},{"pym":"cfcwd","dbm":null,"class_name":null,"type":1,"cognizance_user_id":null,"class_select":0,"id":1507,"level":3,"name":"赤峰车务段","response_user_id":32857,"safe_overtime":2000,"equdepartment":0,"leader_user_id":null,"property":null,"pid":195,"available":1,"code":"000100090010","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":null,"problem_auto_audot":1,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":235215,"start_date":null},{"pym":"dlcwd","dbm":null,"class_name":null,"type":1,"cognizance_user_id":null,"class_select":0,"id":1019,"level":3,"name":"大连车务段","response_user_id":9631,"safe_overtime":null,"equdepartment":0,"leader_user_id":7732,"property":null,"pid":195,"available":1,"code":"000100090008","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":null,"problem_auto_audot":1,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":258605,"start_date":null},{"pym":"fxcwd","dbm":null,"class_name":null,"type":1,"cognizance_user_id":null,"class_select":0,"id":2420,"level":3,"name":"阜新车务段","response_user_id":32859,"safe_overtime":48,"equdepartment":0,"leader_user_id":null,"property":null,"pid":195,"available":1,"code":"000100090014","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":194939,"start_date":null},{"pym":"hlglcwd","dbm":null,"class_name":null,"type":1,"cognizance_user_id":null,"class_select":0,"id":7226,"level":3,"name":"霍林郭勒车务段","response_user_id":null,"safe_overtime":3000,"equdepartment":0,"leader_user_id":null,"property":null,"pid":195,"available":1,"code":"000100090032","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":null,"problem_auto_audot":1,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":266825,"start_date":null},{"pym":"jlcwd","dbm":null,"class_name":null,"type":1,"cognizance_user_id":null,"class_select":0,"id":2805,"level":3,"name":"吉林车务段","response_user_id":32860,"safe_overtime":200,"equdepartment":0,"leader_user_id":null,"property":null,"pid":195,"available":1,"code":"000100090015","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":219618,"start_date":null},{"pym":"jzcwd","dbm":null,"class_name":null,"type":1,"cognizance_user_id":null,"class_select":0,"id":3147,"level":3,"name":"锦州车务段","response_user_id":263025,"safe_overtime":4800,"equdepartment":0,"leader_user_id":null,"property":null,"pid":195,"available":1,"code":"000100090017","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":null,"problem_auto_audot":1,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":214010,"start_date":null},{"pym":"mhkcwd","dbm":null,"class_name":null,"type":1,"cognizance_user_id":null,"class_select":0,"id":3413,"level":3,"name":"梅河口车务段","response_user_id":263024,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":195,"available":1,"code":"000100090019","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":191461,"start_date":null},{"pym":"sycwd","dbm":null,"class_name":null,"type":1,"cognizance_user_id":null,"class_select":0,"id":3862,"level":3,"name":"沈阳车务段","response_user_id":263023,"safe_overtime":2400,"equdepartment":0,"leader_user_id":45402,"property":null,"pid":195,"available":1,"code":"000100090022","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":null,"problem_auto_audot":1,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":219160,"start_date":null},{"pym":"thcwd","dbm":null,"class_name":null,"type":1,"cognizance_user_id":null,"class_select":0,"id":4842,"level":3,"name":"通化车务段","response_user_id":263679,"safe_overtime":0,"equdepartment":0,"leader_user_id":null,"property":null,"pid":195,"available":1,"code":"000100090026","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":189621,"start_date":null},{"pym":"tlcwd","dbm":null,"class_name":null,"type":1,"cognizance_user_id":null,"class_select":0,"id":5096,"level":3,"name":"通辽车务段","response_user_id":null,"safe_overtime":480,"equdepartment":0,"leader_user_id":null,"property":null,"pid":195,"available":1,"code":"000100090027","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":null,"problem_auto_audot":1,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":191688,"start_date":null},{"pym":"yjcwd","dbm":null,"class_name":null,"type":1,"cognizance_user_id":null,"class_select":0,"id":6426,"level":3,"name":"延吉车务段","response_user_id":null,"safe_overtime":48,"equdepartment":0,"leader_user_id":null,"property":null,"pid":195,"available":1,"code":"000100090029","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":264389,"start_date":null}]
     */

    private PageBean page;
    private String month;
    private List<ZdListBean> zdList;

    public CadreAssessBean() {
    }

    public CadreAssessBean(int num, int size, String date, int status, String name) {
        this.num = num;
        this.size = size;
        this.date = date;
        this.status = status;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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

    public PageBean getPage() {
        return page;
    }

    public void setPage(PageBean page) {
        this.page = page;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public List<ZdListBean> getZdList() {
        return zdList;
    }

    public void setZdList(List<ZdListBean> zdList) {
        this.zdList = zdList;
    }

    public static class PageBean {
        /**
         * lastPage : true
         * pageSize : 50
         * pageNumber : 1
         * firstPage : true
         * list : [{"birth":"20170124","dept_name4":"安全科","dept_name3":"沈阳车务段","sso_uuid":"9BCA50CE85854539BAD347B10643AC9E","leader_type":1,"quan_post_name":"测试日勤岗","bzb":0,"dept_full_name":"沈阳铁路局-运输处-沈阳车务段-安全科","laid_off_time":null,"dept_name7":null,"dept_name5":null,"dept_name6":null,"dept_code7":null,"ctc":0,"dept_code6":null,"user_type_name":"在岗工作","dept_code5":null,"dept_code4":"0001000900220008","seniority1":null,"dept_code3":"000100090022","month":"2017-07","pm":0,"isshangbao":"0","comment1":"是打发撒大姐夫骷髅精灵","comment2":"圣诞节疯狂就爱上了科技离开","position":3877,"dt":0,"sys":0,"fhy":0,"lw":0,"zdz":0,"is_leadership":1,"start_work_date":"20370124","dept_id":3870,"dg":0,"token":"098CDE226D8638E59D8727C5AA738F21","leader_id3":189516,"ccsj":0,"position_duty":null,"leader_id1":189516,"leader_id2":189516,"dept_cwd_or_stn_name":"沈阳车务段","dept_station_code":null,"approve_time2":"2017-07-19 09:58:25","post":1,"approve_time1":"2017-07-19 09:57:14","approve_time3":"2017-07-19 09:58:42","dept_station_name":null,"technical_level":null,"dept_name":"沈阳铁路局-运输处-沈阳车务段-安全科","approve_id":30816,"labor":null,"dept_cwd_or_stn_code":"000100090022","feeling":null,"login_name":"admin-sycwd","user_type_id":1,"lzh":"189516","cb":0,"card_number":null,"tel":null,"tf":0,"quan_post_id":104,"type":0,"remark1":null,"password":"C4CA4238A0B923820DCC509A6F75849B","remark3":null,"remark2":null,"is_leader":0,"gender":1,"inbox_do_sort":"SEND_USER1","dept_cwd_name":"沈阳车务段","seniority":1,"post_name":"空","dc":0,"technical_level_name":null,"status":1,"jsj":0,"dept_code":"0001000900220008","key_person_mark":0,"leader_type_name":"专业技术","deleted":0,"6502":0,"position_name":"工程师","email":null,"dept_cwd_code":"000100090022","create_time":"2017-01-24 23:37:14","work_experience":null,"ch":0,"pym":"sycwdgly","zg":0,"zb":0,"cert_id":null,"cancel_status":0,"hj":0,"dept_type":11,"last_login_ip":null,"id_card":"admin-sycwd","education":"本科","ljy":0,"id":189516,"rownum_":1,"name":"沈阳车务段管理员","sso_app_name":null,"user_id":189516,"outbox_do_sort":"CREATE_DATE2","ethnic":null,"final_level_name":"二级","political":null,"last_login_time":"2017-07-21 10:14:11","working_time":null,"yb":0,"edit":1,"photo":null,"final_score":95,"dcz":0,"login_count":5034}]
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
             * month : 2017-07
             * pm : 0
             * isshangbao : 0
             * comment1 : 是打发撒大姐夫骷髅精灵
             * comment2 : 圣诞节疯狂就爱上了科技离开
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
             * approve_time2 : 2017-07-19 09:58:25
             * post : 1
             * approve_time1 : 2017-07-19 09:57:14
             * approve_time3 : 2017-07-19 09:58:42
             * dept_station_name : null
             * technical_level : null
             * dept_name : 沈阳铁路局-运输处-沈阳车务段-安全科
             * approve_id : 30816
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
             * final_level_name : 二级
             * political : null
             * last_login_time : 2017-07-21 10:14:11
             * working_time : null
             * yb : 0
             * edit : 1
             * photo : null
             * final_score : 95
             * dcz : 0
             * login_count : 5034
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
            private String dept_name7;
            private String dept_name5;
            private String dept_name6;
            private String dept_code7;
            private int ctc;
            private Object dept_code6;
            private String user_type_name;
            private String dept_code5;
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
            private String dept_name;
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

            public String getDept_name7() {
                return dept_name7;
            }

            public void setDept_name7(String dept_name7) {
                this.dept_name7 = dept_name7;
            }

            public String getDept_name5() {
                return dept_name5;
            }

            public void setDept_name5(String dept_name5) {
                this.dept_name5 = dept_name5;
            }

            public String getDept_name6() {
                return dept_name6;
            }

            public void setDept_name6(String dept_name6) {
                this.dept_name6 = dept_name6;
            }

            public String getDept_code7() {
                return dept_code7;
            }

            public void setDept_code7(String dept_code7) {
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

            public void setDept_code5(String dept_code5) {
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

            public String getDept_name() {
                return dept_name;
            }

            public void setDept_name(String dept_name) {
                this.dept_name = dept_name;
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

    public static class ZdListBean {
        /**
         * pym : ascwd
         * dbm : null
         * class_name : null
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
         * class_id : null
         * problem_auto_audot : 0
         * create_time : 2017-02-06 09:18:03
         * unit_type : 1
         * document_user : 197942
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
        private Object class_id;
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
