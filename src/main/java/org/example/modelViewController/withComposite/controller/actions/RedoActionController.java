package org.example.modelViewController.withComposite.controller.actions;

import org.example.modelViewController.withComposite.controller.Controller;
import org.example.modelViewController.withComposite.domain.Session;

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
