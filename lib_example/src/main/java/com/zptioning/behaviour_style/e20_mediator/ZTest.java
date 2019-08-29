package com.zptioning.behaviour_style.e20_mediator;

import com.zptioning.behaviour_style.e20_mediator.colleague.Colleague大B;
import com.zptioning.behaviour_style.e20_mediator.colleague.Colleague小B;
import com.zptioning.behaviour_style.e20_mediator.mediator.ConcreteMediator;

public class ZTest {
    public static void main(String[] args) {
        ConcreteMediator concreteMediator = new ConcreteMediator();
        Colleague小B colleague小B = new Colleague小B();
        Colleague大B colleague大B = new Colleague大B();
        concreteMediator.register(colleague小B);
        concreteMediator.register(colleague大B);

        colleague小B.send("大B 陆家嘴旁边的那套房子被抢掉啦！");
        System.out.println("--------------------------");
        colleague大B.send("小B 你个流氓，竟然抢我的单子");
    }
}
