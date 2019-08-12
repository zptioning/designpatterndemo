package com.zptioning.c05_pizzastore.pizza;

public class NYCheesePizza extends Pizza {

	@Override
	public void prepare() {

		super.setname("NYCheesePizza");
		
		System.out.println(name+" preparing;");
	}

}
