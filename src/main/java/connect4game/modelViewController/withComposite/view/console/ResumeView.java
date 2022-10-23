package main.java.connect4game.modelViewController.withComposite.view.console;

import main.java.connect4game.modelViewController.withComposite.controller.ResumeController;
import main.java.connect4game.modelViewController.withComposite.types.Message;
import main.java.connect4game.modelViewController.withComposite.utils.YesNoDialog;

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
