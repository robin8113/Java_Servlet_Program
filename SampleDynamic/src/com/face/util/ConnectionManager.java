package com.face.util;

import java.io.InputStream;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager {

	static Connection conn = null;

	public static Properties loadPropertiesFile() throws Exception {
		Properties prop = new Properties();
		InputStream in = new FileInputStream("C:\\Users\\user\\eclipse-workspace\\SampleDynamic\\resources\\jdbc.properties");
		prop.load(in);
		in.close();
		return prop;
	}

	public Connection getConnection() throws Exception {
		Properties prop = loadPropertiesFile();
		final String driver = prop.getProperty("driver");
		final String url = prop.getProperty("url");
		final String username = prop.getProperty("username");
		final String password = prop.getProperty("password");
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw e;
		}

		try {
			conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			System.out.println("your connection failed! check console");
			e.printStackTrace();
			throw e;
		}
		return conn;

	}

}
