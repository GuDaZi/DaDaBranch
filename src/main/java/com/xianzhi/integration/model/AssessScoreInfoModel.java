package com.xianzhi.integration.model;

import android.content.Context;

import com.xianzhi.integration.base.BaseApplication;
import com.xianzhi.integration.bean.AssessScoreInfoBean;
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
 * @Date 2017/8/2.
 * @Function
 */

public class AssessScoreInfoModel extends BaseHttpAsyncModel<AssessScoreInfoBean> {

    public AssessScoreInfoModel(int model_id, Context context, ModelCompleteCallback<BaseResponesBean> callback) {
        super(context, callback);
        this.TaskId = model_id;
    }

    @Override
    protected BaseResponesBean doInBackground(String... params) {
        return getDatas();
    }

    private BaseResponesBean getDatas() {
        String url = BaseApplication.url + "/integrationLeaderApprove/getScoreInfo";
        List<NameValuePair> parmas = new ArrayList<>();
        parmas.add(new BasicNameValuePair("userId", holder.getUserId()));
        parmas.add(new BasicNameValuePair("startTime", holder.getStartTime()));
        parmas.add(new BasicNameValuePair("endTime", holder.getEndTime()));
        parmas.add(new BasicNameValuePair("token", BaseApplication.token));
        BaseResponesBean bean = HttpJsonInterface.getInstance().doPost(url, parmas);
        if(bean.getJson() != null){
            bean.setDataholder(bean.getJson());
        }
        return bean;
    }
}
