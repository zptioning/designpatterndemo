package com.zptioning.creator_style.e22_proto.cache_proto;

public class Zhangfei extends AbsGameRole {
    public Zhangfei(String name) {
        super(name);
    }

    @Override
    void showWeapon() {
        System.out.println(name + "：丈八蛇矛 刺你！！！");
    }
}
