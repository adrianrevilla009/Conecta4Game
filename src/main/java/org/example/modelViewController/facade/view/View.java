package org.example.modelViewController.facade.view;

import org.example.modelViewController.facade.controller.Logic;
import org.example.modelViewController.facade.controller.PlayController;
import org.example.modelViewController.facade.controller.ResumeController;
import org.example.modelViewController.facade.controller.StartController;

public abstract class View extends WithLogicView{

    public View(Logic logic) {
        super(logic);
    }

    public abstract void start();

    public abstract void play();

    public abstract boolean resume();
}
