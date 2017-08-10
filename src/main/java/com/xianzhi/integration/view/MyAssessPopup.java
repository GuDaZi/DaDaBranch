package com.xianzhi.integration.view;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

import com.xianzhi.integration.R;

/**
 * @Administrator LiBo.
 * @Date 2017/7/14.
 * @Function
 */

public class MyAssessPopup extends PopupWindow {

    private OnTypeClickListener listener;

    public MyAssessPopup(final OnTypeClickListener listener, final Context context, int type) {
        super(context);
        this.listener = listener;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View conentView = inflater.inflate(R.layout.view_myassess_popup, null, false);
        if(type == 1){
            conentView.findViewById(R.id.tv_line).setVisibility(View.GONE);
            conentView.findViewById(R.id.tv_refer_apply).setVisibility(View.GONE);
        } else {
            conentView.findViewById(R.id.tv_line).setVisibility(View.VISIBLE);
            conentView.findViewById(R.id.tv_refer_apply).setVisibility(View.VISIBLE);
        }
        conentView.findViewById(R.id.tv_refer_apply).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onTypeClick(1);
                dismiss();
            }
        });
        conentView.findViewById(R.id.tv_check).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onTypeClick(2);
                dismiss();
            }
        });
        conentView.findViewById(R.id.tv_check_detail).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onTypeClick(3);
                dismiss();
            }
        });
        conentView.findViewById(R.id.tv_enter_detailWork).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onTypeClick(4);
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

    public interface OnTypeClickListener {
        void onTypeClick(int type);
    }

}
