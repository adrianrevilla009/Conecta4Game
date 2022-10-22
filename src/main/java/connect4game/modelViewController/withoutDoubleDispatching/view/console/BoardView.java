package main.java.connect4game.modelViewController.withoutDoubleDispatching.view.console;

import main.java.connect4game.modelViewController.withoutDoubleDispatching.controller.Controller;
import main.java.connect4game.modelViewController.withoutDoubleDispatching.domain.Cell;
import main.java.connect4game.modelViewController.withoutDoubleDispatching.types.Message;
import main.java.connect4game.modelViewController.withoutDoubleDispatching.utils.Console;

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
