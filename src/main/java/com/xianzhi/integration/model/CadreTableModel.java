package com.xianzhi.integration.model;

import android.content.Context;

import com.xianzhi.integration.base.BaseApplication;
import com.xianzhi.integration.bean.TableBean;
import com.xianzhi.integration.http.HttpJsonInterface;
import com.xianzhi.integration.model.base.BaseHttpAsyncModel;
import com.xianzhi.integration.model.base.BaseResponesBean;
import com.xianzhi.integration.model.base.ModelCompleteCallback;

/**
 * @Administrator LiBo.
 * @Date 2017/7/25.
 * @Function
 */

public class CadreTableModel extends BaseHttpAsyncModel<TableBean> {

    public CadreTableModel(int model_id, Context context, ModelCompleteCallback<BaseResponesBean> callback) {
        super(context, callback);
        this.TaskId = model_id;
    }

    @Override
    protected BaseResponesBean doInBackground(String... params) {
        return getDatas();
    }

    private BaseResponesBean getDatas() {
        String url = null;
        if (holder.getType().equals("0")){
            url = BaseApplication.url + "/integrationPreAssessment/myAssessment?month=" + holder.getItemId() + "&token=" + BaseApplication.token;
        } else if (holder.getType().equals("1")){
            url = BaseApplication.url + "/integrationLeaderApprove/detail/" + holder.getItemId() + "?token=" + BaseApplication.token;
        } else if(holder.getType().equals("2")) {
            url = BaseApplication.url + "/integrationLeaderApprove/approve/" + holder.getItemId() + "?token=" + BaseApplication.token;
        } else if(holder.getType().equals("3")) {
            url = BaseApplication.url + "/integrationLeaderApprove/edit/" + holder.getItemId() + "?token=" + BaseApplication.token;
        } else if(holder.getType().equals("4")) {
            url = BaseApplication.url + "/integrationLeaderApprove/detail/" + holder.getItemId() + "?token=" + BaseApplication.token + "&idx=1_1_5";
        }
        BaseResponesBean bean = HttpJsonInterface.getInstance().doGet(url);
        if(bean.getJson() != null){
            bean.setDataholder(bean.getJson());
        }
        return bean;
    }

}
