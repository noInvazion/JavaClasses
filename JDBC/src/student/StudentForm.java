package student;

import java.util.Arrays;

import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import student.Provider;

import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

public class StudentForm extends JFrame implements ActionListener {
	Color fgColor = Color.YELLOW, bgColor = Color.BLACK;
	Font font = new Font("Ink Free", Font.BOLD, 30);
	JTextField genderField, nameField, dateField, facultyField, departmentField, admissionYearField, matricField;
	JButton submit, clear;
	Statement st2;

	public StudentForm() {
//		new Font("Ink Free", Font.BOLD, 100);

		st2 = Provider.createStatement();

		JPanel northPanel = new JPanel();
		add(northPanel, BorderLayout.NORTH);

		JPanel centerPanel = new JPanel();
		centerPanel.setBackground(bgColor);
		add(centerPanel);

		centerPanel.setLayout(new GridLayout(7, 2));

		centerPanel.add(createLabel("Name"));
		nameField = createTextField();
		centerPanel.add(nameField);

		centerPanel.add(createLabel("DOB"));
		dateField = createTextField();
		centerPanel.add(dateField);

		centerPanel.add(createLabel("Gender"));
		genderField = createTextField();
		centerPanel.add(genderField);

		centerPanel.add(createLabel("Faculty"));
		facultyField = createTextField();
		centerPanel.add(facultyField);

		centerPanel.add(createLabel("Department"));
		departmentField = createTextField();
		centerPanel.add(departmentField);

		centerPanel.add(createLabel("Admission Year"));
		admissionYearField = createTextField();
		centerPanel.add(admissionYearField);

		centerPanel.add(createLabel("Matric Number"));
		matricField = createTextField();
		centerPanel.add(matricField);

		JPanel southPanel = new JPanel();
		southPanel.setBackground(Color.BLUE);
		add(southPanel, BorderLayout.SOUTH);

		clear = createButton("Reset");
		southPanel.add(clear);

		submit = createButton("Submit");
		southPanel.add(submit);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Student Registration Form");
		setVisible(true);
		pack();
		setSize(700, 700);
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
	

	public static void main(String[] args) {
		new StudentForm();
		Statement st = Provider.createStatement();
		try {
			ResultSet rs = st.executeQuery("SELECT * FROM SIGNUP");
			while (rs.next()) {
				System.out.println(rs.getString("username"));
			}
		} catch (SQLException e) {
			System.out.println("Error occured: " + e.getMessage());
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == submit) {
			String uname = nameField.getText();
			String dob = dateField.getText();
			String faculty = facultyField.getText();
			String department = departmentField.getText();
			String gender = genderField.getText();
			String admission = admissionYearField.getText();
			
			int[] matricNumbers = getMatric();
			int matric = 0;
			for (int i = 100; i <= 500; i++) {
					matric = matricNumbers[i];
			}
			System.out.println(matric);


			String query = String.format(
					"INSERT INTO WELCOME.studentDetails (StudentName, DOB, Gender, Faculty, Department, AdmissionYear, MatricNo) VALUES ('%s', '%s', '%s', '%s', '%s', '%s', '%s')",
					uname, dob, gender, faculty, department, admission, matric);

			try {
				st2.execute(query);
				System.out.println("QUERY EXECUTED!");
			} catch (Exception ez) {
				System.out.println("Error occured: " + ez.getMessage());
			}
		}
	}

	public void getMatric() {
		int start = 100;
		int end = 500;
		int[] matricList = new int[end - start + 1];
		for (int i = start; i <= end; i++) {

			matricList[i - start] = i;
			int matric = matricList[i];
		}
	}
}