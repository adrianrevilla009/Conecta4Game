package main.java.connect4game.modelViewController.basic.view.console;

import main.java.connect4game.modelViewController.basic.controller.PlayController;
import main.java.connect4game.modelViewController.basic.controller.ResumeController;
import main.java.connect4game.modelViewController.basic.controller.StartController;
import main.java.connect4game.modelViewController.basic.view.View;

public class ConsoleView extends View {
    private StartView startView;
    private PlayView playView;
    private ResumeView resumeView;

    public ConsoleView(StartController startController, PlayController playController, ResumeController resumeController) {
        super(startController, playController, resumeController);
        this.startView = new StartView(startController);
        this.playView = new PlayView(playController);
        this.resumeView = new ResumeView(resumeController);
    }

    public void start() {
        this.startView.interact();
    }

    public void play() {
        this.playView.interact();
    }

    public boolean resume() {
        return this.resumeView.interact();
    }
}
