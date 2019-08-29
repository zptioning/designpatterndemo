package com.zptioning.construction_style.e3_decorator;

// 抽象装饰角色
public class Decorator秘籍 implements Component武林 {

    private Component武林 m武林高手;

    public Component武林 getM武林() {
        return m武林高手;
    }

    public Decorator秘籍(Component武林 m武林高手) {
        this.m武林高手 = m武林高手;
    }

    @Override
    public void kongfu() {
        m武林高手.kongfu();
    }
}