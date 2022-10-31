package org.example.modelViewController.withComposite.domain;

import org.example.modelViewController.withComposite.types.Color;

import java.util.List;

class Memento {

    private int activePlayer;
    private List<String> boardColors;

    Memento(Board board, Turn turn) {
        this.boardColors = board.toCharacterArray();
        this.activePlayer = turn.getActiveColor().ordinal();
    }

    Board getBoard() {
        Board board = new Board();
        int colorsCount = 0;
        for (int i = 0; i < Cell.ROWS; i++) {
            for (int j = 0; j < Cell.COLUMNS; j++) {
                if (Color.getByName(this.boardColors.get(colorsCount)) != Color.NULL) {
                    board.putToken(new Cell(i, j), Color.getByName(this.boardColors.get(colorsCount)));
                }
                colorsCount++;
            }
        }
        return board;
    }

    int getActivePlayer() {
        return this.activePlayer;
    }

    int getPlayerPutTokens(Color color) {
        int playerPutTokens = 0;
        for (String boardColor : this.boardColors) {
            if (Color.getByName(boardColor) == color) {
                playerPutTokens++;
            }
        }
        return playerPutTokens;
    }

}
