package main.java.connect4game.modelViewController.facade.view.console;

import main.java.connect4game.modelViewController.facade.controller.Logic;
import main.java.connect4game.modelViewController.facade.types.Message;
import main.java.connect4game.modelViewController.facade.utils.Console;

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

    public void writeResult(Logic logic) {
        if (logic.isConnect4()) {
            this.writeln(Message.PLAYER_WIN, logic.getActiveColor().name());
        } else {
            this.write(Message.EQUAL_GAME);
        }
    }
}
