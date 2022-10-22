package main.java.connect4game.modelViewController.doubleDispatching.view.console;

import main.java.connect4game.modelViewController.doubleDispatching.types.Color;
import main.java.connect4game.modelViewController.doubleDispatching.utils.Console;

public class ColorView {
    void write(Color color) {
        String string = color.name();
        if (color.isNull()) {
            string = " ";
        }
        Console.getInstance().write(string);
    }
}
