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
        }

	}
}
