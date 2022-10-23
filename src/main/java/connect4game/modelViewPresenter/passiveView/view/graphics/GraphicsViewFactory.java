package main.java.connect4game.modelViewPresenter.passiveView.view.graphics;

import main.java.connect4game.modelViewPresenter.passiveView.view.ErrorView;
import main.java.connect4game.modelViewPresenter.passiveView.view.ViewFactory;
import main.java.connect4game.modelViewPresenter.passiveView.view.console.*;

public class GraphicsViewFactory extends ViewFactory {

    @Override
    public BoardView createBoardView() {
        return null;
    }

    @Override
    public CellView createCellView() {
        return null;
    }

    @Override
    public PlayerView createPlayerView() {
        return null;
    }

    @Override
    public ResumeView createResumeView() {
        return null;
    }

    @Override
    public StartView createStartView() {
        return null;
    }

    @Override
    public ErrorView createErrorView() {
        return null;
    }
}
