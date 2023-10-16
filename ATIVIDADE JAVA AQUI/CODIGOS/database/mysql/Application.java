package database.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Application {

	private static final String url = "jdbc:mysql://localhost:3306/flytripdb"; 
	private static final String user = "root";
	private static final String password = "Creeper27";
	private static Connection connection; 
	
    public static void main(String[] args) {
        
	      try {
			getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
	public static Connection getConnection() throws SQLException {
		if(connection == null) {
			System.out.print("Okay");
			connection = DriverManager.getConnection(url,user,password);
			return connection;
		} else {
			System.out.print("Not okay");
			return connection;
		}
		
	} 
    
}
