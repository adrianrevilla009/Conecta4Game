package main.java.connect4game.modelView.basic.view;

import main.java.connect4game.modelView.basic.domain.Cell;
import main.java.connect4game.modelView.basic.domain.Game;
import main.java.connect4game.modelView.basic.types.Error;
import main.java.connect4game.modelView.basic.types.Message;

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
