package org.example.modelViewController.withComposite.view.graphics;

import org.example.modelViewController.withComposite.controller.PlayController;
import org.example.modelViewController.withComposite.controller.ResumeController;
import org.example.modelViewController.withComposite.controller.StartController;
import org.example.modelViewController.withComposite.view.View;

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
