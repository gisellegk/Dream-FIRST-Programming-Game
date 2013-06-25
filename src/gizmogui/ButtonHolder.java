/**
 * 
 */
package gizmogui;

import javax.swing.*;
import java.awt.GridLayout;
/**
 * @author Giselle
 *
 */

public class ButtonHolder extends JPanel {
	private static final long serialVersionUID = 1L;
	
	public ButtonHolder() {
		setLayout(new GridLayout(1,5,2,2));
		for(int i = 0; i < 5; i++) {
			add(new ButtonIcon(i));
		}
	}
	

}
