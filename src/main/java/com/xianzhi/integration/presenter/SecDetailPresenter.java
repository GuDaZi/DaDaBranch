package com.xianzhi.integration.presenter;

import android.content.Context;
import android.util.Log;

import com.xianzhi.integration.base.BaseApplication;
import com.xianzhi.integration.http.HttpJsonInterface;
import com.xianzhi.integration.model.base.BaseHttpAsyncModel;
import com.xianzhi.integration.model.base.BaseResponesBean;
import com.xianzhi.integration.model.base.ModelCompleteCallback;

/**
 * Created by TJTJL on 2017/7/20.
 */

public class SecDetailPresenter extends BaseHttpAsyncModel<BaseResponesBean> {

    private static final String TAG = "SFragHD";
    private String year = "2017";
    private String id = "1267";

    public SecDetailPresenter(int model_id, Context context, ModelCompleteCallback<BaseResponesBean> callback, String year, String id) {
        super(context, callback);
        this.TaskId = model_id;
        this.year = year;
        this.id = id;
    }

    @Override
    protected BaseResponesBean doInBackground(String... params) {
        return getDatas();
    }

    private BaseResponesBean getDatas() {

        Log.e(TAG, "getDatas:year "+year );
        Log.e(TAG, "getDatas:id "+id );
        //
        String url = BaseApplication.url + "/integrationRiskControl/yearDetail?id="+id+
                "&year="+year+"&token="+BaseApplication.token;
        BaseResponesBean bean = HttpJsonInterface.getInstance().doGet(url);
        if(bean.getJson() != null){
            bean.setDataholder(bean.getJsonString());
        }
        return bean;
    }


}
