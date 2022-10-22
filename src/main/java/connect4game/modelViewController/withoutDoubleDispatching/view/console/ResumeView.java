package main.java.connect4game.modelViewController.withoutDoubleDispatching.view.console;

import main.java.connect4game.modelViewController.withoutDoubleDispatching.controller.ResumeController;
import main.java.connect4game.modelViewController.withoutDoubleDispatching.types.Message;
import main.java.connect4game.modelViewController.withoutDoubleDispatching.utils.YesNoDialog;

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
