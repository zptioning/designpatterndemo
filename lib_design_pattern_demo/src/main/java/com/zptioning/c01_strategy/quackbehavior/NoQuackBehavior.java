package com.zptioning.c01_strategy.quackbehavior;


public	class NoQuackBehavior implements QuackBehavior
{

	@Override
	public void quack() {

		System.out.println("__NoQuack__");
	}
	
}
