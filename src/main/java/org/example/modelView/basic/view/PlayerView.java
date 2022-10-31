package org.example.modelView.basic.view;

import org.example.modelView.basic.domain.Cell;
import org.example.modelView.basic.domain.Game;
import org.example.modelView.basic.types.Message;
import org.example.modelView.basic.types.Error;

public class PlayerView extends WithGameView {

    PlayerView(Game game) {
        super(game);
    }

    void interact() {
        if (this.game.getOccupiedCells() < Cell.getNumberCells()) {
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
        this.game.putToken(cell);
    }

    Cell getCell(Message message) {
        assert message != null;

        Cell cell = new CellView().read(message.toString());
        cell.setRow(this.game.getNextFreeRow(cell));
        return cell;
    }

    private Error getPutTokenError(Cell cell) {
        assert cell != null;

        Error error = this.game.getPutTokenError(cell);
        new ErrorView().writeln(error);
        return error;
    }


}
