package com.zptioning.construction_style.e13_agent.dynamicAgent;

import java.lang.reflect.Proxy;

public class ZTest {
    public static void main(String[] args) {
        RealSubjec艺人 realSubjec艺人 = new RealSubjec艺人();
        ClassLoader classLoader = realSubjec艺人.getClass().getClassLoader();
        Class<?>[] interfaces = realSubjec艺人.getClass().getInterfaces();

        SubjectHandler经纪公司 subjectHandler经纪公司 = new SubjectHandler经纪公司(realSubjec艺人);

        ISubject娱乐圈的人 iSubject娱乐圈的人 = (ISubject娱乐圈的人) Proxy.newProxyInstance(classLoader, interfaces, subjectHandler经纪公司);
        iSubject娱乐圈的人.showBusiness();
    }
}
/*
经纪公司给你找对应的艺人-----
我是艺人--我来唱首歌！！！
经纪公司给你找对应的艺人 表演完了-----
*/
