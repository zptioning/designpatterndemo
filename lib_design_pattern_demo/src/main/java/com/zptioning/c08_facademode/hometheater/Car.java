package com.zptioning.c08_facademode.hometheater;


public class Car {
    Engine engine;

    public Car() {
        //初始化发动机
    }

    public void start(Key mKey) {
        Doors doors = new Doors();
        boolean authorized = mKey.turns();
        if (authorized) {
            engine.start();
            doors.lock();
        }
    }

}