package com.zptioning.c06_commandmode.command;

/**
 * @ClassName Command
 * @Author ZPTION
 * @Date 2019/8/11 15:27
 * @Version 1.0
 * @Description
 */
public interface Command {
    public void execute();

    public void undo();
}
