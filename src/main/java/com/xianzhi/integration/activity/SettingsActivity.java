package com.xianzhi.integration.activity;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.alibaba.fastjson.JSON;
import com.handmark.pulltorefresh.library.PullToRefreshGridView;
import com.xianzhi.integration.R;
import com.xianzhi.integration.adapter.MonthExamineAdapter;
import com.xianzhi.integration.base.BaseActivity;
import com.xianzhi.integration.tools.util.ToastUtil;

import java.io.IOException;
import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/**
 * Created by 何达 on 2017/7/14.
 * 一体化考核设置主界面
 */

public class SettingsActivity extends BaseActivity {

    @BindView(R.id.btn_testHttp)
    LinearLayout btnTestHttp;
    @BindView(R.id.btn_reuse)
    LinearLayout btnReuse;
    @BindView(R.id.btn_multiTasks)
    LinearLayout btnMultiTasks;
    @BindView(R.id.btn_addTasks)
    LinearLayout btnAddTasks;
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
//    @BindView(R.id.month_inspection)
//    PullToRefreshGridView monthInspection;

    private static final String TAG = "HedaAct";

    @Override
    protected void onCreateView(Bundle saveInstanceState) {
        setContentView(R.layout.act_ganbu_settings);
        ButterKnife.bind(this);

        initData();
        ArrayList testData = new ArrayList();
    }

    /**
     * 初始化数据
     */
    private void initData() {
//        String s = httpTest();
        parseJson();
    }

    /**
     * json解析
     */
    private void parseJson() {
        /**
         * String jsonString = ...;
         Group group = JSON.parseObject(jsonString, Group.class);
         */
    }

    /**
     * Http连接测试类
     */
    private void httpTest() {
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url("http://localhost:8080/FchWorksTest/FchTestJson.json")
                .build();
        Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.e(TAG, "net onFailure: ");
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                Log.e(TAG, "net onSucceed: ");
//                response.body()
//                JSON json = response.body();

//                String a = response.body();
                ResponseBody responseBody = response.body();
                String a = responseBody.toString();

                Log.e(TAG, a);
            }
        });
    }


    @Override
    protected void initView() {
        //设置标题栏
        ActionBar bar = getSupportActionBar();
        bar.setDisplayHomeAsUpEnabled(true);
        bar.setDisplayShowHomeEnabled(true);

//        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle();


//        monthInspection.setAdapter();
//        recyclerView.setLayoutManager(new LinearLayoutManager(context));

//        recyclerView.setAdapter(new MonthExamineAdapter());

        /**
         * private void setToolbar() {
         //让toolbar替换为当前的ActionBar
         setSupportActionBar(toolbar);

         //1.得到toolbar进行一些设置
         ActionBar actionBar = getSupportActionBar();
         actionBar.setTitle(getString(R.string.app_name));

         //2.作用：显示home按钮, 此时只是一个箭头图片
         actionBar.setDisplayShowHomeEnabled(true);//启用home按钮
         actionBar.setDisplayHomeAsUpEnabled(true);//显示home按钮

         //3.让返回箭头变身为汉堡包按钮，就是三条线
         drawerToggle = new ActionBarDrawerToggle(this, drawlayout, toolbar,0,0);
         drawerToggle.syncState();//显示出三条线

         //4.让三条线舞动起来,旋转起来
         drawlayout.addDrawerListener(drawerToggle);
         }
         */

    }

    @Override
    protected void setListener() {
        btnReuse.setOnClickListener(this);
        btnMultiTasks.setOnClickListener(this);
        btnAddTasks.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_reuse:
                start_activity(CadreActivity.class);
                break;
            case R.id.btn_multiTasks:

                break;
            case R.id.btn_addTasks:

                break;
            case R.id.btn_testHttp:

                break;
            default:
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.settings_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.reuse:
                ToastUtil.show(this,"reuse",Toast.LENGTH_SHORT);
                break;
            case R.id.volume:
                ToastUtil.show(this,"volume",Toast.LENGTH_SHORT);
                break;
            case R.id.dynamic:
                ToastUtil.show(this,"dynamic",Toast.LENGTH_SHORT);
                break;
            default:
                break;
        }
        return true;
    }



}
