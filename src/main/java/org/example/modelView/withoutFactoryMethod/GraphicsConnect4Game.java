package org.example.modelView.withoutFactoryMethod;

import org.example.modelView.withoutFactoryMethod.domain.Game;
import org.example.modelView.withoutFactoryMethod.view.View;
import org.example.modelView.withoutFactoryMethod.view.graphics.GraphicsView;

public class GraphicsConnect4Game {

    private Game game;
    private View view;

    public GraphicsConnect4Game() {
        this.game = new Game();
        this.view = new GraphicsView(this.game);
    }

    public void play() {
        do {
            this.view.start();
            this.view.play();
        } while (this.view.resume());
    }

    public static void main(String[] args) {
        new GraphicsConnect4Game().play();
    }
}
