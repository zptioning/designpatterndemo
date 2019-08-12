package com.zptioning.c13_agentmode.candymachine;

public class OnReadyState implements State {
	private transient CandyMachine mCandyMachine;
	public OnReadyState(CandyMachine mCandyMachine)
	{
		this.mCandyMachine=mCandyMachine;
	}

	@Override
	public void insertCoin() {

		System.out
		.println("you have inserted a coin,next,please turn crank!");
		mCandyMachine.setState(mCandyMachine.mHasCoin);
	}

	@Override
	public void returnCoin() {

		System.out.println("you haven't inserted a coin yet!");
		
	}

	@Override
	public void turnCrank() {

		System.out.println("you turned,but you haven't inserted a coin!");
		
	}

	@Override
	public void dispense() {


	}

	@Override
	public void printstate() {

		System.out.println("***OnReadyState***");
		
	}
	@Override
	public String getstatename() {

		return "OnReadyState";
	}
}
