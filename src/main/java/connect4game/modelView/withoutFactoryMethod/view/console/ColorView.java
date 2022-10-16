package main.java.connect4game.modelView.withoutFactoryMethod.view.console;

import main.java.connect4game.modelView.withoutFactoryMethod.types.Color;
import main.java.connect4game.modelView.withoutFactoryMethod.utils.Console;

public class ColorView {
    void write(Color color) {
        String string = color.name();
        if (color.isNull()) {
            string = " ";
        }
        Console.getInstance().write(string);
    }
}
