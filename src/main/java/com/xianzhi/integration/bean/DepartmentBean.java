package com.xianzhi.integration.bean;

import com.zhy.tree.bean.TreeNodeCode;
import com.zhy.tree.bean.TreeNodeId;
import com.zhy.tree.bean.TreeNodeLabel;
import com.zhy.tree.bean.TreeNodePid;

import java.io.Serializable;

/**
 * @Administrator LiBo.
 * @Date 2017/7/18.
 * @Function
 */

public class DepartmentBean implements Serializable {


    /**
     * available : 1
     * class_select : 0
     * code : 000100090022
     * create_time : 2017-02-06 09:18:03
     * deleted : 0
     * document_user : 219160
     * equdepartment : 0
     * id : 3862
     * leader_user_id : 45402
     * level : 3
     * my_level : 3
     * name : 沈阳车务段
     * pid : 195
     * problem_auto_audot : 1
     * pym : sycwd
     * response_user_id : 263023
     * safe_overtime : 2400
     * type : 1
     * unit_type : 1
     * dbm : LTT
     * station_level : 4
     * class_id : 38
     * class_name : 小四班制1(▲,丨▼,○,○)
     * start_date : 2017-07-10
     */

    private int available;
    private int class_select;
    @TreeNodeCode
    private String code;
    private String create_time;
    private int deleted;
    private int document_user;
    private int equdepartment;
    @TreeNodeId
    private int id;
    private int leader_user_id;
    private int level;
    private int my_level;
    @TreeNodeLabel
    private String name;
    @TreeNodePid
    private int pid;
    private int problem_auto_audot;
    private String pym;
    private int response_user_id;
    private int safe_overtime;
    private int type;
    private int unit_type;
    private String dbm;
    private int station_level;
    private int class_id;
    private String class_name;
    private String start_date;

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public int getClass_select() {
        return class_select;
    }

    public void setClass_select(int class_select) {
        this.class_select = class_select;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

    public int getDocument_user() {
        return document_user;
    }

    public void setDocument_user(int document_user) {
        this.document_user = document_user;
    }

    public int getEqudepartment() {
        return equdepartment;
    }

    public void setEqudepartment(int equdepartment) {
        this.equdepartment = equdepartment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLeader_user_id() {
        return leader_user_id;
    }

    public void setLeader_user_id(int leader_user_id) {
        this.leader_user_id = leader_user_id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMy_level() {
        return my_level;
    }

    public void setMy_level(int my_level) {
        this.my_level = my_level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getProblem_auto_audot() {
        return problem_auto_audot;
    }

    public void setProblem_auto_audot(int problem_auto_audot) {
        this.problem_auto_audot = problem_auto_audot;
    }

    public String getPym() {
        return pym;
    }

    public void setPym(String pym) {
        this.pym = pym;
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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getUnit_type() {
        return unit_type;
    }

    public void setUnit_type(int unit_type) {
        this.unit_type = unit_type;
    }

    public String getDbm() {
        return dbm;
    }

    public void setDbm(String dbm) {
        this.dbm = dbm;
    }

    public int getStation_level() {
        return station_level;
    }

    public void setStation_level(int station_level) {
        this.station_level = station_level;
    }

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }
}
