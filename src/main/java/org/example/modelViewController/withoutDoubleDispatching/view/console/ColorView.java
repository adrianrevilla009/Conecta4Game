package org.example.modelViewController.withoutDoubleDispatching.view.console;

import org.example.modelViewController.withoutDoubleDispatching.types.Color;
import org.example.modelViewController.withoutDoubleDispatching.utils.Console;

public class ColorView {
    void write(Color color) {
        String string = color.name();
        if (color.isNull()) {
            string = " ";
        }
        Console.getInstance().write(string);
    }
}
