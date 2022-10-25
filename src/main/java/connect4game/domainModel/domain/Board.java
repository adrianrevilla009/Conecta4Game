package main.java.connect4game.domainModel.domain;

import main.java.connect4game.domainModel.domain.algorithm.Column;
import main.java.connect4game.domainModel.domain.algorithm.Row;
import main.java.connect4game.domainModel.utils.Connect4Algorithm;
import main.java.connect4game.domainModel.utils.Console;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {
    private Map<Color, List<Cell>> cellMap;

    private Connect4Algorithm connect4Algorithm;

    private List<Column> columnList;
    private List<Row> rowList;

    Board() {
        cellMap = new HashMap<>();
        this.reset();
        connect4Algorithm = new Connect4Algorithm(this);
        this.initializeBoard();
    }

    void reset() {
        Color.getColors().forEach(color -> {
            if (color != Color.NULL) {
                cellMap.put(color, new ArrayList<>());
            }
        });
    }

    void initializeBoard() {
        this.columnList = new ArrayList<>();
        for (int i = 0; i < Cell.COLUMNS; i++) {
            this.columnList.add(new Column());
        }
        this.rowList = new ArrayList<>();
        for (int i = 0; i < Cell.ROWS; i++) {
            this.rowList.add(new Row());
        }
    }

    void putToken(Cell cell, Color color) {
        assert !color.isNull();

        cellMap.get(color).add(cell);
        columnList.get(cell.getColumn()).addCell(cell);
        rowList.get(cell.getRow()).addCell(cell);
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

    public List<Column> getColumnList() {
        return columnList;
    }

    public List<Row> getRowList() {
        return rowList;
    }
}
