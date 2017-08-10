package com.xianzhi.integration.adapter.settings;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.xianzhi.integration.R;
import com.xianzhi.integration.bean.CswBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by TJTJL on 2017/7/24.
 */

public class CswAdapter extends BaseAdapter implements View.OnClickListener{

    private static final String TAG = "SFragHD";
    private List<CswBean.PageBean.ListBean> data = new ArrayList<>();
    private Activity activity;
    private SelfWorkClickListener listener;

    public CswAdapter(Activity activity, SelfWorkClickListener listener) {
        this.activity = activity;
        this.listener = listener;
    }

    public void addData(List<CswBean.PageBean.ListBean> data) {
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
            view = View.inflate(activity, R.layout.item_cadre_selfwork, null);
            holder = new MyViewHolder(view);
            view.setTag(holder);
        } else {
            view = convertView;
            holder = (MyViewHolder) view.getTag();
        }

//        holder.tvOrder.setText(data.get(position).getRownum_() + "");
        holder.tvName.setText(data.get(position).getName() + "");
        holder.tvJobName.setText(data.get(position).getPosition_name() + "");
        holder.tvJobs.setText(data.get(position).getPost_name() + "");
        holder.tvDepartment.setText(data.get(position).getDept_name3() + data.get(position).getDept_name4() + "");

        //从设置界面跳转只需要一个参数ID
        holder.tvSet.setOnClickListener(this);
        holder.tvSet.setTag(R.id.tag_security_id,data.get(position).getId()+"");
        holder.tvSet.setTag(R.id.tag_cadre_post_name,data.get(position).getPost_name()+"");
        holder.tvSet.setTag(R.id.tag_cadre_position_name,data.get(position).getPosition_name()+"");
        holder.tvSet.setTag(R.id.tag_cadre_name,data.get(position).getName()+"");
        return view;
    }

    class MyViewHolder {
//        @BindView(R.id.tv_order)
//        TextView tvOrder;
        @BindView(R.id.tv_name)
        TextView tvName;
        @BindView(R.id.tv_jobName)
        TextView tvJobName;
        @BindView(R.id.tv_jobs)
        TextView tvJobs;
        @BindView(R.id.tv_department)
        TextView tvDepartment;
        @BindView(R.id.tv_set)
        TextView tvSet;

        MyViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
    /**
     * 设置回调接口
     */
    public interface SelfWorkClickListener{
        public void click(View v);
    }

    @Override
    public void onClick(View v) {
        listener.click(v);
    }


}
