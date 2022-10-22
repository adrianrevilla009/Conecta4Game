package main.java.connect4game.modelViewController.withoutDoubleDispatching.view.graphics;

import main.java.connect4game.modelViewController.withoutDoubleDispatching.controller.PlayController;
import main.java.connect4game.modelViewController.withoutDoubleDispatching.controller.ResumeController;
import main.java.connect4game.modelViewController.withoutDoubleDispatching.controller.StartController;
import main.java.connect4game.modelViewController.withoutDoubleDispatching.view.View;

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
