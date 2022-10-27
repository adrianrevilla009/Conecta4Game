package main.java.connect4game.modelViewController.withComposite.src.controller.actions;

import main.java.connect4game.modelViewController.withComposite.src.controller.Controller;
import main.java.connect4game.modelViewController.withComposite.src.domain.Cell;
import main.java.connect4game.modelViewController.withComposite.src.domain.Session;
import main.java.connect4game.modelViewController.withComposite.src.types.Color;
import main.java.connect4game.modelViewController.withComposite.src.types.Error;

public class PlayActionController extends Controller {

    public PlayActionController(Session session) {
        super(session);
    }

    public boolean isConnect4() {
        return this.session.isConnect4();
    }

    public void next() {
        this.session.next();
    }

    public Color getActiveColor() {
        return this.session.getActiveColor();
    }

    public void putToken(Cell cell) {
        this.session.putToken(new Cell(cell.getRow(), cell.getColumn()));
    }

    public Error getPutTokenError(Cell cell) {
        return this.session.getPutTokenError(cell);
    }

    public boolean isGameFinished() {
        return this.session.isGameFinished();
    }

    public int getNextFreeRow(Cell cell) {
        return this.session.getNextFreeRow(cell);
    }

    public int getOccupiedCells() {
        return this.session.getOccupiedCells();
    }
}
