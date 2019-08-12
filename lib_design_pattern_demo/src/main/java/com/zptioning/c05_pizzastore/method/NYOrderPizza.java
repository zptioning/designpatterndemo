package com.zptioning.c05_pizzastore.method;

import com.zptioning.c05_pizzastore.pizza.CheesePizza;
import com.zptioning.c05_pizzastore.pizza.GreekPizza;
import com.zptioning.c05_pizzastore.pizza.NYCheesePizza;
import com.zptioning.c05_pizzastore.pizza.NYPepperPizza;
import com.zptioning.c05_pizzastore.pizza.PepperPizza;
import com.zptioning.c05_pizzastore.pizza.Pizza;

public class NYOrderPizza extends OrderPizza {

	@Override
	Pizza createPizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new NYCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new NYPepperPizza();
		}
		return pizza;

	}

}
