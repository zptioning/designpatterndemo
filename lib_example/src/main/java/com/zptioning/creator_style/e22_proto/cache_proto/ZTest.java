package com.zptioning.creator_style.e22_proto.cache_proto;

public class ZTest {
    public static void main(String[] args) {
        GameRoleCache.loadCache();

        GameRoleCache.getRole("关羽").showWeapon();
        GameRoleCache.getRole("张飞").showWeapon();
        GameRoleCache.getRole("赵云").showWeapon();
    }
}
