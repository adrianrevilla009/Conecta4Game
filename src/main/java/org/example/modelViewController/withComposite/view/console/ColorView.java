package org.example.modelViewController.withComposite.view.console;

import org.example.modelViewController.withComposite.types.Color;
import org.example.modelViewController.withComposite.utils.Console;

public class ColorView {
    void write(Color color) {
        String string = color.name();
        if (color.isNull()) {
            string = " ";
        }
        Console.getInstance().write(string);
    }
}
