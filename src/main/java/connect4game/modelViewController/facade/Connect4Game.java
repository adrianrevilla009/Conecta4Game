package main.java.connect4game.modelViewController.facade;

import main.java.connect4game.modelViewController.facade.controller.Logic;
import main.java.connect4game.modelViewController.facade.controller.PlayController;
import main.java.connect4game.modelViewController.facade.controller.ResumeController;
import main.java.connect4game.modelViewController.facade.controller.StartController;
import main.java.connect4game.modelViewController.facade.domain.Game;
import main.java.connect4game.modelViewController.facade.view.View;

public abstract class Connect4Game {
    private Logic logic;
    private View view;

    public Connect4Game() {
        this.logic = new Logic(new Game());
        this.view = this.createView(this.logic);
    }

    public abstract View createView(Logic logic);

    public void play() {
        do {
            this.view.start();
            this.view.play();
        } while (this.view.resume());
    }
}
