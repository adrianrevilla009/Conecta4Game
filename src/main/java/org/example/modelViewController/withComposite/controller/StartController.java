package org.example.modelViewController.withComposite.controller;

import org.example.modelViewController.withComposite.domain.Session;

public class StartController extends Controller implements AcceptorController{
    public StartController(Session session) {
        super(session);
    }

    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }

}
