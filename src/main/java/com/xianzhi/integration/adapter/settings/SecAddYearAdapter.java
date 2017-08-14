package com.xianzhi.integration.adapter.settings;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.xianzhi.integration.R;
import com.xianzhi.integration.bean.CpcMultiBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by TJTJL on 2017/8/7.
 *
 */

public class SecAddYearAdapter extends BaseAdapter {
    private Context context;
    private List<String> data = new ArrayList<>();

    public SecAddYearAdapter(Context context) {
        this.context = context;
    }

    public void addData(List<String> data) {
        this.data.clear();
        this.data.addAll(data);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
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
            view = LayoutInflater.from(context).inflate(R.layout.item_cpc_postname, null, false);
            holder = new MyViewHolder(view);
            view.setTag(holder);
        } else {
            view = convertView;
            holder = (MyViewHolder) view.getTag();
        }
        holder.tvPostName.setText(data.get(position));
        return view;
    }

    class MyViewHolder {
        @BindView(R.id.tv_postName)
        TextView tvPostName;

        MyViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
