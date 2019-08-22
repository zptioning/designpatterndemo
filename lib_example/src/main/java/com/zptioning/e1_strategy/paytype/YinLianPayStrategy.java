package com.zptioning.e1_strategy.paytype;

public class YinLianPayStrategy extends AbsPayStrategy {
    @Override
    public String pay(Integer num) {
        String x = "使用银联支付： " + num + " 元。";
        System.out.println(x);
        return x;
    }
}
