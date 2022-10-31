package org.example.basic.domain;

import org.example.basic.utils.Console;

public enum Error {
    NOT_EMPTY("The square is not empty"),
    WRONG_COORDINATES("The coordinates are wrong"),
    FULL_COLUMN("The column is already full, chose another one"),
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
