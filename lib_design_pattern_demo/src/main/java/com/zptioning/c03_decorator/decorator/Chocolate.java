package com.zptioning.c03_decorator.decorator;

import com.zptioning.c03_decorator.Drink;

public class Chocolate extends Decorator {

    public Chocolate(Drink Obj) {
        super(Obj);
        super.setDescription("Chocolate");
        super.setPrice(3.0f);
    }
}
