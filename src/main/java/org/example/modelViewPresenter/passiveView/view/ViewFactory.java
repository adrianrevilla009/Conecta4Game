package org.example.modelViewPresenter.passiveView.view;

import org.example.modelViewPresenter.passiveView.view.console.*;

public abstract class ViewFactory {
    public abstract BoardView createBoardView();
    public abstract CellView createCellView();
    public abstract PlayerView createPlayerView();
    public abstract ResumeView createResumeView();
    public abstract StartView createStartView();
}
