package com.xianzhi.integration.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.xianzhi.integration.R;
import com.xianzhi.integration.activity.SettingsActivity;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by TJTJL on 2017/7/14.
 */

public class MonthExamineAdapter extends RecyclerView.Adapter {

    private SettingsActivity activity;
    private ArrayList data;

    public MonthExamineAdapter(Context context, ArrayList data) {
        activity = (SettingsActivity) context;
        this.data = data;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(activity).inflate(R.layout.item_monthexamin, null);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tv_order)
        TextView tvOrder;
        @BindView(R.id.tv_name)
        TextView tvName;
        @BindView(R.id.tv_job)
        TextView tvJob;
        @BindView(R.id.tv_gangwei)
        TextView tvGangwei;
        @BindView(R.id.tv_bumen)
        TextView tvBumen;
        @BindView(R.id.tv_settings)
        TextView tvSettings;
        @BindView(R.id.item_recy)
        LinearLayout itemRecy;

        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

}
