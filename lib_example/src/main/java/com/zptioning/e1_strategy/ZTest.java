package com.zptioning.e1_strategy;

import com.zptioning.e1_strategy.paytype.EPayType;

public class ZTest {
    public static void main(String[] args) {
//        AbsPayStrategy absPayStrategy = EPayType.ALI_PAY.getAbsPayStrategy();
//        absPayStrategy.pay(1000);
        test(EPayType.CASH_PAY);
    }

    public static String getString(EPayType ePayType) {
        return test(ePayType);
    }

    private static String test(EPayType ePayType) {
        StrategyContext strategyContext = new StrategyContext(ePayType);
        return strategyContext.pay(1000);
    }
}
