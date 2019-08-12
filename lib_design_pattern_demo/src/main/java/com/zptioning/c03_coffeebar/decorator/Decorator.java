package com.zptioning.c03_coffeebar.decorator;

import com.zptioning.c03_coffeebar.Drink;

/**
 * @ClassName Decorator
 * @Author ZPTION
 * @Date 2019/8/11 12:29
 * @Version 1.0
 * @Description
 * 装饰者中间层
 */
public class Decorator extends Drink {
    private Drink Obj;

    public Decorator(Drink Obj) {
        this.Obj = Obj;
    }

    @Override
    public float cost() {
        return super.getPrice() + Obj.cost();
    }

    @Override
    public String getDescription() {
        return super.description + " - " + super.getPrice() + " && " + Obj.getDescription();
    }

}
