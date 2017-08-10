//package com.xianzhi.integration.bean;
//
//import java.util.List;
//
///**
// * Created by TJTJL on 2017/7/21.
// */
//
//public class TestBean {
//
//    /**
//     * level : 0
//     * levelInfo : {}
//     * page : {"firstPage":true,"lastPage":true,"list":[{"add_score":0,"childcount":0,"code":"2019","count":0,"deleted":0,"id":6128,"level":0,"minus_score":0,"name":"可以修改名称","pid":0,"rownum_":1,"sjzx_create_time":"2017-07-19 09:36:18","sjzx_create_username":"沈阳车务段管理员","sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","sjzx_update_time":"2017-07-19 09:38:45","sjzx_update_username":"沈阳车务段管理员","sjzx_update_useruuid":"9BCA50CE85854539BAD347B10643AC9E","status":1,"unit_code":"0001000900220008","year":"2019"},{"add_score":0,"childcount":2,"code":"2018","count":0,"deleted":0,"id":6126,"level":0,"minus_score":0,"name":"测试用表","pid":0,"rownum_":2,"sjzx_create_time":"2017-07-19 09:13:43","sjzx_create_username":"沈阳车务段管理员","sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","sjzx_update_time":"2017-07-21 09:18:26","sjzx_update_username":"沈阳车务段管理员","sjzx_update_useruuid":"9BCA50CE85854539BAD347B10643AC9E","status":1,"unit_code":"0001000900220008","year":"2018"},{"add_score":0,"childcount":11,"code":"2017","count":0,"deleted":0,"id":1267,"level":0,"minus_score":0,"name":"安全风险控制表","pid":0,"rownum_":3,"sjzx_create_time":"2017-06-12 11:03:23","sjzx_update_time":"2017-07-20 17:25:57","sjzx_update_username":"沈阳车务段管理员","sjzx_update_useruuid":"9BCA50CE85854539BAD347B10643AC9E","status":1,"unit_code":"0001000900220008","year":"2017"}],"pageNumber":1,"pageSize":50,"totalPage":1,"totalRow":3}
//     * parent : {}
//     * pid : 0
//     */
//
//    private int level;
//    private LevelInfoBean levelInfo;
//    private PageBean page;
//    private ParentBean parent;
//    private int pid;
//
//    public int getLevel() {
//        return level;
//    }
//
//    public void setLevel(int level) {
//        this.level = level;
//    }
//
//    public LevelInfoBean getLevelInfo() {
//        return levelInfo;
//    }
//
//    public void setLevelInfo(LevelInfoBean levelInfo) {
//        this.levelInfo = levelInfo;
//    }
//
//    public PageBean getPage() {
//        return page;
//    }
//
//    public void setPage(PageBean page) {
//        this.page = page;
//    }
//
//    public ParentBean getParent() {
//        return parent;
//    }
//
//    public void setParent(ParentBean parent) {
//        this.parent = parent;
//    }
//
//    public int getPid() {
//        return pid;
//    }
//
//    public void setPid(int pid) {
//        this.pid = pid;
//    }
//
//    public static class LevelInfoBean {
//    }
//
//    public static class PageBean {
//        /**
//         * firstPage : true
//         * lastPage : true
//         * list : [{"add_score":0,"childcount":0,"code":"2019","count":0,"deleted":0,"id":6128,"level":0,"minus_score":0,"name":"可以修改名称","pid":0,"rownum_":1,"sjzx_create_time":"2017-07-19 09:36:18","sjzx_create_username":"沈阳车务段管理员","sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","sjzx_update_time":"2017-07-19 09:38:45","sjzx_update_username":"沈阳车务段管理员","sjzx_update_useruuid":"9BCA50CE85854539BAD347B10643AC9E","status":1,"unit_code":"0001000900220008","year":"2019"},{"add_score":0,"childcount":2,"code":"2018","count":0,"deleted":0,"id":6126,"level":0,"minus_score":0,"name":"测试用表","pid":0,"rownum_":2,"sjzx_create_time":"2017-07-19 09:13:43","sjzx_create_username":"沈阳车务段管理员","sjzx_create_useruuid":"9BCA50CE85854539BAD347B10643AC9E","sjzx_update_time":"2017-07-21 09:18:26","sjzx_update_username":"沈阳车务段管理员","sjzx_update_useruuid":"9BCA50CE85854539BAD347B10643AC9E","status":1,"unit_code":"0001000900220008","year":"2018"},{"add_score":0,"childcount":11,"code":"2017","count":0,"deleted":0,"id":1267,"level":0,"minus_score":0,"name":"安全风险控制表","pid":0,"rownum_":3,"sjzx_create_time":"2017-06-12 11:03:23","sjzx_update_time":"2017-07-20 17:25:57","sjzx_update_username":"沈阳车务段管理员","sjzx_update_useruuid":"9BCA50CE85854539BAD347B10643AC9E","status":1,"unit_code":"0001000900220008","year":"2017"}]
//         * pageNumber : 1
//         * pageSize : 50
//         * totalPage : 1
//         * totalRow : 3
//         */
//
//        private boolean firstPage;
//        private boolean lastPage;
//        private int pageNumber;
//        private int pageSize;
//        private int totalPage;
//        private int totalRow;
//        private List<ListBean> list;
//
//        public boolean isFirstPage() {
//            return firstPage;
//        }
//
//        public void setFirstPage(boolean firstPage) {
//            this.firstPage = firstPage;
//        }
//
//        public boolean isLastPage() {
//            return lastPage;
//        }
//
//        public void setLastPage(boolean lastPage) {
//            this.lastPage = lastPage;
//        }
//
//        public int getPageNumber() {
//            return pageNumber;
//        }
//
//        public void setPageNumber(int pageNumber) {
//            this.pageNumber = pageNumber;
//        }
//
//        public int getPageSize() {
//            return pageSize;
//        }
//
//        public void setPageSize(int pageSize) {
//            this.pageSize = pageSize;
//        }
//
//        public int getTotalPage() {
//            return totalPage;
//        }
//
//        public void setTotalPage(int totalPage) {
//            this.totalPage = totalPage;
//        }
//
//        public int getTotalRow() {
//            return totalRow;
//        }
//
//        public void setTotalRow(int totalRow) {
//            this.totalRow = totalRow;
//        }
//
//        public List<ListBean> getList() {
//            return list;
//        }
//
//        public void setList(List<ListBean> list) {
//            this.list = list;
//        }
//
//        public static class ListBean {
//            /**
//             * add_score : 0
//             * childcount : 0
//             * code : 2019
//             * count : 0
//             * deleted : 0
//             * id : 6128
//             * level : 0
//             * minus_score : 0
//             * name : 可以修改名称
//             * pid : 0
//             * rownum_ : 1
//             * sjzx_create_time : 2017-07-19 09:36:18
//             * sjzx_create_username : 沈阳车务段管理员
//             * sjzx_create_useruuid : 9BCA50CE85854539BAD347B10643AC9E
//             * sjzx_update_time : 2017-07-19 09:38:45
//             * sjzx_update_username : 沈阳车务段管理员
//             * sjzx_update_useruuid : 9BCA50CE85854539BAD347B10643AC9E
//             * status : 1
//             * unit_code : 0001000900220008
//             * year : 2019
//             */
//
//            private int add_score;
//            private int childcount;
//            private String code;
//            private int count;
//            private int deleted;
//            private int id;
//            private int level;
//            private int minus_score;
//            private String name;
//            private int pid;
//            private int rownum_;
//            private String sjzx_create_time;
//            private String sjzx_create_username;
//            private String sjzx_create_useruuid;
//            private String sjzx_update_time;
//            private String sjzx_update_username;
//            private String sjzx_update_useruuid;
//            private int status;
//            private String unit_code;
//            private String year;
//
//            public int getAdd_score() {
//                return add_score;
//            }
//
//            public void setAdd_score(int add_score) {
//                this.add_score = add_score;
//            }
//
//            public int getChildcount() {
//                return childcount;
//            }
//
//            public void setChildcount(int childcount) {
//                this.childcount = childcount;
//            }
//
//            public String getCode() {
//                return code;
//            }
//
//            public void setCode(String code) {
//                this.code = code;
//            }
//
//            public int getCount() {
//                return count;
//            }
//
//            public void setCount(int count) {
//                this.count = count;
//            }
//
//            public int getDeleted() {
//                return deleted;
//            }
//
//            public void setDeleted(int deleted) {
//                this.deleted = deleted;
//            }
//
//            public int getId() {
//                return id;
//            }
//
//            public void setId(int id) {
//                this.id = id;
//            }
//
//            public int getLevel() {
//                return level;
//            }
//
//            public void setLevel(int level) {
//                this.level = level;
//            }
//
//            public int getMinus_score() {
//                return minus_score;
//            }
//
//            public void setMinus_score(int minus_score) {
//                this.minus_score = minus_score;
//            }
//
//            public String getName() {
//                return name;
//            }
//
//            public void setName(String name) {
//                this.name = name;
//            }
//
//            public int getPid() {
//                return pid;
//            }
//
//            public void setPid(int pid) {
//                this.pid = pid;
//            }
//
//            public int getRownum_() {
//                return rownum_;
//            }
//
//            public void setRownum_(int rownum_) {
//                this.rownum_ = rownum_;
//            }
//
//            public String getSjzx_create_time() {
//                return sjzx_create_time;
//            }
//
//            public void setSjzx_create_time(String sjzx_create_time) {
//                this.sjzx_create_time = sjzx_create_time;
//            }
//
//            public String getSjzx_create_username() {
//                return sjzx_create_username;
//            }
//
//            public void setSjzx_create_username(String sjzx_create_username) {
//                this.sjzx_create_username = sjzx_create_username;
//            }
//
//            public String getSjzx_create_useruuid() {
//                return sjzx_create_useruuid;
//            }
//
//            public void setSjzx_create_useruuid(String sjzx_create_useruuid) {
//                this.sjzx_create_useruuid = sjzx_create_useruuid;
//            }
//
//            public String getSjzx_update_time() {
//                return sjzx_update_time;
//            }
//
//            public void setSjzx_update_time(String sjzx_update_time) {
//                this.sjzx_update_time = sjzx_update_time;
//            }
//
//            public String getSjzx_update_username() {
//                return sjzx_update_username;
//            }
//
//            public void setSjzx_update_username(String sjzx_update_username) {
//                this.sjzx_update_username = sjzx_update_username;
//            }
//
//            public String getSjzx_update_useruuid() {
//                return sjzx_update_useruuid;
//            }
//
//            public void setSjzx_update_useruuid(String sjzx_update_useruuid) {
//                this.sjzx_update_useruuid = sjzx_update_useruuid;
//            }
//
//            public int getStatus() {
//                return status;
//            }
//
//            public void setStatus(int status) {
//                this.status = status;
//            }
//
//            public String getUnit_code() {
//                return unit_code;
//            }
//
//            public void setUnit_code(String unit_code) {
//                this.unit_code = unit_code;
//            }
//
//            public String getYear() {
//                return year;
//            }
//
//            public void setYear(String year) {
//                this.year = year;
//            }
//        }
//    }
//
//    public static class ParentBean {
//    }
//}
