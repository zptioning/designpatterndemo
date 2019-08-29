package com.zptioning.behaviour_style.e2_observer;

import java.util.ArrayList;

public class 主公Observable implements Observable {

    private ArrayList<Observer> mObservers;
    private String mOrder;
    private String name;

    public 主公Observable(String s) {
        name = s;
        mObservers = new ArrayList<Observer>();
    }


    @Override
    public void registerObserver(Observer o) {
        mObservers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (mObservers.contains(o)) {
            mObservers.remove(o);
        }
    }

    /**
     * 通知手下做事
     */
    @Override
    public void notifyObservers() {
        for (int i = 0, len = mObservers.size(); i < len; i++) {
            mObservers.get(i).doAction(mOrder);
        }
    }

    /**
     * 暗号
     *
     * @param order
     */
    public void doOrder(String order) {
        System.out.println(name + ":看我摔杯为号：" + order);
        mOrder = order;
        notifyObservers();
    }

}
