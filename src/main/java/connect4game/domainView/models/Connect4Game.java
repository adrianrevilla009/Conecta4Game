package main.java.connect4game.domainView.models;

import main.java.connect4game.domainView.views.View;

public class Connect4Game {
    private Game game;
    private View view;

    public void play() {
        // instance game
        this.game = new Game();
        // initialize game
        this.view = new View(game);
    }
}
