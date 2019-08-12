package com.zptioning.c01_stimulateduck;

import com.zptioning.c01_stimulateduck.duck.Duck;
import com.zptioning.c01_stimulateduck.duck.GreenHeadDuck;
import com.zptioning.c01_stimulateduck.duck.RedHeadDuck;
import com.zptioning.c01_stimulateduck.flybehavior.NoFlyBehavior;
import com.zptioning.c01_stimulateduck.quackbehavior.NoQuackBehavior;


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
