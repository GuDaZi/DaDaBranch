package com.xianzhi.integration.model;

import android.content.Context;
import android.text.TextUtils;

import com.xianzhi.integration.base.BaseApplication;
import com.xianzhi.integration.bean.MyAssessBean;
import com.xianzhi.integration.http.HttpJsonInterface;
import com.xianzhi.integration.model.base.BaseHttpAsyncModel;
import com.xianzhi.integration.model.base.BaseResponesBean;
import com.xianzhi.integration.model.base.ModelCompleteCallback;

/**
 * @Administrator LiBo.
 * @Date 2017/7/14.
 * @Function
 */

public class MyAssessModel extends BaseHttpAsyncModel<MyAssessBean>{

    public MyAssessModel(int model_id, Context context, ModelCompleteCallback<BaseResponesBean> callback) {
        super(context, callback);
        this.TaskId = model_id;
    }

    @Override
    protected BaseResponesBean doInBackground(String... params) {
        return getDatas();
    }

    private BaseResponesBean getDatas() {
        String url;
        if(TextUtils.isEmpty(holder.getLeaderId())) {
            url = BaseApplication.url + "/integrationPreAssessment/myAssessmentList?token=" + BaseApplication.token + "&month=" + holder.getDate();
        } else {
            url = BaseApplication.url + "/integrationLeaderApprove/save?token=" + BaseApplication.token + "&model.user_id=" + BaseApplication.userId + "&model.month=" + holder.getDate() + "&model.leader_id1=" + holder.getLeaderId();
        }
        BaseResponesBean bean = HttpJsonInterface.getInstance().doGet(url);
        if(bean.getJson() != null){
            bean.setDataholder(bean.getJsonString());
        }
        return bean;
    }

}
