package main.java.connect4game.modelViewController.withComposite.src;

import main.java.connect4game.modelViewController.withComposite.src.view.console.ConsoleView;

public class ConsoleConnect4Game extends Connect4Game {

    @Override
    public ConsoleView createView() {
        return new ConsoleView();
    }

    public static void main(String[] args) {
        new ConsoleConnect4Game().play();
    }
}
