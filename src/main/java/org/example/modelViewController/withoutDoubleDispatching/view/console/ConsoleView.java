package org.example.modelViewController.withoutDoubleDispatching.view.console;

import org.example.modelViewController.withoutDoubleDispatching.controller.PlayController;
import org.example.modelViewController.withoutDoubleDispatching.controller.ResumeController;
import org.example.modelViewController.withoutDoubleDispatching.controller.StartController;
import org.example.modelViewController.withoutDoubleDispatching.view.View;

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
