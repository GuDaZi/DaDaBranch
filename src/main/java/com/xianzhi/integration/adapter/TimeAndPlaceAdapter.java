package com.xianzhi.integration.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.xianzhi.integration.R;
import com.xianzhi.integration.base.MyBaseAdapter;
import com.xianzhi.integration.bean.TimeAndAddressLisstBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @Administrator LiBo.
 * @Date 2017/7/28.
 * @Function
 */

public class TimeAndPlaceAdapter extends MyBaseAdapter<TimeAndAddressLisstBean.TimeAndAddressBean> {

    public TimeAndPlaceAdapter(Context context, List<TimeAndAddressLisstBean.TimeAndAddressBean> datas) {
        super(context, datas);
    }

    @Override
    public View getViewDatas(int position, View convertView, ViewGroup parent) {
        TimeAndPlaceHolderView holderView;
        if(convertView == null){
            convertView = inflater.inflate(R.layout.content_time_place, null);
            holderView = new TimeAndPlaceHolderView(convertView);
            convertView.setTag(holderView);
        } else {
            holderView = (TimeAndPlaceHolderView) convertView.getTag();
        }

        holderView.tv_address.setText(datas.get(position).getPlace());
        holderView.tv_time.setText(datas.get(position).getTime());

        return convertView;
    }

    class TimeAndPlaceHolderView {

        @BindView(R.id.tv_time)
        TextView tv_time;
        @BindView(R.id.tv_address)
        TextView tv_address;

        public TimeAndPlaceHolderView(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
