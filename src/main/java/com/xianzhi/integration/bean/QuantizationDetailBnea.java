package com.xianzhi.integration.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @Administrator LiBo.
 * @Date 2017/7/31.
 * @Function
 */

public class QuantizationDetailBnea implements Serializable {

    private int number;
    private int size;
    private String inemId;
    /**
     * personalAssessmentInfo : {"dynamic":0,"id":756997,"content":"检查接发列车","normal_done":5,"normal":5,"dynamic_done":0,"month":"2017-06","extra_done":2,"user_id":234846,"risk_control_id":683}
     * page : {"lastPage":true,"pageSize":50,"pageNumber":1,"firstPage":true,"list":[{"sjzx_update_time":null,"user_dept_name":null,"user_dept_id":null,"is_bbm":0,"risk_point_id":null,"place_type_id":8210,"zrsta_name":"白城北站","sjzx_update_username":null,"id":1559632,"dept_id":2275,"time":"2017-05-28 00:10:33","rownum_":1,"opinion":null,"user_id":234846,"place":"现场","leader_dept_code":null,"is_ks":0,"place_id":11391,"user_position":null,"place_type":"其他","pre_assessment_id":756997,"status":5,"sjzx_update_useruuid":null,"dept_name":"白城北站","sjzx_create_useruuid":null,"risk_type_id":null,"leader_dept_id":null,"content":"5月28日0:10-1:10分，检查白城北站安全基础工作、劳动纪律、防火设备、行车主管设备、交接班、助理发7道44236次车机联控，监控51521次调车作业，检查防溜情况、三方控、双确认、两先两后。","user_name":"黄志鹏","flag":0,"leader_id":null,"risk_point_name":null,"risk_type_name":null,"month":null,"create_time":"2017-06-02 17:18:08","sjzx_create_username":null,"sjzx_create_time":"2017-06-12 11:02:47","zrsta_id":2275,"unit_code":"0001000900130002"},{"sjzx_update_time":null,"user_dept_name":null,"user_dept_id":null,"is_bbm":0,"risk_point_id":null,"place_type_id":6854,"zrsta_name":"白城站","sjzx_update_username":null,"id":1559727,"dept_id":2272,"time":"2017-05-28 02:00:50","rownum_":2,"opinion":null,"user_id":234846,"place":"现场","leader_dept_code":null,"is_ks":0,"place_id":11379,"user_position":null,"place_type":"其他","pre_assessment_id":756997,"status":5,"sjzx_update_useruuid":null,"dept_name":"白城站","sjzx_create_useruuid":null,"risk_type_id":null,"leader_dept_id":null,"content":"5月28日2：00-4:30分，检查白城站安全基础工作、防火防爆、劳动纪律、行车自管设备、货检、列尾作业、人身安全标准执行。检查客运三品安检、客车K7565、K1302、K7566次旅客乘降组织，助理接发89009次、客车K7565、K1302、K7566次，监听车机联控用语。监控K957次客车体、32002次调车作业，检查三方控、双确认、停留车止轮，调车联控用语。","user_name":"黄志鹏","flag":0,"leader_id":null,"risk_point_name":null,"risk_type_name":null,"month":null,"create_time":"2017-06-02 17:29:15","sjzx_create_username":null,"sjzx_create_time":"2017-06-12 11:02:47","zrsta_id":2272,"unit_code":"0001000900130002"},{"sjzx_update_time":null,"user_dept_name":null,"user_dept_id":null,"is_bbm":0,"risk_point_id":null,"place_type_id":6854,"zrsta_name":"白城站","sjzx_update_username":null,"id":1559728,"dept_id":2272,"time":"2017-05-28 02:00:50","rownum_":3,"opinion":null,"user_id":234846,"place":"现场","leader_dept_code":null,"is_ks":0,"place_id":11379,"user_position":null,"place_type":"其他","pre_assessment_id":756997,"status":5,"sjzx_update_useruuid":null,"dept_name":"白城站","sjzx_create_useruuid":null,"risk_type_id":null,"leader_dept_id":null,"content":"5月28日2：00-4:30分，检查白城站安全基础工作、防火防爆、劳动纪律、行车自管设备、货检、列尾作业、人身安全标准执行。检查客运三品安检、客车K7565、K1302、K7566次旅客乘降组织，助理接发89009次、客车K7565、K1302、K7566次，监听车机联控用语。监控K957次客车体、32002次调车作业，检查三方控、双确认、停留车止轮，调车联控用语。","user_name":"黄志鹏","flag":0,"leader_id":null,"risk_point_name":null,"risk_type_name":null,"month":null,"create_time":"2017-06-02 17:29:15","sjzx_create_username":null,"sjzx_create_time":"2017-06-12 11:02:47","zrsta_id":2272,"unit_code":"0001000900130002"},{"sjzx_update_time":null,"user_dept_name":null,"user_dept_id":null,"is_bbm":0,"risk_point_id":null,"place_type_id":6854,"zrsta_name":"白城站","sjzx_update_username":null,"id":1559729,"dept_id":2272,"time":"2017-05-28 02:00:50","rownum_":4,"opinion":null,"user_id":234846,"place":"现场","leader_dept_code":null,"is_ks":0,"place_id":11379,"user_position":null,"place_type":"其他","pre_assessment_id":756997,"status":5,"sjzx_update_useruuid":null,"dept_name":"白城站","sjzx_create_useruuid":null,"risk_type_id":null,"leader_dept_id":null,"content":"5月28日2：00-4:30分，检查白城站安全基础工作、防火防爆、劳动纪律、行车自管设备、货检、列尾作业、人身安全标准执行。检查客运三品安检、客车K7565、K1302、K7566次旅客乘降组织，助理接发89009次、客车K7565、K1302、K7566次，监听车机联控用语。监控K957次客车体、32002次调车作业，检查三方控、双确认、停留车止轮，调车联控用语。","user_name":"黄志鹏","flag":0,"leader_id":null,"risk_point_name":null,"risk_type_name":null,"month":null,"create_time":"2017-06-02 17:29:15","sjzx_create_username":null,"sjzx_create_time":"2017-06-12 11:02:47","zrsta_id":2272,"unit_code":"0001000900130002"},{"sjzx_update_time":null,"user_dept_name":null,"user_dept_id":null,"is_bbm":0,"risk_point_id":null,"place_type_id":6854,"zrsta_name":"白城站","sjzx_update_username":null,"id":1559730,"dept_id":2272,"time":"2017-05-28 02:00:50","rownum_":5,"opinion":null,"user_id":234846,"place":"现场","leader_dept_code":null,"is_ks":0,"place_id":11379,"user_position":null,"place_type":"其他","pre_assessment_id":756997,"status":5,"sjzx_update_useruuid":null,"dept_name":"白城站","sjzx_create_useruuid":null,"risk_type_id":null,"leader_dept_id":null,"content":"5月28日2：00-4:30分，检查白城站安全基础工作、防火防爆、劳动纪律、行车自管设备、货检、列尾作业、人身安全标准执行。检查客运三品安检、客车K7565、K1302、K7566次旅客乘降组织，助理接发89009次、客车K7565、K1302、K7566次，监听车机联控用语。监控K957次客车体、32002次调车作业，检查三方控、双确认、停留车止轮，调车联控用语。","user_name":"黄志鹏","flag":0,"leader_id":null,"risk_point_name":null,"risk_type_name":null,"month":null,"create_time":"2017-06-02 17:29:15","sjzx_create_username":null,"sjzx_create_time":"2017-06-12 11:02:47","zrsta_id":2272,"unit_code":"0001000900130002"},{"sjzx_update_time":null,"user_dept_name":null,"user_dept_id":null,"is_bbm":0,"risk_point_id":null,"place_type_id":10519,"zrsta_name":"乌兰浩特站","sjzx_update_username":null,"id":1679410,"dept_id":2281,"time":"2017-06-10 13:30:48","rownum_":6,"opinion":null,"user_id":234846,"place":"现场","leader_dept_code":null,"is_ks":0,"place_id":11459,"user_position":null,"place_type":"其他","pre_assessment_id":756997,"status":5,"sjzx_update_useruuid":null,"dept_name":"乌兰浩特站","sjzx_create_useruuid":null,"risk_type_id":null,"leader_dept_id":null,"content":"6月10日13:30分，检查乌兰浩特站安全基础工作、行车设备管理、防火设备设施、分路不良管理、电气化人身安全措施掌握情况、站区站序、检测车、动检车办理方式、汛期、施工资料、新图掌握情况、劳动纪律。监控0045号机车调车作业，检查三方控、双确认、两先两后、专用线止轮、调车联控用语。检查客运工作，客车K2014、1820次旅客三品安检、乘降组织，监听车机联控。","user_name":"黄志鹏","flag":0,"leader_id":null,"risk_point_name":null,"risk_type_name":null,"month":null,"create_time":"2017-06-12 13:55:14","sjzx_create_username":null,"sjzx_create_time":"2017-06-12 13:55:14","zrsta_id":2281,"unit_code":"0001000900130002"},{"sjzx_update_time":null,"user_dept_name":null,"user_dept_id":null,"is_bbm":0,"risk_point_id":null,"place_type_id":10659,"zrsta_name":"阿尔山站","sjzx_update_username":null,"id":1679543,"dept_id":2162,"time":"2017-06-10 20:00:42","rownum_":7,"opinion":null,"user_id":234846,"place":"现场","leader_dept_code":null,"is_ks":0,"place_id":10701,"user_position":null,"place_type":"其他","pre_assessment_id":756997,"status":5,"sjzx_update_useruuid":null,"dept_name":"阿尔山站","sjzx_create_useruuid":null,"risk_type_id":null,"leader_dept_id":null,"content":"6月10日20:00分，检查阿尔山站安全基础工作、行车设备管理、防火设备设施、站区秩序、询问汛期车站防洪地段、劳动纪律。检查客车K7566次旅客三品安检、乘降组织、路外防护，监听车机联控。","user_name":"黄志鹏","flag":0,"leader_id":null,"risk_point_name":null,"risk_type_name":null,"month":null,"create_time":"2017-06-12 14:02:27","sjzx_create_username":null,"sjzx_create_time":"2017-06-12 14:02:27","zrsta_id":2162,"unit_code":"0001000900130002"}],"totalRow":7,"totalPage":1}
     * user : {"birth":"19730914","dept_name4":"安全科","dept_name3":"白城车务段","dept_name1":"沈阳铁路局","sso_uuid":"97BF7D9D10694AA28BD5C14E5FD10535","leader_type":1,"quan_post_name":null,"bzb":0,"dept_full_name":"沈阳铁路局-运输处-白城车务段-安全科","laid_off_time":null,"dept_name7":null,"dept_name5":null,"dept_name6":null,"ctc":0,"dept_code7":null,"dept_code6":null,"user_type_name":"在岗工作","dept_code5":null,"seniority1":null,"dept_code4":"0001000900130002","dept_code3":"000100090013","pm":0,"isshangbao":"0","position":2985,"dt":0,"fhy":0,"sys":0,"lw":0,"zdz":0,"is_leadership":null,"start_work_date":"19930914","dept_id":2150,"dg":0,"token":null,"ccsj":0,"position_duty":null,"dept_cwd_or_stn_name":"白城车务段","dept_station_code":null,"post":1,"dept_station_name":null,"technical_level":null,"dept_name":"安全科","labor":null,"dept_cwd_or_stn_code":"000100090013","feeling":null,"login_name":"222302197309140911","user_type_id":1,"lzh":"234846","cb":0,"card_number":null,"tel":null,"tf":0,"quan_post_id":null,"type":0,"remark1":null,"password":"C4CA4238A0B923820DCC509A6F75849B","remark3":null,"remark2":null,"is_leader":0,"gender":1,"inbox_do_sort":"0","dept_cwd_name":"白城车务段","seniority":45,"post_name":"空","dc":0,"technical_level_name":null,"jsj":0,"dept_code":"0001000900130002","leader_type_name":"专业技术","key_person_mark":0,"deleted":0,"6502":0,"position_name":"技术员","email":null,"dept_cwd_code":"000100090013","create_time":"2017-02-06 09:06:45","work_experience":"1996.07\u20141998.09      太平川工务段线路工\r\n1998.09\u20142004.03      洮南站连结员\r\n2004.03\u20142005.04      洮南站客运员\r\n2005.04\u20142010.03      安广站助理值班员\r\n2010.03\u20142014.08      安广站车站值班员\r\n2014.08\u20142015.12      建设站代站长\r\n2015.12\u2014             安全路风监察科代技术员\r\n","ch":0,"zg":0,"pym":"hzp","zb":0,"cert_id":null,"cancel_status":0,"hj":0,"dept_type":11,"id_card":"222302197309140911","last_login_ip":null,"education":"大专","ljy":0,"id":234846,"name":"黄志鹏","sso_app_name":null,"outbox_do_sort":"RECEIVES2","ethnic":null,"political":null,"working_time":null,"last_login_time":"2017-06-12 15:36:54","yb":0,"duty_name":null,"photo":null,"dcz":0,"login_count":252}
     */

