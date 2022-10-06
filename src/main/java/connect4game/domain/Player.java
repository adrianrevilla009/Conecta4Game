package main.java.connect4game.domain;

public class Player {
    private String name;
    private int number;

    private Board board;

    public Player(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public void move(Movement movement) {
        System.out.println("moving");
    }

    public int getNumber() {
        return number;
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
