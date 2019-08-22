package com.zptioning.e1_strategy.paytype;


/**
 * @ClassName EPayType
 * @Author zptioning
 * @Date 2019/8/22 11:51
 * @Version 1.0
 * @Description 支付类型枚举
 */
public enum EPayType {

    ALI_PAY(new AliPayStrategy()),
    WEIXIN_PAY(new WeiXinPayStrategy()),
    YINLIAN_PAY(new YinLianPayStrategy()),
    CASH_PAY(new CashPayStrategy());

    // 指定支付方式
    private AbsPayStrategy mAbsPayStrategy;

    EPayType(AbsPayStrategy absPayStrategy) {
        mAbsPayStrategy = absPayStrategy;
    }

    public AbsPayStrategy getAbsPayStrategy() {
        return this.mAbsPayStrategy;
    }
}
