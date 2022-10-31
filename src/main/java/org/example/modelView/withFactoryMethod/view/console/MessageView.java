package org.example.modelView.withFactoryMethod.view.console;

import org.example.modelView.withFactoryMethod.domain.Game;
import org.example.modelView.withFactoryMethod.types.Message;
import org.example.modelView.withFactoryMethod.utils.Console;
import org.example.modelView.withFactoryMethod.view.WithGameView;

public class MessageView extends WithGameView {

    MessageView(Game game) {
        super(game);
    }
    public void write(Message message) {
        Console.getInstance().write(message.toString());
    }

    public void writeln(Message message) {
        Console.getInstance().writeln(message.toString());
    }

    public void writeln(Message message, String player) {
        assert message == Message.PLAYER_WIN;

        Console.getInstance().writeln(message.toString().replaceAll("#player", "" + player));
    }

    public void writeResult() {
        if (this.game.isConnect4()) {
            this.writeln(Message.PLAYER_WIN, this.game.getActiveColor().name());
        } else {
            this.write(Message.EQUAL_GAME);
        }
    }
}
