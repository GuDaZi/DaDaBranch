package com.xianzhi.integration.presenter;

import android.content.Context;
import android.util.Log;

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
 * 干部月度预考核查看界面
 */

public class CpcDetailRefreshPresenter extends BaseHttpAsyncModel<BaseResponesBean> {

    private static final String TAG = "SFragHD";
    private String id;
    private List<NameValuePair> params = new ArrayList<>();

    public CpcDetailRefreshPresenter(int model_id, Context context, ModelCompleteCallback<BaseResponesBean> callback, List<String> params) {
        super(context, callback);
        id = params.get(0);
    }

    @Override
    protected BaseResponesBean doInBackground(String... params) {
        return getDatas();
    }

    private BaseResponesBean getDatas() {
        Log.e(TAG, "getDatas: id: " + id );
        //http://223.100.3.171:10007/integrationPreAssessment/assessmentDetail/219157
        String url = BaseApplication.url + "/integrationPreAssessment/assessmentDetail/" + id + "?token=" + BaseApplication.token;
        BaseResponesBean bean = HttpJsonInterface.getInstance().doPost(url,params);
        if(bean.getJson() != null){
            bean.setDataholder(bean.getJsonString());
        }
        return bean;
    }

}
