package main.java.connect4game.modelViewController.withoutDoubleDispatching;

import main.java.connect4game.modelViewController.withoutDoubleDispatching.view.console.ConsoleView;

public class ConsoleConnect4Game extends Connect4Game {

    public ConsoleView createView() {
        return new ConsoleView();
    }

    public static void main(String[] args) {
        new ConsoleConnect4Game().play();
    }
}
