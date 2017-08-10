package com.xianzhi.integration.view;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.StyleRes;
import android.view.View;
import android.widget.TextView;

import com.xianzhi.integration.R;
import com.xianzhi.integration.bean.AssessCollectBean;
import com.xianzhi.integration.model.base.BaseResponesBean;
import com.xianzhi.integration.model.base.Model;
import com.xianzhi.integration.model.base.ModelCompleteCallback;
import com.xianzhi.integration.model.base.ModelFactory;
import com.xianzhi.integration.tools.util.FastJsonUtil;
import com.xianzhi.integration.tools.util.StatusUtil;
import com.xianzhi.integration.tools.util.ToastUtil;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @Administrator LiBo.
 * @Date 2017/8/2.
 * @Function
 */

public class RejectDialog extends Dialog implements ModelCompleteCallback<BaseResponesBean> {

    public RejectDialog(@NonNull Context context) {
        super(context);
    }

    public RejectDialog(@NonNull Context context, @StyleRes int theme) {
        super(context, theme);
        this.context = context;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    @BindView(R.id.tv_cancel)
    TextView tv_cancel;
    @BindView(R.id.tv_sure)
    TextView tv_sure;
    private Context context;
    private int itemId;
    private Model model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_reject_dialog);
        ButterKnife.bind(this);
        setListener();
    }

    private void setListener() {
        tv_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

        tv_sure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setReject(itemId);
            }
        });
    }

    private void setReject(int id) {
        model = ModelFactory.getModel(ModelFactory.REJECTAPPROVE, context, this);
        model.excuteParams(new AssessCollectBean(id));

    }

    @Override
    public void onTaskPostExecute(int taskid, BaseResponesBean result) {
        if (result == null) {
            return;
        }
        if (result.getStatus() != StatusUtil.STATUS_OK) {
            return;
        }
        if (result.getInterface_status() == StatusUtil.INTERFACE_OK) {
            AssessCollectBean bean = FastJsonUtil.getObject(result.getDataholder().toString(), AssessCollectBean.class);
            dismiss();
            if(bean.getStatus() == 0){
                ToastUtil.showShort(context, "驳回成功");
            } else {
                ToastUtil.showShort(context, "驳回失败");
            }

        }
    }
}
