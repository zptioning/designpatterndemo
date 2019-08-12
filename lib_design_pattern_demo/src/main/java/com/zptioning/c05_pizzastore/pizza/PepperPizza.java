package com.zptioning.c05_pizzastore.pizza;

public class PepperPizza extends Pizza {

    @Override
    public void prepare() {
        super.setname("PepperPizza");

        System.out.println(name + " preparing;");
    }

}
