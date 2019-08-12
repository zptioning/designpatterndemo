package com.zptioning.c07_adaptermode.adapter;

import com.zptioning.c07_adaptermode.duck.Duck;
import com.zptioning.c07_adaptermode.turkey.WildTurkey;

public class TurkeyAdapter2 extends WildTurkey implements Duck {

	@Override
	public void quack() {

		super.gobble();
	}
	@Override
	public void fly() {

		super.fly();
		super.fly();
		super.fly();
	}
}
