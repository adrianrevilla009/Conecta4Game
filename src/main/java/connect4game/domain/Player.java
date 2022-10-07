package main.java.connect4game.domain;

public class Player {
    private String name;
    private Color color;

    private Board board;

    public Player(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public void move(Movement movement) {
        System.out.println("moving");
    }

    public Color getColor() {
        return color;
    }

    public void useBoard(Board board) {
        this.board = board;
    }

    public Board getBoard() {
        return board;
    }

    public String getName() {
        return name;
    }
}
