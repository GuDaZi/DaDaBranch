package com.xianzhi.integration.model;

import android.content.Context;
import android.text.TextUtils;

import com.xianzhi.integration.base.BaseApplication;
import com.xianzhi.integration.bean.EnterWorkBean;
import com.xianzhi.integration.http.HttpJsonInterface;
import com.xianzhi.integration.model.base.BaseHttpAsyncModel;
import com.xianzhi.integration.model.base.BaseResponesBean;
import com.xianzhi.integration.model.base.ModelCompleteCallback;

/**
 * @Administrator LiBo.
 * @Date 2017/7/17.
 * @Function
 */

public class EnterWorkModel extends BaseHttpAsyncModel<EnterWorkBean> {

    public EnterWorkModel(int model_id, Context context, ModelCompleteCallback<BaseResponesBean> callback) {
        super(context, callback);
        this.TaskId = model_id;
    }

    @Override
    protected BaseResponesBean doInBackground(String... params) {
        return getDatas();
    }

    private BaseResponesBean getDatas(){
        String url;
        if(TextUtils.isEmpty(holder.getItemId())){
            url = BaseApplication.url + "/integrationPreAssessment/personalRealisticMultiple?userId=" + holder.getUserId() + "&month=" + holder.getDate() + "&token=" + BaseApplication.token;
        } else {
            url = BaseApplication.url + "/integrationPreAssessment/personalRealistic?userId=" + holder.getUserId() + "&month=" + holder.getDate() + "&preId=" + holder.getItemId() + "&token=" + BaseApplication.token;
        }
        BaseResponesBean bean = HttpJsonInterface.getInstance().doGet(url);
        if(bean.getJson() != null){
            bean.setDataholder(bean.getJson());
        }
        return bean;
    }
}
