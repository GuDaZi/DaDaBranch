package com.xianzhi.integration.view;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.StyleRes;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.xianzhi.integration.R;
import com.xianzhi.integration.view.wheelview.DateUtils;
import com.xianzhi.integration.view.wheelview.JudgeDate;
import com.xianzhi.integration.view.wheelview.ScreenInfo;
import com.xianzhi.integration.view.wheelview.WheelMain;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Administrator LiBo.
 * @Date 2017/7/17.
 * @Function
 */

public class TimeDialog extends Dialog {

    public TimeDialog(@NonNull Context context, Activity activity, OnTimeClickListener listener) {
        super(context);
        this.activity = activity;
        this.context = context;
        this.listener = listener;
    }

    public TimeDialog(@NonNull Context context, @StyleRes int theme, Activity activity, OnTimeClickListener listener) {
        super(context, theme);
        this.activity = activity;
        this.context = context;
        this.listener = listener;
    }

    private TextView tv_cancle;
    private TextView tv_ensure;
    private TextView tv_pop_title;
    private WheelMain wheelMainDate;
    private String beginTime;
    private DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private Activity activity;
    private String currentTime;
    private View view;
    private Context context;
    private String time;
    private OnTimeClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        view = LayoutInflater.from(context).inflate(R.layout.show_popup_window, null);
        setContentView(view);
        initView();
        setListener();

    }

    private void initView() {
        tv_cancle = (TextView) findViewById(R.id.tv_cancle);
        tv_ensure = (TextView) findViewById(R.id.tv_ensure);
        tv_pop_title = (TextView) findViewById(R.id.tv_pop_title);
        tv_pop_title.setText("选择起始时间");

        ScreenInfo screenInfoDate = new ScreenInfo(activity);
        wheelMainDate = new WheelMain(view, true);
        wheelMainDate.screenheight = screenInfoDate.getHeight();
        String time = DateUtils.currentMonth().toString();
        Calendar calendar = Calendar.getInstance();
        if (JudgeDate.isDate(time, "yyyy-MM-DD")) {
            try {
                calendar.setTime(new Date(time));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hours = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        wheelMainDate.initDateTimePicker(year, month, day, hours, minute);
        currentTime = wheelMainDate.getTime().toString();
    }

    private void setListener() {
        tv_cancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                dismiss();
            }
        });
        tv_ensure.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                beginTime = wheelMainDate.getTime().toString();
                try {
                    Date begin = dateFormat.parse(currentTime);
                    Date end = dateFormat.parse(beginTime);
                    time = DateUtils.formateStringH(beginTime, DateUtils.yyyyMMddHHmm);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                listener.onTimeClick(time);
                dismiss();
            }
        });
    }

    public interface OnTimeClickListener {
        void onTimeClick(String time);
    }

}
