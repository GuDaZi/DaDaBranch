package com.xianzhi.integration.model;

import android.content.Context;

import com.xianzhi.integration.base.BaseApplication;
import com.xianzhi.integration.bean.AddressTypeBean;
import com.xianzhi.integration.http.HttpJsonInterface;
import com.xianzhi.integration.model.base.BaseHttpAsyncModel;
import com.xianzhi.integration.model.base.BaseResponesBean;
import com.xianzhi.integration.model.base.ModelCompleteCallback;

/**
 * @Administrator LiBo.
 * @Date 2017/7/18.
 * @Function
 */

public class AddressTypeModel extends BaseHttpAsyncModel<AddressTypeBean> {

    public AddressTypeModel(int model_id, Context context, ModelCompleteCallback<BaseResponesBean> callback) {
        super(context, callback);
        this.TaskId = model_id;
    }

    @Override
    protected BaseResponesBean doInBackground(String... params) {
        return getDatas();
    }

    private BaseResponesBean getDatas() {
        String url;
        if(holder.getType() > 2){
            url = BaseApplication.url + "/safePostRisk/getRiskPoint?type=2&pid=" + holder.getDepartId()+ "&token=" +BaseApplication.token;
        } else {
            url = BaseApplication.url + "/integrationPlace/autoList?type=" + holder.getType() + "&pid=" + holder.getDepartId()+ "&token=" +BaseApplication.token;
        }
        BaseResponesBean bean = HttpJsonInterface.getInstance().doGet(url);
        if(bean.getJson() != null){
            bean.setDataholder(bean.getJson());
        }
        return bean;
    }
}
