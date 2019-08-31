package com.zptioning.construction_style.e18_flyweight;

public class Boss implements IGameRole {
    private String name;

    public Boss(String name) {
        this.name = name;
    }

    @Override
    public void showbaby() {
        System.out.println("---------：" + name);
    }
}
