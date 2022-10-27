package main.java.connect4game.modelViewController.withComposite.src.domain;

import main.java.connect4game.modelViewController.withComposite.src.types.Color;
import main.java.connect4game.modelViewController.withComposite.src.types.StateValue;
import main.java.connect4game.modelViewController.withComposite.src.types.Error;

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

    public int getNextFreeRow(Cell cell) {
        return this.game.getNextFreeRow(cell);
    }

    public int getOccupiedCells() {
        return this.game.getOccupiedCells();
    }

}
