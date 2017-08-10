package com.xianzhi.integration.adapter;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.xianzhi.integration.R;
import com.xianzhi.integration.activity.TableActivity;
import com.xianzhi.integration.base.MyBaseAdapter;
import com.xianzhi.integration.bean.CadreAssessBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @Administrator LiBo.
 * @Date 2017/7/21.
 * @Function
 */

public class CadreAssessAdapter extends MyBaseAdapter<CadreAssessBean.PageBean.ListBean> {

    public CadreAssessAdapter(Context context, List<CadreAssessBean.PageBean.ListBean> datas) {
        super(context, datas);
    }

    @Override
    public View getViewDatas(final int position, View convertView, ViewGroup parent) {
        CadreHolderView holderView;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.content_cadre, null);
            holderView = new CadreHolderView(convertView);
            convertView.setTag(holderView);
        } else {
            holderView = (CadreHolderView) convertView.getTag();
        }

        holderView.tv_assessment_approve.setText(datas.get(position).getComment2());
        holderView.tv_leader_approve.setText(datas.get(position).getComment1());
        holderView.tv_job.setText(datas.get(position).getPosition_name());
        holderView.tv_post.setText(datas.get(position).getPost_name());
        holderView.tv_name.setText(datas.get(position).getName());

        StringBuffer sb = new StringBuffer();
        if (!TextUtils.isEmpty(datas.get(position).getDept_name3()) && !datas.get(position).getDept_name3().equals("0")) {
            sb.append(datas.get(position).getDept_name3());
        }
        if (!TextUtils.isEmpty(datas.get(position).getDept_name4()) && !datas.get(position).getDept_name4().equals("0")) {
            sb.append("-" + datas.get(position).getDept_name4());
        }
        if (!TextUtils.isEmpty(datas.get(position).getDept_name5()) && !datas.get(position).getDept_name5().equals("0")) {
            sb.append("-" + datas.get(position).getDept_name5());
        }
        if (!TextUtils.isEmpty(datas.get(position).getDept_name6()) && !datas.get(position).getDept_name6().equals("0")) {
            sb.append("-" + datas.get(position).getDept_name6());
        }
        if (!TextUtils.isEmpty(datas.get(position).getDept_name7()) && !datas.get(position).getDept_name7().equals("0")) {
            sb.append("-" + datas.get(position).getDept_name7());
        }
        holderView.tv_depart.setText(sb.toString());

        holderView.tv_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, TableActivity.class);
                intent.putExtra("itemId", datas.get(position).getApprove_id() + "");
                intent.putExtra("type", "1");
                context.startActivity(intent);
            }
        });

        holderView.tv_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, TableActivity.class);
                intent.putExtra("itemId", datas.get(position).getApprove_id() + "");
                if(datas.get(position).getApprove_time1().length() > 2 && datas.get(position).getApprove_time2().length() > 2 && datas.get(position).getApprove_time3().length() > 2) {
                    intent.putExtra("type", "3");
                } else {
                    intent.putExtra("type", "2");
                }
                context.startActivity(intent);
            }
        });

        return convertView;
    }

    class CadreHolderView {
        @BindView(R.id.tv_cadre_name)
        TextView tv_name;
        @BindView(R.id.tv_cadre_jobName)
        TextView tv_job;
        @BindView(R.id.tv_cadre_post)
        TextView tv_post;
        @BindView(R.id.tv_cadre_depart)
        TextView tv_depart;
        @BindView(R.id.tv_leader_approval)
        TextView tv_leader_approve;
        @BindView(R.id.tv_assessment_approval)
        TextView tv_assessment_approve;
        @BindView(R.id.tv_cadre_check)
        TextView tv_check;
        @BindView(R.id.tv_cadre_edit)
        TextView tv_edit;

        public CadreHolderView(View view) {
            ButterKnife.bind(this, view);
        }
    }

}
