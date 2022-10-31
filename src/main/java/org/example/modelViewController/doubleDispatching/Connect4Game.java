package org.example.modelViewController.doubleDispatching;

import org.example.modelViewController.doubleDispatching.controller.Controller;
import org.example.modelViewController.doubleDispatching.controller.Logic;
import org.example.modelViewController.doubleDispatching.view.View;

public abstract class Connect4Game {
    private Logic logic;
    private View view;

    public Connect4Game() {
        this.logic = new Logic();
        this.view = this.createView();
    }

    public abstract View createView();

    public void play() {
        Controller controller;
        do {
            controller = logic.getActualController();
            if (controller != null) {
                controller.accept(this.view);
            }
        } while (controller != null);
    }
}
