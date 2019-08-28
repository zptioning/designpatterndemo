package com.zptioning.c03_decorator;

import com.zptioning.c03_decorator.coffee.Decaf;
import com.zptioning.c03_decorator.coffee.LongBlack;
import com.zptioning.c03_decorator.decorator.Chocolate;
import com.zptioning.c03_decorator.decorator.Milk;

public class CoffeeBar {

    public static void main(String[] args) {

        Drink drink;
        drink = new Decaf();
        System.out.println("order1 price:" + drink.cost());
        System.out.println("order1 desc:" + drink.getDescription());

        System.out.println("****************");
        drink = new LongBlack();
        // 添加调料
        drink = new Milk(drink);
        drink = new Chocolate(drink);
        drink = new Chocolate(drink);
        System.out.println("order2 price:" + drink.cost());
        System.out.println("order2 desc:" + drink.getDescription());
    }

}
