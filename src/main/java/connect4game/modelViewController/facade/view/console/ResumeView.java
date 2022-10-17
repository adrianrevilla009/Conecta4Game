package main.java.connect4game.modelViewController.facade.view.console;

import main.java.connect4game.modelViewController.facade.controller.Logic;
import main.java.connect4game.modelViewController.facade.types.Message;
import main.java.connect4game.modelViewController.facade.utils.YesNoDialog;
import main.java.connect4game.modelViewController.facade.view.WithLogicView;

public class ResumeView extends WithLogicView {

    public ResumeView(Logic logic) {
        super(logic);
    }

    public boolean interact() {
        YesNoDialog isResumed = new YesNoDialog();
        isResumed.read(Message.RESUME.toString());
        if (isResumed.isAffirmative()) {
            this.logic.resume();
        }
        return isResumed.isAffirmative();
    }
}
