package main.java.connect4game.modelViewController.facade.view.console;

import main.java.connect4game.modelViewController.facade.controller.Logic;
import main.java.connect4game.modelViewController.facade.domain.Cell;
import main.java.connect4game.modelViewController.facade.types.Message;
import main.java.connect4game.modelViewController.facade.utils.Console;

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
