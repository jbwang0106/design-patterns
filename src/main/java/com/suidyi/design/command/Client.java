package com.suidyi.design.command;

/**
 * @author sdy
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("------客户要求增加一项需求------");
        Group group = new RequirementGroup();
        group.find();
        group.add();
        group.plan();

        //首先客户找到美工组说，过来谈页面，并修改
        System.out.println("----------客户要求删除一个页面--------------");
        Group pg = new PageGroup();
        //找到需求组
        pg.find();
        //删除一项需求
        pg.delete();
        //要求变更计划
        pg.plan();
    }
}
