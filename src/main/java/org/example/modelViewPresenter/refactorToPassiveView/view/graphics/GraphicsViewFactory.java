package org.example.modelViewPresenter.refactorToPassiveView.view.graphics;

import org.example.modelViewPresenter.refactorToPassiveView.view.ViewFactory;
import org.example.modelViewPresenter.refactorToPassiveView.view.console.CellView;
import org.example.modelViewPresenter.refactorToPassiveView.view.console.ResumeView;
import org.example.modelViewPresenter.refactorToPassiveView.view.console.StartView;
import org.example.modelViewPresenter.refactorToPassiveView.view.console.*;

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
}
