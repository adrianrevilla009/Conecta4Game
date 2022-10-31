package org.example.modelViewController.withoutDoubleDispatching.view;

import org.example.modelViewController.withoutDoubleDispatching.controller.PlayController;
import org.example.modelViewController.withoutDoubleDispatching.controller.ResumeController;
import org.example.modelViewController.withoutDoubleDispatching.controller.StartController;

public abstract class View {

    public abstract void start(StartController startController);

    public abstract void play(PlayController playController);

    public abstract boolean resume(ResumeController resumeController);
}
