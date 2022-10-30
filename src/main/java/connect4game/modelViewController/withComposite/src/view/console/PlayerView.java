package main.java.connect4game.modelViewController.withComposite.src.view.console;

import main.java.connect4game.modelViewController.withComposite.src.controller.PlayController;
import main.java.connect4game.modelViewController.withComposite.src.domain.Cell;
import main.java.connect4game.modelViewController.withComposite.src.types.Error;
import main.java.connect4game.modelViewController.withComposite.src.types.Message;
import main.java.connect4game.modelViewController.withComposite.src.view.ErrorView;

public class PlayerView {
    private PlayController playController;

    public PlayerView(PlayController playController) {
        this.playController = playController;
    }

    public void interact() {
        if (this.playController.getOccupiedCells() < Cell.getNumberCells()) {
            this.putToken();
        }
    }

    private void putToken() {
        Cell cell;
        Error error;
        do {
            cell = this.getCell(Message.ENTER_COLUMN_TO_PUT);
            error = this.getPutTokenError(cell);
        } while (!error.isNull());
        this.playController.putToken(cell);
    }

    Cell getCell(Message message) {
        assert message != null;

        Cell cell = new CellView().read(message.toString());
        cell.setRow(this.playController.getNextFreeRowByColumn(cell.getColumn()));
        return cell;
    }

    private Error getPutTokenError(Cell cell) {
        assert cell != null;

        Error error = this.playController.getPutTokenError(cell);
        new ErrorView().writeln(error);
        return error;
    }


}
