package com.xianzhi.integration.base;

import android.app.Application;
import android.os.Environment;


/**
 * Created by 李博 on 2016/9/26.
 */
public class BaseApplication extends Application {

    public static String url = "";

    public static final String appPath = Environment
            .getExternalStorageDirectory() + "/.xianzhi/";

}
