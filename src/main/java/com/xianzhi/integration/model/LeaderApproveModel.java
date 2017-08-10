package com.xianzhi.integration.model;

import android.content.Context;

import com.xianzhi.integration.base.BaseApplication;
import com.xianzhi.integration.bean.LeaderApproveBean;
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
 * @Date 2017/7/26.
 * @Function
 */

public class LeaderApproveModel extends BaseHttpAsyncModel<LeaderApproveBean> {

    public LeaderApproveModel(int model_id, Context context, ModelCompleteCallback<BaseResponesBean> callback) {
        super(context, callback);
        this.TaskId = model_id;
    }

    @Override
    protected BaseResponesBean doInBackground(String... params) {
        return null;
    }

    private BaseResponesBean getDatas() {
        String url = BaseApplication.url + "/integrationLeaderApprove/doApprove";
        List<NameValuePair> parmas = new ArrayList<>();
        parmas.add(new BasicNameValuePair("model.id", holder.getItemId()));
        parmas.add(new BasicNameValuePair("model.final_level_name", holder.getGrate()));
        parmas.add(new BasicNameValuePair("model.final_level", holder.getGrateId() + ""));
        parmas.add(new BasicNameValuePair("model.comment2", holder.getContent()));
        parmas.add(new BasicNameValuePair("token", BaseApplication.token));
        BaseResponesBean bean = HttpJsonInterface.getInstance().doPost(url, parmas);
        if(bean.getJson() != null){
            bean.setDataholder(bean.getJson());
        }
        return bean;
    }

}
