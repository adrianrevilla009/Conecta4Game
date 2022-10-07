package main.java.connect4game.domain;

import java.util.ArrayList;
import java.util.List;

public class Connect4Game {
    private Board board;
    private List<Turn> turnList;
    private Player player1;
    private Player player2;
    private InitialDraw initialDraw;

    public Connect4Game() {
        this.board = new Board();
        this.turnList = new ArrayList<>();
        this.player1 = new Player("Pepe", Color.GREEN);
        this.player2 = new Player("Juan", Color.BLUE);
        this.initialDraw = new InitialDraw(player1, player2);
    }

    public void playGame() {
        System.out.println("Starting new game!");
        this.player1.useBoard(this.board);
        this.player2.useBoard(this.board);
        this.play();
        System.out.println("Ending game!");
    }

    private void play() {
        Player actualTurnPlayer = this.initialDraw.whoStartsGame();
        Player lastTurnPlayer = actualTurnPlayer;
        while(!board.isGameFinished()) {
            Turn turn = new Turn(actualTurnPlayer);
            this.turnList.add(turn);
            turn.play();
            this.board.write();
            actualTurnPlayer = this.whoIsNext(lastTurnPlayer);
        }
    }

    private Player whoIsNext(Player lastTurnPlayer) {
        if (lastTurnPlayer.getColor() == this.player1.getColor()) {
            return this.player2;
        } else {
            return this.player1;
        }
    }

}
