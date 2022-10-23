package main.java.connect4game.modelViewPresenter.passiveView.view.console;

import main.java.connect4game.modelViewPresenter.passiveView.types.Message;
import main.java.connect4game.modelViewPresenter.passiveView.utils.YesNoDialog;
import main.java.connect4game.modelViewPresenter.passiveView.view.ResumeViewInterface;

public class ResumeView implements ResumeViewInterface {
    public boolean read() {
        YesNoDialog isResumed = new YesNoDialog();
        isResumed.read(Message.RESUME.toString());
        return isResumed.isAffirmative();
    }
}
