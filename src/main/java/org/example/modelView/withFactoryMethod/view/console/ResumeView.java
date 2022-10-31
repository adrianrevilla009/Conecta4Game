package org.example.modelView.withFactoryMethod.view.console;

import org.example.modelView.withFactoryMethod.domain.Game;
import org.example.modelView.withFactoryMethod.types.Message;
import org.example.modelView.withFactoryMethod.utils.YesNoDialog;
import org.example.modelView.withFactoryMethod.view.WithGameView;

public class ResumeView extends WithGameView {
    public ResumeView(Game game) {
        super(game);
    }

    public boolean interact() {
        YesNoDialog isResumed = new YesNoDialog();
        isResumed.read(Message.RESUME.toString());
        if (isResumed.isAffirmative()) {
            this.game.reset();
        }
        return isResumed.isAffirmative();
    }
}
