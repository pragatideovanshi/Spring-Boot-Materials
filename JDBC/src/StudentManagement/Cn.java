package StudentManagement;

import java.sql.Connection;
import java.sql.DriverManager;

public class Cn {
	static Connection connection;
	static String url = "jdbc:sqlserver://MSI\\SQLCHECK:1433;databaseName=StudentDb;encrypt=false;";
    static String username = "sa";
    static String password = "sqlpswd11";
	
	public static Connection CreateCn() {
		// Load the Driver
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			// Create the Connection
			
			 connection = DriverManager.getConnection(url, username, password);	
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;	
	}
}
