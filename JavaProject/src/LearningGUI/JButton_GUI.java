package LearningGUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;

public class JButton_GUI extends JFrame implements ActionListener {
	public static void main(String[] args) {
		
		// JButton = a button that performs an action when clicked on
		
		JButton button = new JButton();
		button.setBounds(200,100, 100, 50);
		
		JButton_GUI frame =  new JButton_GUI();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.add(button);
	}
}
