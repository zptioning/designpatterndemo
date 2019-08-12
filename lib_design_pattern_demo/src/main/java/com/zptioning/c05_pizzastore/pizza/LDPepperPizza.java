package com.zptioning.c05_pizzastore.pizza;

public class LDPepperPizza extends Pizza {

	@Override
	public void prepare() {

		super.setname("LDPepperPizza");
		
		System.out.println(name+" preparing;");
	}

}
