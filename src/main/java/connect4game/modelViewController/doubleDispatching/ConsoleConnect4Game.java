package main.java.connect4game.modelViewController.doubleDispatching;

import main.java.connect4game.modelViewController.doubleDispatching.view.console.ConsoleView;

public class ConsoleConnect4Game extends Connect4Game {

    @Override
    public ConsoleView createView() {
        return new ConsoleView();
    }

    public static void main(String[] args) {
        new ConsoleConnect4Game().play();
    }
}
