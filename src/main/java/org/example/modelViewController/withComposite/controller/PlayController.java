package org.example.modelViewController.withComposite.controller;

import org.example.modelViewController.withComposite.types.Color;
import org.example.modelViewController.withComposite.types.Error;
import org.example.modelViewController.withComposite.domain.Cell;
import org.example.modelViewController.withComposite.controller.actions.PlayActionController;
import org.example.modelViewController.withComposite.controller.actions.RedoActionController;
import org.example.modelViewController.withComposite.controller.actions.UndoActionController;
import org.example.modelViewController.withComposite.domain.Session;

public class PlayController extends Controller implements AcceptorController {

    private PlayActionController playActionController;
    private UndoActionController undoActionController;
    private RedoActionController redoActionController;

    // TODO patron composite
    public PlayController(Session session) {
        super(session);
        this.playActionController = new PlayActionController(session);
        this.undoActionController = new UndoActionController(session);
        this.redoActionController = new RedoActionController(session);
    }

    public void undo(){
        this.undoActionController.undo();
    }

    public boolean undoable(){
        return this.undoActionController.undoable();
    }

    public void redo(){
        this.redoActionController.redo();
    }

    public boolean redoable(){
        return this.redoActionController.redoable();
    }

    public boolean isConnect4() {
        return this.playActionController.isConnect4();
    }

    public void next() {
        this.playActionController.next();
    }

    public boolean isGameFinished() {
        return this.playActionController.isGameFinished();
    }

    public int getOccupiedCells() {
        return this.playActionController.getOccupiedCells();
    }

    public void putToken(Cell cell) {
        this.playActionController.putToken(cell);
    }

    public Error getPutTokenError(Cell cell) {
        return this.playActionController.getPutTokenError(cell);
    }

    public int getNextFreeRowByColumn(int column) {
        return this.playActionController.getNextFreeRowByColumn(column);
    }

    public Color getActiveColor() {
        return this.playActionController.getActiveColor();
    }

    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }
}
