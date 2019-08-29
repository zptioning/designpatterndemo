package com.zptioning.construction_style.e13_agent.staticAgent;

public class Proxy经纪人 implements ISubject娱乐圈的人 {

    private RealSubjec艺人 mRealSubjec艺人;

    public Proxy经纪人() {
        mRealSubjec艺人 = new RealSubjec艺人();
    }

    @Override
    public void showBusiness() {
        System.out.println("我是经纪人---我来收钱");
        mRealSubjec艺人.showBusiness();
    }
}
