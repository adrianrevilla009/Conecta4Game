package main.java.connect4game.modelView.withFactoryMethod;

import main.java.connect4game.modelView.withFactoryMethod.domain.Game;
import main.java.connect4game.modelView.withFactoryMethod.view.console.ConsoleView;

public class ConsoleConnect4Game extends Connect4Game {
    public ConsoleView createView(Game game) {
        return new ConsoleView(game);
    }

    public static void main(String[] args) {
        new ConsoleConnect4Game().play();
    }
}
