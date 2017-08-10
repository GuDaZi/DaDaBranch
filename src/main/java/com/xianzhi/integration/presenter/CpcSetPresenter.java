package com.xianzhi.integration.presenter;

import android.content.Context;
import android.util.Log;

import com.xianzhi.integration.base.BaseApplication;
import com.xianzhi.integration.http.HttpJsonInterface;
import com.xianzhi.integration.model.base.BaseHttpAsyncModel;
import com.xianzhi.integration.model.base.BaseResponesBean;
import com.xianzhi.integration.model.base.ModelCompleteCallback;

import java.util.List;

/**
 * Created by TJTJL on 2017/7/20.
 * 干部月度预考核设置界面
 */

public class CpcSetPresenter extends BaseHttpAsyncModel<BaseResponesBean> {
    private static final String TAG = "SFragHD";
    private String id;

    public CpcSetPresenter(int model_id, Context context, ModelCompleteCallback<BaseResponesBean> callback, List<String> params) {
        super(context, callback);
        this.TaskId = model_id;

        id = params.get(0);
    }

    @Override
    protected BaseResponesBean doInBackground(String... params) {
        return getDatas();
    }

    private BaseResponesBean getDatas() {
        //http://223.100.3.171:10007/integrationPreAssessment/setAssessment/219460?token=//
        String url = BaseApplication.url + "/integrationPreAssessment/setAssessment/" + id + "?token=" + BaseApplication.token;
        BaseResponesBean bean = HttpJsonInterface.getInstance().doGet(url);
        if(bean.getJson() != null){
            bean.setDataholder(bean.getJsonString());
        }
        return bean;
    }

}
