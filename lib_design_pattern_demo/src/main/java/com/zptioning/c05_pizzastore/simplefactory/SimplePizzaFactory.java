package com.zptioning.c05_pizzastore.simplefactory;

import com.zptioning.c05_pizzastore.pizza.CheesePizza;
import com.zptioning.c05_pizzastore.pizza.GreekPizza;
import com.zptioning.c05_pizzastore.pizza.PepperPizza;
import com.zptioning.c05_pizzastore.pizza.Pizza;
/**
 * @ClassName SimplePizzaFactory
 * @Author ZPTION
 * @Date 2019/8/11 14:12
 * @Version 1.0
 * @Description
 * 简单工厂
 */
public class SimplePizzaFactory {

    public Pizza CreatePizza(String ordertype) {
        Pizza pizza = null;

        if (ordertype.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (ordertype.equals("greek")) {
            pizza = new GreekPizza();
        } else if (ordertype.equals("pepper")) {
            pizza = new PepperPizza();
        }
        return pizza;

    }

}
