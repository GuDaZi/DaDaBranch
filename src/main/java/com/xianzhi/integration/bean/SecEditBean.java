package com.xianzhi.integration.bean;

import java.util.List;

/**
 * Created by TJTJL on 2017/7/27.
 */

public class SecEditBean {

    /**
     * level : 1
     * levelInfo : {"curlevelname":"风险类别","nextlevelname":"风险项点"}
     * token : 098CDE226D8638E59D8727C5AA738F21
     * page : {"lastPage":true,"pageSize":50,"pageNumber":1,"firstPage":true,"list":[{"pym":null,"sjzx_update_time":null,"count":0,"status":null,"sjzx_update_useruuid":null,"childcount":2,"pid":1267,"code":"20170001","sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":1268,"add_score":0,"level":1,"rownum_":1,"position_id":null,"name":"接发列车风险","sjzx_create_username":null,"year":"2017","sjzx_create_time":"2017-06-12 11:03:23","minus_score":0,"unit_code":"0001000900220008"},{"pym":null,"sjzx_update_time":null,"count":0,"status":null,"sjzx_update_useruuid":null,"childcount":7,"pid":1267,"code":"20170002","sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":1269,"add_score":0,"level":1,"rownum_":2,"position_id":null,"name":"调车作业风险","sjzx_create_username":null,"year":"2017","sjzx_create_time":"2017-06-12 11:03:23","minus_score":0,"unit_code":"0001000900220008"},{"pym":null,"sjzx_update_time":null,"count":0,"status":null,"sjzx_update_useruuid":null,"childcount":3,"pid":1267,"code":"20170003","sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":1270,"add_score":0,"level":1,"rownum_":3,"position_id":null,"name":"车辆溜逸风险","sjzx_create_username":null,"year":"2017","sjzx_create_time":"2017-06-12 11:03:23","minus_score":0,"unit_code":"0001000900220008"},{"pym":null,"sjzx_update_time":null,"count":0,"status":null,"sjzx_update_useruuid":null,"childcount":2,"pid":1267,"code":"20170004","sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":1271,"add_score":0,"level":1,"rownum_":4,"position_id":null,"name":"劳动安全风险","sjzx_create_username":null,"year":"2017","sjzx_create_time":"2017-06-12 11:03:23","minus_score":0,"unit_code":"0001000900220008"},{"pym":null,"sjzx_update_time":null,"count":0,"status":null,"sjzx_update_useruuid":null,"childcount":1,"pid":1267,"code":"20170005","sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":1272,"add_score":0,"level":1,"rownum_":5,"position_id":null,"name":"施工安全风险","sjzx_create_username":null,"year":"2017","sjzx_create_time":"2017-06-12 11:03:23","minus_score":0,"unit_code":"0001000900220008"},{"pym":null,"sjzx_update_time":null,"count":0,"status":null,"sjzx_update_useruuid":null,"childcount":2,"pid":1267,"code":"20170007","sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":1274,"add_score":0,"level":1,"rownum_":6,"position_id":null,"name":"消防安全风险","sjzx_create_username":null,"year":"2017","sjzx_create_time":"2017-06-12 11:03:23","minus_score":0,"unit_code":"0001000900220008"},{"pym":null,"sjzx_update_time":null,"count":0,"status":null,"sjzx_update_useruuid":null,"childcount":1,"pid":1267,"code":"20170009","sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":1276,"add_score":0,"level":1,"rownum_":7,"position_id":null,"name":"高铁CTC风险","sjzx_create_username":null,"year":"2017","sjzx_create_time":"2017-06-12 11:03:23","minus_score":0,"unit_code":"0001000900220008"},{"pym":null,"sjzx_update_time":null,"count":0,"status":null,"sjzx_update_useruuid":null,"childcount":1,"pid":1267,"code":"20170012","sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":2799,"add_score":0,"level":1,"rownum_":8,"position_id":null,"name":"路外伤亡风险","sjzx_create_username":null,"year":"2017","sjzx_create_time":"2017-06-12 11:03:23","minus_score":0,"unit_code":"0001000900220008"},{"pym":null,"sjzx_update_time":null,"count":0,"status":null,"sjzx_update_useruuid":null,"childcount":1,"pid":1267,"code":"20170014","sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":2897,"add_score":0,"level":1,"rownum_":9,"position_id":null,"name":"设备质量风险","sjzx_create_username":null,"year":"2017","sjzx_create_time":"2017-06-12 11:03:23","minus_score":0,"unit_code":"0001000900220008"},{"pym":null,"sjzx_update_time":null,"count":0,"status":null,"sjzx_update_useruuid":null,"childcount":1,"pid":1267,"code":"20170015","sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":2901,"add_score":0,"level":1,"rownum_":10,"position_id":null,"name":"劳动纪律风险","sjzx_create_username":null,"year":"2017","sjzx_create_time":"2017-06-12 11:03:23","minus_score":0,"unit_code":"0001000900220008"},{"pym":null,"sjzx_update_time":null,"count":0,"status":null,"sjzx_update_useruuid":null,"childcount":6,"pid":1267,"code":"20170016","sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":6001,"add_score":0,"level":1,"rownum_":11,"position_id":null,"name":"客运安全风险","sjzx_create_username":null,"year":"2017","sjzx_create_time":"2017-06-12 11:03:23","minus_score":0,"unit_code":"0001000900220008"}],"totalRow":11,"totalPage":1}
     * pid : 1267
     * code : 2017
     */

