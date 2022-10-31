package org.example.modelViewPresenter.passiveView.view.console;

import org.example.modelViewPresenter.passiveView.controller.PlayController;
import org.example.modelViewPresenter.passiveView.types.Message;
import org.example.modelViewPresenter.passiveView.utils.Console;

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
