package gizmogui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameGUI extends JFrame {

	private static final long serialVersionUID = 1L;

	public GameGUI() {
		setTitle("Hi");

		JLabel emptyLabel = new JLabel("");
		emptyLabel.setPreferredSize(new Dimension(600, 450));
		getContentPane().add(emptyLabel, BorderLayout.CENTER);

		pack();
	}

	public static void main(String args[]) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new GameGUI().setVisible(true);
			}
		});
	}
}