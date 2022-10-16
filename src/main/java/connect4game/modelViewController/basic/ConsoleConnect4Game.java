package main.java.connect4game.modelViewController.basic;

import main.java.connect4game.modelViewController.basic.view.console.ConsoleView;

public class ConsoleConnect4Game extends Connect4Game {

    @Override
    public ConsoleView createView() {
        return new ConsoleView(this.startController, this.playController, this.resumeController);
    }

    public static void main(String[] args) {
        new ConsoleConnect4Game().play();
    }
}
