package modelViewController.withComposite.domain;

import org.example.modelViewController.withComposite.domain.Board;
import org.example.modelViewController.withComposite.domain.Cell;
import org.example.modelViewController.withComposite.types.Color;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardBuilder {
    private Map<Color, List<Cell>> cellMap;

    public BoardBuilder() {
        cellMap = new HashMap<>();
    }

    public BoardBuilder cells(Map<Color, List<Cell>> cellMap) {
        assert !cellMap.isEmpty();
        assert cellMap.size() == 2;

        this.cellMap = cellMap;
        return this;
    }

    public Board build() {
        Board board = new Board();

        for (Map.Entry<Color, List<Cell>> entry : cellMap.entrySet()) {
            List<Cell> cellList = entry.getValue();
            for (Cell cell : cellList) {
                board.putToken(cell, entry.getKey());
            }
        }

        return board;
    }
}
