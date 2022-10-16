package main.java.connect4game.modelView.withoutFactoryMethod.view.console;

import main.java.connect4game.modelView.withoutFactoryMethod.domain.Game;
import main.java.connect4game.modelView.withoutFactoryMethod.types.Message;
import main.java.connect4game.modelView.withoutFactoryMethod.view.WithGameView;

public class StartView extends WithGameView {
    public StartView(Game game) {
        super(game);
    }

    public void interact() {
        new MessageView(this.game).writeln(Message.TITLE);
        new BoardView(this.game).write();
    }
}
