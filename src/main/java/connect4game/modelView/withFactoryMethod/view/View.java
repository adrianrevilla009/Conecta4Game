package main.java.connect4game.modelView.withFactoryMethod.view;

import main.java.connect4game.modelView.withFactoryMethod.domain.Game;

public abstract class View extends WithGameView {

    public View(Game game) {
        super(game);
    }

    public abstract void start();

    public abstract void play();

    public abstract boolean resume();
}
