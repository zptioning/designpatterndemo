package com.zptioning.behaviour_style.e1_strategy.paytype;

/**
 * @ClassName AbsPayStrategy
 * @Author zptioning
 * @Date 2019/8/22 11:42
 * @Version 1.0
 * @Description 普通支付接口
 */
public abstract class AbsPayStrategy {

    public abstract String pay(Integer num);

}
