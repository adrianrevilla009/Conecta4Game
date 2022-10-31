package org.example.modelViewController.withComposite.view.console;

import org.example.modelViewController.withComposite.domain.Cell;
import org.example.modelViewController.withComposite.types.Error;
import org.example.modelViewController.withComposite.utils.Console;
import org.example.modelViewController.withComposite.view.ErrorView;

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
