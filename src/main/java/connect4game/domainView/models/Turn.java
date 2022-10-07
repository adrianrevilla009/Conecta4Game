package main.java.connect4game.domainView.models;

public class Turn {
    private Player actualPlayer;
    private Player nextPlayer;

    public Player whoIsNext() {
        return this.nextPlayer;
    }

    public void setNextPlayer(Player player) {
        this.nextPlayer = player;
    }
    public void setActualPlayer(Player player) {
        this.actualPlayer = player;
    }

    public Player getActualPlayer() {
        return actualPlayer;
    }
}
