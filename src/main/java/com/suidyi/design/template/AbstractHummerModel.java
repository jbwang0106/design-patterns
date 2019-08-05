package com.suidyi.design.template;

/**
 * @author sdy
 * 抽象悍马模型
 */
public  abstract class AbstractHummerModel {

    /**
     * 启动
     */
    protected abstract void start();

    /**
     * 停止
     */
    protected abstract void stop();

    /**
     * 喇叭
     */
    protected abstract void alarm();

    /**
     * 引擎响动
     */
    protected abstract void engineBoom();

    /**
     * 奔跑
     */
    public final void run() {
        this.start();
        this.engineBoom();
        if (isAlarm()) {
            this.alarm();
        }
        this.stop();
    }

    protected boolean isAlarm() {
        return true;
    }
}
