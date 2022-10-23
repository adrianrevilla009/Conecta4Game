package main.java.connect4game.modelViewController.withComposite.domain;

import main.java.connect4game.modelViewController.withComposite.types.Color;

class Memento {

    private int activePlayer;
    private char[] boardColors;

    Memento(Board board, Turn turn) {
        this.boardColors = board.toCharacterArray();
        this.activePlayer = turn.getActiveColor().ordinal();
    }

    Board getBoard() {
        Board board = new Board();
        int colorsCount = 0;
        for (int i = 0; i < Cell.ROWS; i++) {
            for (int j = 0; j < Cell.COLUMNS; j++) {
                try {
                    board.putToken(new Cell(i, j), Color.get(this.boardColors[colorsCount]));
                    colorsCount++;
                } catch (Exception e) {

                }
            }
        }
        return board;
    }

    int getActivePlayer() {
        return this.activePlayer;
    }

    int getPlayerPutTokens(Color color) {
        int playerPutTokens = 0;
        for (int i = 0; i < this.boardColors.length; i++) {
            if (Color.get(this.boardColors[i]) == color) {
                playerPutTokens++;
            }
        }
        return playerPutTokens;
    }

}
