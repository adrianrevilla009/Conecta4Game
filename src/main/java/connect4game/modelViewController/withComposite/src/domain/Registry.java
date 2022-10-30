package main.java.connect4game.modelViewController.withComposite.src.domain;

import java.util.ArrayList;
import java.util.List;

public class Registry {
	
	private List<Memento> mementos;
	private Game game;
	private int firstPrevious;
	
	public Registry(Game game) {
		this.game = game;
		this.reset();
	}

	public void reset() {
		this.firstPrevious = 0;
		this.mementos = new ArrayList<>();
		this.mementos.add(this.firstPrevious, this.game.createMemento());
	}

	public void register() {
		for (int i = 0; i < this.firstPrevious; i++) {
			this.mementos.remove(0);
		}
		this.firstPrevious = 0;
		this.mementos.add(this.firstPrevious, this.game.createMemento());
	}

	public void undo() {
		assert this.undoable();

		this.firstPrevious++;
		this.game.setMemento(this.mementos.get(this.firstPrevious));
	}

	public void redo() {
		assert this.redoable();

		this.firstPrevious--;
		this.game.setMemento(this.mementos.get(this.firstPrevious));
	}

	public boolean undoable() {
		return this.firstPrevious < this.mementos.size() - 1;
	}

	public boolean redoable() {
		return this.firstPrevious >= 1;
	}

}
