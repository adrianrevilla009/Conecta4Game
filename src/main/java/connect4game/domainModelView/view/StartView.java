package main.java.connect4game.domainModelView.view;

import main.java.connect4game.domainModelView.domain.Game;
import main.java.connect4game.domainModelView.types.Message;

public class StartView extends WithGameView{
    StartView(Game game) {
        super(game);
    }

    void interact() {
        new MessageView().writeln(Message.TITLE);
        new BoardView().write(this.game);
    }
}
