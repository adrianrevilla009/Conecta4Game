package org.example.modelView.withFactoryMethod.view;

import org.example.modelView.withFactoryMethod.domain.Game;

public class WithGameView {
    protected Game game;

    protected WithGameView(Game game) {
        this.game = game;
    }
}
