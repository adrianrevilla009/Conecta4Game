package org.example.modelViewPresenter.refactorToPassiveView.view.console;

import org.example.modelViewPresenter.refactorToPassiveView.controller.PlayController;
import org.example.modelViewPresenter.refactorToPassiveView.controller.ResumeController;
import org.example.modelViewPresenter.refactorToPassiveView.controller.StartController;
import org.example.modelViewPresenter.refactorToPassiveView.view.View;

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

    public StartView getStartView() {
        return startView;
    }

    public PlayView getPlayView() {
        return playView;
    }

    public ResumeView getResumeView() {
        return resumeView;
    }
}
