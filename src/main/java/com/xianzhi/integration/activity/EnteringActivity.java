package com.xianzhi.integration.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.xianzhi.integration.R;
import com.xianzhi.integration.base.BaseActivity;
import com.xianzhi.integration.bean.ApproveBean;
import com.xianzhi.integration.bean.TableDialogBean;
import com.xianzhi.integration.model.base.BaseResponesBean;
import com.xianzhi.integration.model.base.ModelCompleteCallback;
import com.xianzhi.integration.model.base.ModelFactory;
import com.xianzhi.integration.tools.util.FastJsonUtil;
import com.xianzhi.integration.tools.util.StatusUtil;
import com.xianzhi.integration.view.TableDialogPopup;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * @Administrator LiBo.
 * @Date 2017/7/26.
 * @Function 录入界面
 */

public class EnteringActivity extends BaseActivity implements TableDialogPopup.OnResonsClickListener, ModelCompleteCallback<BaseResponesBean> {


    private List<TableDialogBean.VetoListBean> datas;
    private String itemId;
    @BindView(R.id.et_score)
    EditText et_score;
    @BindView(R.id.et_reason)
    EditText et_reason;
    @BindView(R.id.tv_conditions)
    TextView tv_conditions;
    @BindView(R.id.lin_conditions)
    LinearLayout lin_conditions;
    private TableDialogPopup popup;
    private String veto_id;
    private String type;

    @Override
    protected void onCreateView(Bundle saveInstanceState) {
        setContentView(R.layout.activity_entering);
    }

    @Override
    protected void initView() {
        itemId = getIntent().getStringExtra("itemId");
        type = getIntent().getStringExtra("type");
        tv_edit.setText("提交");
        tv_edit.setVisibility(View.VISIBLE);
        datas = new ArrayList<>();
        getDatas();
    }

    @Override
    protected void setListener() {
        tv_conditions.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.lin_right:
                setApproveDatas();
                break;
            case R.id.tv_conditions:
                popup.showAsDropDown(lin_conditions, 0, 0);
                break;
            case R.id.lin_back:
                finish();
                break;
        }
    }

    /**
     * 获取数据
     */
    private void getDatas() {
        progressDialog.show();
        model = ModelFactory.getModel(ModelFactory.EARSON, context, this);
        model.excuteParams(new TableDialogBean(itemId));
    }

    /**
     * 提交
     */
    private void setApproveDatas() {
        model = ModelFactory.getModel(ModelFactory.APPROVE, this, this);
        model.excuteParams(new ApproveBean(itemId, et_score.getText().toString(), et_reason.getText().toString(), veto_id, type));

    }

    @Override
    public void onTaskPostExecute(int taskid, BaseResponesBean result) {
        if (progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        if(result==null){
            return;
        }
        if(result.getStatus()!= StatusUtil.STATUS_OK){
            return;
        }
        if(result.getInterface_status() == StatusUtil.INTERFACE_OK) {
            switch (taskid) {
                case ModelFactory.EARSON:
                    TableDialogBean bean = FastJsonUtil.getObject(result.getDataholder().toString(), TableDialogBean.class);
                    datas = bean.getVetoList();
                    popup = new TableDialogPopup(this, datas, context);
                    break;
                case  ModelFactory.APPROVE:
                    ApproveBean approveBean = FastJsonUtil.getObject(result.getDataholder().toString(), ApproveBean.class);
                    if(approveBean.getStatus() == 0){
                        Intent intent = new Intent();
                        intent.putExtra("reason", et_reason.getText().toString());
                        intent.putExtra("score", et_score.getText().toString());
                        intent.putExtra("type", type);
                        setResult(10, intent);
                        finish();
                    }
                    break;
            }
        }
    }

    @Override
    public void onReasonClick(String content, int pid) {
        tv_conditions.setText(content);
        veto_id = pid + "";
    }
}
