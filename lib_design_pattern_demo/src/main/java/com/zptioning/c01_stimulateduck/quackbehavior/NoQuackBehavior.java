package com.zptioning.c01_stimulateduck.quackbehavior;


public	class NoQuackBehavior implements QuackBehavior
{

	@Override
	public void quack() {

		System.out.println("__NoQuack__");
	}
	
}
