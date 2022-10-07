package main.java.connect4game.domainView.models;

import main.java.connect4game.domainView.Types.Color;

public class Player {
    private String name;
    private Color color;

    private Board board;

    public Player(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    private void move(int x, int y) {
        this.board.move(x, y);
    }

    public Color getColor() {
        return color;
    }
}
