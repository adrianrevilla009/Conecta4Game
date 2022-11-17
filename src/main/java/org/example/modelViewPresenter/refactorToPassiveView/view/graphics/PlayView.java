package org.example.modelViewPresenter.refactorToPassiveView.view.graphics;

import org.example.modelViewPresenter.refactorToPassiveView.controller.PlayController;
import org.example.modelViewPresenter.refactorToPassiveView.domain.Cell;
import org.example.modelViewPresenter.refactorToPassiveView.types.Error;
import org.example.modelViewPresenter.refactorToPassiveView.types.Message;
import org.example.modelViewPresenter.refactorToPassiveView.view.ErrorView;

import javax.swing.*;
import java.awt.*;

class PlayView extends JFrame {
    private CellPutView cellPutView;
    private PlayController playController;
    private GameView gameView;

    PlayView(PlayController playController) {
        super(Message.TITLE.toString());
        assert playController != null;

        this.playController = playController;
        this.getContentPane().setLayout(new GridBagLayout());
        this.setSize(400, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.gameView = new GameView(this.playController.getGame());
        this.getContentPane().add(this.gameView);
        this.gameView.write();
        this.setVisible(true);
        this.cellPutView = new CellPutView(this.playController.getGame());
        this.getContentPane().add(this.cellPutView, new Constraints(0, 1, 3, 1));
        this.gameView.removeAll();
        this.setVisible(true);
    }

    void interact() {
        this.gameView.removeAll();
        this.gameView.write();
        this.setVisible(true);
        this.playController.next(); // we need to set random start user
        do {
            if (this.playController.getOccupiedCells() < Cell.getNumberCells()) {
                this.put();
            }
            this.playController.next();
            this.gameView.write();
            this.setVisible(true);
        } while (!this.playController.isGameFinished());
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
            error = this.playController.getPutTokenError(cell);
            if (!error.isNull()) {
                JOptionPane.showMessageDialog(null, ErrorView.MESSAGES[error.ordinal()], "ERROR",
                        JOptionPane.WARNING_MESSAGE);
                this.cellPutView.resetCell();
            } else {
                this.playController.putToken(cell);
                this.cellPutView.resetCell();
            }
        } while (!isColumnIntroduced);
    }

    private void showWinMessage() {
        if (this.playController.isConnect4()) {
            JOptionPane.showMessageDialog(null,
                    Message.PLAYER_WIN.toString().replaceAll("#player", "" + this.playController.getActiveColor().toString()),
                    "GAME FINISHED",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, Message.EQUAL_GAME, "GAME FINISHED",
                    JOptionPane.WARNING_MESSAGE);
        }
    }

    public void reset() {
        this.playController.reset();
    }

    public int getOccupiedCells() {
        return this.playController.getOccupiedCells();
    }

}