    private PersonalAssessmentInfoBean personalAssessmentInfo;
    private PageBean page;
    private UserBean user;

    public QuantizationDetailBnea() {

    }

    public QuantizationDetailBnea(int number, int size, String inemId) {
        this.number = number;
        this.size = size;
        this.inemId = inemId;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getInemId() {
        return inemId;
    }

    public void setInemId(String inemId) {
        this.inemId = inemId;
    }

    public PersonalAssessmentInfoBean getPersonalAssessmentInfo() {
        return personalAssessmentInfo;
    }

    public void setPersonalAssessmentInfo(PersonalAssessmentInfoBean personalAssessmentInfo) {
        this.personalAssessmentInfo = personalAssessmentInfo;
    }

    public PageBean getPage() {
        return page;
    }

    public void setPage(PageBean page) {
        this.page = page;
    }

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }


    public static class PersonalAssessmentInfoBean {
        /**
         * dynamic : 0
         * id : 756997
         * content : 检查接发列车
         * normal_done : 5
         * normal : 5
         * dynamic_done : 0
         * month : 2017-06
         * extra_done : 2
         * user_id : 234846
         * risk_control_id : 683
         */

        private int dynamic;
        private int id;
        private String content;
        private int normal_done;
        private int normal;
        private int dynamic_done;
        private String month;
        private int extra_done;
        private int user_id;
        private int risk_control_id;

