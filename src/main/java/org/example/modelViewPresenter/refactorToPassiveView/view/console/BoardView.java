package org.example.modelViewPresenter.refactorToPassiveView.view.console;

import org.example.modelViewPresenter.refactorToPassiveView.types.Color;
import org.example.modelViewPresenter.refactorToPassiveView.controller.Controller;
import org.example.modelViewPresenter.refactorToPassiveView.domain.Cell;
import org.example.modelViewPresenter.refactorToPassiveView.types.Message;
import org.example.modelViewPresenter.refactorToPassiveView.utils.Console;

import java.util.ArrayList;
import java.util.List;

public class BoardView {

    protected List<Color> colors;

    public BoardView() {
        this.colors = new ArrayList<>();
    }

    public void set(Color color) {
        assert this.colors.size() < Cell.ROWS * Cell.COLUMNS;

        this.colors.add(color);
    }

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
