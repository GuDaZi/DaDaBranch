package com.xianzhi.integration.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.xianzhi.integration.R;
import com.xianzhi.integration.activity.TableActivity;
import com.xianzhi.integration.base.MyBaseAdapter;
import com.xianzhi.integration.bean.AssessCollectBean;
import com.xianzhi.integration.view.RejectDialog;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @Administrator LiBo.
 * @Date 2017/8/1.
 * @Function
 */

public class AssessCollectAdapter extends MyBaseAdapter<AssessCollectBean.PageBean.ListBean> {

    private RejectDialog dialog;

    public AssessCollectAdapter(Context context, List<AssessCollectBean.PageBean.ListBean> datas) {
        super(context, datas);
        dialog = new RejectDialog(context, R.style.dialog);
    }

    @Override
    public View getViewDatas(final int position, View convertView, ViewGroup parent) {
        AssessCollectHolderView holderView;
        if(convertView == null){
            convertView = inflater.inflate(R.layout.content_assess_collect, null);
            holderView = new AssessCollectHolderView(convertView);
            convertView.setTag(holderView);
        } else {
            holderView = (AssessCollectHolderView) convertView.getTag();
        }

        holderView.tv_depart.setText(datas.get(position).getDept_full_name());
        holderView.tv_grate.setText(datas.get(position).getFinal_level_name());
        holderView.tv_jobName.setText(datas.get(position).getPosition_name());
        holderView.tv_name.setText(datas.get(position).getName());
        holderView.tv_post.setText(datas.get(position).getPost_name());
        holderView.tv_score.setText(datas.get(position).getFinal_score() + "");
        holderView.tv_systemGrate.setText(datas.get(position).getSystem_level_name());

        holderView.tv_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, TableActivity.class);
                intent.putExtra("itemId", datas.get(position).getApprove_id() + "");
                intent.putExtra("type", "4");
                context.startActivity(intent);
            }
        });

        holderView.tv_reject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.setItemId(datas.get(position).getApprove_id());
                dialog.show();
            }
        });

        return convertView;
    }

    class AssessCollectHolderView {

        @BindView(R.id.tv_collect_name)
        TextView tv_name;
        @BindView(R.id.tv_collect_jobName)
        TextView tv_jobName;
        @BindView(R.id.tv_collect_post)
        TextView tv_post;
        @BindView(R.id.tv_collect_depart)
        TextView tv_depart;
        @BindView(R.id.tv_collect_score)
        TextView tv_score;
        @BindView(R.id.tv_collect_systemGrate)
        TextView tv_systemGrate;
        @BindView(R.id.tv_collect_grate)
        TextView tv_grate;
        @BindView(R.id.tv_collect_check)
        TextView tv_check;
        @BindView(R.id.tv_collect_reject)
        TextView tv_reject;

        public AssessCollectHolderView(View view) {
            ButterKnife.bind(this, view);
        }
    }


}
