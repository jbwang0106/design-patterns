package com.suidyi.design.proxy;

/**
 * @author sdy
 */
public class Client {

    public static void main(String[] args) {

//        IGamePlayer gamePlayer = new GamePlayer("张三");
//
//        System.out.println("开始时间 2019-08-01 10:00:00");
//        gamePlayer.login("张三", "123456");
//        for (int i = 0; i < 10; i++) {
//            gamePlayer.killBoss();
//            gamePlayer.killBoss();
//            gamePlayer.killBoss();
//            gamePlayer.upgrade();
//        }
//        System.out.println("结束时间 2019-08-03 09:00:00");

        IGamePlayer gamePlayer = new GamePlayer("张三");
        GamePlayerProxy playerProxy = new GamePlayerProxy(gamePlayer);

        System.out.println("开始时间 2019-08-01 10:00:00");
        playerProxy.login("张三", "123456");
        for (int i = 0; i < 10; i++) {
            playerProxy.killBoss();
            playerProxy.killBoss();
            playerProxy.killBoss();
            playerProxy.upgrade();
        }
        System.out.println("结束时间 2019-08-03 09:00:00");
    }
}
