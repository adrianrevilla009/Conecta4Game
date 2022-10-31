package org.example.modelViewController.facade.controller;

import org.example.modelViewController.facade.domain.Game;

public abstract class Controller {
    protected Game game;

    Controller(Game game) {
        this.game = game;
    }
}
