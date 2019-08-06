package com.suidyi.design.agent.mediator;

/**
 * @author sdy
 */
public abstract class AbstractColleague {

    protected AbstractMediator abstractMediator;

    public AbstractColleague(AbstractMediator mediator) {
        this.abstractMediator = mediator;
    }
}
