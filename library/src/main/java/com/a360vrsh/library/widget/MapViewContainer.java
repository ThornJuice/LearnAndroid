package com.a360vrsh.library.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

/**
 * @author: wxj
 * @date: 2020/12/10
 * @description:
 */

public class MapViewContainer extends FrameLayout {

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {

        if (ev.getAction() == MotionEvent.ACTION_DOWN) {
            getParent().requestDisallowInterceptTouchEvent(true);//请求父控件不拦截触摸事件
        } else if (ev.getAction() == MotionEvent.ACTION_UP) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }

        return super.dispatchTouchEvent(ev);
    }

    public MapViewContainer(Context context) {
        super(context);
    }

    public MapViewContainer(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MapViewContainer(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}