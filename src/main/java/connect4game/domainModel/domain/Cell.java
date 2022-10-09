package main.java.connect4game.domainModel.domain;

import main.java.connect4game.domainModel.utils.Console;

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

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public static int getNumberCells() {
        return ROWS * COLUMNS;
    }

    public void read(String message) {
        assert message != null;

        Cell cell = new Cell();
        boolean error;
        do {
            Console console = Console.getInstance();
            console.writeln(message);
            this.row = cell.readRows();
            this.column = cell.readColumns();
            error = !this.isValid();
            if (error) {
                Console.getInstance().writeln(this.getErrorMessage());
            }
        } while (error);
    }

    public Integer readRows() {
        Console console = Console.getInstance();
        return console.readInt("Rows: ") - 1;
    }

    public Integer readColumns() {
        Console console = Console.getInstance();
        return console.readInt("Columns: ") - 1;
    }

    public boolean isValid() {
        return this.row < Cell.ROWS && this.row >= 0 && this.column >= 0 && this.column < Cell.COLUMNS;
    }
    public String getErrorMessage() {
        return Error.WRONG_COORDINATES.getMessage();
    }
}
