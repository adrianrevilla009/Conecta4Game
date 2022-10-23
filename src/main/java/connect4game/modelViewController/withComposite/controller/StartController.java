package main.java.connect4game.modelViewController.withComposite.controller;

import main.java.connect4game.modelViewController.withComposite.domain.Session;

public class StartController extends Controller implements AcceptorController{
    public StartController(Session session) {
        super(session);
    }

    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }

}
