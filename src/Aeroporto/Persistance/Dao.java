package Aeroporto.Persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {
	private Connection c;


	public Connection getConnection () throws ClassNotFoundException, SQLException {
		
		String hostName = "192.168.99.100";
		String dbName = "aeroporto";
		String user = "sa";
		String senha = "diego1234%";
		
		Class.forName("net.sourceforge.jtds.jdbc.Driver");
		
		c = DriverManager.getConnection(
				String.format("jdbc:jtds:sqlserver://%s:1433;databaseName=%s;user=%s;password=%s;", hostName, dbName,user,senha));
		
		return c;
	}
}
