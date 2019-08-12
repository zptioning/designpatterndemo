package com.zptioning.c03_coffeebar.coffee;

import com.zptioning.c03_coffeebar.Drink;

/**
 * @ClassName Coffee
 * @Author ZPTION
 * @Date 2019/8/11 12:31
 * @Version 1.0
 * @Description
 * 被装饰的主体
 */
public class Coffee extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }

}
