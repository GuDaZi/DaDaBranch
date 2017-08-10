package com.xianzhi.integration.bean;

import com.zhy.tree.bean.TreeNodeCode;
import com.zhy.tree.bean.TreeNodeId;
import com.zhy.tree.bean.TreeNodeLabel;
import com.zhy.tree.bean.TreeNodePid;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/12/12.
 */

public class DepartBean implements Serializable{

    @TreeNodePid
    private int pid;
    @TreeNodeCode
    private String code;
    @TreeNodeId
    private int id;
    @TreeNodeLabel
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
