package com.zptioning.c01_stimulateduck.duck;

import com.zptioning.c01_stimulateduck.flybehavior.GoodFlyBehavior;
import com.zptioning.c01_stimulateduck.quackbehavior.GaGaQuackBehavior;

public class GreenHeadDuck extends Duck {

	public GreenHeadDuck() {
		mFlyBehavior = new GoodFlyBehavior();
		mQuackBehavior = new GaGaQuackBehavior();
	}

	@Override
	public void display() {

		System.out.println("**GreenHead**");
	}

}