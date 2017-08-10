package com.xianzhi.integration.adapter.settings;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.TextView;

import com.xianzhi.integration.R;
import com.xianzhi.integration.bean.CpcDynamicBean;
import com.xianzhi.integration.fragment.csettings.CpcDynamicFragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by TJTJL on 2017/7/24.
 */

public class CpcDynamicAdapter extends BaseAdapter {

    private static final String TAG = "SFragHD";
    private List<CpcDynamicBean.IpaListBean> data = new ArrayList<>();
    private Activity activity;
    private CpcDynamicFragment fragment;
    public HashMap<String, String> map = new HashMap<>();

    public CpcDynamicAdapter(Activity activity,CpcDynamicFragment fragment) {
        this.activity = activity;
        this.fragment = fragment;
    }

    public void addData(List<CpcDynamicBean.IpaListBean> data) {
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
            view = View.inflate(activity, R.layout.item_cpc_dynamic, null);
            holder = new MyViewHolder(view);
            view.setTag(holder);
        } else {
            view = convertView;
            holder = (MyViewHolder) view.getTag();
        }
        holder.tvName.setText(data.get(position).getName() + "");
        holder.tvJobName.setText(data.get(position).getPosition_name() + "");
        holder.tvJobs.setText(data.get(position).getPost_name() + "");
        holder.tvDepartment.setText(data.get(position).getDept_name3() + data.get(position).getDept_name4() + "");
        holder.edCount.setText("0");

        holder.edCount.setTag(position);

        /**
         * assessmentArray	[{"user_id":"219460","dynamic":"2","risk_control_content":"新任务"},{"user_id":"219157","dynamic":"","risk_control_content":"新任务"},{"user_id":"219416","dynamic":"","risk_control_content":"新任务"},{"user_id":"219248","dynamic":"","risk_control_content":"新任务"},{"user_id":"219256","dynamic":"5","risk_control_content":"新任务"},{"user_id":"219402","dynamic":"","risk_control_content":"新任务"},{"user_id":"219439","dynamic":"","risk_control_content":"新任务"},{"user_id":"219155","dynamic":"","risk_control_content":"新任务"},{"user_id":"219153","dynamic":"","risk_control_content":"新任务"},{"user_id":"189516","dynamic":"","risk_control_content":"新任务"},{"user_id":"219154","dynamic":"","risk_control_content":"新任务"},{"user_id":"219152","dynamic":"","risk_control_content":"新任务"},{"user_id":"267747","dynamic":"","risk_control_content":"新任务"},{"user_id":"219270","dynamic":"","risk_control_content":"新任务"},{"user_id":"244595","dynamic":"","risk_control_content":"新任务"},{"user_id":"244596","dynamic":"","risk_control_content":"新任务"},{"user_id":"244597","dynamic":"","risk_control_content":"新任务"}]
         month	2017-07
         */
        //为EditText设置焦点监听,这样就拿到了id和次数
        holder.edCount.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                int tempPosition = (int) v.getTag();
                if (hasFocus == true) {
                    Log.e(TAG, "true position: " + tempPosition);
                } else {
                    String temp = ((EditText) v).getText().toString().trim();
                    String id = data.get(tempPosition).getId() + "";
                    if ((temp != null) && (temp != "") && (temp != "0")) {
                        String mapTeamp = "{\"user_id\":\"" + id +
                                "\",\"dynamic\":\"" + temp +
                                "\",\"risk_control_content\":\"" + fragment.dynamicTask + "\"}";
                        map.put(id,mapTeamp);
                    } else {
                        if (map.containsKey(id)) {
                            map.remove(id);
                        }
                    }
                }
            }
        });
        return view;
    }

    class MyViewHolder {
        @BindView(R.id.tv_name)
        TextView tvName;
        @BindView(R.id.tv_jobName)
        TextView tvJobName;
        @BindView(R.id.tv_jobs)
        TextView tvJobs;
        @BindView(R.id.tv_department)
        TextView tvDepartment;
        @BindView(R.id.ed_count)
        EditText edCount;

        MyViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }

}
