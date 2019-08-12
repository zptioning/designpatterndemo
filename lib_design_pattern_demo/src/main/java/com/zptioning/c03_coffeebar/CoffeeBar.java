package com.zptioning.c03_coffeebar;

import com.zptioning.c03_coffeebar.coffee.Decaf;
import com.zptioning.c03_coffeebar.coffee.LongBlack;
import com.zptioning.c03_coffeebar.decorator.Chocolate;
import com.zptioning.c03_coffeebar.decorator.Milk;

public class CoffeeBar {

    public static void main(String[] args) {

        Drink order;
        order = new Decaf();
        System.out.println("order1 price:" + order.cost());
        System.out.println("order1 desc:" + order.getDescription());

        System.out.println("****************");
        order = new LongBlack();
        // 添加调料
        order = new Milk(order);
        order = new Chocolate(order);
        order = new Chocolate(order);
        System.out.println("order2 price:" + order.cost());
        System.out.println("order2 desc:" + order.getDescription());

    }

}
