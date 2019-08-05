package com.suidyi.design.prototype;

/**
 * @author jbwang0106
 */
public class ClientA {

    public static void main(String[] args) {
        Thing thing = new Thing();
        thing.setValue("张三");

        Thing cloneThing = thing.clone();
        cloneThing.setValue("李四");
        System.out.println(thing.getValue());
    }
}
