package org.example.modelView.withFactoryMethod.view.console;

import org.example.modelView.withFactoryMethod.domain.Game;
import org.example.modelView.withFactoryMethod.types.Message;
import org.example.modelView.withFactoryMethod.view.WithGameView;

public class StartView extends WithGameView {
    public StartView(Game game) {
        super(game);
    }

    public void interact() {
        new MessageView(this.game).writeln(Message.TITLE);
        new BoardView(this.game).write();
    }
}
