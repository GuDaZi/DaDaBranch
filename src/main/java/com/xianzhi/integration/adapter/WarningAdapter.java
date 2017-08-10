package com.xianzhi.integration.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.xianzhi.integration.R;
import com.xianzhi.integration.base.MyBaseAdapter;
import com.xianzhi.integration.bean.WarningListBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @Administrator LiBo.
 * @Date 2017/8/1.
 * @Function
 */

public class WarningAdapter extends MyBaseAdapter<WarningListBean.PageBean.ListBean> {

    public WarningAdapter(Context context, List<WarningListBean.PageBean.ListBean> datas) {
        super(context, datas);
    }

    @Override
    public View getViewDatas(int position, View convertView, ViewGroup parent) {
        WarningHolderView holderView;
        if(convertView == null){
            convertView = inflater.inflate(R.layout.content_warning, null);
            holderView = new WarningHolderView(convertView);
            convertView.setTag(holderView);
        } else {
            holderView = (WarningHolderView) convertView.getTag();
        }

        holderView.tv_incident.setText(datas.get(position).getContent());
        holderView.tv_time.setText(datas.get(position).getTime());
        holderView.tv_name.setText(datas.get(position).getUser_name());
        holderView.tv_socre.setText(datas.get(position).getScore());

        return convertView;
    }

    class WarningHolderView {
        @BindView(R.id.tv_warning_name)
        TextView tv_name;
        @BindView(R.id.tv_warning_happenTime)
        TextView tv_time;
        @BindView(R.id.tv_warning_incident)
        TextView tv_incident;
        @BindView(R.id.tv_warning_score)
        TextView tv_socre;

        public WarningHolderView(View view) {
            ButterKnife.bind(this, view);
        }
    }

}
