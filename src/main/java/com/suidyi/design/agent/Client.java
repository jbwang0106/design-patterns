package com.suidyi.design.agent;

import com.suidyi.design.agent.mediator.AbstractMediator;
import com.suidyi.design.agent.mediator.Mediator;

/**
 * @author sdy
 */
public class Client {

    public static void main(String[] args) {

//        System.out.println("-------------采购人员采购电脑-------------");
//        Purchase purchase = new Purchase();
//        purchase.buyIBMcomputer(100);
//        System.out.println("-------------销售人员销售电脑-------------");
//        Sale sale = new Sale();
//        sale.sellIBMComputer(1);
//        System.out.println("-------------库存管理人员清库处理-------------");
//        Stock stock = new Stock();
//        stock.clearStock();

        AbstractMediator mediator = new Mediator();
        System.out.println("-------------采购人员采购电脑-------------");
        Purchase purchase = new Purchase(mediator);
        purchase.buyIBMcomputer(100);
        System.out.println("-------------销售人员销售电脑-------------");
        Sale sale = new Sale(mediator);
        sale.sellIBMComputer(1);
        System.out.println("-------------库存管理人员清库处理-------------");
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }
}
