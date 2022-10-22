package main.java.connect4game.modelViewController.doubleDispatching.view.graphics;

import main.java.connect4game.modelViewController.doubleDispatching.controller.ResumeController;
import main.java.connect4game.modelViewController.doubleDispatching.types.Message;

import javax.swing.*;

class ResumeView {

	private boolean newGame;

	ResumeView() {}

	void resume() {
		this.newGame = (JOptionPane.showConfirmDialog(null, Message.RESUME.toString(),
				Message.TITLE.toString(), JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);
	}

	boolean isResumedGame() {
		return this.newGame;
	}

	boolean interact(ResumeController resumeController) {
		this.resume();
		return this.isResumedGame();
	}

}
