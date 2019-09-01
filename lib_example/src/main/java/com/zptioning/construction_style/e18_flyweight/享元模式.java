package com.zptioning.construction_style.e18_flyweight;

public class 享元模式 {
    public static void main(String[] args) {

        final String[] names = {"李典","夏侯惇","许褚","美美","美呀","美玲","曹仁","淳于琼","张辽","徐晃","吕布"};

        for (int i = 0; i < 20; i++) {
            String name = names[(int) (Math.random() * names.length)];
            IGameRole lidian = RoleFactory.getGameRole(name);
            lidian.showbaby();
        }
    }
}

