package packagetwo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;

public class Provider {

	public static Statement createStatement() {
		String user = "root", password = "halogen", url = "jdbc:mysql://localhost:3306/welcome";
		Statement st2 = null;

		try {
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("Driver loaded");
			st2 = conn.createStatement();
			System.out.println("Statement created");
			String query = "CREATE TABLE IF NOT EXISTS Signup (Firstname VARCHAR(30),lastname VARCHAR(30),username NVARCHAR(30),Gender VARCHAR(20),password varchar(20))";
			st2.execute(query);
			System.out.println("Query executed");
		} catch (SQLException e) {
			System.out.println("Error occured: " + e.getMessage());
		}
		return st2;
	}
}
