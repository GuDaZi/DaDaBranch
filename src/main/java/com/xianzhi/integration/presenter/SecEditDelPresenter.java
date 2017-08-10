package com.xianzhi.integration.presenter;

import android.content.Context;
import android.util.Log;

import com.xianzhi.integration.base.BaseApplication;
import com.xianzhi.integration.http.HttpJsonInterface;
import com.xianzhi.integration.model.base.BaseHttpAsyncModel;
import com.xianzhi.integration.model.base.BaseResponesBean;
import com.xianzhi.integration.model.base.ModelCompleteCallback;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TJTJL on 2017/7/20.
 */

public class SecEditDelPresenter extends BaseHttpAsyncModel<BaseResponesBean> {

    private static final String TAG = "SFragHD";
    private List<NameValuePair> form = new ArrayList<>();
    private String code;

    public SecEditDelPresenter(int model_id, Context context, ModelCompleteCallback<BaseResponesBean> callback, List<String> params) {
        super(context, callback);
        this.TaskId = model_id;
        code = params.get(0);
//        form.add(new BasicNameValuePair("",""));
        Log.e(TAG, "code: "+code );
    }

    @Override
    protected BaseResponesBean doInBackground(String... params) {
        return postDatas();
    }

    private BaseResponesBean postDatas() {
        //http://223.100.3.171:10007/integrationRiskControl/del/2015001600010002
        //http://223.100.3.171:10007/integrationRiskControl/del/2015001600010002
        String url = BaseApplication.url + "/integrationRiskControl/del/"+code+"?token=" + BaseApplication.token;
        BaseResponesBean bean = HttpJsonInterface.getInstance().doPost(url,form);
        if(bean.getJson() != null){
            bean.setDataholder(bean.getJsonString());
        }
        return bean;
    }

}
