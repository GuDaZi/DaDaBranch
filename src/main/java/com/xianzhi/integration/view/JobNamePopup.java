package com.xianzhi.integration.view;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.PopupWindow;

import com.xianzhi.integration.R;
import com.xianzhi.integration.adapter.JobNameAdapter;
import com.xianzhi.integration.bean.RiskControllerBean;
import com.xianzhi.integration.listener.OnPopupClickListener;

import java.util.List;

/**
 * @Administrator LiBo.
 * @Date 2017/8/2.
 * @Function
 */

public class JobNamePopup extends PopupWindow implements JobNameAdapter.OnRiskClickListener {

    private JobNameAdapter adapter;
    private OnPopupClickListener listener;

    public JobNamePopup(int width, OnPopupClickListener listener, List<RiskControllerBean.PositionListBean> datas, Context context) {
        super(context);
        this.listener = listener;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View conentView = inflater.inflate(R.layout.view_enter_work_popup, null, false);

        ListView list_content = (ListView) conentView.findViewById(R.id.enter_work_list);
        adapter = new JobNameAdapter(this, context, datas);
        list_content.setAdapter(adapter);

        // 设置SelectPicPopupWindow的View
        this.setContentView(conentView);
        // 设置SelectPicPopupWindow弹出窗体的高
        this.setWidth(width);
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


    @Override
    public void onRiskClick(String content, int pid) {
        listener.onContentClick(5, content, pid);
        dismiss();
    }
}
