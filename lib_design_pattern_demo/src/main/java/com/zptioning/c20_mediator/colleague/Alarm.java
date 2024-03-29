package com.zptioning.c20_mediator.colleague;

import com.zptioning.c20_mediator.mediator.Mediator;

public class Alarm extends Colleague {

	public Alarm(Mediator mediator, String name) {
		super(mediator, name);
		// TODO Auto-generated constructor stub
		mediator.Register(name, this);
	}

	public void SendAlarm(int stateChange) {
		SendMessage(stateChange);
	}

	@Override
	public void SendMessage(int stateChange) {

		this.GetMediator().GetMessage(stateChange, this.name);
	}

}
