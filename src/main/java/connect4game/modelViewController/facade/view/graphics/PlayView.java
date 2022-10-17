package main.java.connect4game.modelViewController.facade.view.graphics;

import main.java.connect4game.modelViewController.facade.controller.Logic;
import main.java.connect4game.modelViewController.facade.domain.Cell;
import main.java.connect4game.modelViewController.facade.types.Error;
import main.java.connect4game.modelViewController.facade.types.Message;
import main.java.connect4game.modelViewController.facade.view.ErrorView;

import javax.swing.*;
import java.awt.*;

class PlayView extends JFrame {
    private CellPutView cellPutView;
    private GameView gameView;

    private Logic logic;

    PlayView(Logic logic) {
        super(Message.TITLE.toString());
        assert logic != null;

        this.logic = logic;
        this.getContentPane().setLayout(new GridBagLayout());
        this.setSize(400, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.gameView = new GameView(this.logic.getGame());
        this.getContentPane().add(this.gameView);
        this.gameView.write();
        this.setVisible(true);
        this.cellPutView = new CellPutView(this.logic.getGame());
        this.getContentPane().add(this.cellPutView, new Constraints(0, 1, 3, 1));
        this.gameView.removeAll();
        this.setVisible(true);
    }

    void interact() {
        this.gameView.removeAll();
        this.gameView.write();
        this.setVisible(true);
        this.logic.next(); // we need to set random start user
        do {
            if (this.logic.getOccupiedCells() < Cell.getNumberCells()) {
                this.put();
            }
            this.logic.next();
            this.gameView.write();
            this.setVisible(true);
        } while (!this.logic.isGameFinished());
        this.showWinMessage();
        this.setVisible(true);
    }

    private void put() {
        Cell cell;
        Error error;
        boolean isColumnIntroduced;
        do {
            this.setVisible(true);
            do {
                cell = this.cellPutView.getCell();
                isColumnIntroduced = this.cellPutView.isColumnIntroduced();
                System.out.println("");
            } while (!isColumnIntroduced);
            error = this.logic.getPutTokenError(cell);
            if (!error.isNull()) {
                JOptionPane.showMessageDialog(null, ErrorView.MESSAGES[error.ordinal()], "ERROR",
                        JOptionPane.WARNING_MESSAGE);
                this.cellPutView.resetCell();
            } else {
                this.logic.putToken(cell);
                this.cellPutView.resetCell();
            }
        } while (!isColumnIntroduced);
    }

    private void showWinMessage() {
        if (this.logic.isConnect4()) {
            JOptionPane.showMessageDialog(null,
                    Message.PLAYER_WIN.toString().replaceAll("#player", "" + this.logic.getActiveColor().toString()),
                    "GAME FINISHED",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, Message.EQUAL_GAME, "GAME FINISHED",
                    JOptionPane.WARNING_MESSAGE);
        }
    }

    public void reset() {
        this.logic.reset();
    }

    public int getOccupiedCells() {
        return this.logic.getOccupiedCells();
    }

}