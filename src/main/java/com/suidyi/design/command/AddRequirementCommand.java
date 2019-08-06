package com.suidyi.design.command;

/**
 * @author sdy
 */
public class AddRequirementCommand extends Command {

    @Override
    public void execute() {
        super.requirementGroup.find();
        super.requirementGroup.add();
        super.requirementGroup.plan();
    }
}
