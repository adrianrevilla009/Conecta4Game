package org.example.modelViewPresenter.passiveView.view.console;

import org.example.modelViewPresenter.passiveView.types.Color;
import org.example.modelViewPresenter.passiveView.utils.Console;

public class ColorView {
    void write(Color color) {
        String string = color.name();
        if (color.isNull()) {
            string = " ";
        }
        Console.getInstance().write(string);
    }
}
