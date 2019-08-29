package com.zptioning.creator_style.e4_singleton;

public class SingletonDoubleCheck {
    private volatile static SingletonDoubleCheck singleton;

    private SingletonDoubleCheck() {
    }

    public static SingletonDoubleCheck getSingleton() {
        if (singleton == null) {
            synchronized (SingletonDoubleCheck.class) {
                if (singleton == null) {
                    singleton = new SingletonDoubleCheck();
                }
            }
        }
        return singleton;
    }
}