        public int getDynamic() {
            return dynamic;
        }

        public void setDynamic(int dynamic) {
            this.dynamic = dynamic;
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

        public int getNormal_done() {
            return normal_done;
        }

        public void setNormal_done(int normal_done) {
            this.normal_done = normal_done;
        }

        public int getNormal() {
            return normal;
        }

        public void setNormal(int normal) {
            this.normal = normal;
        }

        public int getDynamic_done() {
            return dynamic_done;
        }

        public void setDynamic_done(int dynamic_done) {
            this.dynamic_done = dynamic_done;
        }

        public String getMonth() {
            return month;
        }

        public void setMonth(String month) {
            this.month = month;
        }

        public int getExtra_done() {
            return extra_done;
        }

        public void setExtra_done(int extra_done) {
            this.extra_done = extra_done;
        }

        public int getUser_id() {
            return user_id;
        }

        public void setUser_id(int user_id) {
            this.user_id = user_id;
        }

        public int getRisk_control_id() {
            return risk_control_id;
        }

        public void setRisk_control_id(int risk_control_id) {
            this.risk_control_id = risk_control_id;
        }
    }

    public static class PageBean {
        /**
         * lastPage : true
         * pageSize : 50
         * pageNumber : 1
         * firstPage : true
         * list : [{"sjzx_update_time":null,"user_dept_name":null,"user_dept_id":null,"is_bbm":0,"risk_point_id":null,"place_type_id":8210,"zrsta_name":"白城北站","sjzx_update_username":null,"id":1559632,"dept_id":2275,"time":"2017-05-28 00:10:33","rownum_":1,"opinion":null,"user_id":234846,"place":"现场","leader_dept_code":null,"is_ks":0,"place_id":11391,"user_position":null,"place_type":"其他","pre_assessment_id":756997,"status":5,"sjzx_update_useruuid":null,"dept_name":"白城北站","sjzx_create_useruuid":null,"risk_type_id":null,"leader_dept_id":null,"content":"5月28日0:10-1:10分，检查白城北站安全基础工作、劳动纪律、防火设备、行车主管设备、交接班、助理发7道44236次车机联控，监控51521次调车作业，检查防溜情况、三方控、双确认、两先两后。","user_name":"黄志鹏","flag":0,"leader_id":null,"risk_point_name":null,"risk_type_name":null,"month":null,"create_time":"2017-06-02 17:18:08","sjzx_create_username":null,"sjzx_create_time":"2017-06-12 11:02:47","zrsta_id":2275,"unit_code":"0001000900130002"},{"sjzx_update_time":null,"user_dept_name":null,"user_dept_id":null,"is_bbm":0,"risk_point_id":null,"place_type_id":6854,"zrsta_name":"白城站","sjzx_update_username":null,"id":1559727,"dept_id":2272,"time":"2017-05-28 02:00:50","rownum_":2,"opinion":null,"user_id":234846,"place":"现场","leader_dept_code":null,"is_ks":0,"place_id":11379,"user_position":null,"place_type":"其他","pre_assessment_id":756997,"status":5,"sjzx_update_useruuid":null,"dept_name":"白城站","sjzx_create_useruuid":null,"risk_type_id":null,"leader_dept_id":null,"content":"5月28日2：00-4:30分，检查白城站安全基础工作、防火防爆、劳动纪律、行车自管设备、货检、列尾作业、人身安全标准执行。检查客运三品安检、客车K7565、K1302、K7566次旅客乘降组织，助理接发89009次、客车K7565、K1302、K7566次，监听车机联控用语。监控K957次客车体、32002次调车作业，检查三方控、双确认、停留车止轮，调车联控用语。","user_name":"黄志鹏","flag":0,"leader_id":null,"risk_point_name":null,"risk_type_name":null,"month":null,"create_time":"2017-06-02 17:29:15","sjzx_create_username":null,"sjzx_create_time":"2017-06-12 11:02:47","zrsta_id":2272,"unit_code":"0001000900130002"},{"sjzx_update_time":null,"user_dept_name":null,"user_dept_id":null,"is_bbm":0,"risk_point_id":null,"place_type_id":6854,"zrsta_name":"白城站","sjzx_update_username":null,"id":1559728,"dept_id":2272,"time":"2017-05-28 02:00:50","rownum_":3,"opinion":null,"user_id":234846,"place":"现场","leader_dept_code":null,"is_ks":0,"place_id":11379,"user_position":null,"place_type":"其他","pre_assessment_id":756997,"status":5,"sjzx_update_useruuid":null,"dept_name":"白城站","sjzx_create_useruuid":null,"risk_type_id":null,"leader_dept_id":null,"content":"5月28日2：00-4:30分，检查白城站安全基础工作、防火防爆、劳动纪律、行车自管设备、货检、列尾作业、人身安全标准执行。检查客运三品安检、客车K7565、K1302、K7566次旅客乘降组织，助理接发89009次、客车K7565、K1302、K7566次，监听车机联控用语。监控K957次客车体、32002次调车作业，检查三方控、双确认、停留车止轮，调车联控用语。","user_name":"黄志鹏","flag":0,"leader_id":null,"risk_point_name":null,"risk_type_name":null,"month":null,"create_time":"2017-06-02 17:29:15","sjzx_create_username":null,"sjzx_create_time":"2017-06-12 11:02:47","zrsta_id":2272,"unit_code":"0001000900130002"},{"sjzx_update_time":null,"user_dept_name":null,"user_dept_id":null,"is_bbm":0,"risk_point_id":null,"place_type_id":6854,"zrsta_name":"白城站","sjzx_update_username":null,"id":1559729,"dept_id":2272,"time":"2017-05-28 02:00:50","rownum_":4,"opinion":null,"user_id":234846,"place":"现场","leader_dept_code":null,"is_ks":0,"place_id":11379,"user_position":null,"place_type":"其他","pre_assessment_id":756997,"status":5,"sjzx_update_useruuid":null,"dept_name":"白城站","sjzx_create_useruuid":null,"risk_type_id":null,"leader_dept_id":null,"content":"5月28日2：00-4:30分，检查白城站安全基础工作、防火防爆、劳动纪律、行车自管设备、货检、列尾作业、人身安全标准执行。检查客运三品安检、客车K7565、K1302、K7566次旅客乘降组织，助理接发89009次、客车K7565、K1302、K7566次，监听车机联控用语。监控K957次客车体、32002次调车作业，检查三方控、双确认、停留车止轮，调车联控用语。","user_name":"黄志鹏","flag":0,"leader_id":null,"risk_point_name":null,"risk_type_name":null,"month":null,"create_time":"2017-06-02 17:29:15","sjzx_create_username":null,"sjzx_create_time":"2017-06-12 11:02:47","zrsta_id":2272,"unit_code":"0001000900130002"},{"sjzx_update_time":null,"user_dept_name":null,"user_dept_id":null,"is_bbm":0,"risk_point_id":null,"place_type_id":6854,"zrsta_name":"白城站","sjzx_update_username":null,"id":1559730,"dept_id":2272,"time":"2017-05-28 02:00:50","rownum_":5,"opinion":null,"user_id":234846,"place":"现场","leader_dept_code":null,"is_ks":0,"place_id":11379,"user_position":null,"place_type":"其他","pre_assessment_id":756997,"status":5,"sjzx_update_useruuid":null,"dept_name":"白城站","sjzx_create_useruuid":null,"risk_type_id":null,"leader_dept_id":null,"content":"5月28日2：00-4:30分，检查白城站安全基础工作、防火防爆、劳动纪律、行车自管设备、货检、列尾作业、人身安全标准执行。检查客运三品安检、客车K7565、K1302、K7566次旅客乘降组织，助理接发89009次、客车K7565、K1302、K7566次，监听车机联控用语。监控K957次客车体、32002次调车作业，检查三方控、双确认、停留车止轮，调车联控用语。","user_name":"黄志鹏","flag":0,"leader_id":null,"risk_point_name":null,"risk_type_name":null,"month":null,"create_time":"2017-06-02 17:29:15","sjzx_create_username":null,"sjzx_create_time":"2017-06-12 11:02:47","zrsta_id":2272,"unit_code":"0001000900130002"},{"sjzx_update_time":null,"user_dept_name":null,"user_dept_id":null,"is_bbm":0,"risk_point_id":null,"place_type_id":10519,"zrsta_name":"乌兰浩特站","sjzx_update_username":null,"id":1679410,"dept_id":2281,"time":"2017-06-10 13:30:48","rownum_":6,"opinion":null,"user_id":234846,"place":"现场","leader_dept_code":null,"is_ks":0,"place_id":11459,"user_position":null,"place_type":"其他","pre_assessment_id":756997,"status":5,"sjzx_update_useruuid":null,"dept_name":"乌兰浩特站","sjzx_create_useruuid":null,"risk_type_id":null,"leader_dept_id":null,"content":"6月10日13:30分，检查乌兰浩特站安全基础工作、行车设备管理、防火设备设施、分路不良管理、电气化人身安全措施掌握情况、站区站序、检测车、动检车办理方式、汛期、施工资料、新图掌握情况、劳动纪律。监控0045号机车调车作业，检查三方控、双确认、两先两后、专用线止轮、调车联控用语。检查客运工作，客车K2014、1820次旅客三品安检、乘降组织，监听车机联控。","user_name":"黄志鹏","flag":0,"leader_id":null,"risk_point_name":null,"risk_type_name":null,"month":null,"create_time":"2017-06-12 13:55:14","sjzx_create_username":null,"sjzx_create_time":"2017-06-12 13:55:14","zrsta_id":2281,"unit_code":"0001000900130002"},{"sjzx_update_time":null,"user_dept_name":null,"user_dept_id":null,"is_bbm":0,"risk_point_id":null,"place_type_id":10659,"zrsta_name":"阿尔山站","sjzx_update_username":null,"id":1679543,"dept_id":2162,"time":"2017-06-10 20:00:42","rownum_":7,"opinion":null,"user_id":234846,"place":"现场","leader_dept_code":null,"is_ks":0,"place_id":10701,"user_position":null,"place_type":"其他","pre_assessment_id":756997,"status":5,"sjzx_update_useruuid":null,"dept_name":"阿尔山站","sjzx_create_useruuid":null,"risk_type_id":null,"leader_dept_id":null,"content":"6月10日20:00分，检查阿尔山站安全基础工作、行车设备管理、防火设备设施、站区秩序、询问汛期车站防洪地段、劳动纪律。检查客车K7566次旅客三品安检、乘降组织、路外防护，监听车机联控。","user_name":"黄志鹏","flag":0,"leader_id":null,"risk_point_name":null,"risk_type_name":null,"month":null,"create_time":"2017-06-12 14:02:27","sjzx_create_username":null,"sjzx_create_time":"2017-06-12 14:02:27","zrsta_id":2162,"unit_code":"0001000900130002"}]
         * totalRow : 7
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
             * user_dept_name : null
             * user_dept_id : null
             * is_bbm : 0
             * risk_point_id : null
             * place_type_id : 8210
             * zrsta_name : 白城北站
             * sjzx_update_username : null
             * id : 1559632
             * dept_id : 2275
             * time : 2017-05-28 00:10:33
             * rownum_ : 1
             * opinion : null
             * user_id : 234846
             * place : 现场
             * leader_dept_code : null
             * is_ks : 0
             * place_id : 11391
             * user_position : null
             * place_type : 其他
             * pre_assessment_id : 756997
             * status : 5
             * sjzx_update_useruuid : null
             * dept_name : 白城北站
             * sjzx_create_useruuid : null
             * risk_type_id : null
             * leader_dept_id : null
             * content : 5月28日0:10-1:10分，检查白城北站安全基础工作、劳动纪律、防火设备、行车主管设备、交接班、助理发7道44236次车机联控，监控51521次调车作业，检查防溜情况、三方控、双确认、两先两后。
             * user_name : 黄志鹏
             * flag : 0
             * leader_id : null
             * risk_point_name : null
             * risk_type_name : null
             * month : null
             * create_time : 2017-06-02 17:18:08
             * sjzx_create_username : null
             * sjzx_create_time : 2017-06-12 11:02:47
             * zrsta_id : 2275
             * unit_code : 0001000900130002
             */

