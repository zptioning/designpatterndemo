package com.zptioning.c12_statemode.state;

public interface State {
	public void insertCoin();
	public void returnCoin();
	public void turnCrank();
	public void dispense();
	public void printstate();
}
