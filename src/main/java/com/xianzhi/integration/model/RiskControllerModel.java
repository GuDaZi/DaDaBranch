package com.xianzhi.integration.model;

import android.content.Context;

import com.xianzhi.integration.base.BaseApplication;
import com.xianzhi.integration.bean.RiskControllerBean;
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

public class RiskControllerModel extends BaseHttpAsyncModel<RiskControllerBean> {

    public RiskControllerModel(int model_id, Context context, ModelCompleteCallback<BaseResponesBean> callback) {
        super(context, callback);
        this.TaskId = model_id;
    }

    @Override
    protected BaseResponesBean doInBackground(String... params) {
        return getDatas();
    }

    private BaseResponesBean getDatas() {
        String url = BaseApplication.url + "/integrationRiskControl/riskControlTable";
        List<NameValuePair> parmas = new ArrayList<>();
        parmas.add(new BasicNameValuePair("token", BaseApplication.token));
        parmas.add(new BasicNameValuePair("isExport", "false"));
        parmas.add(new BasicNameValuePair("yearAndMonth", holder.getDate()));
        parmas.add(new BasicNameValuePair("search_dept_name", holder.getDepartName()));
        parmas.add(new BasicNameValuePair("dept_code", holder.getDepartCode()));
        parmas.add(new BasicNameValuePair("zrdep_id", holder.getDepartId()));
        parmas.add(new BasicNameValuePair("name", holder.getUserName()));
        parmas.add(new BasicNameValuePair("positionId", holder.getJobNameId()));
        parmas.add(new BasicNameValuePair("type", holder.getClasses()));
        BaseResponesBean bean = HttpJsonInterface.getInstance().doPost(url, parmas);
        if(bean.getJson() != null){
            bean.setDataholder(bean.getJson());
        }
        return bean;
    }

}
