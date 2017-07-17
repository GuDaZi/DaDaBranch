package com.xianzhi.integration.model.base;

/**
 * Created by yaocui on 15/7/1.
 */
public interface Model<T> {
    void excuteParams(String[] params);
    void close(boolean mayInterrupt);
    void excuteParams(T params);
}
