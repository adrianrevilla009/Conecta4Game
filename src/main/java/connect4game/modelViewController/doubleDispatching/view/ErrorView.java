package main.java.connect4game.modelViewController.doubleDispatching.view;

import main.java.connect4game.modelViewController.doubleDispatching.types.Error;
import main.java.connect4game.modelViewController.doubleDispatching.utils.Console;

public class ErrorView {
    public static final String[] MESSAGES = {
            "The square is not empty",
            "The coordinates are wrong",
            "The column is already full, chose another one"
    };

    public void writeln(Error error) {
        if (!error.isNull()) {
            Console.getInstance().writeln(ErrorView.MESSAGES[error.ordinal()]);
        }
    }
}
