package main.java.connect4game.modelView.withFactoryMethod.view.console;

import main.java.connect4game.modelView.withFactoryMethod.domain.Game;
import main.java.connect4game.modelView.withFactoryMethod.types.Message;
import main.java.connect4game.modelView.withFactoryMethod.utils.YesNoDialog;
import main.java.connect4game.modelView.withFactoryMethod.view.WithGameView;

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
