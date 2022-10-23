package main.java.connect4game.modelViewController.withComposite.view.graphics;

import main.java.connect4game.modelViewController.withComposite.controller.PlayController;
import main.java.connect4game.modelViewController.withComposite.controller.ResumeController;
import main.java.connect4game.modelViewController.withComposite.controller.StartController;
import main.java.connect4game.modelViewController.withComposite.view.View;

public class GraphicsView implements View {

    public GraphicsView() {
    }


    @Override
    public void visit(StartController startController) {

    }

    @Override
    public void visit(PlayController playController) {

    }

    @Override
    public boolean visit(ResumeController resumeController) {
        return false;
    }
}
