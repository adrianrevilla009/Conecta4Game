package main.java.connect4game.modelViewController.facade.view.console;

import main.java.connect4game.modelViewController.facade.types.Color;
import main.java.connect4game.modelViewController.facade.utils.Console;

public class ColorView {
    void write(Color color) {
        String string = color.name();
        if (color.isNull()) {
            string = " ";
        }
        Console.getInstance().write(string);
    }
}
