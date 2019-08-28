package com.zptioning.c13_agentmode.candymachine;

import com.zptioning.c13_agentmode.candymachinermi.CandyMachineRemote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CandyMachine extends UnicastRemoteObject implements CandyMachineRemote {

    State mSoldOutState;
    State mOnReadyState;
    State mHasCoin;
    State mSoldState;
    State mWinnerState;
    private String location = "";
    private State state;
    private int count = 0;

    public CandyMachine(String location, int count) throws RemoteException {
        this.location = location;
        this.count = count;
        mSoldOutState = new SoldOutState(this);
        mOnReadyState = new OnReadyState(this);
        mHasCoin = new HasCoinState(this);
        mSoldState = new SoldState(this);
        mWinnerState = new WinnerState(this);
        if (count > 0) {
            state = mOnReadyState;
        } else {
            state = mSoldOutState;
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public void insertCoin() {
        state.insertCoin();
    }

    public void returnCoin() {
        state.returnCoin();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void releaseCandy() {
        if (count > 0) {
            count = count - 1;
            System.out.println("a candy rolling out!");
        }
    }

    public void printstate() {
        state.printstate();
    }

    public String getLocation() {
        return location;
    }

    public int getCount() {
        return count;
    }

    public State getstate() {
        return state;
    }
}
