package org.example.modelViewController.basic.view.console;

import org.example.modelViewController.basic.controller.PlayController;
import org.example.modelViewController.basic.types.Message;
import org.example.modelViewController.basic.utils.Console;

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

    public void writeResult(PlayController playController) {
        if (playController.isConnect4()) {
            this.writeln(Message.PLAYER_WIN, playController.getActiveColor().name());
        } else {
            this.write(Message.EQUAL_GAME);
        }
    }
}
