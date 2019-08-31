package com.zptioning.construction_style.e7_adapter.object_adapter;

/**
 * @ClassName Adapter
 * @Author zptioning
 * @Date 2019/8/31 14:32
 * @Version 1.0
 * @Description
 * Adapter只实现了target接口，没有继承Adaptee适配者类。Adapter类持有了Adaptee的引用，
 * 实现operation1（）的时候，使用adaptee的引用直接调用对应的方法，而不是自己去实现，通过了
 * 一个委托的形式把adapter类和adaptee类进行了关联。
 *
 * * 对象适配器使用对象组合的方式，是动态的组合方式。
 * * 对于对象适配器，一个适配器可以把多个不同的源适配到统一个目标。（类似adaptee）
 * * 对于对象适配器，要冲定义Adaptee的行为比较困难。
 * * 对于对象适配器，需要额外的引用来简介得到Adaptee。
 */
public class Adapter implements Target {

    private Adaptee mAdaptee;

    public Adapter(Adaptee adaptee) {
        mAdaptee = adaptee;
    }

    @Override
    public void operation1() {
        mAdaptee.operation1();
    }

    @Override
    public void operation2() {
        System.out.println("我是 " + Adapter.class.getSimpleName() + " 中的 operation2");

    }
}
