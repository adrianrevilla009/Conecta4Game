package main.java.connect4game.modelViewController.withComposite.src.view.graphics;

import main.java.connect4game.modelViewController.withComposite.src.controller.PlayController;
import main.java.connect4game.modelViewController.withComposite.src.controller.ResumeController;
import main.java.connect4game.modelViewController.withComposite.src.controller.StartController;
import main.java.connect4game.modelViewController.withComposite.src.view.View;

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
