package org.example.modelViewPresenter.refactorToPassiveView;

import org.example.modelViewPresenter.refactorToPassiveView.view.console.ConsoleViewFactory;
import org.example.modelViewPresenter.refactorToPassiveView.view.ViewFactory;
import org.example.modelViewPresenter.refactorToPassiveView.view.console.ConsoleView;

public class ConsoleConnect4Game extends Connect4Game {

    @Override
    public ViewFactory createViewFactory() {
        return new ConsoleViewFactory();
    }

    public static void main(String[] args) {
        new ConsoleConnect4Game().play();
    }
}
