package com.xianzhi.integration.tools.util;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by 李博 on 2016/9/26.
 */
public class ShareUtils {

    private SharedPreferences sp = null;
    private SharedPreferences.Editor editor = null;

    public ShareUtils(Context context) {
        sp = context.getSharedPreferences("UserDate", Context.MODE_PRIVATE);
        editor = sp.edit();
    }

    public void setUserName(String userName) {
        editor.putString("userName", userName);
        editor.commit();
    }

    public String getUserName() {
        return sp.getString("userName", "");
    }

    public void setToken(String token) {
        editor.putString("token", token);
        editor.commit();
    }

    public String getToken() {
        return sp.getString("token", "");
    }

    public void setPwd(String pwd) {
        editor.putString("pwd", pwd);
        editor.commit();
    }

    public String getPwd() {
        return sp.getString("pwd", "");
    }

    public void setUserId(String userId) {
        editor.putString("userId", userId);
        editor.commit();
    }

    public String getUserId() {
        return sp.getString("userId", "");
    }

    public String getAvatar() {
        return sp.getString("avatar", "");
    }

    public void setAvatar(String avatar) {
        editor.putString("avatar", avatar);
        editor.commit();
    }

    public boolean getStart() {
        return sp.getBoolean("start", true);
    }

    public void setStart(boolean start) {
        editor.putBoolean("start", start);
        editor.commit();
    }

    //首页缓存
    public String getHome() {
        return sp.getString("home", "");
    }

    public void setHome(String home) {
        editor.putString("home", home);
        editor.commit();
    }

    //服务缓存
    public String getService() {
        return sp.getString("service", "");
    }

    public void setService(String service) {
        editor.putString("service", service);
        editor.commit();
    }

    //我的缓存
    public String getPersonal() {
        return sp.getString("personal", "");
    }

    public void setPersonal(String personal) {
        editor.putString("personal", personal);
        editor.commit();
    }

    //存放图片 使用之后置空
    public String getImageUrl() {
        return sp.getString("imageUrl", "");
    }

    public void setImageUrl(String imageUrl) {
        editor.putString("imageUrl", imageUrl);
        editor.commit();
    }

}
