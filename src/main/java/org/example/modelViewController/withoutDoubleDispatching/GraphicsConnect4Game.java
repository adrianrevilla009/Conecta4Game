package org.example.modelViewController.withoutDoubleDispatching;

import org.example.modelViewController.withoutDoubleDispatching.controller.Logic;
import org.example.modelViewController.withoutDoubleDispatching.view.graphics.GraphicsView;

public class GraphicsConnect4Game extends Connect4Game {
    public GraphicsView createView() {
        return new GraphicsView();
    }

    public static void main(String[] args) {
        new GraphicsConnect4Game().play();
    }
}
