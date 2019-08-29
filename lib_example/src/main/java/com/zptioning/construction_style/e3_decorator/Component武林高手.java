package com.zptioning.construction_style.e3_decorator;

// 具体构建角色
public class Component武林高手 implements Component武林 {

    private String name;

    public String getName() {
        return name;
    }

    public Component武林高手(String name) {
        this.name = name;
        System.out.println("创建具体构建角色：" + name);
    }

    @Override
    public void kongfu() {
        System.out.println("看我 " + name + " 飞檐走壁");
    }
}
