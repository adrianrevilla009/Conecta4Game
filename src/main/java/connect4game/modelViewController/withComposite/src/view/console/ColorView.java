package main.java.connect4game.modelViewController.withComposite.src.view.console;

import main.java.connect4game.modelViewController.withComposite.src.types.Color;
import main.java.connect4game.modelViewController.withComposite.src.utils.Console;

public class ColorView {
    void write(Color color) {
        String string = color.name();
        if (color.isNull()) {
            string = " ";
        }
        Console.getInstance().write(string);
    }
}
