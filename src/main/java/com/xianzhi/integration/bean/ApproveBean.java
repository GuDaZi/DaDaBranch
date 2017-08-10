package com.xianzhi.integration.bean;

import java.io.Serializable;

/**
 * @Administrator LiBo.
 * @Date 2017/7/26.
 * @Function
 */

public class ApproveBean implements Serializable {


    private String approve_id;
    private String score;
    private String reason;
    private String veto_id;
    private String type;

    public ApproveBean() {
    }

    public ApproveBean(String approve_id, String score, String reason, String veto_id, String type) {
        this.approve_id = approve_id;
        this.score = score;
        this.reason = reason;
        this.veto_id = veto_id;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getApprove_id() {
        return approve_id;
    }

    public void setApprove_id(String approve_id) {
        this.approve_id = approve_id;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getVeto_id() {
        return veto_id;
    }

    public void setVeto_id(String veto_id) {
        this.veto_id = veto_id;
    }

    /**
     * status : 0
     * finalScore : 22.0
     */




    private int status;
    private double finalScore;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public double getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(double finalScore) {
        this.finalScore = finalScore;
    }
}
