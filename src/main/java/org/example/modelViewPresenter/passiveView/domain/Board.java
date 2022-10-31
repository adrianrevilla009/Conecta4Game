package org.example.modelViewPresenter.passiveView.domain;

import org.example.modelViewPresenter.passiveView.types.Color;
import org.example.modelViewPresenter.passiveView.utils.Connect4Algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {
    private Map<Color, List<Cell>> cellMap;

    private Connect4Algorithm connect4Algorithm;

    Board() {
        cellMap = new HashMap<>();
        this.reset();
        connect4Algorithm = new Connect4Algorithm(this);
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

    boolean isConnect4(Color color) {
        assert !color.isNull();

        return this.connect4Algorithm.isConnect4(color);
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

    // Given a cell with a fulfilled column, retrieves which row is going to be the next free one
    int getNextFreeRow(Cell cell) {
        int nextValue = Cell.ROWS;

        for (Map.Entry<Color, List<Cell>> entry : cellMap.entrySet()) {
            for (Cell cell1 : entry.getValue()) {
                if (cell1.getColumn() ==cell.getColumn() && cell1.getRow() < nextValue) {
                    nextValue = cell1.getRow();
                }
            }
        }
        nextValue -= 1;

        return nextValue;
    }
}
