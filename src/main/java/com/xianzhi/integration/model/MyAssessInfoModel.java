package com.xianzhi.integration.model;

import android.content.Context;

import com.xianzhi.integration.base.BaseApplication;
import com.xianzhi.integration.bean.MyAssessDetailBean;
import com.xianzhi.integration.http.HttpJsonInterface;
import com.xianzhi.integration.model.base.BaseHttpAsyncModel;
import com.xianzhi.integration.model.base.BaseResponesBean;
import com.xianzhi.integration.model.base.ModelCompleteCallback;

/**
 * @Administrator LiBo.
 * @Date 2017/7/17.
 * @Function
 */

public class MyAssessInfoModel extends BaseHttpAsyncModel<MyAssessDetailBean> {

    public MyAssessInfoModel(int model_id, Context context, ModelCompleteCallback<BaseResponesBean> callback) {
        super(context, callback);
        this.TaskId = model_id;
    }

    @Override
    protected BaseResponesBean doInBackground(String... params) {
        return getDatas();
    }

    private BaseResponesBean getDatas() {
        String url = BaseApplication.url + "/integrationRealistic/myList?pre_assessment_id=" + holder.getItemId() + "&isSubmit=1" + "&token=" + BaseApplication.token + "&pageNumber=" + holder.getNumber() + "&pageSize=" + holder.getSize();
        BaseResponesBean bean  = HttpJsonInterface.getInstance().doGet(url);
        if(bean.getJson() != null){
            bean.setDataholder(bean.getJson());
        }
        return bean;
    }

}
