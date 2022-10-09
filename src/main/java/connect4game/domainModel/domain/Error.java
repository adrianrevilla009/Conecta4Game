package main.java.connect4game.domainModel.domain;

import main.java.connect4game.domainModel.utils.Console;

public enum Error {
    NOT_EMPTY("The square is not empty"),
    WRONG_COORDINATES("The coordinates are wrong"),
    NULL;

    private String message;

    Error(){
    }

    Error(String message){
        this.message = message;
    }

    void writeln() {
        if (!this.isNull()) {
            Console.getInstance().writeln(this.message);
        }
    }

    public boolean isNull() {
        return this == Error.NULL;
    }

    public String getMessage() {
        return message;
    }
}
