package main.java.connect4game.modelView.basic.view;

import main.java.connect4game.modelView.basic.types.Color;
import main.java.connect4game.modelView.basic.utils.Console;

public class ColorView {
    void write(Color color) {
        String string = color.name();
        if (color.isNull()) {
            string = " ";
        }
        Console.getInstance().write(string);
    }
}
