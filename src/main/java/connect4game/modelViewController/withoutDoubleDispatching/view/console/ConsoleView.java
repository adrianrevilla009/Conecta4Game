package main.java.connect4game.modelViewController.withoutDoubleDispatching.view.console;

import main.java.connect4game.modelViewController.withoutDoubleDispatching.controller.PlayController;
import main.java.connect4game.modelViewController.withoutDoubleDispatching.controller.ResumeController;
import main.java.connect4game.modelViewController.withoutDoubleDispatching.controller.StartController;
import main.java.connect4game.modelViewController.withoutDoubleDispatching.view.View;

public class ConsoleView extends View {
    private StartView startView;
    private PlayView playView;
    private ResumeView resumeView;

    public ConsoleView() {
        this.startView = new StartView();
        this.playView = new PlayView();
        this.resumeView = new ResumeView();
    }

    public void start(StartController startController) {
        this.startView.interact(startController);
    }

    public void play(PlayController playController) {
        this.playView.interact(playController);
    }

    public boolean resume(ResumeController resumeController) {
        return this.resumeView.interact(resumeController);
    }
}
