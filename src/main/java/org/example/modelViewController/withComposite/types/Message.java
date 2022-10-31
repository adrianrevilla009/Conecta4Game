package org.example.modelViewController.withComposite.types;

public enum Message {
    TITLE("--- CONNECT 4 GAME ---"),
    HORIZONTAL_LINE("---------------"),
    VERTICAL_LINE(" | "),
    ENTER_COLUMN_TO_PUT("Enter a column to put a token:"),
    PLAYER_WIN("#player player: You win!!! :-)"),
    EQUAL_GAME("Equal game !!! :)"),
    RESUME("Do you want to continue"),
    ACTION_COMMAND("Do a action"),
    UNDO_COMMAND("Undo previous action"),
    REDO_COMMAND("Redo previous action");

    private String message;

    Message(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
