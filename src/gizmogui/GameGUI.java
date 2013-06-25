package gizmogui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameGUI extends JFrame {

	private static final long serialVersionUID = 1L;

	public GameGUI() {
		setTitle("Hi");
		JPanel hi = new JPanel();
		hi.setLayout(new GridLayout(1,5,2,2));
		for(int i = 0; i < 5; i++) {
			hi.add(new ButtonIcon(i));
		}

//		ButtonHolder hi = new ButtonHolder();

		add(hi, BorderLayout.CENTER);
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