            private Object sjzx_update_time;
            private Object user_dept_name;
            private Object user_dept_id;
            private int is_bbm;
            private Object risk_point_id;
            private int place_type_id;
            private String zrsta_name;
            private Object sjzx_update_username;
            private int id;
            private int dept_id;
            private String time;
            private int rownum_;
            private Object opinion;
            private int user_id;
            private String place;
            private Object leader_dept_code;
            private int is_ks;
            private int place_id;
            private Object user_position;
            private String place_type;
            private int pre_assessment_id;
            private int status;
            private Object sjzx_update_useruuid;
            private String dept_name;
            private Object sjzx_create_useruuid;
            private Object risk_type_id;
            private Object leader_dept_id;
            private String content;
            private String user_name;
            private int flag;
            private Object leader_id;
            private Object risk_point_name;
            private Object risk_type_name;
            private Object month;
            private String create_time;
            private Object sjzx_create_username;
            private String sjzx_create_time;
            private int zrsta_id;
            private String unit_code;

            public Object getSjzx_update_time() {
                return sjzx_update_time;
            }

            public void setSjzx_update_time(Object sjzx_update_time) {
                this.sjzx_update_time = sjzx_update_time;
            }

            public Object getUser_dept_name() {
                return user_dept_name;
            }

            public void setUser_dept_name(Object user_dept_name) {
                this.user_dept_name = user_dept_name;
            }

