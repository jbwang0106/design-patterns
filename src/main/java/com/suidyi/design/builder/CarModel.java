package com.suidyi.design.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sdy
 */
public abstract class CarModel {

    private List<String> sequence = new ArrayList<>();

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
     * 引擎
     */
    protected abstract void engineBoom();

    public final void run() {
        for (String actionName : sequence) {
            if ("start".equals(actionName)) {
                this.start();
            } else if ("stop".equals(actionName)) {
                this.stop();
            } else if ("alarm".equals(actionName)) {
                this.alarm();
            } else if ("engine boom".equals(actionName)) {
                this.engineBoom();
            }
        }
    }

    public final void setSequence(List<String> sequence) {
        this.sequence = sequence;
    }
}
