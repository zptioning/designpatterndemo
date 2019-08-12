package com.zptioning.c06_commandmode.command;

import com.zptioning.c06_commandmode.Control;

import java.util.Stack;

/**
 * @ClassName CommandModeControl
 * @Author ZPTION
 * @Date 2019/8/11 15:25
 * @Version 1.0
 * @Description 遥控器实现
 */
public class CommandModeControl implements Control {
    // 5个开的按钮
    private Command[] onCommands;
    // 5个关的按钮
    private Command[] offCommands;
    // 执行返回操作
    private Stack<Command> stack = new Stack<Command>();

    public CommandModeControl() {
        onCommands = new Command[5];
        offCommands = new Command[5];

        Command noCommand = new NoCommand();

        for (int i = 0, len = onCommands.length; i < len; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    @Override
    public void onButton(int slot) {
        onCommands[slot].execute();
        stack.push(onCommands[slot]);
    }

    @Override
    public void offButton(int slot) {

        offCommands[slot].execute();
        stack.push(offCommands[slot]);
    }

    @Override
    public void undoButton() {

        stack.pop().undo();
    }

}
