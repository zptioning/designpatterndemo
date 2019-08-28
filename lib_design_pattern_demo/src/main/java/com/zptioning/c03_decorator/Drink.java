package com.zptioning.c03_decorator;

public abstract class Drink {
    public String description = "";
    private float price = 0f;

    // getter setter 方法
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description + "-" + this.getPrice();
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public abstract float cost();
}
