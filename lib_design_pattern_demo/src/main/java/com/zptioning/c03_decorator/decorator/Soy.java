package com.zptioning.c03_decorator.decorator;

import com.zptioning.c03_decorator.Drink;

/**
 * 豆浆
 */
public class Soy extends Decorator {

    public Soy(Drink Obj) {
        super(Obj);
        super.setDescription("Soy");
        super.setPrice(1.5f);
    }

}

