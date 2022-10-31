package org.example.modelViewController.doubleDispatching.view.graphics;

import org.example.modelViewController.doubleDispatching.domain.Cell;
import org.example.modelViewController.doubleDispatching.domain.Game;
import org.example.modelViewController.doubleDispatching.types.Color;
import org.example.modelViewController.doubleDispatching.types.Message;

import javax.swing.*;
import java.awt.*;

public class GameView extends JPanel {

    private Game game;

    GameView(Game game) {
        this.game = game;
        this.setLayout(new GridBagLayout());
    }

    void write() {
        this.removeAll();
        this.setLayout(new GridBagLayout());
        for (int i = 0; i < Cell.ROWS; i++) {
            this.printRowBoard(i);
        }
    }

    private void printRowBoard(int row) {
        String boardRowToPresent = "";
        boardRowToPresent += Message.VERTICAL_LINE.toString();
        for (int j = 0; j < Cell.COLUMNS; j++) {
            boardRowToPresent += this.getSquareBoardText(row, j);
        }
        JLabel label = new JLabel(boardRowToPresent);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(label, new Constraints(0, row + 1, 10, 1));
    }

    private String getSquareBoardText(int row, int column) {
        String squareBoardToPresent = "";
        Color color = this.game.getColor(new Cell(row, column));
        if (color.isNull()) {
            squareBoardToPresent += "-";
        } else {
            squareBoardToPresent += color.toString();
        }
        squareBoardToPresent += Message.VERTICAL_LINE.toString();
        return squareBoardToPresent;
    }

}
