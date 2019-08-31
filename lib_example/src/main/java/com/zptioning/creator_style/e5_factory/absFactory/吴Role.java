package com.zptioning.creator_style.e5_factory.absFactory;

public abstract class 吴Role {
    protected String name;

    public 吴Role(String name) {
        this.name = name;
        comeOn();
    }

    public abstract void comeOn();
}