    private String level;
    private LevelInfoBean levelInfo;
    private String token;
    private PageBean page;
    private String pid;
    private String code;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public LevelInfoBean getLevelInfo() {
        return levelInfo;
    }

    public void setLevelInfo(LevelInfoBean levelInfo) {
        this.levelInfo = levelInfo;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public PageBean getPage() {
        return page;
    }

    public void setPage(PageBean page) {
        this.page = page;
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

    public static class LevelInfoBean {
        /**
         * curlevelname : 风险类别
         * nextlevelname : 风险项点
         */

        private String curlevelname;
        private String nextlevelname;

        public String getCurlevelname() {
            return curlevelname;
        }

        public void setCurlevelname(String curlevelname) {
            this.curlevelname = curlevelname;
        }

        public String getNextlevelname() {
            return nextlevelname;
        }

        public void setNextlevelname(String nextlevelname) {
            this.nextlevelname = nextlevelname;
        }
    }

    public static class PageBean {
        /**
         * lastPage : true
         * pageSize : 50
         * pageNumber : 1
         * firstPage : true
         * list : [{"pym":null,"sjzx_update_time":null,"count":0,"status":null,"sjzx_update_useruuid":null,"childcount":2,"pid":1267,"code":"20170001","sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":1268,"add_score":0,"level":1,"rownum_":1,"position_id":null,"name":"接发列车风险","sjzx_create_username":null,"year":"2017","sjzx_create_time":"2017-06-12 11:03:23","minus_score":0,"unit_code":"0001000900220008"},{"pym":null,"sjzx_update_time":null,"count":0,"status":null,"sjzx_update_useruuid":null,"childcount":7,"pid":1267,"code":"20170002","sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":1269,"add_score":0,"level":1,"rownum_":2,"position_id":null,"name":"调车作业风险","sjzx_create_username":null,"year":"2017","sjzx_create_time":"2017-06-12 11:03:23","minus_score":0,"unit_code":"0001000900220008"},{"pym":null,"sjzx_update_time":null,"count":0,"status":null,"sjzx_update_useruuid":null,"childcount":3,"pid":1267,"code":"20170003","sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":1270,"add_score":0,"level":1,"rownum_":3,"position_id":null,"name":"车辆溜逸风险","sjzx_create_username":null,"year":"2017","sjzx_create_time":"2017-06-12 11:03:23","minus_score":0,"unit_code":"0001000900220008"},{"pym":null,"sjzx_update_time":null,"count":0,"status":null,"sjzx_update_useruuid":null,"childcount":2,"pid":1267,"code":"20170004","sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":1271,"add_score":0,"level":1,"rownum_":4,"position_id":null,"name":"劳动安全风险","sjzx_create_username":null,"year":"2017","sjzx_create_time":"2017-06-12 11:03:23","minus_score":0,"unit_code":"0001000900220008"},{"pym":null,"sjzx_update_time":null,"count":0,"status":null,"sjzx_update_useruuid":null,"childcount":1,"pid":1267,"code":"20170005","sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":1272,"add_score":0,"level":1,"rownum_":5,"position_id":null,"name":"施工安全风险","sjzx_create_username":null,"year":"2017","sjzx_create_time":"2017-06-12 11:03:23","minus_score":0,"unit_code":"0001000900220008"},{"pym":null,"sjzx_update_time":null,"count":0,"status":null,"sjzx_update_useruuid":null,"childcount":2,"pid":1267,"code":"20170007","sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":1274,"add_score":0,"level":1,"rownum_":6,"position_id":null,"name":"消防安全风险","sjzx_create_username":null,"year":"2017","sjzx_create_time":"2017-06-12 11:03:23","minus_score":0,"unit_code":"0001000900220008"},{"pym":null,"sjzx_update_time":null,"count":0,"status":null,"sjzx_update_useruuid":null,"childcount":1,"pid":1267,"code":"20170009","sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":1276,"add_score":0,"level":1,"rownum_":7,"position_id":null,"name":"高铁CTC风险","sjzx_create_username":null,"year":"2017","sjzx_create_time":"2017-06-12 11:03:23","minus_score":0,"unit_code":"0001000900220008"},{"pym":null,"sjzx_update_time":null,"count":0,"status":null,"sjzx_update_useruuid":null,"childcount":1,"pid":1267,"code":"20170012","sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":2799,"add_score":0,"level":1,"rownum_":8,"position_id":null,"name":"路外伤亡风险","sjzx_create_username":null,"year":"2017","sjzx_create_time":"2017-06-12 11:03:23","minus_score":0,"unit_code":"0001000900220008"},{"pym":null,"sjzx_update_time":null,"count":0,"status":null,"sjzx_update_useruuid":null,"childcount":1,"pid":1267,"code":"20170014","sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":2897,"add_score":0,"level":1,"rownum_":9,"position_id":null,"name":"设备质量风险","sjzx_create_username":null,"year":"2017","sjzx_create_time":"2017-06-12 11:03:23","minus_score":0,"unit_code":"0001000900220008"},{"pym":null,"sjzx_update_time":null,"count":0,"status":null,"sjzx_update_useruuid":null,"childcount":1,"pid":1267,"code":"20170015","sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":2901,"add_score":0,"level":1,"rownum_":10,"position_id":null,"name":"劳动纪律风险","sjzx_create_username":null,"year":"2017","sjzx_create_time":"2017-06-12 11:03:23","minus_score":0,"unit_code":"0001000900220008"},{"pym":null,"sjzx_update_time":null,"count":0,"status":null,"sjzx_update_useruuid":null,"childcount":6,"pid":1267,"code":"20170016","sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":6001,"add_score":0,"level":1,"rownum_":11,"position_id":null,"name":"客运安全风险","sjzx_create_username":null,"year":"2017","sjzx_create_time":"2017-06-12 11:03:23","minus_score":0,"unit_code":"0001000900220008"}]
         * totalRow : 11
         * totalPage : 1
         */

        private boolean lastPage;
        private int pageSize;
        private int pageNumber;
        private boolean firstPage;
        private int totalRow;
        private int totalPage;
        private List<ListBean> list;

        public boolean isLastPage() {
            return lastPage;
        }

        public void setLastPage(boolean lastPage) {
            this.lastPage = lastPage;
        }

        public int getPageSize() {
            return pageSize;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }

        public int getPageNumber() {
            return pageNumber;
        }

        public void setPageNumber(int pageNumber) {
            this.pageNumber = pageNumber;
        }

        public boolean isFirstPage() {
            return firstPage;
        }

        public void setFirstPage(boolean firstPage) {
            this.firstPage = firstPage;
        }

        public int getTotalRow() {
            return totalRow;
        }

        public void setTotalRow(int totalRow) {
            this.totalRow = totalRow;
        }

        public int getTotalPage() {
            return totalPage;
        }

        public void setTotalPage(int totalPage) {
            this.totalPage = totalPage;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * pym : null
             * sjzx_update_time : null
             * count : 0
             * status : null
             * sjzx_update_useruuid : null
             * childcount : 2
             * pid : 1267
             * code : 20170001
             * sjzx_create_useruuid : null
             * deleted : 0
             * sjzx_update_username : null
             * id : 1268
             * add_score : 0
             * level : 1
             * rownum_ : 1
             * position_id : null
             * name : 接发列车风险
             * sjzx_create_username : null
             * year : 2017
             * sjzx_create_time : 2017-06-12 11:03:23
             * minus_score : 0
             * unit_code : 0001000900220008
             */

            private Object pym;
            private Object sjzx_update_time;
            private int count;
            private Object status;
            private Object sjzx_update_useruuid;
            private int childcount;
            private int pid;
            private String code;
            private Object sjzx_create_useruuid;
            private int deleted;
            private Object sjzx_update_username;
            private int id;
            private int add_score;
            private int level;
            private int rownum_;
            private Object position_id;
            private String name;
            private Object sjzx_create_username;
            private String year;
            private String sjzx_create_time;
            private int minus_score;
            private String unit_code;

            public Object getPym() {
                return pym;
            }

            public void setPym(Object pym) {
                this.pym = pym;
            }

            public Object getSjzx_update_time() {
                return sjzx_update_time;
            }

            public void setSjzx_update_time(Object sjzx_update_time) {
                this.sjzx_update_time = sjzx_update_time;
            }

            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
            }

            public Object getStatus() {
                return status;
            }

            public void setStatus(Object status) {
                this.status = status;
            }

            public Object getSjzx_update_useruuid() {
                return sjzx_update_useruuid;
            }

            public void setSjzx_update_useruuid(Object sjzx_update_useruuid) {
                this.sjzx_update_useruuid = sjzx_update_useruuid;
            }

            public int getChildcount() {
                return childcount;
            }

            public void setChildcount(int childcount) {
                this.childcount = childcount;
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

            public int getAdd_score() {
                return add_score;
            }

            public void setAdd_score(int add_score) {
                this.add_score = add_score;
            }

            public int getLevel() {
                return level;
            }

            public void setLevel(int level) {
                this.level = level;
            }

            public int getRownum_() {
                return rownum_;
            }

            public void setRownum_(int rownum_) {
                this.rownum_ = rownum_;
            }

            public Object getPosition_id() {
                return position_id;
            }

            public void setPosition_id(Object position_id) {
                this.position_id = position_id;
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

            public String getYear() {
                return year;
            }

            public void setYear(String year) {
                this.year = year;
            }

            public String getSjzx_create_time() {
                return sjzx_create_time;
            }

            public void setSjzx_create_time(String sjzx_create_time) {
                this.sjzx_create_time = sjzx_create_time;
            }

            public int getMinus_score() {
                return minus_score;
            }

            public void setMinus_score(int minus_score) {
                this.minus_score = minus_score;
            }

            public String getUnit_code() {
                return unit_code;
            }

            public void setUnit_code(String unit_code) {
                this.unit_code = unit_code;
            }
        }
    }
}
