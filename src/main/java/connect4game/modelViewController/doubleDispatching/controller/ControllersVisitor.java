package main.java.connect4game.modelViewController.doubleDispatching.controller;

public interface ControllersVisitor {
    void visit(StartController startController);
    void visit(PlayController playController);
    boolean visit(ResumeController resumeController);
}
