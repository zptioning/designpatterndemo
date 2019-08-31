package com.zptioning.construction_style.e15_bridge;

public class 桥接模式 {
    public static void main(String[] args) {
        Implementor干死曹操 concreteImplementor关羽 = new ConcreteImplementor关羽();
        Implementor干死曹操 concreteImplementor张绣 = new ConcreteImplementor张绣();
        Implementor干死曹操 concreteImplementor马超 = new ConcreteImplementor马超();
        Abstraction曹操的敌人 刘备 = new RefinedAbstraction("刘备", concreteImplementor关羽);
        Abstraction曹操的敌人 张绣 = new RefinedAbstraction("张绣", concreteImplementor张绣);
        Abstraction曹操的敌人 马超 = new RefinedAbstraction("马超", concreteImplementor马超);

        刘备.operation();
        张绣.operation();
        马超.operation();
    }
}
