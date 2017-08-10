package com.xianzhi.integration.bean;

/**
 * Created by TJTJL on 2017/7/27.
 */

public class SecTreeBean {

    /**
     * zNodes : [{"pym":null,"sjzx_update_time":"2017-07-27 09:36:56","count":0,"status":1,"sjzx_update_useruuid":"9BCA50CE85854539BAD347B10643AC9E","pid":0,"code":"2019","sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","deleted":0,"sjzx_update_username":"沈阳车务段管理员","id":6128,"add_score":0,"level":0,"position_id":null,"name":"空表格219","sjzx_create_username":"沈阳车务段管理员","year":"2019","sjzx_create_time":"2017-07-19 09:36:18","minus_score":0,"unit_code":"0001000900220008"}]
     * token : 098CDE226D8638E59D8727C5AA738F21
     * pid : 6128
     * code : 2019
     */

    private String zNodes;
    private String token;
    private String pid;
    private String code;

    public String getZNodes() {
        return zNodes;
    }

    public void setZNodes(String zNodes) {
        this.zNodes = zNodes;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
