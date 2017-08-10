package com.xianzhi.integration.base;

import java.io.Serializable;

/**
 * @Administrator LiBo.
 * @Date 2017/7/26.
 * @Function
 */

public class TableUpdateBean implements Serializable {

    private String itemId;
    private String score;
    private String actualScore;
    private String editScore;
    private String grate;
    private int grateId;
    private String content;


    /**
     * status : 0
     * info : 修改成功！
     */

    private int status;
    private String info;

    public TableUpdateBean() {
    }

    public TableUpdateBean(String itemId, String score, String actualScore, String editScore, String grate, int grateId, String content) {
        this.itemId = itemId;
        this.score = score;
        this.actualScore = actualScore;
        this.editScore = editScore;
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

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getActualScore() {
        return actualScore;
    }

    public void setActualScore(String actualScore) {
        this.actualScore = actualScore;
    }

    public String getEditScore() {
        return editScore;
    }

    public void setEditScore(String editScore) {
        this.editScore = editScore;
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
