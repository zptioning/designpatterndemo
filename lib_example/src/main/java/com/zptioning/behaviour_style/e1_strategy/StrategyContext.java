package com.zptioning.behaviour_style.e1_strategy;

import com.zptioning.behaviour_style.e1_strategy.paytype.AbsPayStrategy;
import com.zptioning.behaviour_style.e1_strategy.paytype.EPayType;

/**
 * @ClassName StrategyContext
 * @Author zptioning
 * @Date 2019/8/22 20:06
 * @Version 1.0
 * @Description
 * 对外提供策略
 */
public class StrategyContext {
    private AbsPayStrategy mAbsPayStrategy;

    /**
     * 根据传入的type 通过工厂类获取strategy 实例
     * @param ePayType
     */
    public StrategyContext(EPayType ePayType) {
        mAbsPayStrategy = StrategyFactory.getAbsPayStrategy(ePayType);
    }

    public String pay(Integer num) {
        return mAbsPayStrategy.pay(num);
    }
}
