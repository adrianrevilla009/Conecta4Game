package main.java.connect4game.modelViewController.withComposite.src.domain;

import main.java.connect4game.modelViewController.withComposite.src.types.Color;
import main.java.connect4game.modelViewController.withComposite.src.utils.Connect4Algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {
    private Map<Color, List<Cell>> cellMap;

    private Connect4Algorithm connect4Algorithm;

    public Board() {
        cellMap = new HashMap<>();
        this.reset();
        connect4Algorithm = new Connect4Algorithm(this);
    }

    public void reset() {
        Color.getColors().forEach(color -> {
            if (color != Color.NULL) {
                cellMap.put(color, new ArrayList<>());
            }
        });
    }

    public void putToken(Cell cell, Color color) {
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

    public boolean isOccupied(Cell cell, Color color) {
        return this.getColor(cell) == color;
    }

    public boolean isEmpty(Cell cell) {
        return this.isOccupied(cell, Color.NULL);
    }

    public boolean isConnect4(Color color) {
        assert !color.isNull();

        return this.connect4Algorithm.isConnect4(color);
    }

    public boolean isEqualGame() {
        int total = 0;
        for (Map.Entry<Color, List<Cell>> entry : cellMap.entrySet()) {
            total += entry.getValue().size();
        }
        return total == Cell.getNumberCells();
    }

    public int getOccupiedCells() {
        int total = 0;
        for (Map.Entry<Color, List<Cell>> entry : cellMap.entrySet()) {
            total += entry.getValue().size();
        }
        return total;
    }

    public Color getColorFromCell(Cell cell) {
        for (Map.Entry<Color, List<Cell>> entry : cellMap.entrySet()) {
            List<Cell> cellList = entry.getValue();
            boolean exists = cellList.stream().
                    anyMatch(cellInList -> cellInList.getRow() == cell.getRow() && cellInList.getColumn() == cell.getColumn());
            if (exists) {
                return entry.getKey();
            }
        }
        return Color.NULL;
    }

    // Given a cell with a fulfilled column, retrieves which row is going to be the next free one
    public int getNextFreeRow(Cell cell) {
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

    public List<String> toCharacterArray() {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < Cell.ROWS; i++) {
            for (int j = 0; j < Cell.COLUMNS; j++) {
                strings.add(this.getColorFromCell(new Cell(i, j)).toString());
            }
        }
        return strings;
    }

    public void setCellMap(Map<Color, List<Cell>> cellMap) {
        this.cellMap = cellMap;
    }

    public Map<Color, List<Cell>> getCellMap() {
        return cellMap;
    }
}
