package org.example.modelView.withoutFactoryMethod;

import org.example.modelView.withoutFactoryMethod.domain.Game;
import org.example.modelView.withoutFactoryMethod.view.View;
import org.example.modelView.withoutFactoryMethod.view.console.ConsoleView;

public class ConsoleConnect4Game {
    private Game game;
    private View view;

    public ConsoleConnect4Game() {
        this.game = new Game();
        this.view = new ConsoleView(this.game);
    }
    public void play() {
        do {
            this.view.start();
            this.view.play();
        } while (this.view.resume());
    }

    public static void main(String[] args) {
        new ConsoleConnect4Game().play();
    }
}
