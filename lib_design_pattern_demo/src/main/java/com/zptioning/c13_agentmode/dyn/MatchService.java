package com.zptioning.c13_agentmode.dyn;

import java.lang.reflect.Proxy;

public class MatchService {
    public MatchService() {

        PersonBean joe = getPersonInfo("joe", "male", "running");

        PersonBean OwnerProxy = getOwnerProxy(joe);

        System.out.println("Name is " + OwnerProxy.getName());
        System.out.println("Interests is " + OwnerProxy.getInterests());
        // 自身代理
        OwnerProxy.setInterests("Bowling");
        System.out.println("Interests are " + OwnerProxy.getInterests());
        OwnerProxy.setHotOrNotRating(50);
        System.out.println("Rating is " + OwnerProxy.getHotOrNotRating());
        OwnerProxy.setHotOrNotRating(40);
        System.out.println("Rating is " + OwnerProxy.getHotOrNotRating());

        System.out.println("********************************************************");
        // 非自身代理
        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("Name is " + nonOwnerProxy.getName());
        System.out.println("Interests are " + nonOwnerProxy.getInterests());
        nonOwnerProxy.setInterests("haha");
        System.out.println("Interests are " + nonOwnerProxy.getInterests());
        nonOwnerProxy.setHotOrNotRating(60);
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());

    }

    PersonBean getPersonInfo(String name, String gender, String interests) {
        PersonBean person = new PersonBeanImpl();
        person.setName(name);
        person.setGender(gender);
        person.setInterests(interests);
        return person;
    }

    PersonBean getOwnerProxy(PersonBean person) {
        ClassLoader classLoader = person.getClass().getClassLoader();
        Class<?>[] interfaces = person.getClass().getInterfaces();
        OwnerInvocationHandler ownerInvocationHandler = new OwnerInvocationHandler(person);
        return (PersonBean) Proxy.newProxyInstance(classLoader, interfaces, ownerInvocationHandler);
    }

    PersonBean getNonOwnerProxy(PersonBean person) {
        ClassLoader classLoader = person.getClass().getClassLoader();
        Class<?>[] interfaces = person.getClass().getInterfaces();
        NonOwnerInvocationHandler nonOwnerInvocationHandler = new NonOwnerInvocationHandler(person);
        return (PersonBean) Proxy.newProxyInstance(classLoader, interfaces, nonOwnerInvocationHandler);
    }
}
