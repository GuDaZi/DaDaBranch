package com.xianzhi.integration.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

/**
 * @Administrator LiBo.
 * @Date 2017/7/19.
 * @Function
 */

public class MyAssessListView extends ListView {

    public MyAssessListView(Context context, AttributeSet attrs,int defStyle) {
        super(context, attrs, defStyle);
    }


    public MyAssessListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    public MyAssessListView(Context context) {
        super(context);
    }

    /**
     * 重写该方法，达到使ListView适应ScrollView的效果
     */
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }

}
