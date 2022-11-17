package org.example.modelViewPresenter.refactorToPassiveView.view.console;

import org.example.modelViewPresenter.refactorToPassiveView.Connect4Game;
import org.example.modelViewPresenter.refactorToPassiveView.view.ViewFactory;

public class ConsoleViewFactory extends ViewFactory {

    @Override
    public BoardView createBoardView() {
        return new BoardView();
    }

    @Override
    public CellView createCellView() {
        return new CellView();
    }

    @Override
    public PlayerView createPlayerView() {
        return new PlayerView(Connect4Game.playController);
    }

    @Override
    public ResumeView createResumeView() {
        return new ResumeView(Connect4Game.resumeController);
    }

    @Override
    public StartView createStartView() {
        return new StartView(Connect4Game.startController);
    }

}
