package com.zptioning.c15_bridgems;


public class MainTest {
	public static void main(String[] args) {
		LGTvControl mLGTvControl=new LGTvControl();
		SonyTvControl mSonyTvControl=new SonyTvControl();
		
		mLGTvControl.Onoff();
		mLGTvControl.nextChannel();
		mLGTvControl.nextChannel();
		mLGTvControl.preChannel();
		mLGTvControl.Onoff();
		
		mSonyTvControl.Onoff();
		mSonyTvControl.preChannel();
		mSonyTvControl.preChannel();
		mSonyTvControl.preChannel();
		mSonyTvControl.Onoff();
	}


}
