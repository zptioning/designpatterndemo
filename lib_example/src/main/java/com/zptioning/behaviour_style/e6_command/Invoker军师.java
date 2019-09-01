package com.zptioning.behaviour_style.e6_command;

import java.util.ArrayList;
import java.util.List;

public class Invoker军师 {
    private List<Command> mCommandList = new ArrayList<>();

    public void addOrder(Command command) {
        mCommandList.add(command);
    }

    public void executeOrders() {
        for (Command command : mCommandList) {
            command.execute();
        }
        mCommandList.clear();
    }
}
