package com.xianzhi.integration.bean;

import android.widget.TextView;

import java.io.Serializable;

/**
 * @Administrator LiBo.
 * @Date 2017/8/3.
 * @Function
 */

public class TextViewNumBean implements Serializable {


    private TextView tv_name;
    private int textId;

    public TextViewNumBean() {
    }

    public TextViewNumBean(TextView tv_name, int textId) {
        this.tv_name = tv_name;
        this.textId = textId;
    }

    public TextView getTv_name() {
        return tv_name;
    }

    public void setTv_name(TextView tv_name) {
        this.tv_name = tv_name;
    }

    public int getTextId() {
        return textId;
    }

    public void setTextId(int textId) {
        this.textId = textId;
    }
}
