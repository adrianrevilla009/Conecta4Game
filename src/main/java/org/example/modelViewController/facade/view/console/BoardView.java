package org.example.modelViewController.facade.view.console;

import org.example.modelViewController.facade.controller.Logic;
import org.example.modelViewController.facade.domain.Cell;
import org.example.modelViewController.facade.types.Message;
import org.example.modelViewController.facade.utils.Console;

public class BoardView {
    void write(Logic logic) {
        new MessageView().writeln(Message.HORIZONTAL_LINE);
        for (int i = 0; i < Cell.ROWS; i++) {
            new MessageView().write(Message.VERTICAL_LINE);
            for (int j = 0; j < Cell.COLUMNS; j++) {
                new ColorView().write(logic.getColor(new Cell(i, j)));
                new MessageView().write(Message.VERTICAL_LINE);
            }
            Console.getInstance().writeln();
        }
        new MessageView().writeln(Message.HORIZONTAL_LINE);
    }
}
