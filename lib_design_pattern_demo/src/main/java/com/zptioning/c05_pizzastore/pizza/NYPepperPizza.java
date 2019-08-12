package com.zptioning.c05_pizzastore.pizza;

public class NYPepperPizza extends Pizza {

	@Override
	public void prepare() {

		super.setname("NYPepperPizza");
		
		System.out.println(name+" preparing;");
	}

}
