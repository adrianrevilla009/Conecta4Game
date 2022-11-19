package org.example.modelViewPresenter.refactorToPassiveView.view.console;

import org.example.modelViewPresenter.refactorToPassiveView.controller.ResumeController;
import org.example.modelViewPresenter.refactorToPassiveView.types.Message;
import org.example.modelViewPresenter.refactorToPassiveView.utils.YesNoDialog;

public class ResumeView {

    private ResumeController resumeController;

    public ResumeView(ResumeController resumeController) {
        this.resumeController = resumeController;
    }

    public boolean read() {
        YesNoDialog isResumed = new YesNoDialog();
        isResumed.read(Message.RESUME.toString());
        return isResumed.isAffirmative();
    }
}
