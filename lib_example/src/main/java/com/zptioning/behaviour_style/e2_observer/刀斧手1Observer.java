package com.zptioning.behaviour_style.e2_observer;

public class 刀斧手1Observer implements Observer {
    String name;

    public 刀斧手1Observer(String name) {
        this.name = name;
    }

    @Override
    public void doAction(String context) {
        System.out.println(name + " order:主公" + context + "    我去砍诸葛村夫");
    }
}
