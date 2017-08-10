package com.xianzhi.integration.bean;

import com.zhy.tree.bean.TreeNodeCode;
import com.zhy.tree.bean.TreeNodeId;
import com.zhy.tree.bean.TreeNodeLabel;
import com.zhy.tree.bean.TreeNodeLevel;
import com.zhy.tree.bean.TreeNodePid;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/12/12.
 */

public class RisksFormBean implements Serializable{

    @TreeNodePid
    private int pid;
    @TreeNodeCode
    private String code;
    @TreeNodeLevel
    private int level;

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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
