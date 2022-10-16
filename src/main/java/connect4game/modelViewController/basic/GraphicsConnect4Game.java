package main.java.connect4game.modelViewController.basic;

import main.java.connect4game.modelViewController.basic.view.graphics.GraphicsView;

public class GraphicsConnect4Game extends Connect4Game {
    public GraphicsView createView() {
        return new GraphicsView(this.startController, this.playController, this.resumeController);
    }

    public static void main(String[] args) {
        new GraphicsConnect4Game().play();
    }
}
