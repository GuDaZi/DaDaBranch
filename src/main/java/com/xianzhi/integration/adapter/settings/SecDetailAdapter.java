package com.xianzhi.integration.adapter.settings;

import android.app.Activity;
import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.xianzhi.integration.R;
import com.xianzhi.integration.bean.SecurityDetailBean;
import com.xianzhi.integration.bean.SecurityRisksBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by TJTJL on 2017/7/24.
 */

public class SecDetailAdapter extends BaseAdapter {

    private static final String TAG = "SFragHD";
    private List<SecurityDetailBean.ListBean> data = new ArrayList<>();
    private Activity activity;

    public SecDetailAdapter(Activity activity) {
        this.activity = activity;
    }

    public void addData(List<SecurityDetailBean.ListBean> data) {
        this.data.clear();
        this.data.addAll(data);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        Log.e(TAG, "data.size: " + data.size());
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = null;
        MyViewHolder holder = null;
        if (convertView == null) {
            view = View.inflate(activity, R.layout.item_securitydetail, null);
            holder = new MyViewHolder(view);
            view.setTag(holder);
        } else {
            view = convertView;
            holder = (MyViewHolder) view.getTag();
        }

        holder.tvRisksCategory.setText(data.get(position).getName1()+"");
        holder.tvRisksPoint.setText(data.get(position).getName2()+"");
        holder.tvWorkStandard.setText(data.get(position).getName4()+"");
        return view;
    }

    class MyViewHolder {
        @BindView(R.id.tv_risksCategory)
        TextView tvRisksCategory;
        @BindView(R.id.tv_risksPoint)
        TextView tvRisksPoint;
        @BindView(R.id.tv_workStandard)
        TextView tvWorkStandard;

        MyViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }

}
