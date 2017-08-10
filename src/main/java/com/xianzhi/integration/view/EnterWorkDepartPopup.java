package com.xianzhi.integration.view;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.PopupWindow;

import com.xianzhi.integration.R;
import com.xianzhi.integration.bean.DepartmentBean;
import com.xianzhi.integration.listener.OnPopupClickListener;
import com.zhy.tree.bean.Node;
import com.zhy.tree.bean.TreeListViewAdapter;

import java.util.List;

/**
 * @Administrator LiBo.
 * @Date 2017/7/17.
 * @Function 部门popupwindow
 */

public class EnterWorkDepartPopup extends PopupWindow {

    public EnterWorkDepartPopup(int width, final Context context, final List<DepartmentBean> departBeanList, final OnPopupClickListener listener) {
        super(context);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View conentView = inflater.inflate(R.layout.view_enter_work_popup, null, false);
        ListView depart_list = (ListView) conentView.findViewById(R.id.enter_work_list);
        TreeListViewAdapter adapter = new TreeListViewAdapter(depart_list, context, departBeanList, 1);

        adapter.setOnTreeNodeClickListener(new TreeListViewAdapter.OnTreeNodeClickListener() {

            @Override
            public void onClick(Node node, int position) {
                StringBuffer depart = new StringBuffer("");
                depart.insert(0, node.getName());
                Node nodeTemporary = node;
                for (int i = node.getLevel(); i >=1 ; i--) {
                    nodeTemporary=nodeTemporary.getParent();
                    depart.insert(0, "->");
                    depart.insert(0, nodeTemporary.getName());
                }
                listener.onDepartClick(0, node.getName(), depart.toString().trim(), node.getId(), node.getCode());
                dismiss();
            }
        });
        depart_list.setAdapter(adapter);

        // 设置SelectPicPopupWindow的View
        this.setContentView(conentView);
        // 设置SelectPicPopupWindow弹出窗体的高
        this.setWidth(width);
//        this.setWidth(ViewGroup.LayoutParams.WRAP_CONTENT);
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
