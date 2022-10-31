package org.example.modelViewController.doubleDispatching.view.console;

import org.example.modelViewController.doubleDispatching.controller.Controller;
import org.example.modelViewController.doubleDispatching.domain.Cell;
import org.example.modelViewController.doubleDispatching.types.Message;
import org.example.modelViewController.doubleDispatching.utils.Console;

public class BoardView {
    void write(Controller controller) {
        new MessageView().writeln(Message.HORIZONTAL_LINE);
        for (int i = 0; i < Cell.ROWS; i++) {
            new MessageView().write(Message.VERTICAL_LINE);
            for (int j = 0; j < Cell.COLUMNS; j++) {
                new ColorView().write(controller.getColor(new Cell(i, j)));
                new MessageView().write(Message.VERTICAL_LINE);
            }
            Console.getInstance().writeln();
        }
        new MessageView().writeln(Message.HORIZONTAL_LINE);
    }
}
