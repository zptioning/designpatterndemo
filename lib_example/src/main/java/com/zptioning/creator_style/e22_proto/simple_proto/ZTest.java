package com.zptioning.creator_style.e22_proto.simple_proto;

public class ZTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Monkey wukong = new Monkey("孙悟空");
        Monkey clone = (Monkey) wukong.clone();
        System.out.println(wukong == clone? "true":"false");
        System.out.println(wukong.equals(clone)? "true":"false");
    }
}
