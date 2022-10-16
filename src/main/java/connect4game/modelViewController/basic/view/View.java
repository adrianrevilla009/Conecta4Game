package main.java.connect4game.modelViewController.basic.view;

import main.java.connect4game.modelViewController.basic.controller.PlayController;
import main.java.connect4game.modelViewController.basic.controller.ResumeController;
import main.java.connect4game.modelViewController.basic.controller.StartController;
import main.java.connect4game.modelViewController.basic.domain.Game;

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
