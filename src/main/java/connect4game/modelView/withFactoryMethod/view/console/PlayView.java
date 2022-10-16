package main.java.connect4game.modelView.withFactoryMethod.view.console;

import main.java.connect4game.modelView.withFactoryMethod.domain.Game;
import main.java.connect4game.modelView.withFactoryMethod.view.WithGameView;

public class PlayView extends WithGameView {
    public PlayView(Game game) {
        super(game);
    }

    public void interact() {
        do {
            new PlayerView(this.game).interact();
            this.game.next();
            new BoardView(this.game).write();
        } while (!this.game.isGameFinished());
        new MessageView(this.game).writeResult();
    }
}
