package main.java.connect4game.modelViewController.withoutDoubleDispatching.view;

import main.java.connect4game.modelViewController.withoutDoubleDispatching.controller.PlayController;
import main.java.connect4game.modelViewController.withoutDoubleDispatching.controller.ResumeController;
import main.java.connect4game.modelViewController.withoutDoubleDispatching.controller.StartController;

public abstract class View {

    public abstract void start(StartController startController);

    public abstract void play(PlayController playController);

    public abstract boolean resume(ResumeController resumeController);
}
