package com.xianzhi.integration.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @Administrator LiBo.
 * @Date 2017/8/1.
 * @Function
 */

public class WarningListBean implements Serializable {

    private int number;
    private int size;
    private String date;
    /**
     * page : {"lastPage":true,"pageSize":50,"pageNumber":1,"list":[{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-3,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":346,"content":"问题预警超过三天未施控","user_name":"刘忠辉","time":"2017-07-31 14:51:00","rownum_":1,"month":"2017-08","sjzx_create_username":null,"user_id":191824,"sjzx_create_time":"2017-07-30 14:51:17","warn_type":2},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-10,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":345,"content":"风险失控红黄灯预警后超过三天未施控","user_name":"鲁晓龙","time":"2017-07-31 14:50:59","rownum_":2,"month":"2017-08","sjzx_create_username":null,"user_id":191830,"sjzx_create_time":"2017-07-30 14:51:16","warn_type":4},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-10,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":344,"content":"风险失控黄灯预警后超过三天未施控","user_name":"吕兰兴","time":"2017-07-31 14:50:57","rownum_":3,"month":"2017-08","sjzx_create_username":null,"user_id":191824,"sjzx_create_time":"2017-07-30 14:51:15","warn_type":4},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-5,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":341,"content":"问题预警超过三天未施控","user_name":"吴国义","time":"2017-07-30 00:05:00","rownum_":4,"month":"2017-08","sjzx_create_username":null,"user_id":191449,"sjzx_create_time":"2017-07-30 00:05:00","warn_type":2},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-10,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":340,"content":"问题预警超过三天未施控","user_name":"吕兰兴","time":"2017-07-30 00:05:00","rownum_":5,"month":"2017-08","sjzx_create_username":null,"user_id":191824,"sjzx_create_time":"2017-07-30 00:05:00","warn_type":2},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-5,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":339,"content":"问题预警超过三天未施控","user_name":"梅河口车务段管理员","time":"2017-07-30 00:05:00","rownum_":6,"month":"2017-08","sjzx_create_username":null,"user_id":189528,"sjzx_create_time":"2017-07-30 00:05:00","warn_type":2},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-10,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":338,"content":"风险失控红黄灯预警后超过三天未施控","user_name":"王继森","time":"2017-07-30 00:05:00","rownum_":7,"month":"2017-08","sjzx_create_username":null,"user_id":191837,"sjzx_create_time":"2017-07-30 00:05:00","warn_type":4},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-10,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":337,"content":"风险失控红灯预警后超过三天未施控","user_name":"张树立","time":"2017-07-30 00:05:00","rownum_":8,"month":"2017-08","sjzx_create_username":null,"user_id":191836,"sjzx_create_time":"2017-07-30 00:05:00","warn_type":4},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-10,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":328,"content":"风险失控黄灯预警后超过三天未施控","user_name":"王立忠","time":"2017-07-30 00:05:00","rownum_":9,"month":"2017-08","sjzx_create_username":null,"user_id":191838,"sjzx_create_time":"2017-07-30 00:05:00","warn_type":4},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-10,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":327,"content":"部门等级红黄灯预警后超过三天未施控","user_name":"梅河口车务段管理员","time":"2017-07-30 00:05:00","rownum_":10,"month":"2017-08","sjzx_create_username":null,"user_id":189528,"sjzx_create_time":"2017-07-30 00:05:00","warn_type":3},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-10,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":326,"content":"部门等级黄灯预警后超过三天未施控","user_name":"谭立民","time":"2017-07-30 00:05:00","rownum_":11,"month":"2017-08","sjzx_create_username":null,"user_id":191468,"sjzx_create_time":"2017-07-30 00:05:00","warn_type":3},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-10,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":325,"content":"部门等级红灯预警后超过三天未施控","user_name":"吕兰兴","time":"2017-07-30 00:05:00","rownum_":12,"month":"2017-08","sjzx_create_username":null,"user_id":191824,"sjzx_create_time":"2017-07-30 00:05:00","warn_type":3},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-5,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":324,"content":"部门等级黄灯预警后超过三天未施控","user_name":"吴国义","time":"2017-07-30 00:05:00","rownum_":13,"month":"2017-08","sjzx_create_username":null,"user_id":191449,"sjzx_create_time":"2017-07-30 00:05:00","warn_type":3},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-5,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":322,"content":"未准时检查导致红黄灯预警","user_name":"梅河口车务段管理员","time":"2017-07-29 00:05:00","rownum_":14,"month":"2017-08","sjzx_create_username":null,"user_id":189528,"sjzx_create_time":"2017-07-29 00:05:00","warn_type":1},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-10,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":313,"content":"未准时检查导致红灯预警","user_name":"张斌","time":"2017-07-28 00:05:00","rownum_":15,"month":"2017-08","sjzx_create_username":null,"user_id":196077,"sjzx_create_time":"2017-07-28 00:05:00","warn_type":1},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-10,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":311,"content":"未准时检查导致红灯预警","user_name":"王继森","time":"2017-07-28 00:05:00","rownum_":16,"month":"2017-08","sjzx_create_username":null,"user_id":191837,"sjzx_create_time":"2017-07-28 00:05:00","warn_type":1},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-3,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":310,"content":"未准时检查导致红黄灯预警","user_name":"梅河口车务段管理员","time":"2017-07-28 00:05:00","rownum_":17,"month":"2017-08","sjzx_create_username":null,"user_id":189528,"sjzx_create_time":"2017-07-28 00:05:00","warn_type":1},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-5,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":307,"content":"干部预警，超过一周未书面提醒","user_name":"马伟红","time":"2017-08-10 16:51:47","rownum_":18,"month":"2017-08","sjzx_create_username":null,"user_id":191591,"sjzx_create_time":"2017-08-10 16:51:47","warn_type":5},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-5,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":301,"content":"风险失控红灯预警后超过三天未施控","user_name":"王继森","time":"2017-07-31 00:02:31","rownum_":19,"month":"2017-08","sjzx_create_username":null,"user_id":191837,"sjzx_create_time":"2017-07-31 00:02:31","warn_type":4},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-10,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":300,"content":"风险失控红黄灯预警后超过三天未施控","user_name":"王继森","time":"2017-07-31 00:02:30","rownum_":20,"month":"2017-08","sjzx_create_username":null,"user_id":191837,"sjzx_create_time":"2017-07-31 00:02:30","warn_type":4},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-10,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":299,"content":"风险失控红灯预警后超过三天未施控","user_name":"张树立","time":"2017-07-31 00:02:30","rownum_":21,"month":"2017-08","sjzx_create_username":null,"user_id":191836,"sjzx_create_time":"2017-07-31 00:02:30","warn_type":4},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-10,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":297,"content":"风险失控黄灯预警后超过三天未施控","user_name":"王立忠","time":"2017-07-31 00:02:29","rownum_":22,"month":"2017-08","sjzx_create_username":null,"user_id":191838,"sjzx_create_time":"2017-07-31 00:02:29","warn_type":4},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-5,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":271,"content":"风险失控黄灯预警后超过三天未施控","user_name":"鲁严","time":"2017-07-31 00:05:04","rownum_":23,"month":"2017-08","sjzx_create_username":null,"user_id":191831,"sjzx_create_time":"2017-07-31 00:05:04","warn_type":4},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-5,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":270,"content":"风险失控黄灯预警后超过三天未施控","user_name":"鲁晓龙","time":"2017-07-31 00:05:00","rownum_":24,"month":"2017-08","sjzx_create_username":null,"user_id":191830,"sjzx_create_time":"2017-07-31 00:05:00","warn_type":4},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-3,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":269,"content":"部门等级红灯预警后超过三天未施控","user_name":"吕兰兴","time":"2017-07-31 00:05:00","rownum_":25,"month":"2017-08","sjzx_create_username":null,"user_id":191824,"sjzx_create_time":"2017-07-31 00:05:00","warn_type":3},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-5,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":268,"content":"风险失控红黄灯预警后超过三天未施控","user_name":"张斌","time":"2017-07-31 00:08:13","rownum_":26,"month":"2017-08","sjzx_create_username":null,"user_id":196077,"sjzx_create_time":"2017-07-31 00:08:13","warn_type":4},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-5,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":267,"content":"风险失控红灯预警后超过三天未施控","user_name":"吕兰兴","time":"2017-07-31 00:08:10","rownum_":27,"month":"2017-08","sjzx_create_username":null,"user_id":191824,"sjzx_create_time":"2017-07-31 00:08:10","warn_type":4},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-10,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":266,"content":"部门等级红灯预警后超过三天未施控","user_name":"吕兰兴","time":"2017-07-31 00:03:35","rownum_":28,"month":"2017-08","sjzx_create_username":null,"user_id":191824,"sjzx_create_time":"2017-07-31 00:03:35","warn_type":3},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-10,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":265,"content":"部门等级红黄灯预警后超过三天未施控","user_name":"梅河口车务段管理员","time":"2017-07-31 00:03:34","rownum_":29,"month":"2017-08","sjzx_create_username":null,"user_id":189528,"sjzx_create_time":"2017-07-31 00:03:35","warn_type":3},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-3,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":253,"content":"问题预警超过三天未施控","user_name":"王鹏","time":"2017-07-30 00:07:24","rownum_":30,"month":"2017-08","sjzx_create_username":null,"user_id":191824,"sjzx_create_time":"2017-07-30 00:07:24","warn_type":2},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-3,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":245,"content":"部门等级红灯预警后超过三天未施控","user_name":"吕兰兴","time":"2017-07-30 00:05:00","rownum_":31,"month":"2017-08","sjzx_create_username":null,"user_id":191824,"sjzx_create_time":"2017-07-30 00:05:00","warn_type":3},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-5,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":227,"content":"问题预警超过三天未施控","user_name":"吴国义","time":"2017-07-29 00:05:00","rownum_":32,"month":"2017-08","sjzx_create_username":null,"user_id":196077,"sjzx_create_time":"2017-07-29 00:05:00","warn_type":2},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-5,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":225,"content":"部门等级红黄灯预警后超过三天未施控","user_name":"王敏","time":"2017-07-29 00:05:00","rownum_":33,"month":"2017-08","sjzx_create_username":null,"user_id":191495,"sjzx_create_time":"2017-07-29 00:05:00","warn_type":3},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-3,"warn_type_name":null,"type":0,"sjzx_create_useruuid":"860D83DAE33C4A249AC840FD840EDA38","deleted":0,"sjzx_update_username":null,"id":224,"content":"包保新职（孙勇），新职取消独立顶岗","user_name":"赵文龙","time":"2017-07-25 16:38:00","rownum_":34,"month":"2017-08","sjzx_create_username":"梅河口车务段管理员","user_id":191564,"sjzx_create_time":"2017-07-25 16:38:00","warn_type":0},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-10,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":223,"content":"部门等级预警后超过三天未施控","user_name":"吕兰兴","time":"2017-07-29 00:05:00","rownum_":35,"month":"2017-08","sjzx_create_username":null,"user_id":191824,"sjzx_create_time":"2017-07-29 00:05:00","warn_type":3},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-10,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":222,"content":"部门等级预警后超过三天未施控","user_name":"张斌","time":"2017-07-29 00:04:17","rownum_":36,"month":"2017-08","sjzx_create_username":null,"user_id":196077,"sjzx_create_time":"2017-07-29 00:04:17","warn_type":3},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-5,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":221,"content":"部门等级预警后超过三天未施控","user_name":"杨巍","time":"2017-07-29 00:04:16","rownum_":37,"month":"2017-08","sjzx_create_username":null,"user_id":191537,"sjzx_create_time":"2017-07-29 00:04:16","warn_type":3},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-10,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":216,"content":"部门等级预警后超过三天未施控","user_name":"陈文聪","time":"2017-07-29 00:05:00","rownum_":38,"month":"2017-08","sjzx_create_username":null,"user_id":191476,"sjzx_create_time":"2017-07-29 00:05:00","warn_type":3},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-10,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":208,"content":"部门等级预警后超过三天未施控","user_name":"张立新","time":"2017-07-29 00:05:24","rownum_":39,"month":"2017-08","sjzx_create_username":null,"user_id":191477,"sjzx_create_time":"2017-07-29 00:05:24","warn_type":3},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-10,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":207,"content":"部门等级预警后超过三天未施控","user_name":"张立新","time":"2017-07-29 00:05:16","rownum_":40,"month":"2017-08","sjzx_create_username":null,"user_id":191477,"sjzx_create_time":"2017-07-29 00:05:17","warn_type":3},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-3,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":206,"content":"问题预警超过三天未施控","user_name":"吕兰兴","time":"2017-08-01 00:07:00","rownum_":41,"month":"2017-08","sjzx_create_username":null,"user_id":191824,"sjzx_create_time":"2017-08-01 00:07:00","warn_type":2},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-3,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":205,"content":"问题预警超过三天未施控","user_name":"盖学录","time":"2017-07-29 00:00:01","rownum_":42,"month":"2017-08","sjzx_create_username":null,"user_id":191494,"sjzx_create_time":"2017-07-29 00:00:01","warn_type":2},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-5,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":204,"content":"未准时检查导致红黄灯预警","user_name":"周伟","time":"2017-07-29 00:05:01","rownum_":43,"month":"2017-08","sjzx_create_username":null,"user_id":191575,"sjzx_create_time":"2017-07-29 00:05:01","warn_type":1},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-5,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":203,"content":"未准时检查导致红灯预警","user_name":"鲁晓龙","time":"2017-07-29 00:05:01","rownum_":44,"month":"2017-08","sjzx_create_username":null,"user_id":191830,"sjzx_create_time":"2017-07-29 00:05:01","warn_type":1},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-5,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":202,"content":"未准时检查导致红灯预警","user_name":"鲁晓龙","time":"2017-07-29 00:05:01","rownum_":45,"month":"2017-08","sjzx_create_username":null,"user_id":191830,"sjzx_create_time":"2017-07-29 00:05:01","warn_type":1},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-10,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":198,"content":"未准时检查导致红灯预警","user_name":"鲁晓龙","time":"2017-07-26 00:36:10","rownum_":46,"month":"2017-08","sjzx_create_username":null,"user_id":191830,"sjzx_create_time":"2017-07-26 00:36:11","warn_type":1},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-5,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":194,"content":"未准时检查导致红灯预警","user_name":"张斌","time":"2017-07-26 00:36:10","rownum_":47,"month":"2017-08","sjzx_create_username":null,"user_id":196077,"sjzx_create_time":"2017-07-26 00:36:10","warn_type":1},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-5,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":189,"content":"未准时检查导致红灯预警","user_name":"张斌","time":"2017-07-26 00:36:09","rownum_":48,"month":"2017-08","sjzx_create_username":null,"user_id":196077,"sjzx_create_time":"2017-07-26 00:36:09","warn_type":1},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-5,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":186,"content":"未准时检查导致红灯预警","user_name":"张斌","time":"2017-07-26 00:36:08","rownum_":49,"month":"2017-08","sjzx_create_username":null,"user_id":196077,"sjzx_create_time":"2017-07-26 00:36:08","warn_type":1},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-10,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":184,"content":"未准时检查导致红黄灯预警","user_name":"梅河口车务段管理员","time":"2017-07-26 00:27:02","rownum_":50,"month":"2017-08","sjzx_create_username":null,"user_id":189528,"sjzx_create_time":"2017-07-26 00:27:02","warn_type":1}],"firstPage":true,"totalRow":50,"totalPage":1}
     * month : 2017-08
     */

