package main.java.connect4game.modelViewController.doubleDispatching.view.console;

import main.java.connect4game.modelViewController.doubleDispatching.controller.PlayController;
import main.java.connect4game.modelViewController.doubleDispatching.controller.ResumeController;
import main.java.connect4game.modelViewController.doubleDispatching.controller.StartController;
import main.java.connect4game.modelViewController.doubleDispatching.view.View;

public class ConsoleView implements View {
    private StartView startView;
    private PlayView playView;
    private ResumeView resumeView;

    public ConsoleView() {
        this.startView = new StartView();
        this.playView = new PlayView();
        this.resumeView = new ResumeView();
    }

    public void visit(StartController startController) {
        this.startView.interact(startController);
    }

    public void visit(PlayController playController) {
        this.playView.interact(playController);
    }

    public boolean visit(ResumeController resumeController) {
        return this.resumeView.interact(resumeController);
    }
}
