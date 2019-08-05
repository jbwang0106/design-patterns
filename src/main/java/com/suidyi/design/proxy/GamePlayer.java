package com.suidyi.design.proxy;

/**
 * @author sdy
 */
public class GamePlayer implements IGamePlayer {

    private String name;

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String name, String password) {
        System.out.println("登录名为"+name+"的用户"+this.name+"登录成功！");
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + " 杀怪...");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name + " 又升了一级！");
    }
}
