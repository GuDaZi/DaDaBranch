package com.xianzhi.integration.base;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.xianzhi.integration.tools.util.ShareUtils;

import java.util.List;

/**
 * Created by 李博 on 2016/9/26.
 */
public abstract class MyBaseAdapter<T> extends BaseAdapter{

    protected Context context;
    protected List<T> datas;
    protected LayoutInflater inflater;
    protected ShareUtils shareUtils;

    public MyBaseAdapter(Context context, List<T> datas) {
        this.context = context;
        this.datas = datas;
        inflater = LayoutInflater.from(context);
        shareUtils = new ShareUtils(context);
    }

    @Override
    public int getCount() {
        return datas.size();
    }

    @Override
    public Object getItem(int position) {
        return datas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return getViewDatas(position, convertView, parent);
    }

    public abstract View getViewDatas(int position, View convertView, ViewGroup parent);

    /**
     * 下啦刷新方法
     */
    public void addDatas(List<T> datas){
        this.datas.clear();
        this.datas.addAll(datas);
        notifyDataSetChanged();
    }

    /**
     * 上拉加载方法
     */
    public void addAllDatas(List<T> datas){
        this.datas.addAll(datas);
        notifyDataSetChanged();
    }
}
