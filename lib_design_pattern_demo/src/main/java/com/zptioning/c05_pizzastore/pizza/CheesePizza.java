package com.zptioning.c05_pizzastore.pizza;

public class CheesePizza extends Pizza {

	@Override
	public void prepare() {

		super.setname("CheesePizza");
		
		System.out.println(name+" preparing;");
	}

}
