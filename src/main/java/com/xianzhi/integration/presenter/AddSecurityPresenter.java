package com.xianzhi.integration.presenter;

import android.content.Context;

import com.xianzhi.integration.base.BaseApplication;
import com.xianzhi.integration.http.HttpJsonInterface;
import com.xianzhi.integration.model.base.BaseHttpAsyncModel;
import com.xianzhi.integration.model.base.BaseResponesBean;
import com.xianzhi.integration.model.base.ModelCompleteCallback;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by TJTJL on 2017/7/20.
 */

public class AddSecurityPresenter extends BaseHttpAsyncModel<BaseResponesBean> {

    private List<NameValuePair> list = new ArrayList<>();

    public AddSecurityPresenter(int model_id, Context context, ModelCompleteCallback<BaseResponesBean> callback, List list) {
        super(context, callback);
        this.TaskId = model_id;
        this.list = list;
    }

    @Override
    protected BaseResponesBean doInBackground(String... params) {
        return getDatas();
    }

    private BaseResponesBean getDatas() {
        //http://223.100.3.171:10007/integrationRiskControl/saveYear
        String url = BaseApplication.url + "/integrationRiskControl/saveYear";

        BaseResponesBean bean = HttpJsonInterface.getInstance().doPost(url, new ArrayList<NameValuePair>());
        /**
         * integrationRiskControl.id
         integrationRiskControl.level	0
         integrationRiskControl.pid	0
         integrationRiskControl.status	1
         integrationRiskControl.year	2016
         integrationRiskControl.name	2016安全计划表
         create_type	1
         copy_year	1267
         */
        list.add(new BasicNameValuePair("integrationRiskControl.id","2544"));
        list.add(new BasicNameValuePair("integrationRiskControl.level","2544"));
        list.add(new BasicNameValuePair("integrationRiskControl.pid","2544"));
        list.add(new BasicNameValuePair("integrationRiskControl.status","2544"));
        list.add(new BasicNameValuePair("integrationRiskControl.year","2544"));
        list.add(new BasicNameValuePair("integrationRiskControl.name","2544"));
        list.add(new BasicNameValuePair("create_type","2544"));
        list.add(new BasicNameValuePair("copy_year","2544"));

       if(bean.getJson() != null){
            bean.setDataholder(bean.getJsonString());
        }
        return bean;
    }

}
