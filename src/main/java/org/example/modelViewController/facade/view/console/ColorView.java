package org.example.modelViewController.facade.view.console;

import org.example.modelViewController.facade.types.Color;
import org.example.modelViewController.facade.utils.Console;

public class ColorView {
    void write(Color color) {
        String string = color.name();
        if (color.isNull()) {
            string = " ";
        }
        Console.getInstance().write(string);
    }
}
