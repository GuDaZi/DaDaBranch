package com.xianzhi.integration.base;

import android.app.Application;
import android.os.Environment;


/**
 * Created by 李博 on 2016/9/26.
 */
public class BaseApplication extends Application {

//    public static String url;
//    public static String token;
//    public static String userId;
    public static String url = "http://223.100.3.171:10007";
    public static String token = "098CDE226D8638E59D8727C5AA738F21";
    public static String userId = "189516";
    public static String userName;
    public static String depart;
    public static String post;
    public static String jobName;
    public static String month;

    public static final String appPath = Environment.getExternalStorageDirectory() + "/.xianzhi/";

}
