package main.java.connect4game.modelViewController.facade.types;

public enum Message {
    TITLE("--- CONNECT 4 GAME ---"),
    HORIZONTAL_LINE("---------------"),
    VERTICAL_LINE(" | "),
    ENTER_COLUMN_TO_PUT("Enter a column to put a token:"),
    PLAYER_WIN("#player player: You win!!! :-)"),
    EQUAL_GAME("Equal game !!! :)"),
    RESUME("Do you want to continue");

    private String message;

    Message(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
