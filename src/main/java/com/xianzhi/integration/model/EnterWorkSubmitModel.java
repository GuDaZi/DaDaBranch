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
 * @Date 2017/7/19.
 * @Function
 */

public class EnterWorkSubmitModel extends BaseHttpAsyncModel<EnterWorkSubmitBean> {

    public EnterWorkSubmitModel(int model_id, Context context, ModelCompleteCallback<BaseResponesBean> callback) {
        super(context, callback);
        this.TaskId = model_id;
    }

    @Override
    protected BaseResponesBean doInBackground(String... params) {
        return getDatas();
    }

    private BaseResponesBean getDatas() {
        String url = BaseApplication.url + "/integrationRealistic/save";
        List<NameValuePair> parmas = new ArrayList<>();
        parmas.add(new BasicNameValuePair("model.USER_ID", BaseApplication.userId));
        parmas.add(new BasicNameValuePair("model.pre_assessment_id", holder.getMyAssessId()));
        parmas.add(new BasicNameValuePair("model.USER_NAME", holder.getUserName()));
        parmas.add(new BasicNameValuePair("model.status", holder.getType()));
        parmas.add(new BasicNameValuePair("safeProblem.ZRDEP_FULL_NAME", holder.getDepartName()));
        parmas.add(new BasicNameValuePair("model.dept_id", holder.getDepartId()));
        parmas.add(new BasicNameValuePair("model.dept_name", holder.getDepart()));
        parmas.add(new BasicNameValuePair("model.PLACE_TYPE", holder.getAddressType()));
        parmas.add(new BasicNameValuePair("model.place_type_id", holder.getAddressTypeId()));
        parmas.add(new BasicNameValuePair("model.PLACE", holder.getAddress()));
        parmas.add(new BasicNameValuePair("model.place_id", holder.getAddressId()));
        parmas.add(new BasicNameValuePair("model.RISK_TYPE_NAME", holder.getRiskType()));
        parmas.add(new BasicNameValuePair("model.RISK_TYPE_ID", holder.getRiskTypeId()));
        parmas.add(new BasicNameValuePair("model.RISK_POINT_NAME", holder.getRisk()));
        parmas.add(new BasicNameValuePair("model.RISK_POINT_ID", holder.getRiskId()));
        parmas.add(new BasicNameValuePair("time", holder.getDate()));
        parmas.add(new BasicNameValuePair("model.is_bbm", holder.getIsExamine()));
        parmas.add(new BasicNameValuePair("model.content", holder.getContent()));

        BaseResponesBean bean = HttpJsonInterface.getInstance().doPost(url, parmas);
        if(bean.getJson() != null){
            bean.setDataholder(bean.getJson());
        }
        return bean;
    }
}
