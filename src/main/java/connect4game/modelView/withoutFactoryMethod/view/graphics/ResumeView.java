package main.java.connect4game.modelView.withoutFactoryMethod.view.graphics;

import main.java.connect4game.modelView.withoutFactoryMethod.types.Message;

import javax.swing.*;

class ResumeView {

	private boolean newGame;

	ResumeView() {
		this.newGame = (JOptionPane.showConfirmDialog(null, Message.RESUME.toString(),
				Message.TITLE.toString(), JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);
	}

	boolean isResumedGame() {
		return this.newGame;
	}

}
