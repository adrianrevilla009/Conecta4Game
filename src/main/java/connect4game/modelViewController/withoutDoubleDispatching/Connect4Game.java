package main.java.connect4game.modelViewController.withoutDoubleDispatching;

import main.java.connect4game.modelViewController.withoutDoubleDispatching.controller.Logic;
import main.java.connect4game.modelViewController.withoutDoubleDispatching.controller.PlayController;
import main.java.connect4game.modelViewController.withoutDoubleDispatching.controller.ResumeController;
import main.java.connect4game.modelViewController.withoutDoubleDispatching.controller.StartController;
import main.java.connect4game.modelViewController.withoutDoubleDispatching.view.View;

public abstract class Connect4Game {
    private Logic logic;
    private View view;

    public Connect4Game() {
        this.logic = new Logic();
        this.view = this.createView();
    }

    public abstract View createView();

    public void play() {
        do {
            if (logic.getController() instanceof StartController) {
                this.view.start((StartController) logic.getController());
            } else {
                if (logic.getController() instanceof PlayController) {
                    this.view.play((PlayController) logic.getController());
                } else {
                    this.view.resume((ResumeController) logic.getController());
                }
            }
        } while (logic.getController() != null);
    }
}
