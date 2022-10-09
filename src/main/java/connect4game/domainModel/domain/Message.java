package main.java.connect4game.domainModel.domain;

import main.java.connect4game.domainModel.utils.Console;

public enum Message {
    TITLE("--- CONNECT 4 GAME ---"),
    HORIZONTAL_LINE("---------------"),
    VERTICAL_LINE(" | "),
    ENTER_COORDINATE_TO_PUT("Enter a coordinate to put a token:"),
    PLAYER_WIN("#player player: You win!!! :-)"),
    EQUAL_GAME("Equal game !!! :)"),
    RESUME("Do you want to continue");

    private String message;

    Message(String message) {
        this.message = message;
    }

    void write() {
        Console.getInstance().write(this.message);
    }

    void writeln() {
        Console.getInstance().writeln(this.message);
    }

    void writeln(String player) {
        assert this == Message.PLAYER_WIN;

        Console.getInstance().writeln(this.message.replaceAll("#player", "" + player));
    }

    @Override
    public String toString() {
        return message;
    }
}
