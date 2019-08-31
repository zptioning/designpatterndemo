package com.zptioning.construction_style.e11_composite;

public abstract class Component军人 {
    protected String name;

    public Component军人(String name) {
        this.name = name;
    }

    public abstract void Add(Component军人 component军人);

    public abstract void remove(Component军人 component军人);

    public abstract void Display(int level);
}
