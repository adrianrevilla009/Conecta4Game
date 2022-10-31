package org.example.modelViewController.withComposite.controller;

import org.example.modelViewController.withComposite.domain.Cell;
import org.example.modelViewController.withComposite.domain.Session;
import org.example.modelViewController.withComposite.types.Color;

public abstract class Controller {
    protected Session session;

    protected Controller(Session session) {
        this.session = session;
    }

    public void nextState() {
        this.session.nextState();
    }

    public Color getColor(Cell cell) {
        return this.session.getColor(cell);
    }
}
