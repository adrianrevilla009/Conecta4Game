package main.java.connect4game.modelViewController.doubleDispatching.view.graphics;

import main.java.connect4game.modelViewController.doubleDispatching.controller.PlayController;
import main.java.connect4game.modelViewController.doubleDispatching.controller.ResumeController;
import main.java.connect4game.modelViewController.doubleDispatching.domain.Cell;
import main.java.connect4game.modelViewController.doubleDispatching.types.Error;
import main.java.connect4game.modelViewController.doubleDispatching.types.Message;
import main.java.connect4game.modelViewController.doubleDispatching.view.ErrorView;

import javax.swing.*;
import java.awt.*;

class PlayView extends JFrame {
    private CellPutView cellPutView;
    private GameView gameView;

    PlayView() {
        super(Message.TITLE.toString());

        this.getContentPane().setLayout(new GridBagLayout());
        this.setSize(400, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // this.gameView = new GameView(this.logic.getGame());
        this.getContentPane().add(this.gameView);
        this.gameView.write();
        this.setVisible(true);
        // this.cellPutView = new CellPutView(this.logic.getGame());
        this.getContentPane().add(this.cellPutView, new Constraints(0, 1, 3, 1));
        this.gameView.removeAll();
        this.setVisible(true);
    }

    void interact(PlayController playController) {
        this.gameView.removeAll();
        this.gameView.write();
        this.setVisible(true);
        playController.next(); // we need to set random start user
        do {
            if (playController.getOccupiedCells() < Cell.getNumberCells()) {
                this.put(playController);
            }
            playController.next();
            this.gameView.write();
            this.setVisible(true);
        } while (!playController.isGameFinished());
        this.showWinMessage(playController);
        this.setVisible(true);
    }

    private void put(PlayController playController) {
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
            error = playController.getPutTokenError(cell);
            if (!error.isNull()) {
                JOptionPane.showMessageDialog(null, ErrorView.MESSAGES[error.ordinal()], "ERROR",
                        JOptionPane.WARNING_MESSAGE);
                this.cellPutView.resetCell();
            } else {
                playController.putToken(cell);
                this.cellPutView.resetCell();
            }
        } while (!isColumnIntroduced);
    }

    private void showWinMessage(PlayController playController) {
        if (playController.isConnect4()) {
            JOptionPane.showMessageDialog(null,
                    Message.PLAYER_WIN.toString().replaceAll("#player", "" + playController.getActiveColor().toString()),
                    "GAME FINISHED",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, Message.EQUAL_GAME, "GAME FINISHED",
                    JOptionPane.WARNING_MESSAGE);
        }
    }

    public void reset(ResumeController resumeController) {
        resumeController.reset();
    }

    public int getOccupiedCells(PlayController playController) {
        return playController.getOccupiedCells();
    }

}