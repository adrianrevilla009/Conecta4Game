package main.java.connect4game.modelViewController.facade.view;

import main.java.connect4game.modelViewController.facade.controller.Logic;
import main.java.connect4game.modelViewController.facade.controller.PlayController;
import main.java.connect4game.modelViewController.facade.controller.ResumeController;
import main.java.connect4game.modelViewController.facade.controller.StartController;

public abstract class View extends WithLogicView{

    public View(Logic logic) {
        super(logic);
    }

    public abstract void start();

    public abstract void play();

    public abstract boolean resume();
}
