package com.suidyi.design.command;

/**
 * @author sdy
 */
public class DeletePageCommand extends Command {

    @Override
    public void execute() {
        super.pageGroup.find();
        super.pageGroup.delete();
        super.pageGroup.plan();
    }
}
