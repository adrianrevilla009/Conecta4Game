package org.example.modelViewController.basic.view.console;

import org.example.modelViewController.basic.controller.PlayController;
import org.example.modelViewController.basic.domain.Cell;
import org.example.modelViewController.basic.types.Error;
import org.example.modelViewController.basic.types.Message;
import org.example.modelViewController.basic.view.ErrorView;

public class PlayerView {

    private PlayController playController;

    PlayerView(PlayController playController) {
        this.playController = playController;
    }

    void interact() {
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
        cell.setRow(this.playController.getNextFreeRow(cell));
        return cell;
    }

    private Error getPutTokenError(Cell cell) {
        assert cell != null;

        Error error = this.playController.getPutTokenError(cell);
        new ErrorView().writeln(error);
        return error;
    }


}
