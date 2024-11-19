package LearningGUI;
import javax.swing.*;
// import javax.swing.border.Border;

import java.awt.Color;
// import java.awt.Font;

public class JPanel_GUI {
    public static void main(String[] args) {
        
    	ImageIcon icon = new ImageIcon("aomine.jpg");
    	
    	JLabel label = new JLabel();
    	label.setText("Hello!");
    	label.setIcon(icon);
    	//JPanel - a GUI component that functions as a container to hold other containers
    	
    	JPanel redPanel = new JPanel();
    	redPanel.setBackground(Color.RED);
    	redPanel.setBounds(0,0, 250, 250);
    	
    	JPanel bluePanel = new JPanel();
    	bluePanel.setBackground(Color.BLUE);
    	bluePanel.setBounds(250,0, 250, 250);
    	
    	JPanel greenPanel = new JPanel();
    	greenPanel.setBackground(Color.GREEN);
    	greenPanel.setBounds(0,250, 500, 250);
    	
    	
    	JFrame frame = new JFrame();
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setLayout(null);
    	frame.setSize(750,750);
    	frame.setTitle("JPanel Test");
    	frame.setVisible(true);
    	redPanel.add(label);
    	frame.add(redPanel);
    	frame.add(bluePanel);
    	frame.add(greenPanel);
    }
}