package com.xianzhi.integration.bean;

import java.io.Serializable;

/**
 * @Administrator LiBo.
 * @Date 2017/7/20.
 * @Function
 */

public class SelfEvaluateSaveBean implements Serializable {

    private String itemId;
    private String date;
    private String content;
    private int type;
    private int num;
    /**
     * status : 0
     * info : 修改成功！
     */

    private int status;
    private String info;

    public SelfEvaluateSaveBean() {
    }

    public SelfEvaluateSaveBean(String itemId, String date, String content, int type, int num) {
        this.itemId = itemId;
        this.date = date;
        this.content = content;
        this.type = type;
        this.num = num;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
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
