package main.java.connect4game.modelView.withoutFactoryMethod;

import main.java.connect4game.modelView.withoutFactoryMethod.domain.Game;
import main.java.connect4game.modelView.withoutFactoryMethod.view.View;
import main.java.connect4game.modelView.withoutFactoryMethod.view.console.ConsoleView;

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
