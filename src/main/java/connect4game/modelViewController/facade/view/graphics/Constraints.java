package main.java.connect4game.modelViewController.facade.view.graphics;

import java.awt.*;

class Constraints extends GridBagConstraints {

	Constraints(int gridX, int gridY, int gridWidth, int gridHeight) {
		this.gridx = gridX;
		this.gridy = gridY;
		this.gridwidth = gridWidth;
		this.gridheight = gridHeight;
		this.fill = 1;
	}

}
