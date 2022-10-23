package main.java.connect4game.modelViewPresenter.passiveView.view.console;

import main.java.connect4game.modelViewPresenter.passiveView.types.Color;
import main.java.connect4game.modelViewPresenter.passiveView.utils.Console;

public class ColorView {
    void write(Color color) {
        String string = color.name();
        if (color.isNull()) {
            string = " ";
        }
        Console.getInstance().write(string);
    }
}
