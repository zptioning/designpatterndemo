package com.zptioning.creator_style.e5_factory.absFactory;

public class Wei文Role extends 魏Role {
    public Wei文Role(String name) {
        super(name);
    }

    @Override
    public void comeOn() {
        System.out.println(name + " 在此，谁敢决一死战！！！");
    }
}
