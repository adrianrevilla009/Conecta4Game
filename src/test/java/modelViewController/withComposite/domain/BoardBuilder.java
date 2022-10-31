package modelViewController.withComposite.domain;

import org.example.modelViewController.withComposite.domain.Board;
import org.example.modelViewController.withComposite.domain.Cell;
import org.example.modelViewController.withComposite.types.Color;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardBuilder {
    private Map<Color, List<Cell>> cellMap;

    public BoardBuilder() {
        cellMap = new HashMap<>();
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

    public BoardBuilder cell(Cell cell, Color color) {
        assert cell.isValid();
        assert !color.isNull();

        this.cellMap.get(color).add(cell);
        return this;
    }

    public BoardBuilder player(Color color) {
        assert !color.isNull();

        this.cellMap.put(color, new ArrayList<>());
        return this;
    }
}
