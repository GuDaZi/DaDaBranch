package com.xianzhi.integration.model;

import android.content.Context;

import com.xianzhi.integration.base.BaseApplication;
import com.xianzhi.integration.bean.SelfEvaluateSaveBean;
import com.xianzhi.integration.http.HttpJsonInterface;
import com.xianzhi.integration.model.base.BaseHttpAsyncModel;
import com.xianzhi.integration.model.base.BaseResponesBean;
import com.xianzhi.integration.model.base.ModelCompleteCallback;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.List;

/**
 * @Administrator LiBo.
 * @Date 2017/7/20.
 * @Function
 */

public class SelfEvaluateSaveModel extends BaseHttpAsyncModel<SelfEvaluateSaveBean> {

    public SelfEvaluateSaveModel(int model_io, Context context, ModelCompleteCallback<BaseResponesBean> callback) {
        super(context, callback);
        this.TaskId = model_io;
    }

    @Override
    protected BaseResponesBean doInBackground(String... params) {
        return getDatas();
    }

    private BaseResponesBean getDatas() {
        String url = BaseApplication.url + "/integrationSelfRealistic/update";
        List<NameValuePair> parmas = new ArrayList<>();
        parmas.add(new BasicNameValuePair("model.id", holder.getItemId()));
        parmas.add(new BasicNameValuePair("model.month", holder.getDate()));
        parmas.add(new BasicNameValuePair("model.CONTENT", holder.getContent()));
        parmas.add(new BasicNameValuePair("score_type", holder.getType() + ""));
        parmas.add(new BasicNameValuePair("model.ADD_SCORE", holder.getNum() + ""));
        parmas.add(new BasicNameValuePair("token", BaseApplication.token));
        BaseResponesBean bean = HttpJsonInterface.getInstance().doPost(url, parmas);
        if(bean.getJson() != null) {
            bean.setDataholder(bean.getJson());
        }
        return bean;
    }
}
