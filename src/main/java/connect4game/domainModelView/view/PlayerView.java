package main.java.connect4game.domainModelView.view;

import main.java.connect4game.domainModelView.domain.Cell;
import main.java.connect4game.domainModelView.domain.Game;
import main.java.connect4game.domainModelView.types.Error;
import main.java.connect4game.domainModelView.types.Message;

public class PlayerView {
    private Game game;

    PlayerView(Game game) {
        this.game = game;
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
            cell = this.getCell(Message.ENTER_COORDINATE_TO_PUT);
            error = this.getPutTokenError(cell);
        } while (!error.isNull());
        this.game.putToken(cell); // aqui no va el color?
    }

    Cell getCell(Message message) {
        assert message != null;

        return (Cell) new CellView().read(message.toString());
    }

    private Error getPutTokenError(Cell cell) {
        assert cell != null;

        Error error = this.game.getPutTokenError(cell);
        new ErrorView().writeln(error);
        return error;
    }


}
