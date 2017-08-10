package com.xianzhi.integration.bean;

import java.util.List;

/**
 * Created by TJTJL on 2017/7/25.
 */

public class SecurityDetailBean {

    /**
     * model : {"pym":null,"sjzx_update_time":"2017-07-20 17:25:57","count":0,"status":1,"sjzx_update_useruuid":"9BCA50CE85854539BAD347B10643AC9E","pid":0,"code":"2017","sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":"沈阳车务段管理员","id":1267,"add_score":0,"level":0,"position_id":null,"name":"安全风险控制表","sjzx_create_username":null,"year":"2017","sjzx_create_time":"2017-06-12 11:03:23","minus_score":0,"unit_code":"0001000900220008"}
     * list : [{"sort":"2017000100010001","name4":"每月检查接发列车","count":0,"code2":"201700010001","code1":"20170001","code4":"2017000100010001","name1":"接发列车风险","name2":"错办方向不盯台未发现占用丢失或未及时拦停列车；电力机车错办风险"},{"sort":"2017000100030001","name4":"每月监听、回放车机联控","count":0,"code2":"201700010003","code1":"20170001","code4":"2017000100030001","name1":"接发列车风险","name2":"车机联控用语错、漏或不按规定呼叫"},{"sort":"2017000200010001","name4":"每月检查调车作业","count":0,"code2":"201700020001","code1":"20170002","code4":"2017000200010001","name1":"调车作业风险","name2":"排短路、排错路、\u201c双确认\u201d、\u201c三方控\u201d、推黑车、间断瞭望、错误解编"},{"sort":"2017000200010002","name4":"检查调车信号确认","count":0,"code2":"201700020001","code1":"20170002","code4":"2017000200010002","name1":"调车作业风险","name2":"排短路、排错路、\u201c双确认\u201d、\u201c三方控\u201d、推黑车、间断瞭望、错误解编"},{"sort":"2017000200020001","name4":"检查非集中区调车作业","count":0,"code2":"201700020002","code1":"20170002","code4":"2017000200020001","name1":"调车作业风险","name2":"推黑车、间断瞭望、曲线挂车、外部侵害"},{"sort":"2017000200040001","name4":"添乘检查","count":0,"code2":"201700020004","code1":"20170002","code4":"2017000200040001","name1":"调车作业风险","name2":"不按规定时机停止调车作业；不按规定确认是否电力机车进入无电区；"},{"sort":"2017000200070001","name4":"检查手扳道岔确认","count":0,"code2":"201700020007","code1":"20170002","code4":"2017000200070001","name1":"调车作业风险","name2":"手扳道岔不按规定扳动、确认、检查"},{"sort":"2017000300010001","name4":"检查动态防溜","count":0,"code2":"201700030001","code1":"20170003","code4":"2017000300010001","name1":"车辆溜逸风险","name2":"防溜不揭示、揭示错误，未得到防溜措施撤除的报告开放出站信号；违反\u201c两先两后\u201d；"},{"sort":"2017000300020001","name4":"检查静态防溜","count":0,"code2":"201700030002","code1":"20170003","code4":"2017000300020001","name1":"车辆溜逸风险","name2":"减少防线或防溜不彻底；"},{"sort":"2017000300030001","name4":"检查结合部防溜","count":0,"code2":"201700030003","code1":"20170003","code4":"2017000300030001","name1":"车辆溜逸风险","name2":"结合部防溜"},{"sort":"2017000400010001","name4":"检查劳动安全","count":0,"code2":"201700040001","code1":"20170004","code4":"2017000400010001","name1":"劳动安全风险","name2":"上道作业不按规定防护；调车组不按规定上下车；横越线路不联控；新职人员不按规定培训、签订和履行师徒合同；高站台不按规定标记、提示、停车上下；调车作业不注意外部侵限；"},{"sort":"2017000400010002","name4":"每月检查人身安全","count":0,"code2":"201700040001","code1":"20170004","code4":"2017000400010002","name1":"劳动安全风险","name2":"上道作业不按规定防护；调车组不按规定上下车；横越线路不联控；新职人员不按规定培训、签订和履行师徒合同；高站台不按规定标记、提示、停车上下；调车作业不注意外部侵限；"},{"sort":"2017000500010001","name4":"每月检查施工（维修）","count":0,"code2":"201700050001","code1":"20170005","code4":"2017000500010001","name1":"施工安全风险","name2":"漏交临时限速命令；对停电线路不标记、不掌握；非正常准备进路不执行检查、确认制度；不制定施工安全组织措施或措施不符合实际；不确认调度命令；施工非正常行车错误准备进路或不按规定检查确认进路；错误填写或交递行车凭证；"},{"sort":"2017000700010001","name4":"每月值班期间检查消防","count":0,"code2":"201700070001","code1":"20170007","code4":"2017000700010001","name1":"消防安全风险","name2":"重点防火处所吸烟有明火；违章使用电器设备、液化气罐；汽柴油不按规定存放；"},{"sort":"2017000700020001","name4":"检查危险品调车","count":0,"code2":"201700070002","code1":"20170007","code4":"2017000700020001","name1":"消防安全风险","name2":"调动易燃易爆车辆不按规定隔离、超速连挂"},{"sort":"2017000900010001","name4":"每月检查进路核对，强制执行双人确认","count":0,"code2":"201700090001","code1":"20170009","code4":"2017000900010001","name1":"高铁CTC风险","name2":"人工错误触发进路；强制执行不双人确认"},{"sort":"2017001200010002","name4":"每月检查路外安全","count":0,"code2":"201700120001","code1":"20170012","code4":"2017001200010002","name1":"路外伤亡风险","name2":"封闭区段方便门不加锁"},{"sort":"2017001200010003","name4":"检查专用线道口防护","count":0,"code2":"201700120001","code1":"20170012","code4":"2017001200010003","name1":"路外伤亡风险","name2":"封闭区段方便门不加锁"},{"sort":"2017001400020001","name4":"每月检查设备质量","count":0,"code2":"201700140002","code1":"20170014","code4":"2017001400020001","name1":"设备质量风险","name2":"设备不按规定检查，带病使用，不按规定修复"},{"sort":"2017001500010001","name4":"检查点名会","count":0,"code2":"201700150001","code1":"20170015","code4":"2017001500010001","name1":"劳动纪律风险","name2":"每月检查劳动纪律"},{"sort":"2017001600010001","name4":"现场检查、监控检查（实时、回放）是否按标准作业，是否唱收唱付","count":0,"code2":"201700160001","code1":"20170016","code4":"2017001600010001","name1":"客运安全风险","name2":"误售风险"},{"sort":"2017001600020001","name4":"现场检查、监控检查（实时、回放）检票员是作业时是否提前组织宣传，是否认真核对票面信息","count":0,"code2":"201700160002","code1":"20170016","code4":"2017001600020001","name1":"客运安全风险","name2":"误检、错检风险"},{"sort":"2017001600030001","name4":"现场检查、监控检查（实时、回放）天桥、地道、平过道是否有人引导，旅客越过安全线行走是否及时制止，是否按三定图到岗到位，是否做到一车一清","count":0,"code2":"201700160003","code1":"20170016","code4":"2017001600030001","name1":"客运安全风险","name2":"乘降风险"},{"sort":"2017001600040001","name4":"现场检查、监控检查（实时、回放）实名验票（证）是否做到票、证、人一致，出站口是否查验票面信息","count":0,"code2":"201700160004","code1":"20170016","code4":"2017001600040001","name1":"客运安全风险","name2":"无票乘车风险"},{"sort":"2017001600050001","name4":"每日检查，动态巡视电扶梯运行状态","count":0,"code2":"201700160005","code1":"20170016","code4":"2017001600050001","name1":"客运安全风险","name2":"电扶梯风险"},{"sort":"2017001600060001","name4":"现场检查、监控检查（实时、回放）执机员监屏状态，手检员手检动作是否规范，开原、昌图、抚顺北、清原4个行包办理站行包承运前是否件件安检","count":0,"code2":"201700160006","code1":"20170016","code4":"2017001600060001","name1":"客运安全风险","name2":"危险品进站上车风险"}]
     */

