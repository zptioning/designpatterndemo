package com.zptioning.c11_composemode;

public class MenuItem extends MenuComponent {
    private String name, description;
    private boolean vegetable;
    private float price;

    public MenuItem(String name, String description, boolean vegetable, float price) {
        this.name = name;
        this.description = description;
        this.vegetable = vegetable;
        this.price = price;

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public boolean isVegetable() {
        return vegetable;
    }

    @Override
    public void print() {

        System.out.println(getName() + "***" + getPrice() + "***"
                + getDescription());

    }
}
