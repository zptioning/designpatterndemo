package com.zptioning.c01_strategy.duck;

import com.zptioning.c01_strategy.flybehavior.GoodFlyBehavior;
import com.zptioning.c01_strategy.quackbehavior.GaGaQuackBehavior;

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