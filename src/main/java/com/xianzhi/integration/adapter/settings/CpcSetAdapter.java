package com.xianzhi.integration.adapter.settings;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.xianzhi.integration.R;
import com.xianzhi.integration.bean.CpcSetBean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by TJTJL on 2017/7/24.
 * 设置干部月度预考核表
 */

public class CpcSetAdapter extends BaseAdapter {

    private static final String TAG = "SFragHD";

    //为data添加新的成员变量
    //新变量isNew,默认值为false,isNew为true,说明该条目被用户手动修改过
    //新变量isCheck,默认为false,判断该条数据是否是选中的(系统默认选中和用户手动选中)

    private List<CpcSetBean.ListBean> data = new ArrayList<>();
    private Activity activity;

    public HashMap<String, String> map = new HashMap<>();
    public HashMap<String, Integer> mapDynamic = new HashMap<>();
    public HashSet<String> set = new HashSet<>();
    //允许分配的动态任务数上限
    private int maxDynamic = 1000;

    public CpcSetAdapter(Activity activity) {
        this.activity = activity;
    }

    public void addData(List<CpcSetBean.ListBean> data) {
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
            view = LayoutInflater.from(activity).inflate(R.layout.item_cpc_set, null, false);
            holder = new MyViewHolder(view);
            view.setTag(holder);
        } else {
            view = convertView;
            holder = (MyViewHolder) view.getTag();
        }
        //如果是动态任务,则服务器返回条目的id值为null,因为id是int值,此时获得的id值自动取0
        //如果id值为0,此时将常态任务栏目隐藏
        if (data.get(position).getId() == 0) {
            holder.llNormal.setVisibility(View.GONE);
        } else {
            holder.edUsualTask.setTag(position);
            holder.edUsualTask.setText(data.get(position).getNormal() + "");
        }
        holder.edDynamicTask.setText(data.get(position).getDynamic() + "");
        holder.tvTask.setText(data.get(position).getContent() + "");

        //使view记录当前所处的position
        holder.cbBox.setTag(position);
        holder.edDynamicTask.setTag(position);


        //①监听CheackBox的状态变化
        holder.cbBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                int cbPosition = (int) buttonView.getTag();
                int id = data.get(cbPosition).getId();
                String ids = data.get(cbPosition).getId() + "";
                if (isChecked == true) {
                    //选中
                    if (id == 0) {
                        String tempDynamic = "{\"risk_control_id\":\"" + "" +
                                "\",\"dynamic\":\"" + data.get(cbPosition).getDynamic() +
                                "\",\"risk_control_content\":\"" + data.get(cbPosition).getContent() + "\"}";
                        ids = maxDynamic + "";
                        map.put(ids, tempDynamic);
                        mapDynamic.put(data.get(cbPosition).getContent(),maxDynamic);
                        maxDynamic = maxDynamic - 1;
                    } else {
                        String temp = "{\"risk_control_id\":\"" + id +
                                "\",\"normal\":\"" + (data.get(cbPosition).getNormal() + "") +
                                "\",\"dynamic\":\"" + (data.get(cbPosition).getDynamic() + "") + "\"}";
                        map.put(ids, temp);
                    }
                    if ((data.get(cbPosition).getPre_id()) != null) {
                        set.add((data.get(cbPosition).getPre_id() + ""));
                    }
                    data.get(cbPosition).setCheck(true);
                } else {
                    //取消选中
                    if (id == 0) {
                        int numDynamic = mapDynamic.get(data.get(cbPosition).getContent());
                        map.remove(numDynamic);
                    } else {
                        map.remove(ids);
                    }
                    if ((data.get(cbPosition).getPre_id()) != null) {
                        set.remove((data.get(cbPosition).getPre_id() + ""));
                    }
                    //将默认选中的框置为false
                    data.get(cbPosition).setCheck(false);
                }
            }
        });

        //②在滑动条目时,设置item是否选中
        if ((data.get(position).getNormal() > 0) || (data.get(position).getDynamic() > 0)) {
            //有数据,且不是用户手动修改的,设定选中,用来在初始绘制界面时进行有效判断
            if (!data.get(position).isNew()) {
                holder.cbBox.setChecked(true);
            }
            //有数据,且记录checked状态的,设定选中,在二次绘制时进行有效判断
            if (data.get(position).isCheck()) {
                holder.cbBox.setChecked(true);
            } else {
                holder.cbBox.setChecked(false);
            }
        } else {
            if (data.get(position).isCheck()) {
                holder.cbBox.setChecked(true);
            } else {
                holder.cbBox.setChecked(false);
            }
        }

        //③监听EditeText的输入
        holder.edUsualTask.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                int tempPosition = (int) v.getTag();
                if (hasFocus == true) {
                    Log.e(TAG, "true position: " + tempPosition);
                } else {
                    String temp = ((EditText) v).getText().toString().trim();
                    Log.e(TAG, "false position: " + tempPosition);
                    Log.e(TAG, "onFocusChange: " + temp);
                    if ((temp != null) && (temp != "")) {
                        data.get(tempPosition).setNormal(Integer.parseInt(temp));
                    } else {
                        data.get(tempPosition).setNormal(0);
                    }
                }
                data.get(tempPosition).setNew(true);
            }
        });
        holder.edDynamicTask.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                int tempPosition = (int) v.getTag();
                if (hasFocus == true) {
                    Log.e(TAG, "true position: " + tempPosition);
                } else {
                    String temp = ((EditText) v).getText().toString().trim();
                    Log.e(TAG, "false position: " + tempPosition);
                    Log.e(TAG, "onFocusChange: " + temp);
                    if ((temp != null) && (temp != "")) {
                        data.get(tempPosition).setDynamic(Integer.parseInt(temp));
                    } else {
                        data.get(tempPosition).setDynamic(0);
                    }
                }
                data.get(tempPosition).setNew(true);
            }
        });

        return view;
    }

    public static class MyViewHolder {
        @BindView(R.id.tv_task)
        TextView tvTask;
        @BindView(R.id.ed_usualTask)
        EditText edUsualTask;
        @BindView(R.id.ed_dynamicTask)
        EditText edDynamicTask;
        @BindView(R.id.cb_box)
        CheckBox cbBox;
        @BindView(R.id.ll_normal)
        LinearLayout llNormal;

        MyViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }

}

