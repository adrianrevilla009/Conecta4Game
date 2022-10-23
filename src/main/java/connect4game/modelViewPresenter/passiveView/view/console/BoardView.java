package main.java.connect4game.modelViewPresenter.passiveView.view.console;

import main.java.connect4game.modelViewPresenter.passiveView.domain.Cell;
import main.java.connect4game.modelViewPresenter.passiveView.types.Message;
import main.java.connect4game.modelViewPresenter.passiveView.utils.Console;

public class BoardView extends main.java.connect4game.modelViewPresenter.passiveView.BoardView {
    public void write() {
        int cellCounter = 0;
        new MessageView().writeln(Message.HORIZONTAL_LINE);
        for (int i = 0; i < Cell.ROWS; i++) {
            new MessageView().write(Message.VERTICAL_LINE);
            for (int j = 0; j < Cell.COLUMNS; j++) {
                new ColorView().write(this.colors.get(cellCounter));
                new MessageView().write(Message.VERTICAL_LINE);
                cellCounter++;
            }
            Console.getInstance().writeln();
        }
        new MessageView().writeln(Message.HORIZONTAL_LINE);
    }
}
