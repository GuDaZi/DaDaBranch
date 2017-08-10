package com.xianzhi.integration.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @Administrator LiBo.
 * @Date 2017/7/24.
 * @Function
 */

public class EnterWorkSubmit2Bean implements Serializable {

    private List<EnterWorkSubmit1Bean> data;

    public EnterWorkSubmit2Bean() {
    }

    public EnterWorkSubmit2Bean(List<EnterWorkSubmit1Bean> data) {
        this.data = data;
    }

    public List<EnterWorkSubmit1Bean> getData() {
        return data;
    }

    public void setData(List<EnterWorkSubmit1Bean> data) {
        this.data = data;
    }
}
