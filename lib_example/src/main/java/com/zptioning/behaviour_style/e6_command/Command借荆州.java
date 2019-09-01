package com.zptioning.behaviour_style.e6_command;

public class Command借荆州 implements Command {

    private Receiver作战计划 mM作战计划;

    public Command借荆州(Receiver作战计划 m作战计划) {
        this.mM作战计划 = m作战计划;
    }

    @Override
    public void execute() {
        mM作战计划.借荆州();
    }
}
