package org.example.modelViewController.doubleDispatching.view.console;

import org.example.modelViewController.doubleDispatching.types.Color;
import org.example.modelViewController.doubleDispatching.utils.Console;

public class ColorView {
    void write(Color color) {
        String string = color.name();
        if (color.isNull()) {
            string = " ";
        }
        Console.getInstance().write(string);
    }
}
