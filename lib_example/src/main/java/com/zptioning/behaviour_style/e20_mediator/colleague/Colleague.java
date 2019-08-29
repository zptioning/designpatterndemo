package com.zptioning.behaviour_style.e20_mediator.colleague;

import com.zptioning.behaviour_style.e20_mediator.mediator.Mediator;

/**
 * @ClassName Colleague
 * @Author zptioning
 * @Date 2019/8/28 20:11
 * @Version 1.0
 * @Description 抽象同事类
 */
public abstract class Colleague {
    // 中介者
    protected Mediator mMediator;

    public void setMediator(Mediator mediator) {
        mMediator = mediator;
    }

    public abstract void receive(String message);

    public abstract void send(String message);
}
