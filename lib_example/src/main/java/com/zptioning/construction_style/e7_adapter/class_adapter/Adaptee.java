package com.zptioning.construction_style.e7_adapter.class_adapter;

public class Adaptee {
    public void operation1() {
        System.out.println("我是 " + Adaptee.class.getSimpleName() + " 中的 operation1");
    }
}
