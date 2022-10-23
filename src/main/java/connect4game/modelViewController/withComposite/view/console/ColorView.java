package main.java.connect4game.modelViewController.withComposite.view.console;

import main.java.connect4game.modelViewController.withComposite.types.Color;
import main.java.connect4game.modelViewController.withComposite.utils.Console;

public class ColorView {
    void write(Color color) {
        String string = color.name();
        if (color.isNull()) {
            string = " ";
        }
        Console.getInstance().write(string);
    }
}
