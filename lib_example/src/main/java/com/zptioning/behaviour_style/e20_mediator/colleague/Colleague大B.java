package com.zptioning.behaviour_style.e20_mediator.colleague;

public class Colleague大B extends Colleague {
    @Override
    public void receive(String message) {
        System.out.println(this.getClass().getSimpleName() + " : 接收消息  " + message);
    }

    @Override
    public void send(String message) {
        System.out.println(this.getClass().getSimpleName() + " : 发送消息  " + message);
        mMediator.relay(this,message);
    }
}
