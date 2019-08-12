package com.zptioning.c07_adaptermode;

import com.zptioning.c07_adaptermode.adapter.TurkeyAdapter2;
import com.zptioning.c07_adaptermode.duck.Duck;
import com.zptioning.c07_adaptermode.duck.GreenHeadDuck;
import com.zptioning.c07_adaptermode.turkey.WildTurkey;


public class MainTest {
    public static void main(String[] args) {
        GreenHeadDuck duck = new GreenHeadDuck();

        WildTurkey turkey = new WildTurkey();

        Duck duck2turkeyAdapter = new TurkeyAdapter2();
        turkey.gobble();
        turkey.fly();
        duck.quack();
        duck.fly();
        // 火鸡冒充鸭子
        duck2turkeyAdapter.quack();
        duck2turkeyAdapter.fly();
    }
}
