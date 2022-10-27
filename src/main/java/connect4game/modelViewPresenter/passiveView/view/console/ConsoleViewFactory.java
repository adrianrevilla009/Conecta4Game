package main.java.connect4game.modelViewPresenter.passiveView.view.console;

import main.java.connect4game.modelViewPresenter.passiveView.view.ViewFactory;

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
