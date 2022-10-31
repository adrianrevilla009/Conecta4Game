package org.example.modelViewController.withoutDoubleDispatching.view.console;

import org.example.modelViewController.withoutDoubleDispatching.controller.ResumeController;
import org.example.modelViewController.withoutDoubleDispatching.types.Message;
import org.example.modelViewController.withoutDoubleDispatching.utils.YesNoDialog;

public class ResumeView {

    public boolean interact(ResumeController resumeController) {
        YesNoDialog isResumed = new YesNoDialog();
        isResumed.read(Message.RESUME.toString());
        if (isResumed.isAffirmative()) {
            resumeController.reset();
        }
        return isResumed.isAffirmative();
    }
}
