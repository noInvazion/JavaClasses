package packagetwo;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.JPasswordField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

public class Home extends JFrame {
	Color fgColor = Color.YELLOW, bgColor = Color.BLACK;
	Font font;
	String welcome = "Welcome user!";
	JButton submit, clear;
	Statement st2;

	public Home() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Delete");
		setVisible(true);
		pack();
		setLocationRelativeTo(null);
		
		st2 = Provider.createStatement();
		
		font = new Font("Ink Tree", Font.ITALIC, 30);
		JPanel northPanel = new JPanel();
		add(northPanel, BorderLayout.NORTH);

		JPanel centerPanel = new JPanel();
		centerPanel.setBackground(bgColor);
		add(centerPanel);

		

		JLabel text = new JLabel(welcome);

	}

	private JButton createButton(String txt) {
		JButton btn = new JButton(txt);
		btn.setForeground(fgColor);
		btn.setBackground(bgColor);
		btn.setFont(font);
		btn.setFocusable(false);
//		btn.addActionListener(this);

		return btn;
	}

	void Delete() {

		font = new Font("Ink Free", Font.ITALIC, 30);

		JPanel southPanel = new JPanel();
		add(southPanel, BorderLayout.SOUTH);

		submit = createButton("DeleteOneUser");
		southPanel.add(submit);
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				String query = "DELETE FROM TableName where username = ''";
				try {
					int rs = st2.executeUpdate(query);
					// "Deleted: " + rs
				} catch (SQLException e1) {
					System.out.println();
				}

			}
		});
		
	}
	
	public static void main(String[] args) {
		new Home();
		new Delete();
	}
}
