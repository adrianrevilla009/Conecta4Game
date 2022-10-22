package main.java.connect4game.modelViewController.withoutDoubleDispatching.view;

import main.java.connect4game.modelViewController.withoutDoubleDispatching.controller.Logic;

public abstract class WithLogicView {
    public Logic logic;

    public WithLogicView(Logic logic) {
        this.logic = logic;
    }
}
