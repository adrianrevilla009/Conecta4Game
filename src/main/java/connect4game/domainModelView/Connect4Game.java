package main.java.connect4game.domainModelView;

import main.java.connect4game.domainModelView.domain.Game;
import main.java.connect4game.domainModelView.view.View;

public class Connect4Game {
    private Game game;
    private View view;

    public Connect4Game() {
        this.game = new Game();
        this.view = new View(this.game);
    }

    private void play() {
        do {
            this.view.start();
            this.view.play();
        } while (this.view.resume());
    }

    public static void main(String[] args) {
        new Connect4Game().play();
    }
}
