package main.java.connect4game.modelViewController.doubleDispatching.view.graphics;

import main.java.connect4game.modelViewController.doubleDispatching.controller.PlayController;
import main.java.connect4game.modelViewController.doubleDispatching.controller.ResumeController;
import main.java.connect4game.modelViewController.doubleDispatching.controller.StartController;
import main.java.connect4game.modelViewController.doubleDispatching.view.View;

public class GraphicsView implements View {
    private StartView startView;
    private PlayView playView;
    private ResumeView resumeView;


    public GraphicsView() {
        this.startView = new StartView();
        this.playView = new PlayView();
        this.resumeView = new ResumeView();
    }

    public void start(StartController startController) {
        this.startView.interact(startController);
    }

    public void play(PlayController playController) {
        this.startView.setVisible(false);
        this.playView.interact(playController);
    }

    public boolean resume(ResumeController resumeController) {
        resumeView.resume();
        if (resumeView.isResumedGame()) {
            this.playView.reset(resumeController);
            return true;
        }
        this.playView.setVisible(false);
        System.exit(0);
        return false;
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
