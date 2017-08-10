package com.xianzhi.integration.model;

import android.content.Context;

import com.xianzhi.integration.base.BaseApplication;
import com.xianzhi.integration.bean.QuantizationBean;
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
 * @Date 2017/7/31.
 * @Function
 */

public class QuartizationModel extends BaseHttpAsyncModel<QuantizationBean> {

    public QuartizationModel(int model_id, Context context, ModelCompleteCallback<BaseResponesBean> callback) {
        super(context, callback);
        this.TaskId = model_id;
    }

    @Override
    protected BaseResponesBean doInBackground(String... params) {
        return getDatas();
    }

    private BaseResponesBean getDatas() {
        String url = BaseApplication.url + "/integrationPreAssessment/personalAssessmentAllList";
        List<NameValuePair> parmas = new ArrayList<>();
        parmas.add(new BasicNameValuePair("token", BaseApplication.token));
        parmas.add(new BasicNameValuePair("month", holder.getDate()));
        parmas.add(new BasicNameValuePair("search_dept_name", holder.getDepart()));
        parmas.add(new BasicNameValuePair("dept_code", holder.getDepart_code()));
        parmas.add(new BasicNameValuePair("dept_id", holder.getDepartId()));
        parmas.add(new BasicNameValuePair("name", holder.getUserName()));
        parmas.add(new BasicNameValuePair("pageNumber", holder.getNumber() + ""));
        parmas.add(new BasicNameValuePair("pageSize", holder.getSize() + ""));
        BaseResponesBean bean = HttpJsonInterface.getInstance().doPost(url, parmas);
        if(bean.getJson() != null) {
            bean.setDataholder(bean.getJson());
        }
        return bean;
    }

}
