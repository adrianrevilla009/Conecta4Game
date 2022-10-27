package main.java.connect4game.modelViewController.withComposite.src.controller.actions;

import main.java.connect4game.modelViewController.withComposite.src.controller.Controller;
import main.java.connect4game.modelViewController.withComposite.src.domain.Session;

public class UndoActionController extends Controller {

    public UndoActionController(Session session) {
        super(session);
    }

    public void undo() {
        this.session.undo();
    }

    public boolean undoable() {
        return this.session.undoable();
    }
}
