package main.java.connect4game.modelView.withFactoryMethod.view.graphics;

import main.java.connect4game.modelView.withFactoryMethod.domain.Cell;
import main.java.connect4game.modelView.withFactoryMethod.domain.Game;
import main.java.connect4game.modelView.withFactoryMethod.types.Error;
import main.java.connect4game.modelView.withFactoryMethod.view.ErrorView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class CellPutView extends CellView {

    private Cell cell;

    private Game game;

    private boolean isColumnIntroduced;

    CellPutView(Game game) {
        super();
        this.game = game;
        this.resetCell();
        this.titleLabel = new JLabel(ENTER_CELL_TO_PUT);
        this.add(titleLabel, new Constraints(0, 0, 1, 1));
        this.button = new JButton(CellView.ACCEPT);
        this.add(button, new Constraints(0, 5, 1, 1));
        this.button.addActionListener(this);
        this.button.addKeyListener(this);
        this.isColumnIntroduced = false;
    }

    void resetCell() {
        this.cell = new Cell();
        this.isColumnIntroduced = false;
    }

    public Cell getCell() {
        return this.cell;
    }

    public void actionPerformed(final ActionEvent event) {
        Cell cellInserted = new Cell(0, Integer.parseInt(this.textFieldColumn.getText()) - 1);
        cellInserted.setRow(this.game.getNextFreeRow(cellInserted));
        Error error;

        if (cellInserted.getRow() > Cell.ROWS || cellInserted.getColumn() > Cell.COLUMNS) {
            error = Error.WRONG_COORDINATES;
        } else if (cellInserted.getRow() == Cell.ROWS) {
            error = Error.FULL_COLUMN;
        } else {
            error = Error.NULL;
        }
        if (error.isNull()) {
            this.cell = new Cell(cellInserted.getRow(), cellInserted.getColumn());
        } else {
            JOptionPane.showMessageDialog(null, ErrorView.MESSAGES[error.ordinal()], "ERROR",
                    JOptionPane.WARNING_MESSAGE);
        }
        this.textFieldColumn.setText("");
        this.isColumnIntroduced = true;
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }

    public boolean isColumnIntroduced() {
        return isColumnIntroduced;
    }
}