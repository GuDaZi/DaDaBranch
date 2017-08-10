package com.xianzhi.integration.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @Administrator LiBo.
 * @Date 2017/7/28.
 * @Function
 */

public class TimeAndAddressLisstBean implements Serializable {

    private List<TimeAndAddressBean> data;
    private String id;
    private int number;
    private String work;


    public TimeAndAddressLisstBean() {

    }

    public TimeAndAddressLisstBean(List<TimeAndAddressBean> data, String id, int number) {
        this.data = data;
        this.id = id;
        this.number = number;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<TimeAndAddressBean> getData() {
        return data;
    }

    public void setData(List<TimeAndAddressBean> data) {
        this.data = data;
    }

    public static class TimeAndAddressBean {

        private String time;
        private String place;
        private String workDetail;
        private int normal_done;
        private int dynamic_done;
        private int extra_done;
        private int normal;
        private int dynamic;

        public TimeAndAddressBean() {
        }

        public TimeAndAddressBean(String time, String place, String workDetail) {
            this.time = time;
            this.place = place;
            this.workDetail = workDetail;
        }

        public int getNormal_done() {
            return normal_done;
        }

        public void setNormal_done(int normal_done) {
            this.normal_done = normal_done;
        }

        public int getDynamic_done() {
            return dynamic_done;
        }

        public void setDynamic_done(int dynamic_done) {
            this.dynamic_done = dynamic_done;
        }

        public int getExtra_done() {
            return extra_done;
        }

        public void setExtra_done(int extra_done) {
            this.extra_done = extra_done;
        }

        public int getNormal() {
            return normal;
        }

        public void setNormal(int normal) {
            this.normal = normal;
        }

        public int getDynamic() {
            return dynamic;
        }

        public void setDynamic(int dynamic) {
            this.dynamic = dynamic;
        }

        public String getWorkDetail() {
            return workDetail;
        }

        public void setWorkDetail(String workDetail) {
            this.workDetail = workDetail;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getPlace() {
            return place;
        }

        public void setPlace(String place) {
            this.place = place;
        }
    }

}
