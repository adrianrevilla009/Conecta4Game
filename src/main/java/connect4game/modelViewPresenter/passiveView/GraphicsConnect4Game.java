package main.java.connect4game.modelViewPresenter.passiveView;

import main.java.connect4game.modelViewPresenter.passiveView.view.ViewFactory;
import main.java.connect4game.modelViewPresenter.passiveView.view.graphics.GraphicsViewFactory;

public class GraphicsConnect4Game extends Connect4Game {
    @Override
    public ViewFactory createViewFactory() {
        return new GraphicsViewFactory();
    }

    public static void main(String[] args) {
        new GraphicsConnect4Game().play();
    }

}
