package org.example.modelViewController.withComposite.controller.actions;

import org.example.modelViewController.withComposite.controller.Controller;
import org.example.modelViewController.withComposite.domain.Session;

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
