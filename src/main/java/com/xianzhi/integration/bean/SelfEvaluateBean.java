package com.xianzhi.integration.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @Administrator LiBo.
 * @Date 2017/7/20.
 * @Function
 */

public class SelfEvaluateBean implements Serializable {

    private int num;
    private int size;
    private String date;
    /**
     * page : {"lastPage":true,"pageSize":50,"pageNumber":1,"firstPage":true,"list":[{"sjzx_update_time":"2017-07-13 14:40:08","user_dept_name":"安全科","user_dept_full_name":"沈阳铁路局-运输处-沈阳车务段-安全科","user_dept_id":3870,"set_user":"沈阳车务段管理员","sjzx_update_username":"沈阳车务段管理员","id":26436,"add_score":4,"rownum_":1,"realistic_time":null,"opinion":null,"user_id":189516,"user_dept_code":"0001000900220008","minus_score":null,"set_user_id":189516,"status":0,"sjzx_update_useruuid":"9BCA50CE85854539BAD347B10643AC9E","dept_code":"0001000900220008","sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","bzgznr":"1,sfsdg\r\n2gsdg","deleted":0,"bzgzbz":"1,梵蒂冈东方红东方\r\n2，dfgdhfj","content":"567页面","user_name":"沈阳车务段管理员","leader_id":null,"create_time":"2017-07-06 21:23:21","month":"2017-07","sjzx_create_username":"沈阳车务段管理员","sjzx_create_time":"2017-07-06 21:23:12"}],"totalRow":1,"totalPage":1}
     * userId : 189516
     * month : 2017-07
     * doAdd : false
     * doEdit : false
     * user : {"birth":"20170124","dept_name4":"安全科","dept_name3":"沈阳车务段","dept_name1":"沈阳铁路局","sso_uuid":"9BCA50CE85854539BAD347B10643AC9E","leader_type":1,"quan_post_name":"测试日勤岗","bzb":0,"dept_full_name":"沈阳铁路局-运输处-沈阳车务段-安全科","laid_off_time":null,"dept_name7":null,"dept_name5":null,"dept_name6":null,"user_type":"在岗工作","ctc":0,"dept_code7":null,"dept_code6":null,"dept_code5":null,"seniority1":null,"dept_code4":"0001000900220008","dept_code3":"000100090022","pm":0,"isshangbao":"0","position":3877,"dt":0,"fhy":0,"sys":0,"lw":0,"zdz":0,"is_leadership":1,"start_work_date":"20370124","dept_id":3870,"dg":0,"token":"098CDE226D8638E59D8727C5AA738F21","ccsj":0,"position_duty":null,"dept_cwd_or_stn_name":"沈阳车务段","dept_station_code":null,"post":1,"dept_station_name":null,"technical_level":null,"dept_name":"安全科","labor":null,"dept_cwd_or_stn_code":"000100090022","feeling":null,"login_name":"admin-sycwd","lzh":"189516","cb":0,"card_number":null,"tel":null,"tf":0,"quan_post_id":104,"type":0,"remark1":null,"password":"C4CA4238A0B923820DCC509A6F75849B","remark3":null,"remark2":null,"is_leader":0,"gender":1,"inbox_do_sort":"SEND_USER1","dept_cwd_name":"沈阳车务段","seniority":1,"post_name":"空","dc":0,"technical_level_name":null,"jsj":0,"dept_code":"0001000900220008","leader_type_name":"专业技术","key_person_mark":0,"deleted":0,"6502":0,"position_name":"工程师","email":null,"dept_cwd_code":"000100090022","create_time":"2017-01-24 23:37:14","work_experience":null,"ch":0,"zg":0,"pym":"sycwdgly","zb":0,"cert_id":null,"cancel_status":0,"hj":0,"dept_type":11,"id_card":"admin-sycwd","last_login_ip":null,"education":"本科","ljy":0,"id":189516,"name":"沈阳车务段管理员","sso_app_name":null,"outbox_do_sort":"CREATE_DATE2","ethnic":null,"political":null,"working_time":null,"last_login_time":"2017-07-20 14:41:30","yb":0,"photo":null,"dcz":0,"login_count":4838}
     */

    private PageBean page;
    private int userId;
    private String month;
    private String doAdd;
    private String doEdit;
    private UserBean user;

    public SelfEvaluateBean() {
    }

    public SelfEvaluateBean(int num, int size, String date) {
        this.num = num;
        this.size = size;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDoAdd() {
        return doAdd;
    }

    public void setDoAdd(String doAdd) {
        this.doAdd = doAdd;
    }

    public String getDoEdit() {
        return doEdit;
    }

    public void setDoEdit(String doEdit) {
        this.doEdit = doEdit;
    }

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public static class PageBean {
        /**
         * lastPage : true
         * pageSize : 50
         * pageNumber : 1
         * firstPage : true
         * list : [{"sjzx_update_time":"2017-07-13 14:40:08","user_dept_name":"安全科","user_dept_full_name":"沈阳铁路局-运输处-沈阳车务段-安全科","user_dept_id":3870,"set_user":"沈阳车务段管理员","sjzx_update_username":"沈阳车务段管理员","id":26436,"add_score":4,"rownum_":1,"realistic_time":null,"opinion":null,"user_id":189516,"user_dept_code":"0001000900220008","minus_score":null,"set_user_id":189516,"status":0,"sjzx_update_useruuid":"9BCA50CE85854539BAD347B10643AC9E","dept_code":"0001000900220008","sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","bzgznr":"1,sfsdg\r\n2gsdg","deleted":0,"bzgzbz":"1,梵蒂冈东方红东方\r\n2，dfgdhfj","content":"567页面","user_name":"沈阳车务段管理员","leader_id":null,"create_time":"2017-07-06 21:23:21","month":"2017-07","sjzx_create_username":"沈阳车务段管理员","sjzx_create_time":"2017-07-06 21:23:12"}]
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
             * sjzx_update_time : 2017-07-13 14:40:08
             * user_dept_name : 安全科
             * user_dept_full_name : 沈阳铁路局-运输处-沈阳车务段-安全科
             * user_dept_id : 3870
             * set_user : 沈阳车务段管理员
             * sjzx_update_username : 沈阳车务段管理员
             * id : 26436
             * add_score : 4
             * rownum_ : 1
             * realistic_time : null
             * opinion : null
             * user_id : 189516
             * user_dept_code : 0001000900220008
             * minus_score : null
             * set_user_id : 189516
             * status : 0
             * sjzx_update_useruuid : 9BCA50CE85854539BAD347B10643AC9E
             * dept_code : 0001000900220008
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
            private int rownum_;
            private Object realistic_time;
            private Object opinion;
            private int user_id;
            private String user_dept_code;
            private Object minus_score;
            private int set_user_id;
            private int status;
            private String sjzx_update_useruuid;
            private String dept_code;
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

            public int getRownum_() {
                return rownum_;
            }

            public void setRownum_(int rownum_) {
                this.rownum_ = rownum_;
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

            public Object getMinus_score() {
                return minus_score;
            }

            public void setMinus_score(Object minus_score) {
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

            public String getDept_code() {
                return dept_code;
            }

            public void setDept_code(String dept_code) {
                this.dept_code = dept_code;
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
         * last_login_time : 2017-07-20 14:41:30
         * yb : 0
         * photo : null
         * dcz : 0
         * login_count : 4838
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
}
