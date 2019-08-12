package com.zptioning.c05_pizzastore.method;

import com.zptioning.c05_pizzastore.pizza.CheesePizza;
import com.zptioning.c05_pizzastore.pizza.GreekPizza;
import com.zptioning.c05_pizzastore.pizza.LDCheesePizza;
import com.zptioning.c05_pizzastore.pizza.LDPepperPizza;
import com.zptioning.c05_pizzastore.pizza.PepperPizza;
import com.zptioning.c05_pizzastore.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {

	@Override
	Pizza createPizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;

	}

}
