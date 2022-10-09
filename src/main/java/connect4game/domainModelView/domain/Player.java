package main.java.connect4game.domainModelView.domain;

import main.java.connect4game.domainModelView.types.Color;
import main.java.connect4game.domainModelView.types.Error;

public class Player {
    private Color color;
    private Board board;
    private int putTokens;

    Player(Color color, Board board) {
        assert !color.isNull();
        assert board != null;

        this.color = color;
        this.board = board;
        this.putTokens = 0;
    }

    void putToken(Cell cell) {
        assert this.putTokens < this.board.getOccupiedCells();

        this.board.putToken(cell, this.color);
        this.putTokens++;
    }

    Error getPutTokenError(Cell cell) {
        if (!this.board.isEmpty(cell)) {
            return Error.NOT_EMPTY;
        }
        return Error.NULL;
    }

    Color getColor() {
        return this.color;
    }
}
