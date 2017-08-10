package com.xianzhi.integration.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @Administrator LiBo.
 * @Date 2017/7/25.
 * @Function
 */

public class TableDialogBean implements Serializable {

    private String itemId;
    /**
     * vetoList : [{"id":101,"sjzx_update_time":null,"sort":1,"condition":"未履职尽责的干部（包括管理甩手的干部）","sjzx_update_useruuid":null,"sjzx_create_username":null,"sjzx_create_useruuid":null,"sjzx_create_time":"2017-06-12 11:07:10","deleted":0,"sjzx_update_username":null,"unit_code":"0001000900220008"},{"id":102,"sjzx_update_time":null,"sort":2,"condition":"被路局下达\u201c失管问题通知书\u201d的干部","sjzx_update_useruuid":null,"sjzx_create_username":null,"sjzx_create_useruuid":null,"sjzx_create_time":"2017-06-12 11:07:10","deleted":0,"sjzx_update_username":null,"unit_code":"0001000900220008"},{"id":103,"sjzx_update_time":null,"sort":3,"condition":"无故未完成段规定的检查任务的","sjzx_update_useruuid":null,"sjzx_create_username":null,"sjzx_create_useruuid":null,"sjzx_create_time":"2017-06-12 11:07:10","deleted":0,"sjzx_update_username":null,"unit_code":"0001000900220008"},{"id":104,"sjzx_update_time":null,"sort":4,"condition":"无故不参加段安排包保任务的","sjzx_update_useruuid":null,"sjzx_create_username":null,"sjzx_create_useruuid":null,"sjzx_create_time":"2017-06-12 11:07:10","deleted":0,"sjzx_update_username":null,"unit_code":"0001000900220008"},{"id":105,"sjzx_update_time":null,"sort":5,"condition":"发现问题避重就轻、考核弄虚作假的","sjzx_update_useruuid":null,"sjzx_create_username":null,"sjzx_create_useruuid":null,"sjzx_create_time":"2017-06-12 11:07:10","deleted":0,"sjzx_update_username":null,"unit_code":"0001000900220008"},{"id":106,"sjzx_update_time":null,"sort":6,"condition":"违反巡视整改制度","sjzx_update_useruuid":null,"sjzx_create_username":null,"sjzx_create_useruuid":null,"sjzx_create_time":"2017-06-12 11:07:10","deleted":0,"sjzx_update_username":null,"unit_code":"0001000900220008"},{"id":107,"sjzx_update_time":null,"sort":7,"condition":"发生假信息、假考核、假添乘、假培训等弄虚作假问题","sjzx_update_useruuid":null,"sjzx_create_username":null,"sjzx_create_useruuid":null,"sjzx_create_time":"2017-06-12 11:07:10","deleted":0,"sjzx_update_username":null,"unit_code":"0001000900220008"},{"id":108,"sjzx_update_time":null,"sort":8,"condition":"发生客服质量事件或违法治安案件、违反党风廉政设事件","sjzx_update_useruuid":null,"sjzx_create_username":null,"sjzx_create_useruuid":null,"sjzx_create_time":"2017-06-12 11:07:10","deleted":0,"sjzx_update_username":null,"unit_code":"0001000900220008"},{"id":109,"sjzx_update_time":null,"sort":9,"condition":"发生违反中央8项规定、总公司18条措施和路局28条具体要求及坚决纠正四风问题10条决定等违纪违规问题","sjzx_update_useruuid":null,"sjzx_create_username":null,"sjzx_create_useruuid":null,"sjzx_create_time":"2017-06-12 11:07:10","deleted":0,"sjzx_update_username":null,"unit_code":"0001000900220008"},{"id":110,"sjzx_update_time":null,"sort":10,"condition":"受到警告及以上处分","sjzx_update_useruuid":null,"sjzx_create_username":null,"sjzx_create_useruuid":null,"sjzx_create_time":"2017-06-12 11:07:10","deleted":0,"sjzx_update_username":null,"unit_code":"0001000900220008"}]
     * approveId : 30833
     * type : 1
     */

    private int approveId;
    private int type;
    private List<VetoListBean> vetoList;

    public TableDialogBean() {
    }

    public TableDialogBean(String itemId) {
        this.itemId = itemId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public int getApproveId() {
        return approveId;
    }

    public void setApproveId(int approveId) {
        this.approveId = approveId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public List<VetoListBean> getVetoList() {
        return vetoList;
    }

    public void setVetoList(List<VetoListBean> vetoList) {
        this.vetoList = vetoList;
    }

    public static class VetoListBean {
        /**
         * id : 101
         * sjzx_update_time : null
         * sort : 1
         * condition : 未履职尽责的干部（包括管理甩手的干部）
         * sjzx_update_useruuid : null
         * sjzx_create_username : null
         * sjzx_create_useruuid : null
         * sjzx_create_time : 2017-06-12 11:07:10
         * deleted : 0
         * sjzx_update_username : null
         * unit_code : 0001000900220008
         */

        private int id;
        private Object sjzx_update_time;
        private int sort;
        private String condition;
        private Object sjzx_update_useruuid;
        private Object sjzx_create_username;
        private Object sjzx_create_useruuid;
        private String sjzx_create_time;
        private int deleted;
        private Object sjzx_update_username;
        private String unit_code;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Object getSjzx_update_time() {
            return sjzx_update_time;
        }

        public void setSjzx_update_time(Object sjzx_update_time) {
            this.sjzx_update_time = sjzx_update_time;
        }

        public int getSort() {
            return sort;
        }

        public void setSort(int sort) {
            this.sort = sort;
        }

        public String getCondition() {
            return condition;
        }

        public void setCondition(String condition) {
            this.condition = condition;
        }

        public Object getSjzx_update_useruuid() {
            return sjzx_update_useruuid;
        }

        public void setSjzx_update_useruuid(Object sjzx_update_useruuid) {
            this.sjzx_update_useruuid = sjzx_update_useruuid;
        }

        public Object getSjzx_create_username() {
            return sjzx_create_username;
        }

        public void setSjzx_create_username(Object sjzx_create_username) {
            this.sjzx_create_username = sjzx_create_username;
        }

        public Object getSjzx_create_useruuid() {
            return sjzx_create_useruuid;
        }

        public void setSjzx_create_useruuid(Object sjzx_create_useruuid) {
            this.sjzx_create_useruuid = sjzx_create_useruuid;
        }

        public String getSjzx_create_time() {
            return sjzx_create_time;
        }

        public void setSjzx_create_time(String sjzx_create_time) {
            this.sjzx_create_time = sjzx_create_time;
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

        public String getUnit_code() {
            return unit_code;
        }

        public void setUnit_code(String unit_code) {
            this.unit_code = unit_code;
        }
    }
}
