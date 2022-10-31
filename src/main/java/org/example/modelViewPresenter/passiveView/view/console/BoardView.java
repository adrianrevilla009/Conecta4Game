package org.example.modelViewPresenter.passiveView.view.console;

import org.example.modelViewPresenter.passiveView.domain.Cell;
import org.example.modelViewPresenter.passiveView.types.Message;
import org.example.modelViewPresenter.passiveView.utils.Console;

public class BoardView extends org.example.modelViewPresenter.passiveView.BoardView {
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
