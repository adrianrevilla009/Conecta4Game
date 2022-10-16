package main.java.connect4game.modelView.basic.view;

import main.java.connect4game.modelView.basic.domain.Game;

public class WithGameView {
    protected Game game;

    protected WithGameView(Game game) {
        this.game = game;
    }
}
