package com.xianzhi.integration.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @Administrator LiBo.
 * @Date 2017/7/20.
 * @Function
 */

public class SelfEvaluateEditBean implements Serializable {

    private String date;
    private String itemId;
    /**
     * model : {"sjzx_update_time":null,"user_dept_name":"安全科","user_dept_full_name":"沈阳铁路局-运输处-沈阳车务段-安全科","user_dept_id":3870,"set_user":"沈阳车务段管理员","sjzx_update_username":null,"id":26443,"add_score":null,"realistic_time":null,"opinion":null,"user_id":189516,"user_dept_code":"0001000900220008","minus_score":null,"set_user_id":189516,"status":0,"sjzx_update_useruuid":null,"sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","bzgznr":"请问是否","deleted":0,"bzgzbz":"东方故事","content":null,"user_name":"沈阳车务段管理员","leader_id":null,"create_time":"2017-07-13 11:00:03","month":"2017-06","sjzx_create_username":"沈阳车务段管理员","sjzx_create_time":"2017-07-13 11:00:03"}
     * month : 2017-06
     * userList : []
     * zdList : [{"pym":"ascwd","dbm":null,"class_name":null,"type":1,"cognizance_user_id":null,"class_select":0,"id":750,"level":3,"name":"鞍山车务段","response_user_id":9630,"safe_overtime":999,"equdepartment":0,"leader_user_id":5209,"property":null,"pid":195,"available":1,"code":"000100090006","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":197942,"start_date":null},{"pym":"bccwd","dbm":null,"class_name":null,"type":1,"cognizance_user_id":null,"class_select":0,"id":2148,"level":3,"name":"白城车务段","response_user_id":32858,"safe_overtime":24,"equdepartment":0,"leader_user_id":22416,"property":null,"pid":195,"available":1,"code":"000100090013","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":243159,"start_date":null},{"pym":"bxcwd","dbm":null,"class_name":null,"type":1,"cognizance_user_id":null,"class_select":0,"id":1383,"level":3,"name":"本溪车务段","response_user_id":32856,"safe_overtime":9999,"equdepartment":0,"leader_user_id":12151,"property":null,"pid":195,"available":1,"code":"000100090009","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":209258,"start_date":null},{"pym":"zccwd","dbm":null,"class_name":null,"type":1,"cognizance_user_id":null,"class_select":0,"id":7020,"level":3,"name":"长春车务段","response_user_id":264948,"safe_overtime":2400,"equdepartment":0,"leader_user_id":264949,"property":null,"pid":195,"available":1,"code":"000100090031","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":229732,"start_date":null},{"pym":"cfcwd","dbm":null,"class_name":null,"type":1,"cognizance_user_id":null,"class_select":0,"id":1507,"level":3,"name":"赤峰车务段","response_user_id":32857,"safe_overtime":2000,"equdepartment":0,"leader_user_id":null,"property":null,"pid":195,"available":1,"code":"000100090010","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":null,"problem_auto_audot":1,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":235215,"start_date":null},{"pym":"dlcwd","dbm":null,"class_name":null,"type":1,"cognizance_user_id":null,"class_select":0,"id":1019,"level":3,"name":"大连车务段","response_user_id":9631,"safe_overtime":null,"equdepartment":0,"leader_user_id":7732,"property":null,"pid":195,"available":1,"code":"000100090008","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":null,"problem_auto_audot":1,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":258605,"start_date":null},{"pym":"fxcwd","dbm":null,"class_name":null,"type":1,"cognizance_user_id":null,"class_select":0,"id":2420,"level":3,"name":"阜新车务段","response_user_id":32859,"safe_overtime":48,"equdepartment":0,"leader_user_id":null,"property":null,"pid":195,"available":1,"code":"000100090014","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":194939,"start_date":null},{"pym":"hlglcwd","dbm":null,"class_name":null,"type":1,"cognizance_user_id":null,"class_select":0,"id":7226,"level":3,"name":"霍林郭勒车务段","response_user_id":null,"safe_overtime":3000,"equdepartment":0,"leader_user_id":null,"property":null,"pid":195,"available":1,"code":"000100090032","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":null,"problem_auto_audot":1,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":266825,"start_date":null},{"pym":"jlcwd","dbm":null,"class_name":null,"type":1,"cognizance_user_id":null,"class_select":0,"id":2805,"level":3,"name":"吉林车务段","response_user_id":32860,"safe_overtime":200,"equdepartment":0,"leader_user_id":null,"property":null,"pid":195,"available":1,"code":"000100090015","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":219618,"start_date":null},{"pym":"jzcwd","dbm":null,"class_name":null,"type":1,"cognizance_user_id":null,"class_select":0,"id":3147,"level":3,"name":"锦州车务段","response_user_id":263025,"safe_overtime":4800,"equdepartment":0,"leader_user_id":null,"property":null,"pid":195,"available":1,"code":"000100090017","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":null,"problem_auto_audot":1,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":214010,"start_date":null},{"pym":"mhkcwd","dbm":null,"class_name":null,"type":1,"cognizance_user_id":null,"class_select":0,"id":3413,"level":3,"name":"梅河口车务段","response_user_id":263024,"safe_overtime":null,"equdepartment":0,"leader_user_id":null,"property":null,"pid":195,"available":1,"code":"000100090019","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":191461,"start_date":null},{"pym":"sycwd","dbm":null,"class_name":null,"type":1,"cognizance_user_id":null,"class_select":0,"id":3862,"level":3,"name":"沈阳车务段","response_user_id":263023,"safe_overtime":2400,"equdepartment":0,"leader_user_id":45402,"property":null,"pid":195,"available":1,"code":"000100090022","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":null,"problem_auto_audot":1,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":219160,"start_date":null},{"pym":"thcwd","dbm":null,"class_name":null,"type":1,"cognizance_user_id":null,"class_select":0,"id":4842,"level":3,"name":"通化车务段","response_user_id":263679,"safe_overtime":0,"equdepartment":0,"leader_user_id":null,"property":null,"pid":195,"available":1,"code":"000100090026","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":189621,"start_date":null},{"pym":"tlcwd","dbm":null,"class_name":null,"type":1,"cognizance_user_id":null,"class_select":0,"id":5096,"level":3,"name":"通辽车务段","response_user_id":null,"safe_overtime":480,"equdepartment":0,"leader_user_id":null,"property":null,"pid":195,"available":1,"code":"000100090027","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":null,"problem_auto_audot":1,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":191688,"start_date":null},{"pym":"yjcwd","dbm":null,"class_name":null,"type":1,"cognizance_user_id":null,"class_select":0,"id":6426,"level":3,"name":"延吉车务段","response_user_id":null,"safe_overtime":48,"equdepartment":0,"leader_user_id":null,"property":null,"pid":195,"available":1,"code":"000100090029","station_level":null,"deleted":0,"url":null,"risk_ctrl_code":null,"class_id":null,"problem_auto_audot":0,"create_time":"2017-02-06 09:18:03","unit_type":1,"document_user":264389,"start_date":null}]
     */

