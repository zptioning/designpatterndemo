package com.zptioning.e1_strategy.paytype;

public class WeiXinPayStrategy extends AbsPayStrategy {
    @Override
    public String pay(Integer num) {
        String x = "使用微信支付： " + num + " 元。";
        System.out.println(x);
        return x;
    }
}
