package org.example.modelViewController.facade.view.graphics;

import org.example.modelViewController.facade.controller.Logic;
import org.example.modelViewController.facade.view.View;

public class GraphicsView extends View {
    private StartView startView;
    private PlayView playView;
    private ResumeView resumeView;


    public GraphicsView(Logic logic) {
        super(logic);
        this.startView = new StartView(logic);
        this.playView = new PlayView(logic);
        this.resumeView = new ResumeView();
    }

    @Override
    public void start() {
        this.startView.interact();
    }

    @Override
    public void play() {
        this.startView.setVisible(false);
        this.playView.interact();
    }

    @Override
    public boolean resume() {
        resumeView.resume();
        if (resumeView.isResumedGame()) {
            this.playView.reset();
            return true;
        }
        this.playView.setVisible(false);
        System.exit(0);
        return false;
    }
}
