package org.example.modelViewController.withComposite.view.console;

import org.example.modelViewController.withComposite.controller.ResumeController;
import org.example.modelViewController.withComposite.types.Message;
import org.example.modelViewController.withComposite.utils.YesNoDialog;

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
