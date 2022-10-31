package org.example.modelView.withoutFactoryMethod.view.console;

import org.example.modelView.withoutFactoryMethod.domain.Game;
import org.example.modelView.withoutFactoryMethod.view.View;

public class ConsoleView extends View {
    private StartView startView;
    private PlayView playView;
    private ResumeView resumeView;

    public ConsoleView(Game game) {
        super(game);
        this.startView = new StartView(this.game);
        this.playView = new PlayView(this.game);
        this.resumeView = new ResumeView(this.game);
    }

    public void start() {
        this.startView.interact();
    }

    public void play() {
        this.playView.interact();
    }

    public boolean resume() {
        return this.resumeView.interact();
    }
}
