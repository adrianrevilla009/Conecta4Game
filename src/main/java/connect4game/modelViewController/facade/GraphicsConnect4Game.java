package main.java.connect4game.modelViewController.facade;

import main.java.connect4game.modelViewController.facade.controller.Logic;
import main.java.connect4game.modelViewController.facade.view.graphics.GraphicsView;

public class GraphicsConnect4Game extends Connect4Game {
    public GraphicsView createView(Logic logic) {
        return new GraphicsView(logic);
    }

    public static void main(String[] args) {
        new GraphicsConnect4Game().play();
    }
}
