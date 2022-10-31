package org.example.modelViewController.withoutDoubleDispatching.view;

import org.example.modelViewController.withoutDoubleDispatching.controller.Logic;

public abstract class WithLogicView {
    public Logic logic;

    public WithLogicView(Logic logic) {
        this.logic = logic;
    }
}
