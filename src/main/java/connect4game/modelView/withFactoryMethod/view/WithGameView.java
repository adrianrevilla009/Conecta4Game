package main.java.connect4game.modelView.withFactoryMethod.view;

import main.java.connect4game.modelView.withFactoryMethod.domain.Game;

public class WithGameView {
    protected Game game;

    protected WithGameView(Game game) {
        this.game = game;
    }
}
