package com.zptioning.behaviour_style.e2_observer;

/**
 * @ClassName 外观模式
 * @Author zptioning
 * @Date 2019/8/27 18:10
 * @Version 1.0
 * @Description
 * 观察者模式
 * Oberver：观察者  帐下刀斧手（黄盖，周泰）
 * Observable：被观察者  主公 （周瑜）
 *
 * 周瑜先告诉 黄盖 周泰二人 宴上密切关注自己  registerObserver
 * 周瑜摔杯为号，黄盖、周泰看到周瑜摔酒杯就出来砍诸葛亮。
 */
public class ZTest {
    public static void main(String[] args) {

        刀斧手1Observer 黄盖 = new 刀斧手1Observer("黄盖");
        刀斧手2Observer 周泰 = new 刀斧手2Observer("周泰");

        主公Observable 周瑜 = new 主公Observable("周瑜");

        // 周瑜命令黄盖周泰关注自己 摔杯为号 砍诸葛亮
        周瑜.registerObserver(黄盖);
        周瑜.registerObserver(周泰);

        周瑜.doOrder("摔酒杯了！");

        // 砍诸葛村夫  黄盖一个人就够了
        System.out.println("砍诸葛村夫  黄盖一个人就够了");
        周瑜.removeObserver(周泰);
        周瑜.doOrder("摔酒杯了！");
    }
}
