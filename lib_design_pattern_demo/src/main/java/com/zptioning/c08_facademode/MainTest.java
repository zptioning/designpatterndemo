package com.zptioning.c08_facademode;


import com.zptioning.c08_facademode.hometheater.HomeTheaterFacade;

public class MainTest {
    public static void main(String[] args) {

        HomeTheaterFacade mHomeTheaterFacade = new HomeTheaterFacade();

        mHomeTheaterFacade.ready();
        mHomeTheaterFacade.play();
    }
}
