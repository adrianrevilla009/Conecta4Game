package org.example.basic.domain;

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
