package com.zptioning.c20_mediator.mediator;

import com.zptioning.c20_mediator.colleague.Colleague;

public interface Mediator {
	public abstract void Register(String colleagueName, Colleague colleague);

	public abstract void GetMessage(int stateChange, String colleagueName);

	public abstract void SendMessage();
}
