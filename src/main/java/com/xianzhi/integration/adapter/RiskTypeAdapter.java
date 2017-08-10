package com.xianzhi.integration.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.xianzhi.integration.R;
import com.xianzhi.integration.base.MyBaseAdapter;
import com.xianzhi.integration.bean.EnterWorkBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @Administrator LiBo.
 * @Date 2017/7/19.
 * @Function
 */

public class RiskTypeAdapter extends MyBaseAdapter<EnterWorkBean.RiskTypesBean> {

    private OnRiskClickListener listener;

    public RiskTypeAdapter(OnRiskClickListener listener, Context context, List datas) {
        super(context, datas);
        this.listener = listener;
    }

    @Override
    public View getViewDatas(final int position, View convertView, ViewGroup parent) {
        PopupHolderView holderView;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.view_popup_item, null);
            holderView = new PopupHolderView(convertView);
            convertView.setTag(holderView);
        } else {
            holderView = (PopupHolderView) convertView.getTag();
        }

        holderView.tv_content.setText(datas.get(position).getName());

        holderView.tv_content.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onRiskClick(datas.get(position).getName(), datas.get(position).getId());
            }
        });

        return convertView;
    }

    class PopupHolderView {

        @BindView(R.id.tv_content)
        TextView tv_content;

        public PopupHolderView(View view) {
            ButterKnife.bind(this, view);
        }
    }

    public interface OnRiskClickListener {
        void onRiskClick(String content, int pid);
    }
}