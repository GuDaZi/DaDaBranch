package com.xianzhi.integration.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.xianzhi.integration.R;
import com.xianzhi.integration.base.MyBaseAdapter;
import com.xianzhi.integration.bean.RiskControllerBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @Administrator LiBo.
 * @Date 2017/8/2.
 * @Function
 */

public class RiskControllerAdapter extends MyBaseAdapter<RiskControllerBean.ListBean> {

    private String type;

    public RiskControllerAdapter(Context context, List<RiskControllerBean.ListBean> datas) {
        super(context, datas);
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public View getViewDatas(int position, View convertView, ViewGroup parent) {
        RiskControllerHolderView holderView;
        if(convertView == null){
            convertView = inflater.inflate(R.layout.content_riskcontroller, null);
            holderView = new RiskControllerHolderView(convertView);
            convertView.setTag(holderView);
        } else {
            holderView = (RiskControllerHolderView) convertView.getTag();
        }

        holderView.tv_risk.setText(datas.get(position).getName2());
        holderView.tv_riskType.setText(datas.get(position).getName1());
        if(type.equals("normal")) {
            holderView.tv_stanard.setText(datas.get(position).getName4() + "（" + datas.get(position).getNormal() + "）");
        } else {
            holderView.tv_stanard.setText(datas.get(position).getName4() + "（" + datas.get(position).getDynamic() + "）");
        }

        String userName = datas.get(position).getUser_name() + "-" + datas.get(position).getName3();
        String departName = datas.get(position).getDept_full_name();
        if(!TextUtils.isEmpty(departName)){
            String text[] = departName.split("-");
            holderView.tv_post.setText((userName + "（" + text[text.length - 1] + "）"));
        } else {
            holderView.tv_post.setText(userName);
        }

        return convertView;
    }

    class RiskControllerHolderView {
        @BindView(R.id.tv_controller_riskType)
        TextView tv_riskType;
        @BindView(R.id.tv_controller_risk)
        TextView tv_risk;
        @BindView(R.id.tv_controller_postManager)
        TextView tv_post;
        @BindView(R.id.tv_controller_workStandard)
        TextView tv_stanard;

        public RiskControllerHolderView(View view) {
            ButterKnife.bind(this, view);
        }
    }

}
