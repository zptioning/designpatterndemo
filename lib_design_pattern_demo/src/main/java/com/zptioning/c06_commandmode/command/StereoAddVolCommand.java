package com.zptioning.c06_commandmode.command;

import com.zptioning.c06_commandmode.device.Stereo;

public class StereoAddVolCommand implements Command {
    private Stereo setreo;

    public StereoAddVolCommand(Stereo setreo) {
        this.setreo = setreo;
    }

    @Override
    public void execute() {

        int vol = setreo.GetVol();
        if (vol < 11) {
            setreo.SetVol(++vol);
        }

    }

    @Override
    public void undo() {

        int vol = setreo.GetVol();
        if (vol > 0) {
            setreo.SetVol(--vol);
        }

    }

}
