package main.java.connect4game.domainView.views;

import main.java.connect4game.domainView.Types.Color;
import main.java.connect4game.domainView.models.Board;

public class BoardView {

    public void write(Board board) {
        for (int i = 0; i < board.getCells().length; i++) {
            for (int j = 0; j < board.getCells().length; j++) {
                // System.out.print(board.getCells()[i][j].getColor() + " ");
                new ColorView().write(Color.getColorByName(board.getCells()[i][j].getColor()));
            }
            System.out.println();
        }
    }
}
