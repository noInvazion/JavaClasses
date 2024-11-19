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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

public class Delete extends JFrame {
	Color fgColor = Color.YELLOW, bgColor = Color.BLACK;
	Font font;
	JTextField userNameField;
	JPasswordField passwordField;
	JButton submit, clear;
	Statement st2;

	public Delete() {
		font = new Font("Ink Tree", Font.ITALIC, 30);

		JPanel northPanel = new JPanel();
		add(northPanel, BorderLayout.NORTH);

		JPanel centerPanel = new JPanel();
		centerPanel.setBackground(bgColor);
		add(centerPanel);

		centerPanel.setLayout(new GridLayout(2, 2));

		centerPanel.add(createLabel("User Name"));
		userNameField = createTextField();
		centerPanel.add(userNameField);

		centerPanel.add(createLabel("Password"));
		passwordField = createPasswordField();
		centerPanel.add(passwordField);

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
//        btn.addActionListener(this);

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

//	submit=
//
//	createButton("DeleteOneUser");
//	southPanel.add(submit);
//	submit.addActionListener(ActionEvent ev) {
//
//	public void actionPerformed(ActionEvent ev) {
//
//	}
//
//	}

	public void connection() {
		// new SignUp();
		String user = "root", password = "", url = "jdbc:mysql://localhost:3306/welcome";

		try {
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("Driver loaded");
			Statement st = conn.createStatement();
			System.out.println("Statement created");
			String query = "CREATE TABLE Welcome (username NVARCHAR(30), password varchar(20));";
			st.execute(query);
			System.out.println("Query executed");
		} catch (SQLException e) {
			System.out.println("Error occured: " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		new Login();
	}
}
