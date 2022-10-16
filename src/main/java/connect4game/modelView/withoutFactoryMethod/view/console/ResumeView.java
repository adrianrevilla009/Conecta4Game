package main.java.connect4game.modelView.withoutFactoryMethod.view.console;

import main.java.connect4game.modelView.withoutFactoryMethod.domain.Game;
import main.java.connect4game.modelView.withoutFactoryMethod.types.Message;
import main.java.connect4game.modelView.withoutFactoryMethod.utils.YesNoDialog;
import main.java.connect4game.modelView.withoutFactoryMethod.view.WithGameView;

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
