package com.zptioning.creator_style.e4_singleton;

public class Singleton$Holder {
    private Singleton$Holder() {

    }


    public static final Singleton$Holder getInstance() {
        return SingletonHolder.INSTANCE;
    }


    private static class SingletonHolder {
        private static final Singleton$Holder INSTANCE = new Singleton$Holder();
    }

    public void comeOn(){
        System.out.println("holder style");
    }
}
