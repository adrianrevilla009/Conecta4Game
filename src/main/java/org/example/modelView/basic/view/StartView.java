package org.example.modelView.basic.view;

import org.example.modelView.basic.domain.Game;
import org.example.modelView.basic.types.Message;

public class StartView extends WithGameView{
    StartView(Game game) {
        super(game);
    }

    void interact() {
        new MessageView(this.game).writeln(Message.TITLE);
        new BoardView(this.game).write();
    }
}
