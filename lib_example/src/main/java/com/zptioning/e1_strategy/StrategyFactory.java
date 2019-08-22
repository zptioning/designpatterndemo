package com.zptioning.e1_strategy;

import com.zptioning.e1_strategy.paytype.AbsPayStrategy;
import com.zptioning.e1_strategy.paytype.EPayType;

/**
 * @ClassName StrategyFactory
 * @Author zptioning
 * @Date 2019/8/22 20:00
 * @Version 1.0
 * @Description 策略工厂类
 */
public class StrategyFactory {
    public static AbsPayStrategy getAbsPayStrategy(EPayType ePayType) {
        if (null == ePayType) {
            return null;
        }
        return ePayType.getAbsPayStrategy();
    }
}
