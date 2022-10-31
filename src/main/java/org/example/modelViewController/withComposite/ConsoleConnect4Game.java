package org.example.modelViewController.withComposite;

import org.example.modelViewController.withComposite.view.console.ConsoleView;

public class ConsoleConnect4Game extends Connect4Game {

    @Override
    public ConsoleView createView() {
        return new ConsoleView();
    }

    public static void main(String[] args) {
        new ConsoleConnect4Game().play();
    }
}
