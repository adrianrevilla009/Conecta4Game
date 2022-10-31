package org.example.modelViewController.withComposite.domain;

import org.example.modelViewController.withComposite.types.Color;
import org.example.modelViewController.withComposite.types.StateValue;
import org.example.modelViewController.withComposite.types.Error;

public class Session {

    private State state;
    private Game game;
    private Registry registry;

    public Session() {
        this.state = new State();
        this.game = new Game();
        // TODO patron memento
        this.registry = new Registry(game);
    }

    public void reset() {
        this.game.reset();
        this.state.reset();
        this.registry.reset();
    }

    public void nextState() {
        this.state.next();
    }

    public StateValue getValueState() {
        return this.state.getValueState();
    }

    public boolean undoable() {
        return this.registry.undoable();
    }

    public boolean redoable() {
        return this.registry.redoable();
    }

    public void undo() {
        this.registry.undo();
    }

    public void redo() {
        this.registry.redo();
    }

    public void next() {
        this.game.next();
        this.registry.register();
    }

    public Color getColor(Cell cell) {
        return this.game.getColor(cell);
    }

    public boolean isGameFinished() {
        return this.game.isGameFinished();
    }

    public boolean isConnect4() {
        return this.game.isConnect4();
    }

    public boolean isEqualGame() { return this.game.isEqualGame(); }

    public Color getActiveColor() {
        return this.game.getActiveColor();
    }

    public Error getPutTokenError(Cell cell) {
        return this.game.getPutTokenError(cell);
    }

    public void putToken(Cell cell) {
        this.game.putToken(cell);
    }

    public int getNextFreeRowByColumn(int column) {
        return this.game.getNextFreeRowByColumn(column);
    }

    public int getOccupiedCells() {
        return this.game.getOccupiedCells();
    }

}
