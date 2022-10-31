package org.example.modelView.withoutFactoryMethod.view;

import org.example.modelView.withoutFactoryMethod.domain.Game;

public class WithGameView {
    protected Game game;

    protected WithGameView(Game game) {
        this.game = game;
    }
}
