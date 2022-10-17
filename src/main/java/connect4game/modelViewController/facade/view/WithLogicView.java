package main.java.connect4game.modelViewController.facade.view;

import main.java.connect4game.modelViewController.facade.controller.Logic;

public abstract class WithLogicView {
    public Logic logic;

    public WithLogicView(Logic logic) {
        this.logic = logic;
    }
}
