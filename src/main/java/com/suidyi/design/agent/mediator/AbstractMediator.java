package com.suidyi.design.agent.mediator;

import com.suidyi.design.agent.Purchase;
import com.suidyi.design.agent.Sale;
import com.suidyi.design.agent.Stock;

/**
 * @author sdy
 */
public abstract class AbstractMediator {

    protected Purchase purchase;

    protected Sale sale;

    protected Stock stock;

    public AbstractMediator() {
        purchase = new Purchase(this);
        sale = new Sale(this);
        stock = new Stock(this);
    }

    public abstract void execute(String str, Object...objects);
}
