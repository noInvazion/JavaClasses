package packagetwo;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Gui3{
	public static void main(String[] args) {
		JFrame frame = new JFrame("Chat Frame");
		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);
		frame.setBackground(Color.BLUE);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		JMenuBar bar = new JMenuBar();
		JMenu menu1= new JMenu("FILE");
		JMenu menu2 = new JMenu("Help");
		bar.add(menu1);
		bar.add(menu2);
		JMenuItem item1 = new JMenuItem();
		JMenuItem item2 = new JMenuItem();
		menu1.add(item1);
		menu2.add(item2);
		
		//Creating the panel at bottom and adding components
        JPanel panel = new JPanel(); // the panel is not visible in output
        JLabel label = new JLabel("Enter Text");
        JTextField tf = new JTextField(10); // accepts upto 10 characters
        JButton send = new JButton("Send");
        JButton reset = new JButton("Reset");
        panel.add(label); // Components Added using Flow Layout
        panel.add(tf);
        panel.add(send);
        panel.add(reset);

        // Text Area at the Center
        JTextArea ta = new JTextArea();

        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, bar);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
		
		
	}
}