package main.java.connect4game.domain;

import java.util.Arrays;
import java.util.List;

public class Turn {
    private Player player;
    private Board board;
    private Movement movement;

    public Turn(Player player) {
        this.player = player;
        this.movement = new Movement();
    }

    public void play() {
        System.out.println("Turn for " + player.getName());
        this.player.move(this.movement);
    }
}
