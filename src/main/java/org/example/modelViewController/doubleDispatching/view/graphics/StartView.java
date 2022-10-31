package org.example.modelViewController.doubleDispatching.view.graphics;

import org.example.modelViewController.doubleDispatching.controller.Logic;
import org.example.modelViewController.doubleDispatching.controller.StartController;
import org.example.modelViewController.doubleDispatching.types.Message;

import javax.swing.*;
import java.awt.*;

// aqui no puedo meter el WithLogicView porque no se puede extender de varias clases
public class StartView extends JFrame {

    StartView() {
        super(Message.TITLE.toString());
        this.getContentPane().setLayout(new GridBagLayout());
        this.setSize(400, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    void interact(StartController startController) {
        GameView gameView;
        gameView = new GameView(startController.getGame());
        gameView.write();
        this.getContentPane().add(gameView, new Constraints(0, 0, 3, 1));
        this.setVisible(false);
    }

}