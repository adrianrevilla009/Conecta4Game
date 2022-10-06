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
        this.player1 = new Player("Pepe", 1);
        this.player2 = new Player("Juan", 2);
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
            if (lastTurnPlayer.getNumber() == this.player1.getNumber()) {
                actualTurnPlayer = this.player2;
            } else {
                actualTurnPlayer = this.player1;
            }
        }
    }

}
