package org.example.modelViewController.facade.view.graphics;

import org.example.modelViewController.facade.types.Message;

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

}
