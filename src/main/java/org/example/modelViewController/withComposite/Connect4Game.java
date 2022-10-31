package org.example.modelViewController.withComposite;

import org.example.modelViewController.withComposite.controller.AcceptorController;
import org.example.modelViewController.withComposite.controller.Logic;
import org.example.modelViewController.withComposite.view.View;

public abstract class Connect4Game {
    private Logic logic;
    private View view;

    public Connect4Game() {
        this.logic = new Logic();
        this.view = this.createView();
    }

    public abstract View createView();

    public void play() {
        AcceptorController acceptorController;
        do {
            acceptorController = logic.getActualController();
            if (acceptorController != null) {
                acceptorController.accept(this.view);
            }
        } while (acceptorController != null);
    }
}
