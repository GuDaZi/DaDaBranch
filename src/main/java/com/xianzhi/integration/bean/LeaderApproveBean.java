package com.xianzhi.integration.bean;

import java.io.Serializable;

/**
 * @Administrator LiBo.
 * @Date 2017/7/26.
 * @Function
 */

public class LeaderApproveBean implements Serializable {

    private String itemId;
    private String grate;
    private int grateId;
    private String content;
    /**
     * status : 0
     * info : 操作成功！
     */

    private int status;
    private String info;

    public LeaderApproveBean() {
    }

    public LeaderApproveBean(String itemId, String grate, int grateId, String content) {
        this.itemId = itemId;
        this.grate = grate;
        this.grateId = grateId;
        this.content = content;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getGrate() {
        return grate;
    }

    public void setGrate(String grate) {
        this.grate = grate;
    }

    public int getGrateId() {
        return grateId;
    }

    public void setGrateId(int grateId) {
        this.grateId = grateId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
}
