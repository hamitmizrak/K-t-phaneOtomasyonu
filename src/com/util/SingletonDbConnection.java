package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

//singleton design pattern =
//ecodationKutuphane
public class SingletonDbConnection {

	private static SingletonDbConnection instance;
	private static Connection connection;
	private static ResultSet resultSet;

	private String url = "jdbc:mysql://localhost:3306/ecodationKutuphane?userUnicode=true&characterEncoding=UTF-8";
	private String user = "root";
	private String password = "root";

	// parametresiz constructor ancak private olacak
	private SingletonDbConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Mysql driver başarıyla yüklendi");
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("Database bağlantısı başarılı");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	// bu classta connectionda 1 tane nesne oluştursun
	public static SingletonDbConnection getInstance() {
		try {
			if (instance == null) {
				instance = new SingletonDbConnection();
			}
		} catch (Exception e) {
			System.out.println("singletonDbconnection Classında instance hatası meydana geldi");
			e.printStackTrace();
		}
		return instance;
	}

	public Connection getConnection() {
		return connection;
	}

}
