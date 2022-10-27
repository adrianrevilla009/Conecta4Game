package main.java.connect4game.modelViewController.withComposite.src.controller;

import main.java.connect4game.modelViewController.withComposite.src.domain.Cell;
import main.java.connect4game.modelViewController.withComposite.src.domain.Session;
import main.java.connect4game.modelViewController.withComposite.src.types.Color;

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
