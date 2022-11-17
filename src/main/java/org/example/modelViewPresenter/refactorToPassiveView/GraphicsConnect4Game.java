package org.example.modelViewPresenter.refactorToPassiveView;

import org.example.modelViewPresenter.refactorToPassiveView.view.ViewFactory;
import org.example.modelViewPresenter.refactorToPassiveView.view.graphics.GraphicsView;
import org.example.modelViewPresenter.refactorToPassiveView.view.graphics.GraphicsViewFactory;

public class GraphicsConnect4Game extends Connect4Game {
    public GraphicsView createView() {
        return new GraphicsView(this.startController, this.playController, this.resumeController);
    }

    @Override
    public ViewFactory createViewFactory() {
        return new GraphicsViewFactory();
    }

    public static void main(String[] args) {
        new GraphicsConnect4Game().play();
    }
}
