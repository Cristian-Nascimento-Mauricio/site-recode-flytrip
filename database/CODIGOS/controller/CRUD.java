package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.PreparableStatement;

import Classes.Client;

public class CRUD {

	private static final String url = "jdbc:mysql://localhost:3306/flytripdb"; 
	private static final String user = "root";
	private static final String password = "Creeper27";
	private static Connection connection; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void save(Client client) {
		
		String sql = "INSERT INTO clint (name , year_old , nationality , "
				+ "nationality_identification , medical_objectification , flies ) VALUES"
				+ "( ? , ? , ? , ? , ? , ?) ";
		Connection connection = null;
		PreparedStatement pstm = null;
		
		try {
			connection  = getConnection();
			pstm = connection.prepareStatement(sql); 
			pstm.setString(1, client.getNameString());
			pstm.setString(2, client.getYear_old());
			pstm.setString(3, client.getNationality());
			pstm.setString(4, client.getNationalitly_identificationString());
			pstm.setBoolean(5, client.getMedical_objecition());
			pstm.setInt(6, client.getFlies());

			pstm.execute(sql);
			
		} catch (Exception e) {
			System.out.print("Erro ao salvar");
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
