package main.java.connect4game.domainModelView.domain;

public class Cell {
    private int row;
    private int column;

    public static int ROWS = 5;
    public static int COLUMNS = 7;

    public Cell(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public Cell() {
    }

    public boolean isValid() {
        return this.column >= 0 && this.column < Cell.COLUMNS;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public static int getNumberCells() {
        return ROWS * COLUMNS;
    }

    public void setRow(int row) {
        this.row = row;
    }
}
