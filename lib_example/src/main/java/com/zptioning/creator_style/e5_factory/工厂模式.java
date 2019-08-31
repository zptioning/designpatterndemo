package com.zptioning.creator_style.e5_factory;

import com.zptioning.creator_style.e5_factory.absFactory.ConcreteRoleFactory;

public class 工厂模式 {
    public static void main(String[] args) {
        ConcreteRoleFactory concreteRoleFactory = new ConcreteRoleFactory();
        concreteRoleFactory.createShuRole();
        concreteRoleFactory.createWeiRole();
        concreteRoleFactory.createWuRole();
    }
}
