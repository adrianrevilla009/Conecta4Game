package org.example.modelView.withFactoryMethod.view.graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public abstract class CellView extends JPanel implements ActionListener, KeyListener {

	protected static final String ENTER_CELL_TO_PUT = "Enter a column to put a token:";
	protected static final String ACCEPT = "Ok";
	protected final JLabel labelColumn;
	protected JLabel titleLabel;
	protected final JTextField textFieldColumn;
	protected JButton button;

	CellView() {
		this.setLayout(new GridBagLayout());
		this.labelColumn = new JLabel();
		this.textFieldColumn = new JTextField(1);
		this.add(labelColumn, new Constraints(0, 3, 1, 1));
		this.add(textFieldColumn, new Constraints(0, 4, 1, 1));
	}

	public abstract void actionPerformed(final ActionEvent event);

	public void keyTyped(KeyEvent e) {
	}

	public void keyPressed(KeyEvent e) {
	}

	public void keyReleased(KeyEvent e) {
	}
}