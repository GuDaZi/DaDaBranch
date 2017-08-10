package com.xianzhi.integration.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @Administrator LiBo.
 * @Date 2017/8/2.
 * @Function
 */

public class AssessScoreInfoBean implements Serializable {

    private String userId;
    private String startTime;
    private String endTime;
    private List<Info1Bean> info1;
    private List<InfoBean> info;

    public AssessScoreInfoBean() {
    }

    public AssessScoreInfoBean(String userId, String startTime, String endTime) {
        this.userId = userId;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public List<Info1Bean> getInfo1() {
        return info1;
    }

    public void setInfo1(List<Info1Bean> info1) {
        this.info1 = info1;
    }

    public List<InfoBean> getInfo() {
        return info;
    }

    public void setInfo(List<InfoBean> info) {
        this.info = info;
    }

    public static class InfoBean {
        /**
         * num : 1
         * score : 0
         * pro_id : 102
         */

        private int num;
        private int score;
        private int pro_id;

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public int getPro_id() {
            return pro_id;
        }

        public void setPro_id(int pro_id) {
            this.pro_id = pro_id;
        }
    }

    public static class Info1Bean {
        /**
         * num : 1
         * score : 0
         * pro_id : 102
         */

        private int num;
        private int score;
        private int pro_id;

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public int getPro_id() {
            return pro_id;
        }

        public void setPro_id(int pro_id) {
            this.pro_id = pro_id;
        }
    }
}
