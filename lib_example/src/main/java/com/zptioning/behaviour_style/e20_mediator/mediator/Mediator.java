package com.zptioning.behaviour_style.e20_mediator.mediator;

import com.zptioning.behaviour_style.e20_mediator.colleague.Colleague;

public abstract class Mediator {
    // 注册
    public abstract void register(Colleague colleague);

    // 转播
    public abstract void relay(Colleague colleague, String message);
}
