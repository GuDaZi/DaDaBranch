package com.xianzhi.integration.tools.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import java.util.List;
import java.util.Map;

/**
 * Created by 李博 on 2016/9/5.
 */
public class FastJsonUtil {
    public static <T> T getObject(String jsonString, Class<T> cls) {
        T t = null;

        t = JSON.parseObject(jsonString, cls);
        return t;
    }

    public static <T> List<T> getObjects(String jsonsString, Class<T> cls) {
        List<T> list = null;

        list = JSON.parseArray(jsonsString, cls);
        return list;
    }

    public static List<Map<String, Object>> getListMap(String jsonString) {
        List<Map<String, Object>> list = null;

        list = JSON.parseObject(jsonString, new TypeReference<List<Map<String, Object>>>() {
        });
        return list;
    }
}
