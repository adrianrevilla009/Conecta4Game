package org.example.modelViewPresenter.passiveView.view.console;

import org.example.modelViewPresenter.passiveView.view.ViewFactory;

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
        return new PlayerView();
    }

    @Override
    public ResumeView createResumeView() {
        return new ResumeView();
    }

    @Override
    public StartView createStartView() {
        return new StartView();
    }

}
