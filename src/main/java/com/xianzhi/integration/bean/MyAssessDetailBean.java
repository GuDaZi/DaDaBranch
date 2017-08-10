package com.xianzhi.integration.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @Administrator LiBo.
 * @Date 2017/7/17.
 * @Function
 */

public class MyAssessDetailBean implements Serializable {

    private String itemId;
    private int number;
    private int size;
    private String isSubmit;
    /**
     * personalAssessmentInfo : {"dynamic":0,"id":844557,"content":"每月检查接发列车","normal_done":2,"normal":2,"dynamic_done":0,"month":"2017-07","extra_done":2,"user_id":189516,"risk_control_id":1279}
     * page : {"lastPage":true,"pageSize":50,"pageNumber":1,"firstPage":true,"list":[{"sjzx_update_time":null,"user_dept_name":"安全科","user_dept_id":3870,"is_bbm":1,"risk_point_id":2795,"place_type_id":7796,"zrsta_name":"安全科","sjzx_update_username":null,"id":1690599,"dept_id":3870,"time":"2017-07-04 20:49:55","rownum_":1,"opinion":null,"user_id":189516,"place":"科室","leader_dept_code":null,"is_ks":1,"place_id":14182,"user_position":null,"place_type":"科室","pre_assessment_id":844557,"status":5,"sjzx_update_useruuid":null,"dept_name":"安全科","sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","risk_type_id":2794,"leader_dept_id":null,"content":"testsycwd","user_name":"沈阳车务段管理员","flag":1,"leader_id":null,"risk_point_name":"吸烟","risk_type_name":"消防安全","month":"2017-07","create_time":"2017-07-04 20:50:11","sjzx_create_username":"沈阳车务段管理员","sjzx_create_time":"2017-07-04 20:50:11","zrsta_id":3870,"unit_code":"0001000900220008"},{"sjzx_update_time":null,"user_dept_name":"安全科","user_dept_id":3870,"is_bbm":0,"risk_point_id":2795,"place_type_id":7791,"zrsta_name":"党群办","sjzx_update_username":null,"id":1690636,"dept_id":3865,"time":"2017-07-06 21:22:47","rownum_":2,"opinion":null,"user_id":189516,"place":"科室","leader_dept_code":null,"is_ks":1,"place_id":14172,"user_position":null,"place_type":"科室","pre_assessment_id":844557,"status":5,"sjzx_update_useruuid":null,"dept_name":"党群办","sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","risk_type_id":2794,"leader_dept_id":null,"content":"1111","user_name":"沈阳车务段管理员","flag":1,"leader_id":null,"risk_point_name":"吸烟","risk_type_name":"消防安全","month":"2017-07","create_time":"2017-07-06 21:23:02","sjzx_create_username":"沈阳车务段管理员","sjzx_create_time":"2017-07-06 21:22:54","zrsta_id":3865,"unit_code":"0001000900220008"},{"sjzx_update_time":null,"user_dept_name":"安全科","user_dept_id":3870,"is_bbm":0,"risk_point_id":2863,"place_type_id":7836,"zrsta_name":"转弯桥站","sjzx_update_username":null,"id":1690694,"dept_id":3876,"time":"2017-07-13 11:04:36","rownum_":3,"opinion":null,"user_id":189516,"place":"行车室","leader_dept_code":null,"is_ks":1,"place_id":7837,"user_position":null,"place_type":"站内","pre_assessment_id":844557,"status":3,"sjzx_update_useruuid":null,"dept_name":"转弯桥站","sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","risk_type_id":2861,"leader_dept_id":null,"content":"asdf","user_name":"沈阳车务段管理员","flag":0,"leader_id":null,"risk_point_name":"残留物、漂浮物","risk_type_name":"货检车号","month":"2017-07","create_time":"2017-07-13 11:04:55","sjzx_create_username":"沈阳车务段管理员","sjzx_create_time":"2017-07-13 11:04:48","zrsta_id":3876,"unit_code":"0001000900220008"},{"sjzx_update_time":null,"user_dept_name":"安全科","user_dept_id":3870,"is_bbm":0,"risk_point_id":2795,"place_type_id":7836,"zrsta_name":"转弯桥站","sjzx_update_username":null,"id":1690736,"dept_id":3876,"time":"2017-07-13 16:45:23","rownum_":4,"opinion":null,"user_id":189516,"place":"站台","leader_dept_code":null,"is_ks":1,"place_id":7838,"user_position":null,"place_type":"站内","pre_assessment_id":844557,"status":3,"sjzx_update_useruuid":null,"dept_name":"转弯桥站","sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","risk_type_id":2794,"leader_dept_id":null,"content":"asdf","user_name":"沈阳车务段管理员","flag":0,"leader_id":null,"risk_point_name":"吸烟","risk_type_name":"消防安全","month":"2017-07","create_time":"2017-07-13 16:45:34","sjzx_create_username":"沈阳车务段管理员","sjzx_create_time":"2017-07-13 16:45:26","zrsta_id":3876,"unit_code":"0001000900220008"}],"totalRow":4,"totalPage":1}
     * permission : {"aqwtxdwh":1,"hywh":1,"ldyg_scl":1,"xtgl":1,"gwgl":1,"khjjfgl":1,"bmkhdjsz1":1,"glzdgl":1,"zdgzsc":1,"view_basic_shop":1,"fxkzb":1,"gwfxdwh":1,"aqyhwh":1,"rygl":1,"bmqtkhsz":1,"gx_jjbtj":1,"view_basic_show":1,"sbmcwh":1,"edit_safe_problem":1,"fqhd":1,"view_basic_equipment_check":1,"view_basic_book":1,"gx_bzzblr":1,"view_basic_card":1,"aqfxkzb":1,"gbkhsp":1,"edit_basic_czzby":1,"edit_basic_produce_target":1,"csxzwh":1,"equip_del":1,"hygl":1,"reset_password":1,"zdspwh":1,"gwwh":1,"khfsydj":1,"gbkhsz":1,"hylbwh":1,"edit_basic_equipment_check":1,"aqszgl":1,"glzdflgl":1,"qywhfb":1,"dwglwh":1,"gjsjwh":1,"gxkh":1,"jsgzflwh":1,"jsdjgl":1,"ythkhpdbsz":1,"ythkhsz":1,"gx_kqcx":1,"view_basic_produce_target":1,"dbxxsc":1,"gbydykhb":1,"khsz":1,"glzdwh":1,"hyxj":1,"lwwtkh":1,"view_basic_ctc":1,"gwfcfb":1,"zmgl":1,"gbkhbh":1,"safe_danger_approval":1,"dbfb":1,"gx_jjblr":1,"cwdfcwh":1,"fjtjgl":1,"edit_basic_czzbywh":1,"bmkhhz":1,"cwdfc":1,"gx_kq":1,"hysz":1,"qywhwh":1,"gx_kqfh":1,"lwwtzsxs":1,"gzllr":1,"awhzdgzwh":1,"db":1,"xwdt":1,"edit_basic_shop":1,"ythcxyqr":1,"edit_basic_team":1,"jsgl":1,"wtxzlxwh":1,"edit_basic_czzbygl":1,"glzdxj":1,"bmythkh":1,"view_basic_czzby":1,"aqyhsc":1,"ldscl":1,"edit_basic_equipment_construction":1,"cwdfcfb":1,"sbgyswh":1,"safe_problem_signed":1,"edit_basic_station":1,"fbfc":1,"view_basic_equipment_construction":1,"ddgl":1,"stn_approval_dpzr":1,"szkhzq":1,"sgtzsz":1,"sbflwh":1,"sbwh":1,"qywh":1,"edit_basic_show":1,"jcglfzxs":1,"jsgzgl":1,"dbwh":1,"bgtfb":1,"jsgzwh":1,"ythkhpd":1,"bgtwh":1,"gx_gzsh":1,"wtxzlbwh":1,"gbqpfsz":1,"czglkh":1,"sbssbm":1,"equip_view":1,"yhgl":1,"bmkhdjsz":1,"bcwh":1,"edit_basic_ctc":1,"bgt":1,"view_basic_station":1,"gx_sxbsj":1,"sbglbfwh":1,"view_basic_team":1,"edit_basic_card":1,"jsgzxj":1,"gzl":1}
     * user : {"lzh":"189516","birth":"20170124","cb":0,"dept_name4":"安全科","dept_name3":"沈阳车务段","card_number":null,"dept_name1":"沈阳铁路局","tel":null,"tf":0,"quan_post_id":104,"remark1":null,"type":0,"password":"C4CA4238A0B923820DCC509A6F75849B","sso_uuid":"9BCA50CE85854539BAD347B10643AC9E","remark3":null,"leader_type":1,"remark2":null,"quan_post_name":"测试日勤岗","bzb":0,"dept_full_name":"沈阳铁路局-运输处-沈阳车务段-安全科","is_leader":0,"dept_name7":null,"gender":1,"dept_name5":null,"inbox_do_sort":"SEND_USER1","dept_cwd_name":"沈阳车务段","dept_name6":null,"post_name":"空","seniority":1,"dc":0,"technical_level_name":null,"user_type":"在岗工作","jsj":0,"dept_code":"0001000900220008","key_person_mark":0,"leader_type_name":"专业技术","6502":0,"deleted":0,"dept_code7":null,"position_name":"工程师","ctc":0,"dept_code6":null,"dept_code5":null,"dept_code4":"0001000900220008","seniority1":null,"dept_code3":"000100090022","email":null,"dept_cwd_code":"000100090022","create_time":"2017-01-24 23:37:14","isshangbao":"0","pm":0,"ch":0,"work_experience":null,"dt":0,"position":3877,"pym":"sycwdgly","zg":0,"zb":0,"sys":0,"fhy":0,"cert_id":null,"zdz":0,"dept_type":11,"lw":0,"hj":0,"last_login_ip":null,"id_card":"admin-sycwd","education":"本科","ljy":0,"is_leadership":1,"start_work_date":"20370124","id":189516,"dg":0,"dept_id":3870,"token":"098CDE226D8638E59D8727C5AA738F21","name":"沈阳车务段管理员","ccsj":0,"position_duty":null,"sso_app_name":null,"dept_cwd_or_stn_name":"沈阳车务段","dept_station_code":null,"outbox_do_sort":"CREATE_DATE2","ethnic":null,"post":1,"political":null,"last_login_time":"2017-07-17 16:05:14","working_time":null,"yb":0,"dept_station_name":null,"technical_level":null,"dept_name":"安全科","photo":null,"labor":null,"dept_cwd_or_stn_code":"000100090022","feeling":null,"login_name":"admin-sycwd","dcz":0,"login_count":4009}
     */

