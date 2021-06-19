package com.a360vrsh.library.util;

import com.a360vrsh.library.listener.TimerProcessor;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author: wxj
 * @date: 2021/1/15
 * @description: 定时任务
 */
public class TimerHelper {


    private TimerProcessor mProcessor;

    private Timer mTimer;

    private TimerTask mTimerTask;

    /**
     * 构造函数
     *
     * @param processor 定时处理器，由调用者定制实现
     */
    public TimerHelper(TimerProcessor processor) {
        mProcessor = processor;
    }


    /**
     * 启动定时器
     */
    public void startTimer(int delay) {
        mTimer = new Timer(true);
        mTimerTask = new TimerTask() {

            @Override
            public void run() {
                if (mProcessor != null) {
                    mProcessor.run();
                }
            }

        };

        mTimer.schedule(mTimerTask, delay);
    }

    /**
     * 启动定时器
     */
    public void startTimer(int delay, int period) {
        mTimer = new Timer(true);
        mTimerTask = new TimerTask() {

            @Override
            public void run() {
                if (mProcessor != null) {
                    mProcessor.run();
                }
            }

        };

        mTimer.schedule(mTimerTask, delay, period);
    }

    /**
     * 停止定时器
     */
    public void stopTimer() {
        if (mTimer != null) {
            mTimer.cancel();
            mTimer = null;
        }
        if (mTimerTask != null) {
            mTimerTask.cancel();
            mTimerTask = null;
        }
    }


}
