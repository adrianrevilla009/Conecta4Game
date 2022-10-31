package org.example.modelViewController.doubleDispatching.view.console;

import org.example.modelViewController.doubleDispatching.controller.ResumeController;
import org.example.modelViewController.doubleDispatching.types.Message;
import org.example.modelViewController.doubleDispatching.utils.YesNoDialog;

public class ResumeView {

    public boolean interact(ResumeController resumeController) {
        YesNoDialog isResumed = new YesNoDialog();
        isResumed.read(Message.RESUME.toString());
        if (isResumed.isAffirmative()) {
            resumeController.reset();
        } else {
            resumeController.nextState(); // mediante el cambio de estado omitimos el flujo de control del play del connect4game
        }
        return isResumed.isAffirmative();
    }
}