    private PersonalAssessmentInfoBean personalAssessmentInfo;
    private PageBean page;
    private PermissionBean permission;
    private UserBean user;

    public MyAssessDetailBean() {
    }

    public MyAssessDetailBean(String itemId, int number, int size, String isSubmit) {
        this.itemId = itemId;
        this.number = number;
        this.size = size;
        this.isSubmit = isSubmit;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getIsSubmit() {
        return isSubmit;
    }

    public void setIsSubmit(String isSubmit) {
        this.isSubmit = isSubmit;
    }

    public PersonalAssessmentInfoBean getPersonalAssessmentInfo() {
        return personalAssessmentInfo;
    }

    public void setPersonalAssessmentInfo(PersonalAssessmentInfoBean personalAssessmentInfo) {
        this.personalAssessmentInfo = personalAssessmentInfo;
    }

    public PageBean getPage() {
        return page;
    }

    public void setPage(PageBean page) {
        this.page = page;
    }

    public PermissionBean getPermission() {
        return permission;
    }

    public void setPermission(PermissionBean permission) {
        this.permission = permission;
    }

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
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

    public static class PageBean {
        /**
         * lastPage : true
         * pageSize : 50
         * pageNumber : 1
         * firstPage : true
         * list : [{"sjzx_update_time":null,"user_dept_name":"安全科","user_dept_id":3870,"is_bbm":1,"risk_point_id":2795,"place_type_id":7796,"zrsta_name":"安全科","sjzx_update_username":null,"id":1690599,"dept_id":3870,"time":"2017-07-04 20:49:55","rownum_":1,"opinion":null,"user_id":189516,"place":"科室","leader_dept_code":null,"is_ks":1,"place_id":14182,"user_position":null,"place_type":"科室","pre_assessment_id":844557,"status":5,"sjzx_update_useruuid":null,"dept_name":"安全科","sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","risk_type_id":2794,"leader_dept_id":null,"content":"testsycwd","user_name":"沈阳车务段管理员","flag":1,"leader_id":null,"risk_point_name":"吸烟","risk_type_name":"消防安全","month":"2017-07","create_time":"2017-07-04 20:50:11","sjzx_create_username":"沈阳车务段管理员","sjzx_create_time":"2017-07-04 20:50:11","zrsta_id":3870,"unit_code":"0001000900220008"},{"sjzx_update_time":null,"user_dept_name":"安全科","user_dept_id":3870,"is_bbm":0,"risk_point_id":2795,"place_type_id":7791,"zrsta_name":"党群办","sjzx_update_username":null,"id":1690636,"dept_id":3865,"time":"2017-07-06 21:22:47","rownum_":2,"opinion":null,"user_id":189516,"place":"科室","leader_dept_code":null,"is_ks":1,"place_id":14172,"user_position":null,"place_type":"科室","pre_assessment_id":844557,"status":5,"sjzx_update_useruuid":null,"dept_name":"党群办","sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","risk_type_id":2794,"leader_dept_id":null,"content":"1111","user_name":"沈阳车务段管理员","flag":1,"leader_id":null,"risk_point_name":"吸烟","risk_type_name":"消防安全","month":"2017-07","create_time":"2017-07-06 21:23:02","sjzx_create_username":"沈阳车务段管理员","sjzx_create_time":"2017-07-06 21:22:54","zrsta_id":3865,"unit_code":"0001000900220008"},{"sjzx_update_time":null,"user_dept_name":"安全科","user_dept_id":3870,"is_bbm":0,"risk_point_id":2863,"place_type_id":7836,"zrsta_name":"转弯桥站","sjzx_update_username":null,"id":1690694,"dept_id":3876,"time":"2017-07-13 11:04:36","rownum_":3,"opinion":null,"user_id":189516,"place":"行车室","leader_dept_code":null,"is_ks":1,"place_id":7837,"user_position":null,"place_type":"站内","pre_assessment_id":844557,"status":3,"sjzx_update_useruuid":null,"dept_name":"转弯桥站","sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","risk_type_id":2861,"leader_dept_id":null,"content":"asdf","user_name":"沈阳车务段管理员","flag":0,"leader_id":null,"risk_point_name":"残留物、漂浮物","risk_type_name":"货检车号","month":"2017-07","create_time":"2017-07-13 11:04:55","sjzx_create_username":"沈阳车务段管理员","sjzx_create_time":"2017-07-13 11:04:48","zrsta_id":3876,"unit_code":"0001000900220008"},{"sjzx_update_time":null,"user_dept_name":"安全科","user_dept_id":3870,"is_bbm":0,"risk_point_id":2795,"place_type_id":7836,"zrsta_name":"转弯桥站","sjzx_update_username":null,"id":1690736,"dept_id":3876,"time":"2017-07-13 16:45:23","rownum_":4,"opinion":null,"user_id":189516,"place":"站台","leader_dept_code":null,"is_ks":1,"place_id":7838,"user_position":null,"place_type":"站内","pre_assessment_id":844557,"status":3,"sjzx_update_useruuid":null,"dept_name":"转弯桥站","sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","risk_type_id":2794,"leader_dept_id":null,"content":"asdf","user_name":"沈阳车务段管理员","flag":0,"leader_id":null,"risk_point_name":"吸烟","risk_type_name":"消防安全","month":"2017-07","create_time":"2017-07-13 16:45:34","sjzx_create_username":"沈阳车务段管理员","sjzx_create_time":"2017-07-13 16:45:26","zrsta_id":3876,"unit_code":"0001000900220008"}]
         * totalRow : 4
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
             * sjzx_update_time : null
             * user_dept_name : 安全科
             * user_dept_id : 3870
             * is_bbm : 1
             * risk_point_id : 2795
             * place_type_id : 7796
             * zrsta_name : 安全科
             * sjzx_update_username : null
             * id : 1690599
             * dept_id : 3870
             * time : 2017-07-04 20:49:55
             * rownum_ : 1
             * opinion : null
             * user_id : 189516
             * place : 科室
             * leader_dept_code : null
             * is_ks : 1
             * place_id : 14182
             * user_position : null
             * place_type : 科室
             * pre_assessment_id : 844557
             * status : 5
             * sjzx_update_useruuid : null
             * dept_name : 安全科
             * sjzx_create_useruuid : 9BCA50CE85854539BAD347B10643AC9E
             * risk_type_id : 2794
             * leader_dept_id : null
             * content : testsycwd
             * user_name : 沈阳车务段管理员
             * flag : 1
             * leader_id : null
             * risk_point_name : 吸烟
             * risk_type_name : 消防安全
             * month : 2017-07
             * create_time : 2017-07-04 20:50:11
             * sjzx_create_username : 沈阳车务段管理员
             * sjzx_create_time : 2017-07-04 20:50:11
             * zrsta_id : 3870
             * unit_code : 0001000900220008
             */

            private Object sjzx_update_time;
            private String user_dept_name;
            private int user_dept_id;
            private int is_bbm;
            private int risk_point_id;
            private int place_type_id;
            private String zrsta_name;
            private Object sjzx_update_username;
            private int id;
            private int dept_id;
            private String time;
            private int rownum_;
            private Object opinion;
            private int user_id;
            private String place;
            private Object leader_dept_code;
            private int is_ks;
            private int place_id;
            private Object user_position;
            private String place_type;
            private int pre_assessment_id;
            private int status;
            private Object sjzx_update_useruuid;
            private String dept_name;
            private String sjzx_create_useruuid;
            private int risk_type_id;
            private Object leader_dept_id;
            private String content;
            private String user_name;
            private int flag;
            private Object leader_id;
            private String risk_point_name;
            private String risk_type_name;
            private String month;
            private String create_time;
            private String sjzx_create_username;
            private String sjzx_create_time;
            private int zrsta_id;
            private String unit_code;

            public Object getSjzx_update_time() {
                return sjzx_update_time;
            }

            public void setSjzx_update_time(Object sjzx_update_time) {
                this.sjzx_update_time = sjzx_update_time;
            }

            public String getUser_dept_name() {
                return user_dept_name;
            }

            public void setUser_dept_name(String user_dept_name) {
                this.user_dept_name = user_dept_name;
            }

            public int getUser_dept_id() {
                return user_dept_id;
            }

            public void setUser_dept_id(int user_dept_id) {
                this.user_dept_id = user_dept_id;
            }

            public int getIs_bbm() {
                return is_bbm;
            }

            public void setIs_bbm(int is_bbm) {
                this.is_bbm = is_bbm;
            }

            public int getRisk_point_id() {
                return risk_point_id;
            }

            public void setRisk_point_id(int risk_point_id) {
                this.risk_point_id = risk_point_id;
            }

            public int getPlace_type_id() {
                return place_type_id;
            }

            public void setPlace_type_id(int place_type_id) {
                this.place_type_id = place_type_id;
            }

            public String getZrsta_name() {
                return zrsta_name;
            }

            public void setZrsta_name(String zrsta_name) {
                this.zrsta_name = zrsta_name;
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

            public int getDept_id() {
                return dept_id;
            }

            public void setDept_id(int dept_id) {
                this.dept_id = dept_id;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public int getRownum_() {
                return rownum_;
            }

            public void setRownum_(int rownum_) {
                this.rownum_ = rownum_;
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

            public String getPlace() {
                return place;
            }

            public void setPlace(String place) {
                this.place = place;
            }

            public Object getLeader_dept_code() {
                return leader_dept_code;
            }

            public void setLeader_dept_code(Object leader_dept_code) {
                this.leader_dept_code = leader_dept_code;
            }

            public int getIs_ks() {
                return is_ks;
            }

            public void setIs_ks(int is_ks) {
                this.is_ks = is_ks;
            }

            public int getPlace_id() {
                return place_id;
            }

            public void setPlace_id(int place_id) {
                this.place_id = place_id;
            }

            public Object getUser_position() {
                return user_position;
            }

            public void setUser_position(Object user_position) {
                this.user_position = user_position;
            }

            public String getPlace_type() {
                return place_type;
            }

            public void setPlace_type(String place_type) {
                this.place_type = place_type;
            }

            public int getPre_assessment_id() {
                return pre_assessment_id;
            }

            public void setPre_assessment_id(int pre_assessment_id) {
                this.pre_assessment_id = pre_assessment_id;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public Object getSjzx_update_useruuid() {
                return sjzx_update_useruuid;
            }

            public void setSjzx_update_useruuid(Object sjzx_update_useruuid) {
                this.sjzx_update_useruuid = sjzx_update_useruuid;
            }

            public String getDept_name() {
                return dept_name;
            }

            public void setDept_name(String dept_name) {
                this.dept_name = dept_name;
            }

            public String getSjzx_create_useruuid() {
                return sjzx_create_useruuid;
            }

            public void setSjzx_create_useruuid(String sjzx_create_useruuid) {
                this.sjzx_create_useruuid = sjzx_create_useruuid;
            }

            public int getRisk_type_id() {
                return risk_type_id;
            }

            public void setRisk_type_id(int risk_type_id) {
                this.risk_type_id = risk_type_id;
            }

            public Object getLeader_dept_id() {
                return leader_dept_id;
            }

            public void setLeader_dept_id(Object leader_dept_id) {
                this.leader_dept_id = leader_dept_id;
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

            public int getFlag() {
                return flag;
            }

            public void setFlag(int flag) {
                this.flag = flag;
            }

            public Object getLeader_id() {
                return leader_id;
            }

            public void setLeader_id(Object leader_id) {
                this.leader_id = leader_id;
            }

            public String getRisk_point_name() {
                return risk_point_name;
            }

            public void setRisk_point_name(String risk_point_name) {
                this.risk_point_name = risk_point_name;
            }

            public String getRisk_type_name() {
                return risk_type_name;
            }

            public void setRisk_type_name(String risk_type_name) {
                this.risk_type_name = risk_type_name;
            }

            public String getMonth() {
                return month;
            }

            public void setMonth(String month) {
                this.month = month;
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

            public String getSjzx_create_time() {
                return sjzx_create_time;
            }

            public void setSjzx_create_time(String sjzx_create_time) {
                this.sjzx_create_time = sjzx_create_time;
            }

            public int getZrsta_id() {
                return zrsta_id;
            }

            public void setZrsta_id(int zrsta_id) {
                this.zrsta_id = zrsta_id;
            }

            public String getUnit_code() {
                return unit_code;
            }

            public void setUnit_code(String unit_code) {
                this.unit_code = unit_code;
            }
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

    public static class UserBean {
        /**
         * lzh : 189516
         * birth : 20170124
         * cb : 0
         * dept_name4 : 安全科
         * dept_name3 : 沈阳车务段
         * card_number : null
         * dept_name1 : 沈阳铁路局
         * tel : null
         * tf : 0
         * quan_post_id : 104
         * remark1 : null
         * type : 0
         * password : C4CA4238A0B923820DCC509A6F75849B
         * sso_uuid : 9BCA50CE85854539BAD347B10643AC9E
         * remark3 : null
         * leader_type : 1
         * remark2 : null
         * quan_post_name : 测试日勤岗
         * bzb : 0
         * dept_full_name : 沈阳铁路局-运输处-沈阳车务段-安全科
         * is_leader : 0
         * dept_name7 : null
         * gender : 1
         * dept_name5 : null
         * inbox_do_sort : SEND_USER1
         * dept_cwd_name : 沈阳车务段
         * dept_name6 : null
         * post_name : 空
         * seniority : 1
         * dc : 0
         * technical_level_name : null
         * user_type : 在岗工作
         * jsj : 0
         * dept_code : 0001000900220008
         * key_person_mark : 0
         * leader_type_name : 专业技术
         * 6502 : 0
         * deleted : 0
         * dept_code7 : null
         * position_name : 工程师
         * ctc : 0
         * dept_code6 : null
         * dept_code5 : null
         * dept_code4 : 0001000900220008
         * seniority1 : null
         * dept_code3 : 000100090022
         * email : null
         * dept_cwd_code : 000100090022
         * create_time : 2017-01-24 23:37:14
         * isshangbao : 0
         * pm : 0
         * ch : 0
         * work_experience : null
         * dt : 0
         * position : 3877
         * pym : sycwdgly
         * zg : 0
         * zb : 0
         * sys : 0
         * fhy : 0
         * cert_id : null
         * zdz : 0
         * dept_type : 11
         * lw : 0
         * hj : 0
         * last_login_ip : null
         * id_card : admin-sycwd
         * education : 本科
         * ljy : 0
         * is_leadership : 1
         * start_work_date : 20370124
         * id : 189516
         * dg : 0
         * dept_id : 3870
         * token : 098CDE226D8638E59D8727C5AA738F21
         * name : 沈阳车务段管理员
         * ccsj : 0
         * position_duty : null
         * sso_app_name : null
         * dept_cwd_or_stn_name : 沈阳车务段
         * dept_station_code : null
         * outbox_do_sort : CREATE_DATE2
         * ethnic : null
         * post : 1
         * political : null
         * last_login_time : 2017-07-17 16:05:14
         * working_time : null
         * yb : 0
         * dept_station_name : null
         * technical_level : null
         * dept_name : 安全科
         * photo : null
         * labor : null
         * dept_cwd_or_stn_code : 000100090022
         * feeling : null
         * login_name : admin-sycwd
         * dcz : 0
         * login_count : 4009
         */

        private String lzh;
        private String birth;
        private int cb;
        private String dept_name4;
        private String dept_name3;
        private Object card_number;
        private String dept_name1;
        private Object tel;
        private int tf;
        private int quan_post_id;
        private Object remark1;
        private int type;
        private String password;
        private String sso_uuid;
        private Object remark3;
        private int leader_type;
        private Object remark2;
        private String quan_post_name;
        private int bzb;
        private String dept_full_name;
        private int is_leader;
        private Object dept_name7;
        private int gender;
        private Object dept_name5;
        private String inbox_do_sort;
        private String dept_cwd_name;
        private Object dept_name6;
        private String post_name;
        private int seniority;
        private int dc;
        private Object technical_level_name;
        private String user_type;
        private int jsj;
        private String dept_code;
        private int key_person_mark;
        private String leader_type_name;
        private int deleted;
        private Object dept_code7;
        private String position_name;
        private int ctc;
        private Object dept_code6;
        private Object dept_code5;
        private String dept_code4;
        private Object seniority1;
        private String dept_code3;
        private Object email;
        private String dept_cwd_code;
        private String create_time;
        private String isshangbao;
        private int pm;
        private int ch;
        private Object work_experience;
        private int dt;
        private int position;
        private String pym;
        private int zg;
        private int zb;
        private int sys;
        private int fhy;
        private Object cert_id;
        private int zdz;
        private int dept_type;
        private int lw;
        private int hj;
        private Object last_login_ip;
        private String id_card;
        private String education;
        private int ljy;
        private int is_leadership;
        private String start_work_date;
        private int id;
        private int dg;
        private int dept_id;
        private String token;
        private String name;
        private int ccsj;
        private Object position_duty;
        private Object sso_app_name;
        private String dept_cwd_or_stn_name;
        private Object dept_station_code;
        private String outbox_do_sort;
        private Object ethnic;
        private int post;
        private Object political;
        private String last_login_time;
        private Object working_time;
        private int yb;
        private Object dept_station_name;
        private Object technical_level;
        private String dept_name;
        private Object photo;
        private Object labor;
        private String dept_cwd_or_stn_code;
        private Object feeling;
        private String login_name;
        private int dcz;
        private int login_count;

        public String getLzh() {
            return lzh;
        }

        public void setLzh(String lzh) {
            this.lzh = lzh;
        }

        public String getBirth() {
            return birth;
        }

        public void setBirth(String birth) {
            this.birth = birth;
        }

        public int getCb() {
            return cb;
        }

        public void setCb(int cb) {
            this.cb = cb;
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

        public Object getCard_number() {
            return card_number;
        }

        public void setCard_number(Object card_number) {
            this.card_number = card_number;
        }

        public String getDept_name1() {
            return dept_name1;
        }

        public void setDept_name1(String dept_name1) {
            this.dept_name1 = dept_name1;
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

        public Object getRemark1() {
            return remark1;
        }

        public void setRemark1(Object remark1) {
            this.remark1 = remark1;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getSso_uuid() {
            return sso_uuid;
        }

        public void setSso_uuid(String sso_uuid) {
            this.sso_uuid = sso_uuid;
        }

        public Object getRemark3() {
            return remark3;
        }

        public void setRemark3(Object remark3) {
            this.remark3 = remark3;
        }

        public int getLeader_type() {
            return leader_type;
        }

        public void setLeader_type(int leader_type) {
            this.leader_type = leader_type;
        }

        public Object getRemark2() {
            return remark2;
        }

        public void setRemark2(Object remark2) {
            this.remark2 = remark2;
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

        public int getIs_leader() {
            return is_leader;
        }

        public void setIs_leader(int is_leader) {
            this.is_leader = is_leader;
        }

        public Object getDept_name7() {
            return dept_name7;
        }

        public void setDept_name7(Object dept_name7) {
            this.dept_name7 = dept_name7;
        }

        public int getGender() {
            return gender;
        }

        public void setGender(int gender) {
            this.gender = gender;
        }

        public Object getDept_name5() {
            return dept_name5;
        }

        public void setDept_name5(Object dept_name5) {
            this.dept_name5 = dept_name5;
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

        public Object getDept_name6() {
            return dept_name6;
        }

        public void setDept_name6(Object dept_name6) {
            this.dept_name6 = dept_name6;
        }

        public String getPost_name() {
            return post_name;
        }

        public void setPost_name(String post_name) {
            this.post_name = post_name;
        }

        public int getSeniority() {
            return seniority;
        }

        public void setSeniority(int seniority) {
            this.seniority = seniority;
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

        public String getUser_type() {
            return user_type;
        }

        public void setUser_type(String user_type) {
            this.user_type = user_type;
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

        public Object getDept_code7() {
            return dept_code7;
        }

        public void setDept_code7(Object dept_code7) {
            this.dept_code7 = dept_code7;
        }

        public String getPosition_name() {
            return position_name;
        }

        public void setPosition_name(String position_name) {
            this.position_name = position_name;
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

        public String getIsshangbao() {
            return isshangbao;
        }

        public void setIsshangbao(String isshangbao) {
            this.isshangbao = isshangbao;
        }

        public int getPm() {
            return pm;
        }

        public void setPm(int pm) {
            this.pm = pm;
        }

        public int getCh() {
            return ch;
        }

        public void setCh(int ch) {
            this.ch = ch;
        }

        public Object getWork_experience() {
            return work_experience;
        }

        public void setWork_experience(Object work_experience) {
            this.work_experience = work_experience;
        }

        public int getDt() {
            return dt;
        }

        public void setDt(int dt) {
            this.dt = dt;
        }

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
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

        public Object getCert_id() {
            return cert_id;
        }

        public void setCert_id(Object cert_id) {
            this.cert_id = cert_id;
        }

        public int getZdz() {
            return zdz;
        }

        public void setZdz(int zdz) {
            this.zdz = zdz;
        }

        public int getDept_type() {
            return dept_type;
        }

        public void setDept_type(int dept_type) {
            this.dept_type = dept_type;
        }

        public int getLw() {
            return lw;
        }

        public void setLw(int lw) {
            this.lw = lw;
        }

        public int getHj() {
            return hj;
        }

        public void setHj(int hj) {
            this.hj = hj;
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

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getDg() {
            return dg;
        }

        public void setDg(int dg) {
            this.dg = dg;
        }

        public int getDept_id() {
            return dept_id;
        }

        public void setDept_id(int dept_id) {
            this.dept_id = dept_id;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
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

        public Object getSso_app_name() {
            return sso_app_name;
        }

        public void setSso_app_name(Object sso_app_name) {
            this.sso_app_name = sso_app_name;
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

        public int getPost() {
            return post;
        }

        public void setPost(int post) {
            this.post = post;
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

        public Object getPhoto() {
            return photo;
        }

        public void setPhoto(Object photo) {
            this.photo = photo;
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

