package com.xianzhi.integration.listener;

/**
 * @Administrator LiBo.
 * @Date 2017/7/18.
 * @Function 录入具体工作popupwindow回调接口
 */

public interface OnPopupClickListener {

    void onContentClick(int type, String content, int pid);

    void onDepartClick(int type, String depart, String content, int pid, String code);


}
