package gizmogui;

import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class ButtonIcon extends JLabel {
	private static final long serialVersionUID = 1L;
	
	public ButtonIcon(int n) {
		super();
		
        if (n == 0) {
        	ImageIcon icon = new ImageIcon("gizmogui/Red.png");
        	setIcon(icon);
        } else if (n == 1) {
        	ImageIcon icon = new ImageIcon("gizmogui/Orange.png");
        	setIcon(icon);
        } else if (n == 2) {
        	ImageIcon icon = new ImageIcon("gizmogui/Yellow.png");
        	setIcon(icon);
        } else if (n == 3) {
        	ImageIcon icon = new ImageIcon("gizmogui/Green.png");
        	setIcon(icon);
        } else if (n == 4) {
        	ImageIcon icon = new ImageIcon("gizmogui/Blue.png");
        	setIcon(icon);
        } else {
        	ImageIcon icon = new ImageIcon("gizmogui/Purple.png");
        	setIcon(icon);
        }

	}
}
