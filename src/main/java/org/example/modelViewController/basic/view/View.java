package org.example.modelViewController.basic.view;

import org.example.modelViewController.basic.controller.PlayController;
import org.example.modelViewController.basic.controller.ResumeController;
import org.example.modelViewController.basic.controller.StartController;

public abstract class View {

    private StartController startController;
    private PlayController playController;
    private ResumeController resumeController;

    public View(StartController startController, PlayController playController, ResumeController resumeController) {
        this.startController = startController;
        this.playController = playController;
        this.resumeController = resumeController;
    }

    public abstract void start();

    public abstract void play();

    public abstract boolean resume();
}
