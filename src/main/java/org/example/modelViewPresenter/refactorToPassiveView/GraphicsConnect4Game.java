package org.example.modelViewPresenter.refactorToPassiveView;

import org.example.modelViewPresenter.refactorToPassiveView.view.ViewFactory;
import org.example.modelViewPresenter.refactorToPassiveView.view.graphics.GraphicsView;
import org.example.modelViewPresenter.refactorToPassiveView.view.graphics.GraphicsViewFactory;

public class GraphicsConnect4Game extends Connect4Game {

    @Override
    public ViewFactory createViewFactory() {
        return new GraphicsViewFactory();
    }

    public static void main(String[] args) {
        new GraphicsConnect4Game().play();
    }
}
