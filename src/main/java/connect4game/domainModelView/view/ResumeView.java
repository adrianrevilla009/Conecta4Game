package main.java.connect4game.domainModelView.view;

import main.java.connect4game.domainModelView.domain.Game;
import main.java.connect4game.domainModelView.types.Message;
import main.java.connect4game.domainModelView.utils.YesNoDialog;

public class ResumeView extends WithGameView{
    ResumeView(Game game) {
        super(game);
    }

    boolean interact() {
        YesNoDialog isResumed = new YesNoDialog();
        isResumed.read(Message.RESUME.toString());
        if (isResumed.isAffirmative()) {
            this.game.reset();
        }
        return isResumed.isAffirmative();
    }
}
