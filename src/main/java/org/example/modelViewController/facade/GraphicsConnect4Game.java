package org.example.modelViewController.facade;

import org.example.modelViewController.facade.controller.Logic;
import org.example.modelViewController.facade.view.graphics.GraphicsView;

public class GraphicsConnect4Game extends Connect4Game {
    public GraphicsView createView(Logic logic) {
        return new GraphicsView(logic);
    }

    public static void main(String[] args) {
        new GraphicsConnect4Game().play();
    }
}
