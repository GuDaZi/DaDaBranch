package com.xianzhi.integration.presenter;

import android.content.Context;

import com.xianzhi.integration.base.BaseApplication;
import com.xianzhi.integration.http.HttpJsonInterface;
import com.xianzhi.integration.model.base.BaseHttpAsyncModel;
import com.xianzhi.integration.model.base.BaseResponesBean;
import com.xianzhi.integration.model.base.ModelCompleteCallback;

/**
 * Created by TJTJL on 2017/7/20.
 */

public class SecReusePresenter extends BaseHttpAsyncModel<BaseResponesBean> {

    public SecReusePresenter(int model_id, Context context, ModelCompleteCallback<BaseResponesBean> callback) {
        super(context, callback);
        this.TaskId = model_id;
    }

    @Override
    protected BaseResponesBean doInBackground(String... params) {
        return getDatas();
    }

    private BaseResponesBean getDatas() {
        //http://223.100.3.171:10007/integrationRiskControl/addYear
        String url = BaseApplication.url + "/integrationRiskControl/addYear?token=" + BaseApplication.token;
        BaseResponesBean bean = HttpJsonInterface.getInstance().doGet(url);
        if(bean.getJson() != null){
            bean.setDataholder(bean.getJsonString());
        }
        return bean;
    }

}
