package org.example.modelView.withoutFactoryMethod.view;

import org.example.modelView.withoutFactoryMethod.domain.Game;

public abstract class View extends WithGameView {

    public View(Game game) {
        super(game);
    }

    public abstract void start();

    public abstract void play();

    public abstract boolean resume();
}
