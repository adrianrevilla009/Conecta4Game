package main.java.connect4game.modelView.withFactoryMethod.view.console;

import main.java.connect4game.modelView.withFactoryMethod.types.Color;
import main.java.connect4game.modelView.withFactoryMethod.utils.Console;

public class ColorView {
    void write(Color color) {
        String string = color.name();
        if (color.isNull()) {
            string = " ";
        }
        Console.getInstance().write(string);
    }
}
