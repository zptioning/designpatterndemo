package com.zptioning.c01_strategy.flybehavior;


public class	NoFlyBehavior implements FlyBehavior
{
	@Override
	public void fly() {

		System.out.println("--NoFly--");
	}
}
