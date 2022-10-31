package org.example.modelViewController.facade;

import org.example.modelViewController.facade.controller.Logic;
import org.example.modelViewController.facade.controller.PlayController;
import org.example.modelViewController.facade.controller.ResumeController;
import org.example.modelViewController.facade.controller.StartController;
import org.example.modelViewController.facade.domain.Game;
import org.example.modelViewController.facade.view.View;

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
