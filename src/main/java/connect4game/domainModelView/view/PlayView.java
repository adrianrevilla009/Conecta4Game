package main.java.connect4game.domainModelView.view;

import main.java.connect4game.domainModelView.domain.Game;
import main.java.connect4game.domainModelView.types.Message;

public class PlayView extends WithGameView{
    PlayView(Game game) {
        super(game);
    }

    void interact() {
        do {
            new PlayerView(this.game).interact();
            this.game.next();
            new BoardView().write(this.game);
        } while (!this.game.isConnect4() && !this.game.isEqualGame());
        new MessageView().writeResult(this.game);
    }
}
