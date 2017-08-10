package com.xianzhi.integration.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.xianzhi.integration.R;
import com.xianzhi.integration.activity.QuantizationInfoActivity;
import com.xianzhi.integration.base.MyBaseAdapter;
import com.xianzhi.integration.bean.QuantizationBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @Administrator LiBo.
 * @Date 2017/7/31.
 * @Function
 */

public class QuantizationAdapter extends MyBaseAdapter<QuantizationBean.PageBean.ListBean> {

    public QuantizationAdapter(Context context, List<QuantizationBean.PageBean.ListBean> datas) {
        super(context, datas);
    }

    @Override
    public View getViewDatas(final int position, View convertView, ViewGroup parent) {
        QuantizationHolderView holderView;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.content_quantization, null);
            holderView = new QuantizationHolderView(convertView);
            convertView.setTag(holderView);
        } else {
            holderView = (QuantizationHolderView) convertView.getTag();
        }

        holderView.tv_name.setText(datas.get(position).getName());
        holderView.tv_job.setText(datas.get(position).getPosition_name());
        holderView.tv_post.setText(datas.get(position).getPost_name());
        if(!TextUtils.isEmpty(datas.get(position).getDept_name7()) && !datas.get(position).getDept_name7().equals("0")){
            holderView.tv_depart.setText(datas.get(position).getDept_name3() + "-" + datas.get(position).getDept_name4() + "-" + datas.get(position).getDept_name5() + "-" + datas.get(position).getDept_name6() + "-" + datas.get(position).getDept_name7());
        } else if (!TextUtils.isEmpty(datas.get(position).getDept_name6())&& !datas.get(position).getDept_name6().equals("0")){
            holderView.tv_depart.setText(datas.get(position).getDept_name3() + "-" + datas.get(position).getDept_name4() + "-" + datas.get(position).getDept_name5() + "-" + datas.get(position).getDept_name6());
        } else if(!TextUtils.isEmpty(datas.get(position).getDept_name5())&& !datas.get(position).getDept_name5().equals("0")) {
            holderView.tv_depart.setText(datas.get(position).getDept_name3() + "-" + datas.get(position).getDept_name4() + "-" + datas.get(position).getDept_name5());
        } else if(!TextUtils.isEmpty(datas.get(position).getDept_name4())&& !datas.get(position).getDept_name4().equals("0")) {
            holderView.tv_depart.setText(datas.get(position).getDept_name3() + "-" + datas.get(position).getDept_name4());
        } else if(!TextUtils.isEmpty(datas.get(position).getDept_name3())&& !datas.get(position).getDept_name3().equals("0")) {
            holderView.tv_depart.setText(datas.get(position).getDept_name3());
        }

        if(datas.get(position).getCompletestatus().getNum() != 0 && datas.get(position).getCompletestatus().getNum() <= datas.get(position).getCompletestatus().getNum_done()){
            holderView.tv_status.setText("已完成");
            holderView.tv_status.setTextColor(Color.rgb(51, 180, 69));
        } else {
            holderView.tv_status.setText("未完成");
            holderView.tv_status.setTextColor(Color.RED);
        }

        holderView.tv_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, QuantizationInfoActivity.class).putExtra("itemId", datas.get(position).getId() + ""));
            }
        });

        return convertView;
    }

    class QuantizationHolderView {
        @BindView(R.id.tv_quantization_name)
        TextView tv_name;
        @BindView(R.id.tv_quantization_jobName)
        TextView tv_job;
        @BindView(R.id.tv_quantization_post)
        TextView tv_post;
        @BindView(R.id.tv_quantization_depart)
        TextView tv_depart;
        @BindView(R.id.tv_quantization_status)
        TextView tv_status;
        @BindView(R.id.tv_quantization_check)
        TextView tv_check;

        public QuantizationHolderView(View view) {
            ButterKnife.bind(this, view);
        }
    }

}
