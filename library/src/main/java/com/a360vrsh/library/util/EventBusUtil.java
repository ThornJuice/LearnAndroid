package com.a360vrsh.library.util;

import com.a360vrsh.library.bean.EventBean;

import org.greenrobot.eventbus.EventBus;

/**
 * @author: wxj
 * @date: 2021/2/27
 * @description:
 */
public class EventBusUtil {
    public static void post(int id) {
        EventBus.getDefault().post(new EventBean(id));
    }

    public static void post(int id, String oneParam) {
        EventBus.getDefault().post(new EventBean(id, oneParam));
    }

    public static void post(int id, String oneParam, String twoParam) {
        EventBus.getDefault().post(new EventBean(id, oneParam, twoParam));
    }

    public static void post(int id, String oneParam, String twoParam, String threeParam) {
        EventBus.getDefault().post(new EventBean(id, oneParam, twoParam, threeParam));
    }

    public static void post(int id, String oneParam, String twoParam, String threeParam, String fourParam) {
        EventBus.getDefault().post(new EventBean(id, oneParam, twoParam, threeParam, fourParam));
    }
}
