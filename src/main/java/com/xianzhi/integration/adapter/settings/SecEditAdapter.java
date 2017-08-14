package com.xianzhi.integration.adapter.settings;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.xianzhi.integration.R;
import com.xianzhi.integration.bean.SecEditBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by TJTJL on 2017/7/24.
 *
 */

public class SecEditAdapter extends BaseAdapter implements View.OnClickListener{

    private List<SecEditBean.PageBean.ListBean> data = new ArrayList<>();
    private Activity activity;
    private SecEditListener listener;
    int currentLevel = 0;

    public SecEditAdapter(Activity activity, SecEditListener listener) {
        this.activity = activity;
        this.listener = listener;
    }

    public void addData(List<SecEditBean.PageBean.ListBean> data, int currentLevel) {
        this.data.clear();
        this.data.addAll(data);
        this.currentLevel = currentLevel;
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
            view = View.inflate(activity, R.layout.item_securityedit, null);
            holder = new MyViewHolder(view);
            view.setTag(holder);
        } else {
            view = convertView;
            holder = (MyViewHolder) view.getTag();
        }
        if (currentLevel == 0) {
            holder.tvCategory.setText("风险类别: ");
        } else if (currentLevel == 1) {
            holder.tvCategory.setText("风险项点: ");
        } else if (currentLevel == 2) {
            holder.tvCategory.setText("工作标准: ");
        }
        holder.tvItem.setText(data.get(position).getName());

        holder.tvRename.setTag(R.id.tag_security_id,data.get(position).getId());
        holder.tvRename.setTag(R.id.tag_security_level,data.get(position).getLevel());
        holder.tvRename.setTag(R.id.tag_security_pid,data.get(position).getPid());
        holder.tvRename.setTag(R.id.tag_security_year,data.get(position).getYear());
        holder.tvRename.setTag(R.id.tag_security_name,data.get(position).getName());

        holder.tvDelete.setTag(R.id.tag_security_code,data.get(position).getCode());

        holder.tvRename.setOnClickListener(this);
        holder.tvDelete.setOnClickListener(this);

        return view;
    }

    class MyViewHolder {
        @BindView(R.id.tv_item)
        TextView tvItem;
        @BindView(R.id.tv_rename)
        TextView tvRename;
        @BindView(R.id.tv_delete)
        TextView tvDelete;
        @BindView(R.id.tv_category)
        TextView tvCategory;

        MyViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }

    /**
     * 自定义接口,用于捕捉条目内控件的点击事件
     */
    public interface SecEditListener{
        public void click(View v);
    }

    @Override
    public void onClick(View v) {
        listener.click(v);
    }
}
