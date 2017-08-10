package com.xianzhi.integration.presenter;

import android.content.Context;
import android.util.Log;

import com.xianzhi.integration.base.BaseApplication;
import com.xianzhi.integration.http.HttpJsonInterface;
import com.xianzhi.integration.model.base.BaseHttpAsyncModel;
import com.xianzhi.integration.model.base.BaseResponesBean;
import com.xianzhi.integration.model.base.ModelCompleteCallback;

import java.util.List;

/**
 * Created by TJTJL on 2017/7/20.
 */

public class SecTreePresenter extends BaseHttpAsyncModel<BaseResponesBean> {

    private static final String TAG = "SFragHD";
    private String code, pid, level;

    public SecTreePresenter(int model_id, Context context, ModelCompleteCallback<BaseResponesBean> callback, List params) {
        super(context, callback);
        this.TaskId = model_id;

        code = params.get(0).toString().trim();
        pid =  params.get(1).toString().trim();
        level = params.get(2).toString().trim();


    }

    @Override
    protected BaseResponesBean doInBackground(String... params) {
        return getDatas();
    }

    private BaseResponesBean getDatas() {

        //http://223.100.3.171:10007/integrationRiskControl/main?code=2018&pid=6126&token=
        Log.e(TAG, "getDatas: code:　" + code);
        Log.e(TAG, "getDatas: pid:　" + pid);
        Log.e(TAG, "getDatas: level:　" + level);

        String url = BaseApplication.url + "/integrationRiskControl/main?code=" + code
                + "&pid=" + pid
                +"&token=" + BaseApplication.token;
        BaseResponesBean bean = HttpJsonInterface.getInstance().doGet(url);
        if (bean.getJson() != null) {
            bean.setDataholder(bean.getJsonString());
        }
        return bean;
    }

}
