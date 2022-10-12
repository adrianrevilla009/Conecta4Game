package main.java.connect4game.domainModel.domain;

import main.java.connect4game.domainModel.utils.Console;

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

    private Color getColor(Cell cell) {

        for (Map.Entry<Color, List<Cell>> entry : cellMap.entrySet()) {
            for (Cell boardCell : entry.getValue()) {
                if (cell.equals(boardCell)) {
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

        if (isConnect4Horizontally(color) || isConnect4Vertically(color) ||
                isConnect4DownDiagonally(color) || isConnect4UpDiagonally(color)) {
            return true;
        }
        return false;
    }

    // horizontal check
    boolean isConnect4Horizontally(Color color) {
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
        return false;
    }

    // vertical check
    boolean isConnect4Vertically(Color color) {
        int count = 0;
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
        return false;
    }

    // top-left to bottom-right down half quadrant check
    boolean isConnect4DownDiagonally(Color color) {
        for (int i = 0; i < Cell.ROWS - 4; i++) {
            int count = 0;
            for (int j = 0; i < Cell.ROWS && j < Cell.COLUMNS; i++, j++) {
                if (this.getColor(new Cell(i, j)) == color) {
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
    boolean isConnect4UpDiagonally(Color color) {
        for (int j = 1; j < Cell.COLUMNS - 4; j++) {
            int count = 0;
            for (int i = 0; i < Cell.ROWS && j < Cell.COLUMNS; i++, j++) {
                if (this.getColor(new Cell(i, j)) == color) {
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

    void write() {
        Message.HORIZONTAL_LINE.writeln();
        for (int i = 0; i < Cell.ROWS; i++) {
            Message.VERTICAL_LINE.write();
            for (int j = 0; j < Cell.COLUMNS; j++) {
                this.getColor(new Cell(i, j)).write();
                Message.VERTICAL_LINE.write();
            }
            Console.getInstance().writeln();
        }
        Message.HORIZONTAL_LINE.writeln();
    }

    // Given a cell, retrieves which row is going to be the next free one
    int getNextFreeRow(Cell cell) {
        int nextValue = Cell.ROWS;

        for (Map.Entry<Color, List<Cell>> entry : cellMap.entrySet()) {
            for (Cell cell1 : entry.getValue()) {
                if (cell1.getColumn() == cell.getColumn() && cell1.getRow() < nextValue) {
                    nextValue = cell1.getRow();
                }
            }
        }
        nextValue -= 1;

        return nextValue;
    }
}
