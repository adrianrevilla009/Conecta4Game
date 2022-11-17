package org.example.modelViewPresenter.refactorToPassiveView.view.graphics;

import org.example.modelViewPresenter.refactorToPassiveView.controller.StartController;
import org.example.modelViewPresenter.refactorToPassiveView.types.Message;

import javax.swing.*;
import java.awt.*;

public class StartView extends JFrame {

    private StartController startController;

    StartView(StartController startController) {
        super(Message.TITLE.toString());
        assert startController != null;
        this.startController = startController;
        this.getContentPane().setLayout(new GridBagLayout());
        this.setSize(400, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    void interact() {
        GameView gameView;
        gameView = new GameView(this.startController.getGame());
        gameView.write();
        this.getContentPane().add(gameView, new Constraints(0, 0, 3, 1));
        this.setVisible(false);
    }

}