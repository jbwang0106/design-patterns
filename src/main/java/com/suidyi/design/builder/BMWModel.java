package com.suidyi.design.builder;

/**
 * @author sdy
 */
public class BMWModel extends CarModel {

    @Override
    protected void start() {
        System.out.println("宝马车跑起来...");
    }

    @Override
    protected void stop() {
        System.out.println("宝马车停下来...");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马车按喇叭...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马车引擎响起来...");
    }
}
