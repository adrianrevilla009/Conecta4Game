package org.example.modelViewController.withComposite.controller.actions;

import org.example.modelViewController.withComposite.controller.Controller;
import org.example.modelViewController.withComposite.domain.Cell;
import org.example.modelViewController.withComposite.domain.Session;
import org.example.modelViewController.withComposite.types.Color;
import org.example.modelViewController.withComposite.types.Error;

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

    public int getNextFreeRowByColumn(int column) {
        return this.session.getNextFreeRowByColumn(column);
    }

    public int getOccupiedCells() {
        return this.session.getOccupiedCells();
    }
}
