package com.xianzhi.integration.adapter.settings;

import android.app.Activity;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.xianzhi.integration.R;
import com.xianzhi.integration.bean.SecurityRisksBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by TJTJL on 2017/7/24.
 */

public class SecAdapter extends BaseAdapter implements View.OnClickListener{

    private static final String TAG = "SFragHD";
    private List<SecurityRisksBean.PageBean.ListBean> data = new ArrayList<>();
    private Activity activity;
    private SecurityClickListerner listener;

    public SecAdapter(Activity activity, SecurityClickListerner listener) {
        this.activity = activity;
        this.listener = listener;
    }

    public void addData(List<SecurityRisksBean.PageBean.ListBean> data) {
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
            view = View.inflate(activity, R.layout.item_securityrisks, null);
            holder = new MyViewHolder(view);
            view.setTag(holder);
        } else {
            view = convertView;
            holder = (MyViewHolder) view.getTag();
        }
        holder.tvFormname.setText(data.get(position).getName()+"");
        holder.tvYear.setText(data.get(position).getYear()+"");
        if (data.get(position).getStatus() == 1) {
            holder.tvStatus.setText("待发布");
            holder.tvEdit.setOnClickListener(this);
        } else if (data.get(position).getStatus() == 2){
            holder.tvStatus.setText("已生成");
            holder.tvEdit.setVisibility(View.GONE);
        }
        holder.tvStatus.setTextColor(Color.GREEN);

        holder.tvStatus.setOnClickListener(this);
        holder.tvCheck.setOnClickListener(this);
        holder.tvRename.setOnClickListener(this);

        //通过给view设置tag来传递参数
        holder.tvCheck.setTag(R.id.tag_security_year,data.get(position).getYear()+"");
        holder.tvCheck.setTag(R.id.tag_security_id,data.get(position).getId()+"");

        holder.tvRename.setTag(R.id.tag_security_id,data.get(position).getId()+"");
        holder.tvRename.setTag(R.id.tag_security_level,data.get(position).getLevel()+"");
        holder.tvRename.setTag(R.id.tag_security_pid,data.get(position).getPid()+"");
        holder.tvRename.setTag(R.id.tag_security_status,data.get(position).getStatus()+"");

        //此处需要的pid实际上是id,code实际上是year
        holder.tvEdit.setTag(R.id.tag_security_pid,data.get(position).getId()+"");
        holder.tvEdit.setTag(R.id.tag_security_code,data.get(position).getYear()+"");

        return view;
    }

    class MyViewHolder {
        @BindView(R.id.tv_formname)
        TextView tvFormname;
        @BindView(R.id.tv_year)
        TextView tvYear;
        @BindView(R.id.tv_status)
        TextView tvStatus;
        @BindView(R.id.tv_check)
        TextView tvCheck;
        @BindView(R.id.tv_rename)
        TextView tvRename;
        @BindView(R.id.tv_edit)
        TextView tvEdit;

        MyViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }

    /**
     * 自定义接口,用于捕捉条目内控件的点击事件
     */
    public interface SecurityClickListerner{
        public void click(View v);
    }

    @Override
    public void onClick(View v) {
        listener.click(v);
    }

}
