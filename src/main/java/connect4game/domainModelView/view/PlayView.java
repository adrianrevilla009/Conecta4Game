package main.java.connect4game.domainModelView.view;

import main.java.connect4game.domainModelView.domain.Game;

public class PlayView extends WithGameView{
    PlayView(Game game) {
        super(game);
    }

    void interact() {
        do {
            new PlayerView(this.game).interact();
            this.game.next();
            new BoardView().write(this.game);
        } while (!this.game.isGameFinished());
        new MessageView().writeResult(this.game);
    }
}
