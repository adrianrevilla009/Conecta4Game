package org.example.modelViewController.withComposite.controller;

import org.example.modelViewController.withComposite.domain.Session;

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
