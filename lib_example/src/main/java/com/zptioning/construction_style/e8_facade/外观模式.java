package com.zptioning.construction_style.e8_facade;

/**
 * @ClassName 外观模式
 * @Author zptioning
 * @Date 2019/8/31 15:20
 * @Version 1.0
 * @Description
 * 外观模式（facade），为子系统中的一组接口提供一个一致的界面，此模式定义了一个高层接口，
 * 这个接口使得这一子系统更加容易使用。
 * facade是外观角色，也叫门面角色，客户端可以调用这个角色的方法，此角色知晓子系统的所有功能和责任，
 * 将客户端的请求代理给适当的子系统对象。
 */
public class 外观模式 {
    public static void main(String[] args) {
        Facade诸葛亮 facade诸葛亮 = new Facade诸葛亮();
        facade诸葛亮.活捉曹操();
    }
}
