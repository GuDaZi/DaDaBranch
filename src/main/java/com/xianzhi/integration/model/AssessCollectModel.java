package com.xianzhi.integration.model;

import android.content.Context;

import com.xianzhi.integration.base.BaseApplication;
import com.xianzhi.integration.bean.AssessCollectBean;
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
 * @Date 2017/8/1.
 * @Function
 */

public class AssessCollectModel extends BaseHttpAsyncModel<AssessCollectBean> {

    public AssessCollectModel(int modelk_id, Context context, ModelCompleteCallback<BaseResponesBean> callback) {
        super(context, callback);
        this.TaskId = modelk_id;
    }

    @Override
    protected BaseResponesBean doInBackground(String... params) {
        return getDatas();
    }

    private BaseResponesBean getDatas() {
        String url = BaseApplication.url + "/integrationLeaderApprove/listAll";
        List<NameValuePair> parmas = new ArrayList<>();
        parmas.add(new BasicNameValuePair("token", BaseApplication.token));
        parmas.add(new BasicNameValuePair("flag", "1"));
        parmas.add(new BasicNameValuePair("stationId", ""));
        parmas.add(new BasicNameValuePair("stationCode", ""));
        parmas.add(new BasicNameValuePair("cwdId", ""));
        parmas.add(new BasicNameValuePair("cwdCode", ""));
        parmas.add(new BasicNameValuePair("month", holder.getDate()));
        parmas.add(new BasicNameValuePair("search_dept_name", holder.getDepartName()));
        parmas.add(new BasicNameValuePair("dept_code", holder.getDepartCode()));
        parmas.add(new BasicNameValuePair("zrdep_id", holder.getDeapartId()));
        parmas.add(new BasicNameValuePair("name", holder.getUserName()));
        parmas.add(new BasicNameValuePair("pageSize", holder.getSize() + ""));
        parmas.add(new BasicNameValuePair("pageNumber", holder.getNum() + ""));
        BaseResponesBean bean = HttpJsonInterface.getInstance().doPost(url, parmas);
        if(bean.getJson() != null){
            bean.setDataholder(bean.getJson());
        }
        return bean;
     }

}
