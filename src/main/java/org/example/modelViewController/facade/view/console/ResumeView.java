package org.example.modelViewController.facade.view.console;

import org.example.modelViewController.facade.controller.Logic;
import org.example.modelViewController.facade.types.Message;
import org.example.modelViewController.facade.utils.YesNoDialog;
import org.example.modelViewController.facade.view.WithLogicView;

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
