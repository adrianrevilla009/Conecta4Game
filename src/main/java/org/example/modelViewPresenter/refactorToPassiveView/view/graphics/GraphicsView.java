package org.example.modelViewPresenter.refactorToPassiveView.view.graphics;

import org.example.modelViewPresenter.refactorToPassiveView.controller.PlayController;
import org.example.modelViewPresenter.refactorToPassiveView.controller.ResumeController;
import org.example.modelViewPresenter.refactorToPassiveView.controller.StartController;
import org.example.modelViewPresenter.refactorToPassiveView.view.View;

public class GraphicsView extends View {
    private StartView startView;
    private PlayView playView;
    private ResumeView resumeView;


    public GraphicsView(StartController startController, PlayController playController,
                        ResumeController resumeController) {
        super(startController, playController, resumeController);
        this.startView = new StartView(startController);
        this.playView = new PlayView(playController);
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
