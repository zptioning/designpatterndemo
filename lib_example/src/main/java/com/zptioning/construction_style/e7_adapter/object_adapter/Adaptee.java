package com.zptioning.construction_style.e7_adapter.object_adapter;

/**
 * @ClassName Adaptee
 * @Author zptioning
 * @Date 2019/8/31 14:36
 * @Version 1.0
 * @Description
 * 类适配器使用对象集成的方式，是静态的定义方式。
 * 对于类适配器，适配器可以冲定义Adaptee的部分行为。
 * 对于类适配器，仅仅引入了一个对象，并不需要额外的引用来简介得到适配者Adaptee
 * 对于类适配器，由于适配器直接集成了Adaptee，使得适配器Adapter不能和Adaptee的子类一起工作。（？？？）
 */
public class Adaptee {
    public void operation1() {
        System.out.println("我是 " + Adaptee.class.getSimpleName() + " 中的 operation1");
    }
}
