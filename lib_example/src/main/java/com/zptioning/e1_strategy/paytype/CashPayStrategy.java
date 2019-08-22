package com.zptioning.e1_strategy.paytype;

public class CashPayStrategy extends AbsPayStrategy {
    @Override
    public String pay(Integer num) {
        String x = "使用现金支付： " + num + " 元。";
        System.out.println(x);
        return x;
    }
}
