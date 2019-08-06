package com.suidyi.design.agent;

import com.suidyi.design.agent.mediator.AbstractColleague;
import com.suidyi.design.agent.mediator.AbstractMediator;

/**
 * @author sdy
 */
public class Purchase extends AbstractColleague {

    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }

    public void buyIBMcomputer(int number) {
//        // 访问库存
//        Stock stock = new Stock();
//        // 访问销售
//        Sale sale = new Sale();
//        int saleStatus = sale.getSaleStatus();
//        if (saleStatus > 80) {
//            System.out.println("采购IBM电脑：" + number + "台");
//            stock.increase(number);
//        } else {
//            int buyNumber = number / 2;
//            System.out.println("采购IBM电脑:" + buyNumber + "台");
//            stock.increase(buyNumber);
//        }
        super.abstractMediator.execute("purchase.buy", number);
    }

    public void refuseBuyIBM() {
        System.out.println("不再采购IBM电脑...");
    }
}
