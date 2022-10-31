package org.example.modelViewController.withComposite.controller;

public interface ControllersVisitor {
    void visit(StartController startController);
    void visit(PlayController playController);
    boolean visit(ResumeController resumeController);
}
