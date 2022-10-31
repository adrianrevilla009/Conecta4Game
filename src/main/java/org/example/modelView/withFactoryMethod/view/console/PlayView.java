package org.example.modelView.withFactoryMethod.view.console;

import org.example.modelView.withFactoryMethod.domain.Game;
import org.example.modelView.withFactoryMethod.view.WithGameView;

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
