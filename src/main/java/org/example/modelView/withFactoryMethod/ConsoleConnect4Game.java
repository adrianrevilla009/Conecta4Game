package org.example.modelView.withFactoryMethod;

import org.example.modelView.withFactoryMethod.domain.Game;
import org.example.modelView.withFactoryMethod.view.console.ConsoleView;

public class ConsoleConnect4Game extends Connect4Game {
    public ConsoleView createView(Game game) {
        return new ConsoleView(game);
    }

    public static void main(String[] args) {
        new ConsoleConnect4Game().play();
    }
}
