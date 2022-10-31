package org.example.modelViewController.facade.view.console;

import org.example.modelViewController.facade.controller.Logic;
import org.example.modelViewController.facade.types.Message;
import org.example.modelViewController.facade.utils.Console;

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
