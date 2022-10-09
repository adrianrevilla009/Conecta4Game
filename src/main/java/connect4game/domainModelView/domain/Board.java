package main.java.connect4game.domainModelView.domain;

import main.java.connect4game.domainModelView.types.Color;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {
    private Map<Color, List<Cell>> cellMap;

    Board() {
        cellMap = new HashMap<>();
        this.reset();
    }

    void reset() {
        Color.getColors().forEach(color -> {
            if (color != Color.NULL) {
                cellMap.put(color, new ArrayList<>());
            }
        });
    }

    void putToken(Cell cell, Color color) {
        assert !color.isNull();

        cellMap.get(color).add(cell);
    }

    public Color getColor(Cell cell) {

        for (Map.Entry<Color, List<Cell>> entry : cellMap.entrySet()) {
            for (Cell boardCell : entry.getValue()) {
                if (boardCell.getRow() == cell.getRow() && boardCell.getColumn() == cell.getColumn()) {
                    return entry.getKey();
                }
            }
        }
        return Color.NULL;
    }

    boolean isOccupied(Cell cell, Color color) {
        return this.getColor(cell) == color;
    }

    boolean isEmpty(Cell cell) {
        return this.isOccupied(cell, Color.NULL);
    }

    // diagonals algorithm took from : https://stackoverflow.com/questions/32770321/connect-4-check-for-a-win-algorithm
    boolean isConnect4(Color color) {
        assert !color.isNull();

        // horizontal check
        int count = 0;
        for (int i = 0; i < Cell.ROWS; i++) {
            for (int j = 0; j < Cell.COLUMNS; j++) {
                if (this.getColor(new Cell(i,j)) == color) {
                    count++;
                } else {
                    count = 0;
                }
                if (count >= 4)
                    return true;
            }
        }
        //vertical check
        for (int j = 0; j < Cell.COLUMNS; j++) {
            for (int i = 0; i < Cell.ROWS; i++) {
                if (this.getColor(new Cell(i,j)) == color) {
                    count++;
                } else {
                    count = 0;
                }
                if (count >= 4)
                    return true;
            }
        }
        // top-left to bottom-right check
        for (int rowStart = 0; rowStart < Cell.ROWS - 4; rowStart++) {
            count = 0;
            int row, col;
            for (row = rowStart, col = 0; row < Cell.ROWS && col < Cell.COLUMNS; row++, col++) {
                if (this.getColor(new Cell(row, col)) == color) {
                    count++;
                    if (count >= 4) return true;
                } else {
                    count = 0;
                }
            }
        }
        // top-left to bottom-right check
        for (int colStart = 1; colStart < Cell.COLUMNS - 4; colStart++) {
            count = 0;
            int row, col;
            for (row = 0, col = colStart; row < Cell.ROWS && col < Cell.COLUMNS; row++, col++) {
                if (this.getColor(new Cell(row, col)) == color) {
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

    boolean isEqualGame() {
        int total = 0;
        for (Map.Entry<Color, List<Cell>> entry : cellMap.entrySet()) {
            total += entry.getValue().size();
        }
        return total == Cell.getNumberCells();
    }

    int getOccupiedCells() {
        int total = 0;
        for (Map.Entry<Color, List<Cell>> entry : cellMap.entrySet()) {
            total += entry.getValue().size();
        }
        return total;
    }


}
