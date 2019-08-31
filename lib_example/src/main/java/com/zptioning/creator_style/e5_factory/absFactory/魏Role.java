package com.zptioning.creator_style.e5_factory.absFactory;

public abstract class 魏Role {
    protected String name;

    public 魏Role(String name) {
        this.name = name;
        comeOn();
    }

    public abstract void comeOn();

}
