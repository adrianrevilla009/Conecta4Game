package org.example.modelViewController.facade.view.graphics;

import org.example.modelViewController.facade.controller.Logic;
import org.example.modelViewController.facade.types.Message;

import javax.swing.*;
import java.awt.*;

// aqui no puedo meter el WithLogicView porque no se puede extender de varias clases
public class StartView extends JFrame {

    private Logic logic;

    StartView(Logic logic) {
        super(Message.TITLE.toString());
        assert logic != null;
        this.logic = logic;
        this.getContentPane().setLayout(new GridBagLayout());
        this.setSize(400, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    void interact() {
        GameView gameView;
        gameView = new GameView(this.logic.getGame());
        gameView.write();
        this.getContentPane().add(gameView, new Constraints(0, 0, 3, 1));
        this.setVisible(false);
    }

}