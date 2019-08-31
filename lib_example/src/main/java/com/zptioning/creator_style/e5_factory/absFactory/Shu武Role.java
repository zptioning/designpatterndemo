package com.zptioning.creator_style.e5_factory.absFactory;

public class Shu武Role extends 蜀Role {
    public Shu武Role(String name) {
        super(name);
    }

    @Override
    public void comeOn() {
        System.out.println(name + " 在此，谁敢决一死战！！！");
    }
}
