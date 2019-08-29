package com.zptioning.creator_style.e22_proto.cache_proto;

public class Zhaoyun extends AbsGameRole {
    public Zhaoyun(String name) {
        super(name);
    }

    @Override
    void showWeapon() {
        System.out.println(name + "：百鸟朝凤枪 捅你！！！");
    }
}
