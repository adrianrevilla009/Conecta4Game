package org.example.modelViewPresenter.passiveView.view;

import org.example.modelViewPresenter.passiveView.utils.Console;
import org.example.modelViewPresenter.passiveView.types.Error;


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
