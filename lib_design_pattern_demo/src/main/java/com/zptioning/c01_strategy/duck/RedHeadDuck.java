package com.zptioning.c01_strategy.duck;

import com.zptioning.c01_strategy.flybehavior.BadFlyBehavior;

import com.zptioning.c01_strategy.quackbehavior.GeGeQuackBehavior;

public class RedHeadDuck extends Duck {

	public RedHeadDuck() {
		mFlyBehavior = new BadFlyBehavior();
		mQuackBehavior = new GeGeQuackBehavior();
	}

	@Override
	public void display() {

		System.out.println("**RedHead**");
	}

}
