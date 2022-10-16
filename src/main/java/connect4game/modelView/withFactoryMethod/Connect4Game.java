package main.java.connect4game.modelView.withFactoryMethod;

import main.java.connect4game.modelView.withFactoryMethod.domain.Game;
import main.java.connect4game.modelView.withFactoryMethod.view.View;

public abstract class Connect4Game {
    private Game game;
    private View view;

    public Connect4Game() {
        this.game = new Game();
        this.view = this.createView(this.game);
    }

    public abstract View createView(Game game);

    public void play() {
        do {
            this.view.start();
            this.view.play();
        } while (this.view.resume());
    }
}
