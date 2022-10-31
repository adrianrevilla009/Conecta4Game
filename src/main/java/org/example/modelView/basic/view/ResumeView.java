package org.example.modelView.basic.view;

import org.example.modelView.basic.domain.Game;
import org.example.modelView.basic.types.Message;
import org.example.modelView.basic.utils.YesNoDialog;

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
