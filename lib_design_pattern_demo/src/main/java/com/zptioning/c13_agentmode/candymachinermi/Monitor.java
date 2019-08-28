package com.zptioning.c13_agentmode.candymachinermi;

import java.rmi.RemoteException;
import java.util.ArrayList;

import com.zptioning.c13_agentmode.candymachine.CandyMachine;

/**
 * @ClassName Monitor
 * @Author zptioning
 * @Date 2019/8/28 16:39
 * @Version 1.0
 * @Description 保存创建的 CandyMachineRemo
 */
public class Monitor {

	private ArrayList<CandyMachineRemote> candyMachinelst;

	public Monitor() {
		candyMachinelst = new ArrayList<CandyMachineRemote>();
	}

	public void addMachine(CandyMachineRemote mCandyMachine) {
		candyMachinelst.add(mCandyMachine);
	}

	public void report() {
		CandyMachineRemote mCandyMachine;
		for (int i = 0, len = candyMachinelst.size(); i < len; i++) {
			mCandyMachine = candyMachinelst.get(i);
			try {
				System.out.println("Machine Loc:" + mCandyMachine.getLocation());
				System.out.println("Machine Candy count:" + mCandyMachine.getCount());
				System.out.println("Machine State:" + mCandyMachine.getstate().getstatename());
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
