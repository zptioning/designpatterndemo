package com.zptioning.c12_statemode;

public class MainTest {
	public static void main(String[] args) {
		CandyMachine mCandyMachine=new CandyMachine(1);
		
		mCandyMachine.printstate();
		
		mCandyMachine.insertCoin();
		mCandyMachine.printstate();
		
		mCandyMachine.turnCrank();
		
		mCandyMachine.printstate();
		
		mCandyMachine.insertCoin();
		mCandyMachine.printstate();
		
		mCandyMachine.turnCrank();
		
		mCandyMachine.printstate();
	}
}
