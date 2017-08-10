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

public class CswSetPresenter extends BaseHttpAsyncModel<BaseResponesBean> {

//    private List<String> params = new ArrayList<>();
    private String id = "";

    public CswSetPresenter(int model_id, Context context, ModelCompleteCallback<BaseResponesBean> callback, List<String> params) {
        super(context, callback);
        this.TaskId = model_id;
        id = params.get(0);
    }

    @Override
    protected BaseResponesBean doInBackground(String... params) {
        return postDatas();
    }

    private BaseResponesBean postDatas() {
        //http://223.100.3.171:10007/integrationSelfRealistic/setSelfRealistic/219460?token=098CDE226D8638E59D8727C5AA738F21
        String url = BaseApplication.url + "/integrationSelfRealistic/setSelfRealistic/+"+id+"?token=" + BaseApplication.token;
        BaseResponesBean bean = HttpJsonInterface.getInstance().doGet(url);
        if(bean.getJson() != null){
            bean.setDataholder(bean.getJsonString());
        }
        return bean;
    }

}
