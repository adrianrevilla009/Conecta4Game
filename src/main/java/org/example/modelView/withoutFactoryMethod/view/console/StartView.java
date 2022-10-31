package org.example.modelView.withoutFactoryMethod.view.console;

import org.example.modelView.withoutFactoryMethod.domain.Game;
import org.example.modelView.withoutFactoryMethod.types.Message;
import org.example.modelView.withoutFactoryMethod.view.WithGameView;

public class StartView extends WithGameView {
    public StartView(Game game) {
        super(game);
    }

    public void interact() {
        new MessageView(this.game).writeln(Message.TITLE);
        new BoardView(this.game).write();
    }
}
