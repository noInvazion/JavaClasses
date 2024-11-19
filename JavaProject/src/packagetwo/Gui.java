package packagetwo;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.WindowConstants;

public class Gui extends JFrame {
	Font font = new Font("Ink Free", Font.BOLD, 20);

	public Gui() {
//		JFrame frame = new JFrame("New String Title");
		super("GUI class");
		FlowLayout f1 = new FlowLayout();

		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(500, 300);
		setTitle("JFrame");
		setLocation(50, 50); // sets a position away from the default
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(f1);

		JButton btn1 = createButton();
		JButton btn2 = createButton();
		add(btn1);
		add(btn2);

		JLabel fname = new JLabel("First Name");
		fname.setForeground(Color.red);

		add(fname);

		JTextField fnameField = new JTextField(20);
		fnameField.setFont(font);
		fnameField.setForeground(Color.black);
		fnameField.setCaretColor(Color.green);

		JPanel formPanel = new JPanel();
	}
	
	JButton createButton() {
		JButton button = new JButton();
		button.setText("Click me");
		button.setToolTipText("popup text on hover");
		button.setFocusable(false); // box around text when button is in focus (clicked on)
		button.setBackground(Color.black);
		button.setForeground(Color.white);
		
		button.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		
		return button;
	}
	
	public static void main(String[] args) {
		Gui area = new Gui();
		
		/* you should have a frame first, and setVisible(true)
		 EXIT_ON_CLOSE and DISPOSE_ON_CLOSE closes the frame and terminates the program
		 positioning of setSize(500, 300) and setLocationRelativeTo(null) matters.
		 
		 setLocationRelativeTo(null) sets it to center
		 setSize(500, 500) sets the limit of the size window
		 
		 so, if locationRelativeTo is typed before setSize, the compiler sets to center and then
		 expands the frame to fit the size specified in setSize
		 
		 pack() is another alternative to setSize() as it wraps the frame around all elements
		 that exists at METHOD CALL
		 
		  Default layout of JPanel is FlowLayout
		  Default layout of JFrame is BorderLayout
		  
		  a panel can also house another panel
		  
		  what is a dialogue?
		  
		  textfield is used to accept keyboard input (only has columns)
		  textarea is like a textfield but can have multiple rows
		  what is parentcomponent?
		 */
	}
}
