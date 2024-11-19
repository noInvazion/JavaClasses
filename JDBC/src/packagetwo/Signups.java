package packagetwo;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
public class Signups extends JFrame implements ActionListener{
	Color fgColor = Color.YELLOW, bgColor = Color.BLACK;
	Font font;
	JTextField userNameField, firstnameField, lastNameField;
	JPasswordField passwordField,ConfirmpasswordField;
	JButton submit, clear;
	Statement st2;

	public Signups() {

		font = new Font("Ink Free", Font.ITALIC, 30);
		st2 = Provider.createStatement();

		JPanel northPanel = new JPanel();
		add(northPanel, BorderLayout.NORTH);

		JPanel centerPanel = new JPanel();
		centerPanel.setBackground(bgColor);
		add(centerPanel);

		centerPanel.setLayout(new GridLayout(5, 2));

		centerPanel.add(createLabel("First Name"));
		firstnameField = createTextField();
		centerPanel.add(firstnameField);

		centerPanel.add(createLabel("Last Name"));
		lastNameField = createTextField();
		centerPanel.add(lastNameField);

		centerPanel.add(createLabel("User Name"));
		userNameField = createTextField();
		centerPanel.add(userNameField);

		centerPanel.add(createLabel("Password"));
		passwordField = createPasswordField();
		centerPanel.add(passwordField);
		
		centerPanel.add(createLabel("Confirm Password"));
		ConfirmpasswordField = createPasswordField();
		centerPanel.add(ConfirmpasswordField);

		JPanel southPanel = new JPanel();
		southPanel.setBackground(Color.BLUE);
		add(southPanel, BorderLayout.SOUTH);

		clear = createButton("Reset");
		southPanel.add(clear);

		submit = createButton("Submit");
		southPanel.add(submit);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Sign Up");
		setVisible(true);
		pack();
		setSize(500, 500);
		setLocationRelativeTo(null);

	}

	private JButton createButton(String txt) {
		JButton btn = new JButton(txt);
		btn.setForeground(fgColor);
		btn.setBackground(bgColor);
		btn.setFont(font);
		btn.setFocusable(false);
		btn.addActionListener(this);

		return btn;
	}

	private JTextField createTextField() {
		JTextField txtField = new JTextField(50);
		txtField.setFont(font);
		txtField.setForeground(fgColor);
		txtField.setBackground(bgColor);
		txtField.setCaretColor(Color.CYAN);

		return txtField;
	}

	private JPasswordField createPasswordField() {
		JPasswordField txtField = new JPasswordField(50);
		txtField.setFont(font);
		txtField.setForeground(fgColor);
		txtField.setBackground(bgColor);
		txtField.setCaretColor(Color.CYAN);

		return txtField;
	}

	private JLabel createLabel(String txt) {
		JLabel label = new JLabel(txt);
		label.setFont(font);
		label.setForeground(fgColor);
		label.setHorizontalAlignment(JLabel.CENTER);

		return label;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == clear) {
			firstnameField.setText("");
			lastNameField.setText("");
			userNameField.setText("");
			passwordField.setText("");
			ConfirmpasswordField.setText("");
			return;
		}

		else if (e.getSource() == submit) {
			if (!passwordField.getText().equals(ConfirmpasswordField.getText())) {
				JOptionPane.showMessageDialog(null, "PASSWORD DOES NOT MATCH!");
				passwordField.setText("");
				ConfirmpasswordField.setText("");
				return;
			}
				
			
			
			if (userNameField.getText().isBlank() || passwordField.getText().isBlank())
				JOptionPane.showMessageDialog(null, "TEXTFIELD CANNOT BE BLANK!");
				return;
		}

	}

	public static void main(String[] args) {
		new Signups();
	}

}
