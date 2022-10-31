package org.example.modelView.withFactoryMethod.view.console;

import org.example.modelView.withFactoryMethod.types.Color;
import org.example.modelView.withFactoryMethod.utils.Console;

public class ColorView {
    void write(Color color) {
        String string = color.name();
        if (color.isNull()) {
            string = " ";
        }
        Console.getInstance().write(string);
    }
}
