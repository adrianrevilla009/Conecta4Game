package main.java.connect4game.modelViewController.withComposite.controller;

import main.java.connect4game.modelViewController.withComposite.domain.Cell;
import main.java.connect4game.modelViewController.withComposite.domain.Game;
import main.java.connect4game.modelViewController.withComposite.domain.Session;
import main.java.connect4game.modelViewController.withComposite.domain.State;
import main.java.connect4game.modelViewController.withComposite.types.Color;

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

    public Session getSession() {
        return session;
    }
}
