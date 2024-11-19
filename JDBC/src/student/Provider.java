package student;

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
			String query = "CREATE TABLE IF NOT EXISTS studentDetails "
					+ "(StudentName VARCHAR(30), DOB DATE, Gender NVARCHAR(10),Faculty VARCHAR(30),"
					+ "Department VARCHAR(30),AdmissionYear INTEGER, MatricNo INTEGER)";
			st2.execute(query);
			System.out.println("Query executed");
		} catch (SQLException e) {
			System.out.println("Error occured: " + e.getMessage());
		}
		return st2;
	}
}