    private ModelBean model;
    private String month;
    private List<?> userList;
    private List<ZdListBean> zdList;

    public SelfEvaluateEditBean() {
    }

    public SelfEvaluateEditBean(String itemId, String date) {
        this.date = date;
        this.itemId = itemId;
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

    public ModelBean getModel() {
        return model;
    }

    public void setModel(ModelBean model) {
        this.model = model;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public List<?> getUserList() {
        return userList;
    }

    public void setUserList(List<?> userList) {
        this.userList = userList;
    }

    public List<ZdListBean> getZdList() {
        return zdList;
    }

    public void setZdList(List<ZdListBean> zdList) {
        this.zdList = zdList;
    }

    public static class ModelBean {
        /**
         * sjzx_update_time : null
         * user_dept_name : 安全科
         * user_dept_full_name : 沈阳铁路局-运输处-沈阳车务段-安全科
         * user_dept_id : 3870
         * set_user : 沈阳车务段管理员
         * sjzx_update_username : null
         * id : 26443
         * add_score : null
         * realistic_time : null
         * opinion : null
         * user_id : 189516
         * user_dept_code : 0001000900220008
         * minus_score : null
         * set_user_id : 189516
         * status : 0
         * sjzx_update_useruuid : null
         * sjzx_create_useruuid : 9BCA50CE85854539BAD347B10643AC9E
         * bzgznr : 请问是否
         * deleted : 0
         * bzgzbz : 东方故事
         * content : null
         * user_name : 沈阳车务段管理员
         * leader_id : null
         * create_time : 2017-07-13 11:00:03
         * month : 2017-06
         * sjzx_create_username : 沈阳车务段管理员
         * sjzx_create_time : 2017-07-13 11:00:03
         */

        private Object sjzx_update_time;
        private String user_dept_name;
        private String user_dept_full_name;
        private int user_dept_id;
        private String set_user;
        private Object sjzx_update_username;
        private int id;
        private Object add_score;
        private Object realistic_time;
        private Object opinion;
        private int user_id;
        private String user_dept_code;
        private Object minus_score;
        private int set_user_id;
        private int status;
        private Object sjzx_update_useruuid;
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

        public Object getAdd_score() {
            return add_score;
        }

        public void setAdd_score(Object add_score) {
            this.add_score = add_score;
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

        public Object getSjzx_update_useruuid() {
            return sjzx_update_useruuid;
        }

        public void setSjzx_update_useruuid(Object sjzx_update_useruuid) {
            this.sjzx_update_useruuid = sjzx_update_useruuid;
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
