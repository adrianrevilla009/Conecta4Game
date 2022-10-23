package main.java.connect4game.modelViewController.withComposite.controller;

import main.java.connect4game.modelViewController.withComposite.domain.Session;

public class ResumeController extends Controller implements AcceptorController{
    public ResumeController(Session session) {
        super(session);
    }

    public void reset() {
        this.session.reset();
    }

    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }
}
