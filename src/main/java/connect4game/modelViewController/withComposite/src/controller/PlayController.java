package main.java.connect4game.modelViewController.withComposite.src.controller;

import main.java.connect4game.modelViewController.withComposite.src.types.Color;
import main.java.connect4game.modelViewController.withComposite.src.types.Error;
import main.java.connect4game.modelViewController.withComposite.src.domain.Cell;
import main.java.connect4game.modelViewController.withComposite.src.controller.actions.PlayActionController;
import main.java.connect4game.modelViewController.withComposite.src.controller.actions.RedoActionController;
import main.java.connect4game.modelViewController.withComposite.src.controller.actions.UndoActionController;
import main.java.connect4game.modelViewController.withComposite.src.domain.Session;

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

    public int getNextFreeRow(Cell cell) {
        return this.playActionController.getNextFreeRow(cell);
    }

    public Color getActiveColor() {
        return this.playActionController.getActiveColor();
    }

    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }
}
