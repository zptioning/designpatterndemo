package com.zptioning.creator_style.e22_proto.cache_proto;

public abstract class AbsGameRole implements Cloneable {
    protected String name;

    public AbsGameRole(String name) {
        this.name = name;
    }

    abstract void showWeapon();

    @Override
    protected Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
