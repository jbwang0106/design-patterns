package com.suidyi.design.agent;

import com.suidyi.design.agent.mediator.AbstractColleague;
import com.suidyi.design.agent.mediator.AbstractMediator;

import java.util.Random;

/**
 * @author sdy
 */
public class Sale extends AbstractColleague {

    public Sale(AbstractMediator mediator) {
        super(mediator);
    }

    public void sellIBMComputer(int number) {
//        Stock stock = new Stock();
//        Purchase purchase = new Purchase();
//        if (stock.getStockNumber() < number) {
//            purchase.buyIBMcomputer(number);
//        }
//        stock.decrease(number);
        super.abstractMediator.execute("sale.sell", number);
        System.out.println("销售IBM电脑" + number + "台");
    }

    public int getSaleStatus() {
        Random random = new Random(System.currentTimeMillis());
        int saleStatus = random.nextInt(100);
        System.out.println("IBM电脑的销售情况为：" + saleStatus);
        return saleStatus;
    }

    public void offSale() {
//        Stock stock = new Stock();
//        System.out.println("折价销售IBM电脑" + stock.getStockNumber() + "台");
        super.abstractMediator.execute("sale.offsell");
    }
}
