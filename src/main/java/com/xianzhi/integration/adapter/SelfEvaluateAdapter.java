package com.xianzhi.integration.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.xianzhi.integration.R;
import com.xianzhi.integration.base.MyBaseAdapter;
import com.xianzhi.integration.bean.SelfEvaluateBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @Administrator LiBo.
 * @Date 2017/7/20.
 * @Function
 */

public class SelfEvaluateAdapter extends MyBaseAdapter<SelfEvaluateBean.PageBean.ListBean> {

    private OnSelfEvaluateClickListener listener;

    public SelfEvaluateAdapter(OnSelfEvaluateClickListener listener, Context context, List<SelfEvaluateBean.PageBean.ListBean> datas) {
        super(context, datas);
        this.listener = listener;
    }

    @Override
    public View getViewDatas(final int position, View convertView, ViewGroup parent) {
        SelfEvaluateHolderView holderView;
        if(convertView == null){
            convertView = inflater.inflate(R.layout.content_selfevaluate, null);
            holderView = new SelfEvaluateHolderView(convertView);
            convertView.setTag(holderView);
        } else {
            holderView = (SelfEvaluateHolderView) convertView.getTag();
        }

        holderView.tv_num.setText(datas.get(position).getAdd_score() + "");
        holderView.tv_personal.setText(datas.get(position).getUser_name());
        holderView.tv_selfEvaluate.setText(datas.get(position).getContent());

        if(!TextUtils.isEmpty(datas.get(position).getContent())){
           holderView.lin_edit.setVisibility(View.GONE);
        } else {
            holderView.lin_edit.setVisibility(View.VISIBLE);
        }

        holderView.tv_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onEvaluateClick(datas.get(position).getId() + "");
            }
        });

        return convertView;
    }

    class SelfEvaluateHolderView {
        @BindView(R.id.tv_personal_quarters)
        TextView tv_personal;
        @BindView(R.id.tv_self_appraise)
        TextView tv_selfEvaluate;
        @BindView(R.id.tv_personal_num)
        TextView tv_num;
        @BindView(R.id.tv_personal_edit)
        TextView tv_edit;
        @BindView(R.id.lin_personal_edit)
        LinearLayout lin_edit;

        public SelfEvaluateHolderView(View view) {
            ButterKnife.bind(this, view);
        }
    }

    public interface OnSelfEvaluateClickListener {
        void onEvaluateClick(String id);
    }

}
