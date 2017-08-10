package com.xianzhi.integration.model;

import android.content.Context;

import com.xianzhi.integration.base.BaseApplication;
import com.xianzhi.integration.bean.TableDialogBean;
import com.xianzhi.integration.http.HttpJsonInterface;
import com.xianzhi.integration.model.base.BaseHttpAsyncModel;
import com.xianzhi.integration.model.base.BaseResponesBean;
import com.xianzhi.integration.model.base.ModelCompleteCallback;

/**
 * @Administrator LiBo.
 * @Date 2017/7/25.
 * @Function
 */

public class TableDialogModel extends BaseHttpAsyncModel<TableDialogBean> {

    public TableDialogModel(int model_id, Context context, ModelCompleteCallback<BaseResponesBean> callback) {
        super(context, callback);
        this.TaskId = model_id;
    }

    @Override
    protected BaseResponesBean doInBackground(String... params) {
        return getDatas();
    }

    public BaseResponesBean getDatas() {
        String url = BaseApplication.url + "/integrationLeaderApprove/addSubtractScore?approveId=" + holder.getItemId() + "&type=1&token=" + BaseApplication.token;
        BaseResponesBean bean = HttpJsonInterface.getInstance().doGet(url);
        if (bean.getJson() != null){
            bean.setDataholder(bean.getJson());
        }
        return bean;
    }
}
