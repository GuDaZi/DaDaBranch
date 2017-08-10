package com.xianzhi.integration.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.xianzhi.integration.R;
import com.xianzhi.integration.base.MyBaseAdapter;
import com.xianzhi.integration.bean.MyAssessDetailBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @Administrator LiBo.
 * @Date 2017/7/14.
 * @Function
 */

public class MyAssessDetailAdapter extends MyBaseAdapter<MyAssessDetailBean.PageBean.ListBean> {

    public MyAssessDetailAdapter(Context context, List<MyAssessDetailBean.PageBean.ListBean> datas) {
        super(context, datas);
    }

    @Override
    public View getViewDatas(int position, View convertView, ViewGroup parent) {
        CadreDetailHolderView holderView;
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.content_myassess_detail, null);
            holderView = new CadreDetailHolderView(convertView);
            convertView.setTag(holderView);
        } else {
            holderView = (CadreDetailHolderView) convertView.getTag();
        }

        holderView.tv_create.setText(datas.get(position).getTime());
        holderView.tv_enter.setText(datas.get(position).getSjzx_create_time());
        holderView.tv_address.setText(datas.get(position).getDept_name() + datas.get(position).getPlace_type() + datas.get(position).getPlace());
        holderView.tv_workDetail.setText(datas.get(position).getContent());

        return convertView;
    }

    class CadreDetailHolderView {

        @BindView(R.id.tv_create_time)
        TextView tv_create;
        @BindView(R.id.tv_enter_time)
        TextView tv_enter;
        @BindView(R.id.tv_address)
        TextView tv_address;
        @BindView(R.id.tv_workDetail)
        TextView tv_workDetail;

        public CadreDetailHolderView(View view) {
            ButterKnife.bind(this, view);
        }
    }

}
