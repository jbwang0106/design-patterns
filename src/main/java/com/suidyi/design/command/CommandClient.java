package com.suidyi.design.command;

/**
 * @author sdy
 */
public class CommandClient {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        System.out.println("客户要求增加一项需求....");
       // Command command = new AddRequirementCommand();
        Command command = new DeletePageCommand();
        invoker.setCommand(command);
        invoker.action();
    }
}
