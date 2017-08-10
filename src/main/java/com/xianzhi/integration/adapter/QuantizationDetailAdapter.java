package com.xianzhi.integration.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.xianzhi.integration.R;
import com.xianzhi.integration.base.MyBaseAdapter;
import com.xianzhi.integration.bean.QuantizationDetailBnea;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @Administrator LiBo.
 * @Date 2017/7/31.
 * @Function
 */

public class QuantizationDetailAdapter extends MyBaseAdapter<QuantizationDetailBnea.PageBean.ListBean> {

    public QuantizationDetailAdapter(Context context, List<QuantizationDetailBnea.PageBean.ListBean> datas) {
        super(context, datas);
    }

    @Override
    public View getViewDatas(int position, View convertView, ViewGroup parent) {
        QuantizationDetailHolderView holderView;
        if(convertView == null){
            convertView = inflater.inflate(R.layout.content_quantization_detail, null);
            holderView = new QuantizationDetailHolderView(convertView);
            convertView.setTag(holderView);
        } else {
            holderView = (QuantizationDetailHolderView) convertView.getTag();
        }

        holderView.tv_date.setText(datas.get(position).getTime());
        holderView.tv_address.setText(datas.get(position).getPlace_type() + "-" + datas.get(position).getPlace());
        holderView.tv_work.setText(datas.get(position).getContent());

        return convertView;
    }

    class QuantizationDetailHolderView {

        @BindView(R.id.tv_quantization_time)
        TextView tv_date;
        @BindView(R.id.tv_quantization_address)
        TextView tv_address;
        @BindView(R.id.tv_quantization_work)
        TextView tv_work;

        public QuantizationDetailHolderView(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
