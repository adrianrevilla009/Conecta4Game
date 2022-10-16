package main.java.connect4game.modelViewController.basic.view.graphics;

import main.java.connect4game.modelViewController.basic.controller.PlayController;
import main.java.connect4game.modelViewController.basic.controller.ResumeController;
import main.java.connect4game.modelViewController.basic.controller.StartController;
import main.java.connect4game.modelViewController.basic.view.View;

public class GraphicsView extends View {

    public GraphicsView(StartController startController, PlayController playController,
                        ResumeController resumeController) {
        super(startController, playController, resumeController);
    }

    @Override
    public void start() {

    }

    @Override
    public void play() {

    }

    @Override
    public boolean resume() {
        return true;
    }
}
