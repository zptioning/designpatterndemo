package com.zptioning.construction_style.e3_decorator;

public class ZTest {
    public static void main(String[] args) {
        Component武林 郭大侠 = new Component武林高手("郭大侠");
        郭大侠.kongfu();
        System.out.println("-------------------");

        Component武林 秘籍Decorator = new Decorator九阴真经(郭大侠);
        秘籍Decorator.kongfu();
    }
}
