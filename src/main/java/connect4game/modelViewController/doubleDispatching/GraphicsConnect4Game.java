package main.java.connect4game.modelViewController.doubleDispatching;

import main.java.connect4game.modelViewController.doubleDispatching.view.graphics.GraphicsView;

public class GraphicsConnect4Game extends Connect4Game {
    public GraphicsView createView() {
        return new GraphicsView();
    }

    public static void main(String[] args) {
        new GraphicsConnect4Game().play();
    }
}
