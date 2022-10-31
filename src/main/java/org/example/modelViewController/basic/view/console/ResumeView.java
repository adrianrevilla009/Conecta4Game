package org.example.modelViewController.basic.view.console;

import org.example.modelViewController.basic.controller.ResumeController;
import org.example.modelViewController.basic.types.Message;
import org.example.modelViewController.basic.utils.YesNoDialog;

public class ResumeView {

    private ResumeController resumeController;

    public ResumeView(ResumeController resumeController) {
        this.resumeController = resumeController;
    }

    public boolean interact() {
        YesNoDialog isResumed = new YesNoDialog();
        isResumed.read(Message.RESUME.toString());
        if (isResumed.isAffirmative()) {
            this.resumeController.reset();
        }
        return isResumed.isAffirmative();
    }
}
