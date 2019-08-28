package com.zptioning.c01_strategy;

import com.zptioning.c01_strategy.duck.Duck;
import com.zptioning.c01_strategy.duck.GreenHeadDuck;
import com.zptioning.c01_strategy.duck.RedHeadDuck;
import com.zptioning.c01_strategy.flybehavior.NoFlyBehavior;
import com.zptioning.c01_strategy.quackbehavior.NoQuackBehavior;


public class StimulateDuck {

    public static void main(String[] args) {

        Duck mGreenHeadDuck = new GreenHeadDuck();
        Duck mRedHeadDuck = new RedHeadDuck();

        mGreenHeadDuck.display();
        mGreenHeadDuck.Fly();
        mGreenHeadDuck.Quack();
        mGreenHeadDuck.swim();

        mRedHeadDuck.display();
        mRedHeadDuck.Fly();
        mRedHeadDuck.Quack();
        mRedHeadDuck.swim();

        mRedHeadDuck.display();
        mRedHeadDuck.SetFlyBehavoir(new NoFlyBehavior());
        mRedHeadDuck.Fly();
        mRedHeadDuck.SetQuackBehavoir(new NoQuackBehavior());
        mRedHeadDuck.Quack();
    }

}
