/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SQLServer {

	static final String host = "localhost";
	static final String hostPort = "1433";
	static final String database = "dashboard_glp";
	static final String user = "sa";
	static final String password = "123456";
	private static Connection connection = null;

	static String connectionUrl = "jdbc:sqlserver://" + host + ":" + hostPort + ";databaseName=" + database + ";user="
			+ user + ";password=" + password + ";";

	public static boolean connect() {
		try {
                    
                    try {
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(SQLServer.class.getName()).log(Level.SEVERE, null, ex);
                    }

			connection = DriverManager.getConnection(connectionUrl);
			System.out.println("Conexao: OK");

			return true;
		}

		catch (SQLException e) {
			e.printStackTrace();

			return false;
		}
	}

	public static boolean disconnect() {
		try {
			if (!DriverManager.getConnection(connectionUrl).isClosed()) {
				DriverManager.getConnection(connectionUrl).close();

				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	public static ResultSet getQuery(String sql) {
		ResultSet result = null;
		connect();

		try {
			PreparedStatement query = connection.prepareStatement(sql);

			result = query.executeQuery();

			disconnect();

		} catch (SQLException e) {

			disconnect();
			e.printStackTrace();
		}

		return result;
	}
        
        public static void executeQuery(String sql) {
		connect();

		try {
			PreparedStatement query = connection.prepareStatement(sql);
                        query.executeQuery();
			disconnect();

		} catch (SQLException e) {

			disconnect();
			//e.printStackTrace();
		}

	}
}
