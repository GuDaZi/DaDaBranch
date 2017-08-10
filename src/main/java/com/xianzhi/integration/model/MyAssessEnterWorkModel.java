package com.xianzhi.integration.model;

import android.content.Context;

import com.xianzhi.integration.base.BaseApplication;
import com.xianzhi.integration.bean.EnterWorkSubmitBean;
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
 * @Date 2017/7/24.
 * @Function
 */

public class MyAssessEnterWorkModel extends BaseHttpAsyncModel<EnterWorkSubmitBean> {

    public MyAssessEnterWorkModel(int model_id, Context context, ModelCompleteCallback<BaseResponesBean> callback) {
        super(context, callback);
        this.TaskId = model_id;
    }

    @Override
    protected BaseResponesBean doInBackground(String... params) {
        return getDatas();
    }

    private BaseResponesBean getDatas() {
        String url = BaseApplication.url + "/integrationRealistic/saveMultiple";
        List<NameValuePair> parmas = new ArrayList<>();
        parmas.add(new BasicNameValuePair("userId", BaseApplication.userId));
        parmas.add(new BasicNameValuePair("userName", holder.getUserName()));
        parmas.add(new BasicNameValuePair("realisticArray", holder.getRealisticArray()));
        for (int i = 0; i < holder.getCheck_item(); i++) {
            parmas.add(new BasicNameValuePair("check_item", "on"));
        }
        parmas.add(new BasicNameValuePair("safeProblem.ZRDEP_FULL_NAME", holder.getDepartName()));
        parmas.add(new BasicNameValuePair("safeProblem.ZRDEP_ID", holder.getDepartId()));
        parmas.add(new BasicNameValuePair("safeProblem.ZRDEP_CODE", holder.getDepartCode()));
        parmas.add(new BasicNameValuePair("safeProblem.ZRDEP_NAME", holder.getDepart()));
        parmas.add(new BasicNameValuePair("place_type_id", holder.getAddressTypeId()));
        parmas.add(new BasicNameValuePair("place_id", holder.getAddressId()));
        parmas.add(new BasicNameValuePair("RISK_TYPE_NAME", holder.getRiskType()));
        parmas.add(new BasicNameValuePair("RISK_TYPE_ID", holder.getRiskTypeId()));
        parmas.add(new BasicNameValuePair("RISK_POINT_NAME", holder.getRisk()));
        parmas.add(new BasicNameValuePair("RISK_POINT_ID", holder.getRiskId()));
        parmas.add(new BasicNameValuePair("time", holder.getDate()));
        parmas.add(new BasicNameValuePair("content", holder.getContent()));

        BaseResponesBean bean = HttpJsonInterface.getInstance().doPost(url, parmas);
        if (bean.getJson() != null) {
            bean.setDataholder(bean.getJson());
        }
        return bean;
    }
}