            public Object getUser_dept_id() {
                return user_dept_id;
            }

            public void setUser_dept_id(Object user_dept_id) {
                this.user_dept_id = user_dept_id;
            }

            public int getIs_bbm() {
                return is_bbm;
            }

            public void setIs_bbm(int is_bbm) {
                this.is_bbm = is_bbm;
            }

            public Object getRisk_point_id() {
                return risk_point_id;
            }

            public void setRisk_point_id(Object risk_point_id) {
                this.risk_point_id = risk_point_id;
            }

            public int getPlace_type_id() {
                return place_type_id;
            }

            public void setPlace_type_id(int place_type_id) {
                this.place_type_id = place_type_id;
            }

            public String getZrsta_name() {
                return zrsta_name;
            }

            public void setZrsta_name(String zrsta_name) {
                this.zrsta_name = zrsta_name;
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

            public Object getOpinion() {
                return opinion;
            }

            public void setOpinion(Object opinion) {
                this.opinion = opinion;
            }

            public int getUser_id() {
                return user_id;
            }

            public void setUser_id(int user_id) {
                this.user_id = user_id;
            }

            public String getPlace() {
                return place;
            }

            public void setPlace(String place) {
                this.place = place;
            }

            public Object getLeader_dept_code() {
                return leader_dept_code;
            }

            public void setLeader_dept_code(Object leader_dept_code) {
                this.leader_dept_code = leader_dept_code;
            }

            public int getIs_ks() {
                return is_ks;
            }

            public void setIs_ks(int is_ks) {
                this.is_ks = is_ks;
            }

            public int getPlace_id() {
                return place_id;
            }

            public void setPlace_id(int place_id) {
                this.place_id = place_id;
            }

            public Object getUser_position() {
                return user_position;
            }

            public void setUser_position(Object user_position) {
                this.user_position = user_position;
            }

            public String getPlace_type() {
                return place_type;
            }

            public void setPlace_type(String place_type) {
                this.place_type = place_type;
            }

            public int getPre_assessment_id() {
                return pre_assessment_id;
            }

            public void setPre_assessment_id(int pre_assessment_id) {
                this.pre_assessment_id = pre_assessment_id;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public Object getSjzx_update_useruuid() {
                return sjzx_update_useruuid;
            }

            public void setSjzx_update_useruuid(Object sjzx_update_useruuid) {
                this.sjzx_update_useruuid = sjzx_update_useruuid;
            }

            public String getDept_name() {
                return dept_name;
            }

            public void setDept_name(String dept_name) {
                this.dept_name = dept_name;
            }

            public Object getSjzx_create_useruuid() {
                return sjzx_create_useruuid;
            }

            public void setSjzx_create_useruuid(Object sjzx_create_useruuid) {
                this.sjzx_create_useruuid = sjzx_create_useruuid;
            }

            public Object getRisk_type_id() {
                return risk_type_id;
            }

            public void setRisk_type_id(Object risk_type_id) {
                this.risk_type_id = risk_type_id;
            }

            public Object getLeader_dept_id() {
                return leader_dept_id;
            }

            public void setLeader_dept_id(Object leader_dept_id) {
                this.leader_dept_id = leader_dept_id;
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

            public int getFlag() {
                return flag;
            }

            public void setFlag(int flag) {
                this.flag = flag;
            }

            public Object getLeader_id() {
                return leader_id;
            }

            public void setLeader_id(Object leader_id) {
                this.leader_id = leader_id;
            }

            public Object getRisk_point_name() {
                return risk_point_name;
            }

            public void setRisk_point_name(Object risk_point_name) {
                this.risk_point_name = risk_point_name;
            }

            public Object getRisk_type_name() {
                return risk_type_name;
            }

            public void setRisk_type_name(Object risk_type_name) {
                this.risk_type_name = risk_type_name;
            }

            public Object getMonth() {
                return month;
            }

            public void setMonth(Object month) {
                this.month = month;
            }

            public String getCreate_time() {
                return create_time;
            }

            public void setCreate_time(String create_time) {
                this.create_time = create_time;
            }

            public Object getSjzx_create_username() {
                return sjzx_create_username;
            }

            public void setSjzx_create_username(Object sjzx_create_username) {
                this.sjzx_create_username = sjzx_create_username;
            }

            public String getSjzx_create_time() {
                return sjzx_create_time;
            }

            public void setSjzx_create_time(String sjzx_create_time) {
                this.sjzx_create_time = sjzx_create_time;
            }

            public int getZrsta_id() {
                return zrsta_id;
            }

            public void setZrsta_id(int zrsta_id) {
                this.zrsta_id = zrsta_id;
            }

            public String getUnit_code() {
                return unit_code;
            }

            public void setUnit_code(String unit_code) {
                this.unit_code = unit_code;
            }
        }
    }

    public static class UserBean {
        /**
         * birth : 19730914
         * dept_name4 : 安全科
         * dept_name3 : 白城车务段
         * dept_name1 : 沈阳铁路局
         * sso_uuid : 97BF7D9D10694AA28BD5C14E5FD10535
         * leader_type : 1
         * quan_post_name : null
         * bzb : 0
         * dept_full_name : 沈阳铁路局-运输处-白城车务段-安全科
         * laid_off_time : null
         * dept_name7 : null
         * dept_name5 : null
         * dept_name6 : null
         * ctc : 0
         * dept_code7 : null
         * dept_code6 : null
         * user_type_name : 在岗工作
         * dept_code5 : null
         * seniority1 : null
         * dept_code4 : 0001000900130002
         * dept_code3 : 000100090013
         * pm : 0
         * isshangbao : 0
         * position : 2985
         * dt : 0
         * fhy : 0
         * sys : 0
         * lw : 0
         * zdz : 0
         * is_leadership : null
         * start_work_date : 19930914
         * dept_id : 2150
         * dg : 0
         * token : null
         * ccsj : 0
         * position_duty : null
         * dept_cwd_or_stn_name : 白城车务段
         * dept_station_code : null
         * post : 1
         * dept_station_name : null
         * technical_level : null
         * dept_name : 安全科
         * labor : null
         * dept_cwd_or_stn_code : 000100090013
         * feeling : null
         * login_name : 222302197309140911
         * user_type_id : 1
         * lzh : 234846
         * cb : 0
         * card_number : null
         * tel : null
         * tf : 0
         * quan_post_id : null
         * type : 0
         * remark1 : null
         * password : C4CA4238A0B923820DCC509A6F75849B
         * remark3 : null
         * remark2 : null
         * is_leader : 0
         * gender : 1
         * inbox_do_sort : 0
         * dept_cwd_name : 白城车务段
         * seniority : 45
         * post_name : 空
         * dc : 0
         * technical_level_name : null
         * jsj : 0
         * dept_code : 0001000900130002
         * leader_type_name : 专业技术
         * key_person_mark : 0
         * deleted : 0
         * 6502 : 0
         * position_name : 技术员
         * email : null
         * dept_cwd_code : 000100090013
         * create_time : 2017-02-06 09:06:45
         * work_experience : 1996.07—1998.09      太平川工务段线路工
         1998.09—2004.03      洮南站连结员
         2004.03—2005.04      洮南站客运员
         2005.04—2010.03      安广站助理值班员
         2010.03—2014.08      安广站车站值班员
         2014.08—2015.12      建设站代站长
         2015.12—             安全路风监察科代技术员

         * ch : 0
         * zg : 0
         * pym : hzp
         * zb : 0
         * cert_id : null
         * cancel_status : 0
         * hj : 0
         * dept_type : 11
         * id_card : 222302197309140911
         * last_login_ip : null
         * education : 大专
         * ljy : 0
         * id : 234846
         * name : 黄志鹏
         * sso_app_name : null
         * outbox_do_sort : RECEIVES2
         * ethnic : null
         * political : null
         * working_time : null
         * last_login_time : 2017-06-12 15:36:54
         * yb : 0
         * duty_name : null
         * photo : null
         * dcz : 0
         * login_count : 252
         */

        private String birth;
        private String dept_name4;
        private String dept_name3;
        private String dept_name1;
        private String sso_uuid;
        private int leader_type;
        private Object quan_post_name;
        private int bzb;
        private String dept_full_name;
        private Object laid_off_time;
        private Object dept_name7;
        private Object dept_name5;
        private Object dept_name6;
        private int ctc;
        private Object dept_code7;
        private Object dept_code6;
        private String user_type_name;
        private Object dept_code5;
        private Object seniority1;
        private String dept_code4;
        private String dept_code3;
        private int pm;
        private String isshangbao;
        private int position;
        private int dt;
        private int fhy;
        private int sys;
        private int lw;
        private int zdz;
        private Object is_leadership;
        private String start_work_date;
        private int dept_id;
        private int dg;
        private Object token;
        private int ccsj;
        private Object position_duty;
        private String dept_cwd_or_stn_name;
        private Object dept_station_code;
        private int post;
        private Object dept_station_name;
        private Object technical_level;
        private String dept_name;
        private Object labor;
        private String dept_cwd_or_stn_code;
        private Object feeling;
        private String login_name;
        private int user_type_id;
        private String lzh;
        private int cb;
        private Object card_number;
        private Object tel;
        private int tf;
        private Object quan_post_id;
        private int type;
        private Object remark1;
        private String password;
        private Object remark3;
        private Object remark2;
        private int is_leader;
        private int gender;
        private String inbox_do_sort;
        private String dept_cwd_name;
        private int seniority;
        private String post_name;
        private int dc;
        private Object technical_level_name;
        private int jsj;
        private String dept_code;
        private String leader_type_name;
        private int key_person_mark;
        private int deleted;
        private String position_name;
        private Object email;
        private String dept_cwd_code;
        private String create_time;
        private String work_experience;
        private int ch;
        private int zg;
        private String pym;
        private int zb;
        private Object cert_id;
        private int cancel_status;
        private int hj;
        private int dept_type;
        private String id_card;
        private Object last_login_ip;
        private String education;
        private int ljy;
        private int id;
        private String name;
        private Object sso_app_name;
        private String outbox_do_sort;
        private Object ethnic;
        private Object political;
        private Object working_time;
        private String last_login_time;
        private int yb;
        private Object duty_name;
        private Object photo;
        private int dcz;
        private int login_count;

        public String getBirth() {
            return birth;
        }

        public void setBirth(String birth) {
            this.birth = birth;
        }

        public String getDept_name4() {
            return dept_name4;
        }

        public void setDept_name4(String dept_name4) {
            this.dept_name4 = dept_name4;
        }

        public String getDept_name3() {
            return dept_name3;
        }

        public void setDept_name3(String dept_name3) {
            this.dept_name3 = dept_name3;
        }

        public String getDept_name1() {
            return dept_name1;
        }

        public void setDept_name1(String dept_name1) {
            this.dept_name1 = dept_name1;
        }

        public String getSso_uuid() {
            return sso_uuid;
        }

        public void setSso_uuid(String sso_uuid) {
            this.sso_uuid = sso_uuid;
        }

        public int getLeader_type() {
            return leader_type;
        }

        public void setLeader_type(int leader_type) {
            this.leader_type = leader_type;
        }

        public Object getQuan_post_name() {
            return quan_post_name;
        }

        public void setQuan_post_name(Object quan_post_name) {
            this.quan_post_name = quan_post_name;
        }

        public int getBzb() {
            return bzb;
        }

        public void setBzb(int bzb) {
            this.bzb = bzb;
        }

        public String getDept_full_name() {
            return dept_full_name;
        }

        public void setDept_full_name(String dept_full_name) {
            this.dept_full_name = dept_full_name;
        }

        public Object getLaid_off_time() {
            return laid_off_time;
        }

        public void setLaid_off_time(Object laid_off_time) {
            this.laid_off_time = laid_off_time;
        }

        public Object getDept_name7() {
            return dept_name7;
        }

        public void setDept_name7(Object dept_name7) {
            this.dept_name7 = dept_name7;
        }

        public Object getDept_name5() {
            return dept_name5;
        }

        public void setDept_name5(Object dept_name5) {
            this.dept_name5 = dept_name5;
        }

        public Object getDept_name6() {
            return dept_name6;
        }

        public void setDept_name6(Object dept_name6) {
            this.dept_name6 = dept_name6;
        }

        public int getCtc() {
            return ctc;
        }

        public void setCtc(int ctc) {
            this.ctc = ctc;
        }

        public Object getDept_code7() {
            return dept_code7;
        }

        public void setDept_code7(Object dept_code7) {
            this.dept_code7 = dept_code7;
        }

        public Object getDept_code6() {
            return dept_code6;
        }

        public void setDept_code6(Object dept_code6) {
            this.dept_code6 = dept_code6;
        }

        public String getUser_type_name() {
            return user_type_name;
        }

        public void setUser_type_name(String user_type_name) {
            this.user_type_name = user_type_name;
        }

        public Object getDept_code5() {
            return dept_code5;
        }

        public void setDept_code5(Object dept_code5) {
            this.dept_code5 = dept_code5;
        }

        public Object getSeniority1() {
            return seniority1;
        }

        public void setSeniority1(Object seniority1) {
            this.seniority1 = seniority1;
        }

        public String getDept_code4() {
            return dept_code4;
        }

        public void setDept_code4(String dept_code4) {
            this.dept_code4 = dept_code4;
        }

        public String getDept_code3() {
            return dept_code3;
        }

        public void setDept_code3(String dept_code3) {
            this.dept_code3 = dept_code3;
        }

        public int getPm() {
            return pm;
        }

        public void setPm(int pm) {
            this.pm = pm;
        }

        public String getIsshangbao() {
            return isshangbao;
        }

        public void setIsshangbao(String isshangbao) {
            this.isshangbao = isshangbao;
        }

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }

        public int getDt() {
            return dt;
        }

        public void setDt(int dt) {
            this.dt = dt;
        }

        public int getFhy() {
            return fhy;
        }

        public void setFhy(int fhy) {
            this.fhy = fhy;
        }

        public int getSys() {
            return sys;
        }

        public void setSys(int sys) {
            this.sys = sys;
        }

        public int getLw() {
            return lw;
        }

        public void setLw(int lw) {
            this.lw = lw;
        }

        public int getZdz() {
            return zdz;
        }

        public void setZdz(int zdz) {
            this.zdz = zdz;
        }

        public Object getIs_leadership() {
            return is_leadership;
        }

        public void setIs_leadership(Object is_leadership) {
            this.is_leadership = is_leadership;
        }

        public String getStart_work_date() {
            return start_work_date;
        }

        public void setStart_work_date(String start_work_date) {
            this.start_work_date = start_work_date;
        }

        public int getDept_id() {
            return dept_id;
        }

        public void setDept_id(int dept_id) {
            this.dept_id = dept_id;
        }

        public int getDg() {
            return dg;
        }

        public void setDg(int dg) {
            this.dg = dg;
        }

        public Object getToken() {
            return token;
        }

        public void setToken(Object token) {
            this.token = token;
        }

        public int getCcsj() {
            return ccsj;
        }

        public void setCcsj(int ccsj) {
            this.ccsj = ccsj;
        }

        public Object getPosition_duty() {
            return position_duty;
        }

        public void setPosition_duty(Object position_duty) {
            this.position_duty = position_duty;
        }

        public String getDept_cwd_or_stn_name() {
            return dept_cwd_or_stn_name;
        }

        public void setDept_cwd_or_stn_name(String dept_cwd_or_stn_name) {
            this.dept_cwd_or_stn_name = dept_cwd_or_stn_name;
        }

        public Object getDept_station_code() {
            return dept_station_code;
        }

        public void setDept_station_code(Object dept_station_code) {
            this.dept_station_code = dept_station_code;
        }

        public int getPost() {
            return post;
        }

        public void setPost(int post) {
            this.post = post;
        }

        public Object getDept_station_name() {
            return dept_station_name;
        }

        public void setDept_station_name(Object dept_station_name) {
            this.dept_station_name = dept_station_name;
        }

        public Object getTechnical_level() {
            return technical_level;
        }

        public void setTechnical_level(Object technical_level) {
            this.technical_level = technical_level;
        }

        public String getDept_name() {
            return dept_name;
        }

        public void setDept_name(String dept_name) {
            this.dept_name = dept_name;
        }

        public Object getLabor() {
            return labor;
        }

        public void setLabor(Object labor) {
            this.labor = labor;
        }

        public String getDept_cwd_or_stn_code() {
            return dept_cwd_or_stn_code;
        }

        public void setDept_cwd_or_stn_code(String dept_cwd_or_stn_code) {
            this.dept_cwd_or_stn_code = dept_cwd_or_stn_code;
        }

        public Object getFeeling() {
            return feeling;
        }

        public void setFeeling(Object feeling) {
            this.feeling = feeling;
        }

        public String getLogin_name() {
            return login_name;
        }

        public void setLogin_name(String login_name) {
            this.login_name = login_name;
        }

        public int getUser_type_id() {
            return user_type_id;
        }

        public void setUser_type_id(int user_type_id) {
            this.user_type_id = user_type_id;
        }

        public String getLzh() {
            return lzh;
        }

        public void setLzh(String lzh) {
            this.lzh = lzh;
        }

        public int getCb() {
            return cb;
        }

        public void setCb(int cb) {
            this.cb = cb;
        }

        public Object getCard_number() {
            return card_number;
        }

        public void setCard_number(Object card_number) {
            this.card_number = card_number;
        }

        public Object getTel() {
            return tel;
        }

        public void setTel(Object tel) {
            this.tel = tel;
        }

        public int getTf() {
            return tf;
        }

        public void setTf(int tf) {
            this.tf = tf;
        }

        public Object getQuan_post_id() {
            return quan_post_id;
        }

        public void setQuan_post_id(Object quan_post_id) {
            this.quan_post_id = quan_post_id;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public Object getRemark1() {
            return remark1;
        }

        public void setRemark1(Object remark1) {
            this.remark1 = remark1;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public Object getRemark3() {
            return remark3;
        }

        public void setRemark3(Object remark3) {
            this.remark3 = remark3;
        }

        public Object getRemark2() {
            return remark2;
        }

        public void setRemark2(Object remark2) {
            this.remark2 = remark2;
        }

        public int getIs_leader() {
            return is_leader;
        }

        public void setIs_leader(int is_leader) {
            this.is_leader = is_leader;
        }

        public int getGender() {
            return gender;
        }

        public void setGender(int gender) {
            this.gender = gender;
        }

        public String getInbox_do_sort() {
            return inbox_do_sort;
        }

        public void setInbox_do_sort(String inbox_do_sort) {
            this.inbox_do_sort = inbox_do_sort;
        }

        public String getDept_cwd_name() {
            return dept_cwd_name;
        }

        public void setDept_cwd_name(String dept_cwd_name) {
            this.dept_cwd_name = dept_cwd_name;
        }

        public int getSeniority() {
            return seniority;
        }

        public void setSeniority(int seniority) {
            this.seniority = seniority;
        }

        public String getPost_name() {
            return post_name;
        }

        public void setPost_name(String post_name) {
            this.post_name = post_name;
        }

        public int getDc() {
            return dc;
        }

        public void setDc(int dc) {
            this.dc = dc;
        }

        public Object getTechnical_level_name() {
            return technical_level_name;
        }

        public void setTechnical_level_name(Object technical_level_name) {
            this.technical_level_name = technical_level_name;
        }

        public int getJsj() {
            return jsj;
        }

        public void setJsj(int jsj) {
            this.jsj = jsj;
        }

        public String getDept_code() {
            return dept_code;
        }

        public void setDept_code(String dept_code) {
            this.dept_code = dept_code;
        }

        public String getLeader_type_name() {
            return leader_type_name;
        }

        public void setLeader_type_name(String leader_type_name) {
            this.leader_type_name = leader_type_name;
        }

        public int getKey_person_mark() {
            return key_person_mark;
        }

        public void setKey_person_mark(int key_person_mark) {
            this.key_person_mark = key_person_mark;
        }

        public int getDeleted() {
            return deleted;
        }

        public void setDeleted(int deleted) {
            this.deleted = deleted;
        }

        public String getPosition_name() {
            return position_name;
        }

        public void setPosition_name(String position_name) {
            this.position_name = position_name;
        }

        public Object getEmail() {
            return email;
        }

        public void setEmail(Object email) {
            this.email = email;
        }

        public String getDept_cwd_code() {
            return dept_cwd_code;
        }

        public void setDept_cwd_code(String dept_cwd_code) {
            this.dept_cwd_code = dept_cwd_code;
        }

        public String getCreate_time() {
            return create_time;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }

        public String getWork_experience() {
            return work_experience;
        }

        public void setWork_experience(String work_experience) {
            this.work_experience = work_experience;
        }

        public int getCh() {
            return ch;
        }

        public void setCh(int ch) {
            this.ch = ch;
        }

        public int getZg() {
            return zg;
        }

        public void setZg(int zg) {
            this.zg = zg;
        }

        public String getPym() {
            return pym;
        }

        public void setPym(String pym) {
            this.pym = pym;
        }

        public int getZb() {
            return zb;
        }

        public void setZb(int zb) {
            this.zb = zb;
        }

        public Object getCert_id() {
            return cert_id;
        }

        public void setCert_id(Object cert_id) {
            this.cert_id = cert_id;
        }

        public int getCancel_status() {
            return cancel_status;
        }

        public void setCancel_status(int cancel_status) {
            this.cancel_status = cancel_status;
        }

        public int getHj() {
            return hj;
        }

        public void setHj(int hj) {
            this.hj = hj;
        }

        public int getDept_type() {
            return dept_type;
        }

        public void setDept_type(int dept_type) {
            this.dept_type = dept_type;
        }

        public String getId_card() {
            return id_card;
        }

        public void setId_card(String id_card) {
            this.id_card = id_card;
        }

        public Object getLast_login_ip() {
            return last_login_ip;
        }

        public void setLast_login_ip(Object last_login_ip) {
            this.last_login_ip = last_login_ip;
        }

        public String getEducation() {
            return education;
        }

        public void setEducation(String education) {
            this.education = education;
        }

        public int getLjy() {
            return ljy;
        }

        public void setLjy(int ljy) {
            this.ljy = ljy;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Object getSso_app_name() {
            return sso_app_name;
        }

        public void setSso_app_name(Object sso_app_name) {
            this.sso_app_name = sso_app_name;
        }

        public String getOutbox_do_sort() {
            return outbox_do_sort;
        }

        public void setOutbox_do_sort(String outbox_do_sort) {
            this.outbox_do_sort = outbox_do_sort;
        }

        public Object getEthnic() {
            return ethnic;
        }

        public void setEthnic(Object ethnic) {
            this.ethnic = ethnic;
        }

        public Object getPolitical() {
            return political;
        }

        public void setPolitical(Object political) {
            this.political = political;
        }

        public Object getWorking_time() {
            return working_time;
        }

        public void setWorking_time(Object working_time) {
            this.working_time = working_time;
        }

        public String getLast_login_time() {
            return last_login_time;
        }

        public void setLast_login_time(String last_login_time) {
            this.last_login_time = last_login_time;
        }

        public int getYb() {
            return yb;
        }

        public void setYb(int yb) {
            this.yb = yb;
        }

        public Object getDuty_name() {
            return duty_name;
        }

        public void setDuty_name(Object duty_name) {
            this.duty_name = duty_name;
        }

        public Object getPhoto() {
            return photo;
        }

        public void setPhoto(Object photo) {
            this.photo = photo;
        }

        public int getDcz() {
            return dcz;
        }

        public void setDcz(int dcz) {
            this.dcz = dcz;
        }

        public int getLogin_count() {
            return login_count;
        }

        public void setLogin_count(int login_count) {
            this.login_count = login_count;
        }
    }
}
