package org.example.modelView.basic.view;

import org.example.modelView.basic.types.Color;
import org.example.modelView.basic.utils.Console;

public class ColorView {
    void write(Color color) {
        String string = color.name();
        if (color.isNull()) {
            string = " ";
        }
        Console.getInstance().write(string);
    }
}
