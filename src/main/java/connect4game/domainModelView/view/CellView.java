package main.java.connect4game.domainModelView.view;

import main.java.connect4game.domainModelView.utils.Console;
import main.java.connect4game.domainModelView.domain.Cell;
import main.java.connect4game.domainModelView.types.Error;

public class CellView {
    public Cell createCell() {
        int x = this.readRows();
        int y = this.readColumns();
        return new Cell(x, y);
    }

    public String getErrorMessage() {
        return ErrorView.MESSAGES[Error.WRONG_COORDINATES.ordinal()];
    }

    public Cell read(String message) {
        assert message != null;

        Cell cell;
        boolean error;
        do {
            cell = this.createCell();
            error = !cell.isValid();
            if (error) {
                Console.getInstance().writeln(this.getErrorMessage());
            }
        } while (error);
        return cell;
    }

    public Integer readRows() {
        main.java.connect4game.domainModel.utils.Console console = main.java.connect4game.domainModel.utils.Console.getInstance();
        return console.readInt("Rows: ") - 1;
    }

    public Integer readColumns() {
        main.java.connect4game.domainModel.utils.Console console = main.java.connect4game.domainModel.utils.Console.getInstance();
        return console.readInt("Columns: ") - 1;
    }
}
