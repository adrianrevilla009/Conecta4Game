package org.example.modelViewPresenter.passiveView;

import org.example.modelViewPresenter.passiveView.view.ViewFactory;
import org.example.modelViewPresenter.passiveView.view.graphics.GraphicsViewFactory;

public class GraphicsConnect4Game extends Connect4Game {
    @Override
    public ViewFactory createViewFactory() {
        return new GraphicsViewFactory();
    }

    public static void main(String[] args) {
        new GraphicsConnect4Game().play();
    }

}
