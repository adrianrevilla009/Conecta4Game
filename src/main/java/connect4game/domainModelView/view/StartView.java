package main.java.connect4game.domainModelView.view;

import main.java.connect4game.domainModelView.domain.Game;
import main.java.connect4game.domainModelView.types.Message;

public class StartView extends WithGameView{
    StartView(Game game) {
        super(game);
    }

    void interact() {
        new MessageView(this.game).writeln(Message.TITLE);
        new BoardView(this.game).write();
    }
}
