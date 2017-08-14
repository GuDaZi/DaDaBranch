package com.xianzhi.integration.view;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

import com.xianzhi.integration.R;
import com.xianzhi.integration.activity.settings.CpcActivity;
import com.xianzhi.integration.tools.util.ToastUtil;

/**
 * Created by TJTJL on 2017/7/20.
 */

public class CpcPopup extends PopupWindow {

    private CpcActivity activity;

    public CpcPopup(final Context context) {
        super(context);
        activity = (CpcActivity) context;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View conentView = inflater.inflate(R.layout.view_cpc_popup, null, false);
        conentView.findViewById(R.id.tv_refer_apply).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastUtil.showShort(context, "复用考核信息");
                activity.setFragment(activity.CPC_REUSE_FRAG);
                dismiss();
            }
        });
        conentView.findViewById(R.id.tv_check).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastUtil.showShort(context, "批量设置任务");
                activity.setFragment(activity.CPC_MULTI_FRAG);
                dismiss();
            }
        });
        conentView.findViewById(R.id.tv_check_detail).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastUtil.showShort(context, "增加动态任务");
                activity.setFragment(activity.CPC_DYNAMIC_FRAG);
                dismiss();
            }
        });
        // 设置SelectPicPopupWindow的View
        this.setContentView(conentView);
        // 设置SelectPicPopupWindow弹出窗体的高
        this.setWidth(ViewGroup.LayoutParams.WRAP_CONTENT);
        this.setHeight(ViewGroup.LayoutParams.WRAP_CONTENT);
        // 设置SelectPicPopupWindow弹出窗体可点击
        this.setFocusable(true);
        this.setOutsideTouchable(true);
        // 刷新状态
        this.update();
        // 实例化一个ColorDrawable颜色为半透明
        ColorDrawable dw = new ColorDrawable(0000000000);
        // 点back键和其他地方使其消失,设置了这个才能触发OnDismisslistener ，设置其他控件变化等操作
        this.setBackgroundDrawable(dw);
    }
}
