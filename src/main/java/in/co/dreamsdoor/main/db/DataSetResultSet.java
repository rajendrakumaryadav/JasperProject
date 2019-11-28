package in.co.dreamsdoor.main.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataSetResultSet {

	private Statement statement;
	private ResultSet resultSet;
	private Connection connection = DBConnection.getConnection();

//	String query = "SELECT WORD as word, RESERVED as res from KEYWORDS";
//	String query = "SELECT TABLE_NAME as name, COLLATION as collation,NULLABLE, INDEX_NAME,  IS_VISIBLE as isVariable from STATISTICS";
//	String query = "SELECT @@version";
	public ResultSet getKeyword() {
//		con = DatabaseConnection.connect();
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT WORD as word, RESERVED as res from KEYWORDS");
			if (!resultSet.absolute(0)) {
				return resultSet;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public ResultSet getStat() {
		
		try {
			statement = connection.createStatement();
			String query = "SELECT TABLE_NAME as name, COLLATION as collation,NULLABLE, INDEX_NAME,  IS_VISIBLE as isVariable from STATISTICS";
			resultSet = statement.executeQuery(query);
			
			if(!resultSet.absolute(0)) {
				return resultSet;
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public String getVersion() {
		
		try {
			statement = connection.createStatement();
			String query = "SELECT @@version as version";
			resultSet = statement.executeQuery(query);
			
			String version = null;
			
			if(!resultSet.absolute(0)) {
				while(resultSet.next()) {
					version = resultSet.getString("version");
				}
				return version;
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return null;
		
	}
}
