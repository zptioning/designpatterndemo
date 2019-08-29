package com.zptioning.behaviour_style.e2_observer;

public interface Observable {
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
