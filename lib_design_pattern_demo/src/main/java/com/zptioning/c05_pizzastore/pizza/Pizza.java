package com.zptioning.c05_pizzastore.pizza;

/**
 * @ClassName Pizza
 * @Author ZPTION
 * @Date 2019/8/11 14:13
 * @Version 1.0
 * @Description
 */
public abstract class Pizza {
    protected String name;

    public abstract void prepare();

    public void bake() {
        System.out.println(name + " baking;");
    }

    public void cut() {
        System.out.println(name + " cutting;");
    }

    public void box() {
        System.out.println(name + " boxing;");
    }

    public void setname(String name) {
        this.name = name;
    }
}
