package main.java.connect4game.domainView.models;

import main.java.connect4game.domain.Cell;
import main.java.connect4game.domainView.Types.Color;

public class Board {
    private Cell[][] cells;

    public Board() {
        this.cells = new Cell[5][7];
    }

    public void move(int x, int y) {

    }

    public void putChip(int x, int y, Color color) {

    }

    public boolean isEmptyCell(int x, int y) {
        return false;
    }

    public boolean isGameFinished() {
        return false;
    }

    public Cell[][] getCells() {
        return cells;
    }
}
