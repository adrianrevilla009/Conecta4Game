package main.java.connect4game.domainModelView.view;

import main.java.connect4game.domainModelView.domain.Cell;
import main.java.connect4game.domainModelView.utils.Console;
import main.java.connect4game.domainModelView.domain.Game;
import main.java.connect4game.domainModelView.types.Message;

public class BoardView {
    void write(Game game) {
        new MessageView().writeln(Message.HORIZONTAL_LINE);
        for (int i = 0; i < Cell.ROWS; i++) {
            new MessageView().write(Message.VERTICAL_LINE);
            for (int j = 0; j < Cell.COLUMNS; j++) {
                new ColorView().write(game.getColor(new Cell(i, j)));
                new MessageView().write(Message.VERTICAL_LINE);
            }
            Console.getInstance().writeln();
        }
        new MessageView().writeln(Message.HORIZONTAL_LINE);
    }
}
