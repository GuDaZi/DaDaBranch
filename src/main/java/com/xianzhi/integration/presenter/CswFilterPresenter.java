package com.xianzhi.integration.presenter;

import android.content.Context;

import com.xianzhi.integration.base.BaseApplication;
import com.xianzhi.integration.http.HttpJsonInterface;
import com.xianzhi.integration.model.base.BaseHttpAsyncModel;
import com.xianzhi.integration.model.base.BaseResponesBean;
import com.xianzhi.integration.model.base.ModelCompleteCallback;

import org.apache.http.NameValuePair;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TJTJL on 2017/7/20.
 */

public class CswFilterPresenter extends BaseHttpAsyncModel<BaseResponesBean> {

    private List<NameValuePair> params = new ArrayList<>();

    public CswFilterPresenter(int model_id, Context context, ModelCompleteCallback<BaseResponesBean> callback, List<NameValuePair> params) {
        super(context, callback);
        this.TaskId = model_id;
        this.params = params;
    }

    @Override
    protected BaseResponesBean doInBackground(String... params) {
        return postDatas();
    }

    private BaseResponesBean postDatas() {
//        String url = BaseApplication.url + "/integrationSelfRealistic/setSelfRealisticList?token=" + BaseApplication.token;
        String url = BaseApplication.url + "/integrationSelfRealistic/setSelfRealisticList?token=" + BaseApplication.token;
        BaseResponesBean bean = HttpJsonInterface.getInstance().doPost(url,params);
        if(bean.getJson() != null){
            bean.setDataholder(bean.getJsonString());
        }
        return bean;
    }

}
