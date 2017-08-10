package com.xianzhi.integration.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @Administrator LiBo.
 * @Date 2017/7/18.
 * @Function
 */

public class AddressTypeBean implements Serializable {

    private String departId;
    private int type;
    private List<ListBean> list;

    public AddressTypeBean() {
    }

    public AddressTypeBean(String departId, int type) {
        this.departId = departId;
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getDepartId() {
        return departId;
    }

    public void setDepartId(String departId) {
        this.departId = departId;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * pym : ks
         * sjzx_update_time : null
         * sjzx_update_useruuid : null
         * dept_code : 0001000900220003
         * pid : 3865
         * code : 0003000700010002
         * sjzx_create_useruuid : null
         * type : 1
         * deleted : 0
         * sjzx_update_username : null
         * id : 7791
         * dept_id : 3865
         * name : 科室
         * sjzx_create_username : null
         * station_id : 0
         * sjzx_create_time : 2017-06-12 10:39:17
         * unit_code : 0001000900220008
         */

        private String pym;
        private Object sjzx_update_time;
        private Object sjzx_update_useruuid;
        private String dept_code;
        private int pid;
        private String code;
        private Object sjzx_create_useruuid;
        private int type;
        private int deleted;
        private Object sjzx_update_username;
        private int id;
        private int dept_id;
        private String name;
        private Object sjzx_create_username;
        private int station_id;
        private String sjzx_create_time;
        private String unit_code;

        public String getPym() {
            return pym;
        }

        public void setPym(String pym) {
            this.pym = pym;
        }

        public Object getSjzx_update_time() {
            return sjzx_update_time;
        }

        public void setSjzx_update_time(Object sjzx_update_time) {
            this.sjzx_update_time = sjzx_update_time;
        }

        public Object getSjzx_update_useruuid() {
            return sjzx_update_useruuid;
        }

        public void setSjzx_update_useruuid(Object sjzx_update_useruuid) {
            this.sjzx_update_useruuid = sjzx_update_useruuid;
        }

        public String getDept_code() {
            return dept_code;
        }

        public void setDept_code(String dept_code) {
            this.dept_code = dept_code;
        }

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

        public Object getSjzx_create_useruuid() {
            return sjzx_create_useruuid;
        }

        public void setSjzx_create_useruuid(Object sjzx_create_useruuid) {
            this.sjzx_create_useruuid = sjzx_create_useruuid;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getDeleted() {
            return deleted;
        }

        public void setDeleted(int deleted) {
            this.deleted = deleted;
        }

        public Object getSjzx_update_username() {
            return sjzx_update_username;
        }

        public void setSjzx_update_username(Object sjzx_update_username) {
            this.sjzx_update_username = sjzx_update_username;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getDept_id() {
            return dept_id;
        }

        public void setDept_id(int dept_id) {
            this.dept_id = dept_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Object getSjzx_create_username() {
            return sjzx_create_username;
        }

        public void setSjzx_create_username(Object sjzx_create_username) {
            this.sjzx_create_username = sjzx_create_username;
        }

        public int getStation_id() {
            return station_id;
        }

        public void setStation_id(int station_id) {
            this.station_id = station_id;
        }

        public String getSjzx_create_time() {
            return sjzx_create_time;
        }

        public void setSjzx_create_time(String sjzx_create_time) {
            this.sjzx_create_time = sjzx_create_time;
        }

        public String getUnit_code() {
            return unit_code;
        }

        public void setUnit_code(String unit_code) {
            this.unit_code = unit_code;
        }
    }
}
