package com.zptioning.c05_pizzastore.pizza;

public class LDCheesePizza extends Pizza {

	@Override
	public void prepare() {

		super.setname("LDCheesePizza");
		
		System.out.println(name+" preparing;");
	}

}
