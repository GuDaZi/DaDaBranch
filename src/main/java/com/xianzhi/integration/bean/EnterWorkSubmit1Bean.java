package com.xianzhi.integration.bean;

import java.io.Serializable;

/**
 * @Administrator LiBo.
 * @Date 2017/7/24.
 * @Function
 */

public class EnterWorkSubmit1Bean implements Serializable {

    private String preid;
    private String place_type;
    private String place;
    private String num;
    private String status;

    public String getPreid() {
        return preid;
    }

    public void setPreid(String preid) {
        this.preid = preid;
    }

    public String getPlace_type() {
        return place_type;
    }

    public void setPlace_type(String place_type) {
        this.place_type = place_type;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
