package main.java.connect4game.modelViewController.withoutDoubleDispatching.types;

public enum Error {
    NOT_EMPTY,
    WRONG_COORDINATES,

    FULL_COLUMN,
    NULL;

    public boolean isNull() {
        return this == Error.NULL;
    }
}
