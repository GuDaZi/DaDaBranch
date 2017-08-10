package com.xianzhi.integration.adapter;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.xianzhi.integration.R;
import com.xianzhi.integration.base.MyBaseAdapter;
import com.xianzhi.integration.bean.TableBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @Administrator LiBo.
 * @Date 2017/7/27.
 * @Function
 */

public class LoweHominidsAdapter extends MyBaseAdapter<TableBean.LrkListBean> {

    private int mTouchItemPosition = -1;
    private List<String> datasScore;
    private String type;
    private List<String> itemIds;
    private OnLowehomindsClickListener listener;
    private boolean isEnter;

    public LoweHominidsAdapter(boolean isEnter, OnLowehomindsClickListener listener, Context context, List<TableBean.LrkListBean> datas, String type) {
        super(context, datas);
        this.type = type;
        this.isEnter = isEnter;
        this.listener = listener;
        datasScore = new ArrayList<>();
        itemIds = new ArrayList<>();
        for (int i = 0; i < datas.size(); i ++) {
            datasScore.add(datas.get(i).getScore() + "");
        }
        for (int i = 0; i < datas.size(); i ++) {
            itemIds.add(datas.get(i).getId() + "");
        }
    }

    public LoweHominidsAdapter(boolean isEnter, Context context, List<TableBean.LrkListBean> datas, String type) {
        super(context, datas);
        this.type = type;
        this.isEnter = isEnter;
        datasScore = new ArrayList<>();
        itemIds = new ArrayList<>();
        for (int i = 0; i < datas.size(); i ++) {
            datasScore.add(datas.get(i).getScore() + "");
        }
        for (int i = 0; i < datas.size(); i ++) {
            itemIds.add(datas.get(i).getId() + "");
        }
    }

    @Override
    public View getViewDatas(int position, View convertView, ViewGroup parent) {
        LoweHominidsHolderView holderView;
        if(convertView == null){
            convertView = inflater.inflate(R.layout.content_enterint_content, null);
            holderView = new LoweHominidsHolderView(convertView);
            holderView.et_score.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    mTouchItemPosition = (Integer) v.getTag();
                    return false;
                }
            });

            holderView.changeWatcher = new TextChangeWatcher();
            if(type.equals("3")){
                holderView.et_score.addTextChangedListener(holderView.changeWatcher);
            }
            holderView.updatePosition(position, holderView);

            convertView.setTag(holderView);
        } else {
            holderView = (LoweHominidsHolderView) convertView.getTag();
            holderView.updatePosition(position, holderView);
        }

        holderView.et_score.setTag(position);
        if (mTouchItemPosition == position) {
            holderView.et_score.requestFocus();
            holderView.et_score.setSelection(holderView.et_score.getText().length());
        } else {
            holderView.et_score.clearFocus();
        }

        if(type.equals("3")){
            holderView.tv_content.setText(datas.get(position).getReason());
            holderView.et_score.setText(datas.get(position).getScore() + "");
            if(!isEnter){
                holderView.et_score.setFocusable(false);
                holderView.et_score.setFocusableInTouchMode(false);
            }
        } else {
            holderView.tv_content.setText(datas.get(position).getReason());
            holderView.et_score.setText("+" + datas.get(position).getScore() + "分");
            holderView.et_score.setFocusable(false);
            holderView.et_score.setFocusableInTouchMode(false);
        }

        return convertView;
    }

    class LoweHominidsHolderView {

        @BindView(R.id.tv_enteringContent)
        TextView tv_content;
        @BindView(R.id.tv_enteringScore)
        EditText et_score;

        private TextChangeWatcher changeWatcher;

        public LoweHominidsHolderView(View view) {
            ButterKnife.bind(this, view);
        }

        //动态更新TextWathcer的position
        public void updatePosition(int position, LoweHominidsHolderView holderView) {
            changeWatcher.updatePosition(position, holderView);
        }
    }

    class TextChangeWatcher implements TextWatcher {

        private int mPosition;
        private LoweHominidsHolderView holderView;

        public void updatePosition(int position, LoweHominidsHolderView holderView) {
            mPosition = position;
            this.holderView = holderView;
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            if (!TextUtils.isEmpty(s.toString())) {
                datasScore.set(mPosition, s.toString());
                listener.onLoweClick(datasScore, itemIds);
                datas.get(mPosition).setScore(Integer.parseInt(s.toString()));
            }
        }
    }

    public interface OnLowehomindsClickListener {
        void onLoweClick(List<String> datasScore, List<String> itemIds);
    }

}
