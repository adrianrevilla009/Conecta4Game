package org.example.modelViewController.basic.view.console;

import org.example.modelViewController.basic.types.Color;
import org.example.modelViewController.basic.utils.Console;

public class ColorView {
    void write(Color color) {
        String string = color.name();
        if (color.isNull()) {
            string = " ";
        }
        Console.getInstance().write(string);
    }
}
