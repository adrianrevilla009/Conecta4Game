package org.example.modelView.withoutFactoryMethod.view.console;

import org.example.modelView.withoutFactoryMethod.domain.Game;
import org.example.modelView.withoutFactoryMethod.types.Message;
import org.example.modelView.withoutFactoryMethod.utils.YesNoDialog;
import org.example.modelView.withoutFactoryMethod.view.WithGameView;

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
