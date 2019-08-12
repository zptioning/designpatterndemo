package com.zptioning.c01_stimulateduck.duck;

import com.zptioning.c01_stimulateduck.flybehavior.BadFlyBehavior;

import com.zptioning.c01_stimulateduck.quackbehavior.GeGeQuackBehavior;

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
