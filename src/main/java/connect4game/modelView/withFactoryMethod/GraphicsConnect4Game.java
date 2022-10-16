package main.java.connect4game.modelView.withFactoryMethod;

import main.java.connect4game.modelView.withFactoryMethod.domain.Game;
import main.java.connect4game.modelView.withFactoryMethod.view.graphics.GraphicsView;

public class GraphicsConnect4Game extends Connect4Game {
    public GraphicsView createView(Game game) {
        return new GraphicsView(game);
    }

    public static void main(String[] args) {
        new GraphicsConnect4Game().play();
    }
}
