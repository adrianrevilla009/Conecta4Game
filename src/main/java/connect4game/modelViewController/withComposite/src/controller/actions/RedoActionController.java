package main.java.connect4game.modelViewController.withComposite.src.controller.actions;

import main.java.connect4game.modelViewController.withComposite.src.controller.Controller;
import main.java.connect4game.modelViewController.withComposite.src.domain.Session;

public class RedoActionController extends Controller {

    public RedoActionController(Session session) {
        super(session);
    }

    public void redo() {
        this.session.redo();
    }

    public boolean redoable() {
        return this.session.redoable();
    }
}
