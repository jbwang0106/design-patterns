package com.suidyi.design.agent.mediator;

/**
 * @author sdy
 */
public class Mediator extends AbstractMediator {

    @Override
    public void execute(String str, Object... objects) {
        if ("purchase.buy".equalsIgnoreCase(str)) {
            this.buyComputer((Integer) objects[0]);
        } else if ("sale.sell".equalsIgnoreCase(str)) {
            this.sellComputer((Integer) objects[0]);
        } else if ("stock.clear".equalsIgnoreCase(str)) {
            this.clearStock();
        }
    }

    private void buyComputer(int number) {
        int saleStatus = super.sale.getSaleStatus();
        if (saleStatus > 0) {
            System.out.println("采购IBM电脑" + number + "台");
            stock.increase(number);
        } else {
            int buyNumber = number / 2;
            System.out.println("采购IBM电脑" + buyNumber + "台");
            stock.increase(buyNumber);
        }
    }

    private void sellComputer(int number) {
        if (stock.getStockNumber() < number) {
            purchase.buyIBMcomputer(number);
        }
        super.stock.decrease(number);
    }

    private void offSell() {
        System.out.println("折价销售IBM电脑" + stock.getStockNumber() + "台");
    }

    private void clearStock() {
        super.sale.offSale();
        super.purchase.refuseBuyIBM();
    }
}
