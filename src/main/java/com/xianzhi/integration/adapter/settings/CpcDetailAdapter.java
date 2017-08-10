package com.xianzhi.integration.adapter.settings;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.xianzhi.integration.R;
import com.xianzhi.integration.bean.CpcDetailBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by TJTJL on 2017/7/24.
 * 干部月度预考核表查看
 */

public class CpcDetailAdapter extends BaseAdapter {

    private static final String TAG = "SFragHD";
    private List<CpcDetailBean.ListBean> data = new ArrayList<>();
    private Activity activity;

    public CpcDetailAdapter(Activity activity) {
        this.activity = activity;
    }

    public void addData(List<CpcDetailBean.ListBean> data) {
        this.data.clear();
        this.data.addAll(data);
        Log.e(TAG, "addData: has run");
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
//            view = View.inflate(activity, R.layout.item_cpc_detail, null);
            view = LayoutInflater.from(activity).inflate(R.layout.item_cpc_detail,null,false);
            holder = new MyViewHolder(view);
            view.setTag(holder);
        } else {
            view = convertView;
            holder = (MyViewHolder) view.getTag();
        }

        Log.e(TAG, "getView: position" + (position+1));
        Log.e(TAG, "getView: Content" + data.get(position).getContent());
        Log.e(TAG, "getView: Normal" + data.get(position).getNormal());
        Log.e(TAG, "getView: Dynamic" + data.get(position).getDynamic());

//        holder.tvOrder.setText((position+1) + "");
        holder.tvTask.setText(data.get(position).getContent() + "");
        holder.tvUsualTask.setText(data.get(position).getNormal() + "");
        holder.tvDynamicTask.setText(data.get(position).getDynamic() + "");

        return view;
    }

    class MyViewHolder {
//        @BindView(R.id.tv_order)
//        TextView tvOrder;
        @BindView(R.id.tv_task)
        TextView tvTask;
        @BindView(R.id.tv_usualTask)
        TextView tvUsualTask;
        @BindView(R.id.tv_dynamicTask)
        TextView tvDynamicTask;

        MyViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }

}
