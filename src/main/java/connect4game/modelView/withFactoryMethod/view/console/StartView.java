package main.java.connect4game.modelView.withFactoryMethod.view.console;

import main.java.connect4game.modelView.withFactoryMethod.domain.Game;
import main.java.connect4game.modelView.withFactoryMethod.types.Message;
import main.java.connect4game.modelView.withFactoryMethod.view.WithGameView;

public class StartView extends WithGameView {
    public StartView(Game game) {
        super(game);
    }

    public void interact() {
        new MessageView(this.game).writeln(Message.TITLE);
        new BoardView(this.game).write();
    }
}
