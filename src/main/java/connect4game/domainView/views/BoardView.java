package main.java.connect4game.domainView.views;

import main.java.connect4game.domain.Cell;
import main.java.connect4game.domainView.Types.Color;
import main.java.connect4game.domainView.models.Board;

public class BoardView {

    public void write(Board board) {
        for (int i = 0; i < board.getCells().length; i++) {
            for (int j = 0; j < board.getCells().length; j++) {
                // System.out.print(board.getCells()[i][j].getColor() + " ");
                Cell cell = board.getCells()[i][j];
                new ColorView().write(Color.getColorByName(cell.getColor()));
            }
            System.out.println();
        }
    }
}
