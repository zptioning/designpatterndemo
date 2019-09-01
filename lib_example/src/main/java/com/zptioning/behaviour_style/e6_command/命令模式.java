package com.zptioning.behaviour_style.e6_command;

public class 命令模式 {
    public static void main(String[] args) {
        Receiver作战计划 zuozhanjihua = new Receiver作战计划();

        Command order借荆州 = new Command借荆州(zuozhanjihua);
        Command order骗西川 = new Command骗西川(zuozhanjihua);
        Command order取汉中 = new Command取汉中(zuozhanjihua);

        Invoker军师 zhugeliang = new Invoker军师();
        zhugeliang.addOrder(order借荆州);
        zhugeliang.addOrder(order骗西川);
        zhugeliang.addOrder(order取汉中);

        zhugeliang.executeOrders();
    }
}
