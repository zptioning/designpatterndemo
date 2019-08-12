package com.zptioning.c05_pizzastore.absfactory;

import com.zptioning.c05_pizzastore.pizza.LDCheesePizza;
import com.zptioning.c05_pizzastore.pizza.LDPepperPizza;
import com.zptioning.c05_pizzastore.pizza.Pizza;

public class LDFactory implements AbsFactory {

	@Override
	public Pizza CreatePizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;

	}

}
