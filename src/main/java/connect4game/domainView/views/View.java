package main.java.connect4game.domainView.views;

import main.java.connect4game.domainView.models.Game;

public class View {
    public View(Game game) {
        System.out.println("Starting new game!");
        game.playGame();
    }
}
