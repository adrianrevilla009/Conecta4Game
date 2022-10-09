package main.java.connect4game.domainModelView.view;

import main.java.connect4game.domainModelView.types.Error;
import main.java.connect4game.domainModelView.utils.Console;

public class ErrorView {
    public static final String[] MESSAGES = {
            "The square is not empty",
            "The coordinates are wrong"
    };

    public void writeln(Error error) {
        if (!error.isNull()) {
            Console.getInstance().writeln(ErrorView.MESSAGES[error.ordinal()]);
        }
    }
}
