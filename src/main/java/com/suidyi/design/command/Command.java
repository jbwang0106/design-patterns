package com.suidyi.design.command;

/**
 * @author sdy
 */
public abstract class Command {

    protected RequirementGroup requirementGroup = new RequirementGroup();
    protected PageGroup pageGroup = new PageGroup();
    protected CodeGroup codeGroup = new CodeGroup();

    public abstract void execute();
}
