package com.zptioning.creator_style.e5_factory.absFactory;

public abstract class 蜀Role {
    protected String name;

    public 蜀Role(String name) {
        this.name = name;
        comeOn();
    }

    public abstract void comeOn();
}
