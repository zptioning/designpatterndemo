package com.zptioning.creator_style.e22_proto.simple_proto;

public class Monkey implements Cloneable {
    private String name;

    public Monkey(String name) {
        System.out.println("拉出一个："+name);
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("复制出一个垃圾");
        return (Monkey) super.clone();
    }
}
