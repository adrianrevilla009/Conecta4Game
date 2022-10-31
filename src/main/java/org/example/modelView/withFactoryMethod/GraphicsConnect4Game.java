package org.example.modelView.withFactoryMethod;

import org.example.modelView.withFactoryMethod.domain.Game;
import org.example.modelView.withFactoryMethod.view.graphics.GraphicsView;

public class GraphicsConnect4Game extends Connect4Game {
    public GraphicsView createView(Game game) {
        return new GraphicsView(game);
    }

    public static void main(String[] args) {
        new GraphicsConnect4Game().play();
    }
}
