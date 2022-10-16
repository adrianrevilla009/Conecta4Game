package main.java.connect4game.modelView.withFactoryMethod.view.graphics;

import main.java.connect4game.modelView.withFactoryMethod.domain.Cell;
import main.java.connect4game.modelView.withFactoryMethod.domain.Game;
import main.java.connect4game.modelView.withFactoryMethod.types.Error;
import main.java.connect4game.modelView.withFactoryMethod.types.Message;
import main.java.connect4game.modelView.withFactoryMethod.view.ErrorView;

import javax.swing.*;
import java.awt.*;

class PlayView extends JFrame {
    private CellPutView cellPutView;
    private Game game;
    private GameView gameView;

    PlayView(Game game) {
        super(Message.TITLE.toString());
        assert game != null;

        this.game = game;
        this.getContentPane().setLayout(new GridBagLayout());
        this.setSize(400, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.gameView = new GameView(game);
        this.getContentPane().add(this.gameView);
        this.gameView.write();
        this.setVisible(true);
        this.cellPutView = new CellPutView(this.game);
        this.getContentPane().add(this.cellPutView, new Constraints(0, 1, 3, 1));
        this.gameView.removeAll();
        this.setVisible(true);
    }

    void interact() {
        this.gameView.removeAll();
        this.gameView.write();
        this.setVisible(true);
        do {
            if (this.game.getOccupiedCells() < Cell.getNumberCells()) {
                this.put();
            }
            this.game.next();
            this.gameView.write();
            this.setVisible(true);
        } while (!this.game.isGameFinished());
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
            error = this.game.getPutTokenError(cell);
            if (!error.isNull()) {
                JOptionPane.showMessageDialog(null, ErrorView.MESSAGES[error.ordinal()], "ERROR",
                        JOptionPane.WARNING_MESSAGE);
                this.cellPutView.resetCell();
            } else {
                this.game.putToken(cell);
                this.cellPutView.resetCell();
            }
        } while (!isColumnIntroduced);
    }

    private void showWinMessage() {
        if (this.game.isConnect4()) {
            JOptionPane.showMessageDialog(null,
                    Message.PLAYER_WIN.toString().replaceAll("#player", "" + this.game.getActiveColor().toString()),
                    "GAME FINISHED",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, Message.EQUAL_GAME, "GAME FINISHED",
                    JOptionPane.WARNING_MESSAGE);
        }
    }

}