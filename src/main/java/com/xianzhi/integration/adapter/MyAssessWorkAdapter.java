package com.xianzhi.integration.adapter;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.xianzhi.integration.R;
import com.xianzhi.integration.base.MyBaseAdapter;
import com.xianzhi.integration.bean.MyAssessWorkBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @Administrator LiBo.
 * @Date 2017/7/19.
 * @Function
 */

public class MyAssessWorkAdapter extends MyBaseAdapter<MyAssessWorkBean.ListBean> {

    private OnItemIdClickListner listner;
    private List<String> itemIdKey;
    private List<String> itemNum;
    private int mTouchItemPosition = -1;
    private List<String> datasContents;
    private List<String> positions;

    public MyAssessWorkAdapter(OnItemIdClickListner listner, Context context, List<MyAssessWorkBean.ListBean> datas) {
        super(context, datas);
        this.listner = listner;
        itemIdKey = new ArrayList<>();
        itemNum = new ArrayList<>();
        datasContents = new ArrayList<>();
        positions = new ArrayList<>();
        for (int i = 0; i < datas.size(); i++) {
            datasContents.add(datas.get(i).getCount() + "");
        }
    }

    @Override
    public View getViewDatas(final int position, View convertView, ViewGroup parent) {
        final WorkHolderView holderView;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.content_myassess_work, null);
            holderView = new WorkHolderView(convertView);

            holderView.tv_num.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    mTouchItemPosition = (Integer) v.getTag();
                    return false;
                }
            });

            holderView.changeWatcher = new TextChangeWatcher();
            holderView.tv_num.addTextChangedListener(holderView.changeWatcher);
            holderView.updatePosition(position, holderView);

            convertView.setTag(holderView);
        } else {
            holderView = (WorkHolderView) convertView.getTag();

            holderView.updatePosition(position, holderView);
        }
        holderView.tv_dynamic.setText(datas.get(position).getDynamic_done() + "/" + datas.get(position).getDynamic());
        holderView.tv_normalcy.setText(datas.get(position).getNormal() + "");
        holderView.tv_dynamic.setText(datas.get(position).getDynamic() + "");
        int finish = datas.get(position).getDynamic_done() + datas.get(position).getExtra_done() + datas.get(position).getNormal_done();
        int unFinished = datas.get(position).getNormal() + datas.get(position).getDynamic();
        holderView.tv_total.setText(finish + "/" + unFinished);


        holderView.tv_num.setTag(position);
        if (mTouchItemPosition == position) {
            holderView.tv_num.requestFocus();
            holderView.tv_num.setSelection(holderView.tv_num.getText().length());
        } else {
            holderView.tv_num.clearFocus();
        }

        final int index = position;

        holderView.cb_select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (holderView.cb_select.isChecked()) {
                    datas.get(index).setSelect(true);
                    if (!itemIdKey.contains(datas.get(index).getPre_id() + "")) {
                        itemIdKey.add(datas.get(index).getPre_id() + "");
                        itemNum.add(holderView.tv_num.getText().toString());
                        positions.add(index + "");
                    }
                } else {
                    datas.get(index).setSelect(false);
                    itemIdKey.remove(datas.get(index).getPre_id() + "");
                    itemNum.remove(holderView.tv_num.getText().toString());
                    positions.remove(position + "");
                }
                listner.onItemIdClick(itemIdKey, itemNum, positions);
            }
        });

        if (datas.get(position).getCount() > 0) {
            holderView.tv_num.setText(datas.get(position).getCount() + "");
        } else {
            holderView.tv_num.setText("1");
        }
        return convertView;
    }

    class WorkHolderView {
        @BindView(R.id.tv_normalcy)
        TextView tv_normalcy;
        @BindView(R.id.tv_dynamic)
        TextView tv_dynamic;
        @BindView(R.id.tv_total)
        TextView tv_total;
        @BindView(R.id.et_num)
        EditText tv_num;
        @BindView(R.id.tv_title)
        TextView tv_title;
        @BindView(R.id.cb_work_tasks)
        CheckBox cb_select;

        private TextChangeWatcher changeWatcher;

        public WorkHolderView(View view) {
            ButterKnife.bind(this, view);
        }

        //动态更新TextWathcer的position
        public void updatePosition(int position, WorkHolderView holderView) {
            changeWatcher.updatePosition(position, holderView);
        }
    }

    public interface OnItemIdClickListner {
        void onItemIdClick(List<String> itemIdKey, List<String> itemNum, List<String> positions);

        void onNumClick(List<String> datasContents);
    }

    class TextChangeWatcher implements TextWatcher {

        private int mPosition;
        private WorkHolderView holderView;

        public void updatePosition(int position, WorkHolderView holderView) {
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
                datasContents.set(mPosition, s.toString());
                listner.onNumClick(datasContents);
                datas.get(mPosition).setCount(Integer.parseInt(s.toString()));
            }
        }
    }

}
