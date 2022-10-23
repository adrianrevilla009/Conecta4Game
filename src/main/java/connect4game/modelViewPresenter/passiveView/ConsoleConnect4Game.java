package main.java.connect4game.modelViewPresenter.passiveView;

import main.java.connect4game.modelViewPresenter.passiveView.view.ViewFactory;
import main.java.connect4game.modelViewPresenter.passiveView.view.console.ConsoleViewFactory;

public class ConsoleConnect4Game extends Connect4Game {
    @Override
    public ViewFactory createViewFactory() {
        return new ConsoleViewFactory();
    }
    public static void main(String[] args) {
        new ConsoleConnect4Game().play();
    }
}
