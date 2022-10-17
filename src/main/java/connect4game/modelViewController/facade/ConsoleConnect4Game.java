package main.java.connect4game.modelViewController.facade;

import main.java.connect4game.modelViewController.facade.controller.Logic;
import main.java.connect4game.modelViewController.facade.view.console.ConsoleView;

public class ConsoleConnect4Game extends Connect4Game {

    @Override
    public ConsoleView createView(Logic logic) {
        return new ConsoleView(logic);
    }

    public static void main(String[] args) {
        new ConsoleConnect4Game().play();
    }
}
