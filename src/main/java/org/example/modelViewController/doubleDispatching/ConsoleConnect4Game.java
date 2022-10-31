package org.example.modelViewController.doubleDispatching;

import org.example.modelViewController.doubleDispatching.view.console.ConsoleView;

public class ConsoleConnect4Game extends Connect4Game {

    @Override
    public ConsoleView createView() {
        return new ConsoleView();
    }

    public static void main(String[] args) {
        new ConsoleConnect4Game().play();
    }
}
