package com.suidyi.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author sdy
 */
public class DynamicClient {

    public static void main(String[] args) {
        IGamePlayer gamePlayer = new GamePlayer("张三");
        InvocationHandler gamePlayIH = new GamePlayIH(gamePlayer);

        System.out.println("开始时间： 2009-08-25 10:45");
        ClassLoader classLoader = gamePlayer.getClass().getClassLoader();
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(classLoader, new Class[]{IGamePlayer.class}, gamePlayIH);

        proxy.login("zhangsan", "123456");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间：2009-08-26 03:40");

    }
}
