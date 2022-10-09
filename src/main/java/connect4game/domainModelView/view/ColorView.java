package main.java.connect4game.domainModelView.view;

import main.java.connect4game.domainModelView.types.Color;
import main.java.connect4game.domainModelView.utils.Console;

public class ColorView {
    void write(Color color) {
        String string = color.name();
        if (color.isNull()) {
            string = " ";
        }
        Console.getInstance().write(string);
    }
}
