package org.example.modelViewController.facade.view.console;

import org.example.modelViewController.facade.controller.Logic;
import org.example.modelViewController.facade.view.View;

public class ConsoleView extends View {
    private StartView startView;
    private PlayView playView;
    private ResumeView resumeView;

    public ConsoleView(Logic logic) {
        super(logic);
        this.startView = new StartView(logic);
        this.playView = new PlayView(logic);
        this.resumeView = new ResumeView(logic);
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
