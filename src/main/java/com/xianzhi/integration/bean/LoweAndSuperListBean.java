package com.xianzhi.integration.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @Administrator LiBo.
 * @Date 2017/7/27.
 * @Function
 */

public class LoweAndSuperListBean implements Serializable {

    private List<LoweAndSuperBean> data;

    public LoweAndSuperListBean() {

    }

    public LoweAndSuperListBean(List<LoweAndSuperBean> data) {
        this.data = data;
    }

    public List<LoweAndSuperBean> getData() {
        return data;
    }

    public void setData(List<LoweAndSuperBean> data) {
        this.data = data;
    }

    public static class LoweAndSuperBean {

        private String id;
        private String score;
        private int type;

        public String getScore() {
            return score;
        }

        public void setScore(String score) {
            this.score = score;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getId() {

            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }

}
