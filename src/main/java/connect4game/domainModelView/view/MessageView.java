package main.java.connect4game.domainModelView.view;

import main.java.connect4game.domainModelView.domain.Game;
import main.java.connect4game.domainModelView.types.Message;
import main.java.connect4game.domainModelView.utils.Console;

public class MessageView {
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

    public void writeResult(Game game) {
        if (game.isConnect4()) {
            this.writeln(Message.PLAYER_WIN, game.getActiveColor().name());
        } else {
            this.write(Message.EQUAL_GAME);
        }
    }
}
