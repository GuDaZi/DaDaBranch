package com.xianzhi.integration.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.xianzhi.integration.R;
import com.xianzhi.integration.base.MyBaseAdapter;
import com.xianzhi.integration.bean.TimeAndAddressLisstBean;
import com.xianzhi.integration.view.MyAssessListView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @Administrator LiBo.
 * @Date 2017/7/27.
 * @Function
 */

public class AssessCheckDetailAdapter extends MyBaseAdapter<TimeAndAddressLisstBean> {

    private TimeAndPlaceAdapter adapter;

    public AssessCheckDetailAdapter(Context context, List<TimeAndAddressLisstBean> datas) {
        super(context, datas);
    }

    @Override
    public View getViewDatas(int position, View convertView, ViewGroup parent) {
        CheckDetailHolderView holderView;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.content_assess_checkwork, null);
            holderView = new CheckDetailHolderView(convertView);
            convertView.setTag(holderView);
        } else {
            holderView = (CheckDetailHolderView) convertView.getTag();
        }

        holderView.tv_num.setText((datas.get(position).getNumber() + 1)+ "");

        String workDetail = "";
        for (int i = 0; i < datas.get(position).getData().size(); i++) {
            if (i == datas.get(position).getData().size() - 1) {
                workDetail += datas.get(position).getData().get(i).getWorkDetail();
            } else {
                workDetail += datas.get(position).getData().get(i).getWorkDetail() + "\n";
            }
        }
        holderView.tv_workDetail.setText(workDetail);
        holderView.tv_work.setText(datas.get(position).getWork());

        int finish = 0;
        int allFinish = 0;
        int noFinish = 0;

        if (datas.get(position).getData() != null && datas.get(position).getData().size() > 0) {
            finish = datas.get(position).getData().get(0).getDynamic_done() + datas.get(position).getData().get(0).getNormal_done();
            allFinish = datas.get(position).getData().get(0).getDynamic_done() + datas.get(position).getData().get(0).getNormal_done() + datas.get(position).getData().get(0).getExtra_done();
            noFinish = datas.get(position).getData().get(0).getDynamic() + datas.get(position).getData().get(0).getNormal();
        }

        if (noFinish > finish) {
            holderView.tv_isFinish_status.setText("未完成");
            holderView.tv_isFinish.setText("(" + allFinish + "/" + noFinish + ")");
            holderView.tv_isFinish_status.setTextColor(Color.RED);
            holderView.tv_isFinish.setTextColor(Color.RED);
        } else {
            holderView.tv_isFinish_status.setText("已完成");
            holderView.tv_isFinish.setText("(" + allFinish + "/" + noFinish + ")");
            holderView.tv_isFinish_status.setTextColor(Color.rgb(51, 180, 69));
            holderView.tv_isFinish.setTextColor(Color.rgb(51, 180, 69));
        }

        adapter = new TimeAndPlaceAdapter(context, datas.get(position).getData());
        holderView.list_time.setAdapter(adapter);

        return convertView;
    }

    class CheckDetailHolderView {

        @BindView(R.id.tv_num)
        TextView tv_num;
        @BindView(R.id.tv_isFinish)
        TextView tv_isFinish;
        @BindView(R.id.tv_work)
        TextView tv_work;
        @BindView(R.id.tv_workDetail)
        TextView tv_workDetail;
        @BindView(R.id.tv_isFinish_status)
        TextView tv_isFinish_status;
        @BindView(R.id.list_time)
        MyAssessListView list_time;

        public CheckDetailHolderView(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
