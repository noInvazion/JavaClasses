package LearningGUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;


public class InputGui{
	
	public static void main(String [] args) {
		
		ImageIcon image = new ImageIcon("aomine.jpg");
		Border border = BorderFactory.createLineBorder(Color.green, 3);
		
		//JLabel = a GUI display area for a string of text, image or both
		// Need to create a JFrame first
		
		JLabel label =  new JLabel(); // create a label
		label.setText("Yo, do you even code?"); // set text of label
		//Icon Related Options
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER); // set text left, center or right of image icon
		label.setVerticalTextPosition(JLabel.TOP); //set text CENTER, BOTTOM of imageIcon
		label.setForeground(Color.BLUE); // set font color of text
		label.setFont(new Font("MV Boli", Font.PLAIN, 20)); // set font of text
		label.setIconTextGap(100); //set gap of text to image
		label.setBackground(Color.BLACK); //set background color
		label.setOpaque(true); // needed to display background color
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER); // moves the label position vertically
		label.setHorizontalAlignment(JLabel.CENTER); // moves the label position horizontally
//		label.setBounds(0,0, 350, 350); // set x by y (position) within frame and (size of the layout
		
		// The label likes to take up the whole frame unless specified the size
		
		
		
		
		
//		JFrame = a GUI window to add components to
		
		JFrame frame = new JFrame();
		
		frame.setTitle("Graphical User Interface Title!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setSize(600, 480);
//		frame.setLayout(null); // sets the layout size to null
//		frame.getContentPane().setBackground(new Color(123,50, 250)); //Twitch color
		frame.setVisible(true);
		frame.add(label); //used to add a component to the frame
		frame.pack(); // add all your components before packing
		
		ImageIcon image2 = new ImageIcon("fitness_logo.png");
		frame.setIconImage(image2.getImage());

		
		
		
	}
}
