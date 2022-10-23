package main.java.connect4game.modelViewPresenter.passiveView.controller;

import main.java.connect4game.modelViewPresenter.passiveView.types.Message;
import main.java.connect4game.modelViewPresenter.passiveView.domain.Cell;
import main.java.connect4game.modelViewPresenter.passiveView.domain.Game;
import main.java.connect4game.modelViewPresenter.passiveView.types.Color;
import main.java.connect4game.modelViewPresenter.passiveView.types.Error;
import main.java.connect4game.modelViewPresenter.passiveView.view.ViewFactory;

public class PlayController extends Controller {
    public PlayController(Game game, ViewFactory viewFactory) {
        super(game, viewFactory);
    }

    public void control() {
        do {
            if (this.game.getOccupiedCells() < Cell.getNumberCells()) {
                this.putToken();
            }
            this.game.next();
            this.writeBoard();
        } while (!this.game.isGameFinished());
        this.viewFactory.createPlayerView().writeWinner(this.game.getActiveColor());
    }

    private void putToken() {
        Cell cell;
        Error error;
        do {
            cell = this.getCell(Message.ENTER_COLUMN_TO_PUT);
            error = this.getPutTokenError(cell);
        } while (!error.isNull());
        this.game.putToken(cell);
    }

    Cell getCell(Message message) {
        assert message != null;

        Cell cell = this.viewFactory.createCellView().read(message.toString());
        cell.setRow(this.game.getNextFreeRow(cell));
        return cell;
    }

    public boolean isConnect4() {
        return this.game.isConnect4();
    }

    public void next() {
        this.game.next();
    }

    public Color getActiveColor() {
        return this.game.getActiveColor();
    }

    public Error getPutTokenError(Cell cell) {
        return this.game.getPutTokenError(cell);
    }

    public boolean isGameFinished() {
        return this.game.isGameFinished();
    }

    public int getNextFreeRow(Cell cell) {
        return this.game.getNextFreeRow(cell);
    }

    public int getOccupiedCells() {
        return this.game.getOccupiedCells();
    }

    public void reset() {
        this.game.reset();
    }


}
