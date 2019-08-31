package com.zptioning.construction_style.e7_adapter.class_adapter;

public class Adapter extends Adaptee implements Target {
    @Override
    public void operation2() {
        System.out.println("我是 " + Adapter.class.getSimpleName() + " 中的 operation2");
    }

//    @Override
//    public void operation1() {
//        super.operation1();
//        System.out.println("我是 " + Adapter.class.getSimpleName() + " 中的 operation1");
//    }
}
