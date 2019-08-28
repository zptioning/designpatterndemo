package com.zptioning.c13_agentmode.candymachine;

import java.util.Random;

public class HasCoinState implements State {
	private transient CandyMachine mCandyMachine;

	public HasCoinState(CandyMachine mCandyMachine) {
		this.mCandyMachine = mCandyMachine;
	}

	@Override
	public void insertCoin() {

		System.out.println("you can't insert another coin!");

	}

	@Override
	public void returnCoin() {

		System.out.println("coin return!");
		mCandyMachine.setState(mCandyMachine.mOnReadyState);
	}

	@Override
	public void turnCrank() {

		System.out.println("crank turn...!");
		Random ranwinner=new Random();
		int winner=ranwinner.nextInt(10);
		if(winner==0)
		{
			mCandyMachine.setState(mCandyMachine.mWinnerState);

		}else
		{
			mCandyMachine.setState(mCandyMachine.mSoldState);

		}
		
	}

	@Override
	public void dispense() {
	}

	@Override
	public void printstate() {

		System.out.println("***HasCoinState***");

	}

	@Override
	public String getstatename() {

		return "HasCoinState State";
	}

}
