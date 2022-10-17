package main.java.connect4game.modelViewController.facade.view.console;

import main.java.connect4game.modelViewController.facade.controller.Logic;
import main.java.connect4game.modelViewController.facade.controller.PlayController;
import main.java.connect4game.modelViewController.facade.domain.Cell;
import main.java.connect4game.modelViewController.facade.types.Error;
import main.java.connect4game.modelViewController.facade.types.Message;
import main.java.connect4game.modelViewController.facade.view.ErrorView;
import main.java.connect4game.modelViewController.facade.view.WithLogicView;

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
