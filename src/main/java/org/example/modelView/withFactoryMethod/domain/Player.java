package org.example.modelView.withFactoryMethod.domain;

import org.example.modelView.withFactoryMethod.types.Color;
import org.example.modelView.withFactoryMethod.types.Error;

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
        if (this.board.getNextFreeRow(cell) < 0) {
            return Error.FULL_COLUMN;
        }
        return Error.NULL;
    }

    Color getColor() {
        return this.color;
    }
}
