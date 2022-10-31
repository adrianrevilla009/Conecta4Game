package org.example.modelViewController.doubleDispatching;

import org.example.modelViewController.doubleDispatching.view.graphics.GraphicsView;

public class GraphicsConnect4Game extends Connect4Game {
    public GraphicsView createView() {
        return new GraphicsView();
    }

    public static void main(String[] args) {
        new GraphicsConnect4Game().play();
    }
}
