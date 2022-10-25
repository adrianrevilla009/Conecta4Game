package main.java.connect4game.domainModel.utils;

import main.java.connect4game.domainModel.domain.Board;
import main.java.connect4game.domainModel.domain.Cell;
import main.java.connect4game.domainModel.domain.Color;
import main.java.connect4game.domainModel.domain.algorithm.Column;
import main.java.connect4game.domainModel.domain.algorithm.Row;

import java.util.List;

public class Connect4Algorithm {
    private Board board;

    public Connect4Algorithm(Board board) {
        this.board = board;
    }

    // diagonals algorithm took from : https://stackoverflow.com/questions/32770321/connect-4-check-for-a-win-algorithm
    public boolean isConnect4(Color color) {
        return isConnect4Horizontally(color) || isConnect4Vertically(color) ||
                isConnect4DownDiagonally(color) || isConnect4UpDiagonally(color);
    }

    // horizontal check
    /*private boolean isConnect4Horizontally(Color color) {
        int count = 0;
        for (int i = 0; i < Cell.ROWS; i++) {
            for (int j = 0; j < Cell.COLUMNS; j++) {
                if (this.board.getColor(new Cell(i,j)) == color) {
                    count++;
                } else {
                    count = 0;
                }
                if (count >= 4)
                    return true;
            }
        }
        return false;
    }*/
    private boolean isConnect4Horizontally(Color color) {
        for (Row row : this.board.getRowList()) {
            List<Cell> cellList = row.getCellList();
            int count = 0;
            for (Cell cell : cellList) {
                if (this.board.getColor(cell) == color) {
                    count++;
                } else {
                    count = 0;
                }
            }
            if (count == 4) {
                return true;
            }
        }
        return false;
    }

    // vertical check
    /*private boolean isConnect4Vertically(Color color) {
        int count = 0;
        for (int j = 0; j < Cell.COLUMNS; j++) {
            for (int i = 0; i < Cell.ROWS; i++) {
                if (this.board.getColor(new Cell(i,j)) == color) {
                    count++;
                } else {
                    count = 0;
                }
                if (count >= 4)
                    return true;
            }
        }
        return false;
    }*/
    private boolean isConnect4Vertically(Color color) {
        for (Column column : this.board.getColumnList()) {
            List<Cell> cellList = column.getCellList();
            int count = 0;
            for (Cell cell : cellList) {
                if (this.board.getColor(cell) == color) {
                    count++;
                } else {
                    count = 0;
                }
            }
            if (count == 4) {
                return true;
            }
        }
        return false;
    }

    // top-left to bottom-right down half quadrant check
    private boolean isConnect4DownDiagonally(Color color) {
        for (int i = 0; i < Cell.ROWS - 4; i++) {
            int count = 0;
            for (int j = 0; i < Cell.ROWS && j < Cell.COLUMNS; i++, j++) {
                if (this.board.getColor(new Cell(i, j)) == color) {
                    count++;
                    if (count >= 4) {
                        return true;
                    }
                } else {
                    count = 0;
                }
            }
        }
        return false;
    }

    // top-left to bottom-right up half quadrant check
    private boolean isConnect4UpDiagonally(Color color) {
        for (int j = 1; j < Cell.COLUMNS - 4; j++) {
            int count = 0;
            for (int i = 0; i < Cell.ROWS && j < Cell.COLUMNS; i++, j++) {
                if (this.board.getColor(new Cell(i, j)) == color) {
                    count++;
                    if (count >= 4) {
                        return true;
                    }
                } else {
                    count = 0;
                }
            }
        }
        return false;
    }
}
