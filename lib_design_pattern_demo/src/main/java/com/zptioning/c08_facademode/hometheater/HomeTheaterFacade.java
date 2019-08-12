package com.zptioning.c08_facademode.hometheater;

/**
 * @ClassName HomeTheaterFacade
 * @Author ZPTION
 * @Date 2019/8/11 16:41
 * @Version 1.0
 * @Description 外观模式 最少知识原则 组合起来 只暴露尽可能少的接口
 */
public class HomeTheaterFacade {
    private TheaterLights mTheaterLights;
    private Popcorn mPopcorn;
    private Stereo mStereo;
    private Projector mProjector;
    private Screen mScreen;
    private DVDPlayer mDVDPlayer;

    public HomeTheaterFacade() {
        mTheaterLights = TheaterLights.getInstance();
        mPopcorn = Popcorn.getInstance();
        mStereo = Stereo.getInstance();
        mProjector = Projector.getInstance();
        mScreen = Screen.getInstance();
        mDVDPlayer = DVDPlayer.getInstance();
    }

    public void ready() {
        mPopcorn.on();
        mPopcorn.pop();
        mScreen.down();
        mProjector.on();
        mStereo.on();
        mDVDPlayer.on();
        mDVDPlayer.setdvd();
        mTheaterLights.dim(10);
    }

    public void end() {
        mPopcorn.off();
        mTheaterLights.bright();
        mScreen.up();
        mProjector.off();
        mStereo.off();

        mDVDPlayer.setdvd();
        mDVDPlayer.off();

    }

    public void play() {
        mDVDPlayer.play();
    }

    public void pause() {
        mDVDPlayer.pause();
    }
}
