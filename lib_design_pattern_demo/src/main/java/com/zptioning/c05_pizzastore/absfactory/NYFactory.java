package com.zptioning.c05_pizzastore.absfactory;

import com.zptioning.c05_pizzastore.pizza.NYCheesePizza;
import com.zptioning.c05_pizzastore.pizza.NYPepperPizza;
import com.zptioning.c05_pizzastore.pizza.Pizza;

public class NYFactory implements AbsFactory {

	
	@Override
	public Pizza CreatePizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new NYCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new NYPepperPizza();
		}
		return pizza;

	}

}
