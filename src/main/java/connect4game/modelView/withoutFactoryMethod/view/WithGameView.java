package main.java.connect4game.modelView.withoutFactoryMethod.view;

import main.java.connect4game.modelView.withoutFactoryMethod.domain.Game;

public class WithGameView {
    protected Game game;

    protected WithGameView(Game game) {
        this.game = game;
    }
}
