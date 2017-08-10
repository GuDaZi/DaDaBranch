package com.xianzhi.integration.activity;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

import com.xianzhi.integration.R;
import com.xianzhi.integration.base.BaseActivity;
import com.xianzhi.integration.bean.SelfEvaluateEditBean;
import com.xianzhi.integration.bean.SelfEvaluateSaveBean;
import com.xianzhi.integration.model.base.BaseResponesBean;
import com.xianzhi.integration.model.base.ModelCompleteCallback;
import com.xianzhi.integration.model.base.ModelFactory;
import com.xianzhi.integration.tools.DateUtil;
import com.xianzhi.integration.tools.util.FastJsonUtil;
import com.xianzhi.integration.tools.util.StatusUtil;
import com.xianzhi.integration.tools.util.ToastUtil;
import com.xianzhi.integration.view.YearMonthPickerDialog;

import java.util.Calendar;

import butterknife.BindView;

/**
 * @Administrator LiBo.
 * @Date 2017/7/20.
 * @Function 自我写实与考评编辑界面
 */

public class SelfEvaluateEditActivity extends BaseActivity implements ModelCompleteCallback<BaseResponesBean> {

    private String month;
    private String itemId;
    private Calendar calendar;
    private int evaluateNum;
    //模板月份
    @BindView(R.id.tv_template_month)
    TextView tv_template_month;
    //模板写实内容
    @BindView(R.id.et_template_content)
    EditText et_template_content;
    //复制
    @BindView(R.id.tv_evaluate_copy)
    TextView tv_copy;
    //还原
    @BindView(R.id.tv_evaluate_restore)
    TextView tv_restore;
    //写实月份
    @BindView(R.id.tv_realistic_month)
    TextView tv_realistic_month;
    //工作内容
    @BindView(R.id.tv_work_content)
    TextView tv_work_content;
    //工作标准
    @BindView(R.id.tv_work_standard)
    TextView tv_work_standard;
    //写实内容
    @BindView(R.id.et_realistic_content)
    EditText et_realistic_content;
    //考评分
    @BindView(R.id.rb_evaluate_add)
    RadioButton rb_add;
    @BindView(R.id.rb_evaluate_minus)
    RadioButton rb_minus;
    //输入分值
    @BindView(R.id.et_evaluate_num)
    EditText et_num;
    //保存
    @BindView(R.id.tv_evaluate_save)
    TextView tv_save;
    //根布局
    @BindView(R.id.lin_edit_evaluate)
    LinearLayout lin_edit_evaluate;

    private SelfEvaluateEditBean editBean;

    @Override
    protected void onCreateView(Bundle saveInstanceState) {
        setContentView(R.layout.activity_selfevaluate_edit);
    }

    @Override
    protected void initView() {
        tv_title.setText("自我写实与考评");
        month = getIntent().getStringExtra("date");
        itemId = getIntent().getStringExtra("itemId");

        calendar = Calendar.getInstance();

        lin_edit_evaluate.setFocusableInTouchMode(true);
        lin_edit_evaluate.setFocusable(true);

        getDatas();

    }

    @Override
    protected void setListener() {
        tv_copy.setOnClickListener(this);
        tv_restore.setOnClickListener(this);
        tv_save.setOnClickListener(this);
        tv_template_month.setOnClickListener(this);
        rb_add.setOnClickListener(this);
        rb_minus.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_evaluate_copy:
                et_realistic_content.setText(et_template_content.getText().toString());
                break;
            case R.id.tv_evaluate_save:
                saveDatas();
                break;
            case R.id.tv_evaluate_restore:
                et_realistic_content.setText("");
                break;
            case R.id.tv_template_month:
                et_realistic_content.setText("");
                et_template_content.setText("");
                selectTime();
                break;
            case R.id.rb_evaluate_add:
                evaluateNum = 1;
                break;
            case R.id.rb_evaluate_minus:
                evaluateNum = 2;
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
        model = ModelFactory.getModel(ModelFactory.SELFEVALUATEEDIT, this, this);
        model.excuteParams(new SelfEvaluateEditBean(itemId, month));
    }

    /**
     * 保存数据
     */
    private void saveDatas() {
        String content = et_realistic_content.getText().toString();
        int num = Integer.parseInt(et_num.getText().toString());
        model = ModelFactory.getModel(ModelFactory.SELFEVALUATESAVE, this, this);
        model.excuteParams(new SelfEvaluateSaveBean(itemId, month, content, evaluateNum, num));
    }


    @Override
    public void onTaskPostExecute(int taskid, BaseResponesBean result) {
        if(progressDialog.isShowing()){
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
                case ModelFactory.SELFEVALUATEEDIT:
                    editBean = FastJsonUtil.getObject(result.getDataholder().toString(), SelfEvaluateEditBean.class);
                    tv_realistic_month.setText(editBean.getMonth());
                    tv_work_content.setText(editBean.getModel().getBzgznr());
                    tv_work_standard.setText(editBean.getModel().getBzgzbz());
                    et_realistic_content.setText(editBean.getModel().getContent());
                    break;
                case ModelFactory.SELFEVALUATESAVE:
                    SelfEvaluateSaveBean saveBean = FastJsonUtil.getObject(result.getDataholder().toString(), SelfEvaluateSaveBean.class);
                    if(saveBean.getStatus() == 0){
                        finish();
                    } else {
                        ToastUtil.showShort(getApplicationContext(), "保存失败");
                    }
                    break;
            }



        }
    }

    /***
     * 时间选择器
     */
    private void selectTime() {
        new YearMonthPickerDialog(this, AlertDialog.THEME_HOLO_LIGHT, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                calendar.set(Calendar.YEAR, year);
                calendar.set(Calendar.MONTH, monthOfYear);
                tv_template_month.setText(DateUtil.clanderTodatetime(calendar, "yyyy-MM"));

            }
        }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE)).show();

    }

}
