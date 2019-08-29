package com.zptioning.creator_style.e22_proto.cache_proto;

public class Guanyu extends AbsGameRole {
    public Guanyu(String name) {
        super(name);
    }

    @Override
    void showWeapon() {
        System.out.println(name + "：青龙偃月刀 劈你！！！");
    }
}
