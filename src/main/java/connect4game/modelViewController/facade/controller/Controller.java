package main.java.connect4game.modelViewController.facade.controller;

import main.java.connect4game.modelViewController.facade.domain.Game;

public abstract class Controller {
    protected Game game;

    Controller(Game game) {
        this.game = game;
    }
}
