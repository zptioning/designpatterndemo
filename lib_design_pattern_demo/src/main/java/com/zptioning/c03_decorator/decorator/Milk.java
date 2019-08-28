package com.zptioning.c03_decorator.decorator;

import com.zptioning.c03_decorator.Drink;

public class Milk extends Decorator {

    public Milk(Drink Obj) {
        super(Obj);
        super.setDescription("Milk");
        super.setPrice(2.0f);
    }
}

