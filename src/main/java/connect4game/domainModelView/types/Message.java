package main.java.connect4game.domainModelView.types;

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

    @Override
    public String toString() {
        return message;
    }
}
