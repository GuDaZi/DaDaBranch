package com.xianzhi.integration.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.xianzhi.integration.R;
import com.xianzhi.integration.base.MyBaseAdapter;
import com.xianzhi.integration.bean.AssessScoreBean;
import com.xianzhi.integration.bean.TextViewNumBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @Administrator LiBo.
 * @Date 2017/8/2.
 * @Function
 */

public class AssessScoreAdapter extends MyBaseAdapter<AssessScoreBean.PageBean.ListBean> {

    public AssessScoreAdapter(Context context, List<AssessScoreBean.PageBean.ListBean> datas) {
        super(context, datas);
    }

    @Override
    public View getViewDatas(int position, View convertView, ViewGroup parent) {
        final AssessScoreHolderView holderView;
        if(convertView == null){
            convertView = inflater.inflate(R.layout.content_assessscore, null);
            holderView = new AssessScoreHolderView(convertView);
            convertView.setTag(holderView);
        } else {
            holderView = (AssessScoreHolderView) convertView.getTag();
        }

        holderView.tv_name.setText(datas.get(position).getName());
        holderView.tv_jobName.setText(datas.get(position).getPosition_name());
        holderView.tv_depart.setText(datas.get(position).getDept_full_name());
        List<TextViewNumBean> textDatas1 = new ArrayList<>();
        textDatas1.add(new TextViewNumBean(holderView.general_noDuty, datas.get(position).getListBean().get(0).getId()));
        textDatas1.add(new TextViewNumBean(holderView.serious_noDuty, datas.get(position).getListBean().get(1).getId()));
        textDatas1.add(new TextViewNumBean(holderView.getOut_work, datas.get(position).getListBean().get(2).getId()));
        textDatas1.add(new TextViewNumBean(holderView.moreSerious_assess, datas.get(position).getListBean().get(3).getId()));
        textDatas1.add(new TextViewNumBean(holderView.inLaidOff, datas.get(position).getListBean().get(4).getId()));
        textDatas1.add(new TextViewNumBean(holderView.criticism_education, datas.get(position).getListBean().get(5).getId()));
        textDatas1.add(new TextViewNumBean(holderView.general_assess, datas.get(position).getListBean().get(6).getId()));
        textDatas1.add(new TextViewNumBean(holderView.serious_assess, datas.get(position).getListBean().get(7).getId()));

        List<TextViewNumBean> textDatas2 = new ArrayList<>();
        textDatas2.add(new TextViewNumBean(holderView.beGeneral_noDuty, datas.get(position).getListBean().get(0).getId()));
        textDatas2.add(new TextViewNumBean(holderView.beSerious_noDuty, datas.get(position).getListBean().get(1).getId()));
        textDatas2.add(new TextViewNumBean(holderView.beGetOut_work, datas.get(position).getListBean().get(2).getId()));
        textDatas2.add(new TextViewNumBean(holderView.beMoreSerious_assess, datas.get(position).getListBean().get(3).getId()));
        textDatas2.add(new TextViewNumBean(holderView.beInLaidOff, datas.get(position).getListBean().get(4).getId()));
        textDatas2.add(new TextViewNumBean(holderView.beCriticism_education, datas.get(position).getListBean().get(5).getId()));
        textDatas2.add(new TextViewNumBean(holderView.beGeneral_assess, datas.get(position).getListBean().get(6).getId()));
        textDatas2.add(new TextViewNumBean(holderView.beSerious_assess, datas.get(position).getListBean().get(7).getId()));

        for (int i = 0; i < textDatas1.size(); i++) {
            for (int j = 0; j < datas.get(position).getInfo().getInfo().size(); j++) {
                if(textDatas1.get(i).getTextId() == datas.get(position).getInfo().getInfo().get(j).getPro_id()){
                    textDatas1.get(i).getTv_name().setText(datas.get(position).getInfo().getInfo().get(j).getScore() + "/" + datas.get(position).getInfo().getInfo().get(j).getNum());
                }
            }
        }

        for (int i = 0; i < textDatas2.size(); i++) {
            for (int j = 0; j < datas.get(position).getInfo().getInfo1().size(); j++) {
                if(textDatas2.get(i).getTextId() == datas.get(position).getInfo().getInfo1().get(j).getPro_id()){
                    textDatas2.get(i).getTv_name().setText(datas.get(position).getInfo().getInfo1().get(j).getScore() + "/" + datas.get(position).getInfo().getInfo1().get(j).getNum());
                }
            }
        }

        holderView.totalAdd.setText(datas.get(position).getProblem_real_add_score());
        holderView.totalMinus.setText("-" + datas.get(position).getProblem_real_minus_score());

        holderView.startGrade.setText(datas.get(position).getStarting_score());
        holderView.quantitative_tasks.setText(datas.get(position).getRisk_con_score());
        holderView.find_riskProblem.setText(datas.get(position).getDanger_find_add_score());
        holderView.self_realism.setText(datas.get(position).getSelf_realistic());
        holderView.materialTime.setText(datas.get(position).getKey_time());
        holderView.Security_Commission_work.setText(datas.get(position).getAwh());
        holderView.leader.setText(datas.get(position).getSjld_score());
        holderView.lowe_hominids.setText(datas.get(position).getLrk_score());
        holderView.total_add_minus.setText(datas.get(position).getAdd_min_score());
        holderView.assess_score.setText(datas.get(position).getFinal_score());
        holderView.assess_class.setText(datas.get(position).getFinal_level_name());

        holderView.tv_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(holderView.lin_content.getVisibility() == View.VISIBLE){
                    holderView.lin_content.setVisibility(View.GONE);
                    holderView.tv_check.setText("查看");
                } else {
                    holderView.lin_content.setVisibility(View.VISIBLE);
                    holderView.tv_check.setText("隐藏");
                }
            }
        });

        return convertView;
    }

    class AssessScoreHolderView {

        @BindView(R.id.lin_title)
        LinearLayout lin_title;
        @BindView(R.id.lin_content)
        LinearLayout lin_content;

        @BindView(R.id.tv_check)
        TextView tv_check;

        @BindView(R.id.tv_name)
        TextView tv_name;
        @BindView(R.id.tv_post)
        TextView tv_depart;
        @BindView(R.id.tv_depart)
        TextView tv_jobName;

        @BindView(R.id.general_noDuty)
        TextView general_noDuty;
        @BindView(R.id.serious_noDuty)
        TextView serious_noDuty;
        @BindView(R.id.getOut_work)
        TextView getOut_work;
        @BindView(R.id.moreSerious_assess)
        TextView moreSerious_assess;
        @BindView(R.id.inLaidOff)
        TextView inLaidOff;
        @BindView(R.id.criticism_education)
        TextView criticism_education;
        @BindView(R.id.general_assess)
        TextView general_assess;
        @BindView(R.id.serious_assess)
        TextView serious_assess;
        @BindView(R.id.totalAdd)
        TextView totalAdd;

        @BindView(R.id.beGeneral_noDuty)
        TextView beGeneral_noDuty;
        @BindView(R.id.beSerious_noDuty)
        TextView beSerious_noDuty;
        @BindView(R.id.beGetOut_work)
        TextView beGetOut_work;
        @BindView(R.id.beMoreSerious_assess)
        TextView beMoreSerious_assess;
        @BindView(R.id.beInLaidOff)
        TextView beInLaidOff;
        @BindView(R.id.beCriticism_education)
        TextView beCriticism_education;
        @BindView(R.id.beGeneral_assess)
        TextView beGeneral_assess;
        @BindView(R.id.beSerious_assess)
        TextView beSerious_assess;
        @BindView(R.id.totalMinus)
        TextView totalMinus;

        @BindView(R.id.startGrade)
        TextView startGrade;
        @BindView(R.id.quantitative_tasks)
        TextView quantitative_tasks;
        @BindView(R.id.find_riskProblem)
        TextView find_riskProblem;
        @BindView(R.id.self_realism)
        TextView self_realism;
        @BindView(R.id.materialTime)
        TextView materialTime;
        @BindView(R.id.Security_Commission_work)
        TextView Security_Commission_work;
        @BindView(R.id.leader)
        TextView leader;
        @BindView(R.id.lowe_hominids)
        TextView lowe_hominids;
        @BindView(R.id.total_add_minus)
        TextView total_add_minus;
        @BindView(R.id.assess_score)
        TextView assess_score;
        @BindView(R.id.assess_class)
        TextView assess_class;

        public AssessScoreHolderView(View view) {
            ButterKnife.bind(this, view);
        }
    }

}
