package com.zptioning.c06_commandmode;

public interface Control {

	public void onButton(int slot);

	public void offButton(int slot);
	
	public void undoButton();
}
