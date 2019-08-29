package com.zptioning.construction_style.e13_agent.dynamicAgent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SubjectHandler经纪公司 implements InvocationHandler {

    private Object mObject;

    public SubjectHandler经纪公司(Object object) {
        mObject = object;
    }

    /**
     * @param proxy  被代理的对象
     * @param method  被代理对象的方法
     * @param args  方法的参数
     * @return  方法返回值
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("经纪公司给你找对应的艺人-----");
        method.invoke(mObject, args);
        System.out.println("经纪公司给你找对应的艺人 表演完了-----");
        return null;
    }
}
