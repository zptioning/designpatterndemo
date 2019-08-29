package com.zptioning.creator_style.e22_proto.cache_proto;

import java.util.HashMap;

public class GameRoleCache {
    private static HashMap<String, AbsGameRole> sHashMap = new HashMap<>();

    public static AbsGameRole getRole(String name) {
        AbsGameRole absGameRole = sHashMap.get(name);
        AbsGameRole clone = (AbsGameRole) absGameRole.clone();
        clone.name = absGameRole.name + "克隆银";
        return clone;
    }

    public static void loadCache() {
        Guanyu guanyu = new Guanyu("关羽");
        sHashMap.put(guanyu.name, guanyu);

        Zhangfei zhangfei = new Zhangfei("张飞");
        sHashMap.put(zhangfei.name, zhangfei);

        Zhaoyun zhaoyun = new Zhaoyun("赵云");
        sHashMap.put(zhaoyun.name, zhaoyun);
    }
}
