package com.xianzhi.integration.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.xianzhi.integration.R;
import com.xianzhi.integration.activity.QuantizationDetailActivity;
import com.xianzhi.integration.base.MyBaseAdapter;
import com.xianzhi.integration.bean.QuantizationInfoBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @Administrator LiBo.
 * @Date 2017/7/31.
 * @Function
 */

public class QuantizationInfoAdapter extends MyBaseAdapter<QuantizationInfoBean.ListBean> {


    public QuantizationInfoAdapter(Context context, List<QuantizationInfoBean.ListBean> datas) {
        super(context, datas);
    }

    @Override
    public View getViewDatas(final int position, View convertView, ViewGroup parent) {
        QuantizationInfoHolderView holderView;
        if(convertView == null) {
            convertView = inflater.inflate(R.layout.content_quantization_info, null);
            holderView = new QuantizationInfoHolderView(convertView);
            convertView.setTag(holderView);
        } else {
            holderView = (QuantizationInfoHolderView) convertView.getTag();
        }

        holderView.tv_dynamic.setText(datas.get(position).getDynamic() + "");
        holderView.tv_normalcy.setText(datas.get(position).getNormal() + "");
        holderView.tv_work.setText(datas.get(position).getContent());
        holderView.tv_total.setText((datas.get(position).getDynamic_done() + datas.get(position).getNormal_done()) + "/" + (datas.get(position).getDynamic() + datas.get(position).getNormal()));
        if((datas.get(position).getDynamic_done() + datas.get(position).getNormal_done()) >= (datas.get(position).getDynamic() + datas.get(position).getNormal())){
            holderView.tv_status.setText("已完成");
            holderView.tv_status.setTextColor(Color.rgb(51, 180, 69));
        } else {
            holderView.tv_status.setText("未完成");
            holderView.tv_status.setTextColor(Color.RED);
        }

        holderView.tv_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, QuantizationDetailActivity.class).putExtra("itemId", datas.get(position).getPre_id() + ""));
            }
        });

        return convertView;
    }

    class QuantizationInfoHolderView {

        @BindView(R.id.tv_quantization_work)
        TextView tv_work;
        @BindView(R.id.tv_quantization_dynamic)
        TextView tv_dynamic;
        @BindView(R.id.tv_quantization_normalcy)
        TextView tv_normalcy;
        @BindView(R.id.tv_quantization_total)
        TextView tv_total;
        @BindView(R.id.tv_quantization_status)
        TextView tv_status;
        @BindView(R.id.tv_quantization_check)
        TextView tv_check;

        public QuantizationInfoHolderView(View view) {
            ButterKnife.bind(this, view);
        }
    }

}