    private PageBean page;
    private String month;

    public WarningListBean() {
    }

    public WarningListBean(int number, int size, String date) {
        this.number = number;
        this.size = size;
        this.date = date;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getNumber() {

        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public PageBean getPage() {
        return page;
    }

    public void setPage(PageBean page) {
        this.page = page;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public static class PageBean {
        /**
         * lastPage : true
         * pageSize : 50
         * pageNumber : 1
         * list : [{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-3,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":346,"content":"问题预警超过三天未施控","user_name":"刘忠辉","time":"2017-07-31 14:51:00","rownum_":1,"month":"2017-08","sjzx_create_username":null,"user_id":191824,"sjzx_create_time":"2017-07-30 14:51:17","warn_type":2},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-10,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":345,"content":"风险失控红黄灯预警后超过三天未施控","user_name":"鲁晓龙","time":"2017-07-31 14:50:59","rownum_":2,"month":"2017-08","sjzx_create_username":null,"user_id":191830,"sjzx_create_time":"2017-07-30 14:51:16","warn_type":4},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-10,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":344,"content":"风险失控黄灯预警后超过三天未施控","user_name":"吕兰兴","time":"2017-07-31 14:50:57","rownum_":3,"month":"2017-08","sjzx_create_username":null,"user_id":191824,"sjzx_create_time":"2017-07-30 14:51:15","warn_type":4},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-5,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":341,"content":"问题预警超过三天未施控","user_name":"吴国义","time":"2017-07-30 00:05:00","rownum_":4,"month":"2017-08","sjzx_create_username":null,"user_id":191449,"sjzx_create_time":"2017-07-30 00:05:00","warn_type":2},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-10,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":340,"content":"问题预警超过三天未施控","user_name":"吕兰兴","time":"2017-07-30 00:05:00","rownum_":5,"month":"2017-08","sjzx_create_username":null,"user_id":191824,"sjzx_create_time":"2017-07-30 00:05:00","warn_type":2},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-5,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":339,"content":"问题预警超过三天未施控","user_name":"梅河口车务段管理员","time":"2017-07-30 00:05:00","rownum_":6,"month":"2017-08","sjzx_create_username":null,"user_id":189528,"sjzx_create_time":"2017-07-30 00:05:00","warn_type":2},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-10,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":338,"content":"风险失控红黄灯预警后超过三天未施控","user_name":"王继森","time":"2017-07-30 00:05:00","rownum_":7,"month":"2017-08","sjzx_create_username":null,"user_id":191837,"sjzx_create_time":"2017-07-30 00:05:00","warn_type":4},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-10,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":337,"content":"风险失控红灯预警后超过三天未施控","user_name":"张树立","time":"2017-07-30 00:05:00","rownum_":8,"month":"2017-08","sjzx_create_username":null,"user_id":191836,"sjzx_create_time":"2017-07-30 00:05:00","warn_type":4},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-10,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":328,"content":"风险失控黄灯预警后超过三天未施控","user_name":"王立忠","time":"2017-07-30 00:05:00","rownum_":9,"month":"2017-08","sjzx_create_username":null,"user_id":191838,"sjzx_create_time":"2017-07-30 00:05:00","warn_type":4},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-10,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":327,"content":"部门等级红黄灯预警后超过三天未施控","user_name":"梅河口车务段管理员","time":"2017-07-30 00:05:00","rownum_":10,"month":"2017-08","sjzx_create_username":null,"user_id":189528,"sjzx_create_time":"2017-07-30 00:05:00","warn_type":3},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-10,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":326,"content":"部门等级黄灯预警后超过三天未施控","user_name":"谭立民","time":"2017-07-30 00:05:00","rownum_":11,"month":"2017-08","sjzx_create_username":null,"user_id":191468,"sjzx_create_time":"2017-07-30 00:05:00","warn_type":3},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-10,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":325,"content":"部门等级红灯预警后超过三天未施控","user_name":"吕兰兴","time":"2017-07-30 00:05:00","rownum_":12,"month":"2017-08","sjzx_create_username":null,"user_id":191824,"sjzx_create_time":"2017-07-30 00:05:00","warn_type":3},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-5,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":324,"content":"部门等级黄灯预警后超过三天未施控","user_name":"吴国义","time":"2017-07-30 00:05:00","rownum_":13,"month":"2017-08","sjzx_create_username":null,"user_id":191449,"sjzx_create_time":"2017-07-30 00:05:00","warn_type":3},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-5,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":322,"content":"未准时检查导致红黄灯预警","user_name":"梅河口车务段管理员","time":"2017-07-29 00:05:00","rownum_":14,"month":"2017-08","sjzx_create_username":null,"user_id":189528,"sjzx_create_time":"2017-07-29 00:05:00","warn_type":1},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-10,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":313,"content":"未准时检查导致红灯预警","user_name":"张斌","time":"2017-07-28 00:05:00","rownum_":15,"month":"2017-08","sjzx_create_username":null,"user_id":196077,"sjzx_create_time":"2017-07-28 00:05:00","warn_type":1},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-10,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":311,"content":"未准时检查导致红灯预警","user_name":"王继森","time":"2017-07-28 00:05:00","rownum_":16,"month":"2017-08","sjzx_create_username":null,"user_id":191837,"sjzx_create_time":"2017-07-28 00:05:00","warn_type":1},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-3,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":310,"content":"未准时检查导致红黄灯预警","user_name":"梅河口车务段管理员","time":"2017-07-28 00:05:00","rownum_":17,"month":"2017-08","sjzx_create_username":null,"user_id":189528,"sjzx_create_time":"2017-07-28 00:05:00","warn_type":1},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-5,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":307,"content":"干部预警，超过一周未书面提醒","user_name":"马伟红","time":"2017-08-10 16:51:47","rownum_":18,"month":"2017-08","sjzx_create_username":null,"user_id":191591,"sjzx_create_time":"2017-08-10 16:51:47","warn_type":5},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-5,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":301,"content":"风险失控红灯预警后超过三天未施控","user_name":"王继森","time":"2017-07-31 00:02:31","rownum_":19,"month":"2017-08","sjzx_create_username":null,"user_id":191837,"sjzx_create_time":"2017-07-31 00:02:31","warn_type":4},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-10,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":300,"content":"风险失控红黄灯预警后超过三天未施控","user_name":"王继森","time":"2017-07-31 00:02:30","rownum_":20,"month":"2017-08","sjzx_create_username":null,"user_id":191837,"sjzx_create_time":"2017-07-31 00:02:30","warn_type":4},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-10,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":299,"content":"风险失控红灯预警后超过三天未施控","user_name":"张树立","time":"2017-07-31 00:02:30","rownum_":21,"month":"2017-08","sjzx_create_username":null,"user_id":191836,"sjzx_create_time":"2017-07-31 00:02:30","warn_type":4},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-10,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":297,"content":"风险失控黄灯预警后超过三天未施控","user_name":"王立忠","time":"2017-07-31 00:02:29","rownum_":22,"month":"2017-08","sjzx_create_username":null,"user_id":191838,"sjzx_create_time":"2017-07-31 00:02:29","warn_type":4},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-5,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":271,"content":"风险失控黄灯预警后超过三天未施控","user_name":"鲁严","time":"2017-07-31 00:05:04","rownum_":23,"month":"2017-08","sjzx_create_username":null,"user_id":191831,"sjzx_create_time":"2017-07-31 00:05:04","warn_type":4},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-5,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":270,"content":"风险失控黄灯预警后超过三天未施控","user_name":"鲁晓龙","time":"2017-07-31 00:05:00","rownum_":24,"month":"2017-08","sjzx_create_username":null,"user_id":191830,"sjzx_create_time":"2017-07-31 00:05:00","warn_type":4},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-3,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":269,"content":"部门等级红灯预警后超过三天未施控","user_name":"吕兰兴","time":"2017-07-31 00:05:00","rownum_":25,"month":"2017-08","sjzx_create_username":null,"user_id":191824,"sjzx_create_time":"2017-07-31 00:05:00","warn_type":3},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-5,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":268,"content":"风险失控红黄灯预警后超过三天未施控","user_name":"张斌","time":"2017-07-31 00:08:13","rownum_":26,"month":"2017-08","sjzx_create_username":null,"user_id":196077,"sjzx_create_time":"2017-07-31 00:08:13","warn_type":4},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-5,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":267,"content":"风险失控红灯预警后超过三天未施控","user_name":"吕兰兴","time":"2017-07-31 00:08:10","rownum_":27,"month":"2017-08","sjzx_create_username":null,"user_id":191824,"sjzx_create_time":"2017-07-31 00:08:10","warn_type":4},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-10,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":266,"content":"部门等级红灯预警后超过三天未施控","user_name":"吕兰兴","time":"2017-07-31 00:03:35","rownum_":28,"month":"2017-08","sjzx_create_username":null,"user_id":191824,"sjzx_create_time":"2017-07-31 00:03:35","warn_type":3},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-10,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":265,"content":"部门等级红黄灯预警后超过三天未施控","user_name":"梅河口车务段管理员","time":"2017-07-31 00:03:34","rownum_":29,"month":"2017-08","sjzx_create_username":null,"user_id":189528,"sjzx_create_time":"2017-07-31 00:03:35","warn_type":3},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-3,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":253,"content":"问题预警超过三天未施控","user_name":"王鹏","time":"2017-07-30 00:07:24","rownum_":30,"month":"2017-08","sjzx_create_username":null,"user_id":191824,"sjzx_create_time":"2017-07-30 00:07:24","warn_type":2},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-3,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":245,"content":"部门等级红灯预警后超过三天未施控","user_name":"吕兰兴","time":"2017-07-30 00:05:00","rownum_":31,"month":"2017-08","sjzx_create_username":null,"user_id":191824,"sjzx_create_time":"2017-07-30 00:05:00","warn_type":3},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-5,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":227,"content":"问题预警超过三天未施控","user_name":"吴国义","time":"2017-07-29 00:05:00","rownum_":32,"month":"2017-08","sjzx_create_username":null,"user_id":196077,"sjzx_create_time":"2017-07-29 00:05:00","warn_type":2},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-5,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":225,"content":"部门等级红黄灯预警后超过三天未施控","user_name":"王敏","time":"2017-07-29 00:05:00","rownum_":33,"month":"2017-08","sjzx_create_username":null,"user_id":191495,"sjzx_create_time":"2017-07-29 00:05:00","warn_type":3},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-3,"warn_type_name":null,"type":0,"sjzx_create_useruuid":"860D83DAE33C4A249AC840FD840EDA38","deleted":0,"sjzx_update_username":null,"id":224,"content":"包保新职（孙勇），新职取消独立顶岗","user_name":"赵文龙","time":"2017-07-25 16:38:00","rownum_":34,"month":"2017-08","sjzx_create_username":"梅河口车务段管理员","user_id":191564,"sjzx_create_time":"2017-07-25 16:38:00","warn_type":0},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-10,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":223,"content":"部门等级预警后超过三天未施控","user_name":"吕兰兴","time":"2017-07-29 00:05:00","rownum_":35,"month":"2017-08","sjzx_create_username":null,"user_id":191824,"sjzx_create_time":"2017-07-29 00:05:00","warn_type":3},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-10,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":222,"content":"部门等级预警后超过三天未施控","user_name":"张斌","time":"2017-07-29 00:04:17","rownum_":36,"month":"2017-08","sjzx_create_username":null,"user_id":196077,"sjzx_create_time":"2017-07-29 00:04:17","warn_type":3},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-5,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":221,"content":"部门等级预警后超过三天未施控","user_name":"杨巍","time":"2017-07-29 00:04:16","rownum_":37,"month":"2017-08","sjzx_create_username":null,"user_id":191537,"sjzx_create_time":"2017-07-29 00:04:16","warn_type":3},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-10,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":216,"content":"部门等级预警后超过三天未施控","user_name":"陈文聪","time":"2017-07-29 00:05:00","rownum_":38,"month":"2017-08","sjzx_create_username":null,"user_id":191476,"sjzx_create_time":"2017-07-29 00:05:00","warn_type":3},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-10,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":208,"content":"部门等级预警后超过三天未施控","user_name":"张立新","time":"2017-07-29 00:05:24","rownum_":39,"month":"2017-08","sjzx_create_username":null,"user_id":191477,"sjzx_create_time":"2017-07-29 00:05:24","warn_type":3},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-10,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":207,"content":"部门等级预警后超过三天未施控","user_name":"张立新","time":"2017-07-29 00:05:16","rownum_":40,"month":"2017-08","sjzx_create_username":null,"user_id":191477,"sjzx_create_time":"2017-07-29 00:05:17","warn_type":3},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-3,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":206,"content":"问题预警超过三天未施控","user_name":"吕兰兴","time":"2017-08-01 00:07:00","rownum_":41,"month":"2017-08","sjzx_create_username":null,"user_id":191824,"sjzx_create_time":"2017-08-01 00:07:00","warn_type":2},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-3,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":205,"content":"问题预警超过三天未施控","user_name":"盖学录","time":"2017-07-29 00:00:01","rownum_":42,"month":"2017-08","sjzx_create_username":null,"user_id":191494,"sjzx_create_time":"2017-07-29 00:00:01","warn_type":2},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-5,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":204,"content":"未准时检查导致红黄灯预警","user_name":"周伟","time":"2017-07-29 00:05:01","rownum_":43,"month":"2017-08","sjzx_create_username":null,"user_id":191575,"sjzx_create_time":"2017-07-29 00:05:01","warn_type":1},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-5,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":203,"content":"未准时检查导致红灯预警","user_name":"鲁晓龙","time":"2017-07-29 00:05:01","rownum_":44,"month":"2017-08","sjzx_create_username":null,"user_id":191830,"sjzx_create_time":"2017-07-29 00:05:01","warn_type":1},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-5,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":202,"content":"未准时检查导致红灯预警","user_name":"鲁晓龙","time":"2017-07-29 00:05:01","rownum_":45,"month":"2017-08","sjzx_create_username":null,"user_id":191830,"sjzx_create_time":"2017-07-29 00:05:01","warn_type":1},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-10,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":198,"content":"未准时检查导致红灯预警","user_name":"鲁晓龙","time":"2017-07-26 00:36:10","rownum_":46,"month":"2017-08","sjzx_create_username":null,"user_id":191830,"sjzx_create_time":"2017-07-26 00:36:11","warn_type":1},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-5,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":194,"content":"未准时检查导致红灯预警","user_name":"张斌","time":"2017-07-26 00:36:10","rownum_":47,"month":"2017-08","sjzx_create_username":null,"user_id":196077,"sjzx_create_time":"2017-07-26 00:36:10","warn_type":1},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-5,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":189,"content":"未准时检查导致红灯预警","user_name":"张斌","time":"2017-07-26 00:36:09","rownum_":48,"month":"2017-08","sjzx_create_username":null,"user_id":196077,"sjzx_create_time":"2017-07-26 00:36:09","warn_type":1},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-5,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":186,"content":"未准时检查导致红灯预警","user_name":"张斌","time":"2017-07-26 00:36:08","rownum_":49,"month":"2017-08","sjzx_create_username":null,"user_id":196077,"sjzx_create_time":"2017-07-26 00:36:08","warn_type":1},{"sjzx_update_time":null,"sjzx_update_useruuid":null,"score":-10,"warn_type_name":null,"type":0,"sjzx_create_useruuid":null,"deleted":0,"sjzx_update_username":null,"id":184,"content":"未准时检查导致红黄灯预警","user_name":"梅河口车务段管理员","time":"2017-07-26 00:27:02","rownum_":50,"month":"2017-08","sjzx_create_username":null,"user_id":189528,"sjzx_create_time":"2017-07-26 00:27:02","warn_type":1}]
         * firstPage : true
         * totalRow : 50
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
             * sjzx_update_time : null
             * sjzx_update_useruuid : null
             * score : -3
             * warn_type_name : null
             * type : 0
             * sjzx_create_useruuid : null
             * deleted : 0
             * sjzx_update_username : null
             * id : 346
             * content : 问题预警超过三天未施控
             * user_name : 刘忠辉
             * time : 2017-07-31 14:51:00
             * rownum_ : 1
             * month : 2017-08
             * sjzx_create_username : null
             * user_id : 191824
             * sjzx_create_time : 2017-07-30 14:51:17
             * warn_type : 2
             */

            private Object sjzx_update_time;
            private Object sjzx_update_useruuid;
            private String score;
            private Object warn_type_name;
            private int type;
            private Object sjzx_create_useruuid;
            private int deleted;
            private Object sjzx_update_username;
            private int id;
            private String content;
            private String user_name;
            private String time;
            private int rownum_;
            private String month;
            private Object sjzx_create_username;
            private int user_id;
            private String sjzx_create_time;
            private int warn_type;

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

            public String getScore() {
                return score;
            }

            public void setScore(String score) {
                this.score = score;
            }

            public Object getWarn_type_name() {
                return warn_type_name;
            }

            public void setWarn_type_name(Object warn_type_name) {
                this.warn_type_name = warn_type_name;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
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

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getUser_name() {
                return user_name;
            }

            public void setUser_name(String user_name) {
                this.user_name = user_name;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public int getRownum_() {
                return rownum_;
            }

            public void setRownum_(int rownum_) {
                this.rownum_ = rownum_;
            }

            public String getMonth() {
                return month;
            }

            public void setMonth(String month) {
                this.month = month;
            }

            public Object getSjzx_create_username() {
                return sjzx_create_username;
            }

            public void setSjzx_create_username(Object sjzx_create_username) {
                this.sjzx_create_username = sjzx_create_username;
            }

            public int getUser_id() {
                return user_id;
            }

            public void setUser_id(int user_id) {
                this.user_id = user_id;
            }

            public String getSjzx_create_time() {
                return sjzx_create_time;
            }

            public void setSjzx_create_time(String sjzx_create_time) {
                this.sjzx_create_time = sjzx_create_time;
            }

            public int getWarn_type() {
                return warn_type;
            }

            public void setWarn_type(int warn_type) {
                this.warn_type = warn_type;
            }
        }
    }
}
