package com.zptioning.c07_adaptermode.adapter;

import com.zptioning.c07_adaptermode.duck.Duck;
import com.zptioning.c07_adaptermode.turkey.Turkey;

public class TurkeyAdapter implements Duck {
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {

        turkey.gobble();
    }

    @Override
    public void fly() {

        for (int i = 0; i < 6; i++) {
            turkey.fly();
        }
    }

}
