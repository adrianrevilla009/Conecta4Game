package org.example.modelView.withoutFactoryMethod.view.console;

import org.example.modelView.withoutFactoryMethod.types.Color;
import org.example.modelView.withoutFactoryMethod.utils.Console;

public class ColorView {
    void write(Color color) {
        String string = color.name();
        if (color.isNull()) {
            string = " ";
        }
        Console.getInstance().write(string);
    }
}
