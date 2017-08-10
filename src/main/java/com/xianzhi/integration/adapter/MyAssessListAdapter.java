package com.xianzhi.integration.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.xianzhi.integration.R;
import com.xianzhi.integration.activity.EnterWorkActivity;
import com.xianzhi.integration.activity.MyAssessDetailActivity;
import com.xianzhi.integration.base.BaseApplication;
import com.xianzhi.integration.base.MyBaseAdapter;
import com.xianzhi.integration.bean.MyAssessBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @Administrator LiBo.
 * @Date 2017/7/14.
 * @Function
 */

public class MyAssessListAdapter extends MyBaseAdapter<MyAssessBean.ListBean> {

    private int isSubmit;
    private String date;

    public MyAssessListAdapter(Context context, List<MyAssessBean.ListBean> datas) {
        super(context, datas);
    }

    @Override
    public View getViewDatas(final int position, View convertView, ViewGroup parent) {
        CadreHolderView holderView;
        if(convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.content_myassess_layout, null);
            holderView = new CadreHolderView(convertView);
            convertView.setTag(holderView);
        } else {
            holderView = (CadreHolderView) convertView.getTag();
        }

        holderView.tv_work.setText(datas.get(position).getContent());
        holderView.tv_normalcy.setText(datas.get(position).getNormal() + "");
        holderView.tv_dynamic.setText(datas.get(position).getDynamic() + "");
        int finish = datas.get(position).getDynamic_done() + datas.get(position).getExtra_done() + datas.get(position).getNormal_done();
        int unFinished = datas.get(position).getNormal() + datas.get(position).getDynamic();
        holderView.tv_total.setText(finish + "/" + unFinished);
        if(finish > unFinished){
            holderView.tv_status.setText("已完成");
            holderView.tv_status.setTextColor(Color.rgb(41, 132, 31));
        } else {
            holderView.tv_status.setText("未完成");
            holderView.tv_status.setTextColor(Color.rgb(255, 101, 101));
        }

        holderView.tv_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MyAssessDetailActivity.class);
                intent.putExtra("itemId", datas.get(position).getPre_id() + "");
                intent.putExtra("isSubmit", isSubmit + "");
                context.startActivity(intent);
            }
        });

        holderView.tv_enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, EnterWorkActivity.class);
                intent.putExtra("itemId", datas.get(position).getPre_id() + "");
                intent.putExtra("date", date);
                intent.putExtra("userId", BaseApplication.userId);
                context.startActivity(intent);
            }
        });

        return convertView;
    }

    public void setIsSubmit(int isSubmit) {
        this.isSubmit = isSubmit;
    }

    public void setDate(String date){
        this.date = date;
    }

    class CadreHolderView {

        @BindView(R.id.tv_work_task)
        TextView tv_work;
        @BindView(R.id.tv_normalcy_task)
        TextView tv_normalcy;
        @BindView(R.id.tv_dynamic_task)
        TextView tv_dynamic;
        @BindView(R.id.tv_total)
        TextView tv_total;
        @BindView(R.id.tv_status)
        TextView tv_status;
        @BindView(R.id.tv_check)
        TextView tv_check;
        @BindView(R.id.tv_enter_detailWork)
        TextView tv_enter;

        public CadreHolderView(View view) {
            ButterKnife.bind(this, view);
        }
    }

}
