package org.example.modelViewPresenter.passiveView.view.console;

import org.example.modelViewPresenter.passiveView.types.Message;
import org.example.modelViewPresenter.passiveView.utils.YesNoDialog;
import org.example.modelViewPresenter.passiveView.view.ResumeViewInterface;

public class ResumeView implements ResumeViewInterface {
    public boolean read() {
        YesNoDialog isResumed = new YesNoDialog();
        isResumed.read(Message.RESUME.toString());
        return isResumed.isAffirmative();
    }
}
