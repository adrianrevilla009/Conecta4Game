package main.java.connect4game.domainView.models;

import main.java.connect4game.domainView.Types.Color;
import main.java.connect4game.domainView.views.BoardView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Game {
    private Board board;
    private List<Turn> turnList;
    private Player player1;
    private Player player2;

    public Game() {
        this.board = new Board();
        this.turnList = new ArrayList<>();
        this.player1 = new Player("Pepe", Color.BLUE);
        this.player2 = new Player("Juan", Color.GREEN);
    }


    public boolean isGameFinished() {
        return this.board.isGameFinished();
    }

    public Player whoIsNext() {
        if (this.turnList.size() == 0) {
            return this.whoStartsGame();
        } else {
            return this.turnList.get(this.turnList.size() - 1).whoIsNext();
        }
    }


    public void playGame() {
        while (!this.isGameFinished()) {
            Player nextPlayer = this.whoIsNext();
            if (!this.board.isEmptyCell(1,1)) {
                // set turn
                Turn turn = new Turn();
                turn.setActualPlayer(nextPlayer);

                this.board.move(1,1);
                this.board.putChip(1,1,nextPlayer.getColor());
                new BoardView().write(this.board);

                this.turnList.add(turn);
            }
        }
    }

    public Player whoStartsGame() {
        List<Player> playerList = Arrays.asList(player1, player2);
        return playerList.get((int) ((Math.random() * (2 - 1)) + 1));
    }
}
