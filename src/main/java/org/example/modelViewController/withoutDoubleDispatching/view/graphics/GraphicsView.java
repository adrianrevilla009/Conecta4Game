package org.example.modelViewController.withoutDoubleDispatching.view.graphics;

import org.example.modelViewController.withoutDoubleDispatching.controller.PlayController;
import org.example.modelViewController.withoutDoubleDispatching.controller.ResumeController;
import org.example.modelViewController.withoutDoubleDispatching.controller.StartController;
import org.example.modelViewController.withoutDoubleDispatching.view.View;

public class GraphicsView extends View {

    public GraphicsView() {

    }

    @Override
    public void start(StartController startController) {

    }

    @Override
    public void play(PlayController playController) {

    }

    @Override
    public boolean resume(ResumeController resumeController) {
        return false;
    }
}
