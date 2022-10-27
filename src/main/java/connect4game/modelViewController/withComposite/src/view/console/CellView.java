package main.java.connect4game.modelViewController.withComposite.src.view.console;

import main.java.connect4game.modelViewController.withComposite.src.domain.Cell;
import main.java.connect4game.modelViewController.withComposite.src.types.Error;
import main.java.connect4game.modelViewController.withComposite.src.utils.Console;
import main.java.connect4game.modelViewController.withComposite.src.view.ErrorView;

public class CellView {
    public Cell createCell() {
        int y = this.readColumns();
        return new Cell(0, y);
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

    public Integer readColumns() {
        Console console = Console.getInstance();
        return console.readInt("Columns: ") - 1;
    }
}
