package com.zptioning.c06_commandmode.command;

/**
 * @ClassName MarcoCommand
 * @Author ZPTION
 * @Date 2019/8/11 15:40
 * @Version 1.0
 * @Description 一个按钮关闭所有的灯
 */
public class MarcoCommand implements Command {

    private Command[] commands;

    public MarcoCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {

        for (int i = 0, len = commands.length; i < len; i++) {
            commands[i].execute();
        }
    }

    @Override
    public void undo() {

        for (int i = commands.length - 1; i >= 0; i--) {
            commands[i].undo();

        }
    }

}
