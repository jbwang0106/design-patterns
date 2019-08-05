package com.suidyi.design.proxy;

/**
 * @author sdy
 */
public interface IGamePlayer {

    /**
     * 登录
     * @param name
     * @param password
     */
    void login(String name, String password);

    /**
     * 杀怪
     */
    void killBoss();

    /**
     * 升级
     */
    void upgrade();
}
