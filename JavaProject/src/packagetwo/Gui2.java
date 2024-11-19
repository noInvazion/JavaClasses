package packagetwo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Gui2 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Avengers");
		frame.setSize(700, 500);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setResizable(false);
		
		
		JButton button = new JButton("Tap");
		button.setText("Would this override?");
//		button.setLocation(500, 500);
//		button.setToolTipText("Click on this to find out:");
		button.setSize(300, 200);
		button.setBackground(Color.BLACK);
		button.setForeground(Color.WHITE);
		frame.add(button);
//		button.
	
	}
}

/*
 *By default, setResizable() is set to true which makes the user have access to minimizing or maximizing a frame (window)
 */
