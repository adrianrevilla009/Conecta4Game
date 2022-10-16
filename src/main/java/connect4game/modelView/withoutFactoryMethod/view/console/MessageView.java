package main.java.connect4game.modelView.withoutFactoryMethod.view.console;

import main.java.connect4game.modelView.withoutFactoryMethod.domain.Game;
import main.java.connect4game.modelView.withoutFactoryMethod.types.Message;
import main.java.connect4game.modelView.withoutFactoryMethod.utils.Console;
import main.java.connect4game.modelView.withoutFactoryMethod.view.WithGameView;

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
