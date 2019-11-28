package in.co.dreamsdoor.main.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
	private static Connection con;
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/information_schema?" +
                    "user=root&password=password");
			System.out.println("Connected!");
			return con;
		} catch (ClassNotFoundException e) {
			System.out.println("Class could not registered!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("SQL Connection Issue!");
			e.printStackTrace();
		}
		return null;
	}
	
}
