package com.xianzhi.integration.base;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.xianzhi.integration.R;
import com.xianzhi.integration.model.base.Model;
import com.xianzhi.integration.tools.util.DensityUtil;
import com.xianzhi.integration.tools.util.LogUtil;
import com.xianzhi.integration.tools.util.ShareUtils;

import java.util.ArrayList;

import butterknife.ButterKnife;


/**
 * Created by 李博 on 2016/12/4.
 */

public abstract class BaseActivity extends AppCompatActivity implements View.OnClickListener {

    //返回
    protected LinearLayout lin_back;
    //右边按钮
    protected LinearLayout lin_right;
    //头标题
    protected TextView tv_title;
    //右边内容显示
    protected TextView tv_edit;
    protected ImageView iv_soso;

    protected ProgressDialog progressDialog;
    protected Context context;
    private String TAG;
    protected ShareUtils shareUtils;
    protected Model model;

    /**
     * 所有activity集合
     */
    protected ArrayList<Activity> allActivity = new ArrayList<Activity>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TAG = getClass().getName();
        context = this;
        shareUtils = new ShareUtils(context);
        LogUtil.i("BaseActivity", TAG);
        allActivity.add(this);
        onCreateView(savedInstanceState);
        ButterKnife.bind(this);
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
//            WindowManager.LayoutParams localLayoutParams = getWindow().getAttributes();
//            localLayoutParams.flags = (WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS | localLayoutParams.flags);
//        }
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        if (toolbar != null) {
//            setSupportActionBar(toolbar);
//        }
        setImmersionType();
        initSetprogressbar();
        initTitle();
        initView();
        setListener();
    }


    private void setImmersionType() {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.KITKAT) {
            return;
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        }
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        int statusBarHeight = DensityUtil.getStatusBarHeight(this);
        toolbar.setPadding(0, statusBarHeight, 0, 0);
        ViewGroup.LayoutParams params = toolbar.getLayoutParams();
        params.height = statusBarHeight + DensityUtil.dip2px(this, 45);
        toolbar.setLayoutParams(params);
        setSupportActionBar(toolbar);
    }

    abstract protected void onCreateView(Bundle saveInstanceState);

    abstract protected void initView();

    abstract protected void setListener();

//    @Override
//    protected void onDestroy() {
//        Destroy();
//        super.onDestroy();
//        if (allActivity != null) {
//            allActivity.remove(this);
//        }
//    }

//    abstract protected void Destroy();

    void initSetprogressbar() {
        progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("");
        progressDialog.setMessage(getString(R.string.loadDatas));
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progressDialog.setCancelable(false);
    }

    void initTitle() {
        lin_back = (LinearLayout) findViewById(R.id.lin_back);
        lin_back.setOnClickListener(this);
        lin_right = (LinearLayout) findViewById(R.id.lin_right);
        lin_right.setOnClickListener(this);
        tv_title = (TextView) findViewById(R.id.tv_title);
        tv_edit = (TextView) findViewById(R.id.tv_edit);
        iv_soso = (ImageView) findViewById(R.id.iv_soso);
    }

    private ProgressDialog mProgressDialog;

    public static final int DIALOG_DOWNLOAD_PROGRESS = 1;

    protected Dialog onCreateDialog(int id) {
        switch (id) {

            case DIALOG_DOWNLOAD_PROGRESS:
                mProgressDialog = new ProgressDialog(this);
                mProgressDialog.setMessage("正在下载，请稍候...");
                mProgressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                mProgressDialog.setCancelable(false);
                mProgressDialog.show();
                return mProgressDialog;
            default:
                return null;
        }
    }

    /**
     * 一键退出
     */
    public void clearAllActivity() {
        if (allActivity != null) {
            for (int i = 0; i < allActivity.size(); i++) {
                allActivity.get(i).finish();
            }
        }
    }

    /**
     * 单一的activity的跳转
     *
     * @param mClass 跳转的类
     */
    public void start_activity(Class<?> mClass) {
        startActivity(new Intent(context, mClass));
    }

    /**
     * 带传递参数的跳转
     *
     * @param mClass 跳转类
     * @param key    跳转key值
     * @param value  跳转value值
     */
    public void start_activity(Class<?> mClass, String key, String value) {
        startActivity(new Intent(context, mClass).putExtra(key, value));
    }

    /**
     * 带传递参数的跳转
     *`
     * @param mClass 跳转类
     * @param key    跳转key值
     * @param value  跳转value值
     */
    public void start_activity(Class<?> mClass, String key, long value) {
        startActivity(new Intent(context, mClass).putExtra(key, value));
    }

    /**
     * 带传递参数的跳转
     *
     * @param mClass 跳转类
     * @param key    跳转key值
     * @param value  跳转value值
     */
    public void start_activity(Class<?> mClass, String key, Bundle value) {
        startActivity(new Intent(context, mClass).putExtra(key, value));
    }

    /***
     * 点击空白处 隐藏软键盘
     * @param ev
     * @return
     */
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        if (ev.getAction() == MotionEvent.ACTION_DOWN) {
            View v = getCurrentFocus();
            if (isShouldHideKeyboard(v, ev)) {
                hideKeyboard(v.getWindowToken());
            }
        }
        return super.dispatchTouchEvent(ev);
    }

    /**
     * 根据EditText所在坐标和用户点击的坐标相对比，来判断是否隐藏键盘，因为当用户点击EditText时则不能隐藏
     *
     * @param v
     * @param event
     * @return
     */
    private boolean isShouldHideKeyboard(View v, MotionEvent event) {
        if (v != null && (v instanceof EditText)) {
            int[] l = {0, 0};
            v.getLocationInWindow(l);
            int left = l[0],
                    top = l[1],
                    bottom = top + v.getHeight(),
                    right = left + v.getWidth();
            if (event.getX() > left && event.getX() < right
                    && event.getY() > top && event.getY() < bottom) {
                // 点击EditText的事件，忽略它。
                return false;
            } else {
                return true;
            }
        }
        // 如果焦点不是EditText则忽略，这个发生在视图刚绘制完，第一个焦点不在EditText上，和用户用轨迹球选择其他的焦点
        return false;
    }

    /**
     * 获取InputMethodManager，隐藏软键盘
     *
     * @param token
     */
    private void hideKeyboard(IBinder token) {
        if (token != null) {
            InputMethodManager im = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            im.hideSoftInputFromWindow(token, InputMethodManager.HIDE_NOT_ALWAYS);
        }
    }


}
