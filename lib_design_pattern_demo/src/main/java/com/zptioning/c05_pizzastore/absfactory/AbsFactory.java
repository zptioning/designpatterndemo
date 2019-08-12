package com.zptioning.c05_pizzastore.absfactory;

import com.zptioning.c05_pizzastore.pizza.Pizza;

public interface AbsFactory {
	public Pizza CreatePizza(String ordertype) ;
}
