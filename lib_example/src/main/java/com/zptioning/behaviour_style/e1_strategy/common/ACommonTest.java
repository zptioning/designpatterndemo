package com.zptioning.behaviour_style.e1_strategy.common;

public class ACommonTest {
    public static void main(String[] args) {

        PayType type = PayType.ALI_PAY;

        doPay(type,1000);
    }

    private static void doPay(PayType type, int num) {
        switch (type) {
            case ALI_PAY:
                System.out.println("使用支付宝付款");
                break;
            case WEIXIN_PAY:
                System.out.println("使用微信付款");
                break;
            case YINLIAN_PAY:
                System.out.println("使用银联付款");
                break;
            case CASH_PAY:
                System.out.println("使用现金付款");
                break;
            default:
                throw new RuntimeException("不支持此支付类型");
        }
    }
}/*
使用支付宝付款
*/
