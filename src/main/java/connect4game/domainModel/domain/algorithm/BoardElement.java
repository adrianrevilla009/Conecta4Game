package main.java.connect4game.domainModel.domain.algorithm;

import main.java.connect4game.domainModel.domain.Cell;

import java.util.ArrayList;
import java.util.List;

public abstract class BoardElement {
    private List<Cell> cellList;

    public BoardElement() {
        this.cellList = new ArrayList<>();
    }
    public void addCell(Cell cell) {
        this.cellList.add(cell);
    }

    public List<Cell> getCellList() {
        return cellList;
    }
}
