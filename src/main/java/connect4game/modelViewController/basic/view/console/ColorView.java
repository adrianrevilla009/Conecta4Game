package main.java.connect4game.modelViewController.basic.view.console;

import main.java.connect4game.modelViewController.basic.types.Color;
import main.java.connect4game.modelViewController.basic.utils.Console;

public class ColorView {
    void write(Color color) {
        String string = color.name();
        if (color.isNull()) {
            string = " ";
        }
        Console.getInstance().write(string);
    }
}
