package com.zptioning.construction_style.e18_flyweight;

import java.util.HashMap;

public class RoleFactory {
    private static final HashMap<String, IGameRole> roleMap = new HashMap<>();

    public static IGameRole getGameRole(String name) {
        IGameRole iGameRole = roleMap.get(name);
        if (null == iGameRole) {
            iGameRole = new Boss(name);
            roleMap.put(name, iGameRole);
            System.out.println("创建了 boss：" + name);
        } else {
            System.out.println("复用了 boss：" + name);
        }
        return iGameRole;
    }
}
