package com.zptioning.c20_mediator;

import com.zptioning.c20_mediator.colleague.Alarm;
import com.zptioning.c20_mediator.colleague.CoffeeMachine;
import com.zptioning.c20_mediator.colleague.Curtains;
import com.zptioning.c20_mediator.colleague.TV;
import com.zptioning.c20_mediator.mediator.ConcreteMediator;
import com.zptioning.c20_mediator.mediator.Mediator;

public class MainTest {

	public static void main(String[] args) {
		Mediator mediator = new ConcreteMediator();
		Alarm mAlarm = new Alarm(mediator, "mAlarm");
		CoffeeMachine mCoffeeMachine = new CoffeeMachine(mediator, "mCoffeeMachine");
		Curtains mCurtains = new Curtains(mediator, "mCurtains");
		TV mTV = new TV(mediator, "mTV");
		mAlarm.SendAlarm(0);
		mCoffeeMachine.FinishCoffee();
		mAlarm.SendAlarm(1);
	}

}
