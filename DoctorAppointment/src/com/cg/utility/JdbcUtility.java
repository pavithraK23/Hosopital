package com.cg.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.cg.exception.DABException;

public class JdbcUtility {

	static Connection connection = null;

	public static Connection getConnection() throws DABException{

		File file = null;
		FileInputStream inputStream = null;
		Properties properties = null;

		file = new File("resources/jdbc.properties");
		try {
			inputStream = new FileInputStream(file);

			properties = new Properties();
			properties.load(inputStream);

			String driver = properties.getProperty("db.driver");
			String url = properties.getProperty("db.url");
			String username = properties.getProperty("db.username");
			String password = properties.getProperty("db.password");

			Class.forName(driver);
			connection = DriverManager.getConnection(url, "system", "corp123");

		} catch (FileNotFoundException e) {
			throw new DABException("File not exist");
		} catch (IOException e) {
			throw new DABException("unable to read the file");
		} catch (ClassNotFoundException e) {
			throw new DABException("class not loaded");
		} catch (SQLException e) {
			throw new DABException("not connected to database");
		}
		return connection;
	}
}

	


