package org.example.modelViewController.facade.view.console;

import org.example.modelViewController.facade.controller.Logic;
import org.example.modelViewController.facade.controller.PlayController;
import org.example.modelViewController.facade.domain.Cell;
import org.example.modelViewController.facade.types.Error;
import org.example.modelViewController.facade.types.Message;
import org.example.modelViewController.facade.view.ErrorView;
import org.example.modelViewController.facade.view.WithLogicView;

public class PlayerView extends WithLogicView {

    PlayerView(Logic logic) {
        super(logic);
    }

    void interact() {
        if (this.logic.getOccupiedCells() < Cell.getNumberCells()) {
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
        this.logic.putToken(cell);
    }

    Cell getCell(Message message) {
        assert message != null;

        Cell cell = new CellView().read(message.toString());
        cell.setRow(this.logic.getNextFreeRow(cell));
        return cell;
    }

    private Error getPutTokenError(Cell cell) {
        assert cell != null;

        Error error = this.logic.getPutTokenError(cell);
        new ErrorView().writeln(error);
        return error;
    }


}