    private ModelBean model;
    private List<ListBean> list;

    public ModelBean getModel() {
        return model;
    }

    public void setModel(ModelBean model) {
        this.model = model;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ModelBean {
        /**
         * pym : null
         * sjzx_update_time : 2017-07-20 17:25:57
         * count : 0
         * status : 1
         * sjzx_update_useruuid : 9BCA50CE85854539BAD347B10643AC9E
         * pid : 0
         * code : 2017
         * sjzx_create_useruuid : null
         * deleted : 0
         * sjzx_update_username : 沈阳车务段管理员
         * id : 1267
         * add_score : 0
         * level : 0
         * position_id : null
         * name : 安全风险控制表
         * sjzx_create_username : null
         * year : 2017
         * sjzx_create_time : 2017-06-12 11:03:23
         * minus_score : 0
         * unit_code : 0001000900220008
         */

        private Object pym;
        private String sjzx_update_time;
        private int count;
        private int status;
        private String sjzx_update_useruuid;
        private int pid;
        private String code;
        private Object sjzx_create_useruuid;
        private int deleted;
        private String sjzx_update_username;
        private int id;
        private int add_score;
        private int level;
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

        public String getSjzx_update_time() {
            return sjzx_update_time;
        }

        public void setSjzx_update_time(String sjzx_update_time) {
            this.sjzx_update_time = sjzx_update_time;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getSjzx_update_useruuid() {
            return sjzx_update_useruuid;
        }

        public void setSjzx_update_useruuid(String sjzx_update_useruuid) {
            this.sjzx_update_useruuid = sjzx_update_useruuid;
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

        public String getSjzx_update_username() {
            return sjzx_update_username;
        }

        public void setSjzx_update_username(String sjzx_update_username) {
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

    public static class ListBean {
        /**
         * sort : 2017000100010001
         * name4 : 每月检查接发列车
         * count : 0
         * code2 : 201700010001
         * code1 : 20170001
         * code4 : 2017000100010001
         * name1 : 接发列车风险
         * name2 : 错办方向不盯台未发现占用丢失或未及时拦停列车；电力机车错办风险
         */

        private String sort;
        private String name4;
        private int count;
        private String code2;
        private String code1;
        private String code4;
        private String name1;
        private String name2;

        public String getSort() {
            return sort;
        }

        public void setSort(String sort) {
            this.sort = sort;
        }

        public String getName4() {
            return name4;
        }

        public void setName4(String name4) {
            this.name4 = name4;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public String getCode2() {
            return code2;
        }

        public void setCode2(String code2) {
            this.code2 = code2;
        }

        public String getCode1() {
            return code1;
        }

        public void setCode1(String code1) {
            this.code1 = code1;
        }

        public String getCode4() {
            return code4;
        }

        public void setCode4(String code4) {
            this.code4 = code4;
        }

        public String getName1() {
            return name1;
        }

        public void setName1(String name1) {
            this.name1 = name1;
        }

        public String getName2() {
            return name2;
        }

        public void setName2(String name2) {
            this.name2 = name2;
        }
    }
}
