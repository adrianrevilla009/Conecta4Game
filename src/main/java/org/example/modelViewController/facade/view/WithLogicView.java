package org.example.modelViewController.facade.view;

import org.example.modelViewController.facade.controller.Logic;

public abstract class WithLogicView {
    public Logic logic;

    public WithLogicView(Logic logic) {
        this.logic = logic;
    }
}
