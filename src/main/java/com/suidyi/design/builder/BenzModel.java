package com.suidyi.design.builder;

/**
 * @author sdy
 */
public class BenzModel extends CarModel {

    @Override
    protected void start() {
        System.out.println("奔驰车跑起来...");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰车停下来...");
    }

    @Override
    protected void alarm() {
        System.out.println("奔驰车按喇叭...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("奔驰车引擎响起来...");
    }
}
